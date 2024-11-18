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
import com.pbergo.commonfunctions.UIBasicFunctions;
import com.pbergo.commonfunctions.UserRoleFunctions;
import com.pbergo.locators.AdminLeftSidePanelLocators;
import com.pbergo.locators.AdminUserRoleLocators;

/**
 * @author Galaxy Web Links
 * @Project: PBErgo WEB
 * @AutomationEngineer: Ravish S
 * @Date: Sept 14, 2023
 */
public class EmailTemplate extends ExtentReportBase {
	private WebDriverBase webDB;
	private UIBasicFunctions uibasicfunctions;
	private EmailTemplateFunctions emailTemplateFunctions;
	private MailUtil mailutil;
	boolean flag = false;

	/**
	 * @throws IOException
	 * @throws InterruptedException
	 */
	@BeforeClass(alwaysRun = true)
	public void beforeClass() throws IOException, InterruptedException {
		webDB = new WebDriverBase();
		// mailutil = new MailUtil();
		uibasicfunctions = new UIBasicFunctions(webDB);
		emailTemplateFunctions = new EmailTemplateFunctions(webDB);
		webDB.openBrowser();

	}

	@Test(description = "To verify the login functionality")
	public void verifyLogin() throws IOException, InterruptedException {
		flag = uibasicfunctions.userLoggedIN();
		test = extent.createTest(this.getClass().getName() + ": To verify the login functionality.");
		Assert.assertTrue(flag);
	}

	@Test(description = "This method is used to open Admin Dashboard page.")
	public void verifyOpenAdminDashboard() throws IOException, InterruptedException {
		flag = uibasicfunctions.openAdminDashboard();
		test = extent.createTest(this.getClass().getName() + ": This method is used to open Admin Dashboard page.");
		Assert.assertTrue(flag);
	}

	@Test(description = "This method is used to open Email Listing page.")
	public void verifyOpenEmailTemplateListing() throws IOException, InterruptedException {
		flag = emailTemplateFunctions.openEmailTemplateListingPage();
		test = extent.createTest(this.getClass().getName() + ": This method is used to open Email Listing page.");
		Assert.assertTrue(flag);
	}

	@Test(description = "This method is used to add Email Template.")
	public void verifyAddEmailTemplate() throws IOException, InterruptedException {
		flag = emailTemplateFunctions.addEmailTemplate();
		test = extent.createTest(this.getClass().getName() + ": This method is used to add Email Template.");
		Assert.assertTrue(flag);
	}

	@Test(description = "This method is used to Edit Email Template after search.")
	public void verifyEditEmailTemplate() throws IOException, InterruptedException {
		flag = emailTemplateFunctions.editEmailTemplate();
		test = extent.createTest(this.getClass().getName() + ": This method is used to Edit Email Template after search.");
		Assert.assertTrue(flag);
	}

	@Test(description = "This method is used to Delete Email Template after search.")
	public void verifyDeleteEmailTemplate() throws IOException, InterruptedException {
		flag = emailTemplateFunctions.deleteEmailTemplate();
		test = extent.createTest(this.getClass().getName() + ": This method is used to Delete Email Template after search.");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to verify the pagination functionality.")
	public void verifyPaginationFunctionality() throws IOException, InterruptedException {
		flag = emailTemplateFunctions.verifyPaginationFunctionality();
		test = extent.createTest(this.getClass().getName() + ": This method is used to verify the pagination functionality.");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to verify the Ascending sorting functionality of Template Name column.")
	public void verifyAscendingOrderSortingFunctionalityOfTemplateNameColumn() throws IOException, InterruptedException {
		flag = emailTemplateFunctions.verifyAscendingOrderSortingFunctionalityOfTemplateNameColumn();
		test = extent.createTest(this.getClass().getName() + ": This method is used to verify the Ascending sorting functionality of Template Name column.");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to verify the decending sorting functionality of Template Name column.")
	public void verifyDecendingOrderSortingFunctionalityOfTemplateNameColumn() throws IOException, InterruptedException {
		flag = emailTemplateFunctions.verifyDecendingOrderSortingFunctionalityOfTemplateNameColumn();
		test = extent.createTest(this.getClass().getName() + ": This method is used to verify the decending sorting functionality of Template Name column.");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to verify the Ascending sorting functionality of Subject column.")
	public void verifyAscendingOrderSortingFunctionalityOfSubjectColumn() throws IOException, InterruptedException {
		flag = emailTemplateFunctions.verifyAscendingOrderSortingFunctionalityOfSubjectColumn();
		test = extent.createTest(this.getClass().getName() + ": This method is used to verify the Ascending sorting functionality of Subject column.");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to verify the decending sorting functionality of Subject column.")
	public void verifyDecendingOrderSortingFunctionalityOfSubjectColumn() throws IOException, InterruptedException {
		flag = emailTemplateFunctions.verifyDecendingOrderSortingFunctionalityOfSubjectColumn();
		test = extent.createTest(this.getClass().getName() + ": This method is used to verify the decending sorting functionality of Subject column.");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to verify the Ascending sorting functionality of Client column.")
	public void verifyAscendingOrderSortingFunctionalityOfClientColumn() throws IOException, InterruptedException {
		flag = emailTemplateFunctions.verifyAscendingOrderSortingFunctionalityOfClientColumn();
		test = extent.createTest(this.getClass().getName() + ": This method is used to verify the Ascending sorting functionality of Client column.");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to verify the decending sorting functionality of Client column.")
	public void verifyDecendingOrderSortingFunctionalityOfClientColumn() throws IOException, InterruptedException {
		flag = emailTemplateFunctions.verifyDecendingOrderSortingFunctionalityOfClientColumn();
		test = extent.createTest(this.getClass().getName() + ": This method is used to verify the decending sorting functionality of Client column.");
		Assert.assertTrue(flag);
	}
	

	@AfterClass(alwaysRun = false)
	public void afterClass() throws IOException {
		webDB.tearDown();
	}
}