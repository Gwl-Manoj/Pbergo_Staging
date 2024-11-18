package com.pbergo.commonfunctions;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.pbergo.base.WebDriverBase;
import com.pbergo.locators.AdminClientActiviyLocators;
import com.pbergo.locators.ProgramOverviewLocators;

public class ClientActivity {
	private WebDriverBase webDB;
	private boolean flag;
	private String temp;
	WebDriver driver;
	private JavascriptExecutor js;

	public ClientActivity(WebDriverBase webDB) {
		this.webDB = webDB;
		js = (JavascriptExecutor) webDB.passingWebDriverInstance(webDB);
	}

	public boolean click_Update_Btn() throws IOException, InterruptedException {
		Thread.sleep(2000);
		webDB.clickBtnByXPath(AdminClientActiviyLocators.CLIENTACTIVITY);
		flag = webDB.waitElementByXPath(AdminClientActiviyLocators.CLIENTACTIVITY_FROM_DATE);
		if (flag) {
			webDB.clickBtnByXPath(AdminClientActiviyLocators.CLIENTACTIVITY_ALLCLIENT);
			Thread.sleep(2000);
			webDB.sendTextByXPath(AdminClientActiviyLocators.CLIENTACTIVITY_ALLCLIENT, "PBE testing");
			webDB.sendTextByXpath(AdminClientActiviyLocators.CLIENTACTIVITY_ALLCLIENT, Keys.ENTER);

			Thread.sleep(2000);

		}
		return flag;

	}

	public boolean downloadDocumentForAllClient() throws IOException, InterruptedException {
		Thread.sleep(2000);
		flag = webDB.waitElementByXPath(AdminClientActiviyLocators.CLIENTACTIVITY_ALLCLIENT);
		if (flag) {
			webDB.clickBtnByXPath(AdminClientActiviyLocators.CLIENTACTIVITY_DOWNLOAD_ICON);
			flag = webDB.waitElementByXPath(AdminClientActiviyLocators.CLIENTACTIVITY_DOWNLOAD_POPUP_DOC);
			if (flag) {
				webDB.clickBtnByXPath(AdminClientActiviyLocators.CLIENTACTIVITY_DOWNLOAD_POPUP_DOC);
				Thread.sleep(2000);
				webDB.clickBtnByXPath(AdminClientActiviyLocators.CLIENTACTIVITY_DOWNLOAD_BTN);
				Thread.sleep(2000);
//				flag = webDB.waitElementByXPath(AdminClientActiviyLocators.CLIENTACTIVITY_FROM_DATE);

			}
		}
		return flag;
	}

	public boolean downloadImageForAllClient() throws IOException, InterruptedException {
		Thread.sleep(5000);
		flag = webDB.waitElementByXPath(AdminClientActiviyLocators.CLIENTACTIVITY_ALLCLIENT);
		if (flag) {
			webDB.clickBtnByXPath(AdminClientActiviyLocators.CLIENTACTIVITY_DOWNLOAD_ICON);
			flag = webDB.waitElementByXPath(AdminClientActiviyLocators.CLIENTACTIVITY_DOWNLOAD_POPUP_IMG);
			if (flag) {
//				webDB.clickBtnByXPath(AdminClientActiviyLocators.CLIENTACTIVITY_DOWNLOAD_POPUP_IMG);

				webDB.clickBtnByXPath(AdminClientActiviyLocators.CLIENTACTIVITY_DOWNLOAD_BTN);
				Thread.sleep(2000);
//				flag = webDB.waitElementByXPath(AdminClientActiviyLocators.CLIENTACTIVITY_FROM_DATE);
			}
		}

		return flag;
	}
	public boolean downloadDocumentForHashAllClient() throws IOException, InterruptedException {
		webDB.clickBtnByXPath(AdminClientActiviyLocators.ALL_CLIENT_HASH);
		Thread.sleep(2000);
		flag = webDB.waitElementByXPath(AdminClientActiviyLocators.CLIENTACTIVITY_ALLCLIENT);
		if (flag) {
			webDB.clickBtnByXPath(AdminClientActiviyLocators.CLIENTACTIVITY_DOWNLOAD_ICON);
			flag = webDB.waitElementByXPath(AdminClientActiviyLocators.CLIENTACTIVITY_DOWNLOAD_POPUP_DOC);
			if (flag) {
				webDB.clickBtnByXPath(AdminClientActiviyLocators.CLIENTACTIVITY_DOWNLOAD_POPUP_DOC);
				Thread.sleep(2000);
				webDB.clickBtnByXPath(AdminClientActiviyLocators.CLIENTACTIVITY_DOWNLOAD_BTN);
				Thread.sleep(2000);
//				flag = webDB.waitElementByXPath(AdminClientActiviyLocators.CLIENTACTIVITY_FROM_DATE);

			}
		}
		return flag;
	}

	public boolean downloadImageForHashAllClient() throws IOException, InterruptedException {
		Thread.sleep(5000);
		flag = webDB.waitElementByXPath(AdminClientActiviyLocators.CLIENTACTIVITY_ALLCLIENT);
		if (flag) {
			webDB.clickBtnByXPath(AdminClientActiviyLocators.CLIENTACTIVITY_DOWNLOAD_ICON);
			flag = webDB.waitElementByXPath(AdminClientActiviyLocators.CLIENTACTIVITY_DOWNLOAD_POPUP_IMG);
			if (flag) {
//				webDB.clickBtnByXPath(AdminClientActiviyLocators.CLIENTACTIVITY_DOWNLOAD_POPUP_IMG);

				webDB.clickBtnByXPath(AdminClientActiviyLocators.CLIENTACTIVITY_DOWNLOAD_BTN);
				Thread.sleep(2000);
//				flag = webDB.waitElementByXPath(AdminClientActiviyLocators.CLIENTACTIVITY_FROM_DATE);
			}
		}

		return flag;
	}

	public boolean RegistraintsBtn() throws IOException, InterruptedException {
		Thread.sleep(2000);
		webDB.scrolldown(300);
		Thread.sleep(2000);
		flag = webDB.waitElementByXPath(AdminClientActiviyLocators.CLIENTACTIVITY_REGISTRAINTS_BTN);
		if (flag) {
			webDB.clickBtnByXPath(AdminClientActiviyLocators.CLIENTACTIVITY_SUB_DOWNLOAD_BTN);
			flag = webDB.waitElementByXPath(AdminClientActiviyLocators.CLIENTACTIVITY_DOWNLOAD_POPUP_IMG);
			if (flag) {
				webDB.clickBtnByXPath(AdminClientActiviyLocators.CLIENTACTIVITY_DOWNLOAD_POPUP_IMG);
				Thread.sleep(2000);
				webDB.clickBtnByXPath(AdminClientActiviyLocators.CLIENTACTIVITY_DOWNLOAD_BTN);
				Thread.sleep(2000);
//				flag = webDB.waitElementByXPath(AdminClientActiviyLocators.CLIENTACTIVITY_FROM_DATE);

			}
		}
		return flag;

	}

	public boolean DownloadDoccumentForRegistraints() throws IOException, InterruptedException {
		webDB.clickBtnByXPath(AdminClientActiviyLocators.CLIENTACTIVITY_SUB_DOWNLOAD_BTN);
		flag = webDB.waitElementByXPath(AdminClientActiviyLocators.CLIENTACTIVITY_DOWNLOAD_POPUP_IMG);
		if (flag) {
			webDB.actionMoveToElementByXPath(AdminClientActiviyLocators.CLIENTACTIVITY_DOWNLOAD_POPUP_DOC);
			Thread.sleep(2000);
			webDB.clickBtnByXPath(AdminClientActiviyLocators.CLIENTACTIVITY_DOWNLOAD_POPUP_DOC);
			Thread.sleep(2000);
			webDB.clickBtnByXPath(AdminClientActiviyLocators.CLIENTACTIVITY_DOWNLOAD_BTN);
			Thread.sleep(2000);
		}
		return flag;

	}

	public boolean DownloadDoccumentForSAActivity() throws IOException, InterruptedException {
		webDB.clickBtnByXPath(AdminClientActiviyLocators.CLIENTACTIVITY_SA_Activity_BTN);
		Thread.sleep(2000);
		webDB.clickBtnByXPath(AdminClientActiviyLocators.CLIENTACTIVITY_SUB_DOWNLOAD_BTN);
		flag = webDB.waitElementByXPath(AdminClientActiviyLocators.CLIENTACTIVITY_DOWNLOAD_POPUP_IMG);
		if (flag) {
			webDB.actionMoveToElementByXPath(AdminClientActiviyLocators.CLIENTACTIVITY_DOWNLOAD_POPUP_DOC);
			Thread.sleep(2000);
			webDB.clickBtnByXPath(AdminClientActiviyLocators.CLIENTACTIVITY_DOWNLOAD_POPUP_DOC);
			Thread.sleep(2000);
			webDB.clickBtnByXPath(AdminClientActiviyLocators.CLIENTACTIVITY_DOWNLOAD_BTN);
			Thread.sleep(2000);
		}
		return flag;

	}

	public boolean DownloadImageForSAActivity() throws IOException, InterruptedException {

		Thread.sleep(2000);
		flag = webDB.waitElementByXPath(AdminClientActiviyLocators.CLIENTACTIVITY_SA_Activity_BTN);
		if (flag) {
			webDB.clickBtnByXPath(AdminClientActiviyLocators.CLIENTACTIVITY_SUB_DOWNLOAD_BTN);
			flag = webDB.waitElementByXPath(AdminClientActiviyLocators.CLIENTACTIVITY_DOWNLOAD_POPUP_IMG);
			if (flag) {
				webDB.actionMoveToElementByXPath(AdminClientActiviyLocators.CLIENTACTIVITY_DOWNLOAD_POPUP_DOC);
				Thread.sleep(2000);
				webDB.clickBtnByXPath(AdminClientActiviyLocators.CLIENTACTIVITY_DOWNLOAD_POPUP_DOC);
				Thread.sleep(2000);
				webDB.clickBtnByXPath(AdminClientActiviyLocators.CLIENTACTIVITY_DOWNLOAD_BTN);
				Thread.sleep(2000);

			}
		}
		return flag;

	}

	public boolean DownloadDoccumentForEvalReports() throws IOException, InterruptedException {
		webDB.clickBtnByXPath(AdminClientActiviyLocators.CLIENTACTIVITY_EVAL_REPORTS_BTN);
		Thread.sleep(2000);
		webDB.clickBtnByXPath(AdminClientActiviyLocators.CLIENTACTIVITY_SUB_DOWNLOAD_BTN);
		flag = webDB.waitElementByXPath(AdminClientActiviyLocators.CLIENTACTIVITY_DOWNLOAD_POPUP_IMG);
		if (flag) {
			webDB.actionMoveToElementByXPath(AdminClientActiviyLocators.CLIENTACTIVITY_DOWNLOAD_POPUP_DOC);
			Thread.sleep(2000);
			webDB.clickBtnByXPath(AdminClientActiviyLocators.CLIENTACTIVITY_DOWNLOAD_POPUP_DOC);
			Thread.sleep(2000);
			webDB.clickBtnByXPath(AdminClientActiviyLocators.CLIENTACTIVITY_DOWNLOAD_BTN);
			Thread.sleep(2000);
		}
		return flag;

	}

	public boolean DownloadImageForEvalReports() throws IOException, InterruptedException {

		Thread.sleep(2000);
		flag = webDB.waitElementByXPath(AdminClientActiviyLocators.CLIENTACTIVITY_EVAL_REPORTS_BTN);
		if (flag) {
			webDB.clickBtnByXPath(AdminClientActiviyLocators.CLIENTACTIVITY_SUB_DOWNLOAD_BTN);
			flag = webDB.waitElementByXPath(AdminClientActiviyLocators.CLIENTACTIVITY_DOWNLOAD_POPUP_IMG);
			if (flag) {
				webDB.actionMoveToElementByXPath(AdminClientActiviyLocators.CLIENTACTIVITY_DOWNLOAD_POPUP_DOC);
				Thread.sleep(2000);
				webDB.clickBtnByXPath(AdminClientActiviyLocators.CLIENTACTIVITY_DOWNLOAD_POPUP_DOC);
				Thread.sleep(2000);
				webDB.clickBtnByXPath(AdminClientActiviyLocators.CLIENTACTIVITY_DOWNLOAD_BTN);
				Thread.sleep(2000);

			}
		}
		return flag;

	}

	public boolean DownloadDoccumentForErgoEval() throws IOException, InterruptedException {
		webDB.clickBtnByXPath(AdminClientActiviyLocators.CLIENTACTIVITY_ERGO_EVAL_BTN);
		Thread.sleep(2000);
		webDB.clickBtnByXPath(AdminClientActiviyLocators.CLIENTACTIVITY_SUB_DOWNLOAD_BTN);
		flag = webDB.waitElementByXPath(AdminClientActiviyLocators.CLIENTACTIVITY_DOWNLOAD_POPUP_IMG);
		if (flag) {
			webDB.actionMoveToElementByXPath(AdminClientActiviyLocators.CLIENTACTIVITY_DOWNLOAD_POPUP_DOC);
			Thread.sleep(2000);
			webDB.clickBtnByXPath(AdminClientActiviyLocators.CLIENTACTIVITY_DOWNLOAD_POPUP_DOC);
			Thread.sleep(2000);
			webDB.clickBtnByXPath(AdminClientActiviyLocators.CLIENTACTIVITY_DOWNLOAD_BTN);
			Thread.sleep(2000);
		}
		return flag;

	}

	public boolean DownloadImageForErgoEval() throws IOException, InterruptedException {

		Thread.sleep(2000);
		flag = webDB.waitElementByXPath(AdminClientActiviyLocators.CLIENTACTIVITY_ERGO_EVAL_BTN);
		if (flag) {
			webDB.clickBtnByXPath(AdminClientActiviyLocators.CLIENTACTIVITY_SUB_DOWNLOAD_BTN);
			flag = webDB.waitElementByXPath(AdminClientActiviyLocators.CLIENTACTIVITY_DOWNLOAD_POPUP_IMG);
			if (flag) {
				webDB.actionMoveToElementByXPath(AdminClientActiviyLocators.CLIENTACTIVITY_DOWNLOAD_POPUP_DOC);
				Thread.sleep(2000);
				webDB.clickBtnByXPath(AdminClientActiviyLocators.CLIENTACTIVITY_DOWNLOAD_POPUP_DOC);
				Thread.sleep(2000);
				webDB.clickBtnByXPath(AdminClientActiviyLocators.CLIENTACTIVITY_DOWNLOAD_BTN);
				Thread.sleep(2000);

			}
		}
		return flag;

	}

	public boolean DownloadDoccumentForSiteRegistraints() throws IOException, InterruptedException {
		Thread.sleep(2000);
		webDB.clickBtnByXPath(AdminClientActiviyLocators.SITEREGISTRAINTS_SUB_DOWNLOAD_BTN);
		flag = webDB.waitElementByXPath(AdminClientActiviyLocators.CLIENTACTIVITY_DOWNLOAD_POPUP_IMG);
		if (flag) {
			webDB.actionMoveToElementByXPath(AdminClientActiviyLocators.CLIENTACTIVITY_DOWNLOAD_POPUP_DOC);
			Thread.sleep(2000);
			webDB.clickBtnByXPath(AdminClientActiviyLocators.CLIENTACTIVITY_DOWNLOAD_POPUP_DOC);
			Thread.sleep(2000);
			webDB.clickBtnByXPath(AdminClientActiviyLocators.CLIENTACTIVITY_DOWNLOAD_BTN);
			Thread.sleep(2000);
		}
		return flag;

	}

	public boolean DownloadImageForSiteRegistraints() throws IOException, InterruptedException {
		Thread.sleep(2000);
		flag = webDB.waitElementByXPath(AdminClientActiviyLocators.SITEREGISTRAINTS_SUB_DOWNLOAD_BTN);
		if (flag) {
			webDB.clickBtnByXPath(AdminClientActiviyLocators.SITEREGISTRAINTS_SUB_DOWNLOAD_BTN);
			flag = webDB.waitElementByXPath(AdminClientActiviyLocators.CLIENTACTIVITY_DOWNLOAD_POPUP_IMG);
			if (flag) {
				webDB.actionMoveToElementByXPath(AdminClientActiviyLocators.CLIENTACTIVITY_DOWNLOAD_POPUP_DOC);
				Thread.sleep(2000);
				webDB.clickBtnByXPath(AdminClientActiviyLocators.CLIENTACTIVITY_DOWNLOAD_POPUP_DOC);
				Thread.sleep(2000);
				webDB.clickBtnByXPath(AdminClientActiviyLocators.CLIENTACTIVITY_DOWNLOAD_BTN);
				Thread.sleep(2000);

			}
		}
		return flag;

	}
	
	public boolean DownloadDoccumentForCurrentSiteRegistraints() throws IOException, InterruptedException {
		webDB.clickBtnByXPath(AdminClientActiviyLocators.SITEREGISTRAINTS_CURRENT_BTN);
		Thread.sleep(2000);
		webDB.clickBtnByXPath(AdminClientActiviyLocators.SITEREGISTRAINTS_SUB_DOWNLOAD_BTN);
		flag = webDB.waitElementByXPath(AdminClientActiviyLocators.CLIENTACTIVITY_DOWNLOAD_POPUP_IMG);
		if (flag) {
			webDB.actionMoveToElementByXPath(AdminClientActiviyLocators.CLIENTACTIVITY_DOWNLOAD_POPUP_DOC);
			Thread.sleep(2000);
			webDB.clickBtnByXPath(AdminClientActiviyLocators.CLIENTACTIVITY_DOWNLOAD_POPUP_DOC);
			Thread.sleep(2000);
			webDB.clickBtnByXPath(AdminClientActiviyLocators.CLIENTACTIVITY_DOWNLOAD_BTN);
			Thread.sleep(2000);
		}
		return flag;

	}

	public boolean DownloadImageForCurrentSiteRegistraints() throws IOException, InterruptedException {

		Thread.sleep(2000);
		flag = webDB.waitElementByXPath(AdminClientActiviyLocators.SITEREGISTRAINTS_SUB_DOWNLOAD_BTN);
		if (flag) {
			webDB.clickBtnByXPath(AdminClientActiviyLocators.SITEREGISTRAINTS_SUB_DOWNLOAD_BTN);
			flag = webDB.waitElementByXPath(AdminClientActiviyLocators.CLIENTACTIVITY_DOWNLOAD_POPUP_IMG);
			if (flag) {
				webDB.actionMoveToElementByXPath(AdminClientActiviyLocators.CLIENTACTIVITY_DOWNLOAD_POPUP_DOC);
				Thread.sleep(2000);
				webDB.clickBtnByXPath(AdminClientActiviyLocators.CLIENTACTIVITY_DOWNLOAD_POPUP_DOC);
				Thread.sleep(2000);
				webDB.clickBtnByXPath(AdminClientActiviyLocators.CLIENTACTIVITY_DOWNLOAD_BTN);
				Thread.sleep(2000);

			}
		}
		return flag;

	}
}
