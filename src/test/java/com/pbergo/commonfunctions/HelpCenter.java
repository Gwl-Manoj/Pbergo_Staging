package com.pbergo.commonfunctions;

import java.awt.AWTException;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.pbergo.base.WebDriverBase;
import com.pbergo.locators.HelpCenterLocators;

public class HelpCenter {

	private WebDriverBase webDB;
	private boolean flag;
	private String temp;
	WebDriver driver;
	private int i;
	private JavascriptExecutor js;

	public HelpCenter(WebDriverBase webDB) {
		this.webDB = webDB;
		js = (JavascriptExecutor) webDB.passingWebDriverInstance(webDB);
	}

	public boolean CenterDashboardLearningTutorials() throws InterruptedException, IOException, AWTException {
		Thread.sleep(5000);
		webDB.scrolldown(400);
		Thread.sleep(2000);
		webDB.clickBtnByXPath(HelpCenterLocators.HELPCENTER);
		Thread.sleep(2000);
		flag = webDB.waitElementByXPath(HelpCenterLocators.HELPCENTER_LEARNING_BASIC);
		if (flag) {
			webDB.clickBtnByXPath(HelpCenterLocators.HELPCENTER_LEARNING_BASIC);
			Thread.sleep(2000);
			verifyAccordianFunctionality();
			Thread.sleep(1000);
			flag = webDB.waitElementByXPath(HelpCenterLocators.HELPCENTER_MEET_DASHBOARD);
			if (flag) {
				webDB.clickBtnByXPath(HelpCenterLocators.HELPCENTER_MEET_DASHBOARD);
				Thread.sleep(2000);
				PlayPauseVideo();
				Thread.sleep(2000);
				flag = webDB.waitElementByXPath(HelpCenterLocators.HELPCENTER_LEARN_BASICS);
				if (flag) {
					webDB.clickBtnByXPath(HelpCenterLocators.HELPCENTER_LEARN_BASICS);
					Thread.sleep(2000);
					PlayPauseVideo();
					Thread.sleep(3000);
				}
			}
		}

		return flag;

	}

	public boolean PlayPauseVideo() throws InterruptedException {

		webDB.switchToiFrame("//iframe[@id= 'vimeoIframe']");
		Thread.sleep(2000);
		webDB.clickBtnByXPath(HelpCenterLocators.HELPCENTER_VIDEO_PLAY_PAUSE_BTN);
		Thread.sleep(20000);
//		Thread.sleep(7000);
		webDB.clickBtnByXPath(HelpCenterLocators.HELPCENTER_VIDEO_PLAY_PAUSE_BTN);
		Thread.sleep(2000);
//		JavascriptExecutor js = (JavascriptExecutor) webDB.passingWebDriverInstance(webDB);
		WebElement videotobeplayed = webDB.passingWebDriverInstance(webDB).findElement(By.xpath("//div[@class='Timecode_module_timecode__6a968513 ']"));
		// Get the current play time of the video using JavaScript
//        Double currentTime = (Double) js.executeScript("return arguments[0].currentTime;", videotobeplayed);
//        System.out.println("Video played for " + currentTime + " seconds.");
		
        String videoplaytime = webDB.getTextByXPath("//div[@class='Timecode_module_timecode__6a968513 ']").replace("00:", "");
        int currentTime = Integer.parseInt(videoplaytime);
        System.out.println("Video played for " + videoplaytime + " seconds.");
        // Verify if the video played for at least 5 seconds
        if (currentTime >= 5) {
        	System.out.println("Video played for the expected duration.");
            flag = true;
        } else {
        	System.out.println("Video did not play for the expected duration.");
        	flag = false;
        }
        
		webDB.switchToDefault();
		Thread.sleep(1000);
		webDB.actionMoveToElementByXPath(HelpCenterLocators.HELPCENTER_VIDEO_CLOSE_ICON);
		Thread.sleep(2000);
		webDB.clickBtnByXPath(HelpCenterLocators.HELPCENTER_VIDEO_CLOSE_ICON);
		Thread.sleep(3000);
		return flag;

	}

	public boolean verifyAccordianFunctionality() {
		int test = webDB.countingSizeByXPath("//button[@class='accordion-button']");
		if (test == 1) {
			flag = true;
			System.out.println("Succefully accordian open ");
		} else {
			flag = false;
			System.out.println("Accordian is not opened");
		}
		return flag;

	}

	public boolean ErgoActivityDashboard() throws InterruptedException, IOException {
		webDB.clickBtnByXPath(HelpCenterLocators.HELPCENTER_ERGO_ACTIVITY_DASHBOARD);
		Thread.sleep(2000);
		webDB.clickBtnByXPath(HelpCenterLocators.HELPCENTER_PROGRAM_OVERVIEW);
		Thread.sleep(3000);
		PlayPauseVideo();
		flag = webDB.waitElementByXPath(HelpCenterLocators.HELPCENTER_SELF_ASSESSMENT);
		if (flag) {
			webDB.clickBtnByXPath(HelpCenterLocators.HELPCENTER_SELF_ASSESSMENT);
			Thread.sleep(2000);
			PlayPauseVideo();
			webDB.scrollToAnElement(HelpCenterLocators.HELPCENTER_ERGO_EVAL_ACTIVITY);
			Thread.sleep(1000);
			flag = webDB.waitElementByXPath(HelpCenterLocators.HELPCENTER_ERGO_EVAL_ACTIVITY);
			if (flag) {
				webDB.clickBtnByXPath(HelpCenterLocators.HELPCENTER_ERGO_EVAL_ACTIVITY);
				Thread.sleep(2000);
				PlayPauseVideo();
				flag = webDB.waitElementByXPath(HelpCenterLocators.HELPCENTER_FOLLLOW_UP_FEEDBACK);
				if (flag) {
					webDB.clickBtnByXPath(HelpCenterLocators.HELPCENTER_FOLLLOW_UP_FEEDBACK);
					Thread.sleep(2000);
					PlayPauseVideo();
					webDB.scrollToAnElement(HelpCenterLocators.HELPCENTER_EMPLOYEE_SEARCH);
					Thread.sleep(1000);
					flag = webDB.waitElementByXPath(HelpCenterLocators.HELPCENTER_EMPLOYEE_SEARCH);
					if (flag) {
						webDB.clickBtnByXPath(HelpCenterLocators.HELPCENTER_EMPLOYEE_SEARCH);
						Thread.sleep(2000);
						PlayPauseVideo();
						flag = webDB.waitElementByXPath(HelpCenterLocators.HELPCENTER_CUSTOM_SEARCH);
						if (flag) {
							webDB.clickBtnByXPath(HelpCenterLocators.HELPCENTER_CUSTOM_SEARCH);
							Thread.sleep(2000);
							PlayPauseVideo();
						}
					}
				}
			}
		}
		return flag;

	}

	public boolean YourPersonalDashboard() throws InterruptedException, IOException {
		webDB.scrollToAnElement(HelpCenterLocators.HELPCENTER_YOUR_PERSONAL_DASHBOARD);
		Thread.sleep(1000);
		flag = webDB.waitElementByXPath(HelpCenterLocators.HELPCENTER_YOUR_PERSONAL_DASHBOARD);
		if (flag) {
			webDB.clickBtnByXPath(HelpCenterLocators.HELPCENTER_YOUR_PERSONAL_DASHBOARD);
			Thread.sleep(2000);
			webDB.scrollToAnElement(HelpCenterLocators.HELPCENTER_MY_REPORT);
			Thread.sleep(1000);
			flag = webDB.waitElementByXPath(HelpCenterLocators.HELPCENTER_MY_REPORT);
			if (flag) {
				webDB.clickBtnByXPath(HelpCenterLocators.HELPCENTER_MY_REPORT);
				Thread.sleep(3000);
				PlayPauseVideo();
				webDB.scrollToAnElement(HelpCenterLocators.HELPCENTER_HELP_CENTER);
				Thread.sleep(1000);
				flag = webDB.waitElementByXPath(HelpCenterLocators.HELPCENTER_HELP_CENTER);
				if (flag) {
					webDB.clickBtnByXPath(HelpCenterLocators.HELPCENTER_HELP_CENTER);
					Thread.sleep(2000);
					PlayPauseVideo();
				}
			}
		}
		return flag;

	}

	public boolean EvaluationDashboard() throws InterruptedException, IOException {
		webDB.scrollToAnElement(HelpCenterLocators.HELPCENTER_EVALUATION_DASHBOARD);
		Thread.sleep(1000);
		flag = webDB.waitElementByXPath(HelpCenterLocators.HELPCENTER_EVALUATION_DASHBOARD);
		if (flag) {
			webDB.clickBtnByXPath(HelpCenterLocators.HELPCENTER_EVALUATION_DASHBOARD);
			Thread.sleep(2000);
			webDB.scrollToAnElement(HelpCenterLocators.HELPCENTER_YOUR_EVALUATIONS_DASHBOARD);
			Thread.sleep(1000);
			flag = webDB.waitElementByXPath(HelpCenterLocators.HELPCENTER_YOUR_EVALUATIONS_DASHBOARD);
			if (flag) {
				webDB.clickBtnByXPath(HelpCenterLocators.HELPCENTER_YOUR_EVALUATIONS_DASHBOARD);
				Thread.sleep(3000);
				PlayPauseVideo();
				webDB.scrollToAnElement(HelpCenterLocators.HELPCENTER_CONDUCTING_EVALUATIONS);
				Thread.sleep(1000);
				flag = webDB.waitElementByXPath(HelpCenterLocators.HELPCENTER_CONDUCTING_EVALUATIONS);
				if (flag) {
					webDB.clickBtnByXPath(HelpCenterLocators.HELPCENTER_CONDUCTING_EVALUATIONS);
					Thread.sleep(2000);
					PlayPauseVideo();
					webDB.scrollToAnElement(HelpCenterLocators.HELPCENTER_YOUR_ERGO_EVAL_FORM);
					Thread.sleep(1000);
					flag = webDB.waitElementByXPath(HelpCenterLocators.HELPCENTER_YOUR_ERGO_EVAL_FORM);
					if (flag) {
						webDB.clickBtnByXPath(HelpCenterLocators.HELPCENTER_YOUR_ERGO_EVAL_FORM);
						Thread.sleep(2000);
						PlayPauseVideo();
					}
				}
			}
		}
		return flag;

	}

	public boolean ProgramManagementDashboard() throws InterruptedException, IOException {
		webDB.scrollToAnElement(HelpCenterLocators.HELPCENTER_PROGRAM_MANAGEMENT_DASHBOARD);
		Thread.sleep(1000);
		flag = webDB.waitElementByXPath(HelpCenterLocators.HELPCENTER_PROGRAM_MANAGEMENT_DASHBOARD);
		if (flag) {
			webDB.clickBtnByXPath(HelpCenterLocators.HELPCENTER_PROGRAM_MANAGEMENT_DASHBOARD);
			Thread.sleep(2000);
			webDB.scrollToAnElement(HelpCenterLocators.HELPCENTER_EMPLOYEE_SEARCH_DASHBOARD);
			Thread.sleep(1000);
			flag = webDB.waitElementByXPath(HelpCenterLocators.HELPCENTER_EMPLOYEE_SEARCH_DASHBOARD);
			if (flag) {
				webDB.clickBtnByXPath(HelpCenterLocators.HELPCENTER_EMPLOYEE_SEARCH_DASHBOARD);
				Thread.sleep(3000);
				PlayPauseVideo();
				webDB.scrollToAnElement(HelpCenterLocators.HELPCENTER_REPORTS_DASHBOARD);
				Thread.sleep(1000);
				flag = webDB.waitElementByXPath(HelpCenterLocators.HELPCENTER_REPORTS_DASHBOARD);
				if (flag) {
					webDB.clickBtnByXPath(HelpCenterLocators.HELPCENTER_REPORTS_DASHBOARD);
					Thread.sleep(2000);
					PlayPauseVideo();
					webDB.scrollToAnElement(HelpCenterLocators.HELPCENTER_EVAL_REQUEST_DASHBOARD);
					Thread.sleep(1000);
					flag = webDB.waitElementByXPath(HelpCenterLocators.HELPCENTER_EVAL_REQUEST_DASHBOARD);
					if (flag) {
						webDB.clickBtnByXPath(HelpCenterLocators.HELPCENTER_EVAL_REQUEST_DASHBOARD);
						Thread.sleep(2000);
						PlayPauseVideo();
						webDB.scrollToAnElement(HelpCenterLocators.HELPCENTER_FOLLOW_UP_DASHBOARD);
						Thread.sleep(1000);
						flag = webDB.waitElementByXPath(HelpCenterLocators.HELPCENTER_FOLLOW_UP_DASHBOARD);
						if (flag) {
							webDB.clickBtnByXPath(HelpCenterLocators.HELPCENTER_FOLLOW_UP_DASHBOARD);
							Thread.sleep(2000);
							PlayPauseVideo();
						}
					}
				}
			}
		}
		return flag;

	}

	public boolean ErgoEval() throws InterruptedException, AWTException, IOException {
		webDB.scrollToAnElement(HelpCenterLocators.HELPCENTER_EMPLOYEE_ERGO_PORTAL);
		Thread.sleep(2000);
		flag = webDB.waitElementByXPath(HelpCenterLocators.HELPCENTER_EMPLOYEE_ERGO_PORTAL);
		if (flag) {
			webDB.clickBtnByXPath(HelpCenterLocators.HELPCENTER_EMPLOYEE_ERGO_PORTAL);
			Thread.sleep(5000);
			webDB.scrollToAnElement(HelpCenterLocators.HELPCENTER_TAKE_THE_SELF_ASSESSMENT);
			Thread.sleep(2000);
			flag = webDB.waitElementByXPath(HelpCenterLocators.HELPCENTER_TAKE_THE_SELF_ASSESSMENT);
			if (flag) {
				webDB.clickBtnByXPath(HelpCenterLocators.HELPCENTER_TAKE_THE_SELF_ASSESSMENT);
				Thread.sleep(3000);
				webDB.scrollToAnElement(HelpCenterLocators.HELPCENTER_SELF_ASSESSMENT_BTN);
				Thread.sleep(2000);
//		webDB.clickBtnByXPath(HelpCenterLocators.HELPCENTER_SELF_ASSESSMENT_BTN);
//		Thread.sleep(9000);
//		Thread.sleep(9000);
//		webDB.pressKeys(KeyEvent.VK_ALT + KeyEvent.VK_LEFT);
//		Thread.sleep(5000);

				webDB.scrollToAnElement(HelpCenterLocators.HELPCENTER_VISIT_THE_SITE);
				Thread.sleep(2000);
				webDB.clickBtnByXPath(HelpCenterLocators.HELPCENTER_VISIT_THE_SITE);
				Thread.sleep(9000);
			}
		}

		return flag;

	}

	public boolean MyReports() throws InterruptedException, AWTException, IOException {
		
		Thread.sleep(3000);
		webDB.scrollToAnElement(HelpCenterLocators.HELPCENTER_REPORTS_AVAILABLE);
		Thread.sleep(2000);
		flag = webDB.waitElementByXPath(HelpCenterLocators.HELPCENTER_REPORTS_AVAILABLE);
		if (flag) {
			webDB.clickBtnByXPath(HelpCenterLocators.HELPCENTER_REPORTS_AVAILABLE);
			Thread.sleep(5000);
			webDB.scrollToAnElement(HelpCenterLocators.HELPCENTER_VIEW_MY_ERGO_REPORTS);
			Thread.sleep(2000);
			flag = webDB.waitElementByXPath(HelpCenterLocators.HELPCENTER_VIEW_MY_ERGO_REPORTS);
			if (flag) {
				webDB.clickBtnByXPath(HelpCenterLocators.HELPCENTER_VIEW_MY_ERGO_REPORTS);
				Thread.sleep(3000);
				webDB.scrollToAnElement(HelpCenterLocators.HELPCENTER_DOWNLOAD_MY_ERGO_REPORTS);
				Thread.sleep(2000);
				flag = webDB.waitElementByXPath(HelpCenterLocators.HELPCENTER_DOWNLOAD_MY_ERGO_REPORTS);
				if (flag) {
					webDB.clickBtnByXPath(HelpCenterLocators.HELPCENTER_DOWNLOAD_MY_ERGO_REPORTS);
					Thread.sleep(3000);
				}
			}
		}

		return flag;

	}

	public boolean MyData() throws InterruptedException, AWTException, IOException {
//		webDB.scrollToAnElement(HelpCenterLocators.HELPCENTER);
//		Thread.sleep(750);
//		webDB.clickBtnByXPath(HelpCenterLocators.HELPCENTER);
//		Thread.sleep(2000);
		webDB.scrollToAnElement(HelpCenterLocators.HELPCENTER_DATA_SECURE);
		Thread.sleep(2000);
		flag = webDB.waitElementByXPath(HelpCenterLocators.HELPCENTER_DATA_SECURE);
		if (flag) {
			webDB.clickBtnByXPath(HelpCenterLocators.HELPCENTER_DATA_SECURE);
			Thread.sleep(5000);
			webDB.scrollToAnElement("(//strong[text()='Privacy Policy.'])[1]");
			Thread.sleep(2000);
			webDB.clickBtnByXPath("(//strong[text()='Privacy Policy.'])[1]");
			Thread.sleep(2000);
			flag = webDB.waitElementByXPath(HelpCenterLocators.PRIVACY_TEXT);
			if (flag) {
				Thread.sleep(5000);
				webDB.getBack();
				Thread.sleep(2000);
				flag = webDB.waitElementByXPath(HelpCenterLocators.HELPCENTER_SEE_MY_DATA);
				if (flag) {
					webDB.scrollToAnElement(HelpCenterLocators.HELPCENTER_SEE_MY_DATA);
					Thread.sleep(2000);
					webDB.clickBtnByXPath(HelpCenterLocators.HELPCENTER_SEE_MY_DATA);
					Thread.sleep(3000);
					webDB.scrollToAnElement(HelpCenterLocators.HELPCENTER_SEE_MY_DATA_PRIVACY_POLICY_BTN);
					Thread.sleep(2000);
					webDB.clickBtnByXPath(HelpCenterLocators.HELPCENTER_SEE_MY_DATA_PRIVACY_POLICY_BTN);
					Thread.sleep(2000);
					flag = webDB.waitElementByXPath(HelpCenterLocators.PRIVACY_TEXT);
					if (flag) {
						Thread.sleep(3000);
						webDB.getBack();
						Thread.sleep(2000);
						flag = webDB.waitElementByXPath(HelpCenterLocators.HELPCENTER_OPT_OUT);
						if (flag) {
							webDB.scrollToAnElement(HelpCenterLocators.HELPCENTER_OPT_OUT);
							Thread.sleep(2000);
							webDB.clickBtnByXPath(HelpCenterLocators.HELPCENTER_OPT_OUT);
							Thread.sleep(3000);
							webDB.scrollToAnElement(HelpCenterLocators.HELPCENTER_OPT_OUT_SUPPORT_BTN);
							Thread.sleep(2000);
//		webDB.clickBtnByXPath(HelpCenterLocators.HELPCENTER_OPT_OUT_SUPPORT_BTN);
//		Thread.sleep(3000);
//							webDB.getBack();
//							Thread.sleep(2000);
							flag = webDB.waitElementByXPath(HelpCenterLocators.HELPCENTER_OPT_OUT_PRIVACY_POLICY);
							if (flag) {
								webDB.scrollToAnElement(HelpCenterLocators.HELPCENTER_OPT_OUT_PRIVACY_POLICY);
								Thread.sleep(2000);
								webDB.clickBtnByXPath(HelpCenterLocators.HELPCENTER_OPT_OUT_PRIVACY_POLICY);
								Thread.sleep(2000);
								flag = webDB.waitElementByXPath(HelpCenterLocators.PRIVACY_TEXT);
								if (flag) {
									Thread.sleep(3000);
									webDB.getBack();
									Thread.sleep(2000);
								}
							}
						}
					}
				}
			}
		}
		return flag;

	}

	public boolean AdditionalSupports() throws InterruptedException, AWTException {
		webDB.scrollToAnElement(HelpCenterLocators.HELPCENTER_FURTHER_HELP);
		Thread.sleep(2000);
		webDB.clickBtnByXPath(HelpCenterLocators.HELPCENTER_FURTHER_HELP);
		Thread.sleep(3000);
		webDB.scrollToAnElement(HelpCenterLocators.HELPCENTER_ERGO_EVAL);
		Thread.sleep(2000);
		webDB.clickBtnByXPath(HelpCenterLocators.HELPCENTER_ERGO_EVAL);
		Thread.sleep(3000);
		webDB.scrollToAnElement(HelpCenterLocators.HELPCENTER_I_DO_NEXT);
		Thread.sleep(2000);
		webDB.clickBtnByXPath(HelpCenterLocators.HELPCENTER_I_DO_NEXT);
		Thread.sleep(3000);
		return flag;

	}


}
