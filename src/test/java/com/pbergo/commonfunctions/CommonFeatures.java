package com.pbergo.commonfunctions;

import java.io.IOException;

import com.github.javafaker.Faker;
import com.pbergo.base.WebDriverBase;
import com.pbergo.locators.CommonFeaturesLocators;

public class CommonFeatures {
	private WebDriverBase webDB;
	private boolean flag;

	private String email;
	private UIBasicFunctions uibasicfunctions;
	Faker faker = new Faker();

	public CommonFeatures(WebDriverBase webDB) {
		this.webDB = webDB;
		uibasicfunctions = new UIBasicFunctions(webDB);
	}

	public boolean datepicker() throws IOException, InterruptedException {
		webDB.NavigateTo("https://staging.pbergo.com/admin/all_user_group");
		Thread.sleep(3000);
		webDB.testSortingFunctionality();
		return flag;

	}

	public boolean pagination() {
		return flag;

	}

	public boolean sortingfirst() throws IOException, InterruptedException {
		flag = webDB.waitElementByXPath(CommonFeaturesLocators.SORTING_TOTAL_BOX);
		if (flag) {
			webDB.clickBtnByXPath(CommonFeaturesLocators.SORTING_TOTAL_BOX);
			Thread.sleep(750);
			webDB.actionMoveToElementByXPath(CommonFeaturesLocators.SORTING_TOTAL_BOX_VALUE).click();
			Thread.sleep(4000);
//			webDB.scrollToAnElement(CommonFeaturesLocators.SORTING_ICON_FIRST_ROW);
//			Thread.sleep(2000);
			flag = webDB.waitElementByXPath(CommonFeaturesLocators.SORTING_ICON_FIRST_ROW);
			if (flag) {
				webDB.clickBtnByXPath(CommonFeaturesLocators.SORTING_ICON_FIRST_ROW);
			}
		}
		return flag;

	}

	public boolean sortingSecond() throws IOException, InterruptedException {
		webDB.scrollToAnElement(CommonFeaturesLocators.SORTING_ICON_SECOND_ROW);
		Thread.sleep(2000);
		flag = webDB.waitElementByXPath(CommonFeaturesLocators.SORTING_ICON_SECOND_ROW);
		if (flag) {
			webDB.clickBtnByXPath(CommonFeaturesLocators.SORTING_ICON_SECOND_ROW);

		}
		return flag;

	}

}
