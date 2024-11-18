package com.pbergo.testscripts;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.pbergo.base.ExtentReportBase;
import com.pbergo.base.MailUtil;
import com.pbergo.base.WebDriverBase;
import com.pbergo.commonfunctions.EmailTemplateFunctions;
import com.pbergo.commonfunctions.SendNotificationFunctions;
import com.pbergo.commonfunctions.UIBasicFunctions;
import com.pbergo.commonfunctions.UserRoleFunctions;
import com.pbergo.locators.AdminLeftSidePanelLocators;
import com.pbergo.locators.AdminUserRoleLocators;

/**
 * @author Galaxy Web Links
 * @Project: PBErgo WEB
 * @AutomationEngineer: Navin Aditya
 */
public class SendNotification extends ExtentReportBase {
	private WebDriverBase webDB;
	private UIBasicFunctions uibasicfunctions;
	private SendNotificationFunctions sendNotificationFunctions;
	private MailUtil mailutil;
	boolean flag = false;

	/**
	 * @throws IOException
	 * @throws InterruptedException
	 */
	@BeforeClass(alwaysRun = true)
	public void beforeClass() throws IOException, InterruptedException {
		webDB = new WebDriverBase();
		mailutil = new MailUtil();
		uibasicfunctions = new UIBasicFunctions(webDB);
		sendNotificationFunctions = new SendNotificationFunctions(webDB);
		webDB.openBrowser();

	}

	@Test(description = "To verify the login functionality")
	public void verifyLogin() throws IOException, InterruptedException {
		flag = uibasicfunctions.userLoggedIN();
		test = extent.createTest(this.getClass().getName() + ": To verify the login functionality");
		Assert.assertTrue(flag);
	}

	@Test(description = "This method used to open Admin Dashboard page.")
	public void verifyOpenAdminDashboard() throws IOException, InterruptedException {
		flag = uibasicfunctions.openAdminDashboard();
		test = extent.createTest(this.getClass().getName() + ": This method used to open Admin Dashboard page.");
		Assert.assertTrue(flag);
	}

	@Test(description = "This method used to open Send Notification page.")
	public void verifyOpenSendNotificationListing() throws IOException, InterruptedException {
		flag = sendNotificationFunctions.openSendNotificationPage();
		test = extent.createTest(this.getClass().getName() + ": This method used to open Send Notification page.");
		Assert.assertTrue(flag);
	}

	@Test(description = "This method used to add Send Notification.")
	public void verifyAddSendNotification() throws IOException, InterruptedException {
		flag = sendNotificationFunctions.addSendNotification();
		test = extent.createTest(this.getClass().getName() + ": This method used to add Send Notification.");
		Assert.assertTrue(flag);
	}

	@Test(description = "This method used to schedule Send Notification.")
	public void verifyScheduleSendNotification() throws IOException, InterruptedException {
		flag = sendNotificationFunctions.scheduleSendNotification();
		test = extent.createTest(this.getClass().getName() + ": This method used to schedule Send Notification.");
		Assert.assertTrue(flag);
	}

	@AfterClass(alwaysRun = false)
	public void afterClass() throws IOException {
		webDB.tearDown();
	}
}