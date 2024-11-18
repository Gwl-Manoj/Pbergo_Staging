package com.pbergo.testscripts;

import org.testng.annotations.Test;

import com.pbergo.base.ExtentReportBase;
import com.pbergo.base.MailUtil;
import com.pbergo.base.WebDriverBase;
import com.pbergo.commonfunctions.CommonFeatures;
//import com.pbergo.commonfunctions.BuildABoxFunctions;
import com.pbergo.commonfunctions.UIBasicFunctions;
import com.pbergo.commonfunctions.UsersFunctions;
//import com.pbergo.locators.BuildABoxLocators;
//import com.pbergo.locators.HeaderSectionLocators;
import com.relevantcodes.extentreports.ExtentReports;
import org.testng.annotations.BeforeClass;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

/**
 * @author Navin
 *
 */
public class UsersTest extends ExtentReportBase {
	private WebDriverBase webDB;
	private UIBasicFunctions uibasicfunctions;
	private UsersFunctions usersfunctions;
	private CommonFeatures commonFeatures;

	boolean flag = false;
	String userName = System.getProperty("userName");
	String password = System.getProperty("password");

	/**
	 * @throws IOException
	 * @throws InterruptedException
	 */
	@BeforeClass(alwaysRun = true)
	public void beforeClass() throws IOException, InterruptedException {
		webDB = new WebDriverBase();
		uibasicfunctions = new UIBasicFunctions(webDB);
		usersfunctions = new UsersFunctions(webDB);
		commonFeatures = new CommonFeatures(webDB);
		webDB.openBrowser();
	}

	@Test(description = "To verify the login functionality")
	public void verifyLogin() throws IOException, InterruptedException {
		flag = uibasicfunctions.userLoggedIN();
		test = extent.createTest(this.getClass().getName() + ": To verify the login functionality.");
		Assert.assertTrue(flag);
	}

	@Test(description = "This method is used to Open the admin dashboard")
	public void verifyopenAdminDashboard() throws IOException, InterruptedException {
		flag = uibasicfunctions.openAdminDashboard();
		test = extent.createTest(this.getClass().getName() + ": This method is used to Open the admin dashboard");
		Assert.assertTrue(flag);
	}

	@Test(description = "This method is used to Select the user action from left side panel.")
	public void verifyOpenUserListing() throws IOException, InterruptedException {
		flag =usersfunctions.click_User_Left_Panel();
		test = extent
				.createTest(this.getClass().getName() + ": This method is used to Select the user action from left side panel.");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to Select the user action from left side panel.")
	public void datepicker() throws IOException, InterruptedException {
		flag =commonFeatures.datepicker();
		test = extent
				.createTest(this.getClass().getName() + ": This method is used to Select the user action from left side panel.");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to click on add user button")
	public void click_Add_New_User() throws IOException, InterruptedException {
		flag =usersfunctions.click_Add_Users();
		test = extent
				.createTest(this.getClass().getName() + ": This method is used to click on add user button");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to check the Add user functionality.")
	public void verifyAddUser() throws IOException, InterruptedException {
		flag = usersfunctions.addUserForm();
		test = extent
				.createTest(this.getClass().getName() + ": This method is used to check the Add user functionality.");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to search the user by email ID.")
	public void verifyUserSearch() throws IOException, InterruptedException {
			flag = usersfunctions.user_Search();
		test = extent
				.createTest(this.getClass().getName() + ": This method is used to search the user by email ID.");
		Assert.assertTrue(flag);
	}

	@Test(description = "This method is used to click on user edit link.")
	public void click_User_Edit_Link() throws IOException, InterruptedException {
			flag = usersfunctions.click_User_Edit_Link();
		test = extent
				.createTest(this.getClass().getName() + ": This method is used to click on user edit link.");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to get and compare the user role.")
	public void get_UserRole() throws IOException, InterruptedException {
			flag = usersfunctions.get_UserRole();
		test = extent
				.createTest(this.getClass().getName() + ": This method is used to get and compare the user role.");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to click on update button and verify the edit functionality.")
	public void click_Update_Btn() throws IOException, InterruptedException {
			flag = usersfunctions.click_Update_Btn();
		test = extent
				.createTest(this.getClass().getName() + ": This method is used to click on update button and verify the edit functionality.");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to click on delete link.")
	public void click_User_Delete_Link() throws IOException, InterruptedException {
		flag = usersfunctions.user_Search();
		if(flag)
		{
			flag = usersfunctions.click_User_Delete_Link();
		}
		
		test = extent
				.createTest(this.getClass().getName() + ": This method is used to click on delete link.");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to verify delete functioanlity.")
	public void set_User_Delete_Reason() throws IOException, InterruptedException {
			flag = usersfunctions.set_User_Delete_Reason();
		test = extent
				.createTest(this.getClass().getName() + ": This method is used to verify delete functioanlity.");
		Assert.assertTrue(flag);
	}

	@Test(description = "This method is used to verify the pagination functionality.")
	public void verifyPaginationFunctionality() throws IOException, InterruptedException {
		flag = usersfunctions.verifyPaginationFunctionality();
		test = extent.createTest(this.getClass().getName() + ": This method is used to verify the pagination functionality.");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to verify the Ascending sorting functionality of customer column.")
	public void verifyAscendingOrderSortingFunctionalityOfCustomerColumn() throws IOException, InterruptedException {
		flag = usersfunctions.verifyAscendingOrderSortingFunctionalityOfCustomerColumn();
		test = extent.createTest(this.getClass().getName() + ": This method is used to verify the Ascending sorting functionality of customer column.");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to verify the decending sorting functionality of customer column.")
	public void verifyDecendingOrderSortingFunctionalityOfCustomerColumn() throws IOException, InterruptedException {
		flag = usersfunctions.verifyDecendingOrderSortingFunctionalityOfCustomerColumn();
		test = extent.createTest(this.getClass().getName() + ": This method is used to verify the decending sorting functionality of customer column.");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to verify the Ascending sorting functionality of name column.")
	public void verifyAscendingOrderSortingFunctionalityOfNameColumn() throws IOException, InterruptedException {
		flag = usersfunctions.verifyAscendingOrderSortingFunctionalityOfNameColumn();
		test = extent.createTest(this.getClass().getName() + ": This method is used to verify the Ascending sorting functionality of name column.");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to verify the decending sorting functionality of name column.")
	public void verifyDecendingOrderSortingFunctionalityOfNameColumn() throws IOException, InterruptedException {
		flag = usersfunctions.verifyDecendingOrderSortingFunctionalityOfNameColumn();
		test = extent.createTest(this.getClass().getName() + ": This method is used to verify the decending sorting functionality of name column.");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to verify the Ascending sorting functionality of Email column.")
	public void verifyAscendingOrderSortingFunctionalityOfEmailColumn() throws IOException, InterruptedException {
		flag = usersfunctions.verifyAscendingOrderSortingFunctionalityOfEmailColumn();
		test = extent.createTest(this.getClass().getName() + ": This method is used to verify the Ascending sorting functionality of Email column.");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to verify the decending sorting functionality of Email column.")
	public void verifyDecendingOrderSortingFunctionalityOfEmailColumn() throws IOException, InterruptedException {
		flag = usersfunctions.verifyDecendingOrderSortingFunctionalityOfEmailColumn();
		test = extent.createTest(this.getClass().getName() + ": This method is used to verify the decending sorting functionality of Email column.");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to verify the Ascending sorting functionality of Role column.")
	public void verifyAscendingOrderSortingFunctionalityOfRoleColumn() throws IOException, InterruptedException {
		flag = usersfunctions.verifyAscendingOrderSortingFunctionalityOfRoleColumn();
		test = extent.createTest(this.getClass().getName() + ": This method is used to verify the Ascending sorting functionality of Role column.");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to verify the decending sorting functionality of Role column.")
	public void verifyDecendingOrderSortingFunctionalityOfRoleColumn() throws IOException, InterruptedException {
		flag = usersfunctions.verifyDecendingOrderSortingFunctionalityOfRoleColumn();
		test = extent.createTest(this.getClass().getName() + ": This method is used to verify the decending sorting functionality of Role column.");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to verify the Ascending sorting functionality of Created Date column.")
	public void verifyAscendingOrderSortingFunctionalityOfCreatedDateColumn() throws IOException, InterruptedException {
		flag = usersfunctions.verifyAscendingOrderSortingFunctionalityOfCreatedDateColumn();
		test = extent.createTest(this.getClass().getName() + ": This method is used to verify the Ascending sorting functionality of Created Date column.");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to verify the decending sorting functionality of Created Date column.")
	public void verifyDecendingOrderSortingFunctionalityOfCreatedDateColumn() throws IOException, InterruptedException {
		flag = usersfunctions.verifyDecendingOrderSortingFunctionalityOfCreatedDateColumn();
		test = extent.createTest(this.getClass().getName() + ": This method is used to verify the decending sorting functionality of Created Date column.");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to verify the Ascending sorting functionality of Active column.")
	public void verifyAscendingOrderSortingFunctionalityOfActiveColumn() throws IOException, InterruptedException, AWTException {
		flag = usersfunctions.verifyAscendingOrderSortingFunctionalityOfActiveColumn();
		test = extent.createTest(this.getClass().getName() + ": This method is used to verify the Ascending sorting functionality of Active column.");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to verify the decending sorting functionality of Active column.")
	public void verifyDecendingOrderSortingFunctionalityOfActiveColumn() throws IOException, InterruptedException, AWTException {
		flag = usersfunctions.verifyDecendingOrderSortingFunctionalityOfActiveColumn();
		test = extent.createTest(this.getClass().getName() + ": This method is used to verify the decending sorting functionality of Active column.");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to verify the date filter functionality.")
	public void verifyDateFilterFunctionality() throws IOException, InterruptedException {
		flag = usersfunctions.verifyDateFilterFunctionality();
		test = extent.createTest(this.getClass().getName() + ": This method is used to verify the date filter functionality.");
		Assert.assertTrue(flag);
	}
	
	

	@AfterClass(alwaysRun = true)
	public void afterClass() throws IOException {
		webDB.tearDown();
	}
	
//	@AfterSuite
//	public void SendMail() throws Exception {
//		MailUtil.sendNotificationMail("Pbergo email"); 
//		
//	}
}
