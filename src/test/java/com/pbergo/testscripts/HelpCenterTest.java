package com.pbergo.testscripts;

import org.testng.annotations.Test;

import com.pbergo.base.ExtentReportBase;
import com.pbergo.base.WebDriverBase;
import com.pbergo.commonfunctions.ClientActivity;
import com.pbergo.commonfunctions.HelpCenter;
import com.pbergo.commonfunctions.UIBasicFunctions;
import com.pbergo.locators.ErgoEvalActivityLocators;

import org.testng.annotations.BeforeClass;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class HelpCenterTest extends ExtentReportBase{
	private WebDriverBase webDB;
	private UIBasicFunctions uibasicfunctions;
	private  HelpCenter helpCenter;

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
		helpCenter = new HelpCenter(webDB);
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
	

	
	@Test(description = "This method is used to Select the Help Center page from left side panel.")
	public void CenterDashboardLearningTutorials() throws IOException, InterruptedException, AWTException {
		flag = helpCenter.CenterDashboardLearningTutorials();
		test = extent.createTest(
				this.getClass().getName() + "This method is used to Select the Help Center page from left side panel.");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to verify the recommended Video play pause functionality from the Ergo activity dashboard")
	public void ErgoActivityDashboard() throws IOException, InterruptedException, AWTException {
		flag = helpCenter.ErgoActivityDashboard();
		test = extent.createTest(
				this.getClass().getName() + ": This method is used to verify the recommended Video play pause functionality from the Ergo activity dashboard");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to verify the recommended Video play pause functionality from the your personnal dashboard")
	public void YourPersonalDashboard() throws IOException, InterruptedException, AWTException {
		flag = helpCenter.YourPersonalDashboard();
		test = extent.createTest(
				this.getClass().getName() + ": This method is used to verify the recommended Video play pause functionality from the your personnal dashboard");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to verify the recommended Video play pause functionality from the Evaluation dashboard")
	public void EvaluationDashboard() throws IOException, InterruptedException, AWTException {
		flag = helpCenter.EvaluationDashboard();
		test = extent.createTest(
				this.getClass().getName() + ": This method is used to verify the recommended Video play pause functionality from the Evaluation dashboard");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to verify the recommended Video play pause functionality from the program management dashboard")
	public void ProgramManagementDashboard() throws IOException, InterruptedException, AWTException {
		flag = helpCenter.ProgramManagementDashboard();
		test = extent.createTest(
				this.getClass().getName() + ": This method is used to verify the recommended Video play pause functionality from the program management dashboard");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to verify the recommended Video play pause functionality from the ergo eval dashboard")
	public void ErgoEval() throws IOException, InterruptedException, AWTException {
		flag = helpCenter.ErgoEval();
		test = extent.createTest(
				this.getClass().getName() + ": This method is used to verify the recommended Video play pause functionality from the ergo eval dashboard");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to verify the recommended Video play pause functionality from the my reports dashboard")
	public void MyReports() throws IOException, InterruptedException, AWTException {
		flag = helpCenter.MyReports();
		test = extent.createTest(
				this.getClass().getName() + ": This method is used to verify the recommended Video play pause functionality from the my reports dashboard");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to verify the recommended Video play pause functionality from the my data dashboard")
	public void MyData() throws IOException, InterruptedException, AWTException {
		flag = helpCenter.MyData();
		test = extent.createTest(
				this.getClass().getName() + ": This method is used to verify the recommended Video play pause functionality from the my data dashboard");
		Assert.assertTrue(flag);
	}

	@Test(description = "This method is used to verify the recommended Video play pause functionality from the additional supports dashboard")
	public void AdditionalSupports() throws IOException, InterruptedException, AWTException {
		flag = helpCenter.AdditionalSupports();
		test = extent.createTest(
				this.getClass().getName() + ": This method is used to verify the recommended Video play pause functionality from the additional supports dashboard");
		Assert.assertTrue(flag);
	}
  
	@AfterClass(alwaysRun = true)
	public void afterClass() throws IOException {
		webDB.tearDown();
	}

}
