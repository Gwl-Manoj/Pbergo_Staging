package com.pbergo.commonfunctions;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.pbergo.base.WebDriverBase;
import com.pbergo.locators.ProgramOverviewLocators;
//import com.pbergo.locators.HeaderSectionLocators;
//import com.pbergo.locators.LeftSidePanelLocators;
import com.pbergo.locators.UsersLocators;

public class ProgramOverviewFunctions {
	private WebDriverBase webDB;
	private boolean flag;
	private String temp;
	WebDriver driver;

	public ProgramOverviewFunctions(WebDriverBase webDB) {
		this.webDB = webDB;
	}

	/**
	 * @param userPermittedSection [Passing options from the Menu link]
	 * @return
	 * @throws IOException
	 * @throws InterruptedException
	 */
	public boolean openProgramOverviewLink() throws IOException, InterruptedException {
		Thread.sleep(1000);
		flag = webDB.waitElementByXPath(ProgramOverviewLocators.ELMNT_PROGRAMOVERVIEW_LEFTSIDEPANEL);
		if (flag) {
			webDB.clickBtnByXPath(ProgramOverviewLocators.ELMNT_PROGRAMOVERVIEW_LEFTSIDEPANEL);
			Thread.sleep(4500);
//			flag = webDB.waitElementByID(ProgramOverviewLocators.ELMNT_CURRENT_OPTION);
		}
		return flag;
	}

	public boolean clickCurrentLink() throws IOException, InterruptedException {
		flag = webDB.waitElementByID(ProgramOverviewLocators.ELMNT_CURRENT_OPTION);
		if (flag) {
			webDB.clickBtnByID(ProgramOverviewLocators.ELMNT_CURRENT_OPTION);
			Thread.sleep(1500);
		}
		return flag;
	}

	public boolean downloadImageForCurrentOption() throws IOException, InterruptedException {
		Thread.sleep(2500);
		flag = webDB.waitElementByXPath(ProgramOverviewLocators.ELMNT_DOWNLOAD_LINK_SITE_REGISTRANTS);
		if (flag) {
			webDB.clickBtnByXPath(ProgramOverviewLocators.ELMNT_DOWNLOAD_LINK_SITE_REGISTRANTS);
			Thread.sleep(1000);
			flag = webDB.waitElementByXPath(ProgramOverviewLocators.ELMNT_DOWNLOAD_IMAGE);
			if (flag) {
				webDB.clickBtnByXPath(ProgramOverviewLocators.ELMNT_DOWNLOAD_IMAGE);
				Thread.sleep(1000);
				webDB.clickBtnByXPath(ProgramOverviewLocators.ELMNT_DOWNLOAD_BTN);
				Thread.sleep(1500);
				flag = webDB.waitElementByXPath(ProgramOverviewLocators.ELMNT_DOWNLOAD_LINK_SITE_REGISTRANTS);
			}
		}
		return flag;
	}

	public boolean downloadDocumentForCurrentOption() throws IOException, InterruptedException {
		Thread.sleep(1000);
		flag = webDB.waitElementByXPath(ProgramOverviewLocators.ELMNT_DOWNLOAD_LINK_SITE_REGISTRANTS);
		if (flag) {
			webDB.clickBtnByXPath(ProgramOverviewLocators.ELMNT_DOWNLOAD_LINK_SITE_REGISTRANTS);
			Thread.sleep(1000);
			flag = webDB.waitElementByXPath(ProgramOverviewLocators.ELMNT_DOWNLOAD_DOCUMENT);
			if (flag) {
				webDB.clickBtnByXPath(ProgramOverviewLocators.ELMNT_DOWNLOAD_DOCUMENT);
				Thread.sleep(1000);
				webDB.clickBtnByXPath(ProgramOverviewLocators.ELMNT_DOWNLOAD_BTN);
				Thread.sleep(1000);
				flag = webDB.waitElementByXPath(ProgramOverviewLocators.ELMNT_DOWNLOAD_LINK_SITE_REGISTRANTS);
			}
		}
		return flag;
	}

	public boolean clickYTDLink() throws IOException, InterruptedException {
		Thread.sleep(1000);
		flag = webDB.waitElementByID(ProgramOverviewLocators.ELMNT_YTD_OPTION);
		if (flag) {
			webDB.clickBtnByID(ProgramOverviewLocators.ELMNT_YTD_OPTION);
			Thread.sleep(1500);
		}
		return flag;
	}

	public boolean downloadImageForYTDOption() throws IOException, InterruptedException {
		Thread.sleep(1000);
		flag = webDB.waitElementByXPath(ProgramOverviewLocators.ELMNT_DOWNLOAD_LINK_SITE_REGISTRANTS);
		if (flag) {
			webDB.clickBtnByXPath(ProgramOverviewLocators.ELMNT_DOWNLOAD_LINK_SITE_REGISTRANTS);
			Thread.sleep(1000);
			flag = webDB.waitElementByXPath(ProgramOverviewLocators.ELMNT_DOWNLOAD_IMAGE);
			if (flag) {
				webDB.clickBtnByXPath(ProgramOverviewLocators.ELMNT_DOWNLOAD_IMAGE);
				Thread.sleep(1000);
				webDB.clickBtnByXPath(ProgramOverviewLocators.ELMNT_DOWNLOAD_BTN);
				Thread.sleep(1500);
				flag = webDB.waitElementByXPath(ProgramOverviewLocators.ELMNT_DOWNLOAD_LINK_SITE_REGISTRANTS);
			}
		}
		return flag;
	}

	public boolean downloadDocumentForYTDOption() throws IOException, InterruptedException {
		Thread.sleep(1000);
		flag = webDB.waitElementByXPath(ProgramOverviewLocators.ELMNT_DOWNLOAD_LINK_SITE_REGISTRANTS);
		if (flag) {
			webDB.clickBtnByXPath(ProgramOverviewLocators.ELMNT_DOWNLOAD_LINK_SITE_REGISTRANTS);
			Thread.sleep(1000);
			flag = webDB.waitElementByXPath(ProgramOverviewLocators.ELMNT_DOWNLOAD_DOCUMENT);
			if (flag) {
				webDB.clickBtnByXPath(ProgramOverviewLocators.ELMNT_DOWNLOAD_DOCUMENT);
				Thread.sleep(1000);
				webDB.clickBtnByXPath(ProgramOverviewLocators.ELMNT_DOWNLOAD_BTN);
				Thread.sleep(1000);
				flag = webDB.waitElementByXPath(ProgramOverviewLocators.ELMNT_DOWNLOAD_LINK_SITE_REGISTRANTS);
			}
		}
		return flag;
	}

	public boolean downloadImageForTotalActivityRegion() throws IOException, InterruptedException {
		Thread.sleep(1000);
//		webDB.scrolldown(400);
//		Thread.sleep(1000);
		flag = webDB.waitElementByXPath(ProgramOverviewLocators.ELMNT_DOWNLOAD_LINK_TOTAL_ACTV_REGION);
		if (flag) {
			webDB.clickBtnByXPath(ProgramOverviewLocators.ELMNT_DOWNLOAD_LINK_TOTAL_ACTV_REGION);
			Thread.sleep(1000);
			flag = webDB.waitElementByXPath(ProgramOverviewLocators.ELMNT_DOWNLOAD_IMAGE);
			if (flag) {
				webDB.clickBtnByXPath(ProgramOverviewLocators.ELMNT_DOWNLOAD_IMAGE);
				Thread.sleep(1000);
				webDB.clickBtnByXPath(ProgramOverviewLocators.ELMNT_DOWNLOAD_BTN);
				Thread.sleep(1000);
				flag = webDB.waitElementByXPath(ProgramOverviewLocators.ELMNT_DOWNLOAD_LINK_TOTAL_ACTV_REGION);
			}
		}
		return flag;
	}

	public boolean downloadImageHashForTotalActivityRegion() throws IOException, InterruptedException {
		Thread.sleep(1000);
		flag = webDB.waitElementByID(ProgramOverviewLocators.ELMNT_ACTIVITY_REGION_HASH_OPTION);
		if (flag) {
			webDB.clickBtnByID(ProgramOverviewLocators.ELMNT_ACTIVITY_REGION_HASH_OPTION);
			Thread.sleep(1000);
			flag = downloadImageForTotalActivityRegion();
		}
		return flag;
	}

	public boolean downloadDocumentForTotalActivityRegion() throws IOException, InterruptedException {
		Thread.sleep(1000);
		flag = webDB.waitElementByXPath(ProgramOverviewLocators.ELMNT_DOWNLOAD_LINK_TOTAL_ACTV_REGION);
		if (flag) {
			webDB.clickBtnByXPath(ProgramOverviewLocators.ELMNT_DOWNLOAD_LINK_TOTAL_ACTV_REGION);
			Thread.sleep(1000);
			flag = webDB.waitElementByXPath(ProgramOverviewLocators.ELMNT_DOWNLOAD_DOCUMENT);
			if (flag) {
				webDB.clickBtnByXPath(ProgramOverviewLocators.ELMNT_DOWNLOAD_DOCUMENT);
				Thread.sleep(1000);
				webDB.clickBtnByXPath(ProgramOverviewLocators.ELMNT_DOWNLOAD_BTN);
				Thread.sleep(1000);
				flag = webDB.waitElementByXPath(ProgramOverviewLocators.ELMNT_DOWNLOAD_LINK_TOTAL_ACTV_REGION);
			}
		}
		return flag;
	}

	public boolean downloadImageForReasonForAssessment() throws IOException, InterruptedException {
		Thread.sleep(1000);
		flag = webDB.waitElementByXPath(ProgramOverviewLocators.ELMNT_DOWNLOAD_LINK_REASON_ASSESSMENT);
		if (flag) {
			webDB.clickBtnByXPath(ProgramOverviewLocators.ELMNT_DOWNLOAD_LINK_REASON_ASSESSMENT);
			Thread.sleep(1000);
			flag = webDB.waitElementByXPath(ProgramOverviewLocators.ELMNT_DOWNLOAD_IMAGE);
			if (flag) {
				webDB.clickBtnByXPath(ProgramOverviewLocators.ELMNT_DOWNLOAD_IMAGE);
				Thread.sleep(1000);
				webDB.clickBtnByXPath(ProgramOverviewLocators.ELMNT_DOWNLOAD_BTN);
				Thread.sleep(1000);
				flag = webDB.waitElementByXPath(ProgramOverviewLocators.ELMNT_DOWNLOAD_LINK_REASON_ASSESSMENT);
			}
		}
		return flag;
	}

	public boolean downloadDocumentForReasonForAssessment() throws IOException, InterruptedException {
		Thread.sleep(1000);
		flag = webDB.waitElementByXPath(ProgramOverviewLocators.ELMNT_DOWNLOAD_LINK_REASON_ASSESSMENT);
		if (flag) {
			webDB.clickBtnByXPath(ProgramOverviewLocators.ELMNT_DOWNLOAD_LINK_REASON_ASSESSMENT);
			Thread.sleep(1000);
			flag = webDB.waitElementByXPath(ProgramOverviewLocators.ELMNT_DOWNLOAD_DOCUMENT);
			if (flag) {
				webDB.clickBtnByXPath(ProgramOverviewLocators.ELMNT_DOWNLOAD_DOCUMENT);
				Thread.sleep(1000);
				webDB.clickBtnByXPath(ProgramOverviewLocators.ELMNT_DOWNLOAD_BTN);
				Thread.sleep(1000);
				flag = webDB.waitElementByXPath(ProgramOverviewLocators.ELMNT_DOWNLOAD_LINK_REASON_ASSESSMENT);
			}
		}
		return flag;
	}

	public boolean downloadImageForWorkAreaAssessed() throws IOException, InterruptedException {
		Thread.sleep(1000);
		flag = webDB.waitElementByXPath(ProgramOverviewLocators.ELMNT_DOWNLOAD_LINK_WORK_AREA_ASSESSMENT);
		if (flag) {
			webDB.clickBtnByXPath(ProgramOverviewLocators.ELMNT_DOWNLOAD_LINK_WORK_AREA_ASSESSMENT);
			Thread.sleep(1000);
			flag = webDB.waitElementByXPath(ProgramOverviewLocators.ELMNT_DOWNLOAD_IMAGE);
			if (flag) {
				webDB.clickBtnByXPath(ProgramOverviewLocators.ELMNT_DOWNLOAD_IMAGE);
				Thread.sleep(1000);
				webDB.clickBtnByXPath(ProgramOverviewLocators.ELMNT_DOWNLOAD_BTN);
				Thread.sleep(1000);
				flag = webDB.waitElementByXPath(ProgramOverviewLocators.ELMNT_DOWNLOAD_LINK_REASON_ASSESSMENT);
			}
		}
		return flag;
	}

	public boolean downloadDocumentForWorkAreaAssessed() throws IOException, InterruptedException {
		Thread.sleep(1000);
		flag = webDB.waitElementByXPath(ProgramOverviewLocators.ELMNT_DOWNLOAD_LINK_WORK_AREA_ASSESSMENT);
		if (flag) {
			webDB.clickBtnByXPath(ProgramOverviewLocators.ELMNT_DOWNLOAD_LINK_WORK_AREA_ASSESSMENT);
			Thread.sleep(1000);
			flag = webDB.waitElementByXPath(ProgramOverviewLocators.ELMNT_DOWNLOAD_DOCUMENT);
			if (flag) {
				webDB.clickBtnByXPath(ProgramOverviewLocators.ELMNT_DOWNLOAD_DOCUMENT);
				Thread.sleep(1000);
				webDB.clickBtnByXPath(ProgramOverviewLocators.ELMNT_DOWNLOAD_BTN);
				Thread.sleep(1000);
				flag = webDB.waitElementByXPath(ProgramOverviewLocators.ELMNT_DOWNLOAD_LINK_WORK_AREA_ASSESSMENT);
			}
		}
		return flag;
	}

	public boolean selectHashOptionForEVAL() throws IOException, InterruptedException {
		Thread.sleep(1000);
		flag = webDB.waitElementByID(ProgramOverviewLocators.ELMNT_EVAL_HASH_OPTION);
		if (flag) {
			webDB.clickBtnByID(ProgramOverviewLocators.ELMNT_EVAL_HASH_OPTION);
			Thread.sleep(1000);
			flag = webDB.waitElementByXPath(ProgramOverviewLocators.ELMNT_EVAL_USD);
			if (flag) {
				temp = webDB.getTextByXPath(ProgramOverviewLocators.ELMNT_EVAL_USD).replace(" USD", "").replace("$",
						"");
				int i = Integer.parseInt(temp);
				String ele = webDB.getTextByXPath(ProgramOverviewLocators.ELMNT_EVAL_USD_NUMBER);
				int temp1 = Integer.parseInt(ele);
				if (i / temp1 == 300) {
					System.out.println("The price is same for Eval");
					flag = true;
				} else {
					flag = false;
				}
			}
		}
		return flag;
	}

	public boolean selectHashOptionForSA() throws IOException, InterruptedException {
		Thread.sleep(1000);
		webDB.scrolldown(100);
		Thread.sleep(750);
		flag = webDB.waitElementByID(ProgramOverviewLocators.ELMNT_SA_HASH_OPTION);
		if (flag) {
			webDB.clickBtnByID(ProgramOverviewLocators.ELMNT_SA_HASH_OPTION);
			Thread.sleep(1000);
			flag = webDB.waitElementByXPath(ProgramOverviewLocators.ELMNT_SA_USD);
			if (flag) {
				temp = webDB.getTextByXPath(ProgramOverviewLocators.ELMNT_SA_USD).replace(" USD", "").replace("$", "");
				int i = Integer.parseInt(temp);
				String ele = webDB.getTextByXPath(ProgramOverviewLocators.ELMNT_SA_USD_NUMBER);
				int temp1 = Integer.parseInt(ele);
				if (i / temp1 == 300) {
					System.out.println("The price is same for SA");
					flag = true;
				} else {
					flag = false;
				}
			}
			webDB.scrolldown(300);
			Thread.sleep(750);
		}
		return flag;
	}

	
}
