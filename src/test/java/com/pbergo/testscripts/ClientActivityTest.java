package com.pbergo.testscripts;

import org.testng.annotations.Test;

import com.pbergo.base.ExtentReportBase;
import com.pbergo.base.WebDriverBase;
import com.pbergo.commonfunctions.ClientActivity;
import com.pbergo.commonfunctions.ErgoEvalActivityFunctions;
import com.pbergo.commonfunctions.UIBasicFunctions;
import com.pbergo.locators.ErgoEvalActivityLocators;

import org.testng.annotations.BeforeClass;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class ClientActivityTest extends ExtentReportBase{
	private WebDriverBase webDB;
	private UIBasicFunctions uibasicfunctions;
	private ClientActivity clientActivity;

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
		clientActivity = new ClientActivity(webDB);
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
	
	@Test(description = "This method is used to Select the client activity from left side pannel.")
	public void verifyClientActivity() throws IOException, InterruptedException {
		flag = clientActivity.click_Update_Btn();
		test = extent.createTest(
				this.getClass().getName() + ": This method is used to Select the client activity from left side pannel.");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to download the doccuments from the client activity")
	public void verifyClientActivityDocc() throws IOException, InterruptedException {
		flag = clientActivity.downloadDocumentForAllClient();
		test = extent.createTest(
				this.getClass().getName() + ": This method is used to download the doccuments from the client activity.");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to download the Image of all client from the client activity")
	public void verifyClientActivityIMG() throws IOException, InterruptedException {
		flag = clientActivity.downloadImageForAllClient();
		test = extent.createTest(
				this.getClass().getName() + ": This method is used to download the Image of all client from the client activity");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to download the doccuments of all hash client from the client activity")
	public void DocumentForHashAllClient() throws IOException, InterruptedException {
		flag = clientActivity.downloadDocumentForHashAllClient();
		test = extent.createTest(
				this.getClass().getName() + ": This method is used to download the doccuments of all hash client from the client activity");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to download the Image of all hash client from the client activity")
	public void ImageForHashAllClient() throws IOException, InterruptedException {
		flag = clientActivity.downloadImageForHashAllClient();
		test = extent.createTest(
				this.getClass().getName() + ": This method is used to download the Image of all hash client from the client activity");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to download the Image of all registraints button from the client activity")
	public void verifyRegistraintsBtn() throws IOException, InterruptedException {
		flag = clientActivity.RegistraintsBtn();
		test = extent.createTest(
				this.getClass().getName() + ": This method is used to download the Image of all registraints button from the client activity");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to download the doccument of all registraints button from the client activity")
	public void DoccumentForRegistraints() throws IOException, InterruptedException {
		flag = clientActivity.DownloadDoccumentForRegistraints();
		test = extent.createTest(
				this.getClass().getName() + ": This method is used to download the doccument of all registraints button from the client activity");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to download the doccument of all SA Activity button from the client activity")
	public void DownloadDoccumentForSAActivity() throws IOException, InterruptedException {
		flag = clientActivity.DownloadDoccumentForSAActivity();
		test = extent.createTest(
				this.getClass().getName() + ": This method is used to download the doccument of all SA Activity button from the client activity");
		Assert.assertTrue(flag);
	}
	

	@Test(description = "This method is used to download the Image of all SA Activity button from the client activity")
	public void DownloadImageForSAActivity() throws IOException, InterruptedException {
		flag = clientActivity.DownloadImageForSAActivity();
		test = extent.createTest(
				this.getClass().getName() + ": This method is used to download the Image of all SA Activity button from the client activity");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to download the doccument of all Eval Reports button from the client activity")
	public void DownloadDoccumentForEvalReports() throws IOException, InterruptedException {
		flag = clientActivity.DownloadDoccumentForEvalReports();
		test = extent.createTest(
				this.getClass().getName() + ": This method is used to download the doccument of all Eval Reports button from the client activity");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to download the image of all Eval Reports button from the client activity")
	public void DownloadImageForEvalReports() throws IOException, InterruptedException {
		flag = clientActivity.DownloadImageForEvalReports();
		test = extent.createTest(
				this.getClass().getName() + ": This method is used to download the image of all Eval Reports button from the client activity");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to download the doccument of all Ergo Eval Reports button from the client activity")
	public void DownloadDoccumentForErgoEval() throws IOException, InterruptedException {
		flag = clientActivity.DownloadDoccumentForErgoEval();
		test = extent.createTest(
				this.getClass().getName() + ": This method is used to download the doccument of all Ergo Eval Reports button from the client activity");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to download the image of all Ergo Eval Reports button from the client activity")
	public void DownloadImageForErgoEval() throws IOException, InterruptedException {
		flag = clientActivity.DownloadImageForErgoEval();
		test = extent.createTest(
				this.getClass().getName() + ": This method is used to image the doccument of all Ergo Eval Reports button from the client activity");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to download the doccument of all site registraints Reports button from the client activity")
	public void DownloadDoccumentForSiteRegistraints() throws IOException, InterruptedException {
		flag = clientActivity.DownloadDoccumentForSiteRegistraints();
		test = extent.createTest(
				this.getClass().getName() + ": This method is used to download the doccument of all site registraints Reports button from the client activity");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to download the image of all site registraints Reports button from the client activity")
	public void DownloadImageForSiteRegistraints() throws IOException, InterruptedException {
		flag = clientActivity.DownloadImageForSiteRegistraints();
		test = extent.createTest(
				this.getClass().getName() + ": This method is used to download the image of all site registraints Reports button from the client activity");
		Assert.assertTrue(flag);
	}

	@Test(description = "This method is used to download the doccument of all current site registraints Reports button from the client activity")
	public void DownloadDoccumentForCurrentSiteRegistraints() throws IOException, InterruptedException {
		flag = clientActivity.DownloadDoccumentForCurrentSiteRegistraints();
		test = extent.createTest(
				this.getClass().getName() + ": This method is used to download the doccument of all current site registraints Reports button from the client activity");
		Assert.assertTrue(flag);
	}
	

	@Test(description = "This method is used to download the image of all current site registraints Reports button from the client activity")
	public void DownloadImageForCurrentSiteRegistraints() throws IOException, InterruptedException {
		flag = clientActivity.DownloadImageForCurrentSiteRegistraints();
		test = extent.createTest(
				this.getClass().getName() + ": This method is used to download the image of all current site registraints Reports button from the client activity");
		Assert.assertTrue(flag);
	}
	

	@AfterClass(alwaysRun = true)
	public void afterClass() throws IOException {
		webDB.tearDown();
	}

}
