package com.pbergo.commonfunctions;

import java.awt.AWTException;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.pbergo.base.WebDriverBase;
import com.pbergo.locators.EmployeeSearchLocators;
import com.pbergo.locators.FollowUpFeedbackLocators;
import com.pbergo.locators.ProgramOverviewLocators;

public class EmployeeSearchFunctions {
	private WebDriverBase webDB;
	private boolean flag;
	private String temp, email;
	WebDriver driver;

	public EmployeeSearchFunctions(WebDriverBase webDB) {
		this.webDB = webDB;

	}

	/**
	 * @param userPermittedSection [Passing options from the Menu link]
	 * @return
	 * @throws IOException
	 * @throws InterruptedException
	 * @throws AWTException 
	 */
	
	/**
	 * 
	 * This method is for the employee search section in which the filter, tabs, download all button, features are executed. 
	 */
 public boolean openEmployeeSearchLink() throws IOException, InterruptedException, AWTException {
	 Robot robot = new Robot();
		flag = webDB.waitElementByXPath(EmployeeSearchLocators.EMPLOYEE_SEARCH);
		if (flag) {
			webDB.clickBtnByXPath(EmployeeSearchLocators.EMPLOYEE_SEARCH);
			Thread.sleep(3000);
			flag = webDB.waitElementByXPath(EmployeeSearchLocators.EMPLOYEE_SEARCH_SEARCHBAR);
			if(flag) {
				webDB.clickBtnByXPath(EmployeeSearchLocators.EMPLOYEE_SEARCH_STATUS_DRPDWN);
				Thread.sleep(2000);
				robot.keyPress(KeyEvent.VK_DOWN);
				Thread.sleep(2000);
				robot.keyPress(KeyEvent.VK_ENTER);
				Thread.sleep(3000);
				flag = webDB.waitElementByXPath(EmployeeSearchLocators.EMPLOYEE_SEARCH_FILTER_ACTIVE_DATA);
				if(flag) {
					webDB.clickBtnByXPath(EmployeeSearchLocators.EMPLOYEE_SEARCH_STATUS_DRPDWN);
					Thread.sleep(2000);
					robot.keyPress(KeyEvent.VK_DOWN);
					Thread.sleep(2000);
					robot.keyPress(KeyEvent.VK_ENTER);
					Thread.sleep(3000);
					flag = webDB.waitElementByXPath(EmployeeSearchLocators.EMPLOYEE_SEARCH_FILTER_INACTIVE_DATA);
					if(flag) {
						webDB.clickBtnByXPath(EmployeeSearchLocators.EMPLOYEE_SEARCH_STATUS_DRPDWN);
						Thread.sleep(2000);
						robot.keyPress(KeyEvent.VK_UP);
						Thread.sleep(2000);
						robot.keyPress(KeyEvent.VK_UP);
						Thread.sleep(2000);
						robot.keyPress(KeyEvent.VK_ENTER);
						Thread.sleep(3000);
						webDB.clickBtnByXPath(EmployeeSearchLocators.EMPLOYEE_SEARCH_CARD_BTN);
						Thread.sleep(2000);
						webDB.clickBtnByXPath(EmployeeSearchLocators.EMPLOYEE_SEARCH_LIST_BTN);
						Thread.sleep(2000);
						webDB.clickBtnByXPath(EmployeeSearchLocators.EMPLOYEE_SEARCH_DOWNLOAD_ALL_BTN);
						Thread.sleep(2000);
						flag = webDB.waitElementByXPath(EmployeeSearchLocators.EMPLOYEE_SEARCH_DOWNLOAD_POPUP);
						if(flag) {
							webDB.clickBtnByXPath(EmployeeSearchLocators.EMPLOYEE_SEARCH_DOWNLOAD_POPUP);
							Thread.sleep(3000);
//							programsearch();
						}
					}
				}
				
			}
		}
		return flag;
	}

	/**
	 * 
	 * This method is for the searching of the employees.  
	 */
 public boolean programsearch() throws IOException, InterruptedException {

		flag = webDB.waitElementByXPath(EmployeeSearchLocators.EMPLOYEE_SEARCH_SEARCHBAR);
		if (flag) {
			webDB.scrollToAnElement(EmployeeSearchLocators.EMPLOYEE_SEARCH_SEARCHBAR_DATA);
////				
//				webDB.scrollToAnElement(EvaluatorLocators.ELMNT_REPORTSINREVIEW_SEARCHFIELD);
				Thread.sleep(750);
			email = webDB.getTextByXPath(
					EmployeeSearchLocators.EMPLOYEE_SEARCH_SEARCHBAR_DATA + "[" + 1 + "]");
			System.out.println("The email id is " + email);
			Thread.sleep(1000);
			webDB.clickBtnByXPath(EmployeeSearchLocators.EMPLOYEE_SEARCH_SEARCHBAR);
			Thread.sleep(750);
			webDB.sendTextByXPath(EmployeeSearchLocators.EMPLOYEE_SEARCH_SEARCHBAR, email);
			Thread.sleep(750);
			webDB.sendTextByXpath(EmployeeSearchLocators.EMPLOYEE_SEARCH_SEARCHBAR,
					Keys.ENTER);
			Thread.sleep(2000);
			int totalemailids = webDB
					.countingSizeByXPath(EmployeeSearchLocators.EMPLOYEE_SEARCH_SEARCHBAR_DATA);
//			for (int i = 1; i <= totalemailids; i++) {
				String emailids = webDB.getTextByXPath(
						EmployeeSearchLocators.EMPLOYEE_SEARCH_SEARCHBAR_DATA + "[" + 1 + "]");
				if (emailids.equals(email)) {
					System.out.println("The search result is same for result number " + 1);
					Thread.sleep(2000);
					webDB.clickBtnByXPath(EmployeeSearchLocators.EMPLOYEE_SEARCH_SEARCHBAR_DATA_VIEW_BTN);
					Thread.sleep(2000);
					flag = true;
					
				} else {
					System.out.println("The search result is different for result number " + 1);
					flag = false;
				}
//			}
		}
//		selfassessmentsearch();
		return flag;

	}
 
 /**
	 * 
	 * This method is including the self assessment section in which the searching
	 * and downloading the data set action is performed
	 */
	public boolean selfassessmentsearch() throws IOException, InterruptedException {
		flag = webDB.waitElementByXPath(EmployeeSearchLocators.EMPLOYEE_SEARCH_SELF_ASSESSMENT_SEARCH);
		if (flag) {
			String name = webDB.getTextByXPath(EmployeeSearchLocators.EMPLOYEE_SEARCH_SELF_ASSESSMENT_NAME);
			System.out.println("The fetched name is " + name);
			Thread.sleep(2000);
			webDB.clickBtnByXPath(EmployeeSearchLocators.EMPLOYEE_SEARCH_SELF_ASSESSMENT_SEARCH);
			Thread.sleep(750);
			webDB.sendTextByXPath(EmployeeSearchLocators.EMPLOYEE_SEARCH_SELF_ASSESSMENT_SEARCH, name);
			Thread.sleep(750);
			webDB.sendTextByXpath(EmployeeSearchLocators.EMPLOYEE_SEARCH_SELF_ASSESSMENT_SEARCH, Keys.ENTER);
			Thread.sleep(2000);
			flag = webDB.waitElementByXPath(EmployeeSearchLocators.EMPLOYEE_SEARCH_SELF_ASSESSMENT_DATASET);
			if (flag) {
				webDB.clickBtnByXPath(EmployeeSearchLocators.EMPLOYEE_SEARCH_SELF_ASSESSMENT_DATASET);
				Thread.sleep(2000);
				flag = webDB.waitElementByXPath(
						EmployeeSearchLocators.EMPLOYEE_SEARCH_SELF_ASSESSMENT_DATASET_DOWNLOAD);
				if (flag) {
					webDB.clickBtnByXPath(EmployeeSearchLocators.EMPLOYEE_SEARCH_SELF_ASSESSMENT_DATASET_DOWNLOAD);
					Thread.sleep(2000);
					webDB.clickBtnByXPath(
							EmployeeSearchLocators.EMPLOYEE_SEARCH_SELF_ASSESSMENT_DATASET_DOWNLOAD_CLOSE);
					Thread.sleep(2000);
//					selfassessmenthistory();
				}
			}

		}

		return flag;

	}
	
	/**
	 * 
	 * This method is performing the click and closing action on the history
	 */
	public boolean selfassessmenthistory() throws IOException, InterruptedException {
		flag = webDB.waitElementByXPath(EmployeeSearchLocators.EMPLOYEE_SEARCH_SELF_ASSESSMENT_HISTORY);
		if (flag) {
			webDB.clickBtnByXPath(EmployeeSearchLocators.EMPLOYEE_SEARCH_SELF_ASSESSMENT_HISTORY);
			Thread.sleep(2000);
			flag = webDB.waitElementByXPath(EmployeeSearchLocators.EMPLOYEE_SEARCH_SELF_ASSESSMENT_HISTORY_CLOSE);
			if (flag) {
				webDB.clickBtnByXPath(EmployeeSearchLocators.EMPLOYEE_SEARCH_SELF_ASSESSMENT_HISTORY_CLOSE);
				Thread.sleep(1500);
//				ergoevalsearch();
			}
		}
		return flag;

	}
	/**
	 * 
	 * This method is including the ergo eval section in which the searching
	 * and downloading the data set action is performed
	 */
	public boolean ergoevalsearch() throws IOException, InterruptedException {
		webDB.scrollToAnElement(EmployeeSearchLocators.EMPLOYEE_SEARCH_ERGO_EVALS_SEARCH);
		Thread.sleep(2000);
		flag = webDB.waitElementByXPath(EmployeeSearchLocators.EMPLOYEE_SEARCH_ERGO_EVALS_SEARCH);
		if (flag) {
			String name = webDB.getTextByXPath(EmployeeSearchLocators.EMPLOYEE_SEARCH_ERGO_EVALS_NAME);
			System.out.println("The fetched name is " + name);
			Thread.sleep(2000);
			webDB.clickBtnByXPath(EmployeeSearchLocators.EMPLOYEE_SEARCH_ERGO_EVALS_SEARCH);
			Thread.sleep(750);
			webDB.sendTextByXPath(EmployeeSearchLocators.EMPLOYEE_SEARCH_ERGO_EVALS_SEARCH, name);
			Thread.sleep(750);
			webDB.sendTextByXpath(EmployeeSearchLocators.EMPLOYEE_SEARCH_ERGO_EVALS_SEARCH, Keys.ENTER);
			Thread.sleep(2500);
			webDB.scrolldown(500);
			Thread.sleep(750);
			flag = webDB.waitElementByXPath(EmployeeSearchLocators.EMPLOYEE_SEARCH_ERGO_EVALS_DATASET);
			if (flag) {
//				webDB.scrollToAnElement(EmployeeSearchLocators.EMPLOYEE_SEARCH_ERGO_EVALS_DATASET);
//				Thread.sleep(750);
				
				webDB.clickBtnByXPath(EmployeeSearchLocators.EMPLOYEE_SEARCH_ERGO_EVALS_DATASET);
				Thread.sleep(2000);
				flag = webDB.waitElementByXPath(
						EmployeeSearchLocators.EMPLOYEE_SEARCH_ERGO_EVALS_DOWNLOAD_BTN);
				if (flag) {
					webDB.clickBtnByXPath(EmployeeSearchLocators.EMPLOYEE_SEARCH_ERGO_EVALS_DOWNLOAD_BTN);
					Thread.sleep(2000);
					webDB.clickBtnByXPath(
							EmployeeSearchLocators.EMPLOYEE_SEARCH_ERGO_EVALS_DATASET_CLOSE);
					Thread.sleep(2000);
//					ergoevalhistory();
				}
			}

		}

		return flag;

	}
	/**
	 * 
	 * This method is performing the click and closing action on the history
	 */
	public boolean ergoevalhistory() throws IOException, InterruptedException {
		flag = webDB.waitElementByXPath(EmployeeSearchLocators.EMPLOYEE_SEARCH_ERGO_EVALS_HISTORY);
		if (flag) {
			webDB.clickBtnByXPath(EmployeeSearchLocators.EMPLOYEE_SEARCH_ERGO_EVALS_HISTORY);
			Thread.sleep(2000);
			flag = webDB.waitElementByXPath(EmployeeSearchLocators.EMPLOYEE_SEARCH_ERGO_EVALS_HISTORY_CLOSE);
			if (flag) {
				webDB.clickBtnByXPath(EmployeeSearchLocators.EMPLOYEE_SEARCH_ERGO_EVALS_HISTORY_CLOSE);
				Thread.sleep(2000);
//				followupssearch();
			}
		}
		return flag;

	}
	/**
	 * 
	 * This method is including the follow ups section in which the searching
	 * and downloading the data set action is performed
	 */
	public boolean followupssearch() throws IOException, InterruptedException {
		webDB.scrollToAnElement(EmployeeSearchLocators.EMPLOYEE_SEARCH_FOLLOW_UPS_TEXT);
		Thread.sleep(2000);
		flag = webDB.waitElementByXPath(EmployeeSearchLocators.EMPLOYEE_SEARCH_FOLLOW_UP_SEARCH);
		if (flag) {
			String name = webDB.getTextByXPath(EmployeeSearchLocators.EMPLOYEE_SEARCH_FOLLOW_UPS_NAME);
			System.out.println("The fetched name is " + name);
			Thread.sleep(2000);
			webDB.clickBtnByXPath(EmployeeSearchLocators.EMPLOYEE_SEARCH_FOLLOW_UP_SEARCH);
			Thread.sleep(750);
			webDB.sendTextByXPath(EmployeeSearchLocators.EMPLOYEE_SEARCH_FOLLOW_UP_SEARCH, name);
			Thread.sleep(750);
			webDB.sendTextByXpath(EmployeeSearchLocators.EMPLOYEE_SEARCH_FOLLOW_UP_SEARCH, Keys.ENTER);
			Thread.sleep(2000);
			webDB.scrollToAnElement(EmployeeSearchLocators.EMPLOYEE_SEARCH_FOLLOW_UPS_DATASET);
			Thread.sleep(750);
			flag = webDB.waitElementByXPath(EmployeeSearchLocators.EMPLOYEE_SEARCH_FOLLOW_UPS_DATASET);
			if (flag) {
				webDB.clickBtnByXPath(EmployeeSearchLocators.EMPLOYEE_SEARCH_FOLLOW_UPS_DATASET);
				Thread.sleep(2000);
				flag = webDB.waitElementByXPath(
						EmployeeSearchLocators.EMPLOYEE_SEARCH_FOLLOW_UPS_DOWNLOAD_BTN);
				if (flag) {
					webDB.clickBtnByXPath(EmployeeSearchLocators.EMPLOYEE_SEARCH_FOLLOW_UPS_DOWNLOAD_BTN);
					Thread.sleep(2000);
					webDB.clickBtnByXPath(
							EmployeeSearchLocators.EMPLOYEE_SEARCH_ERGO_EVALS_DATASET_CLOSE);
					Thread.sleep(2000);
//					followupshistory();
				}
			}

		}

		return flag;

	}
	/**
	 * 
	 * This method is performing the click and closing action on the history
	 */
	public boolean followupshistory() throws IOException, InterruptedException {
		flag = webDB.waitElementByXPath(EmployeeSearchLocators.EMPLOYEE_SEARCH_FOLLOW_UPS_HISTORY);
		if (flag) {
			webDB.clickBtnByXPath(EmployeeSearchLocators.EMPLOYEE_SEARCH_FOLLOW_UPS_HISTORY);
			Thread.sleep(2000);
			flag = webDB.waitElementByXPath(EmployeeSearchLocators.EMPLOYEE_SEARCH_ERGO_EVALS_HISTORY_CLOSE);
			if (flag) {
				webDB.clickBtnByXPath(EmployeeSearchLocators.EMPLOYEE_SEARCH_ERGO_EVALS_HISTORY_CLOSE);
				Thread.sleep(2000);
//				schedulerequestformsearch();
			}
		}
		return flag;

	}
	/**
	 * 
	 * This method is including the schedule request form section in which the searching
	 * and downloading the data set action is performed
	 */
	public boolean schedulerequestformsearch() throws IOException, InterruptedException {
		
		flag = webDB.waitElementByXPath(EmployeeSearchLocators.EMPLOYEE_SEARCH_SCHEDULE_REQUEST_FORM_SEARCH);
		
		if (flag) {
			webDB.scrollToAnElement(EmployeeSearchLocators.EMPLOYEE_SEARCH_SCHEDULE_REQUEST_FORM_SEARCH);
			Thread.sleep(2000);
			String name = webDB.getTextByXPath(EmployeeSearchLocators.EMPLOYEE_SEARCH_SCHEDULE_REQUEST_FORM_NAME);
			System.out.println("The fetched name is " + name);
			Thread.sleep(2000);
			webDB.clickBtnByXPath(EmployeeSearchLocators.EMPLOYEE_SEARCH_SCHEDULE_REQUEST_FORM_SEARCH);
			Thread.sleep(750);
			webDB.sendTextByXPath(EmployeeSearchLocators.EMPLOYEE_SEARCH_SCHEDULE_REQUEST_FORM_SEARCH, name);
			Thread.sleep(750);
			webDB.sendTextByXpath(EmployeeSearchLocators.EMPLOYEE_SEARCH_SCHEDULE_REQUEST_FORM_SEARCH, Keys.ENTER);
			Thread.sleep(2000);
			webDB.scrollToAnElement(EmployeeSearchLocators.EMPLOYEE_SEARCH_SCHEDULE_REQUEST_FORM_DATASET);
			Thread.sleep(750);
			flag = webDB.waitElementByXPath(EmployeeSearchLocators.EMPLOYEE_SEARCH_SCHEDULE_REQUEST_FORM_DATASET);
			if (flag) {
				webDB.clickBtnByXPath(EmployeeSearchLocators.EMPLOYEE_SEARCH_SCHEDULE_REQUEST_FORM_DATASET);
				Thread.sleep(2000);
				flag = webDB.waitElementByXPath(
						EmployeeSearchLocators.EMPLOYEE_SEARCH_FOLLOW_UPS_DOWNLOAD_BTN);
				if (flag) {
					webDB.clickBtnByXPath(EmployeeSearchLocators.EMPLOYEE_SEARCH_FOLLOW_UPS_DOWNLOAD_BTN);
					Thread.sleep(2000);
					webDB.clickBtnByXPath(
							EmployeeSearchLocators.EMPLOYEE_SEARCH_ERGO_EVALS_DATASET_CLOSE);
					Thread.sleep(2500);
//					schedulerequestformhistory();
				}
			}

		}

		return flag;

	}
	/**
	 * 
	 * This method is performing the click and closing action on the history
	 */
	public boolean schedulerequestformhistory() throws IOException, InterruptedException {
		flag = webDB.waitElementByXPath(EmployeeSearchLocators.EMPLOYEE_SEARCH_SCHEDULE_REQUEST_FORM_HISTORY);
		if (flag) {
			webDB.clickBtnByXPath(EmployeeSearchLocators.EMPLOYEE_SEARCH_SCHEDULE_REQUEST_FORM_HISTORY);
			Thread.sleep(2000);
			flag = webDB.waitElementByXPath(EmployeeSearchLocators.EMPLOYEE_SEARCH_ERGO_EVALS_HISTORY_CLOSE);
			if (flag) {
				webDB.clickBtnByXPath(EmployeeSearchLocators.EMPLOYEE_SEARCH_ERGO_EVALS_HISTORY_CLOSE);
				Thread.sleep(2000);
			}
		}
		return flag;

	}
	
	public boolean verifyPaginationFunctionality() throws InterruptedException, IOException {
		webDB.getBack();
//		webDB.NavigateTo("https://staging.pbergo.com/admin/all_user_group");
		Thread.sleep(3000);
		webDB.scrollToAnElement(ProgramOverviewLocators.Pagination);
		Thread.sleep(3000);
		flag = webDB.verifyPagination("(//p[@class='float-lg-start text-sm-center'])[1]",
				"(//li[@class='page-item next']/button)[1]",
				"//table[@class='table table-bordered table dataTable no-footer']//tbody//tr");
		return flag;

	}

	public boolean verifyAscendingOrderSortingFunctionalityOfFirstName() throws InterruptedException {
		webDB.selectOptionByText("(//select[@name ='datatable_length'])[1]", "500");
		Thread.sleep(5000);
//		webDB.NavigateTo("https://staging.pbergo.com/user/ergo-eval-activity");
		Thread.sleep(3000);
		flag = webDB.verifyAscendingOrderSortingFunctionality(
				EmployeeSearchLocators.FIRSTNAME_COLUMNDATA_ONWHICHSORTINGAPPLIED,
				EmployeeSearchLocators.FIRSTNAME_COLUMNNAME_ONWHICHSORTINGAPPLIED,
				EmployeeSearchLocators.FIRSTNAME_COLUMN_TOTALARROWCOUNT_ONWHICHSORTINGAPPLIED,
				EmployeeSearchLocators.FIRSTNAME_COLUMN_UPARROW_ONWHICHSORTINGAPPLIED);
		return flag;
	}

	public boolean verifyDecendingOrderSortingFunctionalityOfFirstName() throws InterruptedException {
//		webDB.NavigateTo("https://staging.pbergo.com/user/ergo-eval-activity");
		Thread.sleep(3000);
		flag = webDB.verifyDecendingOrderSortingFunctionality(
				EmployeeSearchLocators.FIRSTNAME_COLUMNDATA_ONWHICHSORTINGAPPLIED,
				EmployeeSearchLocators.FIRSTNAME_COLUMNNAME_ONWHICHSORTINGAPPLIED);
		return flag;
	}
	
	public boolean verifyAscendingOrderSortingFunctionalityOfLastName() throws InterruptedException {
//		webDB.NavigateTo("https://staging.pbergo.com/user/ergo-eval-activity");
		Thread.sleep(3000);
		flag = webDB.verifyAscendingOrderSortingFunctionality(
				EmployeeSearchLocators.LASTNAME_COLUMNDATA_ONWHICHSORTINGAPPLIED,
				EmployeeSearchLocators.LASTNAME_COLUMNNAME_ONWHICHSORTINGAPPLIED,
				EmployeeSearchLocators.LASTNAME_COLUMN_TOTALARROWCOUNT_ONWHICHSORTINGAPPLIED,
				EmployeeSearchLocators.LASTNAME_COLUMN_UPARROW_ONWHICHSORTINGAPPLIED);
		return flag;
	}

	public boolean verifyDecendingOrderSortingFunctionalityOfLastName() throws InterruptedException {
//		webDB.NavigateTo("https://staging.pbergo.com/user/ergo-eval-activity");
		Thread.sleep(3000);
		flag = webDB.verifyDecendingOrderSortingFunctionality(
				EmployeeSearchLocators.LASTNAME_COLUMNDATA_ONWHICHSORTINGAPPLIED,
				EmployeeSearchLocators.LASTNAME_COLUMNNAME_ONWHICHSORTINGAPPLIED);
		return flag;
	}
	public boolean verifyAscendingOrderSortingFunctionalityOfEmailAddress() throws InterruptedException {
//		webDB.NavigateTo("https://staging.pbergo.com/user/ergo-eval-activity");
		Thread.sleep(3000);
		flag = webDB.verifyAscendingOrderSortingFunctionality(
				EmployeeSearchLocators.EMAILADDRESS_COLUMNDATA_ONWHICHSORTINGAPPLIED,
				EmployeeSearchLocators.EMAILADDRESS_COLUMNNAME_ONWHICHSORTINGAPPLIED,
				EmployeeSearchLocators.EMAILADDRESS_COLUMN_TOTALARROWCOUNT_ONWHICHSORTINGAPPLIED,
				EmployeeSearchLocators.EMAILADDRESS_COLUMN_UPARROW_ONWHICHSORTINGAPPLIED);
		return flag;
	}

	public boolean verifyDecendingOrderSortingFunctionalityOfEmailAddress() throws InterruptedException {
//		webDB.NavigateTo("https://staging.pbergo.com/user/ergo-eval-activity");
		Thread.sleep(3000);
		flag = webDB.verifyDecendingOrderSortingFunctionality(
				EmployeeSearchLocators.EMAILADDRESS_COLUMNDATA_ONWHICHSORTINGAPPLIED,
				EmployeeSearchLocators.EMAILADDRESS_COLUMNNAME_ONWHICHSORTINGAPPLIED);
		return flag;
	}
	
	public boolean verifyAscendingOrderSortingFunctionalityOfRegion() throws InterruptedException {
//		webDB.NavigateTo("https://staging.pbergo.com/user/ergo-eval-activity");
		Thread.sleep(3000);
		flag = webDB.verifyAscendingOrderSortingFunctionality(
				EmployeeSearchLocators.REGION_COLUMNDATA_ONWHICHSORTINGAPPLIED,
				EmployeeSearchLocators.REGION_COLUMNNAME_ONWHICHSORTINGAPPLIED,
				EmployeeSearchLocators.REGION_COLUMN_TOTALARROWCOUNT_ONWHICHSORTINGAPPLIED,
				EmployeeSearchLocators.REGION_COLUMN_UPARROW_ONWHICHSORTINGAPPLIED);
		return flag;
	}

	public boolean verifyDecendingOrderSortingFunctionalityOfRegion() throws InterruptedException {
//		webDB.NavigateTo("https://staging.pbergo.com/user/ergo-eval-activity");
		Thread.sleep(3000);
		flag = webDB.verifyDecendingOrderSortingFunctionality(
				EmployeeSearchLocators.REGION_COLUMNDATA_ONWHICHSORTINGAPPLIED,
				EmployeeSearchLocators.REGION_COLUMNNAME_ONWHICHSORTINGAPPLIED);
		return flag;
	}
}