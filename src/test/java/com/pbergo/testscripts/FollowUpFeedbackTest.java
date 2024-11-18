package com.pbergo.testscripts;

import org.testng.annotations.Test;

import com.pbergo.base.ExtentReportBase;
import com.pbergo.base.WebDriverBase;
import com.pbergo.commonfunctions.ErgoEvalActivityFunctions;
import com.pbergo.commonfunctions.FollowUpFeedbackFunctions;
import com.pbergo.commonfunctions.ProgramOverviewFunctions;
import com.pbergo.commonfunctions.SelfAssessmentFunctions;
//import com.pbergo.commonfunctions.BuildABoxFunctions;
import com.pbergo.commonfunctions.UIBasicFunctions;
import com.pbergo.commonfunctions.UsersFunctions;
import com.pbergo.locators.ErgoEvalActivityLocators;
import com.pbergo.locators.ProgramOverviewLocators;
//import com.pbergo.locators.BuildABoxLocators;
//import com.pbergo.locators.HeaderSectionLocators;
import com.relevantcodes.extentreports.ExtentReports;
import org.testng.annotations.BeforeClass;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

/**
 * @author gwl
 *
 */
public class FollowUpFeedbackTest extends ExtentReportBase {
	private WebDriverBase webDB;
	private UIBasicFunctions uibasicfunctions;
	private FollowUpFeedbackFunctions followupfeedbackfunctions;
	
	

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
		followupfeedbackfunctions = new FollowUpFeedbackFunctions(webDB);
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
		flag = uibasicfunctions.openEmployeeDashboard(ErgoEvalActivityLocators.ELMNT_ERGO_EVAL_ACTIVITY_LEFTSIDEPANEL);
		test = extent.createTest(this.getClass().getName() + ": This method is used to Open the employee dashboard");
		Assert.assertTrue(flag);
	}

	@Test(description = "This method is used to Select the follow up page page from left side panel.")
	public void verifyOpenFollowUpFeedback() throws IOException, InterruptedException {
		flag = followupfeedbackfunctions.openFollowUpFeedbackLink();
		test = extent.createTest(
				this.getClass().getName() + ": This method is used to Select the follow up page page from left side panel.");
		Assert.assertTrue(flag);
	}


	@Test(description = "This method is used to download doccument of all self assessment helpful from follow up feedback dashboard")
	public void clickDownloadDocumentSelfAssessmentHelpful() throws IOException, InterruptedException {
		flag = followupfeedbackfunctions.downloadDocumentForSelfAssessmentHelpful();
		test = extent.createTest(
				this.getClass().getName() + ": This method is used to download doccument of all self assessment helpful from follow up feedback dashboard");
		Assert.assertTrue(flag);
	}

	@Test(description = "This method is used to download image of all self assessment helpful from follow up feedback dashboard")
	public void clickDownloadImageFromSelfAssessmentHelpful() throws IOException, InterruptedException {
		flag = followupfeedbackfunctions.downloadImageForSelfAssessmentHelpful();
		test = extent.createTest(
				this.getClass().getName() + ": This method is used to download image of all self assessment helpful from follow up feedback dashboard");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to download doccument of all Eval helpful from follow up feedback dashboard")
	public void clickDownloadDocumentEvalHelpful() throws IOException, InterruptedException {
		flag = followupfeedbackfunctions.downloadDocumentForEvalHelpful();
		test = extent.createTest(
				this.getClass().getName() + ": This method is used to download doccument of all Eval helpful from follow up feedback dashboard");
		Assert.assertTrue(flag);
	}

	@Test(description = "This method is used to download image of all Eval helpful from follow up feedback dashboard")
	public void clickDownloadImageFromEvalHelpful() throws IOException, InterruptedException {
		flag = followupfeedbackfunctions.downloadImageForEvalHelpful();
		test = extent.createTest(
				this.getClass().getName() + ": This method is used to download image of all Eval helpful from follow up feedback dashboard");
		Assert.assertTrue(flag);
	}
	

	@Test(description = "This method is used to download image of all pecentage from reported improvement from follow up feedback dashboard")
	public void clickDownloadImagePercentageFromReportedImprovement() throws IOException, InterruptedException {
		flag = followupfeedbackfunctions.downloadImagePercentageFromReportedImprovement();
		test = extent.createTest(
				this.getClass().getName() + ": This method is used to download image of all pecentage from reported improvement from follow up feedback dashboard");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to download doccument of all pecentage from reported improvement from follow up feedback dashboard")
	public void clickDownloadDocumentPercentageFromReportedImprovement() throws IOException, InterruptedException {
		flag = followupfeedbackfunctions.downloadDocumentPercentageFromReportedImprovement();
		test = extent.createTest(
				this.getClass().getName() + ": This method is used to download doccument of all pecentage from reported improvement from follow up feedback dashboard");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to download image of all hash from reported improvement from follow up feedback dashboard")
	public void clickDownloadImageHashFromReportedImprovement() throws IOException, InterruptedException {
		flag = followupfeedbackfunctions.downloadImageHashFromReportedImprovement();
		test = extent.createTest(
				this.getClass().getName() + ": This method is used to download image of all hash from reported improvement from follow up feedback dashboard");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to download doccument of all hash from reported improvement from follow up feedback dashboard")
	public void clickDownloadDocumentHashFromReportedImprovement() throws IOException, InterruptedException {
		flag = followupfeedbackfunctions.downloadDocumentHashFromReportedImprovement();
		test = extent.createTest(
				this.getClass().getName() + ": This method is used to download doccument of all hash from reported improvement from follow up feedback dashboard");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to download image of all aggregate response from follow up feedback dashboard")
	public void clickDownloadImageAggregateResponse() throws IOException, InterruptedException {
		flag = followupfeedbackfunctions.downloadImageForAggregateResponse();
		test = extent.createTest(
				this.getClass().getName() + ": This method is used to download image of all aggregate response from follow up feedback dashboard");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to download doccument of all aggregate response from follow up feedback dashboard")
	public void clickDownloadDocumentAggregateResponse() throws IOException, InterruptedException {
		flag = followupfeedbackfunctions.downloadDoccumentForAggregateResponse();
		test = extent.createTest(
				this.getClass().getName() + ": This method is used to download doccument of all aggregate response from follow up feedback dashboard");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to download doccument of all further assistence needed from follow up feedback dashboard")
	public void clickDownloadDocumentFromFurtherAssistenceNeeded() throws IOException, InterruptedException {
		flag = followupfeedbackfunctions.downloadDoccumentPercentageFromFurtherAssistenceNeeded();
		test = extent.createTest(
				this.getClass().getName() + ": This method is used to download doccument of all further assistence needed from follow up feedback dashboard");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to download image of all further assistence needed from follow up feedback dashboard")
	public void clickDownloadImageFromFurtherAssistenceNeeded() throws IOException, InterruptedException {
		flag = followupfeedbackfunctions.downloadImagePercentageFromFurtherAssistenceNeeded();
		test = extent.createTest(
				this.getClass().getName() + ": This method is used to download image of all further assistence needed from follow up feedback dashboard");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to download hash image of all further assistence needed from follow up feedback dashboard")
	public void clickDownloadHashImageFromFurtherAssistenceNeeded() throws IOException, InterruptedException {
		flag = followupfeedbackfunctions.downloadImageHashFromFurtherAssistenceNeeded();
		test = extent.createTest(
				this.getClass().getName() + ": This method is used to download hash image of all further assistence needed from follow up feedback dashboard");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to download hash doccument of all further assistence needed from follow up feedback dashboard")
	public void clickDownloadHashDoccumentFromFurtherAssistenceNeeded() throws IOException, InterruptedException {
		flag = followupfeedbackfunctions.downloadDocumentHashFromFurtherAssistenceNeeded();
		test = extent.createTest(
				this.getClass().getName() + ": This method is used to download hash doccument of all further assistence needed from follow up feedback dashboard");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to verify the pagination functionality.")
	public void verifyPaginationFunctionality() throws IOException, InterruptedException {
		flag = followupfeedbackfunctions.verifyPaginationFunctionality();
		test = extent.createTest(this.getClass().getName() + ": This method is used to verify the pagination functionality.");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to verify the Ascending sorting functionality of First Name.")
	public void verifyAscendingOrderSortingFunctionalityOfFirstName() throws IOException, InterruptedException {
		flag = followupfeedbackfunctions.verifyAscendingOrderSortingFunctionalityOfFirstName();
		test = extent.createTest(this.getClass().getName() + ": This method is used to verify the Ascending sorting functionality of First Name.");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to verify the decending sorting functionality of First Name")
	public void verifyDecendingOrderSortingFunctionalityOfFirstName() throws IOException, InterruptedException {
		flag = followupfeedbackfunctions.verifyDecendingOrderSortingFunctionalityOfFirstName();
		test = extent.createTest(this.getClass().getName() + ": This method is used to verify the decending sorting functionality of First Name.");
		Assert.assertTrue(flag);
	}
	

	@Test(description = "This method is used to verify the Ascending sorting functionality of Last Name.")
	public void verifyAscendingOrderSortingFunctionalityOfLastName() throws IOException, InterruptedException {
		flag = followupfeedbackfunctions.verifyAscendingOrderSortingFunctionalityOfLastName();
		test = extent.createTest(this.getClass().getName() + ": This method is used to verify the Ascending sorting functionality of Last Name.");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to verify the decending sorting functionality of Last Name")
	public void verifyDecendingOrderSortingFunctionalityOfLastName() throws IOException, InterruptedException {
		flag = followupfeedbackfunctions.verifyDecendingOrderSortingFunctionalityOfLastName();
		test = extent.createTest(this.getClass().getName() + ": This method is used to verify the decending sorting functionality of Last Name.");
		Assert.assertTrue(flag);
	}
	

	@Test(description = "This method is used to verify the Ascending sorting functionality of EmailAddress.")
	public void verifyAscendingOrderSortingFunctionalityOfEmailAddress() throws IOException, InterruptedException {
		flag = followupfeedbackfunctions.verifyAscendingOrderSortingFunctionalityOfEmailAddress();
		test = extent.createTest(this.getClass().getName() + ": This method is used to verify the Ascending sorting functionality of EmailAddress.");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to verify the decending sorting functionality of EmailAddress")
	public void verifyDecendingOrderSortingFunctionalityOfEmailAddress() throws IOException, InterruptedException {
		flag = followupfeedbackfunctions.verifyDecendingOrderSortingFunctionalityOfEmailAddress();
		test = extent.createTest(this.getClass().getName() + ": This method is used to verify the decending sorting functionality of EmailAddress.");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to verify the Ascending sorting functionality of Region.")
	public void verifyAscendingOrderSortingFunctionalityOfRegion() throws IOException, InterruptedException {
		flag = followupfeedbackfunctions.verifyAscendingOrderSortingFunctionalityOfRegion();
		test = extent.createTest(this.getClass().getName() + ": This method is used to verify the Ascending sorting functionality of Region.");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to verify the decending sorting functionality of Region")
	public void verifyDecendingOrderSortingFunctionalityOfRegion() throws IOException, InterruptedException {
		flag = followupfeedbackfunctions.verifyDecendingOrderSortingFunctionalityOfRegion();
		test = extent.createTest(this.getClass().getName() + ": This method is used to verify the decending sorting functionality of Region.");
		Assert.assertTrue(flag);
	}
	

	@Test(description = "This method is used to verify the Ascending sorting functionality of DateofFollowUp.")
	public void verifyAscendingOrderSortingFunctionalityOfDateofFollowUp() throws IOException, InterruptedException {
		flag = followupfeedbackfunctions.verifyAscendingOrderSortingFunctionalityOfDateofFollowUp();
		test = extent.createTest(this.getClass().getName() + ": This method is used to verify the Ascending sorting functionality of DateofFollowUp.");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to verify the decending sorting functionality of DateofFollowUp")
	public void verifyDecendingOrderSortingFunctionalityOfDateofFollowUp() throws IOException, InterruptedException {
		flag = followupfeedbackfunctions.verifyDecendingOrderSortingFunctionalityOfDateofFollowUp();
		test = extent.createTest(this.getClass().getName() + ": This method is used to verify the decending sorting functionality of DateofFollowUp.");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to verify the date filter functionality.")
	public void verifyDateFilterFunctionality() throws IOException, InterruptedException {
		flag = followupfeedbackfunctions.verifyDateFilterFunctionality();
		test = extent.createTest(this.getClass().getName() + ": This method is used to verify the date filter functionality.");
		Assert.assertTrue(flag);
	}

	@AfterClass(alwaysRun = true)
	public void afterClass() throws IOException {
		webDB.tearDown();
	}
}
