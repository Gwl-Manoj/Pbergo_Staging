package com.pbergo.testscripts;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.pbergo.base.ExtentReportBase;
import com.pbergo.base.MailUtil;
import com.pbergo.base.WebDriverBase;
import com.pbergo.commonfunctions.UIBasicFunctions;
import com.pbergo.commonfunctions.UserRoleFunctions;
import com.pbergo.locators.AdminLeftSidePanelLocators;
import com.pbergo.locators.AdminUserRoleLocators;

/**
 * @author Galaxy Web Links
 * @Project: PBErgo WEB
 * @AutomationEngineer: Navin
 * 
 */
public class UserRole extends ExtentReportBase {
	private WebDriverBase webDB;
	private UIBasicFunctions uibasicfunctions;
	private UserRoleFunctions userRoleFunctions;
	private MailUtil mailutil;
	boolean flag = false;

	/**
	 * @throws IOException
	 * @throws InterruptedException 
	 */
	@BeforeClass(alwaysRun = true)
	public void beforeClass() throws IOException, InterruptedException {
		webDB = new WebDriverBase();
		mailutil = new MailUtil();
		uibasicfunctions = new UIBasicFunctions(webDB);
		userRoleFunctions = new UserRoleFunctions(webDB);
		webDB.openBrowser();

	}

	@Test(description = "To verify the login functionality")
	public void verifyLogin() throws IOException, InterruptedException {
		flag = uibasicfunctions.userLoggedIN();
		 test = extent.createTest(this.getClass().getName() + ": To verify the login functionality");
		Assert.assertTrue(flag);
	}

	@Test(description = "This method is used to open Admin Dashboard page.")
	public void verifyOpenAdminDashboard() throws IOException, InterruptedException {
		flag = uibasicfunctions.openAdminDashboard();
		 test = extent.createTest(this.getClass().getName() + ": This method is used to Open the admin dashboard");
		Assert.assertTrue(flag);
	}

	@Test(description = "This method is used to open User Listing page.")
	public void verifyOpenUserRoleListing() throws IOException, InterruptedException {
		flag = userRoleFunctions.openUserRoleListingPage();
		test = extent.createTest(this.getClass().getName() + ": This method is used to Open the User role listing page");
		Assert.assertTrue(flag);
	}

	@Test(description = "This method is used to click on add User Role button")
	public void verifyAddUserRole() throws IOException, InterruptedException {
		flag = userRoleFunctions.addUserRole();
		test = extent.createTest(this.getClass().getName() + ": This method is used to click on add User Role button");
		Assert.assertTrue(flag);
	}

	@Test(description = "This method is used to Edit User Role after search.")
	public void verifyEditUserRole() throws IOException, InterruptedException {
		flag = userRoleFunctions.editUserRole();
		test = extent.createTest(this.getClass().getName() + ": This method is used to Edit User Role after search.");
		Assert.assertTrue(flag);
	}

	@Test(description = "This method is used to Delete User Role after search.")
	public void verifyDeleteUserRole() throws IOException, InterruptedException {
		flag = userRoleFunctions.deleteUserRole();
		test = extent.createTest(this.getClass().getName() + ": This method is used to Delete User Role after search.");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to verify the pagination functionality.")
	public void verifyPaginationFunctionality() throws IOException, InterruptedException {
		flag = userRoleFunctions.verifyPaginationFunctionality();
		test = extent.createTest(this.getClass().getName() + ": This method is used to verify the pagination functionality.");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to verify the Ascending sorting functionality of user role column.")
	public void verifyAscendingOrderSortingFunctionalityOfUserRoleColumn() throws IOException, InterruptedException {
		flag = userRoleFunctions.verifyAscendingOrderSortingFunctionalityOfUserRoleColumn();
		test = extent.createTest(this.getClass().getName() + ": This method is used to verify the Ascending sorting functionality of user role column.");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to verify the decending sorting functionality of user role column.")
	public void verifyDecendingOrderSortingFunctionalityOfUserRoleColumn() throws IOException, InterruptedException {
		flag = userRoleFunctions.verifyDecendingOrderSortingFunctionalityOfUserRoleColumn();
		test = extent.createTest(this.getClass().getName() + ": This method is used to verify the decending sorting functionality of user role column.");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to verify the Ascending sorting functionality of description column.")
	public void verifyAscendingOrderSortingFunctionalityOfDescriptionColumn() throws IOException, InterruptedException {
		flag = userRoleFunctions.verifyAscendingOrderSortingFunctionalityOfDescriptionColumn();
		test = extent.createTest(this.getClass().getName() + ": This method is used to verify the Ascending sorting functionality of description column.");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to verify the decending sorting functionality of description column.")
	public void verifyDecendingOrderSortingFunctionalityOfDescriptionColumn() throws IOException, InterruptedException {
		flag = userRoleFunctions.verifyDecendingOrderSortingFunctionalityOfDescriptionColumn();
		test = extent.createTest(this.getClass().getName() + ": This method is used to verify the decending sorting functionality of description column.");
		Assert.assertTrue(flag);
	}
	
	
	@AfterClass(alwaysRun = false)
	public void afterClass() throws IOException {
		webDB.tearDown();
	}
}