package com.pbergo.commonfunctions;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

import com.pbergo.base.WebDriverBase;
import com.pbergo.locators.AdminDeleteUserRoleLocators;
import com.pbergo.locators.AdminEditEmailTemplateLocators;
import com.pbergo.locators.AdminEditUserRoleLocators;
import com.pbergo.locators.AdminEmailTemplateLocators;
import com.pbergo.locators.AdminLeftSidePanelLocators;
import com.pbergo.locators.AdminSendNotificationLocators;
import com.pbergo.locators.AdminUserRoleLocators;

public class SendNotificationFunctions {
	private WebDriverBase webDB;
	private boolean flag;
	private String temp;

	public SendNotificationFunctions(WebDriverBase webDB) {
		this.webDB = webDB;
	}

	/**
	 * @return
	 * @throws IOException
	 * @throws InterruptedException
	 */
	public boolean openSendNotificationPage() throws IOException, InterruptedException {
		flag = webDB.waitElementByXPath(AdminLeftSidePanelLocators.ELMNT_SEND_NOTIFICATION_LINK);
		if (flag) {
			webDB.clickBtnByXPath(AdminLeftSidePanelLocators.ELMNT_SEND_NOTIFICATION_LINK);
			Thread.sleep(1000);
			flag = webDB.waitElementByXPath(AdminSendNotificationLocators.ELMNT_CLIENT_LIST_FLD);
		}
		return flag;
	}

	public boolean addSendNotification() throws IOException, InterruptedException {
		flag = webDB.waitElementByXPath(AdminSendNotificationLocators.ELMNT_CLIENT_LIST_FLD);
		if (flag) {
			webDB.sendTextByXPath(AdminSendNotificationLocators.ELMNT_CLIENT_LIST_FLD, "Galaxy_QA_Client_Testing");
			webDB.sendTextByXpath(AdminSendNotificationLocators.ELMNT_CLIENT_LIST_FLD, Keys.ENTER);
			Thread.sleep(2000);
			flag = webDB.waitElementByXPath(AdminSendNotificationLocators.ELMNT_USERS_EMAIL_LIST_CHECKBOX);
			if (flag) {
				webDB.clickBtnByXPath(AdminSendNotificationLocators.ELMNT_USERS_EMAIL_LIST_CHECKBOX);
				Thread.sleep(2000);
				webDB.sendTextByXPath(AdminSendNotificationLocators.ELMNT_EMAIL_TEMPLATE_FLD, "Galaxy QA Testing Template");
//				Thread.sleep(2000);
				webDB.sendTextByXpath(AdminSendNotificationLocators.ELMNT_EMAIL_TEMPLATE_FLD, Keys.ENTER);
				Thread.sleep(4000);

				JavascriptExecutor js = (JavascriptExecutor) webDB.passingWebDriverInstance(webDB);
				js.executeScript("window.scrollBy(0,3000)", "");
				Thread.sleep(2000);
				webDB.clickBtnByID(AdminSendNotificationLocators.ELMNT_SEND_NOTIFICATION_BTN);
				Thread.sleep(2000);
				int count = webDB.countingSizeByXPath(AdminSendNotificationLocators.ELMNT_USER_EMAIL_LIST_COUNT);
				if (count == 1) {
					flag = true;
				}
			}
		}
		return flag;
	}

	public boolean scheduleSendNotification() throws IOException, InterruptedException {
		flag = webDB.waitElementByXPath(AdminSendNotificationLocators.ELMNT_CLIENT_LIST_FLD);
		if (flag) {
			
			webDB.getPageRefresh();
			Thread.sleep(2000);
			
			webDB.sendTextByXPath(AdminSendNotificationLocators.ELMNT_CLIENT_LIST_FLD, "Galaxy_QA_Client_Testing");
			webDB.sendTextByXpath(AdminSendNotificationLocators.ELMNT_CLIENT_LIST_FLD, Keys.ENTER);
			Thread.sleep(2000);
			flag = webDB.waitElementByXPath(AdminSendNotificationLocators.ELMNT_USERS_EMAIL_LIST_CHECKBOX);
			if (flag) {
				webDB.clickBtnByXPath(AdminSendNotificationLocators.ELMNT_USERS_EMAIL_LIST_CHECKBOX);
				Thread.sleep(2000);
				webDB.sendTextByXPath(AdminSendNotificationLocators.ELMNT_EMAIL_TEMPLATE_FLD, "Galaxy QA Testing Template");
				Thread.sleep(2000);
				webDB.sendTextByXpath(AdminSendNotificationLocators.ELMNT_EMAIL_TEMPLATE_FLD, Keys.ENTER);
				Thread.sleep(2000);

				JavascriptExecutor js = (JavascriptExecutor) webDB.passingWebDriverInstance(webDB);
				js.executeScript("window.scrollBy(0,3000)", "");
				Thread.sleep(2000);
				webDB.clickBtnByXPath(AdminSendNotificationLocators.ELMNT_SCHEDULE_SEND_NOTIFICATION_BTN);
				Thread.sleep(1000);
				flag = scheduledNotification();
			}
		}
		return flag;
	}

	public boolean scheduledNotification() throws IOException, InterruptedException {
		flag = webDB.waitElementByXPath(AdminSendNotificationLocators.ELMNT_CALENDAR_ICON);
		if (flag) {
			webDB.clickBtnByXPath(AdminSendNotificationLocators.ELMNT_CALENDAR_ICON);
			Thread.sleep(1000);
			webDB.clickBtnByXPath(AdminSendNotificationLocators.ELMNT_CURRENT_DATE);
			Thread.sleep(1000);
			webDB.sendTextByXPath(AdminSendNotificationLocators.ELMNT_SELECT_HOURS, "00");
			webDB.sendTextByXpath(AdminSendNotificationLocators.ELMNT_SELECT_HOURS, Keys.ENTER);
			Thread.sleep(1000);
			webDB.clickBtnByXPath(AdminSendNotificationLocators.ELMNT_SCHEDULE_BTN);
			Thread.sleep(1000);
			int count = webDB.countingSizeByXPath(AdminSendNotificationLocators.ELMNT_USER_EMAIL_LIST_COUNT);
			if (count == 1) {
				flag = true;
			}
		}
		return flag;
	}
}
