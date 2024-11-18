package com.pbergo.testscripts;

import org.testng.annotations.Test;

import com.pbergo.base.ExtentReportBase;
import com.pbergo.base.WebDriverBase;
import com.pbergo.commonfunctions.EmployeeSearchFunctions;
import com.pbergo.commonfunctions.ProgramManagement;
import com.pbergo.commonfunctions.ProgramManagementFunctions;
import com.pbergo.commonfunctions.UIBasicFunctions;
import com.pbergo.locators.ErgoEvalActivityLocators;

import org.testng.annotations.BeforeClass;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class EmployeeSearchTest extends ExtentReportBase{
  
	private WebDriverBase webDB;
	private UIBasicFunctions uibasicfunctions;
	private  EmployeeSearchFunctions employeesearch;  
	private ProgramManagementFunctions programmanagementfunction;

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
		employeesearch = new EmployeeSearchFunctions(webDB);
		webDB.openBrowser();
	}
  
	@Test(description = "To verify the login functionality.")
	public void verifyLogin() throws IOException, InterruptedException {
		flag = uibasicfunctions.userLoggedIN();
		test = extent.createTest(this.getClass().getName() + ": To verify the login functionality.");
		Assert.assertTrue(flag);
	}

	@Test(description = "This method is used to Open the employee dashboard")
	public void verifyopenEmployeeDashboard() throws IOException, InterruptedException {
		flag = uibasicfunctions.openEmployeeDashboard(ErgoEvalActivityLocators.ELMNT_ERGO_EVAL_ACTIVITY_LEFTSIDEPANEL);
		test = extent.createTest(this.getClass().getName() + ": This method is used to Open the employee dashboard");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is to verify the employee search section in which the filter, tabs, download all button, features are executed.")
	public void openEmployeeSearchLink() throws IOException, InterruptedException, AWTException {
		flag = employeesearch.openEmployeeSearchLink();
		test = extent.createTest(
				this.getClass().getName() + ": This method is to verify the employee search section in which the filter, tabs, download all button, features are executed.");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is to verify the searching of the employees.  ")
	public void programsearch() throws IOException, InterruptedException, AWTException {
		flag = employeesearch.programsearch();
		test = extent.createTest(
				this.getClass().getName() + ": This method is to verify the searching of the employees.  ");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is to verify the self assessment section in which the searching and downloading the data set action is performed")
	public void selfassessmentsearch() throws IOException, InterruptedException, AWTException {
		flag = employeesearch.selfassessmentsearch();
		test = extent.createTest(
				this.getClass().getName() + ": This method is to verify the self assessment section in which the searching and downloading the data set action is performed");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is to verify the click and closing action on the history")
	public void selfassessmenthistory() throws IOException, InterruptedException, AWTException {
		flag = employeesearch.selfassessmenthistory();
		test = extent.createTest(
				this.getClass().getName() + ": This method is to verify the click and closing action on the history");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is to verify the ergo eval section in which the searching and downloading the data set action is performed")
	public void ergoevalsearch() throws IOException, InterruptedException, AWTException {
		flag = employeesearch.ergoevalsearch();
		test = extent.createTest(
				this.getClass().getName() + ": This method is to verify the ergo eval section in which the searching and downloading the data set action is performed");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is to verify the click and closing action on the history")
	public void ergoevalhistory() throws IOException, InterruptedException, AWTException {
		flag = employeesearch.ergoevalhistory();
		test = extent.createTest(
				this.getClass().getName() + ": This method is to verify the click and closing action on the history.");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is to verify the follow ups section in which the searching and downloading the data set action is performed")
	public void followupssearch() throws IOException, InterruptedException, AWTException {
		flag = employeesearch.followupssearch();
		test = extent.createTest(
				this.getClass().getName() + ": This method is to verify the follow ups section in which the searching and downloading the data set action is performed");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is to verify the click and closing action on the history")
	public void followupshistory() throws IOException, InterruptedException, AWTException {
		flag = employeesearch.followupshistory();
		test = extent.createTest(
				this.getClass().getName() + ": This method is to verify the click and closing action on the history.");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is to verify the schedule request form section in which the searching and downloading the data set action is performed")
	public void schedulerequestformsearch() throws IOException, InterruptedException, AWTException {
		flag = employeesearch.schedulerequestformsearch();
		test = extent.createTest(
				this.getClass().getName() + ": This method is to verify the schedule request form section in which the searching and downloading the data set action is performed");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is to verify the click and closing action on the history")
	public void schedulerequestformhistory() throws IOException, InterruptedException, AWTException {
		flag = employeesearch.schedulerequestformhistory();
		test = extent.createTest(
				this.getClass().getName() + ": This method is to verify the click and closing action on the history.");
		Assert.assertTrue(flag);
	}
	@Test(description = "This method is used to verify the pagination functionality.")
	public void verifyPaginationFunctionality() throws IOException, InterruptedException {
		webDB.getPageRefresh();
		Thread.sleep(1500);
		flag = employeesearch.verifyPaginationFunctionality();
		test = extent.createTest(this.getClass().getName() + ": This method is used to verify the pagination functionality.");
		Assert.assertTrue(flag);
	}
	@Test(description = "This method is used to verify the Ascending sorting functionality of First Name.")
	public void verifyAscendingOrderSortingFunctionalityOfFirstName() throws IOException, InterruptedException {
		flag = employeesearch.verifyAscendingOrderSortingFunctionalityOfFirstName();
		test = extent.createTest(this.getClass().getName()
				+ ": This method is used to verify the Ascending sorting functionality of First Name.");
		Assert.assertTrue(flag);
	}

	@Test(description = "This method is used to verify the decending sorting functionality of First Name")
	public void verifyDecendingOrderSortingFunctionalityOfFirstName() throws IOException, InterruptedException {
		flag = employeesearch.verifyDecendingOrderSortingFunctionalityOfFirstName();
		test = extent.createTest(this.getClass().getName()
				+ ": This method is used to verify the decending sorting functionality of First Name.");
		Assert.assertTrue(flag);
	}

	@Test(description = "This method is used to verify the Ascending sorting functionality of Last Name.")
	public void verifyAscendingOrderSortingFunctionalityOfLastName() throws IOException, InterruptedException {
		flag = employeesearch.verifyAscendingOrderSortingFunctionalityOfLastName();
		test = extent.createTest(this.getClass().getName()
				+ ": This method is used to verify the Ascending sorting functionality of Last Name.");
		Assert.assertTrue(flag);
	}

	@Test(description = "This method is used to verify the decending sorting functionality of Last Name")
	public void verifyDecendingOrderSortingFunctionalityOfLastName() throws IOException, InterruptedException {
		flag = employeesearch.verifyDecendingOrderSortingFunctionalityOfLastName();
		test = extent.createTest(this.getClass().getName()
				+ ": This method is used to verify the decending sorting functionality of Last Name.");
		Assert.assertTrue(flag);
	}

	@Test(description = "This method is used to verify the Ascending sorting functionality of EmailAddress.")
	public void verifyAscendingOrderSortingFunctionalityOfEmailAddress() throws IOException, InterruptedException {
		flag = employeesearch.verifyAscendingOrderSortingFunctionalityOfEmailAddress();
		test = extent.createTest(this.getClass().getName()
				+ ": This method is used to verify the Ascending sorting functionality of EmailAddress.");
		Assert.assertTrue(flag);
	}

	@Test(description = "This method is used to verify the decending sorting functionality of EmailAddress")
	public void verifyDecendingOrderSortingFunctionalityOfEmailAddress() throws IOException, InterruptedException {
		flag = employeesearch.verifyDecendingOrderSortingFunctionalityOfEmailAddress();
		test = extent.createTest(this.getClass().getName()
				+ ": This method is used to verify the decending sorting functionality of EmailAddress.");
		Assert.assertTrue(flag);
	}

	@Test(description = "This method is used to verify the Ascending sorting functionality of Region.")
	public void verifyAscendingOrderSortingFunctionalityOfRegion() throws IOException, InterruptedException {
		flag = employeesearch.verifyAscendingOrderSortingFunctionalityOfRegion();
		test = extent.createTest(this.getClass().getName()
				+ ": This method is used to verify the Ascending sorting functionality of Region.");
		Assert.assertTrue(flag);
	}

	@Test(description = "This method is used to verify the decending sorting functionality of Region")
	public void verifyDecendingOrderSortingFunctionalityOfRegion() throws IOException, InterruptedException {
		flag = employeesearch.verifyDecendingOrderSortingFunctionalityOfRegion();
		test = extent.createTest(this.getClass().getName()
				+ ": This method is used to verify the decending sorting functionality of Region.");
		Assert.assertTrue(flag);
	}
  
	@Test(description = "This method is used to verify the client pagination functionality.")
	public void verifyClientPaginationFunctionalitySA() throws IOException, InterruptedException {
		flag = programmanagementfunction.verifyPaginationFunctionalitySA();
		test = extent.createTest(this.getClass().getName() + ": This method is used to verify the Client pagination functionality.");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to verify the Ascending sorting functionality of First Name.")
	public void verifyAscendingOrderSortingFunctionalityOfFirstNameSA() throws IOException, InterruptedException {
		flag = programmanagementfunction.verifyAscendingOrderSortingFunctionalityOfFirstNameSA();
		test = extent.createTest(this.getClass().getName()
				+ ": This method is used to verify the Ascending sorting functionality of Last Name.");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to verify the decending sorting functionality of First Name")
	public void verifyDecendingOrderSortingFunctionalityOfFirstNameSA() throws IOException, InterruptedException {
		flag = programmanagementfunction.verifyDecendingOrderSortingFunctionalityOfFirstNameSA();
		test = extent.createTest(this.getClass().getName()
				+ ": This method is used to verify the decending sorting functionality of First Name.");
		Assert.assertTrue(flag);
	}

	@Test(description = "This method is used to verify the Ascending sorting functionality of Last Name.")
	public void verifyAscendingOrderSortingFunctionalityOfLastNameSA() throws IOException, InterruptedException {
		flag = programmanagementfunction.verifyAscendingOrderSortingFunctionalityOfLastNameSA();
		test = extent.createTest(this.getClass().getName()
				+ ": This method is used to verify the Ascending sorting functionality of Last Name.");
		Assert.assertTrue(flag);
	}

	@Test(description = "This method is used to verify the decending sorting functionality of Last Name")
	public void verifyDecendingOrderSortingFunctionalityOfLastNameSA() throws IOException, InterruptedException {
		flag = programmanagementfunction.verifyDecendingOrderSortingFunctionalityOfLastNameSA();
		test = extent.createTest(this.getClass().getName()
				+ ": This method is used to verify the decending sorting functionality of Last Name.");
		Assert.assertTrue(flag);
	}

	@Test(description = "This method is used to verify the Ascending sorting functionality of EmailAddress.")
	public void verifyAscendingOrderSortingFunctionalityOfDOESA() throws IOException, InterruptedException {
		flag = programmanagementfunction.verifyAscendingOrderSortingFunctionalityOfDOESA();
		test = extent.createTest(this.getClass().getName()
				+ ": This method is used to verify the Ascending sorting functionality of EmailAddress.");
		Assert.assertTrue(flag);
	}

	@Test(description = "This method is used to verify the decending sorting functionality of EmailAddress")
	public void verifyDecendingOrderSortingFunctionalityOfDOESA() throws IOException, InterruptedException {
		flag = programmanagementfunction.verifyDecendingOrderSortingFunctionalityOfDOESA();
		test = extent.createTest(this.getClass().getName()
				+ ": This method is used to verify the decending sorting functionality of EmailAddress.");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to verify the client pagination functionality.")
	public void verifyClientPaginationFunctionalityEE() throws IOException, InterruptedException {
		flag = programmanagementfunction.verifyPaginationFunctionalityEE();
		test = extent.createTest(this.getClass().getName() + ": This method is used to verify the Client pagination functionality.");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to verify the Ascending sorting functionality of First Name.")
	public void verifyAscendingOrderSortingFunctionalityOfFirstNameEE() throws IOException, InterruptedException {
		flag = programmanagementfunction.verifyAscendingOrderSortingFunctionalityOfFirstNameEE();
		test = extent.createTest(this.getClass().getName()
				+ ": This method is used to verify the Ascending sorting functionality of First Name.");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to verify the decending sorting functionality of Last Name")
	public void verifyDecendingOrderSortingFunctionalityOfFirstNameEE() throws IOException, InterruptedException {
		flag = programmanagementfunction.verifyDecendingOrderSortingFunctionalityOfFirstNameEE();
		test = extent.createTest(this.getClass().getName()
				+ ": This method is used to verify the decending sorting functionality of Last Name.");
		Assert.assertTrue(flag);
	}

	@Test(description = "This method is used to verify the Ascending sorting functionality of Last Name.")
	public void verifyAscendingOrderSortingFunctionalityOfLastNameEE() throws IOException, InterruptedException {
		flag = programmanagementfunction.verifyAscendingOrderSortingFunctionalityOfLastNameEE();
		test = extent.createTest(this.getClass().getName()
				+ ": This method is used to verify the Ascending sorting functionality of Last Name.");
		Assert.assertTrue(flag);
	}

	@Test(description = "This method is used to verify the decending sorting functionality of Last Name")
	public void verifyDecendingOrderSortingFunctionalityOfLastNameEE() throws IOException, InterruptedException {
		flag = programmanagementfunction.verifyDecendingOrderSortingFunctionalityOfLastNameEE();
		test = extent.createTest(this.getClass().getName()
				+ ": This method is used to verify the decending sorting functionality of Last Name.");
		Assert.assertTrue(flag);
	}

	@Test(description = "This method is used to verify the Ascending sorting functionality of EmailAddress.")
	public void verifyAscendingOrderSortingFunctionalityOfDOEEE() throws IOException, InterruptedException {
		flag = programmanagementfunction.verifyAscendingOrderSortingFunctionalityOfDOEEE();
		test = extent.createTest(this.getClass().getName()
				+ ": This method is used to verify the Ascending sorting functionality of EmailAddress.");
		Assert.assertTrue(flag);
	}

	@Test(description = "This method is used to verify the decending sorting functionality of EmailAddress")
	public void verifyDecendingOrderSortingFunctionalityOfDOEEE() throws IOException, InterruptedException {
		flag = programmanagementfunction.verifyDecendingOrderSortingFunctionalityOfDOEEE();
		test = extent.createTest(this.getClass().getName()
				+ ": This method is used to verify the decending sorting functionality of EmailAddress.");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to verify the Ascending sorting functionality of EmailAddress.")
	public void verifyAscendingOrderSortingFunctionalityOfEvaluatorEE() throws IOException, InterruptedException {
		flag = programmanagementfunction.verifyAscendingOrderSortingFunctionalityOfEvaluatorEE();
		test = extent.createTest(this.getClass().getName()
				+ ": This method is used to verify the Ascending sorting functionality of EmailAddress.");
		Assert.assertTrue(flag);
	}

	@Test(description = "This method is used to verify the decending sorting functionality of EmailAddress")
	public void verifyDecendingOrderSortingFunctionalityOfEvaluatorEE() throws IOException, InterruptedException {
		flag = programmanagementfunction.verifyDecendingOrderSortingFunctionalityOfEvaluatorEE();
		test = extent.createTest(this.getClass().getName()
				+ ": This method is used to verify the decending sorting functionality of EmailAddress.");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to verify the Ascending sorting functionality of EmailAddress.")
	public void verifyAscendingOrderSortingFunctionalityOfStatusEE() throws IOException, InterruptedException {
		flag = programmanagementfunction.verifyAscendingOrderSortingFunctionalityOfStatusEE();
		test = extent.createTest(this.getClass().getName()
				+ ": This method is used to verify the Ascending sorting functionality of EmailAddress.");
		Assert.assertTrue(flag);
	}

	@Test(description = "This method is used to verify the decending sorting functionality of EmailAddress")
	public void verifyDecendingOrderSortingFunctionalityOfStatusEE() throws IOException, InterruptedException {
		flag = programmanagementfunction.verifyDecendingOrderSortingFunctionalityOfStatusEE();
		test = extent.createTest(this.getClass().getName()
				+ ": This method is used to verify the decending sorting functionality of EmailAddress.");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to verify the client pagination functionality.")
	public void verifyClientPaginationFunctionalityFU() throws IOException, InterruptedException {
		flag = programmanagementfunction.verifyPaginationFunctionalityFU();
		test = extent.createTest(this.getClass().getName() + ": This method is used to verify the Client pagination functionality.");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to verify the Ascending sorting functionality of First Name.")
	public void verifyAscendingOrderSortingFunctionalityOfFirstNameFU() throws IOException, InterruptedException {
		flag = programmanagementfunction.verifyAscendingOrderSortingFunctionalityOfFirstNameFU();
		test = extent.createTest(this.getClass().getName()
				+ ": This method is used to verify the Ascending sorting functionality of First Name.");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to verify the decending sorting functionality of First Name")
	public void verifyDecendingOrderSortingFunctionalityOfFirstNameFU() throws IOException, InterruptedException {
		flag = programmanagementfunction.verifyDecendingOrderSortingFunctionalityOfFirstNameFU();
		test = extent.createTest(this.getClass().getName()
				+ ": This method is used to verify the decending sorting functionality of First Name.");
		Assert.assertTrue(flag);
	}

	@Test(description = "This method is used to verify the Ascending sorting functionality of Last Name.")
	public void verifyAscendingOrderSortingFunctionalityOfLastNameFU() throws IOException, InterruptedException {
		flag = programmanagementfunction.verifyAscendingOrderSortingFunctionalityOfLastNameFU();
		test = extent.createTest(this.getClass().getName()
				+ ": This method is used to verify the Ascending sorting functionality of Last Name.");
		Assert.assertTrue(flag);
	}

	@Test(description = "This method is used to verify the decending sorting functionality of Last Name")
	public void verifyDecendingOrderSortingFunctionalityOfLastNameFU() throws IOException, InterruptedException {
		flag = programmanagementfunction.verifyDecendingOrderSortingFunctionalityOfLastNameFU();
		test = extent.createTest(this.getClass().getName()
				+ ": This method is used to verify the decending sorting functionality of Last Name.");
		Assert.assertTrue(flag);
	}

	@Test(description = "This method is used to verify the Ascending sorting functionality of EmailAddress.")
	public void verifyAscendingOrderSortingFunctionalityOfDOEFU() throws IOException, InterruptedException {
		flag = programmanagementfunction.verifyAscendingOrderSortingFunctionalityOfDOEFU();
		test = extent.createTest(this.getClass().getName()
				+ ": This method is used to verify the Ascending sorting functionality of EmailAddress.");
		Assert.assertTrue(flag);
	}

	@Test(description = "This method is used to verify the decending sorting functionality of EmailAddress")
	public void verifyDecendingOrderSortingFunctionalityOfDOEFU() throws IOException, InterruptedException {
		flag = programmanagementfunction.verifyDecendingOrderSortingFunctionalityOfDOEFU();
		test = extent.createTest(this.getClass().getName()
				+ ": This method is used to verify the decending sorting functionality of EmailAddress.");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to verify the client pagination functionality.")
	public void verifyClientPaginationFunctionalitySRF() throws IOException, InterruptedException {
		flag = programmanagementfunction.verifyPaginationFunctionalitySRF();
		test = extent.createTest(this.getClass().getName() + ": This method is used to verify the Client pagination functionality.");
		Assert.assertTrue(flag);
	}

	@Test(description = "This method is used to verify the Ascending sorting functionality of First Name.")
	public void verifyAscendingOrderSortingFunctionalityOfFirstNameSRF() throws IOException, InterruptedException {
		flag = programmanagementfunction.verifyAscendingOrderSortingFunctionalityOfFirstNameSRF();
		test = extent.createTest(this.getClass().getName()
				+ ": This method is used to verify the Ascending sorting functionality of Last Name.");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to verify the decending sorting functionality of First Name")
	public void verifyDecendingOrderSortingFunctionalityOfFirstNameSRF() throws IOException, InterruptedException {
		flag = programmanagementfunction.verifyDecendingOrderSortingFunctionalityOfFirstNameSRF();
		test = extent.createTest(this.getClass().getName()
				+ ": This method is used to verify the decending sorting functionality of First Name.");
		Assert.assertTrue(flag);
	}

	@Test(description = "This method is used to verify the Ascending sorting functionality of Last Name.")
	public void verifyAscendingOrderSortingFunctionalityOfLastNameSRF() throws IOException, InterruptedException {
		flag = programmanagementfunction.verifyAscendingOrderSortingFunctionalityOfLastNameSRF();
		test = extent.createTest(this.getClass().getName()
				+ ": This method is used to verify the Ascending sorting functionality of Last Name.");
		Assert.assertTrue(flag);
	}

	@Test(description = "This method is used to verify the decending sorting functionality of Last Name")
	public void verifyDecendingOrderSortingFunctionalityOfLastNameSRF() throws IOException, InterruptedException {
		flag = programmanagementfunction.verifyDecendingOrderSortingFunctionalityOfLastNameSRF();
		test = extent.createTest(this.getClass().getName()
				+ ": This method is used to verify the decending sorting functionality of Last Name.");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to verify the Ascending sorting functionality of Date of Request.")
	public void verifyAscendingOrderSortingFunctionalityOfDOESRF() throws IOException, InterruptedException {
		flag = programmanagementfunction.verifyAscendingOrderSortingFunctionalityOfDOESRF();
		test = extent.createTest(this.getClass().getName()
				+ ": This method is used to verify the Ascending sorting functionality of Date of Request.");
		Assert.assertTrue(flag);
	}

	@Test(description = "This method is used to verify the decending sorting functionality of Date of Request")
	public void verifyDecendingOrderSortingFunctionalityOfDOESRF() throws IOException, InterruptedException {
		flag = programmanagementfunction.verifyDecendingOrderSortingFunctionalityOfDOESRF();
		test = extent.createTest(this.getClass().getName()
				+ ": This method is used to verify the decending sorting functionality of Date of Request.");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to verify the Ascending sorting functionality of Status.")
	public void verifyAscendingOrderSortingFunctionalityOfStatusSRF() throws IOException, InterruptedException {
		flag = programmanagementfunction.verifyAscendingOrderSortingFunctionalityOfStatusSRF();
		test = extent.createTest(this.getClass().getName()
				+ ": This method is used to verify the Ascending sorting functionality of Status.");
		Assert.assertTrue(flag);
	}

	@Test(description = "This method is used to verify the decending sorting functionality of Status")
	public void verifyDecendingOrderSortingFunctionalityOfStatusSRF() throws IOException, InterruptedException {
		flag = programmanagementfunction.verifyAscendingOrderSortingFunctionalityOfStatusSRF();
		test = extent.createTest(this.getClass().getName()
				+ ": This method is used to verify the decending sorting functionality of Status.");
		Assert.assertTrue(flag);
	}
	
	@AfterClass(alwaysRun = true)
	public void afterClass() throws IOException {
		webDB.tearDown();
	}
}
