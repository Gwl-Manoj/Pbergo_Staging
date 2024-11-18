package com.pbergo.testscripts;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pbergo.base.ExtentReportBase;
import com.pbergo.base.WebDriverBase;
import com.pbergo.commonfunctions.BlogFunctions;
import com.pbergo.commonfunctions.UIBasicFunctions;

/**
 * @author gwl
 *
 */
public class BlogTest extends ExtentReportBase {
	private WebDriverBase webDB;
	private UIBasicFunctions uibasicfunctions;
	private BlogFunctions blogfunctions;
	
	boolean flag = false;
	String ClientName = System.getProperty("ClientName");
	String password = System.getProperty("password");

	/**
	 * @throws IOException
	 * @throws InterruptedException
	 */
	@BeforeClass(alwaysRun = true)
	public void beforeClass() throws IOException, InterruptedException {
		webDB = new WebDriverBase();
		uibasicfunctions = new UIBasicFunctions(webDB);
		blogfunctions = new BlogFunctions(webDB);
		webDB.openBrowser();
	}

	@Test(description = "To verify the login functionality")
	public void verifyLogin() throws IOException, InterruptedException {
		flag = uibasicfunctions.userLoggedIN();
		test = extent.createTest(this.getClass().getName() + ": To verify the login functionality.");
		Assert.assertTrue(flag);
	}

	@Test(description = "This method is used to Open the admin dashboard")
	public void verifyopenAdminDashboard() throws IOException, InterruptedException {
		flag = uibasicfunctions.openAdminDashboard();
		test = extent.createTest(this.getClass().getName() + ": This method is used to Open the admin dashboard");
		Assert.assertTrue(flag);
	}

	@Test(description = "This method is used to verify blog page functionality")
	public void verifyAdminBlogsPage() throws IOException, InterruptedException {
		flag =blogfunctions.click_AdminBlog_Left_Panel();
		test = extent
				.createTest(this.getClass().getName() + ": This method is used to verify blog page functionality.");
		Assert.assertTrue(flag);
	}
	
	
	@Test(description = "This method is used to verify blog page heading")
	public void verifyAdminBlog_Heading() throws IOException, InterruptedException {
		flag =blogfunctions.get_AdminBlog_Heading();
		test = extent
				.createTest(this.getClass().getName() + ": This method is used to verify blog page heading.");
		Assert.assertTrue(flag);
	}
	
	
	@AfterClass(alwaysRun = true)
	public void afterClass() throws IOException {
		webDB.tearDown();
	}
	
//	@AfterSuite
//	public void mail()
//	{
////		MailUtil.sendNotificationMail("Below is the Automation Script Execution Report. PFA Attachment.");
//		
////		com.pbergo.base.MailUtil.sendNotificationMail("Below is the Automation Script Execution Report. PFA Attachment.");
//	}
}
