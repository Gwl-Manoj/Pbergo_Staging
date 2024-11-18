package com.pbergo.commonfunctions;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.pbergo.base.WebDriverBase;
import com.pbergo.locators.AdminUserRoleLocators;
import com.pbergo.locators.ErgoEvalActivityLocators;
import com.pbergo.locators.ProgramOverviewLocators;
import com.pbergo.locators.SelfAssessmentLocators;
//import com.pbergo.locators.HeaderSectionLocators;
//import com.pbergo.locators.LeftSidePanelLocators;
import com.pbergo.locators.UsersLocators;

public class ErgoEvalActivityFunctions {
	private WebDriverBase webDB;
	private boolean flag;
	private String temp;
	WebDriver driver;

	public ErgoEvalActivityFunctions(WebDriverBase webDB) {
		this.webDB = webDB;
	}

	/**
	 * @param userPermittedSection [Passing options from the Menu link]
	 * @return
	 * @throws IOException
	 * @throws InterruptedException
	 */
	public boolean openErgoEvalActivityLink() throws IOException, InterruptedException {
		flag = webDB.waitElementByXPath(ErgoEvalActivityLocators.ELMNT_ERGO_EVAL_ACTIVITY_LEFTSIDEPANEL);
		if (flag) {
			webDB.clickBtnByXPath(ErgoEvalActivityLocators.ELMNT_ERGO_EVAL_ACTIVITY_LEFTSIDEPANEL);
			Thread.sleep(1500);
//			flag = webDB.waitElementByID(SelfAssessmentLocators.ELMNT_EVAL_USD);
		}
		return flag;
	}

	public boolean downloadDocumentForSelfReportedDiscomfort() throws IOException, InterruptedException {
		Thread.sleep(1500);
		webDB.scrolldown(300);
		flag = webDB.waitElementByXPath(ErgoEvalActivityLocators.ELMNT_DOWNLOAD_LINK_SELF_REPORTED_DISCOMFORT);
		if (flag) {
			webDB.clickBtnByXPath(ErgoEvalActivityLocators.ELMNT_DOWNLOAD_LINK_SELF_REPORTED_DISCOMFORT);
			Thread.sleep(1000);
			flag = webDB.waitElementByXPath(ErgoEvalActivityLocators.ELMNT_DOWNLOAD_DOCUMENT);
			if (flag) {
				webDB.clickBtnByXPath(ErgoEvalActivityLocators.ELMNT_DOWNLOAD_DOCUMENT);
				Thread.sleep(1000);
				webDB.clickBtnByXPath(ErgoEvalActivityLocators.ELMNT_DOWNLOAD_BTN);
				Thread.sleep(1000);
				flag = webDB.waitElementByXPath(ErgoEvalActivityLocators.ELMNT_DOWNLOAD_LINK_SELF_REPORTED_DISCOMFORT);
			}
		}
		return flag;
	}

	public boolean downloadImageForSelfReportedDiscomfort() throws IOException, InterruptedException {
		Thread.sleep(2500);
		flag = webDB.waitElementByXPath(ErgoEvalActivityLocators.ELMNT_DOWNLOAD_LINK_SELF_REPORTED_DISCOMFORT);
		if (flag) {
			webDB.clickBtnByXPath(ErgoEvalActivityLocators.ELMNT_DOWNLOAD_LINK_SELF_REPORTED_DISCOMFORT);
			Thread.sleep(2500);
			flag = webDB.waitElementByXPath(ErgoEvalActivityLocators.ELMNT_DOWNLOAD_IMAGE);
			if (flag) {
				webDB.clickBtnByXPath(ErgoEvalActivityLocators.ELMNT_DOWNLOAD_IMAGE);
				Thread.sleep(2500);
				webDB.clickBtnByXPath(ErgoEvalActivityLocators.ELMNT_DOWNLOAD_BTN);
				Thread.sleep(2500);
				flag = webDB.waitElementByXPath(ErgoEvalActivityLocators.ELMNT_DOWNLOAD_LINK_SELF_REPORTED_DISCOMFORT);
			}
		}
		return flag;
	}

	public boolean downloadDocumentForEquiRecommandations() throws IOException, InterruptedException {
		Thread.sleep(2500);
		webDB.scrolldown(400);
		Thread.sleep(1000);
		flag = webDB.waitElementByXPath(ErgoEvalActivityLocators.ELMNT_DOWNLOAD_LINK_EQUI_RECOMMENDATIONS);
		if (flag) {
			webDB.clickBtnByXPath(ErgoEvalActivityLocators.ELMNT_DOWNLOAD_LINK_EQUI_RECOMMENDATIONS);
			Thread.sleep(2500);
			flag = webDB.waitElementByXPath(ErgoEvalActivityLocators.ELMNT_DOWNLOAD_DOCUMENT);
			if (flag) {
				webDB.clickBtnByXPath(ErgoEvalActivityLocators.ELMNT_DOWNLOAD_DOCUMENT);
				Thread.sleep(2500);
				webDB.clickBtnByXPath(ErgoEvalActivityLocators.ELMNT_DOWNLOAD_BTN);
				Thread.sleep(2500);
				flag = webDB.waitElementByXPath(ErgoEvalActivityLocators.ELMNT_DOWNLOAD_LINK_EQUI_RECOMMENDATIONS);
			}
		}
		return flag;
	}

	public boolean downloadImageForEquiRecommandations() throws IOException, InterruptedException {
		flag = webDB.waitElementByXPath(ErgoEvalActivityLocators.ELMNT_DOWNLOAD_LINK_EQUI_RECOMMENDATIONS);
		if (flag) {
			webDB.clickBtnByXPath(ErgoEvalActivityLocators.ELMNT_DOWNLOAD_LINK_EQUI_RECOMMENDATIONS);
			Thread.sleep(2500);
			flag = webDB.waitElementByXPath(ErgoEvalActivityLocators.ELMNT_DOWNLOAD_IMAGE);
			if (flag) {
				webDB.clickBtnByXPath(ErgoEvalActivityLocators.ELMNT_DOWNLOAD_IMAGE);
				Thread.sleep(2500);
				webDB.clickBtnByXPath(ErgoEvalActivityLocators.ELMNT_DOWNLOAD_BTN);
				Thread.sleep(2500);
				flag = webDB.waitElementByXPath(ErgoEvalActivityLocators.ELMNT_DOWNLOAD_LINK_EQUI_RECOMMENDATIONS);
			}
		}
		return flag;
	}

	public boolean downloadDocumentForTotalActivityRegion() throws IOException, InterruptedException {
		Thread.sleep(1500);
		flag = webDB.waitElementByXPath(ProgramOverviewLocators.ELMNT_DOWNLOAD_LINK_TOTAL_ACTV_REGION);
		if (flag) {
			webDB.clickBtnByXPath(ProgramOverviewLocators.ELMNT_DOWNLOAD_LINK_TOTAL_ACTV_REGION);
			Thread.sleep(2500);
			flag = webDB.waitElementByXPath(ProgramOverviewLocators.ELMNT_DOWNLOAD_DOCUMENT);
			if (flag) {
				webDB.clickBtnByXPath(ProgramOverviewLocators.ELMNT_DOWNLOAD_DOCUMENT);
				Thread.sleep(2500);
				webDB.clickBtnByXPath(ProgramOverviewLocators.ELMNT_DOWNLOAD_BTN);
				Thread.sleep(2500);
				flag = webDB.waitElementByXPath(ProgramOverviewLocators.ELMNT_DOWNLOAD_LINK_TOTAL_ACTV_REGION);
			}
		}
		return flag;
	}

	public boolean downloadImageForReasonForAssessment() throws IOException, InterruptedException {
		Thread.sleep(1500);
		flag = webDB.waitElementByXPath(ProgramOverviewLocators.ELMNT_DOWNLOAD_LINK_REASON_ASSESSMENT);
		if (flag) {
			webDB.clickBtnByXPath(ProgramOverviewLocators.ELMNT_DOWNLOAD_LINK_REASON_ASSESSMENT);
			Thread.sleep(2500);
			flag = webDB.waitElementByXPath(ProgramOverviewLocators.ELMNT_DOWNLOAD_IMAGE);
			if (flag) {
				webDB.clickBtnByXPath(ProgramOverviewLocators.ELMNT_DOWNLOAD_IMAGE);
				Thread.sleep(2500);
				webDB.clickBtnByXPath(ProgramOverviewLocators.ELMNT_DOWNLOAD_BTN);
				Thread.sleep(2500);
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
			Thread.sleep(2500);
			flag = webDB.waitElementByXPath(ProgramOverviewLocators.ELMNT_DOWNLOAD_DOCUMENT);
			if (flag) {
				webDB.clickBtnByXPath(ProgramOverviewLocators.ELMNT_DOWNLOAD_DOCUMENT);
				Thread.sleep(2500);
				webDB.clickBtnByXPath(ProgramOverviewLocators.ELMNT_DOWNLOAD_BTN);
				Thread.sleep(2500);
				flag = webDB.waitElementByXPath(ProgramOverviewLocators.ELMNT_DOWNLOAD_LINK_REASON_ASSESSMENT);
			}
		}
		return flag;
	}

	public boolean downloadImageForWorkAreaAssessed() throws IOException, InterruptedException {
		Thread.sleep(2500);
		flag = webDB.waitElementByXPath(ErgoEvalActivityLocators.ELMNT_DOWNLOAD_LINK_WORK_AREA_ASSESSED);
		if (flag) {
			webDB.clickBtnByXPath(ErgoEvalActivityLocators.ELMNT_DOWNLOAD_LINK_WORK_AREA_ASSESSED);
			Thread.sleep(2500);
			flag = webDB.waitElementByXPath(ErgoEvalActivityLocators.ELMNT_DOWNLOAD_IMAGE);
			if (flag) {
				webDB.clickBtnByXPath(ErgoEvalActivityLocators.ELMNT_DOWNLOAD_IMAGE);
				Thread.sleep(2500);
				webDB.clickBtnByXPath(ErgoEvalActivityLocators.ELMNT_DOWNLOAD_BTN);
				Thread.sleep(2500);
				flag = webDB.waitElementByXPath(ErgoEvalActivityLocators.ELMNT_DOWNLOAD_LINK_WORK_AREA_ASSESSED);
			}
		}
		return flag;
	}

	public boolean downloadDocumentForWorkAreaAssessed() throws IOException, InterruptedException {
		Thread.sleep(2500);
		flag = webDB.waitElementByXPath(ErgoEvalActivityLocators.ELMNT_DOWNLOAD_LINK_WORK_AREA_ASSESSED);
		if (flag) {
			webDB.clickBtnByXPath(ErgoEvalActivityLocators.ELMNT_DOWNLOAD_LINK_WORK_AREA_ASSESSED);
			Thread.sleep(2500);
			flag = webDB.waitElementByXPath(ErgoEvalActivityLocators.ELMNT_DOWNLOAD_DOCUMENT);
			if (flag) {
				webDB.clickBtnByXPath(ErgoEvalActivityLocators.ELMNT_DOWNLOAD_DOCUMENT);
				Thread.sleep(2500);
				webDB.clickBtnByXPath(ErgoEvalActivityLocators.ELMNT_DOWNLOAD_BTN);
				Thread.sleep(2500);
				flag = webDB.waitElementByXPath(ErgoEvalActivityLocators.ELMNT_DOWNLOAD_LINK_WORK_AREA_ASSESSED);
			}
		}
		return flag;
	}

	public boolean downloadImagePercentageFromErgoEvalActivityByRegion() throws IOException, InterruptedException {
		Thread.sleep(2500);
		flag = webDB.waitElementByXPath(ErgoEvalActivityLocators.ELMNT_DOWNLOAD_LINK_EVAL_ACTIVITY_REGION);
		if (flag) {
			webDB.clickBtnByXPath(ErgoEvalActivityLocators.ELMNT_DOWNLOAD_LINK_EVAL_ACTIVITY_REGION);
			Thread.sleep(2500);
			flag = webDB.waitElementByXPath(ErgoEvalActivityLocators.ELMNT_DOWNLOAD_IMAGE);
			if (flag) {
				webDB.clickBtnByXPath(ErgoEvalActivityLocators.ELMNT_DOWNLOAD_IMAGE);
				Thread.sleep(2500);
				webDB.clickBtnByXPath(ErgoEvalActivityLocators.ELMNT_DOWNLOAD_BTN);
				Thread.sleep(2500);
				flag = webDB.waitElementByXPath(ErgoEvalActivityLocators.ELMNT_DOWNLOAD_LINK_EVAL_ACTIVITY_REGION);
			}
		}
		return flag;
	}

	public boolean downloadDocumentPercentageFromErgoEvalActivityByRegion() throws IOException, InterruptedException {
		Thread.sleep(2500);
		flag = webDB.waitElementByXPath(ErgoEvalActivityLocators.ELMNT_DOWNLOAD_LINK_EVAL_ACTIVITY_REGION);
		if (flag) {
			webDB.clickBtnByXPath(ErgoEvalActivityLocators.ELMNT_DOWNLOAD_LINK_EVAL_ACTIVITY_REGION);
			Thread.sleep(2500);
			flag = webDB.waitElementByXPath(ErgoEvalActivityLocators.ELMNT_DOWNLOAD_DOCUMENT);
			if (flag) {
				webDB.clickBtnByXPath(ErgoEvalActivityLocators.ELMNT_DOWNLOAD_DOCUMENT);
				Thread.sleep(2500);
				webDB.clickBtnByXPath(ErgoEvalActivityLocators.ELMNT_DOWNLOAD_BTN);
				Thread.sleep(2500);
				flag = webDB.waitElementByXPath(ErgoEvalActivityLocators.ELMNT_DOWNLOAD_LINK_EVAL_ACTIVITY_REGION);
			}
		}
		return flag;
	}

	public boolean downloadImageHashFromErgoEvalActivityByRegion() throws IOException, InterruptedException {
		Thread.sleep(2500);
		flag = webDB.waitElementByXPath(ErgoEvalActivityLocators.ELMNT_EVAL_ACTIVITY_REGION_HASH_OPTION);
		if (flag) {
			Thread.sleep(2500);
			webDB.clickBtnByXPath(ErgoEvalActivityLocators.ELMNT_EVAL_ACTIVITY_REGION_HASH_OPTION);
			Thread.sleep(2500);
			flag = webDB.waitElementByXPath(ErgoEvalActivityLocators.ELMNT_DOWNLOAD_LINK_EVAL_ACTIVITY_REGION);
			if (flag) {
				webDB.clickBtnByXPath(ErgoEvalActivityLocators.ELMNT_DOWNLOAD_LINK_EVAL_ACTIVITY_REGION);
				Thread.sleep(2500);
				flag = webDB.waitElementByXPath(ErgoEvalActivityLocators.ELMNT_DOWNLOAD_IMAGE);
				if (flag) {
					webDB.clickBtnByXPath(ErgoEvalActivityLocators.ELMNT_DOWNLOAD_IMAGE);
					Thread.sleep(2500);
					webDB.clickBtnByXPath(ErgoEvalActivityLocators.ELMNT_DOWNLOAD_BTN);
					Thread.sleep(2500);
					flag = webDB.waitElementByXPath(ErgoEvalActivityLocators.ELMNT_DOWNLOAD_LINK_EVAL_ACTIVITY_REGION);
				}
			}
		}
		return flag;
	}

	public boolean downloadDocumentHashFromErgoEvalActivityByRegion() throws IOException, InterruptedException {
		Thread.sleep(2500);
		flag = webDB.waitElementByXPath(ErgoEvalActivityLocators.ELMNT_EVAL_ACTIVITY_REGION_HASH_OPTION);
		if (flag) {
			Thread.sleep(2500);
			webDB.clickBtnByXPath(ErgoEvalActivityLocators.ELMNT_EVAL_ACTIVITY_REGION_HASH_OPTION);
			Thread.sleep(2500);
			flag = webDB.waitElementByXPath(ErgoEvalActivityLocators.ELMNT_DOWNLOAD_LINK_EVAL_ACTIVITY_REGION);
			if (flag) {
				webDB.clickBtnByXPath(ErgoEvalActivityLocators.ELMNT_DOWNLOAD_LINK_EVAL_ACTIVITY_REGION);
				Thread.sleep(2500);
				flag = webDB.waitElementByXPath(ErgoEvalActivityLocators.ELMNT_DOWNLOAD_DOCUMENT);
				if (flag) {
					webDB.clickBtnByXPath(ErgoEvalActivityLocators.ELMNT_DOWNLOAD_DOCUMENT);
					Thread.sleep(2500);
					webDB.clickBtnByXPath(ErgoEvalActivityLocators.ELMNT_DOWNLOAD_BTN);
					Thread.sleep(2500);
					flag = webDB.waitElementByXPath(ErgoEvalActivityLocators.ELMNT_DOWNLOAD_LINK_EVAL_ACTIVITY_REGION);
				}
			}
		}
		return flag;
	}

	public boolean downloadImageForSelfReportedComfortLevels() throws IOException, InterruptedException {
		Thread.sleep(2500);
		flag = webDB.waitElementByXPath(SelfAssessmentLocators.ELMNT_DOWNLOAD_LINK_SELF_REPORTED_COMFORT_LEVELS);
		if (flag) {
			webDB.clickBtnByXPath(SelfAssessmentLocators.ELMNT_DOWNLOAD_LINK_SELF_REPORTED_COMFORT_LEVELS);
			Thread.sleep(2500);
			flag = webDB.waitElementByXPath(SelfAssessmentLocators.ELMNT_DOWNLOAD_IMAGE);
			if (flag) {
				webDB.clickBtnByXPath(SelfAssessmentLocators.ELMNT_DOWNLOAD_IMAGE);
				Thread.sleep(2500);
				webDB.clickBtnByXPath(SelfAssessmentLocators.ELMNT_DOWNLOAD_BTN);
				Thread.sleep(2500);
				flag = webDB
						.waitElementByXPath(SelfAssessmentLocators.ELMNT_DOWNLOAD_LINK_SELF_REPORTED_COMFORT_LEVELS);
			}
		}
		return flag;
	}

	public boolean downloadDocumentForSelfReportedComfortLevels() throws IOException, InterruptedException {
		Thread.sleep(2500);
		flag = webDB.waitElementByXPath(SelfAssessmentLocators.ELMNT_DOWNLOAD_LINK_SELF_REPORTED_COMFORT_LEVELS);
		if (flag) {
			webDB.clickBtnByXPath(SelfAssessmentLocators.ELMNT_DOWNLOAD_LINK_SELF_REPORTED_COMFORT_LEVELS);
			Thread.sleep(2500);
			flag = webDB.waitElementByXPath(SelfAssessmentLocators.ELMNT_DOWNLOAD_DOCUMENT);
			if (flag) {
				webDB.clickBtnByXPath(SelfAssessmentLocators.ELMNT_DOWNLOAD_DOCUMENT);
				Thread.sleep(2500);
				webDB.clickBtnByXPath(SelfAssessmentLocators.ELMNT_DOWNLOAD_BTN);
				Thread.sleep(2500);
				flag = webDB
						.waitElementByXPath(SelfAssessmentLocators.ELMNT_DOWNLOAD_LINK_SELF_REPORTED_COMFORT_LEVELS);
			}
		}
		return flag;
	}

	public boolean selectHashOptionForEVAL() throws IOException, InterruptedException {
		Thread.sleep(2500);
		flag = webDB.waitElementByXPath(ProgramOverviewLocators.ELMNT_EVAL_HASH_OPTION);
		if (flag) {
			webDB.clickBtnByXPath(ProgramOverviewLocators.ELMNT_EVAL_HASH_OPTION);
			Thread.sleep(2500);
			flag = webDB.waitElementByXPath(ProgramOverviewLocators.ELMNT_EVAL_USD);
			if (flag) {
				temp = webDB.getTextByXPath(ProgramOverviewLocators.ELMNT_EVAL_USD).replaceAll(" USA", "")
						.replaceAll("$", "");
				int i = Integer.parseInt(temp);
				int temp1 = Integer.parseInt(webDB.getTextByXPath(ProgramOverviewLocators.ELMNT_EVAL_USD_NUMBER));
				if (i / temp1 == 300) {
					flag = true;
				} else {
					flag = false;
				}
			}
		}
		return flag;
	}

	public boolean selectHashOptionForSA() throws IOException, InterruptedException {
		Thread.sleep(2500);
		flag = webDB.waitElementByXPath(ProgramOverviewLocators.ELMNT_SA_HASH_OPTION);
		if (flag) {
			webDB.clickBtnByXPath(ProgramOverviewLocators.ELMNT_SA_HASH_OPTION);
			Thread.sleep(1000);
			flag = webDB.waitElementByXPath(ProgramOverviewLocators.ELMNT_EVAL_USD);
			if (flag) {
				temp = webDB.getTextByXPath(ProgramOverviewLocators.ELMNT_EVAL_USD).replaceAll(" USA", "")
						.replaceAll("$", "");
				int i = Integer.parseInt(temp);
				int temp1 = Integer.parseInt(webDB.getTextByXPath(ProgramOverviewLocators.ELMNT_EVAL_USD_NUMBER));
				if (i / temp1 == 300) {
					flag = true;
				} else {
					flag = false;
				}
			}
		}
		return flag;
	}

	public boolean verifyPaginationFunctionality() throws InterruptedException, IOException {
		Thread.sleep(3000);
		webDB.scrollToAnElement(ProgramOverviewLocators.Pagination);
		Thread.sleep(3000);
		flag = webDB.verifyPagination("(//p[@class='float-lg-start text-sm-center'])[1]",
				"(//li[@class='page-item next']/button)[1]",
				"//table[@class='table table-bordered table dataTable no-footer']//tbody//tr");
		return flag;

	}

	public boolean verifyAscendingOrderSortingFunctionalityOfUserRoleColumn() throws InterruptedException {
		webDB.selectOptionByText("(//select[@name ='datatable_length'])[1]", "500");
		Thread.sleep(5000);
		Thread.sleep(3000);
		webDB.scrollToAnElement(ErgoEvalActivityLocators.REQUESTON_COLUMNNAME_ONWHICHSORTINGAPPLIED);
		Thread.sleep(1500);
		flag = webDB.verifyAscendingOrderSortingFunctionalityOfDateColumn(
				ErgoEvalActivityLocators.REQUESTON_COLUMNDATA_ONWHICHSORTINGAPPLIED,
				ErgoEvalActivityLocators.REQUESTON_COLUMNNAME_ONWHICHSORTINGAPPLIED,
				ErgoEvalActivityLocators.REQUESTON_COLUMN_TOTALARROWCOUNT_ONWHICHSORTINGAPPLIED,
				ErgoEvalActivityLocators.REQUESTON_COLUMN_UPARROW_ONWHICHSORTINGAPPLIED);

		return flag;
	}

	public boolean verifyDecendingOrderSortingFunctionalityOfUserRoleColumn() throws InterruptedException {
		Thread.sleep(3000);
		flag = webDB.verifyDecendingOrderSortingFunctionalityOfDateColumn(
				ErgoEvalActivityLocators.REQUESTON_COLUMNDATA_ONWHICHSORTINGAPPLIED,
				ErgoEvalActivityLocators.REQUESTON_COLUMNNAME_ONWHICHSORTINGAPPLIED);

		return flag;
	}

	public boolean verifyAscendingOrderSortingFunctionalityOfFirstName() throws InterruptedException {
//		webDB.NavigateTo("https://staging.pbergo.com/user/ergo-eval-activity");
		Thread.sleep(3000);
		flag = webDB.verifyAscendingOrderSortingFunctionality(
				ErgoEvalActivityLocators.FIRSTNAME_COLUMNDATA_ONWHICHSORTINGAPPLIED,
				ErgoEvalActivityLocators.FIRSTNAME_COLUMNNAME_ONWHICHSORTINGAPPLIED,
				ErgoEvalActivityLocators.FIRSTNAME_COLUMN_TOTALARROWCOUNT_ONWHICHSORTINGAPPLIED,
				ErgoEvalActivityLocators.FIRSTNAME_COLUMN_UPARROW_ONWHICHSORTINGAPPLIED);
		return flag;
	}

	public boolean verifyDecendingOrderSortingFunctionalityOfFirstName() throws InterruptedException {
		Thread.sleep(3000);
		flag = webDB.verifyDecendingOrderSortingFunctionality(
				ErgoEvalActivityLocators.FIRSTNAME_COLUMNDATA_ONWHICHSORTINGAPPLIED,
				ErgoEvalActivityLocators.FIRSTNAME_COLUMNNAME_ONWHICHSORTINGAPPLIED);
		return flag;
	}
	
	public boolean verifyAscendingOrderSortingFunctionalityOfLastName() throws InterruptedException {
		Thread.sleep(3000);
		flag = webDB.verifyAscendingOrderSortingFunctionality(
				ErgoEvalActivityLocators.LASTNAME_COLUMNDATA_ONWHICHSORTINGAPPLIED,
				ErgoEvalActivityLocators.LASTNAME_COLUMNNAME_ONWHICHSORTINGAPPLIED,
				ErgoEvalActivityLocators.LASTNAME_COLUMN_TOTALARROWCOUNT_ONWHICHSORTINGAPPLIED,
				ErgoEvalActivityLocators.LASTNAME_COLUMN_UPARROW_ONWHICHSORTINGAPPLIED);
		return flag;
	}

	public boolean verifyDecendingOrderSortingFunctionalityOfLastName() throws InterruptedException {
		Thread.sleep(3000);
		flag = webDB.verifyDecendingOrderSortingFunctionality(
				ErgoEvalActivityLocators.LASTNAME_COLUMNDATA_ONWHICHSORTINGAPPLIED,
				ErgoEvalActivityLocators.LASTNAME_COLUMNNAME_ONWHICHSORTINGAPPLIED);
		return flag;
	}
	public boolean verifyAscendingOrderSortingFunctionalityOfEmailAddress() throws InterruptedException {
		Thread.sleep(3000);
		flag = webDB.verifyAscendingOrderSortingFunctionality(
				ErgoEvalActivityLocators.EMAILADDRESS_COLUMNDATA_ONWHICHSORTINGAPPLIED,
				ErgoEvalActivityLocators.EMAILADDRESS_COLUMNNAME_ONWHICHSORTINGAPPLIED,
				ErgoEvalActivityLocators.EMAILADDRESS_COLUMN_TOTALARROWCOUNT_ONWHICHSORTINGAPPLIED,
				ErgoEvalActivityLocators.EMAILADDRESS_COLUMN_UPARROW_ONWHICHSORTINGAPPLIED);
		return flag;
	}

	public boolean verifyDecendingOrderSortingFunctionalityOfEmailAddress() throws InterruptedException {
		Thread.sleep(3000);
		flag = webDB.verifyDecendingOrderSortingFunctionality(
				ErgoEvalActivityLocators.EMAILADDRESS_COLUMNDATA_ONWHICHSORTINGAPPLIED,
				ErgoEvalActivityLocators.EMAILADDRESS_COLUMNNAME_ONWHICHSORTINGAPPLIED);
		return flag;
	}
	
	public boolean verifyAscendingOrderSortingFunctionalityOfLocation() throws InterruptedException {
		Thread.sleep(3000);
		flag = webDB.verifyAscendingOrderSortingFunctionality(
				ErgoEvalActivityLocators.LOCATION_COLUMNDATA_ONWHICHSORTINGAPPLIED,
				ErgoEvalActivityLocators.LOCATION_COLUMNNAME_ONWHICHSORTINGAPPLIED,
				ErgoEvalActivityLocators.LOCATION_COLUMN_TOTALARROWCOUNT_ONWHICHSORTINGAPPLIED,
				ErgoEvalActivityLocators.LOCATION_COLUMN_UPARROW_ONWHICHSORTINGAPPLIED);
		return flag;
	}

	public boolean verifyDecendingOrderSortingFunctionalityOfLocation() throws InterruptedException {
		Thread.sleep(3000);
		flag = webDB.verifyDecendingOrderSortingFunctionality(
				ErgoEvalActivityLocators.LOCATION_COLUMNDATA_ONWHICHSORTINGAPPLIED,
				ErgoEvalActivityLocators.LOCATION_COLUMNNAME_ONWHICHSORTINGAPPLIED);
		return flag;
	}
	
	public boolean verifyAscendingOrderSortingFunctionalityOfComfort() throws InterruptedException {
		Thread.sleep(3000);
		flag = webDB.verifyAscendingOrderSortingFunctionality(
				ErgoEvalActivityLocators.COMFORT_COLUMNDATA_ONWHICHSORTINGAPPLIED,
				ErgoEvalActivityLocators.COMFORT_COLUMNNAME_ONWHICHSORTINGAPPLIED,
				ErgoEvalActivityLocators.COMFORT_COLUMN_TOTALARROWCOUNT_ONWHICHSORTINGAPPLIED,
				ErgoEvalActivityLocators.COMFORT_COLUMN_UPARROW_ONWHICHSORTINGAPPLIED);
		return flag;
	}

	public boolean verifyDecendingOrderSortingFunctionalityOfComfort() throws InterruptedException {
		Thread.sleep(3000);
		flag = webDB.verifyDecendingOrderSortingFunctionality(
				ErgoEvalActivityLocators.COMFORT_COLUMNDATA_ONWHICHSORTINGAPPLIED,
				ErgoEvalActivityLocators.COMFORT_COLUMNNAME_ONWHICHSORTINGAPPLIED);
		return flag;
	}
	
	public boolean verifyAscendingOrderSortingFunctionalityOfStatus() throws InterruptedException {
		Thread.sleep(3000);
		flag = webDB.verifyAscendingOrderSortingFunctionality(
				ErgoEvalActivityLocators.STATUS_COLUMNDATA_ONWHICHSORTINGAPPLIED,
				ErgoEvalActivityLocators.STATUS_COLUMNNAME_ONWHICHSORTINGAPPLIED,
				ErgoEvalActivityLocators.STATUS_COLUMN_TOTALARROWCOUNT_ONWHICHSORTINGAPPLIED,
				ErgoEvalActivityLocators.STATUS_COLUMN_UPARROW_ONWHICHSORTINGAPPLIED);
		return flag;
	}

	public boolean verifyDecendingOrderSortingFunctionalityOfStatus() throws InterruptedException {
		Thread.sleep(3000);
		flag = webDB.verifyDecendingOrderSortingFunctionality(
				ErgoEvalActivityLocators.STATUS_COLUMNDATA_ONWHICHSORTINGAPPLIED,
				ErgoEvalActivityLocators.STATUS_COLUMNNAME_ONWHICHSORTINGAPPLIED);
		return flag;
	}
	
	public boolean verifyDateFilterFunctionality() throws InterruptedException
	{
		Thread.sleep(3000);
		flag = webDB.verifyDateFilterFunctionality("(//div[@class='row']//table)[1]/tbody/tr/td[1]/p", "(//table)[1]//td[text()=' No Records found ']");
		webDB.getPageRefresh();
		Thread.sleep(3000);
		return flag;
	}
}
