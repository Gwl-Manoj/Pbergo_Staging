package com.pbergo.commonfunctions;

import java.awt.AWTException;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.pbergo.base.WebDriverBase;
import com.pbergo.locators.EvaluatorLocators;
import com.pbergo.locators.PMReportsLocators;
import com.pbergo.locators.ProgramManagmentLocators;

public class PMReports {
	private WebDriverBase webDB;
	private boolean flag;
	private String email, temp;
	WebDriver driver;
	private JavascriptExecutor js;

	/**
	 * This method is used to verify the search
	 * 
	 * @param
	 * @return
	 * @throws IOException
	 * @throws InterruptedException
	 */
	public PMReports(WebDriverBase webDB) {
		this.webDB = webDB;
		js = (JavascriptExecutor) webDB.passingWebDriverInstance(webDB);
	}

	/**
	 * 
	 * This methods is used for the searching for the program management data
	 * 
	 * @author Dakshiyta
	 * @throws AWTException
	 */
	public boolean reportsearch() throws IOException, InterruptedException, AWTException {
		flag = webDB.waitElementByXPath(PMReportsLocators.REPORTS);
		if (flag) {
			webDB.actionMoveToElementByXPath(PMReportsLocators.REPORTS);
			webDB.clickBtnByXPath(PMReportsLocators.REPORTS);
			Thread.sleep(2000);
			flag = webDB.waitElementByXPath(PMReportsLocators.REPORTS_SEARCH);
			if (flag) {
				webDB.scrollToAnElement(PMReportsLocators.REPORTS_SEARCH_DATA);
////				
//				webDB.scrollToAnElement(EvaluatorLocators.ELMNT_REPORTSINREVIEW_SEARCHFIELD);
//				Thread.sleep(750);
				email = webDB.getTextByXPath(PMReportsLocators.REPORTS_SEARCH_DATA + "[" + 1 + "]");
				System.out.println("The email id is " + email);
				Thread.sleep(1000);
				webDB.clickBtnByXPath(PMReportsLocators.REPORTS_SEARCH);
				Thread.sleep(750);
				webDB.sendTextByXPath(PMReportsLocators.REPORTS_SEARCH, email);
				Thread.sleep(750);
				webDB.sendTextByXpath(PMReportsLocators.REPORTS_SEARCH, Keys.ENTER);
				Thread.sleep(2000);
				int totalemailids = webDB.countingSizeByXPath(PMReportsLocators.REPORTS_SEARCH_DATA);
				for (int i = 1; i <= totalemailids; i++) {
					String emailids = webDB.getTextByXPath(PMReportsLocators.REPORTS_SEARCH_DATA + "[" + i + "]");
					if (emailids.equals(email)) {
						System.out.println("The search result is same for result number " + i);
						Thread.sleep(2000);
						webDB.scrollRight(PMReportsLocators.REPORTS_SEARCH_DATA, KeyEvent.VK_RIGHT, 500);
//					Thread.sleep(2000);

						flag = true;
					} else {
						System.out.println("The search result is different for result number " + i);
						flag = false;
					}
					webDB.clickBtnByXPath(PMReportsLocators.REPORTS_SEARCH_DATA_VIEW);
					Thread.sleep(2000);
				}
			}
		}
//		download();
		return flag;

	}

	/**
	 * 
	 * This methods is used for the downloading the program management data set
	 * 
	 * @author Dakshiyta
	 * @throws AWTException
	 */
	public boolean download() throws InterruptedException, IOException {
		flag = webDB.waitElementByXPath(PMReportsLocators.REPORTS_SEARCH_DOWNLOAD_POPUP);
		if (flag) {
			webDB.clickBtnByXPath(PMReportsLocators.REPORTS_SEARCH_DATA_VIEW_DOWNLOAD);
			Thread.sleep(2000);
			webDB.clickBtnByXPath(PMReportsLocators.REPORTS_SEARCH_DATA_VIEW_CLOSE);
		}
//		History();
		return flag;

	}

	/**
	 * 
	 * This methods is used to view the history of the reports
	 * 
	 * @author Dakshiyta
	 * @throws AWTException
	 */
	public boolean History() throws InterruptedException, IOException, AWTException {
		flag = webDB.waitElementByXPath(PMReportsLocators.REPORTS_SEARCH_DATA_HISTORY);
		if (flag) {
			webDB.clickBtnByXPath(PMReportsLocators.REPORTS_SEARCH_DATA_HISTORY);
			Thread.sleep(2000);
			flag = webDB.waitElementByXPath(PMReportsLocators.REPORTS_SEARCH_HISTORY_POPUP);
			if (flag) {
				Thread.sleep(6000);
				webDB.clickBtnByXPath(PMReportsLocators.REPORTS_SEARCH_DATA_HISTORY_CLOSE);
				Thread.sleep(750);
				webDB.scrollRight(PMReportsLocators.REPORTS_SEARCH_DATA, KeyEvent.VK_RIGHT, 500);
			}
		}
//		editsurvey();
		return flag;

	}

	/**
	 * 
	 * This methods is used to editing the surveys in the reports section
	 * 
	 * @author Dakshiyta
	 * @throws AWTException
	 */
	public boolean editsurvey() throws InterruptedException, IOException {
		flag = webDB.waitElementByXPath(PMReportsLocators.REPORTS_SEARCH_DATA_EDIT);
		if (flag) {
			webDB.clickBtnByXPath(PMReportsLocators.REPORTS_SEARCH_DATA_EDIT);
			Thread.sleep(1500);
			webDB.SwitchToWindowByIndex(1);
				Thread.sleep(750);
				String pagetitle = webDB.getPageTitle();

				if (pagetitle.equals("PBErgo - Edit Report")) 
				{
					System.out.println("Swithced to frame and page title is " + pagetitle);
					Thread.sleep(1000);
					webDB.switchToiFrame("(//iframe[@webkitallowfullscreen='true'])[1]");
					Thread.sleep(1000);
					System.out.println("Switched to frame");
				for (int i = 1; i <= 17; i++) {

						webDB.scrollToAnElement(PMReportsLocators.REPORTS_SEARCH_EDIT_NEXT_BTN);
						webDB.clickBtnByXPath(PMReportsLocators.REPORTS_SEARCH_EDIT_NEXT_BTN);
						Thread.sleep(1500);

					}
					webDB.clickBtnByXPath(PMReportsLocators.REPORTS_SEARCH_EDIT_SUBMIT_BTN);
					flag = webDB.waitElementByXPath(PMReportsLocators.REPORTS_SEARCH_EDIT_SUCCESS_MSG);
					if (flag) {
						System.out.println("The survey is filled successfully");

					} else {
						System.out.println("The survey is not filled successfully");
					}
					webDB.CloseCurremtWindow();
					webDB.SwitchToWindowByIndex(0);
						Thread.sleep(750);
						String pagetitle1 = webDB.getPageTitle();

						if (pagetitle1.equals("PBErgo - Program Management - Reports")) {
							System.out.println("Swithced to main window and page title is " + pagetitle1);
							Thread.sleep(1000);
						}
						else
						{
							System.out.println("Page title is different i.e. "+pagetitle1);
							flag = false;
						}
					}
				else
				{
					System.out.println("Page title is different i.e. "+pagetitle);
					flag = false;
				}

				}
		return flag;

	}

	/**
	 * 
	 * This methods is used to add the comments/views from the comment section
	 * 
	 * @author Dakshiyta
	 * @throws AWTException
	 */
	public boolean addcomment() throws InterruptedException, IOException {
		webDB.clickBtnByXPath(PMReportsLocators.REPORTS_SEARCH_DATA_COMMENT);
		Thread.sleep(2000);
		flag = webDB.waitElementByXPath(PMReportsLocators.REPORTS_SEARCH_DATA_COMMENT_TXT_AREA);
		if (flag) {
			webDB.sendTextByXPath(PMReportsLocators.REPORTS_SEARCH_DATA_COMMENT_TXT_AREA, "This is the automated text");
			Thread.sleep(2000);
			webDB.scrollToAnElement(PMReportsLocators.REPORTS_SEARCH_DATA_COMMENT_BTN);
			webDB.clickBtnByXPath(PMReportsLocators.REPORTS_SEARCH_DATA_COMMENT_BTN);
			temp = webDB.getTextByXPath(PMReportsLocators.REPORTS_SEARCH_DATA_COMMENT_TOAST);
			System.out.println("Toast is: " + temp);
			if (temp.equals(PMReportsLocators.REPORTS_SEARCH_DATA_COMMENT_TOAST_TXT)) {
				System.out.println("Comment added successfully");
			}
		}
		return flag;

	}
	
	public boolean verifyPaginationFunctionality() throws InterruptedException, IOException {
//		webDB.NavigateTo("https://staging.pbergo.com/admin/all_user_group");
		Thread.sleep(3000);
		webDB.scrollToAnElement("(//p[@class='float-lg-start text-sm-center'])[1]");
		Thread.sleep(3000);
		flag = webDB.verifyPagination("(//p[@class='float-lg-start text-sm-center'])[1]",
				"(//li[@class='page-item next']/button)[1]",
				"//table[@class='table table-bordered table dataTable no-footer']//tbody//tr");
		return flag;

	}
	
	public boolean verifyAscendingOrderSortingFunctionalityOfDOE() throws InterruptedException {
		webDB.selectOptionByText("(//select[@name ='datatable_length'])[1]", "500");
		Thread.sleep(5000);
//		webDB.NavigateTo("https://staging.pbergo.com/user/ergo-eval-activity");
		webDB.scrollToAnElement(PMReportsLocators.DATEOFEVAL_COLUMNNAME_ONWHICHSORTINGAPPLIED);
		Thread.sleep(3000);
		flag = webDB.verifyAscendingOrderSortingFunctionalityOfDateColumn(
				PMReportsLocators.DATEOFEVAL_COLUMNDATA_ONWHICHSORTINGAPPLIED,
				PMReportsLocators.DATEOFEVAL_COLUMNNAME_ONWHICHSORTINGAPPLIED,
				PMReportsLocators.DATEOFEVAL_COLUMN_TOTALARROWCOUNT_ONWHICHSORTINGAPPLIED,
				PMReportsLocators.DATEOFEVAL_COLUMN_UPARROW_ONWHICHSORTINGAPPLIED);
		return flag;
	}

	public boolean verifyDecendingOrderSortingFunctionalityOfDOE() throws InterruptedException {
//		webDB.NavigateTo("https://staging.pbergo.com/user/ergo-eval-activity");
		Thread.sleep(3000);
		flag = webDB.verifyDecendingOrderSortingFunctionalityOfDateColumn(
				PMReportsLocators.DATEOFEVAL_COLUMNDATA_ONWHICHSORTINGAPPLIED,
				PMReportsLocators.DATEOFEVAL_COLUMNNAME_ONWHICHSORTINGAPPLIED);
		return flag;
	}
	
	public boolean verifyAscendingOrderSortingFunctionalityOfClienttName() throws InterruptedException {
//		webDB.NavigateTo("https://staging.pbergo.com/user/ergo-eval-activity");
		Thread.sleep(3000);
		flag = webDB.verifyAscendingOrderSortingFunctionality(
				PMReportsLocators.CLIENTNAME_COLUMNDATA_ONWHICHSORTINGAPPLIED,
				PMReportsLocators.CLIENTNAME_COLUMNNAME_ONWHICHSORTINGAPPLIED,
				PMReportsLocators.CLIENTNAME_COLUMN_TOTALARROWCOUNT_ONWHICHSORTINGAPPLIED,
				PMReportsLocators.CLIENTNAME_COLUMN_UPARROW_ONWHICHSORTINGAPPLIED);
		return flag;
	}

	public boolean verifyDecendingOrderSortingFunctionalityOfClientName() throws InterruptedException {
//		webDB.NavigateTo("https://staging.pbergo.com/user/ergo-eval-activity");
		Thread.sleep(3000);
		flag = webDB.verifyDecendingOrderSortingFunctionality(
				PMReportsLocators.CLIENTNAME_COLUMNDATA_ONWHICHSORTINGAPPLIED,
				PMReportsLocators.CLIENTNAME_COLUMNNAME_ONWHICHSORTINGAPPLIED);
		return flag;
	}
	
	public boolean verifyAscendingOrderSortingFunctionalityOfFirstName() throws InterruptedException {
//		webDB.NavigateTo("https://staging.pbergo.com/user/ergo-eval-activity");
		Thread.sleep(3000);
		flag = webDB.verifyAscendingOrderSortingFunctionality(
				PMReportsLocators.FIRSTNAME_COLUMNDATA_ONWHICHSORTINGAPPLIED,
				PMReportsLocators.FIRSTNAME_COLUMNNAME_ONWHICHSORTINGAPPLIED,
				PMReportsLocators.FIRSTNAME_COLUMN_TOTALARROWCOUNT_ONWHICHSORTINGAPPLIED,
				PMReportsLocators.FIRSTNAME_COLUMN_UPARROW_ONWHICHSORTINGAPPLIED);
		return flag;
	}

	public boolean verifyDecendingOrderSortingFunctionalityOfFirstName() throws InterruptedException {
//		webDB.NavigateTo("https://staging.pbergo.com/user/ergo-eval-activity");
		Thread.sleep(3000);
		flag = webDB.verifyDecendingOrderSortingFunctionality(
				PMReportsLocators.FIRSTNAME_COLUMNDATA_ONWHICHSORTINGAPPLIED,
				PMReportsLocators.FIRSTNAME_COLUMNNAME_ONWHICHSORTINGAPPLIED);
		return flag;
	}
	
	public boolean verifyAscendingOrderSortingFunctionalityOfLastName() throws InterruptedException {
//		webDB.NavigateTo("https://staging.pbergo.com/user/ergo-eval-activity");
		Thread.sleep(3000);
		flag = webDB.verifyAscendingOrderSortingFunctionality(
				PMReportsLocators.LASTNAME_COLUMNDATA_ONWHICHSORTINGAPPLIED,
				PMReportsLocators.LASTNAME_COLUMNNAME_ONWHICHSORTINGAPPLIED,
				PMReportsLocators.LASTNAME_COLUMN_TOTALARROWCOUNT_ONWHICHSORTINGAPPLIED,
				PMReportsLocators.LASTNAME_COLUMN_UPARROW_ONWHICHSORTINGAPPLIED);
		return flag;
	}

	public boolean verifyDecendingOrderSortingFunctionalityOfLastName() throws InterruptedException {
//		webDB.NavigateTo("https://staging.pbergo.com/user/ergo-eval-activity");
		Thread.sleep(3000);
		flag = webDB.verifyDecendingOrderSortingFunctionality(
				PMReportsLocators.LASTNAME_COLUMNDATA_ONWHICHSORTINGAPPLIED,
				PMReportsLocators.LASTNAME_COLUMNNAME_ONWHICHSORTINGAPPLIED);
		return flag;
	}
	public boolean verifyAscendingOrderSortingFunctionalityOfEmailAddress() throws InterruptedException {
//		webDB.NavigateTo("https://staging.pbergo.com/user/ergo-eval-activity");
		Thread.sleep(3000);
		flag = webDB.verifyAscendingOrderSortingFunctionality(
				PMReportsLocators.EMAILADDRESS_COLUMNDATA_ONWHICHSORTINGAPPLIED,
				PMReportsLocators.EMAILADDRESS_COLUMNNAME_ONWHICHSORTINGAPPLIED,
				PMReportsLocators.EMAILADDRESS_COLUMN_TOTALARROWCOUNT_ONWHICHSORTINGAPPLIED,
				PMReportsLocators.EMAILADDRESS_COLUMN_UPARROW_ONWHICHSORTINGAPPLIED);
		return flag;
	}

	public boolean verifyDecendingOrderSortingFunctionalityOfEmailAddress() throws InterruptedException {
//		webDB.NavigateTo("https://staging.pbergo.com/user/ergo-eval-activity");
		Thread.sleep(3000);
		flag = webDB.verifyDecendingOrderSortingFunctionality(
				PMReportsLocators.EMAILADDRESS_COLUMNDATA_ONWHICHSORTINGAPPLIED,
				PMReportsLocators.EMAILADDRESS_COLUMNNAME_ONWHICHSORTINGAPPLIED);
		return flag;
	}
	
	public boolean verifyAscendingOrderSortingFunctionalityOfEvaluatorEE() throws InterruptedException {
//		webDB.NavigateTo("https://staging.pbergo.com/user/ergo-eval-activity");
		Thread.sleep(3000);
		flag = webDB.verifyAscendingOrderSortingFunctionality(
				PMReportsLocators.EVALUATOR_COLUMNDATA_ONWHICHSORTINGAPPLIED,
				PMReportsLocators.EVALUATOR_COLUMNNAME_ONWHICHSORTINGAPPLIED,
				PMReportsLocators.EVALUATOR_COLUMN_TOTALARROWCOUNT_ONWHICHSORTINGAPPLIED,
				PMReportsLocators.EVALUATOR_COLUMN_UPARROW_ONWHICHSORTINGAPPLIED);
		return flag;
	}

	public boolean verifyDecendingOrderSortingFunctionalityOfEvaluator() throws InterruptedException {
//		webDB.NavigateTo("https://staging.pbergo.com/user/ergo-eval-activity");
		Thread.sleep(3000);
		flag = webDB.verifyDecendingOrderSortingFunctionality(
				PMReportsLocators.EVALUATOR_COLUMNDATA_ONWHICHSORTINGAPPLIED,
				PMReportsLocators.EVALUATOR_COLUMNNAME_ONWHICHSORTINGAPPLIED);
		return flag;
	}
	
	public boolean verifyAscendingOrderSortingFunctionalityOfStatus() throws InterruptedException {
//		webDB.NavigateTo("https://staging.pbergo.com/user/ergo-eval-activity");
		Thread.sleep(3000);
		flag = webDB.verifyAscendingOrderSortingFunctionality(
				PMReportsLocators.STATUS_COLUMNDATA_ONWHICHSORTINGAPPLIED,
				PMReportsLocators.STATUS_COLUMNNAME_ONWHICHSORTINGAPPLIED,
				PMReportsLocators.STATUS_COLUMN_TOTALARROWCOUNT_ONWHICHSORTINGAPPLIED,
				PMReportsLocators.STATUS_COLUMN_UPARROW_ONWHICHSORTINGAPPLIED);
		return flag;
	}

	public boolean verifyDecendingOrderSortingFunctionalityOfStatus() throws InterruptedException {
//		webDB.NavigateTo("https://staging.pbergo.com/user/ergo-eval-activity");
		Thread.sleep(3000);
		flag = webDB.verifyDecendingOrderSortingFunctionality(
				PMReportsLocators.STATUS_COLUMNDATA_ONWHICHSORTINGAPPLIED,
				PMReportsLocators.STATUS_COLUMNNAME_ONWHICHSORTINGAPPLIED);
		return flag;
	}
}
