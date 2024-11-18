package com.pbergo.commonfunctions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.Keys;

import com.github.javafaker.Faker;
import com.pbergo.base.WebDriverBase;
import com.pbergo.locators.EmployeeSearchLocators;
import com.pbergo.locators.EvaluatorLocators;
import com.pbergo.locators.ProgramManagementLocators;
import com.pbergo.locators.ProgramManagmentLocators;

public class ProgramManagementFunctions {
	private WebDriverBase webDB;
	private boolean flag;

	private String email;
	private UIBasicFunctions uibasicfunctions;
	Faker faker = new Faker();

	public ProgramManagementFunctions(WebDriverBase webDB) {
		this.webDB = webDB;
		uibasicfunctions = new UIBasicFunctions(webDB);
	}

	/**
	 * This method is used to click on Program management link from left side panel
	 * 
	 * @param
	 * @return
	 * @throws IOException
	 * @throws InterruptedException
	 */
	public boolean openProgramManagementLink() throws IOException, InterruptedException {
		flag = webDB.waitElementByXPath(ProgramManagementLocators.ELMNT_PROGRAMMANAGEMENT_LEFTSIDEPANEL);
		if (flag) {
			webDB.scrollToAnElement(ProgramManagementLocators.ELMNT_PROGRAMMANAGEMENT_LEFTSIDEPANEL);
			Thread.sleep(750);
			webDB.clickBtnByXPath(ProgramManagementLocators.ELMNT_PROGRAMMANAGEMENT_LEFTSIDEPANEL);
			Thread.sleep(2000);
			flag = webDB.waitElementByXPath(ProgramManagementLocators.ELMNT_PAGEHEADING);
		}
		return flag;
	}

	/**
	 * This method is used to verify the search Functionality
	 * 
	 * @param
	 * @return
	 * @throws IOException
	 * @throws InterruptedException
	 * @throws AWTException
	 */
	public boolean verifySearchFunctionality() throws IOException, InterruptedException {
//		flag = uibasicfunctions.verifySearchFunctionality(ProgramManagementLocators.ELMNT_SEARCHFIELD,
//				ProgramManagementLocators.ELMNT_REPORTSINREVIEW_SEARCHTEXT);
//
//		webDB.getPageRefresh();
//		Thread.sleep(2000);
		flag = webDB.waitElementByXPath(ProgramManagmentLocators.PROGRAM_MANAGEMENT_TEXT);
		if (flag) {
//			webDB.scrollToAnElement(ProgramManagmentLocators.PROGRAM_MANAGEMENT_DATA);
//			Thread.sleep(2000);
			String temp = webDB.getTextByXPath(ProgramManagmentLocators.PROGRAM_MANAGEMENT_DATA);
			System.out.println("The fetched data is " + temp);
			Thread.sleep(1000);
//			webDB.getPageRefresh();
//			webDB.scrollToAnElement(ProgramManagmentLocators.PROGRAM_MANAGEMENT_SEARCH);
//			Thread.sleep(2000);

			flag = webDB.waitElementByXPath(ProgramManagmentLocators.PROGRAM_MANAGEMENT_SEARCH);
			if (flag) {
				webDB.clickBtnByXPath(ProgramManagmentLocators.PROGRAM_MANAGEMENT_SEARCH);
				Thread.sleep(750);
				webDB.sendTextByXPath(ProgramManagmentLocators.PROGRAM_MANAGEMENT_SEARCH, temp);
				Thread.sleep(750);
				webDB.sendTextByXpath(ProgramManagmentLocators.PROGRAM_MANAGEMENT_SEARCH, Keys.ENTER);
				Thread.sleep(4000);
//				flag = webDB.waitElementByXPath(ProgramManagmentLocators.PROGRAM_MANAGEMENT_DATA_VIEW);
//				if (flag) {
//					webDB.clickBtnByXPath(ProgramManagmentLocators.PROGRAM_MANAGEMENT_DATA_VIEW);
//					Thread.sleep(2000);
//					programsearch();
			}
		}

		return flag;
	}

	/**
	 * This method is used to verify the client view btn Functionality
	 * 
	 * @param
	 * @return
	 * @throws IOExceptiong
	 * @throws InterruptedException
	 * @throws AWTException
	 */
	public boolean verifyClientViewBtnFunctionality() throws IOException, InterruptedException {
		webDB.scrollToAnElement(ProgramManagementLocators.ELMNT_CLIENTVIEWBTN);
		Thread.sleep(5000);
		webDB.clickBtnByXPath(ProgramManagementLocators.ELMNT_CLIENTVIEWBTN);
		Thread.sleep(2000);
		flag = true;

		return flag;
	}

	/**
	 * 
	 * This methods is used for the searching for the program management data
	 */
	public boolean programsearch() throws IOException, InterruptedException {
//		webDB.scrollToAnElement(ProgramManagementLocators.ELMNT_CLIENTVIEWBTN);
//		Thread.sleep(750);
//		webDB.clickBtnByXPath(ProgramManagementLocators.ELMNT_CLIENTVIEWBTN);
//		Thread.sleep(2000);
		webDB.getPageRefresh();
		Thread.sleep(5000);
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
			webDB.clickBtnByXPath(ProgramManagmentLocators.PROGRAM_MANAGEMENT_DATA_VIEW_PBE_LAB_DEMO_VIEW);
			Thread.sleep(2000);
			
//			int totalemailids = webDB
//					.countingSizeByXPath(ProgramManagmentLocators.PROGRAM_MANAGEMENT_DATA_VIEW_PBE_LAB_DEMO_DATA);
//			for (int i = 1; i <= totalemailids; i++) {
//				String emailids = webDB.getTextByXPath(
//						ProgramManagmentLocators.PROGRAM_MANAGEMENT_DATA_VIEW_PBE_LAB_DEMO_DATA + "[" + i + "]");
//				if (emailids.equals(email)) {
//					System.out.println("The search result is same for result number " + i);
//					Thread.sleep(2000);
//					webDB.clickBtnByXPath(ProgramManagmentLocators.PROGRAM_MANAGEMENT_DATA_VIEW_PBE_LAB_DEMO_VIEW);
//					Thread.sleep(2000);
//					flag = true;
//				} else {
//					System.out.println("The search result is different for result number " + i);
//					flag = true;
//				}
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
//		webDB.NavigateTo(
//				"https://staging.pbergo.com/user/client-view-employee/OTJyMGNBZnZHVFptWFphNDkycjBjQWZ2R1RabVhaYQ==/OTJyMGNBZnZHVFptWFphNjcwMzk5MnIwY0FmdkdUWm1YWmE=");
		Thread.sleep(2000);

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
	 * This method is including the ergo eval section in which the searching and
	 * downloading the data set action is performed
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
			webDB.scrollToAnElement(ProgramManagmentLocators.PROGRAM_MANAGEMENT_ERGO_EVALS_DATASET);
			flag = webDB.waitElementByXPath(ProgramManagmentLocators.PROGRAM_MANAGEMENT_ERGO_EVALS_DATASET);
			if (flag) {
				webDB.clickBtnByXPath(ProgramManagmentLocators.PROGRAM_MANAGEMENT_ERGO_EVALS_DATASET);
				Thread.sleep(2000);
				flag = webDB.waitElementByXPath(ProgramManagmentLocators.PROGRAM_MANAGEMENT_ERGO_EVALS_DOWNLOAD_BTN);
				if (flag) {
					webDB.clickBtnByXPath(ProgramManagmentLocators.PROGRAM_MANAGEMENT_ERGO_EVALS_DOWNLOAD_BTN);
					Thread.sleep(2000);
					webDB.clickBtnByXPath(ProgramManagmentLocators.PROGRAM_MANAGEMENT_ERGO_EVALS_DATASET_CLOSE);
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
				Thread.sleep(2000);
//				followupssearch();
			}
		}
		return flag;

	}

	/**
	 * 
	 * This method is including the follow ups section in which the searching and
	 * downloading the data set action is performed
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
			webDB.scrollToAnElement(ProgramManagmentLocators.PROGRAM_MANAGEMENT_FOLLOW_UPS_DATASET);
			flag = webDB.waitElementByXPath(ProgramManagmentLocators.PROGRAM_MANAGEMENT_FOLLOW_UPS_DATASET);
			if (flag) {
				webDB.clickBtnByXPath(ProgramManagmentLocators.PROGRAM_MANAGEMENT_FOLLOW_UPS_DATASET);
				Thread.sleep(2000);
				flag = webDB.waitElementByXPath(ProgramManagmentLocators.PROGRAM_MANAGEMENT_FOLLOW_UPS_DOWNLOAD_BTN);
				if (flag) {
					webDB.clickBtnByXPath(ProgramManagmentLocators.PROGRAM_MANAGEMENT_FOLLOW_UPS_DOWNLOAD_BTN);
					Thread.sleep(2000);
					webDB.clickBtnByXPath(ProgramManagmentLocators.PROGRAM_MANAGEMENT_ERGO_EVALS_DATASET_CLOSE);
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
	 * This method is including the schedule request form section in which the
	 * searching and downloading the data set action is performed
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
			webDB.scrollToAnElement(ProgramManagmentLocators.PROGRAM_MANAGEMENT_SCHEDULE_REQUEST_FORM_DATASET);
			flag = webDB.waitElementByXPath(ProgramManagmentLocators.PROGRAM_MANAGEMENT_SCHEDULE_REQUEST_FORM_DATASET);
			if (flag) {
				webDB.clickBtnByXPath(ProgramManagmentLocators.PROGRAM_MANAGEMENT_SCHEDULE_REQUEST_FORM_DATASET);
				Thread.sleep(2000);
				flag = webDB.waitElementByXPath(ProgramManagmentLocators.PROGRAM_MANAGEMENT_FOLLOW_UPS_DOWNLOAD_BTN);
				if (flag) {
					webDB.clickBtnByXPath(ProgramManagmentLocators.PROGRAM_MANAGEMENT_FOLLOW_UPS_DOWNLOAD_BTN);
					Thread.sleep(2000);
					webDB.clickBtnByXPath(ProgramManagmentLocators.PROGRAM_MANAGEMENT_ERGO_EVALS_DATASET_CLOSE);
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
				Thread.sleep(3000);
				webDB.getPageRefresh();
			}
		}
		return flag;

	}

	/**
	 * This method is used to verify the self assesment report download
	 * functionality
	 * 
	 * @return
	 * @throws InterruptedException
	 * @throws IOException
	 * @throws AWTException
	 */
	public boolean verifySelfAssesmentReports_DownloadFunctionality()
			throws InterruptedException, IOException, AWTException {
		flag = webDB.waitElementByXPath(ProgramManagmentLocators.PROGRAM_MANAGEMENT_SELF_ASSESSMENT_REPORTDOWNLOAD_BTN);
		Thread.sleep(2000);
		if (flag) {
			webDB.clickBtnByXPath(ProgramManagmentLocators.PROGRAM_MANAGEMENT_SELF_ASSESSMENT_REPORTDOWNLOAD_BTN);
			Thread.sleep(7000);

			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(2000);

			int number = faker.number().numberBetween(1, 1000);
			String dynamicText = "PBErgo Self assesment Report " + number;

			for (char c : dynamicText.toCharArray()) {
				int keyCode = KeyEvent.getExtendedKeyCodeForChar(c);

				if (KeyEvent.CHAR_UNDEFINED == keyCode) {
					throw new RuntimeException("Key code not found for character '" + c + "'");
				}

				robot.keyPress(keyCode);
			}
			robot.keyPress(KeyEvent.VK_ENTER);

			System.out.println("The PDF is downloaded");
			Thread.sleep(5000);
			flag = webDB
					.waitElementByXPath(ProgramManagmentLocators.PROGRAM_MANAGEMENT_SELF_ASSESSMENT_REPORTDOWNLOAD_BTN);
			if (flag) {
				System.out.println("The self assesment report is downloaded");

			} else {
				System.out.println("The self assesment report is not downloaded");
				flag = false;
			}
		}

		return flag;

	}

	/**
	 * This method is used to verify the self assesment summary report download
	 * functionality
	 * 
	 * @return
	 * @throws InterruptedException
	 * @throws IOException
	 * @throws AWTException
	 */
	public boolean verifySelfAssesment_SummaryReport_DownloadFunctionality()
			throws InterruptedException, IOException, AWTException {

		flag = webDB.waitElementByXPath(ProgramManagmentLocators.PROGRAM_MANAGEMENT_SELF_ASSESSMENT_SUMMARYREPORT_BTN);
		Thread.sleep(2000);
		if (flag) {
			webDB.clickBtnByXPath(ProgramManagmentLocators.PROGRAM_MANAGEMENT_SELF_ASSESSMENT_SUMMARYREPORT_BTN);
			Thread.sleep(7000);

			flag = webDB.SwitchToWindowByIndex(1);
			Thread.sleep(1500);
			String pagetitle = webDB.getPageTitle();

			if (pagetitle.equals("PBErgo | Ergonomics Training | Consulting | Consultant")) {
				System.out.println("Swithced to frame and page title is " + pagetitle);
				Thread.sleep(1000);

				flag = webDB.waitElementByXPath(
						ProgramManagmentLocators.PROGRAM_MANAGEMENT_SELF_ASSESSMENT_SUMMARYREPORT_DOWNLOAD_BTN);
				if (flag) {

					webDB.clickBtnByXPath(
							ProgramManagmentLocators.PROGRAM_MANAGEMENT_SELF_ASSESSMENT_SUMMARYREPORT_DOWNLOAD_BTN);
					Thread.sleep(10000);

					Robot robot = new Robot();
					robot.keyPress(KeyEvent.VK_ENTER);
					Thread.sleep(2000);

					int number = faker.number().numberBetween(1, 1000);
					String dynamicText = "PBErgo Self assesment Summary Report " + number;

					for (char c : dynamicText.toCharArray()) {
						int keyCode = KeyEvent.getExtendedKeyCodeForChar(c);

						if (KeyEvent.CHAR_UNDEFINED == keyCode) {
							throw new RuntimeException("Key code not found for character '" + c + "'");
						}

						robot.keyPress(keyCode);
					}
					robot.keyPress(KeyEvent.VK_ENTER);

					System.out.println("The PDF is downloaded");
					Thread.sleep(5000);
					webDB.CloseCurremtWindow();
					flag = webDB.SwitchToWindowByIndex(0);
					Thread.sleep(3000);
					flag = webDB.waitElementByXPath(
							ProgramManagmentLocators.PROGRAM_MANAGEMENT_SELF_ASSESSMENT_SUMMARYREPORT_BTN);
					if (flag) {
						System.out.println("The self assesment summary report is downloaded");

					} else {
						System.out.println("The self assesment summary report is not downloaded");
						flag = false;
					}
				}
			}
		}

		return flag;

	}

	/**
	 * This method is used to verify the Ergo eval report download functionality
	 * 
	 * @return
	 * @throws InterruptedException
	 * @throws IOException
	 * @throws AWTException
	 */
	public boolean verifyErgoEvalReports_DownloadFunctionality()
			throws InterruptedException, IOException, AWTException {
		flag = webDB.waitElementByXPath(ProgramManagmentLocators.PROGRAM_MANAGEMENT_ERGOEVAL_REPORTDOWNLOAD_BTN);
		Thread.sleep(2000);
		if (flag) {
			webDB.clickBtnByXPath(ProgramManagmentLocators.PROGRAM_MANAGEMENT_ERGOEVAL_REPORTDOWNLOAD_BTN);
			Thread.sleep(7000);

			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(2000);

			int number = faker.number().numberBetween(1, 1000);
			String dynamicText = "PBErgo Ergo eval Report " + number;

			for (char c : dynamicText.toCharArray()) {
				int keyCode = KeyEvent.getExtendedKeyCodeForChar(c);

				if (KeyEvent.CHAR_UNDEFINED == keyCode) {
					throw new RuntimeException("Key code not found for character '" + c + "'");
				}

				robot.keyPress(keyCode);
			}
			robot.keyPress(KeyEvent.VK_ENTER);

			System.out.println("The PDF is downloaded");
			Thread.sleep(5000);
			flag = webDB.waitElementByXPath(ProgramManagmentLocators.PROGRAM_MANAGEMENT_ERGOEVAL_REPORTDOWNLOAD_BTN);
			if (flag) {
				System.out.println("The ergo eval report is downloaded");

			} else {
				System.out.println("The ergo eval report is not downloaded");
				flag = false;
			}
		}

		return flag;

	}

	/**
	 * This method is used to verify the ergo eval summary report download
	 * functionality
	 * 
	 * @return
	 * @throws InterruptedException
	 * @throws IOException
	 * @throws AWTException
	 */
	public boolean verifyEroEval_SummaryReport_DownloadFunctionality()
			throws InterruptedException, IOException, AWTException {
		flag = webDB.waitElementByXPath(ProgramManagmentLocators.PROGRAM_MANAGEMENT_ERGOEVAL_SUMMARYREPORT_BTN);
		Thread.sleep(2000);
		if (flag) {
			webDB.clickBtnByXPath(ProgramManagmentLocators.PROGRAM_MANAGEMENT_ERGOEVAL_SUMMARYREPORT_BTN);
			Thread.sleep(7000);

			flag = webDB.SwitchToWindowByIndex(1);
			Thread.sleep(1500);
			String pagetitle = webDB.getPageTitle();

			if (pagetitle.equals("PBErgo | Ergonomics Training | Consulting | Consultant")) {
				System.out.println("Swithced to frame and page title is " + pagetitle);
				Thread.sleep(1000);

				flag = webDB.waitElementByXPath(
						ProgramManagmentLocators.PROGRAM_MANAGEMENT_ERGOEVAL_SUMMARYREPORT_DOWNLOAD_BTN);
				if (flag) {

					webDB.clickBtnByXPath(
							ProgramManagmentLocators.PROGRAM_MANAGEMENT_ERGOEVAL_SUMMARYREPORT_DOWNLOAD_BTN);
					Thread.sleep(4000);

					Robot robot = new Robot();
					robot.keyPress(KeyEvent.VK_ENTER);
					Thread.sleep(2000);

					int number = faker.number().numberBetween(1, 1000);
					String dynamicText = "PBErgo Ergo eval Summary Report " + number;

					for (char c : dynamicText.toCharArray()) {
						int keyCode = KeyEvent.getExtendedKeyCodeForChar(c);

						if (KeyEvent.CHAR_UNDEFINED == keyCode) {
							throw new RuntimeException("Key code not found for character '" + c + "'");
						}

						robot.keyPress(keyCode);
					}
					robot.keyPress(KeyEvent.VK_ENTER);

					System.out.println("The PDF is downloaded");
					Thread.sleep(5000);
					webDB.CloseCurremtWindow();
					flag = webDB.SwitchToWindowByIndex(0);
					Thread.sleep(3000);
					flag = webDB
							.waitElementByXPath(ProgramManagmentLocators.PROGRAM_MANAGEMENT_ERGOEVAL_SUMMARYREPORT_BTN);
					if (flag) {
						System.out.println("The ergo eval summary report is downloaded");

					} else {
						System.out.println("The ergo eval summary report is not downloaded");
						flag = false;
					}
				}
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

	public boolean verifyAscendingOrderSortingFunctionalityOfClienttName() throws InterruptedException {
//		webDB.NavigateTo("https://staging.pbergo.com/user/ergo-eval-activity");
		Thread.sleep(3000);
		flag = webDB.verifyAscendingOrderSortingFunctionality(
				ProgramManagmentLocators.CLIENTNAME_COLUMNDATA_ONWHICHSORTINGAPPLIED,
				ProgramManagmentLocators.CLIENTNAME_COLUMNNAME_ONWHICHSORTINGAPPLIED,
				ProgramManagmentLocators.CLIENTNAME_COLUMN_TOTALARROWCOUNT_ONWHICHSORTINGAPPLIED,
				ProgramManagmentLocators.CLIENTNAME_COLUMN_UPARROW_ONWHICHSORTINGAPPLIED);
		return flag;
	}

	public boolean verifyDecendingOrderSortingFunctionalityOfClientName() throws InterruptedException {
//		webDB.NavigateTo("https://staging.pbergo.com/user/ergo-eval-activity");
		Thread.sleep(3000);
		flag = webDB.verifyDecendingOrderSortingFunctionality(
				ProgramManagmentLocators.CLIENTNAME_COLUMNDATA_ONWHICHSORTINGAPPLIED,
				ProgramManagmentLocators.CLIENTNAME_COLUMNNAME_ONWHICHSORTINGAPPLIED);
		return flag;
	}

	public boolean verifyAscendingOrderSortingFunctionalityOfFirstName() throws InterruptedException {
//		webDB.NavigateTo("https://staging.pbergo.com/user/ergo-eval-activity");
		Thread.sleep(3000);
		flag = webDB.verifyAscendingOrderSortingFunctionality(
				ProgramManagmentLocators.FIRSTNAME_COLUMNDATA_ONWHICHSORTINGAPPLIED,
				ProgramManagmentLocators.FIRSTNAME_COLUMNNAME_ONWHICHSORTINGAPPLIED,
				ProgramManagmentLocators.FIRSTNAME_COLUMN_TOTALARROWCOUNT_ONWHICHSORTINGAPPLIED,
				ProgramManagmentLocators.FIRSTNAME_COLUMN_UPARROW_ONWHICHSORTINGAPPLIED);
		return flag;
	}

	public boolean verifyDecendingOrderSortingFunctionalityOfFirstName() throws InterruptedException {
//		webDB.NavigateTo("https://staging.pbergo.com/user/ergo-eval-activity");
		Thread.sleep(3000);
		flag = webDB.verifyDecendingOrderSortingFunctionality(
				ProgramManagmentLocators.FIRSTNAME_COLUMNDATA_ONWHICHSORTINGAPPLIED,
				ProgramManagmentLocators.FIRSTNAME_COLUMNNAME_ONWHICHSORTINGAPPLIED);
		return flag;
	}

	public boolean verifyAscendingOrderSortingFunctionalityOfLastName() throws InterruptedException {
//		webDB.NavigateTo("https://staging.pbergo.com/user/ergo-eval-activity");
		Thread.sleep(3000);
		flag = webDB.verifyAscendingOrderSortingFunctionality(
				ProgramManagmentLocators.LASTNAME_COLUMNDATA_ONWHICHSORTINGAPPLIED,
				ProgramManagmentLocators.LASTNAME_COLUMNNAME_ONWHICHSORTINGAPPLIED,
				ProgramManagmentLocators.LASTNAME_COLUMN_TOTALARROWCOUNT_ONWHICHSORTINGAPPLIED,
				ProgramManagmentLocators.LASTNAME_COLUMN_UPARROW_ONWHICHSORTINGAPPLIED);
		return flag;
	}

	public boolean verifyDecendingOrderSortingFunctionalityOfLastName() throws InterruptedException {
//		webDB.NavigateTo("https://staging.pbergo.com/user/ergo-eval-activity");
		Thread.sleep(3000);
		flag = webDB.verifyDecendingOrderSortingFunctionality(
				ProgramManagmentLocators.LASTNAME_COLUMNDATA_ONWHICHSORTINGAPPLIED,
				ProgramManagmentLocators.LASTNAME_COLUMNNAME_ONWHICHSORTINGAPPLIED);
		return flag;
	}

	public boolean verifyAscendingOrderSortingFunctionalityOfEmailAddress() throws InterruptedException {
//		webDB.NavigateTo("https://staging.pbergo.com/user/ergo-eval-activity");
		Thread.sleep(3000);
		flag = webDB.verifyAscendingOrderSortingFunctionality(
				ProgramManagmentLocators.EMAILADDRESS_COLUMNDATA_ONWHICHSORTINGAPPLIED,
				ProgramManagmentLocators.EMAILADDRESS_COLUMNNAME_ONWHICHSORTINGAPPLIED,
				ProgramManagmentLocators.EMAILADDRESS_COLUMN_TOTALARROWCOUNT_ONWHICHSORTINGAPPLIED,
				ProgramManagmentLocators.EMAILADDRESS_COLUMN_UPARROW_ONWHICHSORTINGAPPLIED);
		return flag;
	}

	public boolean verifyDecendingOrderSortingFunctionalityOfEmailAddress() throws InterruptedException {
//		webDB.NavigateTo("https://staging.pbergo.com/user/ergo-eval-activity");
		Thread.sleep(3000);
		flag = webDB.verifyDecendingOrderSortingFunctionality(
				ProgramManagmentLocators.EMAILADDRESS_COLUMNDATA_ONWHICHSORTINGAPPLIED,
				ProgramManagmentLocators.EMAILADDRESS_COLUMNNAME_ONWHICHSORTINGAPPLIED);
		return flag;
	}

	public boolean verifyAscendingOrderSortingFunctionalityOfRegion() throws InterruptedException {
//		webDB.NavigateTo("https://staging.pbergo.com/user/ergo-eval-activity");
		Thread.sleep(3000);
		flag = webDB.verifyAscendingOrderSortingFunctionality(
				ProgramManagmentLocators.REGION_COLUMNDATA_ONWHICHSORTINGAPPLIED,
				ProgramManagmentLocators.REGION_COLUMNNAME_ONWHICHSORTINGAPPLIED,
				ProgramManagmentLocators.REGION_COLUMN_TOTALARROWCOUNT_ONWHICHSORTINGAPPLIED,
				ProgramManagmentLocators.REGION_COLUMN_UPARROW_ONWHICHSORTINGAPPLIED);
		return flag;
	}

	public boolean verifyDecendingOrderSortingFunctionalityOfRegion() throws InterruptedException {
//		webDB.NavigateTo("https://staging.pbergo.com/user/ergo-eval-activity");
		Thread.sleep(3000);
		flag = webDB.verifyDecendingOrderSortingFunctionality(
				ProgramManagmentLocators.REGION_COLUMNDATA_ONWHICHSORTINGAPPLIED,
				ProgramManagmentLocators.REGION_COLUMNNAME_ONWHICHSORTINGAPPLIED);

		return flag;
	}

	public boolean verifyPaginationFunctionalitySA() throws InterruptedException, IOException {
//		webDB.NavigateTo("https://staging.pbergo.com/admin/all_user_group");
		Thread.sleep(3000);
		webDB.scrollToAnElement("(//p[@class='float-lg-start text-sm-center'])[1]");
		Thread.sleep(3000);
		flag = webDB.verifyPagination("(//p[@class='float-lg-start text-sm-center'])[1]",
				"(//li[@class='page-item next']/button)[1]",
				"(//table[@class='table table-bordered table dataTable no-footer']//tbody)[1]//tr");
		return flag;

	}

	public boolean verifyAscendingOrderSortingFunctionalityOfFirstNameSA() throws InterruptedException {
		webDB.getPageRefresh();
		webDB.selectOptionByText("(//select[@name ='datatable_length'])[1]", "500");
		Thread.sleep(5000);
//		webDB.NavigateTo("https://staging.pbergo.com/user/ergo-eval-activity");
		Thread.sleep(3000);
		flag = webDB.verifyAscendingOrderSortingFunctionality(
				ProgramManagmentLocators.SA_FIRSTNAME_COLUMNDATA_ONWHICHSORTINGAPPLIED,
				ProgramManagmentLocators.SA_FIRSTNAME_COLUMNNAME_ONWHICHSORTINGAPPLIED,
				ProgramManagmentLocators.SA_FIRSTNAME_COLUMN_TOTALARROWCOUNT_ONWHICHSORTINGAPPLIED,
				ProgramManagmentLocators.SA_FIRSTNAME_COLUMN_UPARROW_ONWHICHSORTINGAPPLIED);
		return flag;
	}

	public boolean verifyDecendingOrderSortingFunctionalityOfFirstNameSA() throws InterruptedException {
//		webDB.NavigateTo("https://staging.pbergo.com/user/ergo-eval-activity");
		Thread.sleep(3000);
		flag = webDB.verifyDecendingOrderSortingFunctionality(
				ProgramManagmentLocators.SA_FIRSTNAME_COLUMNDATA_ONWHICHSORTINGAPPLIED,
				ProgramManagmentLocators.SA_FIRSTNAME_COLUMNNAME_ONWHICHSORTINGAPPLIED);
		return flag;
	}

	public boolean verifyAscendingOrderSortingFunctionalityOfLastNameSA() throws InterruptedException {
//		webDB.NavigateTo("https://staging.pbergo.com/user/ergo-eval-activity");
		Thread.sleep(3000);
		flag = webDB.verifyAscendingOrderSortingFunctionality(
				ProgramManagmentLocators.SA_LASTNAME_COLUMNDATA_ONWHICHSORTINGAPPLIED,
				ProgramManagmentLocators.SA_LASTNAME_COLUMNNAME_ONWHICHSORTINGAPPLIED,
				ProgramManagmentLocators.SA_LASTNAME_COLUMN_TOTALARROWCOUNT_ONWHICHSORTINGAPPLIED,
				ProgramManagmentLocators.SA_LASTNAME_COLUMN_UPARROW_ONWHICHSORTINGAPPLIED);
		return flag;
	}

	public boolean verifyDecendingOrderSortingFunctionalityOfLastNameSA() throws InterruptedException {
//		webDB.NavigateTo("https://staging.pbergo.com/user/ergo-eval-activity");
		Thread.sleep(3000);
		flag = webDB.verifyDecendingOrderSortingFunctionality(
				ProgramManagmentLocators.SA_LASTNAME_COLUMNDATA_ONWHICHSORTINGAPPLIED,
				ProgramManagmentLocators.SA_LASTNAME_COLUMNNAME_ONWHICHSORTINGAPPLIED);
		return flag;
	}

	public boolean verifyAscendingOrderSortingFunctionalityOfDOESA() throws InterruptedException {
//		webDB.NavigateTo("https://staging.pbergo.com/user/ergo-eval-activity");
		Thread.sleep(3000);
		flag = webDB.verifyAscendingOrderSortingFunctionalityOfDateTimeColumn(
				ProgramManagmentLocators.SA_DATEOFEVAL_COLUMNDATA_ONWHICHSORTINGAPPLIED,
				ProgramManagmentLocators.SA_DATEOFEVAL_COLUMNNAME_ONWHICHSORTINGAPPLIED,
				ProgramManagmentLocators.SA_DATEOFEVAL_COLUMN_TOTALARROWCOUNT_ONWHICHSORTINGAPPLIED,
				ProgramManagmentLocators.SA_DATEOFEVAL_COLUMN_UPARROW_ONWHICHSORTINGAPPLIED);
//		flag = webDB.verifyAscendingOrderSortingFunctionality(
//				ProgramManagmentLocators.SA_DATEOFEVAL_COLUMNDATA_ONWHICHSORTINGAPPLIED,
//				ProgramManagmentLocators.SA_DATEOFEVAL_COLUMNNAME_ONWHICHSORTINGAPPLIED,
//				ProgramManagmentLocators.SA_DATEOFEVAL_COLUMN_TOTALARROWCOUNT_ONWHICHSORTINGAPPLIED,
//				ProgramManagmentLocators.SA_DATEOFEVAL_COLUMN_UPARROW_ONWHICHSORTINGAPPLIED);
		return flag;
	}

	public boolean verifyDecendingOrderSortingFunctionalityOfDOESA() throws InterruptedException {
//		webDB.NavigateTo("https://staging.pbergo.com/user/ergo-eval-activity");
		Thread.sleep(3000);

		flag = webDB.verifyDecendingOrderSortingFunctionalityOfDateTimeColumn(
				ProgramManagmentLocators.SA_DATEOFEVAL_COLUMNDATA_ONWHICHSORTINGAPPLIED,
				ProgramManagmentLocators.SA_DATEOFEVAL_COLUMNNAME_ONWHICHSORTINGAPPLIED);
		return flag;
	}

	public boolean verifyPaginationFunctionalityEE() throws InterruptedException, IOException {
//		webDB.NavigateTo("https://staging.pbergo.com/admin/all_user_group");
		Thread.sleep(3000);
		webDB.scrollToAnElement("(//p[@class='float-lg-start text-sm-center'])[2]");
		Thread.sleep(3000);
		flag = webDB.verifyPagination("(//p[@class='float-lg-start text-sm-center'])[2]",
				"(//li[@class='page-item next']/button)[2]",
				"(//table[@class='table table-bordered table dataTable no-footer']//tbody)[2]//tr");
		return flag;

	}

	public boolean verifyAscendingOrderSortingFunctionalityOfFirstNameEE() throws InterruptedException {
		Thread.sleep(5000);
//		webDB.NavigateTo("https://staging.pbergo.com/user/ergo-eval-activity");
		webDB.selectOptionByText("(//select[@name ='datatable_length'])[2]", "500");
//		Thread.sleep(5000);
		Thread.sleep(3000);
		flag = webDB.verifyAscendingOrderSortingFunctionality(
				ProgramManagmentLocators.EE_FIRSTNAME_COLUMNDATA_ONWHICHSORTINGAPPLIED,
				ProgramManagmentLocators.EE_FIRSTNAME_COLUMNNAME_ONWHICHSORTINGAPPLIED,
				ProgramManagmentLocators.EE_FIRSTNAME_COLUMN_TOTALARROWCOUNT_ONWHICHSORTINGAPPLIED,
				ProgramManagmentLocators.EE_FIRSTNAME_COLUMN_UPARROW_ONWHICHSORTINGAPPLIED);
		return flag;
	}

	public boolean verifyDecendingOrderSortingFunctionalityOfFirstNameEE() throws InterruptedException {
//		webDB.NavigateTo("https://staging.pbergo.com/user/ergo-eval-activity");
		Thread.sleep(3000);
		flag = webDB.verifyDecendingOrderSortingFunctionality(
				ProgramManagmentLocators.EE_FIRSTNAME_COLUMNDATA_ONWHICHSORTINGAPPLIED,
				ProgramManagmentLocators.EE_FIRSTNAME_COLUMNNAME_ONWHICHSORTINGAPPLIED);
		return flag;
	}

	public boolean verifyAscendingOrderSortingFunctionalityOfLastNameEE() throws InterruptedException {
//		webDB.NavigateTo("https://staging.pbergo.com/user/ergo-eval-activity");
		Thread.sleep(3000);
		flag = webDB.verifyAscendingOrderSortingFunctionality(
				ProgramManagmentLocators.EE_LASTNAME_COLUMNDATA_ONWHICHSORTINGAPPLIED,
				ProgramManagmentLocators.EE_LASTNAME_COLUMNNAME_ONWHICHSORTINGAPPLIED,
				ProgramManagmentLocators.EE_LASTNAME_COLUMN_TOTALARROWCOUNT_ONWHICHSORTINGAPPLIED,
				ProgramManagmentLocators.EE_LASTNAME_COLUMN_UPARROW_ONWHICHSORTINGAPPLIED);
		return flag;
	}

	public boolean verifyDecendingOrderSortingFunctionalityOfLastNameEE() throws InterruptedException {
//		webDB.NavigateTo("https://staging.pbergo.com/user/ergo-eval-activity");
		Thread.sleep(3000);
		flag = webDB.verifyDecendingOrderSortingFunctionality(
				ProgramManagmentLocators.EE_LASTNAME_COLUMNDATA_ONWHICHSORTINGAPPLIED,
				ProgramManagmentLocators.EE_LASTNAME_COLUMNNAME_ONWHICHSORTINGAPPLIED);
		return flag;
	}

	public boolean verifyAscendingOrderSortingFunctionalityOfDOEEE() throws InterruptedException {
//		webDB.NavigateTo("https://staging.pbergo.com/user/ergo-eval-activity");
		Thread.sleep(3000);
		flag = webDB.verifyAscendingOrderSortingFunctionalityOfDateColumn(
				ProgramManagmentLocators.EE_DATEOFEVAL_COLUMNDATA_ONWHICHSORTINGAPPLIED,
				ProgramManagmentLocators.EE_DATEOFEVAL_COLUMNNAME_ONWHICHSORTINGAPPLIED,
				ProgramManagmentLocators.EE_DATEOFEVAL_COLUMN_TOTALARROWCOUNT_ONWHICHSORTINGAPPLIED,
				ProgramManagmentLocators.EE_DATEOFEVAL_COLUMN_UPARROW_ONWHICHSORTINGAPPLIED);
		return flag;
	}

	public boolean verifyDecendingOrderSortingFunctionalityOfDOEEE() throws InterruptedException {
//		webDB.NavigateTo("https://staging.pbergo.com/user/ergo-eval-activity");
		Thread.sleep(3000);
		flag = webDB.verifyDecendingOrderSortingFunctionalityOfDateColumn(
				ProgramManagmentLocators.EE_DATEOFEVAL_COLUMNDATA_ONWHICHSORTINGAPPLIED,
				ProgramManagmentLocators.EE_DATEOFEVAL_COLUMNNAME_ONWHICHSORTINGAPPLIED);
		return flag;
	}

	public boolean verifyAscendingOrderSortingFunctionalityOfEvaluatorEE() throws InterruptedException {
//		webDB.NavigateTo("https://staging.pbergo.com/user/ergo-eval-activity");
		Thread.sleep(3000);
		flag = webDB.verifyAscendingOrderSortingFunctionality(
				ProgramManagmentLocators.EE_EVALUATOR_COLUMNDATA_ONWHICHSORTINGAPPLIED,
				ProgramManagmentLocators.EE_EVALUATOR_COLUMNNAME_ONWHICHSORTINGAPPLIED,
				ProgramManagmentLocators.EE_EVALUATOR_COLUMN_TOTALARROWCOUNT_ONWHICHSORTINGAPPLIED,
				ProgramManagmentLocators.EE_EVALUATOR_COLUMN_UPARROW_ONWHICHSORTINGAPPLIED);
		return flag;
	}

	public boolean verifyDecendingOrderSortingFunctionalityOfEvaluatorEE() throws InterruptedException {
//		webDB.NavigateTo("https://staging.pbergo.com/user/ergo-eval-activity");
		Thread.sleep(3000);
		flag = webDB.verifyDecendingOrderSortingFunctionality(
				ProgramManagmentLocators.EE_EVALUATOR_COLUMNDATA_ONWHICHSORTINGAPPLIED,
				ProgramManagmentLocators.EE_EVALUATOR_COLUMNNAME_ONWHICHSORTINGAPPLIED);
		return flag;
	}

	public boolean verifyAscendingOrderSortingFunctionalityOfStatusEE() throws InterruptedException {
//		webDB.NavigateTo("https://staging.pbergo.com/user/ergo-eval-activity");
		Thread.sleep(3000);
		flag = webDB.verifyAscendingOrderSortingFunctionality(
				ProgramManagmentLocators.EE_STATUS_COLUMNDATA_ONWHICHSORTINGAPPLIED,
				ProgramManagmentLocators.EE_STATUS_COLUMNNAME_ONWHICHSORTINGAPPLIED,
				ProgramManagmentLocators.EE_STATUS_COLUMN_TOTALARROWCOUNT_ONWHICHSORTINGAPPLIED,
				ProgramManagmentLocators.EE_STATUS_COLUMN_UPARROW_ONWHICHSORTINGAPPLIED);
		return flag;
	}

	public boolean verifyDecendingOrderSortingFunctionalityOfStatusEE() throws InterruptedException {
//		webDB.NavigateTo("https://staging.pbergo.com/user/ergo-eval-activity");
		Thread.sleep(3000);
		flag = webDB.verifyDecendingOrderSortingFunctionality(
				ProgramManagmentLocators.EE_STATUS_COLUMNDATA_ONWHICHSORTINGAPPLIED,
				ProgramManagmentLocators.EE_STATUS_COLUMNNAME_ONWHICHSORTINGAPPLIED);
		return flag;
	}

	public boolean verifyPaginationFunctionalityFU() throws InterruptedException, IOException {
//		webDB.NavigateTo("https://staging.pbergo.com/admin/all_user_group");
		Thread.sleep(3000);
		webDB.scrollToAnElement("(//p[@class='float-lg-start text-sm-center'])[3]");
		Thread.sleep(3000);
		flag = webDB.verifyPagination("(//p[@class='float-lg-start text-sm-center'])[3]",
				"(//li[@class='page-item next']/button)[3]",
				"(//table[@class='table table-bordered table dataTable no-footer']//tbody)[3]//tr");
		return flag;

	}

	public boolean verifyAscendingOrderSortingFunctionalityOfFirstNameFU() throws InterruptedException {
//		webDB.NavigateTo("https://staging.pbergo.com/user/ergo-eval-activity");
		Thread.sleep(5000);
		webDB.selectOptionByText("(//select[@name ='datatable_length'])[3]", "500");

		Thread.sleep(3000);
		flag = webDB.verifyAscendingOrderSortingFunctionality(
				ProgramManagmentLocators.FU_FIRSTNAME_COLUMNDATA_ONWHICHSORTINGAPPLIED,
				ProgramManagmentLocators.FU_FIRSTNAME_COLUMNNAME_ONWHICHSORTINGAPPLIED,
				ProgramManagmentLocators.FU_FIRSTNAME_COLUMN_TOTALARROWCOUNT_ONWHICHSORTINGAPPLIED,
				ProgramManagmentLocators.FU_FIRSTNAME_COLUMN_UPARROW_ONWHICHSORTINGAPPLIED);
		return flag;
	}

	public boolean verifyDecendingOrderSortingFunctionalityOfFirstNameFU() throws InterruptedException {
//		webDB.NavigateTo("https://staging.pbergo.com/user/ergo-eval-activity");
		Thread.sleep(3000);
		flag = webDB.verifyDecendingOrderSortingFunctionality(
				ProgramManagmentLocators.FU_FIRSTNAME_COLUMNDATA_ONWHICHSORTINGAPPLIED,
				ProgramManagmentLocators.FU_FIRSTNAME_COLUMNNAME_ONWHICHSORTINGAPPLIED);
		return flag;
	}

	public boolean verifyAscendingOrderSortingFunctionalityOfLastNameFU() throws InterruptedException {
//		webDB.NavigateTo("https://staging.pbergo.com/user/ergo-eval-activity");
		Thread.sleep(3000);
		flag = webDB.verifyAscendingOrderSortingFunctionality(
				ProgramManagmentLocators.FU_LASTNAME_COLUMNDATA_ONWHICHSORTINGAPPLIED,
				ProgramManagmentLocators.FU_LASTNAME_COLUMNNAME_ONWHICHSORTINGAPPLIED,
				ProgramManagmentLocators.FU_LASTNAME_COLUMN_TOTALARROWCOUNT_ONWHICHSORTINGAPPLIED,
				ProgramManagmentLocators.FU_LASTNAME_COLUMN_UPARROW_ONWHICHSORTINGAPPLIED);
		return flag;
	}

	public boolean verifyDecendingOrderSortingFunctionalityOfLastNameFU() throws InterruptedException {
//		webDB.NavigateTo("https://staging.pbergo.com/user/ergo-eval-activity");
		Thread.sleep(3000);
		flag = webDB.verifyDecendingOrderSortingFunctionality(
				ProgramManagmentLocators.FU_LASTNAME_COLUMNDATA_ONWHICHSORTINGAPPLIED,
				ProgramManagmentLocators.FU_LASTNAME_COLUMNNAME_ONWHICHSORTINGAPPLIED);
		return flag;
	}

	public boolean verifyAscendingOrderSortingFunctionalityOfDOEFU() throws InterruptedException {
//		webDB.NavigateTo("https://staging.pbergo.com/user/ergo-eval-activity");
		Thread.sleep(3000);
		flag = webDB.verifyAscendingOrderSortingFunctionalityOfDateTimeColumn(
				ProgramManagmentLocators.FU_DATEOFEVAL_COLUMNDATA_ONWHICHSORTINGAPPLIED,
				ProgramManagmentLocators.FU_DATEOFEVAL_COLUMNNAME_ONWHICHSORTINGAPPLIED,
				ProgramManagmentLocators.FU_DATEOFEVAL_COLUMN_TOTALARROWCOUNT_ONWHICHSORTINGAPPLIED,
				ProgramManagmentLocators.FU_DATEOFEVAL_COLUMN_UPARROW_ONWHICHSORTINGAPPLIED);
		return flag;
	}

	public boolean verifyDecendingOrderSortingFunctionalityOfDOEFU() throws InterruptedException {
//		webDB.NavigateTo("https://staging.pbergo.com/user/ergo-eval-activity");
		Thread.sleep(3000);
		flag = webDB.verifyDecendingOrderSortingFunctionalityOfDateTimeColumn(
				ProgramManagmentLocators.FU_DATEOFEVAL_COLUMNDATA_ONWHICHSORTINGAPPLIED,
				ProgramManagmentLocators.FU_DATEOFEVAL_COLUMNNAME_ONWHICHSORTINGAPPLIED);
		return flag;
	}

	public boolean verifyPaginationFunctionalitySRF() throws InterruptedException, IOException {
//		webDB.NavigateTo("https://staging.pbergo.com/admin/all_user_group");
		Thread.sleep(3000);
		webDB.scrollToAnElement("(//p[@class='float-lg-start text-sm-center'])[4]");
		Thread.sleep(3000);
		flag = webDB.verifyPagination("(//p[@class='float-lg-start text-sm-center'])[4]",
				"(//li[@class='page-item next']/button)[4]",
				"(//table[@class='table table-bordered table dataTable no-footer']//tbody)[4]//tr");
		return flag;

	}

	public boolean verifyAscendingOrderSortingFunctionalityOfFirstNameSRF() throws InterruptedException {
//		webDB.NavigateTo("https://staging.pbergo.com/user/ergo-eval-activity");
		Thread.sleep(5000);
		webDB.selectOptionByText("(//select[@name ='datatable_length'])[4]", "500");

		Thread.sleep(3000);
		flag = webDB.verifyAscendingOrderSortingFunctionality(
				ProgramManagmentLocators.SRF_FIRSTNAME_COLUMNDATA_ONWHICHSORTINGAPPLIED,
				ProgramManagmentLocators.SRF_FIRSTNAME_COLUMNNAME_ONWHICHSORTINGAPPLIED,
				ProgramManagmentLocators.SRF_FIRSTNAME_COLUMN_TOTALARROWCOUNT_ONWHICHSORTINGAPPLIED,
				ProgramManagmentLocators.SRF_FIRSTNAME_COLUMN_UPARROW_ONWHICHSORTINGAPPLIED);
		return flag;
	}

	public boolean verifyDecendingOrderSortingFunctionalityOfFirstNameSRF() throws InterruptedException {
//		webDB.NavigateTo("https://staging.pbergo.com/user/ergo-eval-activity");
		Thread.sleep(3000);
		flag = webDB.verifyDecendingOrderSortingFunctionality(
				ProgramManagmentLocators.SRF_FIRSTNAME_COLUMNDATA_ONWHICHSORTINGAPPLIED,
				ProgramManagmentLocators.SRF_FIRSTNAME_COLUMNNAME_ONWHICHSORTINGAPPLIED);
		return flag;
	}

	public boolean verifyAscendingOrderSortingFunctionalityOfLastNameSRF() throws InterruptedException {
//		webDB.NavigateTo("https://staging.pbergo.com/user/ergo-eval-activity");
		Thread.sleep(3000);
		flag = webDB.verifyAscendingOrderSortingFunctionality(
				ProgramManagmentLocators.SRF_LASTNAME_COLUMNDATA_ONWHICHSORTINGAPPLIED,
				ProgramManagmentLocators.SRF_LASTNAME_COLUMNNAME_ONWHICHSORTINGAPPLIED,
				ProgramManagmentLocators.SRF_LASTNAME_COLUMN_TOTALARROWCOUNT_ONWHICHSORTINGAPPLIED,
				ProgramManagmentLocators.SRF_LASTNAME_COLUMN_UPARROW_ONWHICHSORTINGAPPLIED);
		return flag;
	}

	public boolean verifyDecendingOrderSortingFunctionalityOfLastNameSRF() throws InterruptedException {
//		webDB.NavigateTo("https://staging.pbergo.com/user/ergo-eval-activity");
		Thread.sleep(3000);
		flag = webDB.verifyDecendingOrderSortingFunctionality(
				ProgramManagmentLocators.SRF_LASTNAME_COLUMNDATA_ONWHICHSORTINGAPPLIED,
				ProgramManagmentLocators.SRF_LASTNAME_COLUMNNAME_ONWHICHSORTINGAPPLIED);
		return flag;
	}

	public boolean verifyAscendingOrderSortingFunctionalityOfStatusSRF() throws InterruptedException {
//		webDB.NavigateTo("https://staging.pbergo.com/user/ergo-eval-activity");
		Thread.sleep(3000);
		flag = webDB.verifyAscendingOrderSortingFunctionality(
				ProgramManagmentLocators.SRF_STATUS_COLUMNDATA_ONWHICHSORTINGAPPLIED,
				ProgramManagmentLocators.SRF_STATUS_COLUMNNAME_ONWHICHSORTINGAPPLIED,
				ProgramManagmentLocators.SRF_STATUS_COLUMN_TOTALARROWCOUNT_ONWHICHSORTINGAPPLIED,
				ProgramManagmentLocators.SRF_STATUS_COLUMN_UPARROW_ONWHICHSORTINGAPPLIED);
		return flag;
	}

	public boolean verifyDecendingOrderSortingFunctionalityOfStatusSRF() throws InterruptedException {
//		webDB.NavigateTo("https://staging.pbergo.com/user/ergo-eval-activity");
		Thread.sleep(3000);
		flag = webDB.verifyDecendingOrderSortingFunctionality(
				ProgramManagmentLocators.SRF_STATUS_COLUMNDATA_ONWHICHSORTINGAPPLIED,
				ProgramManagmentLocators.SRF_STATUS_COLUMNNAME_ONWHICHSORTINGAPPLIED);
		return flag;
	}

	public boolean verifyAscendingOrderSortingFunctionalityOfDOESRF() throws InterruptedException {
//		webDB.NavigateTo("https://staging.pbergo.com/user/ergo-eval-activity");
		Thread.sleep(3000);
		flag = webDB.verifyAscendingOrderSortingFunctionalityOfDateTimeColumn(
				ProgramManagmentLocators.SRF_DATEOFEVAL_COLUMNDATA_ONWHICHSORTINGAPPLIED,
				ProgramManagmentLocators.SRF_DATEOFEVAL_COLUMNNAME_ONWHICHSORTINGAPPLIED,
				ProgramManagmentLocators.SRF_DATEOFEVAL_COLUMN_TOTALARROWCOUNT_ONWHICHSORTINGAPPLIED,
				ProgramManagmentLocators.SRF_DATEOFEVAL_COLUMN_UPARROW_ONWHICHSORTINGAPPLIED);
		return flag;
	}

	public boolean verifyDecendingOrderSortingFunctionalityOfDOESRF() throws InterruptedException {
//		webDB.NavigateTo("https://staging.pbergo.com/user/ergo-eval-activity");
		Thread.sleep(3000);
		flag = webDB.verifyDecendingOrderSortingFunctionalityOfDateTimeColumn(
				ProgramManagmentLocators.SRF_DATEOFEVAL_COLUMNDATA_ONWHICHSORTINGAPPLIED,
				ProgramManagmentLocators.SRF_DATEOFEVAL_COLUMNNAME_ONWHICHSORTINGAPPLIED);
		return flag;
	}
}
