package com.pbergo.commonfunctions;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.pbergo.base.WebDriverBase;
import com.pbergo.locators.AggregateResponseLocators;
import com.pbergo.locators.ErgoEvalActivityLocators;
import com.pbergo.locators.FollowUpFeedbackLocators;
import com.pbergo.locators.ProgramOverviewLocators;
import com.pbergo.locators.SelfAssessmentLocators;
//import com.pbergo.locators.HeaderSectionLocators;
//import com.pbergo.locators.LeftSidePanelLocators;
import com.pbergo.locators.UsersLocators;

public class FollowUpFeedbackFunctions {
	private WebDriverBase webDB;
	private boolean flag;
	private String temp;
	WebDriver driver;

	public FollowUpFeedbackFunctions(WebDriverBase webDB) {
		this.webDB = webDB;
	}

	/**
	 * @param userPermittedSection [Passing options from the Menu link]
	 * @return
	 * @throws IOException
	 * @throws InterruptedException
	 */
	public boolean openFollowUpFeedbackLink() throws IOException, InterruptedException {
		Thread.sleep(2500);
		flag = webDB.waitElementByXPath(FollowUpFeedbackLocators.ELMNT_FOLLOW_UP_FEEDBACK_LEFTSIDEPANEL);
		if (flag) {
			webDB.actionMoveToElementByXPath(FollowUpFeedbackLocators.ELMNT_FOLLOW_UP_FEEDBACK_LEFTSIDEPANEL);
			webDB.clickBtnByXPath(FollowUpFeedbackLocators.ELMNT_FOLLOW_UP_FEEDBACK_LEFTSIDEPANEL);
			Thread.sleep(2500);
			System.out.println("The follow up feedback is open");
//			flag = webDB.waitElementByXPath(FollowUpFeedbackLocators.ELMNT_FOLLOW_UP_FEEDBACK_HEADER);
		}
		return flag;
	}

	public boolean downloadDocumentForSelfAssessmentHelpful() throws IOException, InterruptedException {
		Thread.sleep(2500);
		flag = webDB.waitElementByXPath(FollowUpFeedbackLocators.ELMNT_DOWNLOAD_LINK_SELF_ASSESSMENT_HELPFUL);
		if (flag) {
			webDB.clickBtnByXPath(FollowUpFeedbackLocators.ELMNT_DOWNLOAD_LINK_SELF_ASSESSMENT_HELPFUL);
			Thread.sleep(2500);
			flag = webDB.waitElementByXPath(FollowUpFeedbackLocators.ELMNT_DOWNLOAD_DOCUMENT);
			if (flag) {
				webDB.actionMoveToElementByXPath(FollowUpFeedbackLocators.ELMNT_DOWNLOAD_DOCUMENT);
				Thread.sleep(2500);
				webDB.clickBtnByXPath(FollowUpFeedbackLocators.ELMNT_DOWNLOAD_DOCUMENT);
				Thread.sleep(2500);
				webDB.clickBtnByXPath(FollowUpFeedbackLocators.ELMNT_DOWNLOAD_BTN);
				Thread.sleep(5000);
				System.out.println("The self assessment helpful docc is accessed");
//				flag = webDB.waitElementByXPath(FollowUpFeedbackLocators.ELMNT_FOLLOW_UP_FEEDBACK_HEADER);
				
			}
		}
		return flag;
	}

	public boolean downloadImageForSelfAssessmentHelpful() throws IOException, InterruptedException {
		Thread.sleep(5000);
		flag = webDB.waitElementByXPath(FollowUpFeedbackLocators.ELMNT_DOWNLOAD_LINK_SELF_ASSESSMENT_HELPFUL);
		if (flag) {
			webDB.clickBtnByXPath(FollowUpFeedbackLocators.ELMNT_DOWNLOAD_LINK_SELF_ASSESSMENT_HELPFUL);
			Thread.sleep(2500);
			flag = webDB.waitElementByXPath(FollowUpFeedbackLocators.ELMNT_DOWNLOAD_IMAGE);
			if (flag) {
				webDB.clickBtnByXPath(FollowUpFeedbackLocators.ELMNT_DOWNLOAD_IMAGE);
				Thread.sleep(2500);
				webDB.clickBtnByXPath(FollowUpFeedbackLocators.ELMNT_DOWNLOAD_BTN);
				Thread.sleep(2500);
				System.out.println("The self assessment helpful img is accessed");
//				flag = webDB.waitElementByXPath(FollowUpFeedbackLocators.ELMNT_FOLLOW_UP_FEEDBACK_HEADER);
			}
		}
		return flag;
	}

	public boolean downloadDocumentForEvalHelpful() throws IOException, InterruptedException {
		Thread.sleep(2500);
		flag = webDB.waitElementByXPath(FollowUpFeedbackLocators.ELMNT_DOWNLOAD_LINK_EVAL_HELPFUL);
		if (flag) {
			webDB.clickBtnByXPath(FollowUpFeedbackLocators.ELMNT_DOWNLOAD_LINK_EVAL_HELPFUL);
			Thread.sleep(2500);
			flag = webDB.waitElementByXPath(FollowUpFeedbackLocators.ELMNT_DOWNLOAD_DOCUMENT);
			if (flag) {
				webDB.actionMoveToElementByXPath(FollowUpFeedbackLocators.ELMNT_DOWNLOAD_DOCUMENT);
				Thread.sleep(2500);
				webDB.clickBtnByXPath(FollowUpFeedbackLocators.ELMNT_DOWNLOAD_DOCUMENT);
				Thread.sleep(2500);
				webDB.clickBtnByXPath(FollowUpFeedbackLocators.ELMNT_DOWNLOAD_BTN);
				Thread.sleep(2500);
				System.out.println("The Eval helpful docc is accessed");
				flag = webDB.waitElementByXPath(FollowUpFeedbackLocators.ELMNT_DOWNLOAD_LINK_EVAL_HELPFUL);
			}
		}
		return flag;
	}

	public boolean downloadImageForEvalHelpful() throws IOException, InterruptedException {
		flag = webDB.waitElementByXPath(FollowUpFeedbackLocators.ELMNT_DOWNLOAD_LINK_EVAL_HELPFUL);
		if (flag) {
			webDB.clickBtnByXPath(FollowUpFeedbackLocators.ELMNT_DOWNLOAD_LINK_EVAL_HELPFUL);
			Thread.sleep(2500);
			flag = webDB.waitElementByXPath(FollowUpFeedbackLocators.ELMNT_DOWNLOAD_IMAGE);
			if (flag) {
				webDB.clickBtnByXPath(FollowUpFeedbackLocators.ELMNT_DOWNLOAD_IMAGE);
				Thread.sleep(2500);
				webDB.clickBtnByXPath(FollowUpFeedbackLocators.ELMNT_DOWNLOAD_BTN);
				Thread.sleep(2500);
				System.out.println("The Eval helpful img is accessed");
//				flag = webDB.waitElementByXPath(FollowUpFeedbackLocators.ELMNT_FOLLOW_UP_FEEDBACK_HEADER);
			}
		}
		return flag;
	}

	public boolean downloadImagePercentageFromReportedImprovement() throws IOException, InterruptedException {
		Thread.sleep(2500);
		flag = webDB.waitElementByXPath(FollowUpFeedbackLocators.ELMNT_DOWNLOAD_LINK_REPORTED_IMPROVEMENT);
		if (flag) {
			webDB.clickBtnByXPath(FollowUpFeedbackLocators.ELMNT_DOWNLOAD_LINK_REPORTED_IMPROVEMENT);
			Thread.sleep(2500);
			flag = webDB.waitElementByXPath(FollowUpFeedbackLocators.ELMNT_DOWNLOAD_IMAGE);
			if (flag) {
				Thread.sleep(2500);
				webDB.clickBtnByXPath(FollowUpFeedbackLocators.ELMNT_DOWNLOAD_IMAGE);
				Thread.sleep(2500);
				webDB.clickBtnByXPath(FollowUpFeedbackLocators.ELMNT_DOWNLOAD_BTN);
				Thread.sleep(2500);
				System.out.println("The From Reported Improvement image percentage is accessed");
//				flag = webDB.waitElementByXPath(FollowUpFeedbackLocators.ELMNT_DOWNLOAD_LINK_REPORTED_IMPROVEMENT);
			}
		}
		return flag;
	}

	public boolean downloadDocumentPercentageFromReportedImprovement()
			throws IOException, InterruptedException {
		Thread.sleep(2500);
		flag = webDB.waitElementByXPath(FollowUpFeedbackLocators.ELMNT_DOWNLOAD_LINK_REPORTED_IMPROVEMENT);
		if (flag) {
			webDB.clickBtnByXPath(FollowUpFeedbackLocators.ELMNT_DOWNLOAD_LINK_REPORTED_IMPROVEMENT);
			Thread.sleep(2500);
			flag = webDB.waitElementByXPath(FollowUpFeedbackLocators.ELMNT_DOWNLOAD_DOCUMENT);
			if (flag) {
//				webDB.actionMoveToElementByXPath(FollowUpFeedbackLocators.ELMNT_DOWNLOAD_DOCUMENT);
//				Thread.sleep(2500);
				webDB.clickBtnByXPath(FollowUpFeedbackLocators.ELMNT_DOWNLOAD_DOCUMENT);
				Thread.sleep(2500);
				webDB.clickBtnByXPath(FollowUpFeedbackLocators.ELMNT_DOWNLOAD_BTN);
				Thread.sleep(2500);
				System.out.println("The From Reported Improvement docc percentage is accessed");
				flag = true;
//				flag = webDB.waitElementByXPath(FollowUpFeedbackLocators.ELMNT_DOWNLOAD_LINK_REPORTED_IMPROVEMENT);
			}
		}
		return flag;
	}

	public boolean downloadImageHashFromReportedImprovement() throws IOException, InterruptedException {
		Thread.sleep(3000);
		flag = webDB.waitElementByID(FollowUpFeedbackLocators.ELMNT_REPORTED_IMPROVEMENT_HASH_OPTION);
		if (flag) {
			webDB.clickBtnByID(FollowUpFeedbackLocators.ELMNT_REPORTED_IMPROVEMENT_HASH_OPTION);
			Thread.sleep(2500);
			flag = webDB.waitElementByID(FollowUpFeedbackLocators.ELMNT_DOWNLOAD_LINK_REPORTED_IMPROVEMENT);
			if (flag) {
				webDB.clickBtnByID(FollowUpFeedbackLocators.ELMNT_DOWNLOAD_LINK_REPORTED_IMPROVEMENT);
				Thread.sleep(2500);
				flag = webDB.waitElementByXPath(FollowUpFeedbackLocators.ELMNT_DOWNLOAD_IMAGE);
				if (flag) {
					Thread.sleep(2500);
					webDB.clickBtnByXPath(FollowUpFeedbackLocators.ELMNT_DOWNLOAD_IMAGE);
					Thread.sleep(2500);
					webDB.clickBtnByXPath(FollowUpFeedbackLocators.ELMNT_DOWNLOAD_BTN);
					Thread.sleep(2500);
					System.out.println("The hash From Reported Improvement image percentage is accessed");
//					flag = webDB.waitElementByID(FollowUpFeedbackLocators.ELMNT_REPORTED_IMPROVEMENT_HASH_OPTION);
				}
			}
		}
		return flag;
	}

	public boolean downloadDocumentHashFromReportedImprovement() throws IOException, InterruptedException {
		Thread.sleep(2500);
		flag = webDB.waitElementByID(FollowUpFeedbackLocators.ELMNT_REPORTED_IMPROVEMENT_HASH_OPTION);
		if (flag) {
			webDB.clickBtnByID(FollowUpFeedbackLocators.ELMNT_REPORTED_IMPROVEMENT_HASH_OPTION);
			Thread.sleep(2500);
			flag = webDB.waitElementByXPath(FollowUpFeedbackLocators.ELMNT_DOWNLOAD_LINK_REPORTED_IMPROVEMENT);
			if (flag) {
				webDB.clickBtnByXPath(FollowUpFeedbackLocators.ELMNT_DOWNLOAD_LINK_REPORTED_IMPROVEMENT);
				Thread.sleep(2500);
				flag = webDB.waitElementByXPath(FollowUpFeedbackLocators.ELMNT_DOWNLOAD_DOCUMENT);
				if (flag) {
					webDB.actionMoveToElementByXPath(FollowUpFeedbackLocators.ELMNT_DOWNLOAD_DOCUMENT);
					Thread.sleep(2500);
					webDB.clickBtnByXPath(FollowUpFeedbackLocators.ELMNT_DOWNLOAD_DOCUMENT);
					Thread.sleep(2500);
					webDB.clickBtnByXPath(FollowUpFeedbackLocators.ELMNT_DOWNLOAD_BTN);
					Thread.sleep(2500);
					System.out.println("The hash From Reported Improvement docc percentage is accessed");
//					flag = webDB.waitElementByXPath(FollowUpFeedbackLocators.ELMNT_DOWNLOAD_LINK_REPORTED_IMPROVEMENT);
				}
			}
		}
		return flag;
	}

	public boolean downloadImageForAggregateResponse() throws IOException, InterruptedException {
		
		Thread.sleep(2500);
		webDB.scrolldown(300);
		Thread.sleep(2500);
		flag = webDB.waitElementByXPath(AggregateResponseLocators.AGGREGATE_RESPONSE_DOWNLOAD_BTN);
		if (flag) {
			webDB.clickBtnByXPath(AggregateResponseLocators.AGGREGATE_RESPONSE_DOWNLOAD_BTN);
			flag = webDB.waitElementByXPath(FollowUpFeedbackLocators.ELMNT_DOWNLOAD_IMAGE);
			if (flag) {
				Thread.sleep(2500);
				webDB.clickBtnByXPath(FollowUpFeedbackLocators.ELMNT_DOWNLOAD_IMAGE);
				Thread.sleep(2500);
				webDB.clickBtnByXPath(FollowUpFeedbackLocators.ELMNT_DOWNLOAD_BTN);
				Thread.sleep(2500);
				System.out.println("The aggregate response image is accessed");
//				flag = webDB
//						.waitElementByXPath(SelfAssessmentLocators.ELMNT_DOWNLOAD_LINK_SELF_REPORTED_COMFORT_LEVELS);
			}
		}
		return flag;
	}

	public boolean downloadDoccumentForAggregateResponse() throws IOException, InterruptedException {
		Thread.sleep(2500);
		flag = webDB.waitElementByXPath(AggregateResponseLocators.AGGREGATE_RESPONSE_DOWNLOAD_BTN);
		if (flag) {
			webDB.actionMoveToElementByXPath(AggregateResponseLocators.AGGREGATE_RESPONSE_DOWNLOAD_BTN);
			Thread.sleep(2500);
			webDB.clickBtnByXPath(AggregateResponseLocators.AGGREGATE_RESPONSE_DOWNLOAD_BTN);
			flag = webDB.waitElementByXPath(FollowUpFeedbackLocators.ELMNT_DOWNLOAD_DOCUMENT);
			if (flag) {
//				webDB.actionMoveToElementByXPath(FollowUpFeedbackLocators.ELMNT_DOWNLOAD_DOCUMENT);
//				Thread.sleep(2500);
				webDB.clickBtnByXPath(FollowUpFeedbackLocators.ELMNT_DOWNLOAD_DOCUMENT);
				Thread.sleep(2500);
				webDB.clickBtnByXPath(FollowUpFeedbackLocators.ELMNT_DOWNLOAD_BTN);
				Thread.sleep(2500);
				System.out.println("The aggregate response docc is accessed");
//				flag = webDB
//						.waitElementByXPath(SelfAssessmentLocators.ELMNT_DOWNLOAD_LINK_SELF_REPORTED_COMFORT_LEVELS);
			}
		}
		return flag;
	}

	public boolean downloadImagePercentageFromFurtherAssistenceNeeded() throws IOException, InterruptedException {
		Thread.sleep(2500);
		flag = webDB.waitElementByXPath(AggregateResponseLocators.FURTHER_ASSISTENCE_NEEDED_DOWNLOAD_BTN);
		if (flag) {
			webDB.clickBtnByXPath(AggregateResponseLocators.FURTHER_ASSISTENCE_NEEDED_DOWNLOAD_BTN);
			Thread.sleep(2500);
			flag = webDB.waitElementByXPath(FollowUpFeedbackLocators.ELMNT_DOWNLOAD_IMAGE);
			if (flag) {
				Thread.sleep(2500);
				webDB.clickBtnByXPath(FollowUpFeedbackLocators.ELMNT_DOWNLOAD_IMAGE);
				Thread.sleep(2500);
				webDB.clickBtnByXPath(FollowUpFeedbackLocators.ELMNT_DOWNLOAD_BTN);
				Thread.sleep(2500);
				System.out.println("The image is download from further assistence needed is accessed");
//				flag = webDB.waitElementByXPath(FollowUpFeedbackLocators.ELMNT_DOWNLOAD_LINK_REPORTED_IMPROVEMENT);
			}
		}
		return flag;
	}

	public boolean downloadDoccumentPercentageFromFurtherAssistenceNeeded()
			throws IOException, InterruptedException {
		Thread.sleep(2500);
		flag = webDB.waitElementByXPath(AggregateResponseLocators.FURTHER_ASSISTENCE_NEEDED_DOWNLOAD_BTN);
		if (flag) {
			webDB.clickBtnByXPath(AggregateResponseLocators.FURTHER_ASSISTENCE_NEEDED_DOWNLOAD_BTN);
			Thread.sleep(2500);
			flag = webDB.waitElementByXPath(FollowUpFeedbackLocators.ELMNT_DOWNLOAD_DOCUMENT);
			if (flag) {
				webDB.actionMoveToElementByXPath(FollowUpFeedbackLocators.ELMNT_DOWNLOAD_DOCUMENT);
				Thread.sleep(2500);
				webDB.clickBtnByXPath(FollowUpFeedbackLocators.ELMNT_DOWNLOAD_DOCUMENT);
				Thread.sleep(2500);
				webDB.clickBtnByXPath(FollowUpFeedbackLocators.ELMNT_DOWNLOAD_BTN);
				Thread.sleep(2500);
				System.out.println("The docc is download from further assistence needed is accessed");
//				flag = webDB.waitElementByXPath(FollowUpFeedbackLocators.ELMNT_DOWNLOAD_LINK_REPORTED_IMPROVEMENT);
			}
		}
		return flag;
	}
	
	public boolean downloadImageHashFromFurtherAssistenceNeeded() throws IOException, InterruptedException {
		Thread.sleep(3000);
		flag = webDB.waitElementByXPath(AggregateResponseLocators.FURTHER_ASSISTENCE_NEEDED_Hash_DOWNLOAD_BTN);
		if (flag) {
			webDB.clickBtnByXPath(AggregateResponseLocators.FURTHER_ASSISTENCE_NEEDED_Hash_DOWNLOAD_BTN);
			Thread.sleep(2500);
			flag = webDB.waitElementByXPath(AggregateResponseLocators.FURTHER_ASSISTENCE_NEEDED_DOWNLOAD_BTN);
			if (flag) {
				webDB.clickBtnByXPath(AggregateResponseLocators.FURTHER_ASSISTENCE_NEEDED_DOWNLOAD_BTN);
				Thread.sleep(2500);
				flag = webDB.waitElementByXPath(FollowUpFeedbackLocators.ELMNT_DOWNLOAD_IMAGE);
				if (flag) {
					Thread.sleep(2500);
					webDB.clickBtnByXPath(FollowUpFeedbackLocators.ELMNT_DOWNLOAD_IMAGE);
					Thread.sleep(2500);
					webDB.clickBtnByXPath(FollowUpFeedbackLocators.ELMNT_DOWNLOAD_BTN);
					Thread.sleep(2500);
					System.out.println("The hash From Reported Improvement image percentage is accessed");
//					flag = webDB.waitElementByID(FollowUpFeedbackLocators.ELMNT_REPORTED_IMPROVEMENT_HASH_OPTION);
				}
			}
		}
		return flag;
	}

	public boolean downloadDocumentHashFromFurtherAssistenceNeeded() throws IOException, InterruptedException {
		Thread.sleep(2500);
//		flag = webDB.waitElementByID(FollowUpFeedbackLocators.ELMNT_REPORTED_IMPROVEMENT_HASH_OPTION);
//		if (flag) {
//			webDB.clickBtnByID(FollowUpFeedbackLocators.ELMNT_REPORTED_IMPROVEMENT_HASH_OPTION);
//			Thread.sleep(2500);
			flag = webDB.waitElementByXPath(AggregateResponseLocators.FURTHER_ASSISTENCE_NEEDED_DOWNLOAD_BTN);
			if (flag) {
				webDB.clickBtnByXPath(AggregateResponseLocators.FURTHER_ASSISTENCE_NEEDED_DOWNLOAD_BTN);
				Thread.sleep(2500);
				flag = webDB.waitElementByXPath(FollowUpFeedbackLocators.ELMNT_DOWNLOAD_DOCUMENT);
				if (flag) {
					webDB.actionMoveToElementByXPath(FollowUpFeedbackLocators.ELMNT_DOWNLOAD_DOCUMENT);
					Thread.sleep(2500);
					webDB.clickBtnByXPath(FollowUpFeedbackLocators.ELMNT_DOWNLOAD_DOCUMENT);
					Thread.sleep(2500);
					webDB.clickBtnByXPath(FollowUpFeedbackLocators.ELMNT_DOWNLOAD_BTN);
					Thread.sleep(2500);
					System.out.println("The hash From Reported Improvement docc percentage is accessed");
//					flag = webDB.waitElementByXPath(FollowUpFeedbackLocators.ELMNT_DOWNLOAD_LINK_REPORTED_IMPROVEMENT);
				}
			}
//		}
		return flag;
	}
	
	public boolean selectHashOptionForEVAL() throws IOException, InterruptedException {
		Thread.sleep(2500);
		flag = webDB.waitElementByXPath(ProgramOverviewLocators.ELMNT_EVAL_HASH_OPTION);
		if (flag) {
			webDB.clickBtnByXPath(ProgramOverviewLocators.ELMNT_EVAL_HASH_OPTION);
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
//		webDB.NavigateTo("https://staging.pbergo.com/user/ergo-eval-activity");
		Thread.sleep(3000);
		flag = webDB.verifyAscendingOrderSortingFunctionality(
				FollowUpFeedbackLocators.FIRSTNAME_COLUMNDATA_ONWHICHSORTINGAPPLIED,
				FollowUpFeedbackLocators.FIRSTNAME_COLUMNNAME_ONWHICHSORTINGAPPLIED,
				FollowUpFeedbackLocators.FIRSTNAME_COLUMN_TOTALARROWCOUNT_ONWHICHSORTINGAPPLIED,
				FollowUpFeedbackLocators.FIRSTNAME_COLUMN_UPARROW_ONWHICHSORTINGAPPLIED);
		return flag;
	}

	public boolean verifyDecendingOrderSortingFunctionalityOfFirstName() throws InterruptedException {
//		webDB.NavigateTo("https://staging.pbergo.com/user/ergo-eval-activity");
		Thread.sleep(3000);
		flag = webDB.verifyDecendingOrderSortingFunctionality(
				FollowUpFeedbackLocators.FIRSTNAME_COLUMNDATA_ONWHICHSORTINGAPPLIED,
				FollowUpFeedbackLocators.FIRSTNAME_COLUMNNAME_ONWHICHSORTINGAPPLIED);
		return flag;
	}
	
	public boolean verifyAscendingOrderSortingFunctionalityOfLastName() throws InterruptedException {
//		webDB.NavigateTo("https://staging.pbergo.com/user/ergo-eval-activity");
		Thread.sleep(3000);
		flag = webDB.verifyAscendingOrderSortingFunctionality(
				FollowUpFeedbackLocators.LASTNAME_COLUMNDATA_ONWHICHSORTINGAPPLIED,
				FollowUpFeedbackLocators.LASTNAME_COLUMNNAME_ONWHICHSORTINGAPPLIED,
				FollowUpFeedbackLocators.LASTNAME_COLUMN_TOTALARROWCOUNT_ONWHICHSORTINGAPPLIED,
				FollowUpFeedbackLocators.LASTNAME_COLUMN_UPARROW_ONWHICHSORTINGAPPLIED);
		return flag;
	}

	public boolean verifyDecendingOrderSortingFunctionalityOfLastName() throws InterruptedException {
//		webDB.NavigateTo("https://staging.pbergo.com/user/ergo-eval-activity");
		Thread.sleep(3000);
		flag = webDB.verifyDecendingOrderSortingFunctionality(
				FollowUpFeedbackLocators.LASTNAME_COLUMNDATA_ONWHICHSORTINGAPPLIED,
				FollowUpFeedbackLocators.LASTNAME_COLUMNNAME_ONWHICHSORTINGAPPLIED);
		return flag;
	}
	public boolean verifyAscendingOrderSortingFunctionalityOfEmailAddress() throws InterruptedException {
//		webDB.NavigateTo("https://staging.pbergo.com/user/ergo-eval-activity");
		Thread.sleep(3000);
		flag = webDB.verifyAscendingOrderSortingFunctionality(
				FollowUpFeedbackLocators.EMAILADDRESS_COLUMNDATA_ONWHICHSORTINGAPPLIED,
				FollowUpFeedbackLocators.EMAILADDRESS_COLUMNNAME_ONWHICHSORTINGAPPLIED,
				FollowUpFeedbackLocators.EMAILADDRESS_COLUMN_TOTALARROWCOUNT_ONWHICHSORTINGAPPLIED,
				FollowUpFeedbackLocators.EMAILADDRESS_COLUMN_UPARROW_ONWHICHSORTINGAPPLIED);
		return flag;
	}

	public boolean verifyDecendingOrderSortingFunctionalityOfEmailAddress() throws InterruptedException {
//		webDB.NavigateTo("https://staging.pbergo.com/user/ergo-eval-activity");
		Thread.sleep(3000);
		flag = webDB.verifyDecendingOrderSortingFunctionality(
				FollowUpFeedbackLocators.EMAILADDRESS_COLUMNDATA_ONWHICHSORTINGAPPLIED,
				FollowUpFeedbackLocators.EMAILADDRESS_COLUMNNAME_ONWHICHSORTINGAPPLIED);
		return flag;
	}
	
	public boolean verifyAscendingOrderSortingFunctionalityOfRegion() throws InterruptedException {
//		webDB.NavigateTo("https://staging.pbergo.com/user/ergo-eval-activity");
		Thread.sleep(3000);
		flag = webDB.verifyAscendingOrderSortingFunctionality(
				FollowUpFeedbackLocators.REGION_COLUMNDATA_ONWHICHSORTINGAPPLIED,
				FollowUpFeedbackLocators.REGION_COLUMNNAME_ONWHICHSORTINGAPPLIED,
				FollowUpFeedbackLocators.REGION_COLUMN_TOTALARROWCOUNT_ONWHICHSORTINGAPPLIED,
				FollowUpFeedbackLocators.REGION_COLUMN_UPARROW_ONWHICHSORTINGAPPLIED);
		return flag;
	}

	public boolean verifyDecendingOrderSortingFunctionalityOfRegion() throws InterruptedException {
//		webDB.NavigateTo("https://staging.pbergo.com/user/ergo-eval-activity");
		Thread.sleep(3000);
		flag = webDB.verifyDecendingOrderSortingFunctionality(
				FollowUpFeedbackLocators.REGION_COLUMNDATA_ONWHICHSORTINGAPPLIED,
				FollowUpFeedbackLocators.REGION_COLUMNNAME_ONWHICHSORTINGAPPLIED);
		return flag;
	}
	public boolean verifyAscendingOrderSortingFunctionalityOfDateofFollowUp() throws InterruptedException {
//		webDB.NavigateTo("https://staging.pbergo.com/user/follow-up-feedback");
		Thread.sleep(3000);
		flag = webDB.verifyAscendingOrderSortingFunctionalityOfDateTimeColumn(
				FollowUpFeedbackLocators.DATEOFFOLLOWUP_COLUMNDATA_ONWHICHSORTINGAPPLIED,
				FollowUpFeedbackLocators.DATEOFFOLLOWUP_COLUMNNAME_ONWHICHSORTINGAPPLIED,
				FollowUpFeedbackLocators.DATEOFFOLLOWUP_COLUMN_TOTALARROWCOUNT_ONWHICHSORTINGAPPLIED,
				FollowUpFeedbackLocators.DATEOFFOLLOWUP_COLUMN_UPARROW_ONWHICHSORTINGAPPLIED);
		return flag;
	}

	public boolean verifyDecendingOrderSortingFunctionalityOfDateofFollowUp() throws InterruptedException {
//		webDB.NavigateTo("https://staging.pbergo.com/user/ergo-eval-activity");
		Thread.sleep(3000);
		flag = webDB.verifyDecendingOrderSortingFunctionalityOfDateTimeColumn(
				FollowUpFeedbackLocators.DATEOFFOLLOWUP_COLUMNDATA_ONWHICHSORTINGAPPLIED,
				FollowUpFeedbackLocators.DATEOFFOLLOWUP_COLUMNNAME_ONWHICHSORTINGAPPLIED);
		return flag;
	}
	
	public boolean verifyDateFilterFunctionality() throws InterruptedException
	{
//		webDB.NavigateTo("https://staging.pbergo.com/admin/all_users");
		Thread.sleep(4000);
		flag = webDB.verifyDateFilterFunctionality("(//div[@class='row']//table)[1]/tbody/tr/td[6]/p", "(//table)[1]//td[text()='No Records found']");
	webDB.getPageRefresh();
	Thread.sleep(1500);
		return flag;
	}
}
