package com.pbergo.commonfunctions;

import java.awt.AWTException;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.pbergo.base.WebDriverBase;
import com.pbergo.locators.PMReportsLocators;
import com.pbergo.locators.PMRequestLocators;

public class PMRequest {
	
		private WebDriverBase webDB;
		private boolean flag;
		private String email, temp;
		WebDriver driver;
		private JavascriptExecutor js;

		/**
		 * This method is used to verify the search
		 * 
		 * @param
		 * @return
		 * @throws IOException
		 * @throws InterruptedException
		 */
		public PMRequest(WebDriverBase webDB) {
			this.webDB = webDB;
			js = (JavascriptExecutor) webDB.passingWebDriverInstance(webDB);
		}

		/**
		 * 
		 * This methods is used for the searching for the program management Request data
		 * @author Dakshiyta
		 * @throws AWTException
		 */
		public boolean requestsearch() throws IOException, InterruptedException, AWTException {
			webDB.clickBtnByXPath(PMRequestLocators.REQUEST);
			Thread.sleep(2000);
			flag = webDB.waitElementByXPath(PMRequestLocators.REQUEST_SEARCH);
			if (flag) {
				webDB.scrollToAnElement(PMRequestLocators.REQUEST_SEARCH_DATA);
////					
//					webDB.scrollToAnElement(EvaluatorLocators.ELMNT_REPORTSINREVIEW_SEARCHFIELD);
//					Thread.sleep(750);
				email = webDB.getTextByXPath(PMRequestLocators.REQUEST_SEARCH_DATA + "[" + 1 + "]");
				System.out.println("The email id is " + email);
				Thread.sleep(1000);
				webDB.clickBtnByXPath(PMRequestLocators.REQUEST_SEARCH);
				Thread.sleep(750);
				webDB.sendTextByXPath(PMRequestLocators.REQUEST_SEARCH, email);
				Thread.sleep(750);
				webDB.sendTextByXpath(PMRequestLocators.REQUEST_SEARCH, Keys.ENTER);
				Thread.sleep(2000);
				int totalemailids = webDB.countingSizeByXPath(PMRequestLocators.REQUEST_SEARCH_DATA);
				for (int i = 1; i <= totalemailids; i++) {
					String emailids = webDB.getTextByXPath(PMRequestLocators.REQUEST_SEARCH_DATA + "[" + i + "]");
					if (emailids.equals(email)) {
						System.out.println("The search result is same for result number " + i);
						Thread.sleep(2000);
						webDB.scrollRight(PMRequestLocators.REQUEST_SEARCH_DATA, KeyEvent.VK_RIGHT, 10);
						Thread.sleep(2000);
						webDB.clickBtnByXPath(PMRequestLocators.REQUEST_SEARCH_DATA);
						Thread.sleep(2000);
						flag = true;
					} else {
						System.out.println("The search result is different for result number " + i);
						flag = true;
					}
				}
			}
//			History();
			return flag;

		}
		
		/**
		 * 
		 * This methods is used for the Request page history icon functionality
		 * @author Dakshiyta
		 * @throws AWTException
		 */
		
		public boolean History() throws InterruptedException, IOException {
			flag = webDB.waitElementByXPath(PMRequestLocators.REQUEST_SEARCH_DATA_HISTORY);
			if (flag) {
				webDB.clickBtnByXPath(PMRequestLocators.REQUEST_SEARCH_DATA_HISTORY);
				Thread.sleep(2000);
				flag = webDB.waitElementByXPath(PMRequestLocators.REQUEST_SEARCH_DATA_HISTORY_CLOSE);
				if (flag) {
					Thread.sleep(6000);
					webDB.clickBtnByXPath(PMRequestLocators.REQUEST_SEARCH_DATA_HISTORY_CLOSE);
				}
			}
//			dataSet();
			return flag;

		}

		/**
		 * 
		 * This methods is used for the Request page dataset icon functionality
		 * @author Dakshiyta
		 * @throws AWTException
		 */
		
		public boolean dataSet() throws IOException, InterruptedException {
			flag = webDB.waitElementByXPath(PMRequestLocators.REQUEST_SEARCH_DATA_DATASET);
			if (flag) {
				webDB.clickBtnByXPath(PMRequestLocators.REQUEST_SEARCH_DATA_DATASET);
				Thread.sleep(2000);
				flag = webDB.waitElementByXPath(PMRequestLocators.REQUEST_SEARCH_DATA_HISTORY_SEARCH_DATA_VIEW_DOWNLOAD);
				if (flag) {
					Thread.sleep(6000);
					webDB.clickBtnByXPath(PMRequestLocators.REQUEST_SEARCH_DATA_HISTORY_SEARCH_DATA_VIEW_DOWNLOAD);
					Thread.sleep(6000);
					webDB.clickBtnByXPath(PMRequestLocators.REQUEST_SEARCH_DATA_HISTORY_SEARCH_DATA_VIEW_CLOSE);
				}
			}

//			complete();
			return flag;
			
		}

		/**
		 * 
		 * This methods is used for the Request page complete icon functionality
		 * @author Dakshiyta
		 * @throws AWTException
		 */
		
		public boolean complete() throws InterruptedException, IOException {
			flag = webDB.waitElementByXPath(PMRequestLocators.REQUEST_SEARCH_DATA_COMPLETE);
			if (flag) {
				webDB.clickBtnByXPath(PMRequestLocators.REQUEST_SEARCH_DATA_COMPLETE);
				Thread.sleep(2000);
				flag = webDB.waitElementByXPath(PMRequestLocators.REQUEST_SEARCH_DATA_COMPLETE_BTN);
				if (flag) {
					Thread.sleep(6000);
					webDB.clickBtnByXPath(PMRequestLocators.REQUEST_SEARCH_DATA_COMPLETE_BTN);
					temp = webDB.getTextByXPath(PMReportsLocators.REPORTS_SEARCH_DATA_COMMENT_TOAST);
					System.out.println("Toast is: " +temp);
					if(temp.equals(PMRequestLocators.REQUEST_SEARCH_DATA_COMPLETE_TXT)) {
						System.out.println("Comment added successfully");
					}
				}
			}
			
			return flag;

		}
		
		public boolean verifyAscendingOrderSortingFunctionalityOfDOE() throws InterruptedException {
//			webDB.NavigateTo("https://staging.pbergo.com/user/ergo-eval-activity");
			webDB.selectOptionByText("(//select[@name ='datatable_length'])[1]", "500");
			Thread.sleep(5000);
			webDB.scrollToAnElement(PMRequestLocators.DATEOFEVAL_COLUMNNAME_ONWHICHSORTINGAPPLIED);
			Thread.sleep(3000);
			flag = webDB.verifyAscendingOrderSortingFunctionalityOfDateColumn(
					PMRequestLocators.DATEOFEVAL_COLUMNDATA_ONWHICHSORTINGAPPLIED,
					PMRequestLocators.DATEOFEVAL_COLUMNNAME_ONWHICHSORTINGAPPLIED,
					PMRequestLocators.DATEOFEVAL_COLUMN_TOTALARROWCOUNT_ONWHICHSORTINGAPPLIED,
					PMRequestLocators.DATEOFEVAL_COLUMN_UPARROW_ONWHICHSORTINGAPPLIED);
			return flag;
		}

		public boolean verifyDecendingOrderSortingFunctionalityOfDOE() throws InterruptedException {
//			webDB.NavigateTo("https://staging.pbergo.com/user/ergo-eval-activity");
			Thread.sleep(3000);
			flag = webDB.verifyDecendingOrderSortingFunctionalityOfDateColumn(
					PMRequestLocators.DATEOFEVAL_COLUMNDATA_ONWHICHSORTINGAPPLIED,
					PMRequestLocators.DATEOFEVAL_COLUMNNAME_ONWHICHSORTINGAPPLIED);
			return flag;
		}
		
		public boolean verifyAscendingOrderSortingFunctionalityOfFirstName() throws InterruptedException {
//			webDB.NavigateTo("https://staging.pbergo.com/user/ergo-eval-activity");
			Thread.sleep(3000);
			flag = webDB.verifyAscendingOrderSortingFunctionality(
					PMRequestLocators.FIRSTNAME_COLUMNDATA_ONWHICHSORTINGAPPLIED,
					PMRequestLocators.FIRSTNAME_COLUMNNAME_ONWHICHSORTINGAPPLIED,
					PMRequestLocators.FIRSTNAME_COLUMN_TOTALARROWCOUNT_ONWHICHSORTINGAPPLIED,
					PMRequestLocators.FIRSTNAME_COLUMN_UPARROW_ONWHICHSORTINGAPPLIED);
			return flag;
		}

		public boolean verifyDecendingOrderSortingFunctionalityOfFirstName() throws InterruptedException {
//			webDB.NavigateTo("https://staging.pbergo.com/user/ergo-eval-activity");
			Thread.sleep(3000);
			flag = webDB.verifyDecendingOrderSortingFunctionality(
					PMRequestLocators.FIRSTNAME_COLUMNDATA_ONWHICHSORTINGAPPLIED,
					PMRequestLocators.FIRSTNAME_COLUMNNAME_ONWHICHSORTINGAPPLIED);
			return flag;
		}
		
		public boolean verifyAscendingOrderSortingFunctionalityOfLastName() throws InterruptedException {
//			webDB.NavigateTo("https://staging.pbergo.com/user/ergo-eval-activity");
			Thread.sleep(3000);
			flag = webDB.verifyAscendingOrderSortingFunctionality(
					PMRequestLocators.LASTNAME_COLUMNDATA_ONWHICHSORTINGAPPLIED,
					PMRequestLocators.LASTNAME_COLUMNNAME_ONWHICHSORTINGAPPLIED,
					PMRequestLocators.LASTNAME_COLUMN_TOTALARROWCOUNT_ONWHICHSORTINGAPPLIED,
					PMRequestLocators.LASTNAME_COLUMN_UPARROW_ONWHICHSORTINGAPPLIED);
			return flag;
		}

		public boolean verifyDecendingOrderSortingFunctionalityOfLastName() throws InterruptedException {
//			webDB.NavigateTo("https://staging.pbergo.com/user/ergo-eval-activity");
			Thread.sleep(3000);
			flag = webDB.verifyDecendingOrderSortingFunctionality(
					PMRequestLocators.LASTNAME_COLUMNDATA_ONWHICHSORTINGAPPLIED,
					PMRequestLocators.LASTNAME_COLUMNNAME_ONWHICHSORTINGAPPLIED);
			return flag;
		}
		public boolean verifyAscendingOrderSortingFunctionalityOfEmailAddress() throws InterruptedException {
//			webDB.NavigateTo("https://staging.pbergo.com/user/ergo-eval-activity");
			Thread.sleep(3000);
			flag = webDB.verifyAscendingOrderSortingFunctionality(
					PMRequestLocators.EMAILADDRESS_COLUMNDATA_ONWHICHSORTINGAPPLIED,
					PMRequestLocators.EMAILADDRESS_COLUMNNAME_ONWHICHSORTINGAPPLIED,
					PMRequestLocators.EMAILADDRESS_COLUMN_TOTALARROWCOUNT_ONWHICHSORTINGAPPLIED,
					PMRequestLocators.EMAILADDRESS_COLUMN_UPARROW_ONWHICHSORTINGAPPLIED);
			return flag;
		}

		public boolean verifyDecendingOrderSortingFunctionalityOfEmailAddress() throws InterruptedException {
//			webDB.NavigateTo("https://staging.pbergo.com/user/ergo-eval-activity");
			Thread.sleep(3000);
			flag = webDB.verifyDecendingOrderSortingFunctionality(
					PMRequestLocators.EMAILADDRESS_COLUMNDATA_ONWHICHSORTINGAPPLIED,
					PMRequestLocators.EMAILADDRESS_COLUMNNAME_ONWHICHSORTINGAPPLIED);
			return flag;
		}
		
		public boolean verifyAscendingOrderSortingFunctionalityOfStatus() throws InterruptedException {
//			webDB.NavigateTo("https://staging.pbergo.com/user/ergo-eval-activity");
			Thread.sleep(3000);
			flag = webDB.verifyAscendingOrderSortingFunctionality(
					PMRequestLocators.STATUS_COLUMNDATA_ONWHICHSORTINGAPPLIED,
					PMRequestLocators.STATUS_COLUMNNAME_ONWHICHSORTINGAPPLIED,
					PMRequestLocators.STATUS_COLUMN_TOTALARROWCOUNT_ONWHICHSORTINGAPPLIED,
					PMRequestLocators.STATUS_COLUMN_UPARROW_ONWHICHSORTINGAPPLIED);
			return flag;
		}

		public boolean verifyDecendingOrderSortingFunctionalityOfStatus() throws InterruptedException {
//			webDB.NavigateTo("https://staging.pbergo.com/user/ergo-eval-activity");
			Thread.sleep(3000);
			flag = webDB.verifyDecendingOrderSortingFunctionality(
					PMRequestLocators.STATUS_COLUMNDATA_ONWHICHSORTINGAPPLIED,
					PMRequestLocators.STATUS_COLUMNNAME_ONWHICHSORTINGAPPLIED);
			return flag;
		}
}
