package com.pbergo.testscripts;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pbergo.base.ExtentReportBase;
import com.pbergo.base.WebDriverBase;
import com.pbergo.commonfunctions.EvaluatorFunctions;
//import com.pbergo.commonfunctions.BuildABoxFunctions;
import com.pbergo.commonfunctions.UIBasicFunctions;
import com.pbergo.locators.EvaluatorLocators;

/**
 * @author gwl
 *
 */
public class EvaluatorTest extends ExtentReportBase {
	private WebDriverBase webDB;
	private UIBasicFunctions uibasicfunctions;
	private EvaluatorFunctions evaluatorfunction;

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
		evaluatorfunction = new EvaluatorFunctions(webDB);
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

	@Test(description = "This method is used to optn the evaluator dashboard page from left side panel.")
	public void verifyOpenEvaluator() throws IOException, InterruptedException {
		flag = evaluatorfunction.openEvaluatorLink();
		test = extent.createTest(
				this.getClass().getName() + ": This method is used to optn the evaluator dashboard page from left side panel.");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used verify the Reports in review search filter functionality")
	public void verifyReportsInReviewSearchFunctionality() throws IOException, InterruptedException {
		
			flag = evaluatorfunction.verifyReportsInReviewSearchFunctionality();
		
		test = extent.createTest(
				this.getClass().getName() + ": This method is used verify the Reports in review search filter functionality");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used verify the Reports in review Status filter functionality")
	public void verifyReportsInReviewStatusFilterFunctionality() throws IOException, InterruptedException {
			flag = evaluatorfunction.verifyReportsInReviewStatusFilterFunctionality();
		
		test = extent.createTest(
				this.getClass().getName() + ": This method is used verify the Reports in review Status filter functionality");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used verify the Reports in review download dataset functionality")
	public void verifyReportsInReviewDownloadDatasetFunctionality() throws IOException, InterruptedException, AWTException {
			flag = evaluatorfunction.verifyReportsInReviewDownloadDatasetFunctionality();
		
		test = extent.createTest(
				this.getClass().getName() + ": This method is used verify the Reports in review download dataset functionality");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used verify the Reports in review add comment functionality")
	public void verifyReportsInReviewAddCommentFunctionality() throws IOException, InterruptedException {
			flag = evaluatorfunction.verifyReportsInReviewAddCommentFunctionality();
		
		test = extent.createTest(
				this.getClass().getName() + ": This method is used verify the Reports in review add comment functionality");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used verify the Reports in review History functionality")
	public void verifyReportsInReviewHistoryFunctionality() throws IOException, InterruptedException {
			flag = evaluatorfunction.verifyReportsInReviewHistoryFunctionality();
		
		test = extent.createTest(
				this.getClass().getName() + ": This method is used verify the Reports in review History functionality");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used verify the Reports in review edit survey functionality")
	public void verifyReportsInReviewEditSurveyReportFunctionality() throws IOException, InterruptedException, AWTException {
			flag = evaluatorfunction.verifyReportsInReviewEditSurveyReportFunctionality();
		
		test = extent.createTest(
				this.getClass().getName() + ": This method is used verify the Reports in review edit survey functionality");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used verify the search functionality")
	public void verifySearchFunctionality() throws IOException, InterruptedException, AWTException {
			flag = evaluatorfunction.verifySearchFunctionality();
		
		test = extent.createTest(
				this.getClass().getName() + ": This method is used verify the search functionality");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used verify the client view button functionality")
	public void verifyClientViewBtnFunctionality() throws IOException, InterruptedException, AWTException {
			flag = evaluatorfunction.verifyClientViewBtnFunctionality();
		
		test = extent.createTest(
				this.getClass().getName() + ": This method is used verify the client view button functionality");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to verify the client pagination functionality.")
	public void verifyClientPaginationFunctionality() throws IOException, InterruptedException {
		flag = evaluatorfunction.verifyClientsPaginationFunctionality();
		test = extent.createTest(this.getClass().getName() + ": This method is used to verify the Client pagination functionality.");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to verify the Ascending sorting functionality of Client Name.")
	public void verifyAscendingOrderSortingFunctionalityOfClienttName() throws IOException, InterruptedException {
		flag = evaluatorfunction.verifyAscendingOrderSortingFunctionalityOfClienttName();
		test = extent.createTest(this.getClass().getName() + ": This method is used to verify the Ascending sorting functionality of Client Name.");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to verify the decending sorting functionality of Client Name")
	public void verifyDecendingOrderSortingFunctionalityOfClientName() throws IOException, InterruptedException {
		flag = evaluatorfunction.verifyDecendingOrderSortingFunctionalityOfClientName();
		test = extent.createTest(this.getClass().getName() + ": This method is used to verify the decending sorting functionality of Client Name.");
		Assert.assertTrue(flag);
	}


	@Test(description = "This method is used to verify the Ascending sorting functionality of Status.")
	public void verifyAscendingOrderSortingFunctionalityOfStatus() throws IOException, InterruptedException {
		flag = evaluatorfunction.verifyAscendingOrderSortingFunctionalityOfStatus();
		test = extent.createTest(this.getClass().getName() + ": This method is used to verify the Ascending sorting functionality of Status.");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to verify the decending sorting functionality of Status")
	public void verifyDecendingOrderSortingFunctionalityOfStatus() throws IOException, InterruptedException {
		flag = evaluatorfunction.verifyDecendingOrderSortingFunctionalityOfStatus();
		test = extent.createTest(this.getClass().getName() + ": This method is used to verify the decending sorting functionality of Status.");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to verify the Report and review pagination functionality.")
	public void verifyReportsReviewPaginationFunctionality() throws IOException, InterruptedException {
		flag = evaluatorfunction.verifyReportsReviewPaginationFunctionality();
		test = extent.createTest(this.getClass().getName() + ": This method is used to verify the reports and review pagination functionality.");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to verify the Ascending sorting functionality of Date of Eval.")
	public void verifyAscendingOrderSortingFunctionalityOfDateofEval() throws IOException, InterruptedException {
		flag = evaluatorfunction.verifyAscendingOrderSortingFunctionalityOfDateofEval();
		test = extent.createTest(this.getClass().getName() + ": This method is used to verify the Ascending sorting functionality of Date of Eval.");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to verify the decending sorting functionality of Date of Eval")
	public void verifyDecendingOrderSortingFunctionalityOfDateofEval() throws IOException, InterruptedException {
		flag = evaluatorfunction.verifyDecendingOrderSortingFunctionalityOfDateofEval();
		test = extent.createTest(this.getClass().getName() + ": This method is used to verify the decending sorting functionality of Date of Eval.");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to verify the Ascending sorting functionality of First Name.")
	public void verifyAscendingOrderSortingFunctionalityOfFirstName() throws IOException, InterruptedException {
		flag = evaluatorfunction.verifyAscendingOrderSortingFunctionalityOfFirstName();
		test = extent.createTest(this.getClass().getName() + ": This method is used to verify the Ascending sorting functionality of First Name.");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to verify the decending sorting functionality of First Name")
	public void verifyDecendingOrderSortingFunctionalityOfFirstName() throws IOException, InterruptedException {
		flag = evaluatorfunction.verifyDecendingOrderSortingFunctionalityOfFirstName();
		test = extent.createTest(this.getClass().getName() + ": This method is used to verify the decending sorting functionality of First Name.");
		Assert.assertTrue(flag);
	}
	

	@Test(description = "This method is used to verify the date filter functionality.")
	public void verifyDateFilterFunctionality() throws IOException, InterruptedException {
		flag = evaluatorfunction.verifyDateFilterFunctionality();
		test = extent.createTest(this.getClass().getName() + ": This method is used to verify the date filter functionality.");
		Assert.assertTrue(flag);
	}

	@Test(description = "This method is used to verify the Ascending sorting functionality of Last Name.")
	public void verifyAscendingOrderSortingFunctionalityOfLastName() throws IOException, InterruptedException {
		flag = evaluatorfunction.verifyAscendingOrderSortingFunctionalityOfLastName();
		test = extent.createTest(this.getClass().getName() + ": This method is used to verify the Ascending sorting functionality of Last Name.");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to verify the decending sorting functionality of Last Name")
	public void verifyDecendingOrderSortingFunctionalityOfLastName() throws IOException, InterruptedException {
		flag = evaluatorfunction.verifyDecendingOrderSortingFunctionalityOfLastName();
		test = extent.createTest(this.getClass().getName() + ": This method is used to verify the decending sorting functionality of Last Name.");
		Assert.assertTrue(flag);
	}
	

	@Test(description = "This method is used to verify the Ascending sorting functionality of EmailAddress.")
	public void verifyAscendingOrderSortingFunctionalityOfEmailAddress() throws IOException, InterruptedException {
		flag = evaluatorfunction.verifyAscendingOrderSortingFunctionalityOfEmailAddress();
		test = extent.createTest(this.getClass().getName() + ": This method is used to verify the Ascending sorting functionality of EmailAddress.");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to verify the decending sorting functionality of EmailAddress")
	public void verifyDecendingOrderSortingFunctionalityOfEmailAddress() throws IOException, InterruptedException {
		flag = evaluatorfunction.verifyDecendingOrderSortingFunctionalityOfEmailAddress();
		test = extent.createTest(this.getClass().getName() + ": This method is used to verify the decending sorting functionality of EmailAddress.");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to verify the Ascending sorting functionality of Client Name.")
	public void verifyAscendingOrderSortingFunctionalityOfClient() throws IOException, InterruptedException {
		flag = evaluatorfunction.verifyAscendingOrderSortingFunctionalityOfClienttName();
		test = extent.createTest(this.getClass().getName() + ": This method is used to verify the Ascending sorting functionality of Client Name.");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to verify the decending sorting functionality of Client ")
	public void verifyDecendingOrderSortingFunctionalityOfClient() throws IOException, InterruptedException {
		flag = evaluatorfunction.verifyDecendingOrderSortingFunctionalityOfClient();
		test = extent.createTest(this.getClass().getName() + ": This method is used to verify the decending sorting functionality of Client .");
		Assert.assertTrue(flag);
	}

	@Test(description = "This method is used to verify the Ascending sorting functionality of RRStatus.")
	public void verifyAscendingOrderSortingFunctionalityOfRRStatus() throws IOException, InterruptedException {
		flag = evaluatorfunction.verifyAscendingOrderSortingFunctionalityOfRRStatus();
		test = extent.createTest(this.getClass().getName() + ": This method is used to verify the Ascending sorting functionality of RRStatus.");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to verify the decending sorting functionality of RRStatus")
	public void verifyDecendingOrderSortingFunctionalityOfRRStatus() throws IOException, InterruptedException {
		flag = evaluatorfunction.verifyDecendingOrderSortingFunctionalityOfRRStatus();
		test = extent.createTest(this.getClass().getName() + ": This method is used to verify the decending sorting functionality of RRStatus.");
		Assert.assertTrue(flag);
	}

	@AfterClass(alwaysRun = true)
	public void afterClass() throws IOException {
		webDB.tearDown();
	}
}
