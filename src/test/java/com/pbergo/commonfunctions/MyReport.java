package com.pbergo.commonfunctions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.github.javafaker.Faker;
import com.pbergo.base.WebDriverBase;
import com.pbergo.locators.EvaluatorLocators;
import com.pbergo.locators.HelpCenterLocators;
import com.pbergo.locators.MyReportLocators;
import com.pbergo.locators.ProgramOverviewLocators;

public class MyReport {

	private WebDriverBase webDB;
	private boolean flag;
	private String temp;
//	WebDriver driver;
	private UIBasicFunctions uibasicfunctions;
	Faker faker = new Faker();
	
	public MyReport(WebDriverBase webDB) {
		this.webDB = webDB;
		uibasicfunctions = new UIBasicFunctions(webDB);
		
	}

	/**
	 * This method is used to verify the report download functionality
	 * @return
	 * @throws InterruptedException
	 * @throws IOException
	 * @throws AWTException
	 */
	public boolean verifyReports_DownloadFunctionality() throws InterruptedException, IOException, AWTException 
	{

		Thread.sleep(7000);
		flag = webDB.waitElementByXPath(MyReportLocators.DATEOFASSESSMENT);
		if (flag) {
			temp = webDB.getTextByXPath(MyReportLocators.DATEOFASSESSMENT);
			System.out.println("The fetched text is " + temp);
			Thread.sleep(2000);
			webDB.clickBtnByXPath(MyReportLocators.MYREPORTS_DOWNLOAD);
			Thread.sleep(8000);

			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(2000);

			int number = faker.number().numberBetween(1, 1000);
			String dynamicText = "PBErgo My Report "+number;

		    for (char c : dynamicText.toCharArray()) {
		        int keyCode = KeyEvent.getExtendedKeyCodeForChar(c);
		        
		        if (KeyEvent.CHAR_UNDEFINED == keyCode) {
		            throw new RuntimeException("Key code not found for character '" + c + "'");
		        }

		        robot.keyPress(keyCode);
		    }
			robot.keyPress(KeyEvent.VK_ENTER);
			
			
			System.out.println("The PDF is downloaded");
			Thread.sleep(5000);
			
			}
			else 
			{
			System.out.println("The fetched text is " + temp);
			}

		return flag;

	}
	
	/**
	 * This method is used to verify the report view and download functionality
	 * @return
	 * @throws InterruptedException
	 * @throws IOException
	 * @throws AWTException
	 */
	public boolean verifyReports_ViewAndDownloadFunctionality() throws InterruptedException, IOException, AWTException 
	{
		flag = webDB.waitElementByXPath(MyReportLocators.MYREPORTS_VIEW);
		if(flag)
		{
			webDB.scrollToAnElement(MyReportLocators.MYREPORTS_VIEW);
			Thread.sleep(750);
		webDB.clickBtnByXPath(MyReportLocators.MYREPORTS_VIEW);
		Thread.sleep(12000);
		

		flag = webDB.SwitchToWindowByIndex(1);
		Thread.sleep(1500);
		String pagetitle = webDB.getPageTitle();
		
		if(pagetitle.equals("PBErgo - Employee Home"))
		{
			System.out.println("Swithced to frame and page title is "+pagetitle);
		Thread.sleep(1000);

		
		flag= webDB.waitElementByXPath(MyReportLocators.MYREPORTS_DOWNLOAD_PDF);
		if(flag) {

			webDB.clickBtnByXPath(MyReportLocators.MYREPORTS_DOWNLOAD_PDF);
			Thread.sleep(8000);

			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(3000);

			int number = faker.number().numberBetween(1, 1000);
			String dynamicText = "PBErgo My Reports "+number;

		    for (char c : dynamicText.toCharArray()) {
		        int keyCode = KeyEvent.getExtendedKeyCodeForChar(c);
		        
		        if (KeyEvent.CHAR_UNDEFINED == keyCode) {
		            throw new RuntimeException("Key code not found for character '" + c + "'");
		        }

		        robot.keyPress(keyCode);
		    }
			robot.keyPress(KeyEvent.VK_ENTER);
			
			System.out.println("The PDF is downloaded");
			Thread.sleep(5000);
//			Set<String> window1 = webDB.getwindowhandles();
//			for(String s2: window1)
//			{
//			webDB.switchToWindow(s2);
//			Thread.sleep(750);
//			String pagetitle1 = webDB.getPageTitle();
//			
//			if(pagetitle1.equals("PBErgo - Employee - My Reports"))
//			{
//				System.out.println("Swithced to frame and page title is "+pagetitle1);
			
		flag = 	webDB.SwitchToWindowByIndex(0);
			Thread.sleep(3000);
			flag = webDB.waitElementByXPath(MyReportLocators.MYREPORTS_CURRENTREPORTSEARCHINPUTFIELD);
			}
			
			
		}
		}
//	}
//		}
//	}
		return flag;
	}
	
	/**
	 * This method is used to verify the current report search functionality
	 * @return
	 * @throws InterruptedException
	 * @throws IOException
	 * @throws AWTException
	 */
	public boolean verifyCurrentReportSearchFunctionality() throws InterruptedException, IOException, AWTException 
	{
		flag = uibasicfunctions.verifySearchFunctionality(MyReportLocators.MYREPORTS_CURRENTREPORTSEARCHINPUTFIELD, MyReportLocators.MYREPORTS_CURRENTREPORTSEARCHTEXT);
		return flag;
	}
	
	/**
	 * This method is used to verify the Equipement Recommendation search and view btn functionality
	 * @return
	 * @throws InterruptedException
	 * @throws IOException
	 * @throws AWTException
	 */
	public boolean verifyEquipementRecommendationSearchAndViewBtnFunctionality() throws InterruptedException, IOException, AWTException 
	{
		flag = uibasicfunctions.verifySearchFunctionality(MyReportLocators.MYREPORTS_EQUIPEMENTRECOMMENDATIONSEARCHINPUTFIELD, MyReportLocators.MYREPORTS_EQUIPEMENTRECOMMENDATIONSEARCHTEXT);
		if(flag)
		{
			webDB.scrolldown(100);
			Thread.sleep(750);
			flag = webDB.waitElementByXPath(MyReportLocators.MYREPORTS_EQUIPEMENTRECOMMENDATIONVIEWBTN);
			if(flag)
			{
				webDB.clickBtnByXPath(MyReportLocators.MYREPORTS_EQUIPEMENTRECOMMENDATIONVIEWBTN);
				Thread.sleep(1500);
				webDB.clickBtnByXPath(MyReportLocators.MYREPORTS_EQUIPEMENTRECOMMENDATIONCLOSEBTNBTN);
				Thread.sleep(1000);
				flag = webDB.waitElementByXPath(MyReportLocators.MYREPORTS_EQUIPEMENTRECOMMENDATIONVIEWBTN);
			}
		}
		return flag;
	}
	
	public boolean verifyRecommendedVideoSliderFunctionality() throws InterruptedException, IOException {

		flag = webDB.waitElementByXPath(MyReportLocators.MYREPORTS_RECOMMENDEDVIDEOS_NEXTARROW);
		if(flag)
		{
		webDB.scrollToAnElement(MyReportLocators.MYREPORTS_RECOMMENDEDVIDEOS_NEXTARROW);
		Thread.sleep(750);
		int cardcount = webDB.countingSizeByXPath(MyReportLocators.MYREPORTS_RECOMMENDEDVIDEOS_CARDCOUNT);
		System.out.println("Total counts are "+cardcount);
		for (int i=1;i<=cardcount-4; i++)
		{
			webDB.clickBtnByXPath(MyReportLocators.MYREPORTS_RECOMMENDEDVIDEOS_NEXTARROW);
			Thread.sleep(750);
		}
		
		if(webDB.countingSizeByXPath(MyReportLocators.MYREPORTS_RECOMMENDEDVIDEOS_DISABLEDNEXTARROW)==1)
		{
			flag = true;
			System.out.println("The next arrow is in disabled state");
		}
		else
		{
			flag = false;
			System.out.println("The next arrow is visible");
		}
		
		}
		else
		{
			System.out.println("There is no slider present on page");
			flag = true;
		}
		return flag;

	}
	
	public boolean verifyRecommendedVideosPlayPauseFunctionality() throws InterruptedException, IOException {

		webDB.getPageRefresh();
		Thread.sleep(1500);
		webDB.scrollToAnElement("(//h5[@class='font_size_16 secondary_color d-flex align-items-center'])[1]");
		Thread.sleep(750);
		flag = webDB.waitElementByXPath("(//h5[@class='font_size_16 secondary_color d-flex align-items-center'])[1]");
		if(flag)
		{
			
//				
			webDB.clickBtnByXPath("(//h5[@class='font_size_16 secondary_color d-flex align-items-center'])[1]");
			Thread.sleep(1000);
			webDB.switchToiFrame("//iframe[@allowfullscreen= 'allowfullscreen']");
//			Thread.sleep(2000);
				webDB.clickBtnByXPath(HelpCenterLocators.HELPCENTER_VIDEO_PLAY_PAUSE_BTN);
				Thread.sleep(20000);
//				Thread.sleep(7000);
				webDB.clickBtnByXPath(HelpCenterLocators.HELPCENTER_VIDEO_PLAY_PAUSE_BTN);
				Thread.sleep(2000);
//				JavascriptExecutor js = (JavascriptExecutor) webDB.passingWebDriverInstance(webDB);
				WebElement videotobeplayed = webDB.passingWebDriverInstance(webDB).findElement(By.xpath("//div[@class='Timecode_module_timecode__6a968513 ']"));
				// Get the current play time of the video using JavaScript
//		        Double currentTime = (Double) js.executeScript("return arguments[0].currentTime;", videotobeplayed);
//		        System.out.println("Video played for " + currentTime + " seconds.");
				
		        String videoplaytime = webDB.getTextByXPath("//div[@class='Timecode_module_timecode__6a968513 ']").replace("00:", "");
		        int currentTime = Integer.parseInt(videoplaytime);
		        System.out.println("Video played for " + videoplaytime + " seconds.");
		        // Verify if the video played for at least 5 seconds
		        if (currentTime >= 5) {
		        	System.out.println("Video played for the expected duration.");
		            flag = true;
		        } else {
		        	System.out.println("Video did not play for the expected duration.");
		        	flag = false;
		        }
		        
				webDB.switchToDefault();
				Thread.sleep(1000);
				webDB.actionMoveToElementByXPath(HelpCenterLocators.HELPCENTER_VIDEO_CLOSE_ICON);
				Thread.sleep(2000);
				webDB.clickBtnByXPath(HelpCenterLocators.HELPCENTER_VIDEO_CLOSE_ICON);
				Thread.sleep(3000);
				
		}
		return flag;
	}
	
	public boolean verifyCurrentReportPaginationFunctionality() throws InterruptedException, IOException {
//		webDB.NavigateTo("https://staging.pbergo.com/user/my-reports");
		Thread.sleep(3000);
		webDB.scrollToAnElement(ProgramOverviewLocators.Pagination);
		Thread.sleep(3000);
		flag = webDB.verifyPagination("(//p[@class='float-lg-start text-sm-center'])[1]",
				"(//li[@class='page-item next']/button)[1]",
				"//table[@class='table table-bordered table dataTable no-footer']//tbody//tr");
		return flag;

	}
	

	public boolean verifyAscendingOrderSortingFunctionalityOfDateOfAssessment() throws InterruptedException {

//		flag = webDB.verifyAscendingOrderSortingFunctionality(HelpCenterLocators.DATEOFASSESSMENT_COLUMNDATA_ONWHICHSORTINGAPPLIED, HelpCenterLocators.DATEOFASSESSMENT_COLUMNNAME_ONWHICHSORTINGAPPLIED, HelpCenterLocators.DATEOFASSESSMENT_COLUMN_TOTALARROWCOUNT_ONWHICHSORTINGAPPLIED, HelpCenterLocators.DATEOFASSESSMENT_COLUMN_UPARROW_ONWHICHSORTINGAPPLIED);
		
		flag = webDB.verifyAscendingOrderSortingFunctionalityOfDateTimeColumn(HelpCenterLocators.DATEOFASSESSMENT_COLUMNDATA_ONWHICHSORTINGAPPLIED, HelpCenterLocators.DATEOFASSESSMENT_COLUMNNAME_ONWHICHSORTINGAPPLIED, HelpCenterLocators.DATEOFASSESSMENT_COLUMN_TOTALARROWCOUNT_ONWHICHSORTINGAPPLIED, HelpCenterLocators.DATEOFASSESSMENT_COLUMN_UPARROW_ONWHICHSORTINGAPPLIED);
		return flag;
	}

	public boolean verifyDecendingOrderSortingFunctionalityOfDateOfAssessment() throws InterruptedException {

//		flag = webDB.verifyDecendingOrderSortingFunctionality(HelpCenterLocators.DATEOFASSESSMENT_COLUMNDATA_ONWHICHSORTINGAPPLIED, HelpCenterLocators.DATEOFASSESSMENT_COLUMNNAME_ONWHICHSORTINGAPPLIED);
		flag = webDB.verifyDecendingOrderSortingFunctionalityOfDateTimeColumn(HelpCenterLocators.DATEOFASSESSMENT_COLUMNDATA_ONWHICHSORTINGAPPLIED, HelpCenterLocators.DATEOFASSESSMENT_COLUMNNAME_ONWHICHSORTINGAPPLIED);
		
		return flag;
	}

	public boolean verifyDateFilterFunctionalityOfCurrentReportSection() throws InterruptedException
	{

		flag = webDB.verifyDateFilterFunctionality("((//div[@class='row']//table)[1]/tbody/tr/td[1]/p)", "(//table)[1]//td[text()='No Records found']");

		return flag;
	}
	
	public boolean verifyDateFilterFunctionalityOfEquipementRecommendationSection() throws InterruptedException
	{
		webDB.getPageRefresh();
		Thread.sleep(3000);
		flag = webDB.verifyDateFilterFunctionality("((//div[@class='row']//table)[2]/tbody/tr/td[1]/p)", "(//table)[2]//td[text()='No Records found']");

		return flag;
	}
	
	public boolean verifyDateFilterFunctionalityOfQuickFixesSection() throws InterruptedException
	{
		webDB.getPageRefresh();
		Thread.sleep(3000);
		flag = webDB.verifyDateFilterFunctionality("((//div[@class='row']//table)[3]/tbody/tr/td[1]/p)", "(//table)[3]//td[text()='No Records found']");
		webDB.getPageRefresh();
		Thread.sleep(3000);
		return flag;
	}
	

	
	public boolean verifyAscendingOrderSortingFunctionalityOfTypesOfAssessment() throws InterruptedException {

		flag = webDB.verifyAscendingOrderSortingFunctionality(
				HelpCenterLocators.TYPESOFASSESSMENT_COLUMNDATA_ONWHICHSORTINGAPPLIED,
				HelpCenterLocators.TYPESOFASSESSMENT_COLUMNNAME_ONWHICHSORTINGAPPLIED,
				HelpCenterLocators.TYPESOFASSESSMENT_COLUMN_TOTALARROWCOUNT_ONWHICHSORTINGAPPLIED,
				HelpCenterLocators.TYPESOFASSESSMENT_COLUMN_UPARROW_ONWHICHSORTINGAPPLIED);
		return flag;
	}

	public boolean verifyDecendingOrderSortingFunctionalityOfTypesOfAssessment() throws InterruptedException {

		flag = webDB.verifyDecendingOrderSortingFunctionality(
				HelpCenterLocators.TYPESOFASSESSMENT_COLUMNDATA_ONWHICHSORTINGAPPLIED,
				HelpCenterLocators.TYPESOFASSESSMENT_COLUMNNAME_ONWHICHSORTINGAPPLIED);
		return flag;
	}
	
	public boolean verifyEquipmentRecommendationPaginationFunctionality() throws InterruptedException, IOException {

		Thread.sleep(2500);
		webDB.scrollToAnElement("(//p[@class='float-lg-start text-sm-center'])[2]");
		Thread.sleep(3000);
		flag = webDB.verifyPagination("(//p[@class='float-lg-start text-sm-center'])[2]",
				"(//li[@class='page-item next']/button)[2]",
				"(//table[@class='table table-bordered table dataTable no-footer']//tbody)[2]//tr");
		flag = true;
		return flag;

	}
	
	public boolean verifyAscendingOrderSortingFunctionalityOfDateOfAssessmentER() throws InterruptedException {
		Thread.sleep(3000);
		webDB.selectOptionByText("(//select[@name ='datatable_length_equip'])[1]", "500");
		Thread.sleep(4000);
		flag = webDB.verifyAscendingOrderSortingFunctionalityOfDateColumn(
				HelpCenterLocators.DATEOFASSESSMENTER_COLUMNDATA_ONWHICHSORTINGAPPLIED,
				HelpCenterLocators.DATEOFASSESSMENTER_COLUMNNAME_ONWHICHSORTINGAPPLIED,
				HelpCenterLocators.DATEOFASSESSMENTER_COLUMN_TOTALARROWCOUNT_ONWHICHSORTINGAPPLIED,
				HelpCenterLocators.DATEOFASSESSMENTER_COLUMN_UPARROW_ONWHICHSORTINGAPPLIED);
		return flag;
	}

	public boolean verifyDecendingOrderSortingFunctionalityOfDateOfAssessmentER() throws InterruptedException {
		Thread.sleep(4000);
		flag = webDB.verifyDecendingOrderSortingFunctionalityOfDateColumn(
				HelpCenterLocators.DATEOFASSESSMENTER_COLUMNDATA_ONWHICHSORTINGAPPLIED,
				HelpCenterLocators.DATEOFASSESSMENTER_COLUMNNAME_ONWHICHSORTINGAPPLIED);
		return flag;
	}
	
	public boolean verifyAscendingOrderSortingFunctionalityOfEquipmentRecommendation() throws InterruptedException {
		Thread.sleep(4000);
		flag = webDB.verifyAscendingOrderSortingFunctionality(
				HelpCenterLocators.ER_COLUMNDATA_ONWHICHSORTINGAPPLIED,
				HelpCenterLocators.ER_COLUMNNAME_ONWHICHSORTINGAPPLIED,
				HelpCenterLocators.ER_COLUMN_TOTALARROWCOUNT_ONWHICHSORTINGAPPLIED,
				HelpCenterLocators.ER_COLUMN_UPARROW_ONWHICHSORTINGAPPLIED);
		return flag;
	}

	public boolean verifyDecendingOrderSortingFunctionalityOfEquipmentRecommendation() throws InterruptedException {
		Thread.sleep(4000);
		flag = webDB.verifyDecendingOrderSortingFunctionality(
				HelpCenterLocators.ER_COLUMNDATA_ONWHICHSORTINGAPPLIED,
				HelpCenterLocators.ER_COLUMNNAME_ONWHICHSORTINGAPPLIED);
		return flag;
	}
	
	public boolean verifyAscendingOrderSortingFunctionalityOfTypesOfAssessmentER() throws InterruptedException {
		Thread.sleep(4000);
		flag = webDB.verifyAscendingOrderSortingFunctionality(
				HelpCenterLocators.TYPESOFASSESSMENTER_COLUMNDATA_ONWHICHSORTINGAPPLIED,
				HelpCenterLocators.TYPESOFASSESSMENTER_COLUMNNAME_ONWHICHSORTINGAPPLIED,
				HelpCenterLocators.TYPESOFASSESSMENTER_COLUMN_TOTALARROWCOUNT_ONWHICHSORTINGAPPLIED,
				HelpCenterLocators.TYPESOFASSESSMENTER_COLUMN_UPARROW_ONWHICHSORTINGAPPLIED);
		return flag;
	}

	public boolean verifyDecendingOrderSortingFunctionalityOfTypesOfAssessmentER() throws InterruptedException {
		Thread.sleep(4000);
		flag = webDB.verifyDecendingOrderSortingFunctionality(
				HelpCenterLocators.TYPESOFASSESSMENTER_COLUMNDATA_ONWHICHSORTINGAPPLIED,
				HelpCenterLocators.TYPESOFASSESSMENTER_COLUMNNAME_ONWHICHSORTINGAPPLIED);
		return flag;
	}
}
