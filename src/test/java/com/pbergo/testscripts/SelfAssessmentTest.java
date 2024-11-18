package com.pbergo.testscripts;

import org.testng.annotations.Test;

import com.pbergo.base.ExtentReportBase;
import com.pbergo.base.WebDriverBase;
import com.pbergo.commonfunctions.ProgramOverviewFunctions;
import com.pbergo.commonfunctions.SelfAssessmentFunctions;
//import com.pbergo.commonfunctions.BuildABoxFunctions;
import com.pbergo.commonfunctions.UIBasicFunctions;
import com.pbergo.commonfunctions.UsersFunctions;
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
public class SelfAssessmentTest extends ExtentReportBase {
	private WebDriverBase webDB;
	private UIBasicFunctions uibasicfunctions;
	private SelfAssessmentFunctions selfassessmentfunctions;
	
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
		selfassessmentfunctions = new SelfAssessmentFunctions(webDB);
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
		flag = uibasicfunctions.openEmployeeDashboard(ProgramOverviewLocators.ELMNT_PROGRAMOVERVIEW_LEFTSIDEPANEL);
		test = extent.createTest(this.getClass().getName() + ": This method is used to Open the employee dashboard");
		Assert.assertTrue(flag);
	}

	@Test(description = "This method is used to open Self assesment option from the left side pannel")
	public void verifyOpenSelfAssessment() throws IOException, InterruptedException {
		flag = selfassessmentfunctions.openSelfAssessmentLink();
		test = extent.createTest(
				this.getClass().getName() + ": This method is used to open Self assesment option from the left side pannel");
		Assert.assertTrue(flag);
	}


	@Test(description = "This method is used to Download the self reported discomfort document")
	public void clickDownloadDocumentSelfReportedDiscomfort() throws IOException, InterruptedException {
		flag = selfassessmentfunctions.downloadDocumentForSelfReportedDiscomfort();
		test = extent.createTest(
				this.getClass().getName() + ": This method is used to Download the self reported discomfort document");
		Assert.assertTrue(flag);
	}

	@Test(description = "This method is used to Download the self reported discomfort image")
	public void clickDownloadImageFromSelfReportedDiscomfort() throws IOException, InterruptedException {
		flag = selfassessmentfunctions.downloadImageForSelfReportedDiscomfort();
		test = extent.createTest(
				this.getClass().getName() + ": This method is used to Download the self reported discomfort image.");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to Download the equipement recommendation document")
	public void clickDownloadDocumentEquiRecommandations() throws IOException, InterruptedException {
		flag = selfassessmentfunctions.downloadDocumentForEquiRecommandations();
		test = extent.createTest(
				this.getClass().getName() + ": This method is used to Download the equipement recommendation document.");
		Assert.assertTrue(flag);
	}

	@Test(description = "This method is used to Download the equipement recommendation image")
	public void clickDownloadImageFromEquiRecommandation() throws IOException, InterruptedException {
		flag = selfassessmentfunctions.downloadImageForEquiRecommandations();
		test = extent.createTest(
				this.getClass().getName() + ": This method is used to Download the equipement recommendation image.");
		Assert.assertTrue(flag);
	}
	

	@Test(description = "This method is used to Download the work area assessed image")
	public void clickDownloadImageFromWorkAreaAssessed() throws IOException, InterruptedException {
		flag = selfassessmentfunctions.downloadImageForWorkAreaAssessed();
		test = extent.createTest(
				this.getClass().getName() + ": This method is used to Download the work area assessed image");
		Assert.assertTrue(flag);
	}


	@Test(description = "This method is used to Download the Work area assesed document")
	public void clickDownloadDocumentFromWorkAreaAssessed() throws IOException, InterruptedException {
		flag = selfassessmentfunctions.downloadDocumentForWorkAreaAssessed();
		test = extent.createTest(
				this.getClass().getName() + ": This method is used to Download the Work area assesed document.");
		Assert.assertTrue(flag);
	}
	
	
	@Test(description = "This method is used to Download the self reported comfort level image")
	public void clickDownloadImageFromSelfReportedComfortLevels() throws IOException, InterruptedException {
		flag = selfassessmentfunctions.downloadImageForSelfReportedComfortLevels();
		test = extent.createTest(
				this.getClass().getName() + ": This method is used to Download the self reported comfort level image.");
		Assert.assertTrue(flag);
	}


	@Test(description = "This method is used to Download the self reported comfort level document")
	public void clickDownloadDocumentFromSelfReportedComfortLevels() throws IOException, InterruptedException {
		flag = selfassessmentfunctions.downloadDocumentForSelfReportedComfortLevels();
		test = extent.createTest(
				this.getClass().getName() + ": This method is used to Download the self reported comfort level document.");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to Download the percentage self assesment activity by region image")
	public void clickDownloadImagePercentageFromSelfAssessmentActivityByRegion() throws IOException, InterruptedException {
		flag = selfassessmentfunctions.downloadImagePercentageFromSelfAssessmentActivityByRegion();
		test = extent.createTest(
				this.getClass().getName() + ": This method is used to Download the percentage self assesment activity by region image.");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to Download the percentage self assesment activity by region document")
	public void clickDownloadDocumentPercentageFromSelfAssessmentActivityByRegion() throws IOException, InterruptedException {
		flag = selfassessmentfunctions.downloadDocumentPercentageFromSelfAssessmentActivityByRegion();
		test = extent.createTest(
				this.getClass().getName() + ": This method is used to Download the percentage self assesment activity by region document.");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to Download the hash self assesment activity by region image")
	public void clickDownloadImageHashFromSelfAssessmentActivityByRegion() throws IOException, InterruptedException {
		flag = selfassessmentfunctions.downloadImageHashFromSelfAssessmentActivityByRegion();
		test = extent.createTest(
				this.getClass().getName() + ": This method is used to Download the hash self assesment activity by region image.");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to Download the hash self assesment activity by region document")
	public void clickDownloadDocumentHashFromSelfAssessmentActivityByRegion() throws IOException, InterruptedException {
		flag = selfassessmentfunctions.downloadDocumentHashFromSelfAssessmentActivityByRegion();
		test = extent.createTest(
				this.getClass().getName() + ": This method is used to Download the hash self assesment activity by region document.");
		Assert.assertTrue(flag);
	}
	
	

	@AfterClass(alwaysRun = true)
	public void afterClass() throws IOException {
		webDB.tearDown();
	}
}
