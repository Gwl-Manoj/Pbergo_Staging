package com.pbergo.testscripts;

import org.testng.annotations.Test;

import com.pbergo.base.ExtentReportBase;
import com.pbergo.base.WebDriverBase;
import com.pbergo.commonfunctions.ProgramOverviewFunctions;
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
public class EMPProgramOverviewTest extends ExtentReportBase {
	private WebDriverBase webDB;
	private UIBasicFunctions uibasicfunctions;
	private ProgramOverviewFunctions programoverviewfunctions;

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
		programoverviewfunctions = new ProgramOverviewFunctions(webDB);
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

	@Test(description = "This method is used to open program overview dashboard.")
	public void verifyOpenProgramOverview() throws IOException, InterruptedException {
		flag = programoverviewfunctions.openProgramOverviewLink();
		test = extent.createTest(
				this.getClass().getName() + ": This method is used to open program overview dashboard.");
		Assert.assertTrue(flag);
	}

	@Test(description = "This method is used to click the current option from site registrants.")
	public void clickCurrentOptionFromSiteRegistrants() throws IOException, InterruptedException {
		flag = programoverviewfunctions.clickCurrentLink();
		test = extent.createTest(
				this.getClass().getName() + ": This method is used to click the current option from site registrants.");
		Assert.assertTrue(flag);
	}

	@Test(description = "This method is used to download the site registrants image.")
	public void clickDownloadImageFromSiteRegistrants() throws IOException, InterruptedException {
		flag = programoverviewfunctions.downloadImageForCurrentOption();
		test = extent.createTest(
				this.getClass().getName() + ": This method is used to download the site registrants image.");
		Assert.assertTrue(flag);
	}

	@Test(description = "This method is used to download the site registrants document.")
	public void clickDownloadDocumentFromSiteRegistrants() throws IOException, InterruptedException {
		flag = programoverviewfunctions.downloadDocumentForCurrentOption();
		test = extent.createTest(
				this.getClass().getName() + ": This method is used to download the site registrants document.");
		Assert.assertTrue(flag);
	}

	@Test(description = "This method is used to click on YTD option from site registrants")
	public void clickYTDOptionFromSiteRegistrants() throws IOException, InterruptedException {
		flag = programoverviewfunctions.clickYTDLink();
		test = extent.createTest(
				this.getClass().getName() + ": This method is used to click on YTD option from site registrants.");
		Assert.assertTrue(flag);
	}

	@Test(description = "This method is used to download on YTD Image from site registrants")
	public void clickDownloadImageYTDFromSiteRegistrants() throws IOException, InterruptedException {
		flag = programoverviewfunctions.downloadImageForYTDOption();
		test = extent.createTest(
				this.getClass().getName() + ": This method is used to download on YTD Image from site registrants");
		Assert.assertTrue(flag);
	}

	@Test(description = "This method is used to download on YTD Document from site registrants")
	public void clickDownloadDocumentYTDFromSiteRegistrants() throws IOException, InterruptedException {
		flag = programoverviewfunctions.downloadDocumentForYTDOption();
		test = extent.createTest(
				this.getClass().getName() + ": This method is used to download on YTD Document from site registrants");
		Assert.assertTrue(flag);
	}

	@Test(description = "This method is used to download Total activity by region image")
	public void clickDownloadImageFromTotalActivityRegion() throws IOException, InterruptedException {
		flag = programoverviewfunctions.downloadImageForTotalActivityRegion();
		test = extent.createTest(
				this.getClass().getName() + ": This method is used to download Total activity by region image");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to download Hash Total activity by region image")
	public void clickDownloadImageHashFromTotalActivityRegion() throws IOException, InterruptedException {
		flag = programoverviewfunctions.downloadImageHashForTotalActivityRegion();
		test = extent.createTest(
				this.getClass().getName() + ": This method is used to download Hash Total activity by region image.");
		Assert.assertTrue(flag);
	}

	@Test(description = "This method is used to download Total activity by region document")
	public void clickDownloadDocumentFromTotalActivityRegion() throws IOException, InterruptedException {
		flag = programoverviewfunctions.downloadDocumentForTotalActivityRegion();
		test = extent.createTest(
				this.getClass().getName() + ": This method is used to download Total activity by region document");
		Assert.assertTrue(flag);
	}

	@Test(description = "This method is used to download Reason for assesment image")
	public void clickDownloadImageFromReasonForAssessment() throws IOException, InterruptedException {
		flag = programoverviewfunctions.downloadImageForReasonForAssessment();
		test = extent.createTest(
				this.getClass().getName() + ": This method is used to download Reason for assesment image");
		Assert.assertTrue(flag);
	}

	@Test(description = "This method is used to download Reason for assesment document")
	public void clickDownloadDocumentFromReasonForAssessment() throws IOException, InterruptedException {
		flag = programoverviewfunctions.downloadDocumentForReasonForAssessment();
		test = extent.createTest(
				this.getClass().getName() + ": This method is used to download Reason for assesment document");
		Assert.assertTrue(flag);
	}

	@Test(description = "This method is used to download work area assessed image")
	public void clickDownloadImageFromWorkAreaAssessed() throws IOException, InterruptedException {
		flag = programoverviewfunctions.downloadImageForWorkAreaAssessed();
		test = extent.createTest(
				this.getClass().getName() + ": This method is used to download work area assessed image");
		Assert.assertTrue(flag);
	}


	@Test(description = "This method is used to download work area assessed document")
	public void clickDownloadDocumentFromWorkAreaAssessed() throws IOException, InterruptedException {
		flag = programoverviewfunctions.downloadDocumentForWorkAreaAssessed();
		test = extent.createTest(
				this.getClass().getName() + ": This method is used to download work area assessed document");
		Assert.assertTrue(flag);
	}
	
	
	@Test(description = "This method is used to click on Hash option for Eval")
	public void clickHashOptionForEVAL() throws IOException, InterruptedException {
		flag = programoverviewfunctions.selectHashOptionForEVAL();
		test = extent.createTest(
				this.getClass().getName() + ": This method is used to click on Hash option for Eval");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to click on Hash option for SA")
	public void clickHashOptionForSA() throws IOException, InterruptedException {
		flag = programoverviewfunctions.selectHashOptionForSA();
		test = extent.createTest(
				this.getClass().getName() + ": This method is used to click on Hash option for SA");
		Assert.assertTrue(flag);
	}
	
	

	@AfterClass(alwaysRun = true)
	public void afterClass() throws IOException {
		webDB.tearDown();
	}
}
