package com.pbergo.commonfunctions;

import java.awt.AWTException;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.github.javafaker.Faker;
import com.pbergo.base.WebDriverBase;
import com.pbergo.locators.AdminClientLocators;
import com.pbergo.locators.AdminUserRoleLocators;
//import com.pbergo.locators.HeaderSectionLocators;
//import com.pbergo.locators.LeftSidePanelLocators;
import com.pbergo.locators.UsersLocators;

public class UsersFunctions {
	private WebDriverBase webDB;
	private boolean flag;
	private String temp;
	WebDriver driver;
	Faker faker = new Faker();
	String email = new String();

	public UsersFunctions(WebDriverBase webDB) {
		this.webDB = webDB;
	}

	public boolean addUserForm() throws IOException, InterruptedException {

		flag = webDB.waitElementByXPath(UsersLocators.ELMNT_FirstNameField);
		if (flag) {
			webDB.sendTextByXPath(UsersLocators.ELMNT_FirstNameField, "Galaxy");
			webDB.sendTextByXPath(UsersLocators.ELMNT_LastNameField, "LName");
			int name1 = faker.number().numberBetween(55, 95);
			email = "qa" + name1 + "@yopmail.com";
			webDB.sendTextByXPath(UsersLocators.ELMNT_EmailField, email);
			webDB.sendTextByXPath(UsersLocators.ELMNT_PasswordField, "Galaxy@123456789");

			webDB.clickBtnByXPath(UsersLocators.ELMNT_Userroles_Field);
			Thread.sleep(2000);
			webDB.sendTextByXPath(UsersLocators.ELMNT_Userroles_Field, "GalaxyTestRole");
			webDB.sendTextByXpath(UsersLocators.ELMNT_Userroles_Field, Keys.ENTER);

			Thread.sleep(2000);

			webDB.clickBtnByXPath(UsersLocators.ELMNT_Client);
			Thread.sleep(2000);
			webDB.sendTextByXPath(UsersLocators.ELMNT_Client_Field, "Galaxy_QA_Client_Testing");
			webDB.sendTextByXpath(UsersLocators.ELMNT_Client_Field, Keys.ENTER);

			Thread.sleep(2000);

			JavascriptExecutor js = (JavascriptExecutor) webDB.passingWebDriverInstance(webDB);
			js.executeScript("window.scrollBy(0,350)", "");
			Thread.sleep(1000);
//			webDB.actionMoveToElementByXPath(UsersLocators.ELMNT_Client_DATA_ACCESS_1CHKBOX).perform();
//			Thread.sleep(1000);
			webDB.clickBtnByXPath(UsersLocators.ELMNT_Region_Filed);
			Thread.sleep(2000);
			webDB.sendTextByXPath(UsersLocators.ELMNT_Region_Filed, "AMER");
			Thread.sleep(1000);
			webDB.sendTextByXpath(UsersLocators.ELMNT_Region_Filed, Keys.ENTER);

			Thread.sleep(2000);

//			js.executeScript("window.scrollBy(0,800)", "");
//			Thread.sleep(1000);

			webDB.clickBtnByXPath(UsersLocators.ELMNT_Client_DATA_ACCESS_CHKBOX);
			Thread.sleep(1000);

			js.executeScript("window.scrollBy(0,400)", "");
			Thread.sleep(1000);

			webDB.clickBtnByXPath(UsersLocators.ELMNT_SEND_USER_NOTIFICATION_CHKBOX);
			Thread.sleep(1000);

			webDB.clickBtnByXPath(UsersLocators.ELMNT_ISACTIVE_CHKBOX);
			Thread.sleep(1000);

			webDB.clickBtnByXPath(UsersLocators.ELMNT_ADD_BTN);
			Thread.sleep(2000);

			js.executeScript("window.scrollBy(0,-400)", "");
			Thread.sleep(1500);

			flag = webDB.waitElementByXPath(UsersLocators.ELMNT_ADD_NEW_USER_BTN);

		}

		return flag;
	}

	/**
	 * @param userPermittedSection [Passing options from the Menu link]
	 * @return
	 * @throws IOException
	 * @throws InterruptedException
	 */
	public boolean click_User_Left_Panel() throws IOException, InterruptedException {
		flag = webDB.waitElementByXPath(UsersLocators.ELMNT_USER_LEFT_HEADINFG);
		if (flag) {
			webDB.clickBtnByXPath(UsersLocators.ELMNT_USER_LEFT_HEADINFG);
			Thread.sleep(2000);
		}
		return flag;
	}

	public boolean click_Add_Users() throws IOException, InterruptedException {
		flag = webDB.waitElementByXPath(UsersLocators.ELMNT_ADD_NEW_USER_BTN);
		if (flag) {
			webDB.clickBtnByXPath(UsersLocators.ELMNT_ADD_NEW_USER_BTN);
			Thread.sleep(3000);
//				flag = webDB.waitElementByXPath(AdminLeftSidePanelLocators.ELMNT_USER_ROLE_LINK);
		}

		return flag;
	}

	public boolean user_Search() throws IOException, InterruptedException {
		flag = webDB.waitElementByXPath(UsersLocators.ELMNT_SEARCH_FIELD);
		if (flag) {

			webDB.getPageRefresh();
			Thread.sleep(2000);

			webDB.waitElementByXPath(UsersLocators.ELMNT_SEARCH_FIELD);
			webDB.clickBtnByXPath(UsersLocators.ELMNT_SEARCH_FIELD);
			Thread.sleep(1000);

//			webDB.sendTextByXPath(UsersLocators.ELMNT_SEARCH_FIELD, "mailto:qa65@yopmail.com");
			webDB.sendTextByXPath(UsersLocators.ELMNT_SEARCH_FIELD, email);
			webDB.sendTextByXpath(UsersLocators.ELMNT_SEARCH_FIELD, Keys.ENTER);

			Thread.sleep(2000);

		}
		return flag;
	}

	public boolean click_User_Edit_Link() throws IOException, InterruptedException {
		flag = webDB.waitElementByXPath(UsersLocators.ELMNT_EDIT_LINK);
		if (flag) {
//			webDB.scrolldown(150);
//			Thread.sleep(750);
//			webDB.scrollRight(150);
//			Thread.sleep(750);
//			
//			webDB.test("((//table[@class='table table-bordered table dataTable no-footer']//tbody//tr)[1]//td)[5]");
//			
			webDB.clickBtnByXPath(UsersLocators.ELMNT_EDIT_LINK);
			Thread.sleep(3000);
		}
		return flag;
	}

	public boolean get_UserRole() throws IOException, InterruptedException {
		flag = webDB.waitElementByXPath(UsersLocators.ELMNT_USER_ROLE_TEXT);
		if (flag) {
			String actuserrole = webDB.getTextByXPath(UsersLocators.ELMNT_USER_ROLE_TEXT).replace("/t", "")
					.replace("/n", "");
			String expuserrole = "GalaxyTestRole";
			System.out.println("The actual User role is " + actuserrole);
			flag = actuserrole.equalsIgnoreCase(expuserrole);
			Thread.sleep(2000);

		}
		return flag;
	}

	public boolean click_Update_Btn() throws IOException, InterruptedException {
		flag = webDB.waitElementByXPath(UsersLocators.ELMNT_EmailField);
		if (flag) {
			JavascriptExecutor js = (JavascriptExecutor) webDB.passingWebDriverInstance(webDB);
			js.executeScript("window.scrollBy(0,1000)", "");
			Thread.sleep(2000);

			webDB.clickBtnByXPath(UsersLocators.ELMNT_ADD_BTN);
			Thread.sleep(2000);

			flag = webDB.waitElementByXPath(UsersLocators.ELMNT_ADD_NEW_USER_BTN);
		}
		return flag;
	}

	public boolean click_User_Delete_Link() throws IOException, InterruptedException {
		flag = webDB.waitElementByXPath(UsersLocators.ELMNT_DELETE_LINK);
		if (flag) {

			int size = webDB.countingSizeByXPath(UsersLocators.ELMNT_DELETE_LINK);
			if (size == 1) {
//				webDB.scrollRight(".table-responsive.table_audit_log.table_hgt", 750);
//				Thread.sleep(750);
				webDB.clickBtnByXPath(UsersLocators.ELMNT_DELETE_LINK);
				Thread.sleep(2000);
			}

		}
		return flag;
	}

	public boolean set_User_Delete_Reason() throws IOException, InterruptedException {
		flag = webDB.waitElementByID(UsersLocators.ELMNT_DELETE_REASON_FIELD);
		if (flag) {
			webDB.sendTextByID(UsersLocators.ELMNT_DELETE_REASON_FIELD, "This is a test user.");
			Thread.sleep(1000);

			webDB.clickBtnByXPath(UsersLocators.ELMNT_DELETE_YES_BTN);
			Thread.sleep(2000);
			flag = webDB.waitElementByXPath(UsersLocators.ELMNT_ADD_NEW_USER_BTN);

		}
		return flag;
	}



	public boolean verifyPaginationFunctionality() throws InterruptedException, IOException
	{

//		webDB.NavigateTo("https://staging.pbergo.com/admin/all_users");
//		Thread.sleep(1500);

		flag = webDB.verifyPagination("(//p[@class='float-lg-start text-sm-center'])[1]", "(//li[@class='page-item next']/button)[1]", "//table[@class='table table-bordered table dataTable no-footer']//tbody//tr");

		return flag;

	}

	public boolean verifyAscendingOrderSortingFunctionalityOfCustomerColumn() throws InterruptedException {
		flag = webDB.verifyAscendingOrderSortingFunctionality(
				UsersLocators.USERCUSTOMER_COLUMNDATA_ONWHICHSORTINGAPPLIED,
				UsersLocators.USERCUSTOMER_COLUMNNAME_ONWHICHSORTINGAPPLIED,
				UsersLocators.USERCUSTOMER_COLUMN_TOTALARROWCOUNT_ONWHICHSORTINGAPPLIED,
				UsersLocators.USERCUSTOMER_COLUMN_UPARROW_ONWHICHSORTINGAPPLIED);

		return flag;
	}

	public boolean verifyDecendingOrderSortingFunctionalityOfCustomerColumn() throws InterruptedException {
		flag = webDB.verifyDecendingOrderSortingFunctionality(
				UsersLocators.USERCUSTOMER_COLUMNDATA_ONWHICHSORTINGAPPLIED,
				UsersLocators.USERCUSTOMER_COLUMNNAME_ONWHICHSORTINGAPPLIED);

		return flag;
	}

	public boolean verifyAscendingOrderSortingFunctionalityOfNameColumn() throws InterruptedException {
		flag = webDB.verifyAscendingOrderSortingFunctionality(UsersLocators.USER_NAME_COLUMNDATA_ONWHICHSORTINGAPPLIED,
				UsersLocators.USER_NAME_COLUMNNAME_ONWHICHSORTINGAPPLIED,
				UsersLocators.USER_NAME_COLUMN_TOTALARROWCOUNT_ONWHICHSORTINGAPPLIED,
				UsersLocators.USER_NAME_COLUMN_UPARROW_ONWHICHSORTINGAPPLIED);

		return flag;
	}

	public boolean verifyDecendingOrderSortingFunctionalityOfNameColumn() throws InterruptedException {
		flag = webDB.verifyDecendingOrderSortingFunctionality(UsersLocators.USER_NAME_COLUMNDATA_ONWHICHSORTINGAPPLIED,
				UsersLocators.USER_NAME_COLUMNNAME_ONWHICHSORTINGAPPLIED);

		return flag;
	}

	public boolean verifyAscendingOrderSortingFunctionalityOfEmailColumn() throws InterruptedException {
		flag = webDB.verifyAscendingOrderSortingFunctionality(UsersLocators.USER_EMAIL_COLUMNDATA_ONWHICHSORTINGAPPLIED,
				UsersLocators.USER_EMAIL_COLUMNNAME_ONWHICHSORTINGAPPLIED,
				UsersLocators.USER_EMAIL_COLUMN_TOTALARROWCOUNT_ONWHICHSORTINGAPPLIED,
				UsersLocators.USER_EMAIL_COLUMN_UPARROW_ONWHICHSORTINGAPPLIED);

		return flag;
	}

	public boolean verifyDecendingOrderSortingFunctionalityOfEmailColumn() throws InterruptedException {
		flag = webDB.verifyDecendingOrderSortingFunctionality(UsersLocators.USER_EMAIL_COLUMNDATA_ONWHICHSORTINGAPPLIED,
				UsersLocators.USER_EMAIL_COLUMNNAME_ONWHICHSORTINGAPPLIED);

		return flag;
	}

	public boolean verifyAscendingOrderSortingFunctionalityOfRoleColumn() throws InterruptedException {
		flag = webDB.verifyAscendingOrderSortingFunctionality(UsersLocators.USER_ROLE_COLUMNDATA_ONWHICHSORTINGAPPLIED,
				UsersLocators.USER_ROLE_COLUMNNAME_ONWHICHSORTINGAPPLIED,
				UsersLocators.USER_ROLE_COLUMN_TOTALARROWCOUNT_ONWHICHSORTINGAPPLIED,
				UsersLocators.USER_ROLE_COLUMN_UPARROW_ONWHICHSORTINGAPPLIED);

		return flag;
	}

	public boolean verifyDecendingOrderSortingFunctionalityOfRoleColumn() throws InterruptedException {
		flag = webDB.verifyDecendingOrderSortingFunctionality(UsersLocators.USER_ROLE_COLUMNDATA_ONWHICHSORTINGAPPLIED,
				UsersLocators.USER_ROLE_COLUMNNAME_ONWHICHSORTINGAPPLIED);

		return flag;
	}

	public boolean verifyAscendingOrderSortingFunctionalityOfCreatedDateColumn() throws InterruptedException {

		flag = webDB.verifyAscendingOrderSortingFunctionalityOfDateColumn(
				UsersLocators.USER_CREATEDDATE_COLUMNDATA_ONWHICHSORTINGAPPLIED,
				UsersLocators.USER_CREATEDDATE_COLUMNNAME_ONWHICHSORTINGAPPLIED,
				UsersLocators.USER_CREATEDDATE_COLUMN_TOTALARROWCOUNT_ONWHICHSORTINGAPPLIED,
				UsersLocators.USER_CREATEDDATE_COLUMN_UPARROW_ONWHICHSORTINGAPPLIED);

		return flag;
	}

	public boolean verifyDecendingOrderSortingFunctionalityOfCreatedDateColumn() throws InterruptedException {
		flag = webDB.verifyDecendingOrderSortingFunctionalityOfDateColumn(
				UsersLocators.USER_CREATEDDATE_COLUMNDATA_ONWHICHSORTINGAPPLIED,
				UsersLocators.USER_CREATEDDATE_COLUMNNAME_ONWHICHSORTINGAPPLIED);

		return flag;
	}

	public boolean verifyAscendingOrderSortingFunctionalityOfActiveColumn() throws InterruptedException, AWTException
	{	
		webDB.scrollRight("((//table[@class='table table-bordered table dataTable no-footer']//tbody/tr)[1]//td)[2]", KeyEvent.VK_RIGHT, 5);
		flag = webDB.verifyAscendingOrderSortingFunctionality(UsersLocators.USER_ACTIVE_COLUMNDATA_ONWHICHSORTINGAPPLIED, UsersLocators.USER_ACTIVE_COLUMNNAME_ONWHICHSORTINGAPPLIED, UsersLocators.USER_ACTIVE_COLUMN_TOTALARROWCOUNT_ONWHICHSORTINGAPPLIED ,UsersLocators.USER_ACTIVE_COLUMN_UPARROW_ONWHICHSORTINGAPPLIED);
		
		return flag;
	}
	
	public boolean verifyDecendingOrderSortingFunctionalityOfActiveColumn() throws InterruptedException, AWTException
	{
		
		flag = webDB.verifyDecendingOrderSortingFunctionality(UsersLocators.USER_ACTIVE_COLUMNDATA_ONWHICHSORTINGAPPLIED, UsersLocators.USER_ACTIVE_COLUMNNAME_ONWHICHSORTINGAPPLIED);
		
		return flag;
	}
	
	public boolean verifyDateFilterFunctionality() throws InterruptedException
	{

		flag = webDB.verifyDateFilterFunctionality("//div[@class='row']//table/tbody/tr/td[5]", "(//table)[1]//td[text()=' No Records found ']");		

		return flag;
	}

}
