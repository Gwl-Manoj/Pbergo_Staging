package com.pbergo.testscripts;

import org.testng.annotations.Test;

import com.pbergo.base.ExtentReportBase;
import com.pbergo.base.WebDriverBase;
import com.pbergo.commonfunctions.ErgoEvalActivityFunctions;
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
 * @author Navin
 *
 */
public class ErgoEvalActivityTest extends ExtentReportBase {
	private WebDriverBase webDB;
	private UIBasicFunctions uibasicfunctions;
	private ErgoEvalActivityFunctions ergoevalfunctions;

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
		ergoevalfunctions = new ErgoEvalActivityFunctions(webDB);
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

	@Test(description = "This method is used to open Ergo eval activity.")
	public void verifyOpenErgoEvalActivity() throws IOException, InterruptedException {
		flag = ergoevalfunctions.openErgoEvalActivityLink();
		test = extent.createTest(this.getClass().getName() + ": This method is used to open Ergo eval activity.");
		Assert.assertTrue(flag);
	}

	@Test(description = "This method is used to download the doccuments of Self Reported Discomfort from the Ergo Eval")
	public void clickDownloadDocumentSelfReportedDiscomfort() throws IOException, InterruptedException {
		flag = ergoevalfunctions.downloadDocumentForSelfReportedDiscomfort();
		test = extent.createTest(
				this.getClass().getName() + ": This method is used to download the doccuments of Self Reported Discomfort from the Ergo Eval");
		Assert.assertTrue(flag);
	}

	@Test(description = "This method is used to download the image of Self Reported Discomfort from the Ergo Eval")
	public void clickDownloadImageFromSelfReportedDiscomfort() throws IOException, InterruptedException {
		flag = ergoevalfunctions.downloadImageForSelfReportedDiscomfort();
		test = extent.createTest(
				this.getClass().getName() + ": This method is used to download the image of Self Reported Discomfort from the Ergo Eval");
		Assert.assertTrue(flag);
	}

	@Test(description = "This method is used to download the doccuments For EquiRecommandations from the Ergo Eval")
	public void clickDownloadDocumentEquiRecommandations() throws IOException, InterruptedException {
		flag = ergoevalfunctions.downloadDocumentForEquiRecommandations();
		test = extent.createTest(
				this.getClass().getName() + ": This method is used to download the doccuments For EquiRecommandations from the Ergo Eval");
		Assert.assertTrue(flag);
	}

	@Test(description = "This method is used to download the image For EquiRecommandations from the Ergo Eval")
	public void clickDownloadImageFromEquiRecommandation() throws IOException, InterruptedException {
		flag = ergoevalfunctions.downloadImageForEquiRecommandations();
		test = extent.createTest(
				this.getClass().getName() + ": This method is used to download the image For EquiRecommandations from the Ergo Eval");
		Assert.assertTrue(flag);
	}

	@Test(description = "This method is used to download the Image From Work Area Assessed from the Ergo Eval")
	public void clickDownloadImageFromWorkAreaAssessed() throws IOException, InterruptedException {
		flag = ergoevalfunctions.downloadImageForWorkAreaAssessed();
		test = extent.createTest(
				this.getClass().getName() + ": This method is used to download the Image From Work Area Assessed from the Ergo Eval");
		Assert.assertTrue(flag);
	}

	@Test(description = "This method is used to download the Document From Work Area Assessed from the Ergo Eval")
	public void clickDownloadDocumentFromWorkAreaAssessed() throws IOException, InterruptedException {
		flag = ergoevalfunctions.downloadDocumentForWorkAreaAssessed();
		test = extent.createTest(
				this.getClass().getName() + ": This method is used to download the Document From Work Area Assessed from the Ergo Eval");
		Assert.assertTrue(flag);
	}

	@Test(description = "This method is used to download the ImagePercentageFromErgoEvalActivityByRegion from the Ergo Eval")
	public void clickDownloadImagePercentageFromErgoEvalActivityByRegion() throws IOException, InterruptedException {
		flag = ergoevalfunctions.downloadImagePercentageFromErgoEvalActivityByRegion();
		test = extent.createTest(
				this.getClass().getName() + ": This method is used to download the ImagePercentageFromErgoEvalActivityByRegion from the Ergo Eval");
		Assert.assertTrue(flag);
	}

	@Test(description = "This method is used to download the doccuments PercentageFromErgoEvalActivityByRegion from the Ergo Eval")
	public void clickDownloadDocumentPercentageFromErgoEvalActivityByRegion() throws IOException, InterruptedException {
		flag = ergoevalfunctions.downloadDocumentPercentageFromErgoEvalActivityByRegion();
		test = extent.createTest(
				this.getClass().getName() + ": This method is used to download the doccuments PercentageFromErgoEvalActivityByRegion from the Ergo Eval");
		Assert.assertTrue(flag);
	}

	@Test(description = "This method is used to download the doccuments from the Ergo Eval Hash Map section")
	public void clickDownloadImageHashFromSelfAssessmentActivityByRegion() throws IOException, InterruptedException {
		flag = ergoevalfunctions.downloadImageHashFromErgoEvalActivityByRegion();
		test = extent.createTest(this.getClass().getName()
				+ ": This method is used to download the doccuments from the Ergo Eval Hash Map section");
		Assert.assertTrue(flag);
	}

	@Test(description = "This method is used to download the doccuments from the Ergo Eval Hash Map section")
	public void clickDownloadDocumentHashFromErgoEvalActivityByRegion() throws IOException, InterruptedException {
		flag = ergoevalfunctions.downloadDocumentHashFromErgoEvalActivityByRegion();
		test = extent.createTest(this.getClass().getName()
				+ ": This method is used to download the doccuments from the Ergo Eval Hash Map section");
		Assert.assertTrue(flag);
	}

	@Test(description = "This method is used to verify the pagination functionality.")
	public void verifyPaginationFunctionality() throws IOException, InterruptedException {
		flag = ergoevalfunctions.verifyPaginationFunctionality();
		test = extent.createTest(
				this.getClass().getName() + ": This method is used to verify the pagination functionality.");
		Assert.assertTrue(flag);
	}

	@Test(description = "This method is used to verify the Ascending sorting functionality of user role column.")
	public void verifyAscendingOrderSortingFunctionalityOfUserRoleColumn() throws IOException, InterruptedException {
		flag = ergoevalfunctions.verifyAscendingOrderSortingFunctionalityOfUserRoleColumn();
		test = extent.createTest(this.getClass().getName()
				+ ": This method is used to verify the Ascending sorting functionality of user role column.");
		Assert.assertTrue(flag);
	}

	@Test(description = "This method is used to verify the decending sorting functionality of user role column.")
	public void verifyDecendingOrderSortingFunctionalityOfUserRoleColumn() throws IOException, InterruptedException {
		flag = ergoevalfunctions.verifyDecendingOrderSortingFunctionalityOfUserRoleColumn();
		test = extent.createTest(this.getClass().getName()
				+ ": This method is used to verify the decending sorting functionality of user role column.");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to verify the Ascending sorting functionality of First Name.")
	public void verifyAscendingOrderSortingFunctionalityOfFirstName() throws IOException, InterruptedException {
		flag = ergoevalfunctions.verifyAscendingOrderSortingFunctionalityOfFirstName();
		test = extent.createTest(this.getClass().getName() + ": This method is used to verify the Ascending sorting functionality of First Name.");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to verify the decending sorting functionality of First Name")
	public void verifyDecendingOrderSortingFunctionalityOfFirstName() throws IOException, InterruptedException {
		flag = ergoevalfunctions.verifyDecendingOrderSortingFunctionalityOfFirstName();
		test = extent.createTest(this.getClass().getName() + ": This method is used to verify the decending sorting functionality of First Name.");
		Assert.assertTrue(flag);
	}
	

	@Test(description = "This method is used to verify the Ascending sorting functionality of Last Name.")
	public void verifyAscendingOrderSortingFunctionalityOfLastName() throws IOException, InterruptedException {
		flag = ergoevalfunctions.verifyAscendingOrderSortingFunctionalityOfLastName();
		test = extent.createTest(this.getClass().getName() + ": This method is used to verify the Ascending sorting functionality of Last Name.");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to verify the decending sorting functionality of Last Name")
	public void verifyDecendingOrderSortingFunctionalityOfLastName() throws IOException, InterruptedException {
		flag = ergoevalfunctions.verifyDecendingOrderSortingFunctionalityOfLastName();
		test = extent.createTest(this.getClass().getName() + ": This method is used to verify the decending sorting functionality of Last Name.");
		Assert.assertTrue(flag);
	}
	

	@Test(description = "This method is used to verify the Ascending sorting functionality of EmailAddress.")
	public void verifyAscendingOrderSortingFunctionalityOfEmailAddress() throws IOException, InterruptedException {
		flag = ergoevalfunctions.verifyAscendingOrderSortingFunctionalityOfEmailAddress();
		test = extent.createTest(this.getClass().getName() + ": This method is used to verify the Ascending sorting functionality of EmailAddress.");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to verify the decending sorting functionality of EmailAddress")
	public void verifyDecendingOrderSortingFunctionalityOfEmailAddress() throws IOException, InterruptedException {
		flag = ergoevalfunctions.verifyDecendingOrderSortingFunctionalityOfEmailAddress();
		test = extent.createTest(this.getClass().getName() + ": This method is used to verify the decending sorting functionality of EmailAddress.");
		Assert.assertTrue(flag);
	}
	

	@Test(description = "This method is used to verify the Ascending sorting functionality of Location.")
	public void verifyAscendingOrderSortingFunctionalityOfLocation() throws IOException, InterruptedException {
		flag = ergoevalfunctions.verifyAscendingOrderSortingFunctionalityOfLocation();
		test = extent.createTest(this.getClass().getName() + ": This method is used to verify the Ascending sorting functionality of Location.");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to verify the decending sorting functionality of First Name")
	public void verifyDecendingOrderSortingFunctionalityOfLocation() throws IOException, InterruptedException {
		flag = ergoevalfunctions.verifyDecendingOrderSortingFunctionalityOfLocation();
		test = extent.createTest(this.getClass().getName() + ": This method is used to verify the decending sorting functionality of Location.");
		Assert.assertTrue(flag);
	}
	

	@Test(description = "This method is used to verify the Ascending sorting functionality of Comfort.")
	public void verifyAscendingOrderSortingFunctionalityOfComfort() throws IOException, InterruptedException {
		flag = ergoevalfunctions.verifyAscendingOrderSortingFunctionalityOfComfort();
		test = extent.createTest(this.getClass().getName() + ": This method is used to verify the Ascending sorting functionality of Comfort.");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to verify the decending sorting functionality of Comfort")
	public void verifyDecendingOrderSortingFunctionalityOfComfort() throws IOException, InterruptedException {
		flag = ergoevalfunctions.verifyDecendingOrderSortingFunctionalityOfComfort();
		test = extent.createTest(this.getClass().getName() + ": This method is used to verify the decending sorting functionality of Comfort.");
		Assert.assertTrue(flag);
	}
	

	@Test(description = "This method is used to verify the Ascending sorting functionality of Status.")
	public void verifyAscendingOrderSortingFunctionalityOfStatus() throws IOException, InterruptedException {
		flag = ergoevalfunctions.verifyAscendingOrderSortingFunctionalityOfStatus();
		test = extent.createTest(this.getClass().getName() + ": This method is used to verify the Ascending sorting functionality of Status.");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to verify the decending sorting functionality of Status")
	public void verifyDecendingOrderSortingFunctionalityOfStatus() throws IOException, InterruptedException {
		flag = ergoevalfunctions.verifyDecendingOrderSortingFunctionalityOfStatus();
		test = extent.createTest(this.getClass().getName() + ": This method is used to verify the decending sorting functionality of Status.");
		Assert.assertTrue(flag);
	}

	@Test(description = "This method is used to verify the date filter functionality.")
	public void verifyDateFilterFunctionality() throws IOException, InterruptedException {
		flag = ergoevalfunctions.verifyDateFilterFunctionality();
		test = extent.createTest(this.getClass().getName() + ": This method is used to verify the date filter functionality.");
		Assert.assertTrue(flag);
	}
	
	@AfterClass(alwaysRun = true)
	public void afterClass() throws IOException {
		webDB.tearDown();
	}
}
