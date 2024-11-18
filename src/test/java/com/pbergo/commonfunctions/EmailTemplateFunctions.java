package com.pbergo.commonfunctions;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

import com.github.javafaker.Faker;
import com.pbergo.base.WebDriverBase;
import com.pbergo.locators.AdminEmailTemplateLocators;
import com.pbergo.locators.AdminDeleteEmailTemplateLocators;
import com.pbergo.locators.AdminEditEmailTemplateLocators;
import com.pbergo.locators.AdminEmailTemplateLocators;
import com.pbergo.locators.AdminLeftSidePanelLocators;
import com.pbergo.locators.AdminUserRoleLocators;

public class EmailTemplateFunctions {
	private WebDriverBase webDB;
	private boolean flag;
	Faker faker = new Faker();
	String emailtemplatename = new String();

	public EmailTemplateFunctions(WebDriverBase webDB) {
		this.webDB = webDB;
	}

	/**
	 * @return
	 * @throws IOException
	 * @throws InterruptedException
	 */
	public boolean openEmailTemplateListingPage() throws IOException, InterruptedException {
		flag = webDB.waitElementByXPath(AdminLeftSidePanelLocators.ELMNT_EMAIL_TEMPLATE_LINK);
		if (flag) {
			webDB.clickBtnByXPath(AdminLeftSidePanelLocators.ELMNT_EMAIL_TEMPLATE_LINK);
			flag = webDB.waitElementByXPath(AdminEmailTemplateLocators.ELMNT_ADD_TEMPLATE_BTN);
		}
		return flag;
	}

	public boolean addEmailTemplate() throws IOException, InterruptedException {
		flag = webDB.waitElementByXPath(AdminEmailTemplateLocators.ELMNT_ADD_TEMPLATE_BTN);
		if (flag) {
			webDB.clickBtnByXPath(AdminEmailTemplateLocators.ELMNT_ADD_TEMPLATE_BTN);
			flag = webDB.waitElementByXPath(AdminEmailTemplateLocators.ELMNT_EMAIL_TEMPLATE_NAME_FLD);
			if (flag) {

				int number = faker.number().numberBetween(1, 50);
				emailtemplatename = "Testing Email Template_" + number;
				webDB.sendTextByXPath(AdminEmailTemplateLocators.ELMNT_EMAIL_TEMPLATE_NAME_FLD, emailtemplatename);
				Thread.sleep(1000);
				System.out.println("Entered email template name as " + emailtemplatename);
				webDB.sendTextByXPath(AdminEmailTemplateLocators.ELMNT_SUBJECT_FLD, "Email Template Subject Test.");
				Thread.sleep(1000);
				webDB.clickBtnByXPath(AdminEmailTemplateLocators.ELMNT_CONTENT_FLD);
				Thread.sleep(1000);
				webDB.sendTextByXPath(AdminEmailTemplateLocators.ELMNT_CONTENT_FLD,
						"Test Content in the Email Template.");
				Thread.sleep(1000);
				JavascriptExecutor js = (JavascriptExecutor) webDB.passingWebDriverInstance(webDB);
				js.executeScript("window.scrollBy(0,300)", "");
				Thread.sleep(2000);
				webDB.sendTextByXPath(AdminEmailTemplateLocators.ELMNT_CLIENT_FLD, "Galaxy_QA_Client_Testing");
				webDB.sendTextByXpath(AdminEmailTemplateLocators.ELMNT_CLIENT_FLD, Keys.ENTER);
				Thread.sleep(1000);
				webDB.sendTextByXPath(AdminEmailTemplateLocators.ELMNT_TYPE_FLD, "Reset Password");
				webDB.sendTextByXpath(AdminEmailTemplateLocators.ELMNT_TYPE_FLD, Keys.ENTER);
//				Thread.sleep(1000);
//				webDB.sendTextByXPath(AdminEmailTemplateLocators.ELMNT_INCLUDE_CC_FLD, "test@yop.com");
				Thread.sleep(1000);
				js.executeScript("window.scrollBy(0,300)", "");
				Thread.sleep(2000);
				webDB.clickBtnByXPath(AdminEmailTemplateLocators.ELMNT_ADD_NEW_BTN);
				Thread.sleep(2000);
				flag = webDB.waitElementByXPath(AdminEmailTemplateLocators.ELMNT_ADD_TEMPLATE_BTN);
			}
		}
		return flag;
	}

	public boolean searchEmailTemplate(String elementToWait) throws IOException, InterruptedException {
		flag = webDB.waitElementByXPath(AdminEmailTemplateLocators.ELMNT_SEARCH_FLD);
		if (flag) {
			webDB.getPageRefresh();
			Thread.sleep(2000);
			webDB.waitElementByXPath(AdminEmailTemplateLocators.ELMNT_SEARCH_FLD);
			webDB.sendTextByXPath(AdminEmailTemplateLocators.ELMNT_SEARCH_FLD, emailtemplatename);
			Thread.sleep(1000);
			webDB.sendTextByXpath(AdminEmailTemplateLocators.ELMNT_SEARCH_FLD, Keys.ENTER);
			Thread.sleep(1000);
			flag = webDB.waitElementByXPath(elementToWait);
			Thread.sleep(2000);
		}
		return flag;
	}

	public boolean editEmailTemplate() throws IOException, InterruptedException {
		flag = searchEmailTemplate(AdminEmailTemplateLocators.ELMNT_EMAIL_EDIT_LNK);
		if (flag) {
			webDB.clickBtnByXPath(AdminEmailTemplateLocators.ELMNT_EMAIL_EDIT_LNK);
			flag = webDB.waitElementByXPath(AdminEditEmailTemplateLocators.ELMNT_EMAIL_TEMPLATE_NAME_FLD);
			if (flag) {
				JavascriptExecutor js = (JavascriptExecutor) webDB.passingWebDriverInstance(webDB);
				js.executeScript("window.scrollBy(0,3000)", "");
				Thread.sleep(2000);

				webDB.clickBtnByXPath(AdminEditEmailTemplateLocators.ELMNT_UPDATE_BTN);
				Thread.sleep(2000);
				flag = webDB.waitElementByXPath(AdminEmailTemplateLocators.ELMNT_ADD_TEMPLATE_BTN);
			}
		}
		return flag;
	}

	public boolean deleteEmailTemplate() throws IOException, InterruptedException {
		flag = searchEmailTemplate(AdminEmailTemplateLocators.ELMNT_EMAIL_DELETE_LNK);
		if (flag) {
			webDB.clickBtnByXPath(AdminEmailTemplateLocators.ELMNT_EMAIL_DELETE_LNK);
			Thread.sleep(2000);
			flag = webDB.waitElementByXPath(AdminDeleteEmailTemplateLocators.ELMNT_YES_BTN);
			if (flag) {
				webDB.clickBtnByXPath(AdminDeleteEmailTemplateLocators.ELMNT_YES_BTN);
				Thread.sleep(1000);
				flag = webDB.waitElementByXPath(AdminEmailTemplateLocators.ELMNT_ADD_TEMPLATE_BTN);
			}
		}
		return flag;
	}

	public boolean verifyPaginationFunctionality() throws InterruptedException, IOException {
//		webDB.NavigateTo("https://staging.pbergo.com/admin/email_template");
//		Thread.sleep(1500);
		webDB.getPageRefresh();
		Thread.sleep(2000);
		flag = webDB.verifyPagination("(//p[@class='float-lg-start text-sm-center'])[1]",
				"(//li[@class='page-item next']/button)[1]",
				"//table[@class='table table-bordered table dataTable no-footer']//tbody//tr");
		return flag;

	}

	public boolean verifyAscendingOrderSortingFunctionalityOfTemplateNameColumn() throws InterruptedException {
		flag = webDB.verifyAscendingOrderSortingFunctionality(
				AdminEmailTemplateLocators.EMAIL_TEMPLATENAME_COLUMNDATA_ONWHICHSORTINGAPPLIED,
				AdminEmailTemplateLocators.EMAIL_TEMPLATENAME_COLUMNNAME_ONWHICHSORTINGAPPLIED,
				AdminEmailTemplateLocators.EMAIL_TEMPLATENAME_COLUMN_TOTALARROWCOUNT_ONWHICHSORTINGAPPLIED,
				AdminEmailTemplateLocators.EMAIL_TEMPLATENAME_COLUMN_UPARROW_ONWHICHSORTINGAPPLIED);

		return flag;
	}

	public boolean verifyDecendingOrderSortingFunctionalityOfTemplateNameColumn() throws InterruptedException {
		flag = webDB.verifyDecendingOrderSortingFunctionality(
				AdminEmailTemplateLocators.EMAIL_TEMPLATENAME_COLUMNDATA_ONWHICHSORTINGAPPLIED,
				AdminEmailTemplateLocators.EMAIL_TEMPLATENAME_COLUMNNAME_ONWHICHSORTINGAPPLIED);

		return flag;
	}

	public boolean verifyAscendingOrderSortingFunctionalityOfSubjectColumn() throws InterruptedException {
		flag = webDB.verifyAscendingOrderSortingFunctionality(
				AdminEmailTemplateLocators.EMAIL_SUBJECT_COLUMNDATA_ONWHICHSORTINGAPPLIED,
				AdminEmailTemplateLocators.EMAIL_SUBJECT_COLUMNNAME_ONWHICHSORTINGAPPLIED,
				AdminEmailTemplateLocators.EMAIL_SUBJECT_COLUMN_TOTALARROWCOUNT_ONWHICHSORTINGAPPLIED,
				AdminEmailTemplateLocators.EMAIL_SUBJECT_COLUMN_UPARROW_ONWHICHSORTINGAPPLIED);

		return flag;
	}

	public boolean verifyDecendingOrderSortingFunctionalityOfSubjectColumn() throws InterruptedException {
		flag = webDB.verifyDecendingOrderSortingFunctionality(
				AdminEmailTemplateLocators.EMAIL_SUBJECT_COLUMNDATA_ONWHICHSORTINGAPPLIED,
				AdminEmailTemplateLocators.EMAIL_SUBJECT_COLUMNNAME_ONWHICHSORTINGAPPLIED);

		return flag;
	}

	public boolean verifyAscendingOrderSortingFunctionalityOfClientColumn() throws InterruptedException {
		flag = webDB.verifyAscendingOrderSortingFunctionality(
				AdminEmailTemplateLocators.EMAIL_CLIENT_COLUMNDATA_ONWHICHSORTINGAPPLIED,
				AdminEmailTemplateLocators.EMAIL_CLIENT_COLUMNNAME_ONWHICHSORTINGAPPLIED,
				AdminEmailTemplateLocators.EMAIL_CLIENT_COLUMN_TOTALARROWCOUNT_ONWHICHSORTINGAPPLIED,
				AdminEmailTemplateLocators.EMAIL_CLIENT_COLUMN_UPARROW_ONWHICHSORTINGAPPLIED);

		return flag;
	}

	public boolean verifyDecendingOrderSortingFunctionalityOfClientColumn() throws InterruptedException {
		flag = webDB.verifyDecendingOrderSortingFunctionality(
				AdminEmailTemplateLocators.EMAIL_CLIENT_COLUMNDATA_ONWHICHSORTINGAPPLIED,
				AdminEmailTemplateLocators.EMAIL_CLIENT_COLUMNNAME_ONWHICHSORTINGAPPLIED);

		return flag;
	}

}
