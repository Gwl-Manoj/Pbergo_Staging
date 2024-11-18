package com.pbergo.commonfunctions;

import java.awt.AWTException;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.pbergo.base.WebDriverBase;
import com.pbergo.locators.PMFollowUpLocators;
import com.pbergo.locators.PMReportsLocators;
import com.pbergo.locators.PMRequestLocators;
import com.pbergo.locators.UsersLocators;

public class PMFollowUps {
	private WebDriverBase webDB;
	private boolean flag;
	private String email, temp;
	WebDriver driver;
	private JavascriptExecutor js;

	/**
	 * This method is used to verify the search
	 * 
	 * @param
	 * @return
	 * @throws IOException
	 * @throws InterruptedException
	 */
	public PMFollowUps(WebDriverBase webDB) {
		this.webDB = webDB;
		js = (JavascriptExecutor) webDB.passingWebDriverInstance(webDB);
	}

	/**
	 * 
	 * This methods is used for the searching for the program management follow-ups data
	 * @author Dakshiyta
	 * @throws AWTException
	 */
	public boolean followupsearch() throws IOException, InterruptedException, AWTException {
		webDB.clickBtnByXPath(PMFollowUpLocators.FOLLOWUPS);
		Thread.sleep(2000);
		flag = webDB.waitElementByXPath(PMFollowUpLocators.FOLLOWUPS_SEARCH);
		if (flag) {
			webDB.scrollToAnElement(PMRequestLocators.REQUEST_SEARCH_DATA);
////				
//				webDB.scrollToAnElement(EvaluatorLocators.ELMNT_REPORTSINREVIEW_SEARCHFIELD);
//				Thread.sleep(750);
			email = webDB.getTextByXPath(PMRequestLocators.REQUEST_SEARCH_DATA + "[" + 1 + "]");
			System.out.println("The email id is " + email);
			Thread.sleep(1000);
			webDB.clickBtnByXPath(PMFollowUpLocators.FOLLOWUPS_SEARCH);
			Thread.sleep(750);
			webDB.sendTextByXPath(PMFollowUpLocators.FOLLOWUPS_SEARCH, email);
			Thread.sleep(750);
			webDB.sendTextByXpath(PMFollowUpLocators.FOLLOWUPS_SEARCH, Keys.ENTER);
			Thread.sleep(2000);
			int totalemailids = webDB.countingSizeByXPath(PMRequestLocators.REQUEST_SEARCH_DATA);
			for (int i = 1; i <= totalemailids; i++) {
				String emailids = webDB.getTextByXPath(PMRequestLocators.REQUEST_SEARCH_DATA + "[" + i + "]");
				if (emailids.equals(email)) {
					System.out.println("The search result is same for result number " + i);
					Thread.sleep(2000);
					webDB.scrollRight(PMRequestLocators.REQUEST_SEARCH_DATA, KeyEvent.VK_RIGHT, 10);
					Thread.sleep(2000);
					webDB.clickBtnByXPath(PMRequestLocators.REQUEST_SEARCH_DATA);
					Thread.sleep(2000);
					flag = true;
				} else {
					System.out.println("The search result is different for result number " + i);
					flag = true;
				}
			}
		}
//		History();
		return flag;

	}
	
	/**
	 * 
	 * This methods is used for the follow-ups page history icon functionality
	 * @author Dakshiyta
	 * @throws AWTException
	 */
	
	public boolean History() throws InterruptedException, IOException {
		flag = webDB.waitElementByXPath(PMRequestLocators.REQUEST_SEARCH_DATA_HISTORY);
		if (flag) {
			webDB.clickBtnByXPath(PMRequestLocators.REQUEST_SEARCH_DATA_HISTORY);
			Thread.sleep(2000);
			flag = webDB.waitElementByXPath(PMRequestLocators.REQUEST_SEARCH_DATA_HISTORY_CLOSE);
			if (flag) {
				Thread.sleep(2000);
				webDB.clickBtnByXPath(PMRequestLocators.REQUEST_SEARCH_DATA_HISTORY_CLOSE);
			}
		}
//		dataSet();
		return flag;

	}

	/**
	 * 
	 * This methods is used for the follow-ups page dataset icon functionality
	 * @author Dakshiyta
	 * @throws AWTException
	 */
	
	public boolean dataSet() throws IOException, InterruptedException {
		flag = webDB.waitElementByXPath(PMRequestLocators.REQUEST_SEARCH_DATA_DATASET);
		if (flag) {
			webDB.clickBtnByXPath(PMRequestLocators.REQUEST_SEARCH_DATA_DATASET);
			Thread.sleep(2000);
			flag = webDB.waitElementByXPath(PMRequestLocators.REQUEST_SEARCH_DATA_HISTORY_SEARCH_DATA_VIEW_DOWNLOAD);
			if (flag) {
				Thread.sleep(2000);
				webDB.clickBtnByXPath(PMRequestLocators.REQUEST_SEARCH_DATA_HISTORY_SEARCH_DATA_VIEW_DOWNLOAD);
				Thread.sleep(2000);
				webDB.clickBtnByXPath(PMRequestLocators.REQUEST_SEARCH_DATA_HISTORY_SEARCH_DATA_VIEW_CLOSE);
			}
		}

//		complete();
		return flag;
		
	}

	/**
	 * 
	 * This methods is used for the follow-ups page complete icon functionality
	 * @author Dakshiyta
	 * @throws AWTException
	 */
	
	public boolean complete() throws InterruptedException, IOException {
		flag = webDB.waitElementByXPath(PMRequestLocators.REQUEST_SEARCH_DATA_COMPLETE);
		if (flag) {
			webDB.clickBtnByXPath(PMRequestLocators.REQUEST_SEARCH_DATA_COMPLETE);
			Thread.sleep(2000);
			flag = webDB.waitElementByXPath(PMRequestLocators.REQUEST_SEARCH_DATA_COMPLETE_BTN);
			if (flag) {
				Thread.sleep(2000);
				webDB.clickBtnByXPath(PMRequestLocators.REQUEST_SEARCH_DATA_COMPLETE_BTN);
				temp = webDB.getTextByXPath(PMReportsLocators.REPORTS_SEARCH_DATA_COMMENT_TOAST);
				System.out.println("Toast is: " +temp);
				if(temp.equals(PMRequestLocators.REQUEST_SEARCH_DATA_COMPLETE_TXT)) {
					System.out.println("Comment added successfully");
					
				}
			}
		}
		
		return flag;

	}
	
	public boolean verifyPaginationFunctionality() throws InterruptedException, IOException
	{
//		webDB.NavigateTo("https://staging.pbergo.com/user/client-followups/OTJyMGNBZnZHVFptWFphNDkycjBjQWZ2R1RabVhaYQ==");
//		Thread.sleep(1500);
		webDB.getPageRefresh();
		Thread.sleep(2000);
		flag = webDB.verifyPagination("(//p[@class='float-lg-start text-sm-center'])[1]", "(//li[@class='page-item next']/button)[1]", "//table[@class='table table-bordered table dataTable no-footer']//tbody//tr");
		return flag;
		
	}
	
	public boolean verifyAscendingOrderSortingFunctionalityOfFollowUpOnColumn() throws InterruptedException
	{	
		webDB.selectOptionByText("(//select[@name ='datatable_length'])[1]", "500");
		Thread.sleep(5000);
		flag = webDB.verifyAscendingOrderSortingFunctionalityOfDateTimeColumn(PMFollowUpLocators.FOLLOWUPS_FOLLOWUPON_COLUMNDATA_ONWHICHSORTINGAPPLIED, PMFollowUpLocators.FOLLOWUPS_FOLLOWUPON_COLUMNNAME_ONWHICHSORTINGAPPLIED, PMFollowUpLocators.FOLLOWUPS_FOLLOWUPON_COLUMN_TOTALARROWCOUNT_ONWHICHSORTINGAPPLIED ,PMFollowUpLocators.FOLLOWUPS_FOLLOWUPON_COLUMN_UPARROW_ONWHICHSORTINGAPPLIED);
		
		return flag;
	}
	
	public boolean verifyDecendingOrderSortingFunctionalityOfFollowUpOnColumn() throws InterruptedException
	{
		flag = webDB.verifyDecendingOrderSortingFunctionalityOfDateTimeColumn(PMFollowUpLocators.FOLLOWUPS_FOLLOWUPON_COLUMNDATA_ONWHICHSORTINGAPPLIED, PMFollowUpLocators.FOLLOWUPS_FOLLOWUPON_COLUMNNAME_ONWHICHSORTINGAPPLIED);
		
		return flag;
	}
	
	public boolean verifyAscendingOrderSortingFunctionalityOfEmpFirstNameColumn() throws InterruptedException
	{	
		flag = webDB.verifyAscendingOrderSortingFunctionality(PMFollowUpLocators.FOLLOWUPS_EMPFIRSTNAME_COLUMNDATA_ONWHICHSORTINGAPPLIED, PMFollowUpLocators.FOLLOWUPS_EMPFIRSTNAME_COLUMNNAME_ONWHICHSORTINGAPPLIED, PMFollowUpLocators.FOLLOWUPS_EMPFIRSTNAME_COLUMN_TOTALARROWCOUNT_ONWHICHSORTINGAPPLIED ,PMFollowUpLocators.FOLLOWUPS_EMPFIRSTNAME_COLUMN_UPARROW_ONWHICHSORTINGAPPLIED);
		
		return flag;
	}
	
	public boolean verifyDecendingOrderSortingFunctionalityOfEmpFirstNameColumn() throws InterruptedException
	{
		flag = webDB.verifyDecendingOrderSortingFunctionality(PMFollowUpLocators.FOLLOWUPS_EMPFIRSTNAME_COLUMNDATA_ONWHICHSORTINGAPPLIED, PMFollowUpLocators.FOLLOWUPS_EMPFIRSTNAME_COLUMNNAME_ONWHICHSORTINGAPPLIED);
		
		return flag;
	}
	
	public boolean verifyAscendingOrderSortingFunctionalityOfEmpLastNameColumn() throws InterruptedException
	{	
		flag = webDB.verifyAscendingOrderSortingFunctionality(PMFollowUpLocators.FOLLOWUPS_EMPLASTNAME_COLUMNDATA_ONWHICHSORTINGAPPLIED, PMFollowUpLocators.FOLLOWUPS_EMPLASTNAME_COLUMNNAME_ONWHICHSORTINGAPPLIED, PMFollowUpLocators.FOLLOWUPS_EMPLASTNAME_COLUMN_TOTALARROWCOUNT_ONWHICHSORTINGAPPLIED ,PMFollowUpLocators.FOLLOWUPS_EMPLASTNAME_COLUMN_UPARROW_ONWHICHSORTINGAPPLIED);
		
		return flag;
	}
	
	public boolean verifyDecendingOrderSortingFunctionalityOfEmpLastNameColumn() throws InterruptedException
	{
		flag = webDB.verifyDecendingOrderSortingFunctionality(PMFollowUpLocators.FOLLOWUPS_EMPLASTNAME_COLUMNDATA_ONWHICHSORTINGAPPLIED, PMFollowUpLocators.FOLLOWUPS_EMPLASTNAME_COLUMNNAME_ONWHICHSORTINGAPPLIED);
		
		return flag;
	}
	
	public boolean verifyAscendingOrderSortingFunctionalityOfEmailColumn() throws InterruptedException
	{	
		flag = webDB.verifyAscendingOrderSortingFunctionality(PMFollowUpLocators.FOLLOWUPS_EMAIL_COLUMNDATA_ONWHICHSORTINGAPPLIED, PMFollowUpLocators.FOLLOWUPS_EMAIL_COLUMNNAME_ONWHICHSORTINGAPPLIED, PMFollowUpLocators.FOLLOWUPS_EMAIL_COLUMN_TOTALARROWCOUNT_ONWHICHSORTINGAPPLIED ,PMFollowUpLocators.FOLLOWUPS_EMAIL_COLUMN_UPARROW_ONWHICHSORTINGAPPLIED);
		
		return flag;
	}
	
	public boolean verifyDecendingOrderSortingFunctionalityOfEmailColumn() throws InterruptedException
	{
		flag = webDB.verifyDecendingOrderSortingFunctionality(PMFollowUpLocators.FOLLOWUPS_EMAIL_COLUMNDATA_ONWHICHSORTINGAPPLIED, PMFollowUpLocators.FOLLOWUPS_EMAIL_COLUMNNAME_ONWHICHSORTINGAPPLIED);
		
		return flag;
	}
	
	public boolean verifyAscendingOrderSortingFunctionalityOfComfortColumn() throws InterruptedException
	{	
		flag = webDB.verifyAscendingOrderSortingFunctionality(PMFollowUpLocators.FOLLOWUPS_COMFORT_COLUMNDATA_ONWHICHSORTINGAPPLIED, PMFollowUpLocators.FOLLOWUPS_COMFORT_COLUMNNAME_ONWHICHSORTINGAPPLIED, PMFollowUpLocators.FOLLOWUPS_COMFORT_COLUMN_TOTALARROWCOUNT_ONWHICHSORTINGAPPLIED ,PMFollowUpLocators.FOLLOWUPS_COMFORT_COLUMN_UPARROW_ONWHICHSORTINGAPPLIED);
		
		return flag;
	}
	
	public boolean verifyDecendingOrderSortingFunctionalityOfComfortColumn() throws InterruptedException
	{
		flag = webDB.verifyDecendingOrderSortingFunctionality(PMFollowUpLocators.FOLLOWUPS_COMFORT_COLUMNDATA_ONWHICHSORTINGAPPLIED, PMFollowUpLocators.FOLLOWUPS_COMFORT_COLUMNNAME_ONWHICHSORTINGAPPLIED);
		
		return flag;
	}
	
	public boolean verifyAscendingOrderSortingFunctionalityOfStatusColumn() throws InterruptedException
	{	
		flag = webDB.verifyAscendingOrderSortingFunctionality(PMFollowUpLocators.FOLLOWUPS_STATUS_COLUMNDATA_ONWHICHSORTINGAPPLIED, PMFollowUpLocators.FOLLOWUPS_STATUS_COLUMNNAME_ONWHICHSORTINGAPPLIED, PMFollowUpLocators.FOLLOWUPS_STATUS_COLUMN_TOTALARROWCOUNT_ONWHICHSORTINGAPPLIED ,PMFollowUpLocators.FOLLOWUPS_STATUS_COLUMN_UPARROW_ONWHICHSORTINGAPPLIED);
		
		return flag;
	}
	
	public boolean verifyDecendingOrderSortingFunctionalityOfStatusColumn() throws InterruptedException
	{
		flag = webDB.verifyDecendingOrderSortingFunctionality(PMFollowUpLocators.FOLLOWUPS_STATUS_COLUMNDATA_ONWHICHSORTINGAPPLIED, PMFollowUpLocators.FOLLOWUPS_STATUS_COLUMNNAME_ONWHICHSORTINGAPPLIED);
		
		return flag;
	}
	
}
