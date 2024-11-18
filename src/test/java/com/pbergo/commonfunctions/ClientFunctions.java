package com.pbergo.commonfunctions;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.github.javafaker.Faker;
import com.pbergo.base.WebDriverBase;
import com.pbergo.locators.AdminClientLocators;
import com.pbergo.locators.AdminLeftSidePanelLocators;
import com.pbergo.locators.AdminUserRoleLocators;


public class ClientFunctions {
	private WebDriverBase webDB;
	private boolean flag;
	Faker fake = new Faker();
	String companyname = new String();
	WebDriver driver;
	private JavascriptExecutor js;

	public ClientFunctions(WebDriverBase webDB) {
		this.webDB = webDB;
		js = (JavascriptExecutor) webDB.passingWebDriverInstance(webDB);
	}

	public boolean addClientForm() throws IOException, InterruptedException {

		flag = webDB.waitElementByName(AdminClientLocators.ELMNT_COMPANYNAME_FIELD);
		if(flag)
		{
			int number1 = fake.number().numberBetween(1, 50);
			companyname = "QA_Galaxy_A"+number1+"_COMPANY";
			webDB.sendTextByName(AdminClientLocators.ELMNT_COMPANYNAME_FIELD, companyname);
			System.out.println("Entered company name as "+companyname);
			Thread.sleep(750);
			int number = fake.number().numberBetween(10, 60);
			webDB.sendTextByName(AdminClientLocators.ELMNT_COMPANYCODE_FIELD, "G2024_"+number);
			
			webDB.clickBtnByXPath(AdminClientLocators.ELMNT_CLIENTTYPE_FIELD);
			Thread.sleep(2000);
			
			webDB.sendTextByXPath(AdminClientLocators.ELMNT_CLIENTTYPE_FIELD, "Ergo-Ally");
			webDB.sendTextByXpath(AdminClientLocators.ELMNT_CLIENTTYPE_FIELD, Keys.ENTER);
			
			webDB.clickBtnByXPath(AdminClientLocators.ELMNT_MANAGESELFASSESSMENT_FIELD);
			Thread.sleep(2000);
			
			webDB.sendTextByXPath(AdminClientLocators.ELMNT_MANAGESELFASSESSMENT_FIELD, "Show");
			webDB.sendTextByXpath(AdminClientLocators.ELMNT_MANAGESELFASSESSMENT_FIELD, Keys.ENTER);
			
			
			Thread.sleep(2000);
			webDB.scrolldown(200);
			Thread.sleep(1000);
			
			
			//js.executeScript("arguments[0].scrollIntoView(true)", AdminClientLocators.ELMNT_BANNERIMAGE_FIELD);
//			((JavascriptExecutor) webDB.passingWebDriverInstance(webDB)).executeScript("arguments[0].scrollIntoView(true)", AdminClientLocators.ELMNT_BANNERIMAGE_FIELD);
//			Thread.sleep(100);
			
			//Thread.sleep(1000);
			String filepath = System.getProperty("user.dir")+"/TestData/Banner.png";
			webDB.sendTextByName(AdminClientLocators.ELMNT_BANNERIMAGE_FIELD, filepath);
			Thread.sleep(1000);
			
			String filepath1 = System.getProperty("user.dir")+"/TestData/Logo.png";
			webDB.sendTextByName(AdminClientLocators.ELMNT_LOGO_FIELD,filepath1 );
			Thread.sleep(1000);
//			webDB.sendTextByName(AdminClientLocators.ELMNT_LOGO_FIELD, Keys.ENTER);
//			Thread.sleep(1000);
			
			webDB.clickBtnByXPath(AdminClientLocators.ELMNT_REGION_FIELD);
			Thread.sleep(1000);
			webDB.sendTextByXPath(AdminClientLocators.ELMNT_REGION_FIELD, "AMER");
			Thread.sleep(1000);
			webDB.sendTextByXpath(AdminClientLocators.ELMNT_REGION_FIELD, Keys.ENTER);
			Thread.sleep(1000);
			
//			webDB.scrollToAnElement(AdminClientLocators.ELMNT_CLIENTSTATUS_FIELD);
//			js.executeScript("window.scrollBy(0,200)", "");
			webDB.scrolldown(400);
			
			Thread.sleep(1000);
			
			webDB.clickBtnByXPath(AdminClientLocators.ELMNT_DEFAULTUSERROLE_FIELD);
			Thread.sleep(1000);
			webDB.sendTextByXPath(AdminClientLocators.ELMNT_DEFAULTUSERROLE_FIELD, "PBE Admin");
			Thread.sleep(1000);
			webDB.sendTextByXpath(AdminClientLocators.ELMNT_DEFAULTUSERROLE_FIELD, Keys.ENTER);
			Thread.sleep(1000);
			
			
			webDB.clickBtnByXPath(AdminClientLocators.ELMNT_MYREPORTTYPE_FIELD);
			Thread.sleep(1000);
			webDB.sendTextByXPath(AdminClientLocators.ELMNT_MYREPORTTYPE_FIELD, "Both Reports");
			Thread.sleep(1000);
			webDB.sendTextByXpath(AdminClientLocators.ELMNT_MYREPORTTYPE_FIELD, Keys.ENTER);
			Thread.sleep(1000);
			
			webDB.clickBtnByXPath(AdminClientLocators.ELMNT_CLIENTSTATUS_FIELD);
			Thread.sleep(2000);
			webDB.sendTextByXPath(AdminClientLocators.ELMNT_CLIENTSTATUS_FIELD, "ACTIVE");
			webDB.sendTextByXpath(AdminClientLocators.ELMNT_CLIENTSTATUS_FIELD, Keys.ENTER);
			
			Thread.sleep(2000);
			
			webDB.clickBtnByXPath(AdminClientLocators.ELMNT_FOLLOWUPSTATUS_FIELD);
			Thread.sleep(2000);
			webDB.sendTextByXPath(AdminClientLocators.ELMNT_FOLLOWUPSTATUS_FIELD, "Show");
			webDB.sendTextByXpath(AdminClientLocators.ELMNT_FOLLOWUPSTATUS_FIELD, Keys.ENTER);
			
			Thread.sleep(2000);

//			js.executeScript("window.scrollBy(0,350)", "");
//			
//
//			
//			js.executeScript("window.scrollBy(0,200)", "");
//			Thread.sleep(1000);
//			
//			js.executeScript("window.scrollBy(0,1050)", "");
//			Thread.sleep(1000);
			
//			webDB.scrolldown(1600);
			webDB.scrollToAnElement(AdminClientLocators.ELMNT_WORKFROMHOME_CHECKBOXXPATH);
			Thread.sleep(1500);
			webDB.clickBtnByID(AdminClientLocators.ELMNT_WORKFROMHOME_CHECKBOX);
			Thread.sleep(1000);
				
//			js.executeScript("window.scrollBy(0,7600)", "");
//			Thread.sleep(1500);
//			webDB.scrolldown(7600);
			webDB.scrollToAnElement(AdminClientLocators.ELMNT_FORMLINKS_HEADING);
			Thread.sleep(1500);
			
			webDB.sendTextByName(AdminClientLocators.ELMNT_SELFASSESMENTLINK_FIELD, "https://survey.alchemer.com/s3/6916069/Self-Assessment-w-Lab");
			Thread.sleep(1000);
			
			webDB.sendTextByName(AdminClientLocators.ELMNT_ERGOEVALLINK_FIELD, "https://survey.alchemer.com/s3/6916070/Ergo-Eval");
			Thread.sleep(1000);
			
			webDB.sendTextByName(AdminClientLocators.ELMNT_SCHEDULEREQUEST_FIELD, "https://survey.alchemer.com/s3/6914305/TK-Self-Assessment-Template-copy");
			Thread.sleep(1000);
			
			webDB.sendTextByName(AdminClientLocators.ELMNT_SELFASSESMENT_FOLLOWUPLINK_FIELD, "https://survey.alchemer.com/s3/6916077/Test-Ergo-Eval-Follow-Up-Survey");
			Thread.sleep(1000);
			
			webDB.sendTextByName(AdminClientLocators.ELMNT_ERGOEVAL_FOLLOWUPLINK_FIELD, "https://survey.alchemer.com/s3/6916077/Test-Ergo-Eval-Follow-Up-Survey");
			Thread.sleep(1000);
			
//			js.executeScript("window.scrollBy(0,5000)", "");
//			Thread.sleep(1000);
			
			flag = webDB.waitElementByXPath(AdminClientLocators.ELMNT_ADD_BTN);
			if(flag)
			{
				webDB.scrollToAnElement(AdminClientLocators.ELMNT_ADD_BTN);
				Thread.sleep(1500);
				webDB.clickBtnByXPath(AdminClientLocators.ELMNT_ADD_BTN);
				Thread.sleep(4000);
			}
			else
			{
				System.out.println("Element not found");
			}
			
			
//			js.executeScript("window.scrollBy(0,-500)", "");
//			Thread.sleep(1500);
			
			webDB.scrollToAnElement(AdminClientLocators.ELMNT_ADD_NEW_CLIENT_BTN);
			Thread.sleep(1500);
			flag = webDB.waitElementByXPath(AdminClientLocators.ELMNT_ADD_NEW_CLIENT_BTN);
			
			
		}
		
		
		return flag;
	}
	
	/**
	 * @param userPermittedSection [Passing options from the Menu link]
	 * @return
	 * @throws IOException
	 * @throws InterruptedException
	 */
	public boolean click_Client_Left_Panel() throws IOException, InterruptedException {
		flag = webDB.waitElementByXPath(AdminLeftSidePanelLocators.ELMNT_CLIENT_LINK);
		if (flag) {
			webDB.clickBtnByXPath(AdminLeftSidePanelLocators.ELMNT_CLIENT_LINK);
			Thread.sleep(2000);
		}
		return flag;
	}
	
	public boolean click_Add_Client
	() throws IOException, InterruptedException {
			flag = webDB.waitElementByXPath(AdminClientLocators.ELMNT_ADD_NEW_CLIENT_BTN);
			if(flag) {
				webDB.clickBtnByXPath(AdminClientLocators.ELMNT_ADD_NEW_CLIENT_BTN);
				Thread.sleep(2000);
//				flag = webDB.waitElementByXPath(AdminLeftSidePanelLocators.ELMNT_USER_ROLE_LINK);
			}
		
		return flag;
	}

	public boolean client_Search() throws IOException, InterruptedException {
		flag = webDB.waitElementByXPath(AdminClientLocators.ELMNT_SEARCH_FIELD);
		if (flag) 
		{
			webDB.getPageRefresh();
			Thread.sleep(2000);
//			JavascriptExecutor js = (JavascriptExecutor) webDB.passingWebDriverInstance(webDB);
//			js.executeScript("window.scrollBy(0,-500)", "");
//			Thread.sleep(1500);
			webDB.waitElementByXPath(AdminClientLocators.ELMNT_SEARCH_FIELD);
			webDB.clickBtnByXPath(AdminClientLocators.ELMNT_SEARCH_FIELD);
			Thread.sleep(2000);
			
			webDB.sendTextByXPath(AdminClientLocators.ELMNT_SEARCH_FIELD, companyname);
			webDB.sendTextByXpath(AdminClientLocators.ELMNT_SEARCH_FIELD, Keys.ENTER);
			Thread.sleep(3000);
			
			
		}
		return flag;
	}
	
	public boolean click_Client_Edit_Link() throws IOException, InterruptedException {
		flag = webDB.waitElementByXPath(AdminClientLocators.ELMNT_EDIT_LINK);
		if (flag) 
		{
			webDB.clickBtnByXPath(AdminClientLocators.ELMNT_EDIT_LINK);
			Thread.sleep(1000);
		}
		return flag;
	}
	
	public boolean get_ClientType() throws IOException, InterruptedException {
		flag = webDB.waitElementByXPath(AdminClientLocators.ELMNT_EDIT_CLIENTTYPE_TEXT);
		if (flag) 
		{
			String actclienttype = webDB.getTextByXPath(AdminClientLocators.ELMNT_EDIT_CLIENTTYPE_TEXT).replace("/t", "").replace("/n", "");
			String expclienttype = "Ergo-Ally";
			System.out.println("The actual Client type is "+ actclienttype);
			flag = actclienttype.equalsIgnoreCase(expclienttype);
			Thread.sleep(1000);
		
	}
	return flag;
	}
	

	
	public boolean click_Update_Btn() throws IOException, InterruptedException {
		flag = webDB.waitElementByXPath(AdminClientLocators.ELMNT_EDIT_CLIENTTYPE_TEXT);
		if (flag) 
		{
			// Scroll to the button element
//	        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", UpdateButton);
//	        Thread.sleep(2000);
			
			JavascriptExecutor js = (JavascriptExecutor) webDB.passingWebDriverInstance(webDB);
			js.executeScript("window.scrollBy(0,18000)", "");
			//js.executeScript("window.scrollBy(0,350)", "");
//			webDB.scrollToAnElement(AdminClientLocators.ELMNT_ADD_BTN);
			Thread.sleep(2000);
			
		
			
			webDB.clickBtnByXPath(AdminClientLocators.ELMNT_ADD_BTN);
			Thread.sleep(2000);
			//flag = webDB.waitElementByXPath(AdminClientLocators.ELMNT_ADD_BTN);
			
//			js.executeScript("window.scrollBy(0,-500)", "");
//			Thread.sleep(1500);
			
			flag= webDB.waitElementByXPath(AdminClientLocators.ELMNT_ADD_NEW_CLIENT_BTN);
		}
		return flag;
	}
	
	public boolean click_Client_Delete_Link() throws IOException, InterruptedException {
		flag = webDB.waitElementByXPath(AdminClientLocators.ELMNT_DELETE_LINK);
		if (flag) 
		{
			int size =webDB.countingSizeByXPath(AdminClientLocators.ELMNT_DELETE_LINK);
			if(size==1)
			{
			webDB.clickBtnByXPath(AdminClientLocators.ELMNT_DELETE_LINK);
			Thread.sleep(1000);
			}
		}
		return flag;
	}
	
	public boolean set_Client_Delete_Reason() throws IOException, InterruptedException {
		flag = webDB.waitElementByID(AdminClientLocators.ELMNT_DELETE_REASON_FIELD);
		if (flag) 
		{
			webDB.sendTextByID(AdminClientLocators.ELMNT_DELETE_REASON_FIELD, "This is a galaxy test Client.");
			Thread.sleep(1000);
			
			webDB.clickBtnByXPath(AdminClientLocators.ELMNT_DELETE_YES_BTN);
			Thread.sleep(2000);
			flag = webDB.waitElementByXPath(AdminClientLocators.ELMNT_ADD_NEW_CLIENT_BTN);
					
		}
		return flag;
	}

	public boolean verifyPaginationFunctionality() throws InterruptedException, IOException
	{
//		webDB.NavigateTo("https://staging.pbergo.com/admin/all_clients");
//		Thread.sleep(1500);
		flag = webDB.verifyPagination("(//p[@class='float-lg-start text-sm-center'])[1]", "(//li[@class='page-item next']/button)[1]", "//table[@class='table table-bordered table dataTable no-footer']//tbody//tr");
		return flag;
		
	}
	
	public boolean verifyAscendingOrderSortingFunctionalityOfClientNameColumn() throws InterruptedException
	{	
		flag = webDB.verifyAscendingOrderSortingFunctionality(AdminClientLocators.CLIENT_CLIENTNAME_COLUMNDATA_ONWHICHSORTINGAPPLIED, AdminClientLocators.CLIENT_CLIENTNAME_COLUMNNAME_ONWHICHSORTINGAPPLIED, AdminClientLocators.CLIENT_CLIENTNAME_COLUMN_TOTALARROWCOUNT_ONWHICHSORTINGAPPLIED ,AdminClientLocators.CLIENT_CLIENTNAME_COLUMN_UPARROW_ONWHICHSORTINGAPPLIED);
		
		return flag;
	}
	
	public boolean verifyDecendingOrderSortingFunctionalityOfClientNameColumn() throws InterruptedException
	{
		flag = webDB.verifyDecendingOrderSortingFunctionality(AdminClientLocators.CLIENT_CLIENTNAME_COLUMNDATA_ONWHICHSORTINGAPPLIED, AdminClientLocators.CLIENT_CLIENTNAME_COLUMNNAME_ONWHICHSORTINGAPPLIED);
		
		return flag;
	}
	
	public boolean verifyAscendingOrderSortingFunctionalityOfClientCodeColumn() throws InterruptedException
	{	
		flag = webDB.verifyAscendingOrderSortingFunctionality(AdminClientLocators.CLIENT_CLIENTCODE_COLUMNDATA_ONWHICHSORTINGAPPLIED, AdminClientLocators.CLIENT_CLIENTCODE_COLUMNNAME_ONWHICHSORTINGAPPLIED, AdminClientLocators.CLIENT_CLIENTCODE_COLUMN_TOTALARROWCOUNT_ONWHICHSORTINGAPPLIED ,AdminClientLocators.CLIENT_CLIENTCODE_COLUMN_UPARROW_ONWHICHSORTINGAPPLIED);
		
		return flag;
	}
	
	public boolean verifyDecendingOrderSortingFunctionalityOfClientCodeColumn() throws InterruptedException
	{
		flag = webDB.verifyDecendingOrderSortingFunctionality(AdminClientLocators.CLIENT_CLIENTCODE_COLUMNDATA_ONWHICHSORTINGAPPLIED, AdminClientLocators.CLIENT_CLIENTCODE_COLUMNNAME_ONWHICHSORTINGAPPLIED);
		
		return flag;
	}
	
	public boolean verifyAscendingOrderSortingFunctionalityOfStatusColumn() throws InterruptedException
	{	
		flag = webDB.verifyAscendingOrderSortingFunctionality(AdminClientLocators.CLIENT_STATUS_COLUMNDATA_ONWHICHSORTINGAPPLIED, AdminClientLocators.CLIENT_STATUS_COLUMNNAME_ONWHICHSORTINGAPPLIED, AdminClientLocators.CLIENT_STATUS_COLUMN_TOTALARROWCOUNT_ONWHICHSORTINGAPPLIED ,AdminClientLocators.CLIENT_STATUS_COLUMN_UPARROW_ONWHICHSORTINGAPPLIED);
		
		return flag;
	}
	
	public boolean verifyDecendingOrderSortingFunctionalityOfStatusColumn() throws InterruptedException
	{
		flag = webDB.verifyDecendingOrderSortingFunctionality(AdminClientLocators.CLIENT_STATUS_COLUMNDATA_ONWHICHSORTINGAPPLIED, AdminClientLocators.CLIENT_STATUS_COLUMNNAME_ONWHICHSORTINGAPPLIED);
		
		return flag;
	}
	
	public boolean verifyAscendingOrderSortingFunctionalityOfCreatedDateColumn() throws InterruptedException
	{	
		flag = webDB.verifyAscendingOrderSortingFunctionalityOfDateColumn(AdminClientLocators.CLIENT_CREATEDDATE_COLUMNDATA_ONWHICHSORTINGAPPLIED, AdminClientLocators.CLIENT_CREATEDDATE_COLUMNNAME_ONWHICHSORTINGAPPLIED, AdminClientLocators.CLIENT_CREATEDDATE_COLUMN_TOTALARROWCOUNT_ONWHICHSORTINGAPPLIED ,AdminClientLocators.CLIENT_CREATEDDATE_COLUMN_UPARROW_ONWHICHSORTINGAPPLIED);
		
		return flag;
	}
	
	public boolean verifyDecendingOrderSortingFunctionalityOfCreatedDateColumn() throws InterruptedException
	{
		flag = webDB.verifyDecendingOrderSortingFunctionalityOfDateColumn(AdminClientLocators.CLIENT_CREATEDDATE_COLUMNDATA_ONWHICHSORTINGAPPLIED, AdminClientLocators.CLIENT_CREATEDDATE_COLUMNNAME_ONWHICHSORTINGAPPLIED);
		
		return flag;
	}
	
   
	
	

}
