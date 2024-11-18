package com.pbergo.testscripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pbergo.base.ExtentReportBase;
import com.pbergo.base.WebDriverBase;
import com.pbergo.commonfunctions.ClientFunctions;
//import com.pbergo.commonfunctions.BuildABoxFunctions;
import com.pbergo.commonfunctions.UIBasicFunctions;

/**
 * @author gwl
 *
 */
public class ClientTest extends ExtentReportBase {
	private WebDriverBase webDB;
	private UIBasicFunctions uibasicfunctions;
	private ClientFunctions clientfunctions;

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
		clientfunctions = new ClientFunctions(webDB);
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

	@Test(description = "This method is used to Select the Client action from left side panel.")
	public void verifyOpenClientListing() throws IOException, InterruptedException {
		flag =clientfunctions.click_Client_Left_Panel();
		test = extent
				.createTest(this.getClass().getName() + ": This method is used to Select the Client action from left side panel.");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to click on Add client button")
	public void click_Add_New_Client() throws IOException, InterruptedException {
		flag =clientfunctions.click_Add_Client();
		test = extent
				.createTest(this.getClass().getName() + ": This method is used to click on Add client button");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to verify the Add client functionality.")
	public void verifyAddClient() throws IOException, InterruptedException {
		flag = clientfunctions.addClientForm();
		test = extent
				.createTest(this.getClass().getName() + ": This method is used to verify the Add client functionality.");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to verify the search functionality")
	public void verifyClientSearch() throws IOException, InterruptedException {
			flag = clientfunctions.client_Search();
		test = extent
				.createTest(this.getClass().getName() + ": This method is used to verify the search functionality");
		Assert.assertTrue(flag);
	}

	@Test(description = "This method is used to click on Client edit link.")
	public void click_Client_Edit_Link() throws IOException, InterruptedException {
			flag = clientfunctions.click_Client_Edit_Link();
		test = extent
				.createTest(this.getClass().getName() + ": This method is used to click on Client edit link.");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to get and compare the Client role.")
	public void get_ClientType() throws IOException, InterruptedException {
			flag = clientfunctions.get_ClientType();
		test = extent
				.createTest(this.getClass().getName() + ": This method is used to get and compare the Client role.");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to click on update button and verify the edit functionality.")
	public void click_Update_Btn() throws IOException, InterruptedException {
			flag = clientfunctions.click_Update_Btn();
		test = extent
				.createTest(this.getClass().getName() + ": This method is used to click on update button and verify the edit functionality.");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to click on delete link.")
	public void click_Client_Delete_Link() throws IOException, InterruptedException {
		flag = clientfunctions.client_Search();
		if(flag)
		{
			flag = clientfunctions.click_Client_Delete_Link();
		}
		test = extent
				.createTest(this.getClass().getName() + ": This method is used to click on delete link.");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to verify delete functioanlity.")
	public void set_Client_Delete_Reason() throws IOException, InterruptedException {
			flag = clientfunctions.set_Client_Delete_Reason();
		test = extent
				.createTest(this.getClass().getName() + ": This method is used to verify delete functioanlity.");
		Assert.assertTrue(flag);
	}

	@Test(description = "This method is used to verify the pagination functionality.")
	public void verifyPaginationFunctionality() throws IOException, InterruptedException {
		flag = clientfunctions.verifyPaginationFunctionality();
		test = extent.createTest(this.getClass().getName() + ": This method is used to verify the pagination functionality.");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to verify the Ascending sorting functionality of Client Name column.")
	public void verifyAscendingOrderSortingFunctionalityOfClientNameColumn() throws IOException, InterruptedException {
		flag = clientfunctions.verifyAscendingOrderSortingFunctionalityOfClientNameColumn();
		test = extent.createTest(this.getClass().getName() + ": This method is used to verify the Ascending sorting functionality of Client Name column.");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to verify the decending sorting functionality of Client Name column.")
	public void verifyDecendingOrderSortingFunctionalityOfClientNameColumn() throws IOException, InterruptedException {
		flag = clientfunctions.verifyDecendingOrderSortingFunctionalityOfClientNameColumn();
		test = extent.createTest(this.getClass().getName() + ": This method is used to verify the decending sorting functionality of Client Name column.");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to verify the Ascending sorting functionality of Client Code column.")
	public void verifyAscendingOrderSortingFunctionalityOfClientCodeColumn() throws IOException, InterruptedException {
		flag = clientfunctions.verifyAscendingOrderSortingFunctionalityOfClientCodeColumn();
		test = extent.createTest(this.getClass().getName() + ": This method is used to verify the Ascending sorting functionality of Client Code column.");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to verify the decending sorting functionality of Client Code column.")
	public void verifyDecendingOrderSortingFunctionalityOfClientCodeColumn() throws IOException, InterruptedException {
		flag = clientfunctions.verifyDecendingOrderSortingFunctionalityOfClientCodeColumn();
		test = extent.createTest(this.getClass().getName() + ": This method is used to verify the decending sorting functionality of Client Code column.");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to verify the Ascending sorting functionality of Status column.")
	public void verifyAscendingOrderSortingFunctionalityOfStatusColumn() throws IOException, InterruptedException {
		flag = clientfunctions.verifyAscendingOrderSortingFunctionalityOfStatusColumn();
		test = extent.createTest(this.getClass().getName() + ": This method is used to verify the Ascending sorting functionality of Status column.");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to verify the decending sorting functionality of Status column.")
	public void verifyDecendingOrderSortingFunctionalityOfStatusColumn() throws IOException, InterruptedException {
		flag = clientfunctions.verifyDecendingOrderSortingFunctionalityOfStatusColumn();
		test = extent.createTest(this.getClass().getName() + ": This method is used to verify the decending sorting functionality of Status column.");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to verify the Ascending sorting functionality of Created Date column.")
	public void verifyAscendingOrderSortingFunctionalityOfCreatedDateColumn() throws IOException, InterruptedException {
		flag = clientfunctions.verifyAscendingOrderSortingFunctionalityOfCreatedDateColumn();
		test = extent.createTest(this.getClass().getName() + ": This method is used to verify the Ascending sorting functionality of Created Date column.");
		Assert.assertTrue(flag);
	}
	
	@Test(description = "This method is used to verify the decending sorting functionality of Created Date column.")
	public void verifyDecendingOrderSortingFunctionalityOfCreatedDateColumn() throws IOException, InterruptedException {
		flag = clientfunctions.verifyDecendingOrderSortingFunctionalityOfCreatedDateColumn();
		test = extent.createTest(this.getClass().getName() + ": This method is used to verify the decending sorting functionality of Created Date column.");
		Assert.assertTrue(flag);
	}
	

	@AfterClass(alwaysRun = true)
	public void afterClass() throws IOException {
		webDB.tearDown();
	}
	
}
