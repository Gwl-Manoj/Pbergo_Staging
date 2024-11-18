package com.pbergo.testscripts;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pbergo.base.ExtentReportBase;
import com.pbergo.base.WebDriverBase;
import com.pbergo.commonfunctions.MyReport;
import com.pbergo.commonfunctions.UIBasicFunctions;
import com.pbergo.locators.ErgoEvalActivityLocators;

public class MyReportTest extends ExtentReportBase
{
	private WebDriverBase webDB;
	private UIBasicFunctions uibasicfunctions;
	private MyReport myReport;

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
		myReport = new MyReport(webDB);
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
	
	@Test(description = "This method is used to verify the report download functionality from the reports page")
	public void verifyReports_DownloadFunctionality() throws IOException, InterruptedException, AWTException {
		flag = myReport.verifyReports_DownloadFunctionality();
		test = extent.createTest(this.getClass().getName() + ": This method is used to verify the report download functionality from the reports page");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to verify the report view and download functionality from the reports page")
	public void verifyReports_ViewAndDownloadFunctionality() throws IOException, InterruptedException, AWTException {
		flag = myReport.verifyReports_ViewAndDownloadFunctionality();
		test = extent.createTest(this.getClass().getName() + ": This method is used to verify the report view and download functionality from the reports page");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to verify the current report search functionality from the reports page")
	public void verifyCurrentReportSearchFunctionality() throws IOException, InterruptedException, AWTException {
		flag = myReport.verifyCurrentReportSearchFunctionality();
		test = extent.createTest(this.getClass().getName() + ": This method is used to verify the current report search functionality from the reports page");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to verify the equipement recommendation search and view btn functionality from the reports page")
	public void verifyEquipementRecommendationSearchAndViewBtnFunctionality() throws IOException, InterruptedException, AWTException {
		flag = myReport.verifyEquipementRecommendationSearchAndViewBtnFunctionality();
		test = extent.createTest(this.getClass().getName() + ": This method is used to verify the equipement recommendation search and view btn functionality from the reports page");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to verify the recommended Video slider functionality from the reports page")
	public void verifyRecommendedVideoSliderFunctionality() throws IOException, InterruptedException, AWTException {
		flag = myReport.verifyRecommendedVideoSliderFunctionality();
		test = extent.createTest(this.getClass().getName() + ": This method is used to verify the recommended Video slider functionality from the reports page");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to verify the recommended Video play pause functionality from the reports page")
	public void verifyRecommendedVideosPlayPauseFunctionality() throws IOException, InterruptedException, AWTException {
		flag = myReport.verifyRecommendedVideosPlayPauseFunctionality();
		test = extent.createTest(this.getClass().getName() + ": This method is used to verify the recommended Video play pause functionality from the reports page");
		Assert.assertTrue(flag);
	}
	

	@Test(description = "This method is used to verify the pagination functionality.")
	public void verifyCurrentReportPaginationFunctionality() throws IOException, InterruptedException {
		flag = myReport.verifyCurrentReportPaginationFunctionality();
		test = extent.createTest(this.getClass().getName() + ": This method is used to verify the pagination functionality.");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to verify the Ascending sorting functionality of Date Of Assessment.")
	public void verifyAscendingOrderSortingFunctionalityOfDateOfAssessment() throws IOException, InterruptedException {
		flag = myReport.verifyAscendingOrderSortingFunctionalityOfDateOfAssessment();
		test = extent.createTest(this.getClass().getName() + ": This method is used to verify the Ascending sorting functionality of Date Of Assessment.");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to verify the decending sorting functionality of Date Of Assessment")
	public void verifyDecendingOrderSortingFunctionalityOfDateOfAssessment() throws IOException, InterruptedException {
		flag = myReport.verifyDecendingOrderSortingFunctionalityOfDateOfAssessment();
		test = extent.createTest(this.getClass().getName() + ": This method is used to verify the decending sorting functionality of Date Of Assessment.");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to verify the Ascending sorting functionality of Types Of Assessment.")
	public void verifyAscendingOrderSortingFunctionalityOfTypesOfAssessment() throws IOException, InterruptedException {
		flag = myReport.verifyAscendingOrderSortingFunctionalityOfTypesOfAssessment();
		test = extent.createTest(this.getClass().getName() + ": This method is used to verify the Ascending sorting functionality of Types Of Assessment.");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to verify the decending sorting functionality of Date Of Assessment")
	public void verifyDecendingOrderSortingFunctionalityOfTypesOfAssessment() throws IOException, InterruptedException {
		flag = myReport.verifyDecendingOrderSortingFunctionalityOfTypesOfAssessment();
		test = extent.createTest(this.getClass().getName() + ": This method is used to verify the decending sorting functionality of Types Of Assessment.");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to verify the ER pagination functionality.")
	public void verifyEquipmentRecommendationPaginationFunctionality() throws IOException, InterruptedException {
		flag = myReport.verifyEquipmentRecommendationPaginationFunctionality();
		test = extent.createTest(this.getClass().getName() + ": This method is used to verify the ER pagination functionality.");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to verify the Ascending sorting functionality of ER Date Of Assessment.")
	public void verifyAscendingOrderSortingFunctionalityOfDateOfAssessmentER() throws IOException, InterruptedException {
		flag = myReport.verifyAscendingOrderSortingFunctionalityOfDateOfAssessmentER();
		test = extent.createTest(this.getClass().getName() + ": This method is used to verify the Ascending sorting functionality of ER Date Of Assessment.");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to verify the decending sorting functionality of ER Date Of Assessment")
	public void verifyDecendingOrderSortingFunctionalityOfDateOfAssessmentER() throws IOException, InterruptedException {
		flag = myReport.verifyDecendingOrderSortingFunctionalityOfDateOfAssessmentER();
		test = extent.createTest(this.getClass().getName() + ": This method is used to verify the decending sorting functionality of ER Date Of Assessment.");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to verify the Ascending sorting functionality of ER.")
	public void verifyAscendingOrderSortingFunctionalityOfEquipmentRecommendation() throws IOException, InterruptedException {
		flag = myReport.verifyAscendingOrderSortingFunctionalityOfEquipmentRecommendation();
		test = extent.createTest(this.getClass().getName() + ": This method is used to verify the Ascending sorting functionality of ER.");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to verify the decending sorting functionality of ER")
	public void verifyDecendingOrderSortingFunctionalityOfEquipmentRecommendation() throws IOException, InterruptedException {
		flag = myReport.verifyDecendingOrderSortingFunctionalityOfEquipmentRecommendation();
		test = extent.createTest(this.getClass().getName() + ": This method is used to verify the decending sorting functionality of ER.");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to verify the Ascending sorting functionality of Types Of Assessment.")
	public void verifyAscendingOrderSortingFunctionalityOfTypesOfAssessmentER() throws IOException, InterruptedException {
		flag = myReport.verifyAscendingOrderSortingFunctionalityOfTypesOfAssessmentER();
		test = extent.createTest(this.getClass().getName() + ": This method is used to verify the Ascending sorting functionality of Types Of Assessment.");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to verify the decending sorting functionality of Types Of Assessment")
	public void verifyDecendingOrderSortingFunctionalityOfTypesOfAssessmentER() throws IOException, InterruptedException {
		flag = myReport.verifyDecendingOrderSortingFunctionalityOfTypesOfAssessmentER();
		test = extent.createTest(this.getClass().getName() + ": This method is used to verify the decending sorting functionality of Types Of Assessment.");
		Assert.assertTrue(flag);
	}

	@Test(description = "This method is used to verify the date filter functionality of Current Report Section.")
	public void verifyDateFilterFunctionalityOfCurrentReportSection() throws IOException, InterruptedException {
		flag = myReport.verifyDateFilterFunctionalityOfCurrentReportSection();
		test = extent.createTest(this.getClass().getName() + ": This method is used to verify the date filter functionality of Current Report Section.");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to verify the date filter functionality of Equipement Recommendation Section.")
	public void verifyDateFilterFunctionalityOfEquipementRecommendationSection() throws IOException, InterruptedException {
		flag = myReport.verifyDateFilterFunctionalityOfEquipementRecommendationSection();
		test = extent.createTest(this.getClass().getName() + ": This method is used to verify the date filter functionality of Equipement Recommendation Section.");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to verify the date filter functionality of Quick Fixes Section.")
	public void verifyDateFilterFunctionalityOfQuickFixesSection() throws IOException, InterruptedException {
		flag = myReport.verifyDateFilterFunctionalityOfQuickFixesSection();
		test = extent.createTest(this.getClass().getName() + ": This method is used to verify the date filter functionality of Quick Fixes Section.");
		Assert.assertTrue(flag);
	}
	

	
	@AfterClass(alwaysRun = true)
	public void afterClass() throws IOException {
		webDB.tearDown();
	}

}
