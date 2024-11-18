package com.pbergo.testscripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pbergo.base.ExtentReportBase;
import com.pbergo.base.WebDriverBase;
import com.pbergo.commonfunctions.CommonFeatures;
import com.pbergo.commonfunctions.EvaluatorFunctions;
import com.pbergo.commonfunctions.UIBasicFunctions;
import com.pbergo.commonfunctions.UsersFunctions;
import com.pbergo.locators.EvaluatorLocators;

public class CommonFeaturesTest extends ExtentReportBase{
	private WebDriverBase webDB;
	private UIBasicFunctions uibasicfunctions;
	private CommonFeatures commonFeatures;
	private UsersFunctions usersfunctions;

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
		flag = usersfunctions.click_User_Left_Panel();
		test = extent
				.createTest(this.getClass().getName() + ": This method is used to Select the user action from left side panel.");
		Assert.assertTrue(flag);
	}

	@Test(description = "This method is used to select the date filter")
	public void selectDate() throws IOException, InterruptedException {
		flag = commonFeatures.datepicker();
		test = extent.createTest(
				this.getClass().getName() + ": This method is used to select the date filter");
		Assert.assertTrue(flag);
	}
	
//	@Test(description = "This method is used verify the Reports in review search filter functionality")
//	public void verifyReportsInReviewSearchFunctionality() throws IOException, InterruptedException {
//		
//			flag = evaluatorfunction.verifyReportsInReviewSearchFunctionality();
//		
//		test = extent.createTest(
//				this.getClass().getName() + ": This method is used verify the Reports in review search filter functionality");
//		Assert.assertTrue(flag);
//	}

	@AfterClass(alwaysRun = true)
	public void afterClass() throws IOException {
		webDB.tearDown();
	}
}
