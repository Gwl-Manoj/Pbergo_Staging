package com.pbergo.testscripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pbergo.base.ExtentReportBase;
import com.pbergo.base.WebDriverBase;
import com.pbergo.commonfunctions.EmployeeSearchFunctions;
import com.pbergo.commonfunctions.EvaluatorFunctions;
import com.pbergo.commonfunctions.UIBasicFunctions;
import com.pbergo.locators.EvaluatorLocators;

public class EmployeeSearchPageTest extends ExtentReportBase {

	private WebDriverBase webDB;
	private UIBasicFunctions uibasicfunctions;
	private EmployeeSearchFunctions employeesearchfunction;

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
		employeesearchfunction = new EmployeeSearchFunctions(webDB);
		webDB.openBrowser();
	}

	@Test(description = "To verify the login functionality")
	public void verifyLogin() throws IOException, InterruptedException {
		flag = uibasicfunctions.userLoggedIN();
		test = extent.createTest(this.getClass().getName() + ": To verify the login functionality.");
		Assert.assertTrue(flag);
	}

	@Test(description = "This method is used to Open the employee dashboard")
	public void verifyopenEmployeeDashboard() throws IOException, InterruptedException {
		flag = uibasicfunctions.openEmployeeDashboard(EvaluatorLocators.ELMNT_EVALUATOR_LEFTSIDEPANEL);
		test = extent.createTest(this.getClass().getName() + ": This method is used to Open the employee dashboard");
		Assert.assertTrue(flag);
	}

	@Test(description = "This method is used to Select the Program overview page from left side panel.")
	public void verifyOpenEvaluator() throws IOException, InterruptedException {
//		flag = evaluatorfunction.openEvaluatorLink();
//		if(flag)
//		{
//			flag = evaluatorfunction.verifyReportsInReviewSearchFunctionality();
//		}
		test = extent.createTest(
				this.getClass().getName() + ": This method is used to Select the user action from left side panel.");
		Assert.assertTrue(flag);
	}

	@Test(description = "This method is used to verify the pagination functionality.")
	public void verifyPaginationFunctionality() throws IOException, InterruptedException {
		webDB.getPageRefresh();
		Thread.sleep(1500);
		flag = employeesearchfunction.verifyPaginationFunctionality();
		test = extent.createTest(this.getClass().getName() + ": This method is used to verify the pagination functionality.");
		Assert.assertTrue(flag);
	}
	@Test(description = "This method is used to verify the Ascending sorting functionality of First Name.")
	public void verifyAscendingOrderSortingFunctionalityOfFirstName() throws IOException, InterruptedException {
		flag = employeesearchfunction.verifyAscendingOrderSortingFunctionalityOfFirstName();
		test = extent.createTest(this.getClass().getName()
				+ ": This method is used to verify the Ascending sorting functionality of First Name.");
		Assert.assertTrue(flag);
	}

	@Test(description = "This method is used to verify the decending sorting functionality of First Name")
	public void verifyDecendingOrderSortingFunctionalityOfFirstName() throws IOException, InterruptedException {
		flag = employeesearchfunction.verifyDecendingOrderSortingFunctionalityOfFirstName();
		test = extent.createTest(this.getClass().getName()
				+ ": This method is used to verify the decending sorting functionality of First Name.");
		Assert.assertTrue(flag);
	}

	@Test(description = "This method is used to verify the Ascending sorting functionality of Last Name.")
	public void verifyAscendingOrderSortingFunctionalityOfLastName() throws IOException, InterruptedException {
		flag = employeesearchfunction.verifyAscendingOrderSortingFunctionalityOfLastName();
		test = extent.createTest(this.getClass().getName()
				+ ": This method is used to verify the Ascending sorting functionality of Last Name.");
		Assert.assertTrue(flag);
	}

	@Test(description = "This method is used to verify the decending sorting functionality of Last Name")
	public void verifyDecendingOrderSortingFunctionalityOfLastName() throws IOException, InterruptedException {
		flag = employeesearchfunction.verifyDecendingOrderSortingFunctionalityOfLastName();
		test = extent.createTest(this.getClass().getName()
				+ ": This method is used to verify the decending sorting functionality of Last Name.");
		Assert.assertTrue(flag);
	}

	@Test(description = "This method is used to verify the Ascending sorting functionality of EmailAddress.")
	public void verifyAscendingOrderSortingFunctionalityOfEmailAddress() throws IOException, InterruptedException {
		flag = employeesearchfunction.verifyAscendingOrderSortingFunctionalityOfEmailAddress();
		test = extent.createTest(this.getClass().getName()
				+ ": This method is used to verify the Ascending sorting functionality of EmailAddress.");
		Assert.assertTrue(flag);
	}

	@Test(description = "This method is used to verify the decending sorting functionality of EmailAddress")
	public void verifyDecendingOrderSortingFunctionalityOfEmailAddress() throws IOException, InterruptedException {
		flag = employeesearchfunction.verifyDecendingOrderSortingFunctionalityOfEmailAddress();
		test = extent.createTest(this.getClass().getName()
				+ ": This method is used to verify the decending sorting functionality of EmailAddress.");
		Assert.assertTrue(flag);
	}

	@Test(description = "This method is used to verify the Ascending sorting functionality of Region.")
	public void verifyAscendingOrderSortingFunctionalityOfRegion() throws IOException, InterruptedException {
		flag = employeesearchfunction.verifyAscendingOrderSortingFunctionalityOfRegion();
		test = extent.createTest(this.getClass().getName()
				+ ": This method is used to verify the Ascending sorting functionality of Region.");
		Assert.assertTrue(flag);
	}

	@Test(description = "This method is used to verify the decending sorting functionality of Region")
	public void verifyDecendingOrderSortingFunctionalityOfRegion() throws IOException, InterruptedException {
		flag = employeesearchfunction.verifyDecendingOrderSortingFunctionalityOfRegion();
		test = extent.createTest(this.getClass().getName()
				+ ": This method is used to verify the decending sorting functionality of Region.");
		Assert.assertTrue(flag);
	}

	@AfterClass(alwaysRun = true)
	public void afterClass() throws IOException {
		webDB.tearDown();
	}
}
