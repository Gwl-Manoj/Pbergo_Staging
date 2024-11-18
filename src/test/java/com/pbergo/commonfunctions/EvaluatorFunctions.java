package com.pbergo.commonfunctions;

import java.awt.AWTException;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.Keys;

import com.github.javafaker.Faker;
import com.pbergo.base.WebDriverBase;
import com.pbergo.locators.EmployeeSearchLocators;
import com.pbergo.locators.ErgoEvalActivityLocators;
import com.pbergo.locators.EvaluatorLocators;
import com.pbergo.locators.ProgramOverviewLocators;

public class EvaluatorFunctions {
	private WebDriverBase webDB;
	private boolean flag;

	private String email;
	private UIBasicFunctions uibasicfunctions;
	Faker faker = new Faker();

	public EvaluatorFunctions(WebDriverBase webDB) {
		this.webDB = webDB;
		uibasicfunctions = new UIBasicFunctions(webDB);
	}

	/**
	 * This method is used to click on Evaluator link from left side panel
	 * 
	 * @param
	 * @return
	 * @throws IOException
	 * @throws InterruptedException
	 */
	public boolean openEvaluatorLink() throws IOException, InterruptedException {
		flag = webDB.waitElementByXPath(EvaluatorLocators.ELMNT_EVALUATOR_LEFTSIDEPANEL);
		if (flag) {
			webDB.scrolldown(400);
			Thread.sleep(750);
			webDB.clickBtnByXPath(EvaluatorLocators.ELMNT_EVALUATOR_LEFTSIDEPANEL);
			Thread.sleep(2000);
			flag = webDB.waitElementByXPath(EvaluatorLocators.ELMNT_PAGEHEADING);
		}
		return flag;
	}

	/**
	 * This method is used to verify the search
	 * 
	 * @param
	 * @return
	 * @throws IOException
	 * @throws InterruptedException
	 */
	public boolean verifyReportsInReviewSearchFunctionality() throws IOException, InterruptedException {
		flag = webDB.waitElementByXPath(EvaluatorLocators.ELMNT_REPORTSINREVIEW_SEARCHFIELD);
		if (flag) {
			webDB.scrollToAnElement(EvaluatorLocators.ELMNT_REPORTSINREVIEW_CHECKBOX);
////			
//			webDB.scrollToAnElement(EvaluatorLocators.ELMNT_REPORTSINREVIEW_SEARCHFIELD);
//			Thread.sleep(750);
			email = webDB.getTextByXPath(EvaluatorLocators.ELMNT_REPORTSINREVIEW_EMAILID + "[" + 1 + "]");
			System.out.println("The email id is " + email);
			Thread.sleep(1000);
			webDB.clickBtnByXPath(EvaluatorLocators.ELMNT_REPORTSINREVIEW_SEARCHFIELD);
			Thread.sleep(750);
			webDB.sendTextByXPath(EvaluatorLocators.ELMNT_REPORTSINREVIEW_SEARCHFIELD, email);
			Thread.sleep(750);
			webDB.sendTextByXpath(EvaluatorLocators.ELMNT_REPORTSINREVIEW_SEARCHFIELD, Keys.ENTER);
			Thread.sleep(2000);
			int totalemailids = webDB.countingSizeByXPath(EvaluatorLocators.ELMNT_REPORTSINREVIEW_EMAILID);
			for (int i = 1; i <= totalemailids; i++) {
				String emailids = webDB.getTextByXPath(EvaluatorLocators.ELMNT_REPORTSINREVIEW_EMAILID + "[" + i + "]");
				if (emailids.equals(email)) {
					System.out.println("The search result is same for result number " + i);
					flag = true;
				} else {
					System.out.println("The search result is different for result number " + i);
					flag = false;
				}
			}
		}
		return flag;
	}

	/**
	 * This method is used to verify the Reports In-Review Status Filter
	 * Functionality
	 * 
	 * @param
	 * @return
	 * @throws IOException
	 * @throws InterruptedException
	 */
	public boolean verifyReportsInReviewStatusFilterFunctionality() throws IOException, InterruptedException {
//		webDB.scrolldown(950);
//		Thread.sleep(750);
		flag = webDB.waitElementByXPath(EvaluatorLocators.ELMNT_REPORTSINREVIEW_CHECKBOX);
		if (flag) {
			webDB.clickBtnByXPath(EvaluatorLocators.ELMNT_REPORTSINREVIEW_CHECKBOX);
			Thread.sleep(750);
			webDB.clickBtnByXPath(EvaluatorLocators.ELMNT_REPORTSINREVIEW_STATUSFILTER);
			Thread.sleep(750);
			int number = faker.number().numberBetween(1, 4);
			String expstatus = webDB
					.getTextByXPath(EvaluatorLocators.ELMNT_REPORTSINREVIEW_STATUSFILTEROPTIONS + "[" + number + "]");

			webDB.clickBtnByXPath(EvaluatorLocators.ELMNT_REPORTSINREVIEW_STATUSFILTEROPTIONS + "[" + number + "]");
			Thread.sleep(750);
			webDB.clickBtnByXPath(EvaluatorLocators.ELMNT_REPORTSINREVIEW_STATUS_UPDATEBTN);
			Thread.sleep(2000);

			String actstatus = webDB.getTextByXPath(EvaluatorLocators.ELMNT_REPORTSINREVIEW_STATUS);

			if (actstatus.equalsIgnoreCase(expstatus)) {
				flag = true;
				System.out.println("The actual updated status is same i.e " + actstatus);
				Thread.sleep(2000);

			} else {
				flag = false;
				System.out.println("The actual updated status is different i.e " + actstatus);
			}
		}
		return flag;
	}

	/**
	 * This method is used to verify the Reports In-Review download dataset
	 * Functionality
	 * 
	 * @param
	 * @return
	 * @throws IOException
	 * @throws InterruptedException
	 * @throws AWTException
	 */
	public boolean verifyReportsInReviewDownloadDatasetFunctionality()
			throws IOException, InterruptedException, AWTException {

//		webDB.scrollToAnElement(EvaluatorLocators.ELMNT_REPORTSINREVIEW_CHECKBOX);
//		
		webDB.scrollRight(EvaluatorLocators.ELMNT_REPORTSINREVIEW_STATUS, KeyEvent.VK_RIGHT, 8);
		Thread.sleep(750);
		flag = webDB.waitElementByXPath(EvaluatorLocators.ELMNT_REPORTSINREVIEW_DATASETBTN);
		if (flag) {
			webDB.clickBtnByXPath(EvaluatorLocators.ELMNT_REPORTSINREVIEW_DATASETBTN);
			Thread.sleep(1000);
			flag = webDB.waitElementByXPath(EvaluatorLocators.ELMNT_REPORTSINREVIEW_DATASETDOWNLOADBTN);
			if (flag) {
				webDB.clickBtnByXPath(EvaluatorLocators.ELMNT_REPORTSINREVIEW_DATASETDOWNLOADBTN);
				Thread.sleep(1000);
				webDB.clickBtnByXPath(EvaluatorLocators.ELMNT_REPORTSINREVIEW_DATASETCLOSEBTN);
				Thread.sleep(750);
				flag = webDB.waitElementByXPath(EvaluatorLocators.ELMNT_REPORTSINREVIEW_STATUS);
			}
		}
		return flag;
	}

	/**
	 * This method is used to verify the Reports In-Review Add comment Functionality
	 * 
	 * @param
	 * @return
	 * @throws IOException
	 * @throws InterruptedException
	 */
	public boolean verifyReportsInReviewAddCommentFunctionality() throws IOException, InterruptedException {

		flag = webDB.waitElementByXPath(EvaluatorLocators.ELMNT_REPORTSINREVIEW_ADDCOMMENTBTN);
		if (flag) {
			webDB.clickBtnByXPath(EvaluatorLocators.ELMNT_REPORTSINREVIEW_ADDCOMMENTBTN);
			Thread.sleep(1000);
			flag = webDB.waitElementByXPath(EvaluatorLocators.ELMNT_REPORTSINREVIEW_ADDCOMMENTINPUTFIELD);
			if (flag) {
				webDB.sendTextByXPath(EvaluatorLocators.ELMNT_REPORTSINREVIEW_ADDCOMMENTINPUTFIELD, "Test comment");
				Thread.sleep(1000);
				webDB.scrollToAnElement(EvaluatorLocators.ELMNT_REPORTSINREVIEW_ADDCOMMENTBTNAFTERINPUT);
				Thread.sleep(1000);
				webDB.clickBtnByXPath(EvaluatorLocators.ELMNT_REPORTSINREVIEW_ADDCOMMENTBTNAFTERINPUT);
				flag = webDB.waitElementByXPath(EvaluatorLocators.ELMNT_REPORTSINREVIEW_COMMENTADDEDSUCCESSMSG);
			}
		}
		return flag;
	}

	/**
	 * This method is used to verify the Reports In-Review History Functionality
	 * 
	 * @param
	 * @return
	 * @throws IOException
	 * @throws InterruptedException
	 */
	public boolean verifyReportsInReviewHistoryFunctionality() throws IOException, InterruptedException {

		flag = webDB.waitElementByXPath(EvaluatorLocators.ELMNT_REPORTSINREVIEW_HISTORYBTN);
		if (flag) {
			webDB.clickBtnByXPath(EvaluatorLocators.ELMNT_REPORTSINREVIEW_HISTORYBTN);
			Thread.sleep(1000);
			flag = webDB.waitElementByXPath(EvaluatorLocators.ELMNT_REPORTSINREVIEW_HISTORYH2HEADING);
			if (flag) {
				flag = webDB.waitElementByXPath(EvaluatorLocators.ELMNT_REPORTSINREVIEW_HISTORYHEADING);
				if (flag) {
					webDB.clickBtnByXPath(EvaluatorLocators.ELMNT_REPORTSINREVIEW_HISTORYCLOSEBTN);
					Thread.sleep(1000);
					flag = webDB.waitElementByXPath(EvaluatorLocators.ELMNT_REPORTSINREVIEW_HISTORYBTN);
				}
			}
		}
		return flag;
	}

	/**
	 * This method is used to verify the Reports In-Review Edit survey report
	 * Functionality
	 * 
	 * @param
	 * @return
	 * @throws IOException
	 * @throws InterruptedException
	 * @throws AWTException
	 */
	public boolean verifyReportsInReviewEditSurveyReportFunctionality()
			throws IOException, InterruptedException, AWTException {
//		webDB.scrollToAnElement(EvaluatorLocators.ELMNT_REPORTSINREVIEW_CHECKBOX);
//		webDB.scrollRight(EvaluatorLocators.ELMNT_REPORTSINREVIEW_STATUS, KeyEvent.VK_RIGHT, 8);
//		Thread.sleep(750);
//		webDB.NavigateTo("https://staging.pbergo.com/user/evaluator");
//		Thread.sleep(2000);
		flag = webDB.waitElementByXPath(EvaluatorLocators.ELMNT_REPORTSINREVIEW_EDITSURVEYREPORTBTN);
		if (flag) {
			webDB.clickBtnByXPath(EvaluatorLocators.ELMNT_REPORTSINREVIEW_EDITSURVEYREPORTBTN);
			Thread.sleep(1500);
			Set<String> window = webDB.getwindowhandles();
			for (String s1 : window) {
				webDB.switchToWindow(s1);
				Thread.sleep(750);
				String pagetitle = webDB.getPageTitle();

				if (pagetitle.equals("PBErgo - Edit Survey")) {
					System.out.println("Swithced to frame and page title is " + pagetitle);
					Thread.sleep(1000);
					webDB.switchToiFrame("(//iframe[@webkitallowfullscreen='true'])[1]");
					Thread.sleep(1000);

					String text = webDB.getTextByXPath("//label[text()=' Date of Evaluation: ']");
					System.out.println("The string on page is " + text);
					for (int i = 1; i <= 6; i++) {
						webDB.scrollToAnElement(EvaluatorLocators.ELMNT_REPORTSINREVIEW_SURVEYNEXTBTN);
						Thread.sleep(2000);
						webDB.clickBtnByXPath(EvaluatorLocators.ELMNT_REPORTSINREVIEW_SURVEYNEXTBTN);
						Thread.sleep(1500);
					}
					flag = webDB.waitElementByXPath(EvaluatorLocators.ELMNT_REPORTSINREVIEW_SURVEYSUCCESSMSG);
					if (flag) {
						System.out.println("The survey is filled successfully");

					} else {
						System.out.println("The survey is not filled successfully");
					}
				}

			}
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
		flag = uibasicfunctions.verifySearchFunctionality(EvaluatorLocators.ELMNT_REPORTSINREVIEW_SEARCHINPUTFIELD,
				EvaluatorLocators.ELMNT_REPORTSINREVIEW_SEARCHTEXT);
		return flag;
	}

	/**
	 * This method is used to verify the client view btn Functionality
	 * 
	 * @param
	 * @return
	 * @throws IOException
	 * @throws InterruptedException
	 * @throws AWTException
	 */
	public boolean verifyClientViewBtnFunctionality() throws IOException, InterruptedException {
		flag = webDB.waitElementByXPath(EvaluatorLocators.ELMNT_CLIENTVIEWBTN);
		if (flag) {
			webDB.clickBtnByXPath(EvaluatorLocators.ELMNT_CLIENTVIEWBTN);
			Thread.sleep(2000);

			String pagetitle = webDB.getPageTitle();

			if (pagetitle.equals("PBErgo - Evaluator - Employee Search")) {
				System.out.println("Swithced to frame and page title is " + pagetitle);
				Thread.sleep(1000);
				flag = webDB.waitElementByXPath(EvaluatorLocators.ELMNT_EMPLOYEESEARCHHEADING);
				Thread.sleep(750);
				webDB.getBack();
				Thread.sleep(2000);
//			Thread.sleep(2000);

			}
		}

		return flag;
	}
	
	public boolean verifyClientsPaginationFunctionality() throws InterruptedException, IOException {
//		webDB.NavigateTo("https://staging.pbergo.com/admin/all_user_group");
		Thread.sleep(3000);
		webDB.scrollToAnElement(ProgramOverviewLocators.Pagination);
		Thread.sleep(3000);
		flag = webDB.verifyPagination("(//p[@class='float-lg-start text-sm-center'])[1]",
				"(//li[@class='page-item next']/button)[1]",
				"(//table[@class='table table-bordered table dataTable no-footer']//tbody)[1]//tr");
		return flag;

	}
	
	public boolean verifyAscendingOrderSortingFunctionalityOfClienttName() throws InterruptedException {
		Thread.sleep(3000);
		flag = webDB.verifyAscendingOrderSortingFunctionality(
				EvaluatorLocators.CLIENTNAME_COLUMNDATA_ONWHICHSORTINGAPPLIED,
				EvaluatorLocators.CLIENTNAME_COLUMNNAME_ONWHICHSORTINGAPPLIED,
				EvaluatorLocators.CLIENTNAME_COLUMN_TOTALARROWCOUNT_ONWHICHSORTINGAPPLIED,
				EvaluatorLocators.CLIENTNAME_COLUMN_UPARROW_ONWHICHSORTINGAPPLIED);
		return flag;
	}

	public boolean verifyDecendingOrderSortingFunctionalityOfClientName() throws InterruptedException {
		Thread.sleep(3000);
		flag = webDB.verifyDecendingOrderSortingFunctionality(
				EvaluatorLocators.CLIENTNAME_COLUMNDATA_ONWHICHSORTINGAPPLIED,
				EvaluatorLocators.CLIENTNAME_COLUMNNAME_ONWHICHSORTINGAPPLIED);
		return flag;
	}
	
	public boolean verifyAscendingOrderSortingFunctionalityOfStatus() throws InterruptedException {
		Thread.sleep(3000);
		flag = webDB.verifyAscendingOrderSortingFunctionality(
				EvaluatorLocators.STATUS_COLUMNDATA_ONWHICHSORTINGAPPLIED,
				EvaluatorLocators.STATUS_COLUMNNAME_ONWHICHSORTINGAPPLIED,
				EvaluatorLocators.STATUS_COLUMN_TOTALARROWCOUNT_ONWHICHSORTINGAPPLIED,
				EvaluatorLocators.STATUS_COLUMN_UPARROW_ONWHICHSORTINGAPPLIED);
		return flag;
	}

	public boolean verifyDecendingOrderSortingFunctionalityOfStatus() throws InterruptedException {
		Thread.sleep(3000);
		flag = webDB.verifyDecendingOrderSortingFunctionality(
				EvaluatorLocators.STATUS_COLUMNDATA_ONWHICHSORTINGAPPLIED,
				EvaluatorLocators.STATUS_COLUMNNAME_ONWHICHSORTINGAPPLIED);
		return flag;
	}
	
	public boolean verifyReportsReviewPaginationFunctionality() throws InterruptedException, IOException {
		Thread.sleep(3000);
		webDB.scrollToAnElement("(//p[@class='float-lg-start text-sm-center'])[2]");
		Thread.sleep(3000);
		flag = webDB.verifyPagination("(//p[@class='float-lg-start text-sm-center'])[2]",
				"(//li[@class='page-item next']/button)[2]",
				"(//table[@class='table table-bordered table dataTable no-footer']//tbody)[2]//tr");
		return flag;

	}
	
	public boolean verifyAscendingOrderSortingFunctionalityOfDateofEval() throws InterruptedException {
		Thread.sleep(3000);
		webDB.selectOptionByText("(//select[@name ='datatable_length_review'])[1]", "500");
		Thread.sleep(5000);
		flag = webDB.verifyAscendingOrderSortingFunctionalityOfDateColumn(
				EvaluatorLocators.DATEOFEVAL_COLUMNDATA_ONWHICHSORTINGAPPLIED,
				EvaluatorLocators.DATEOFEVAL_COLUMNNAME_ONWHICHSORTINGAPPLIED,
				EvaluatorLocators.DATEOFEVAL_COLUMN_TOTALARROWCOUNT_ONWHICHSORTINGAPPLIED,
				EvaluatorLocators.DATEOFEVAL_COLUMN_UPARROW_ONWHICHSORTINGAPPLIED);
		return flag;
	}

	public boolean verifyDecendingOrderSortingFunctionalityOfDateofEval() throws InterruptedException {
		Thread.sleep(3000);
		flag = webDB.verifyDecendingOrderSortingFunctionalityOfDateColumn(
				EvaluatorLocators.DATEOFEVAL_COLUMNDATA_ONWHICHSORTINGAPPLIED,
				EvaluatorLocators.DATEOFEVAL_COLUMNNAME_ONWHICHSORTINGAPPLIED);
		return flag;
	}
	
	
	public boolean verifyAscendingOrderSortingFunctionalityOfFirstName() throws InterruptedException {
		Thread.sleep(3000);
		flag = webDB.verifyAscendingOrderSortingFunctionality(
				EvaluatorLocators.FIRSTNAME_COLUMNDATA_ONWHICHSORTINGAPPLIED,
				EvaluatorLocators.FIRSTNAME_COLUMNNAME_ONWHICHSORTINGAPPLIED,
				EvaluatorLocators.FIRSTNAME_COLUMN_TOTALARROWCOUNT_ONWHICHSORTINGAPPLIED,
				EvaluatorLocators.FIRSTNAME_COLUMN_UPARROW_ONWHICHSORTINGAPPLIED);
		return flag;
	}

	public boolean verifyDecendingOrderSortingFunctionalityOfFirstName() throws InterruptedException {
		Thread.sleep(3000);
		flag = webDB.verifyDecendingOrderSortingFunctionality(
				EvaluatorLocators.FIRSTNAME_COLUMNDATA_ONWHICHSORTINGAPPLIED,
				EvaluatorLocators.FIRSTNAME_COLUMNNAME_ONWHICHSORTINGAPPLIED);
		return flag;
	}
	
	public boolean verifyAscendingOrderSortingFunctionalityOfLastName() throws InterruptedException {
		Thread.sleep(3000);
		flag = webDB.verifyAscendingOrderSortingFunctionality(
				EvaluatorLocators.LASTNAME_COLUMNDATA_ONWHICHSORTINGAPPLIED,
				EvaluatorLocators.LASTNAME_COLUMNNAME_ONWHICHSORTINGAPPLIED,
				EvaluatorLocators.LASTNAME_COLUMN_TOTALARROWCOUNT_ONWHICHSORTINGAPPLIED,
				EvaluatorLocators.LASTNAME_COLUMN_UPARROW_ONWHICHSORTINGAPPLIED);
		return flag;
	}

	public boolean verifyDecendingOrderSortingFunctionalityOfLastName() throws InterruptedException {
		Thread.sleep(3000);
		flag = webDB.verifyDecendingOrderSortingFunctionality(
				EvaluatorLocators.LASTNAME_COLUMNDATA_ONWHICHSORTINGAPPLIED,
				EvaluatorLocators.LASTNAME_COLUMNNAME_ONWHICHSORTINGAPPLIED);
		return flag;
	}
	public boolean verifyAscendingOrderSortingFunctionalityOfEmailAddress() throws InterruptedException {
		Thread.sleep(3000);
		flag = webDB.verifyAscendingOrderSortingFunctionality(
				EvaluatorLocators.EMAILADDRESS_COLUMNDATA_ONWHICHSORTINGAPPLIED,
				EvaluatorLocators.EMAILADDRESS_COLUMNNAME_ONWHICHSORTINGAPPLIED,
				EvaluatorLocators.EMAILADDRESS_COLUMN_TOTALARROWCOUNT_ONWHICHSORTINGAPPLIED,
				EvaluatorLocators.EMAILADDRESS_COLUMN_UPARROW_ONWHICHSORTINGAPPLIED);
		return flag;
	}

	public boolean verifyDecendingOrderSortingFunctionalityOfEmailAddress() throws InterruptedException {
		Thread.sleep(3000);
		flag = webDB.verifyDecendingOrderSortingFunctionality(
				EvaluatorLocators.EMAILADDRESS_COLUMNDATA_ONWHICHSORTINGAPPLIED,
				EvaluatorLocators.EMAILADDRESS_COLUMNNAME_ONWHICHSORTINGAPPLIED);
		return flag;
	}
	
	public boolean verifyAscendingOrderSortingFunctionalityOfClient() throws InterruptedException {
		Thread.sleep(3000);
		flag = webDB.verifyAscendingOrderSortingFunctionality(
				EvaluatorLocators.CLIENT_COLUMNDATA_ONWHICHSORTINGAPPLIED,
				EvaluatorLocators.CLIENT_COLUMNNAME_ONWHICHSORTINGAPPLIED,
				EvaluatorLocators.CLIENT_COLUMN_TOTALARROWCOUNT_ONWHICHSORTINGAPPLIED,
				EvaluatorLocators.CLIENT_COLUMN_UPARROW_ONWHICHSORTINGAPPLIED);
		return flag;
	}

	public boolean verifyDecendingOrderSortingFunctionalityOfClient() throws InterruptedException {
		Thread.sleep(3000);
		flag = webDB.verifyDecendingOrderSortingFunctionality(
				EvaluatorLocators.CLIENT_COLUMNDATA_ONWHICHSORTINGAPPLIED,
				EvaluatorLocators.CLIENT_COLUMNNAME_ONWHICHSORTINGAPPLIED);
		return flag;
	}
	
	public boolean verifyAscendingOrderSortingFunctionalityOfRRStatus() throws InterruptedException {
		Thread.sleep(3000);
		flag = webDB.verifyAscendingOrderSortingFunctionality(
				EvaluatorLocators.STATUSRR_COLUMNDATA_ONWHICHSORTINGAPPLIED,
				EvaluatorLocators.STATUSRR_COLUMNNAME_ONWHICHSORTINGAPPLIED,
				EvaluatorLocators.STATUSRR_COLUMN_TOTALARROWCOUNT_ONWHICHSORTINGAPPLIED,
				EvaluatorLocators.STATUSRR_COLUMN_UPARROW_ONWHICHSORTINGAPPLIED);
		return flag;
	}

	public boolean verifyDecendingOrderSortingFunctionalityOfRRStatus() throws InterruptedException {
		Thread.sleep(3000);
		flag = webDB.verifyDecendingOrderSortingFunctionality(
				EvaluatorLocators.STATUSRR_COLUMNDATA_ONWHICHSORTINGAPPLIED,
				EvaluatorLocators.STATUSRR_COLUMNNAME_ONWHICHSORTINGAPPLIED);
		return flag;
	}
	
	public boolean verifyDateFilterFunctionality() throws InterruptedException
	{
		Thread.sleep(3000);
		flag = webDB.verifyDateFilterFunctionality("(//div[@class='row']//table)[2]/tbody/tr/td[2]/p", "(//table)[2]//td[text()='No Records found']");
	webDB.getPageRefresh();
	Thread.sleep(1500);
		return flag;
	}

}
