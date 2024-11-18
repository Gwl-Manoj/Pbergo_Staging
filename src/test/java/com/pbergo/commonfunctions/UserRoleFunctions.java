package com.pbergo.commonfunctions;

import java.io.IOException;

import org.apache.bcel.generic.Select;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

import com.github.javafaker.Faker;
import com.pbergo.base.WebDriverBase;
import com.pbergo.locators.AdminDeleteUserRoleLocators;
import com.pbergo.locators.AdminEditUserRoleLocators;
import com.pbergo.locators.AdminLeftSidePanelLocators;
import com.pbergo.locators.AdminUserRoleLocators;
import com.pbergo.locators.UsersLocators;

public class UserRoleFunctions {
	private WebDriverBase webDB;
	private boolean flag;
	Faker faker = new Faker();
	String userrole = new String();

	public UserRoleFunctions(WebDriverBase webDB) {
		this.webDB = webDB;
	}

	/**
	 * @return
	 * @throws IOException
	 * @throws InterruptedException
	 */
	public boolean openUserRoleListingPage() throws IOException, InterruptedException {
		flag = webDB.waitElementByXPath(AdminLeftSidePanelLocators.ELMNT_USER_ROLE_LINK);
		if (flag) {
			webDB.clickBtnByXPath(AdminLeftSidePanelLocators.ELMNT_USER_ROLE_LINK);
			Thread.sleep(1000);
			flag = webDB.waitElementByXPath(AdminUserRoleLocators.ELMNT_ADD_USER_ROLE_BTN);
		}
		return flag;
	}

	public boolean addUserRole() throws IOException, InterruptedException {
		flag = webDB.waitElementByXPath(AdminUserRoleLocators.ELMNT_ADD_USER_ROLE_BTN);
		if (flag) {
			webDB.clickBtnByXPath(AdminUserRoleLocators.ELMNT_ADD_USER_ROLE_BTN);
			Thread.sleep(1000);
			flag = webDB.waitElementByXPath(AdminUserRoleLocators.ELMNT_ROLE_NAME_FLD);
			if (flag) {
				int name1 = faker.number().numberBetween(35, 95);
				userrole = "Galaxy_UserRole_"+name1;
				webDB.sendTextByXPath(AdminUserRoleLocators.ELMNT_ROLE_NAME_FLD, userrole);
				Thread.sleep(1000);
				System.out.println("The user role enter is "+userrole);

				webDB.sendTextByXPath(AdminUserRoleLocators.ELMNT_DESCRIPTION_FLD, "Description for Test User Role.");
				webDB.sendTextByXpath(AdminUserRoleLocators.ELMNT_DESCRIPTION_FLD, Keys.TAB);
				Thread.sleep(1000);

				

				webDB.clickBtnByID(AdminUserRoleLocators.ELMNT_USR_ROLE_VIEW_CHKBOX);
				Thread.sleep(1000);
				
				JavascriptExecutor js = (JavascriptExecutor) webDB.passingWebDriverInstance(webDB);
				js.executeScript("window.scrollBy(0,6000)", "");
				Thread.sleep(1000);
				webDB.clickBtnByXPath(AdminUserRoleLocators.ELMNT_SAVE_BTN);
				Thread.sleep(1000);
				flag = webDB.waitElementByXPath(AdminUserRoleLocators.ELMNT_ADD_USER_ROLE_BTN);
			}
		}
		return flag;
	}

	public boolean searchUserRole(String elementToWait) throws IOException, InterruptedException {
		flag = webDB.waitElementByXPath(AdminUserRoleLocators.ELMNT_SEARCH_FLD);
		if (flag) {
			webDB.getPageRefresh();
			Thread.sleep(2000);
			webDB.waitElementByXPath(AdminUserRoleLocators.ELMNT_SEARCH_FLD);
			webDB.sendTextByXPath(AdminUserRoleLocators.ELMNT_SEARCH_FLD, userrole);
			webDB.sendTextByXpath(AdminUserRoleLocators.ELMNT_SEARCH_FLD, Keys.ENTER);
			Thread.sleep(1000);

			flag = webDB.waitElementByXPath(elementToWait);
		}
		return flag;
	}

	public boolean editUserRole() throws IOException, InterruptedException {
		flag = searchUserRole(AdminUserRoleLocators.ELMNT_USER_EDIT_LNK);
		if (flag) {
			webDB.clickBtnByXPath(AdminUserRoleLocators.ELMNT_USER_EDIT_LNK);
			Thread.sleep(2000);
			flag = webDB.waitElementByXPath(AdminEditUserRoleLocators.ELMNT_ROLE_NAME_FLD);
			if (flag) {
				JavascriptExecutor js = (JavascriptExecutor) webDB.passingWebDriverInstance(webDB);
				js.executeScript("window.scrollBy(0,6000)", "");
				Thread.sleep(1000);
				
				webDB.clickBtnByXPath(AdminEditUserRoleLocators.ELMNT_UPDATE_BTN);
				Thread.sleep(2500);
				flag = webDB.waitElementByXPath(AdminUserRoleLocators.ELMNT_ADD_USER_ROLE_BTN);
			}
		}
		return flag;
	}

	public boolean deleteUserRole() throws IOException, InterruptedException {
		flag = searchUserRole(AdminUserRoleLocators.ELMNT_USER_DELETE_LNK);
		if (flag) {
			webDB.clickBtnByXPath(AdminUserRoleLocators.ELMNT_USER_DELETE_LNK);
			Thread.sleep(2000);
			flag = webDB.waitElementByID(AdminDeleteUserRoleLocators.ELMNT_REASON_FLD);
			if (flag) {
				webDB.sendTextByID(AdminDeleteUserRoleLocators.ELMNT_REASON_FLD, "This is a galaxy Test User role");
				Thread.sleep(2000);
				webDB.clickBtnByXPath(AdminDeleteUserRoleLocators.ELMNT_YES_BTN);
				Thread.sleep(2000);
				flag = webDB.waitElementByXPath(AdminUserRoleLocators.ELMNT_ADD_USER_ROLE_BTN);
			}
		}
		return flag;
	}
	
	public boolean verifyPaginationFunctionality() throws InterruptedException, IOException
	{
		
		webDB.getPageRefresh();
		Thread.sleep(2000);

		flag = webDB.verifyPagination("(//p[@class='float-lg-start text-sm-center'])[1]", "(//li[@class='page-item next']/button)[1]", "//table[@class='table table-bordered table dataTable no-footer']//tbody//tr");
		return flag;
		
	}
	
	public boolean verifyAscendingOrderSortingFunctionalityOfUserRoleColumn() throws InterruptedException
	{	
		flag = webDB.verifyAscendingOrderSortingFunctionality(AdminUserRoleLocators.USERROLENAME_COLUMNDATA_ONWHICHSORTINGAPPLIED, AdminUserRoleLocators.USERROLENAME_COLUMNNAME_ONWHICHSORTINGAPPLIED, AdminUserRoleLocators.USERROLENAME_COLUMN_TOTALARROWCOUNT_ONWHICHSORTINGAPPLIED ,AdminUserRoleLocators.USERROLENAME_COLUMN_UPARROW_ONWHICHSORTINGAPPLIED);
		
		return flag;
	}
	
	public boolean verifyDecendingOrderSortingFunctionalityOfUserRoleColumn() throws InterruptedException
	{
		flag = webDB.verifyDecendingOrderSortingFunctionality(AdminUserRoleLocators.USERROLENAME_COLUMNDATA_ONWHICHSORTINGAPPLIED, AdminUserRoleLocators.USERROLENAME_COLUMNNAME_ONWHICHSORTINGAPPLIED);
		
		return flag;
	}
	
	public boolean verifyAscendingOrderSortingFunctionalityOfDescriptionColumn() throws InterruptedException
	{
		flag = webDB.verifyAscendingOrderSortingFunctionality(AdminUserRoleLocators.DESCRIPTION_COLUMNDATA_ONWHICHSORTINGAPPLIED, AdminUserRoleLocators.DESCRIPTION_COLUMNNAME_ONWHICHSORTINGAPPLIED, AdminUserRoleLocators.DESCRIPTION_COLUMN_TOTALARROWCOUNT_ONWHICHSORTINGAPPLIED ,AdminUserRoleLocators.DESCRIPTION_COLUMN_UPARROW_ONWHICHSORTINGAPPLIED);
		return flag;
	}
	
	public boolean verifyDecendingOrderSortingFunctionalityOfDescriptionColumn() throws InterruptedException
	{
		flag = webDB.verifyDecendingOrderSortingFunctionality(AdminUserRoleLocators.DESCRIPTION_COLUMNDATA_ONWHICHSORTINGAPPLIED, AdminUserRoleLocators.DESCRIPTION_COLUMNNAME_ONWHICHSORTINGAPPLIED);
		return flag;
	}

}
