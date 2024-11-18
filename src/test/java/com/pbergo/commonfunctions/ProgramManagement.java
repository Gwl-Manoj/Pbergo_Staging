package com.pbergo.commonfunctions;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.pbergo.base.WebDriverBase;
import com.pbergo.locators.EvaluatorLocators;
import com.pbergo.locators.ProgramManagmentLocators;

public class ProgramManagement {

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
	public ProgramManagement(WebDriverBase webDB) {
		this.webDB = webDB;
		js = (JavascriptExecutor) webDB.passingWebDriverInstance(webDB);
	}

	/**
	 * 
	 * This methods is used for the parent program management for the searching and
	 * went to PBE lab demo data
	 */
	public boolean programManagement() throws InterruptedException, IOException {
		webDB.scrollToAnElement(ProgramManagmentLocators.PROGRAM_MANAGEMENT);
		Thread.sleep(2000);
		webDB.clickBtnByXPath(ProgramManagmentLocators.PROGRAM_MANAGEMENT);
		Thread.sleep(2000);
		flag = webDB.waitElementByXPath(ProgramManagmentLocators.PROGRAM_MANAGEMENT_TEXT);
		if (flag) {
			webDB.scrollToAnElement(ProgramManagmentLocators.PROGRAM_MANAGEMENT_DATA);
			Thread.sleep(2000);
			temp = webDB.getTextByXPath(ProgramManagmentLocators.PROGRAM_MANAGEMENT_DATA);
			System.out.println("The fetched data is " + temp);
			Thread.sleep(1000);
			webDB.getPageRefresh();
//			webDB.scrollToAnElement(ProgramManagmentLocators.PROGRAM_MANAGEMENT_SEARCH);
//			Thread.sleep(2000);
			flag = webDB.waitElementByXPath(ProgramManagmentLocators.PROGRAM_MANAGEMENT_SEARCH);
			if (flag) {
				webDB.clickBtnByXPath(ProgramManagmentLocators.PROGRAM_MANAGEMENT_SEARCH);
				Thread.sleep(750);
				webDB.sendTextByXPath(ProgramManagmentLocators.PROGRAM_MANAGEMENT_SEARCH, temp);
				Thread.sleep(750);
				webDB.sendTextByXpath(ProgramManagmentLocators.PROGRAM_MANAGEMENT_SEARCH, Keys.ENTER);
				Thread.sleep(2000);
				flag = webDB.waitElementByXPath(ProgramManagmentLocators.PROGRAM_MANAGEMENT_DATA_VIEW);
				if (flag) {
					webDB.clickBtnByXPath(ProgramManagmentLocators.PROGRAM_MANAGEMENT_DATA_VIEW);
					Thread.sleep(2000);
					programsearch();
				}
			}
		}
		return flag;

	}

	/**
	 * 
	 * This methods is used for the searching for the program management data
	 */
	public boolean programsearch() throws IOException, InterruptedException {

		flag = webDB.waitElementByXPath(ProgramManagmentLocators.PROGRAM_MANAGEMENT_DATA_VIEW_PBE_LAB_DEMO_SEARCH);
		if (flag) {
			webDB.scrollToAnElement(ProgramManagmentLocators.PROGRAM_MANAGEMENT_DATA_VIEW_PBE_LAB_DEMO_DATA);
////				
//				webDB.scrollToAnElement(EvaluatorLocators.ELMNT_REPORTSINREVIEW_SEARCHFIELD);
//				Thread.sleep(750);
			email = webDB.getTextByXPath(
					ProgramManagmentLocators.PROGRAM_MANAGEMENT_DATA_VIEW_PBE_LAB_DEMO_DATA + "[" + 1 + "]");
			System.out.println("The email id is " + email);
			Thread.sleep(1000);
			webDB.clickBtnByXPath(ProgramManagmentLocators.PROGRAM_MANAGEMENT_DATA_VIEW_PBE_LAB_DEMO_SEARCH);
			Thread.sleep(750);
			webDB.sendTextByXPath(ProgramManagmentLocators.PROGRAM_MANAGEMENT_DATA_VIEW_PBE_LAB_DEMO_SEARCH, email);
			Thread.sleep(750);
			webDB.sendTextByXpath(ProgramManagmentLocators.PROGRAM_MANAGEMENT_DATA_VIEW_PBE_LAB_DEMO_SEARCH,
					Keys.ENTER);
			Thread.sleep(2000);
			int totalemailids = webDB
					.countingSizeByXPath(ProgramManagmentLocators.PROGRAM_MANAGEMENT_DATA_VIEW_PBE_LAB_DEMO_DATA);
			for (int i = 1; i <= totalemailids; i++) {
				String emailids = webDB.getTextByXPath(
						ProgramManagmentLocators.PROGRAM_MANAGEMENT_DATA_VIEW_PBE_LAB_DEMO_DATA + "[" + i + "]");
				if (emailids.equals(email)) {
					System.out.println("The search result is same for result number " + i);
					Thread.sleep(2000);
					webDB.clickBtnByXPath(ProgramManagmentLocators.PROGRAM_MANAGEMENT_DATA_VIEW_PBE_LAB_DEMO_VIEW);
					Thread.sleep(2000);
					flag = true;
				} else {
					System.out.println("The search result is different for result number " + i);
					flag = false;
				}
			}
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
		flag = webDB.waitElementByXPath(ProgramManagmentLocators.PROGRAM_MANAGEMENT_SELF_ASSESSMENT_SEARCH);
		if (flag) {
			String name = webDB.getTextByXPath(ProgramManagmentLocators.PROGRAM_MANAGEMENT_SELF_ASSESSMENT_NAME);
			System.out.println("The fetched name is " + name);
			Thread.sleep(2000);
			webDB.clickBtnByXPath(ProgramManagmentLocators.PROGRAM_MANAGEMENT_SELF_ASSESSMENT_SEARCH);
			Thread.sleep(750);
			webDB.sendTextByXPath(ProgramManagmentLocators.PROGRAM_MANAGEMENT_SELF_ASSESSMENT_SEARCH, name);
			Thread.sleep(750);
			webDB.sendTextByXpath(ProgramManagmentLocators.PROGRAM_MANAGEMENT_SELF_ASSESSMENT_SEARCH, Keys.ENTER);
			Thread.sleep(2000);
			flag = webDB.waitElementByXPath(ProgramManagmentLocators.PROGRAM_MANAGEMENT_SELF_ASSESSMENT_DATASET);
			if (flag) {
				webDB.clickBtnByXPath(ProgramManagmentLocators.PROGRAM_MANAGEMENT_SELF_ASSESSMENT_DATASET);
				Thread.sleep(2000);
				flag = webDB.waitElementByXPath(
						ProgramManagmentLocators.PROGRAM_MANAGEMENT_SELF_ASSESSMENT_DATASET_DOWNLOAD);
				if (flag) {
					webDB.clickBtnByXPath(ProgramManagmentLocators.PROGRAM_MANAGEMENT_SELF_ASSESSMENT_DATASET_DOWNLOAD);
					Thread.sleep(2000);
					webDB.clickBtnByXPath(
							ProgramManagmentLocators.PROGRAM_MANAGEMENT_SELF_ASSESSMENT_DATASET_DOWNLOAD_CLOSE);
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
		flag = webDB.waitElementByXPath(ProgramManagmentLocators.PROGRAM_MANAGEMENT_SELF_ASSESSMENT_HISTORY);
		if (flag) {
			webDB.clickBtnByXPath(ProgramManagmentLocators.PROGRAM_MANAGEMENT_SELF_ASSESSMENT_HISTORY);
			Thread.sleep(2000);
			flag = webDB.waitElementByXPath(ProgramManagmentLocators.PROGRAM_MANAGEMENT_SELF_ASSESSMENT_HISTORY_CLOSE);
			if (flag) {
				webDB.clickBtnByXPath(ProgramManagmentLocators.PROGRAM_MANAGEMENT_SELF_ASSESSMENT_HISTORY_CLOSE);
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
		webDB.scrollToAnElement(ProgramManagmentLocators.PROGRAM_MANAGEMENT_ERGO_EVALS_TEXT);
		Thread.sleep(2000);
		flag = webDB.waitElementByXPath(ProgramManagmentLocators.PROGRAM_MANAGEMENT_ERGO_EVALS_SEARCH);
		if (flag) {
			String name = webDB.getTextByXPath(ProgramManagmentLocators.PROGRAM_MANAGEMENT_ERGO_EVALS_NAME);
			System.out.println("The fetched name is " + name);
			Thread.sleep(2000);
			webDB.clickBtnByXPath(ProgramManagmentLocators.PROGRAM_MANAGEMENT_ERGO_EVALS_SEARCH);
			Thread.sleep(750);
			webDB.sendTextByXPath(ProgramManagmentLocators.PROGRAM_MANAGEMENT_ERGO_EVALS_SEARCH, name);
			Thread.sleep(750);
			webDB.sendTextByXpath(ProgramManagmentLocators.PROGRAM_MANAGEMENT_ERGO_EVALS_SEARCH, Keys.ENTER);
			Thread.sleep(2000);
			flag = webDB.waitElementByXPath(ProgramManagmentLocators.PROGRAM_MANAGEMENT_ERGO_EVALS_DATASET);
			if (flag) {
				webDB.clickBtnByXPath(ProgramManagmentLocators.PROGRAM_MANAGEMENT_ERGO_EVALS_DATASET);
				Thread.sleep(2000);
				flag = webDB.waitElementByXPath(
						ProgramManagmentLocators.PROGRAM_MANAGEMENT_ERGO_EVALS_DOWNLOAD_BTN);
				if (flag) {
					webDB.clickBtnByXPath(ProgramManagmentLocators.PROGRAM_MANAGEMENT_ERGO_EVALS_DOWNLOAD_BTN);
					Thread.sleep(2000);
					webDB.clickBtnByXPath(
							ProgramManagmentLocators.PROGRAM_MANAGEMENT_ERGO_EVALS_DATASET_CLOSE);
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
		flag = webDB.waitElementByXPath(ProgramManagmentLocators.PROGRAM_MANAGEMENT_ERGO_EVALS_HISTORY);
		if (flag) {
			webDB.clickBtnByXPath(ProgramManagmentLocators.PROGRAM_MANAGEMENT_ERGO_EVALS_HISTORY);
			Thread.sleep(2000);
			flag = webDB.waitElementByXPath(ProgramManagmentLocators.PROGRAM_MANAGEMENT_ERGO_EVALS_HISTORY_CLOSE);
			if (flag) {
				webDB.clickBtnByXPath(ProgramManagmentLocators.PROGRAM_MANAGEMENT_ERGO_EVALS_HISTORY_CLOSE);
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
		webDB.scrollToAnElement(ProgramManagmentLocators.PROGRAM_MANAGEMENT_FOLLOW_UPS_TEXT);
		Thread.sleep(2000);
		flag = webDB.waitElementByXPath(ProgramManagmentLocators.PROGRAM_MANAGEMENT_FOLLOW_UP_SEARCH);
		if (flag) {
			String name = webDB.getTextByXPath(ProgramManagmentLocators.PROGRAM_MANAGEMENT_FOLLOW_UPS_NAME);
			System.out.println("The fetched name is " + name);
			Thread.sleep(2000);
			webDB.clickBtnByXPath(ProgramManagmentLocators.PROGRAM_MANAGEMENT_FOLLOW_UP_SEARCH);
			Thread.sleep(750);
			webDB.sendTextByXPath(ProgramManagmentLocators.PROGRAM_MANAGEMENT_FOLLOW_UP_SEARCH, name);
			Thread.sleep(750);
			webDB.sendTextByXpath(ProgramManagmentLocators.PROGRAM_MANAGEMENT_FOLLOW_UP_SEARCH, Keys.ENTER);
			Thread.sleep(2000);
			flag = webDB.waitElementByXPath(ProgramManagmentLocators.PROGRAM_MANAGEMENT_FOLLOW_UPS_DATASET);
			if (flag) {
				webDB.clickBtnByXPath(ProgramManagmentLocators.PROGRAM_MANAGEMENT_FOLLOW_UPS_DATASET);
				Thread.sleep(2000);
				flag = webDB.waitElementByXPath(
						ProgramManagmentLocators.PROGRAM_MANAGEMENT_FOLLOW_UPS_DOWNLOAD_BTN);
				if (flag) {
					webDB.clickBtnByXPath(ProgramManagmentLocators.PROGRAM_MANAGEMENT_FOLLOW_UPS_DOWNLOAD_BTN);
					Thread.sleep(2000);
					webDB.clickBtnByXPath(
							ProgramManagmentLocators.PROGRAM_MANAGEMENT_ERGO_EVALS_DATASET_CLOSE);
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
		flag = webDB.waitElementByXPath(ProgramManagmentLocators.PROGRAM_MANAGEMENT_FOLLOW_UPS_HISTORY);
		if (flag) {
			webDB.clickBtnByXPath(ProgramManagmentLocators.PROGRAM_MANAGEMENT_FOLLOW_UPS_HISTORY);
			Thread.sleep(2000);
			flag = webDB.waitElementByXPath(ProgramManagmentLocators.PROGRAM_MANAGEMENT_ERGO_EVALS_HISTORY_CLOSE);
			if (flag) {
				webDB.clickBtnByXPath(ProgramManagmentLocators.PROGRAM_MANAGEMENT_ERGO_EVALS_HISTORY_CLOSE);
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
		webDB.scrollToAnElement(ProgramManagmentLocators.PROGRAM_MANAGEMENT_SCHEDULE_REQUEST_FORM_TEXT);
		Thread.sleep(2000);
		flag = webDB.waitElementByXPath(ProgramManagmentLocators.PROGRAM_MANAGEMENT_SCHEDULE_REQUEST_FORM_SEARCH);
		if (flag) {
			String name = webDB.getTextByXPath(ProgramManagmentLocators.PROGRAM_MANAGEMENT_SCHEDULE_REQUEST_FORM_NAME);
			System.out.println("The fetched name is " + name);
			Thread.sleep(2000);
			webDB.clickBtnByXPath(ProgramManagmentLocators.PROGRAM_MANAGEMENT_SCHEDULE_REQUEST_FORM_SEARCH);
			Thread.sleep(750);
			webDB.sendTextByXPath(ProgramManagmentLocators.PROGRAM_MANAGEMENT_SCHEDULE_REQUEST_FORM_SEARCH, name);
			Thread.sleep(750);
			webDB.sendTextByXpath(ProgramManagmentLocators.PROGRAM_MANAGEMENT_SCHEDULE_REQUEST_FORM_SEARCH, Keys.ENTER);
			Thread.sleep(2000);
			flag = webDB.waitElementByXPath(ProgramManagmentLocators.PROGRAM_MANAGEMENT_SCHEDULE_REQUEST_FORM_DATASET);
			if (flag) {
				webDB.clickBtnByXPath(ProgramManagmentLocators.PROGRAM_MANAGEMENT_SCHEDULE_REQUEST_FORM_DATASET);
				Thread.sleep(2000);
				flag = webDB.waitElementByXPath(
						ProgramManagmentLocators.PROGRAM_MANAGEMENT_FOLLOW_UPS_DOWNLOAD_BTN);
				if (flag) {
					webDB.clickBtnByXPath(ProgramManagmentLocators.PROGRAM_MANAGEMENT_FOLLOW_UPS_DOWNLOAD_BTN);
					Thread.sleep(2000);
					webDB.clickBtnByXPath(
							ProgramManagmentLocators.PROGRAM_MANAGEMENT_ERGO_EVALS_DATASET_CLOSE);
					Thread.sleep(2000);
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
		flag = webDB.waitElementByXPath(ProgramManagmentLocators.PROGRAM_MANAGEMENT_SCHEDULE_REQUEST_FORM_HISTORY);
		if (flag) {
			webDB.clickBtnByXPath(ProgramManagmentLocators.PROGRAM_MANAGEMENT_SCHEDULE_REQUEST_FORM_HISTORY);
			Thread.sleep(2000);
			flag = webDB.waitElementByXPath(ProgramManagmentLocators.PROGRAM_MANAGEMENT_ERGO_EVALS_HISTORY_CLOSE);
			if (flag) {
				webDB.clickBtnByXPath(ProgramManagmentLocators.PROGRAM_MANAGEMENT_ERGO_EVALS_HISTORY_CLOSE);
			}
		}
		return flag;

	}
}
