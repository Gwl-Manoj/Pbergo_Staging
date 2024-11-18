package com.pbergo.commonfunctions;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.pbergo.base.WebDriverBase;
import com.pbergo.locators.ProgramOverviewLocators;
import com.pbergo.locators.SelfAssessmentLocators;
//import com.pbergo.locators.HeaderSectionLocators;
//import com.pbergo.locators.LeftSidePanelLocators;
import com.pbergo.locators.UsersLocators;

public class SelfAssessmentFunctions {
	private WebDriverBase webDB;
	private boolean flag;
	private String temp;
	WebDriver driver;

	public SelfAssessmentFunctions(WebDriverBase webDB) {
		this.webDB = webDB;
	}

	/**
	 * @param userPermittedSection [Passing options from the Menu link]
	 * @return
	 * @throws IOException
	 * @throws InterruptedException
	 */
	public boolean openSelfAssessmentLink() throws IOException, InterruptedException {
		Thread.sleep(2000);
		flag = webDB.waitElementByXPath(SelfAssessmentLocators.ELMNT_SELF_ASSESSMENT_LEFTSIDEPANEL);
		if (flag) {
			webDB.clickBtnByXPath(SelfAssessmentLocators.ELMNT_SELF_ASSESSMENT_LEFTSIDEPANEL);
			Thread.sleep(1500);
			flag = true;
		}
//		flag = true;
		return flag;
	}

	public boolean clickCurrentLink() throws IOException, InterruptedException {
		flag = webDB.waitElementByID(ProgramOverviewLocators.ELMNT_CURRENT_OPTION);
		if (flag) {
			webDB.clickBtnByID(ProgramOverviewLocators.ELMNT_CURRENT_OPTION);
		}
		return flag;
	}

	public boolean downloadImageForCurrentOption() throws IOException, InterruptedException {
		
		
			flag = webDB.waitElementByXPath(ProgramOverviewLocators.ELMNT_DOWNLOAD_LINK_SITE_REGISTRANTS);
			if (flag) {
				webDB.clickBtnByXPath(ProgramOverviewLocators.ELMNT_DOWNLOAD_LINK_SITE_REGISTRANTS);
				flag = webDB.waitElementByXPath(ProgramOverviewLocators.ELMNT_DOWNLOAD_IMAGE);
				if (flag) {
					webDB.clickBtnByXPath(ProgramOverviewLocators.ELMNT_DOWNLOAD_IMAGE);
					webDB.clickBtnByXPath(ProgramOverviewLocators.ELMNT_DOWNLOAD_BTN);
					flag = webDB.waitElementByXPath(ProgramOverviewLocators.ELMNT_DOWNLOAD_LINK_SITE_REGISTRANTS);
				}
			
		}
		return flag;
	}


	public boolean downloadDocumentForCurrentOption() throws IOException, InterruptedException {
		flag = webDB.waitElementByXPath(ProgramOverviewLocators.ELMNT_DOWNLOAD_LINK_SITE_REGISTRANTS);
		if (flag) {
			webDB.clickBtnByXPath(ProgramOverviewLocators.ELMNT_DOWNLOAD_LINK_SITE_REGISTRANTS);
			flag = webDB.waitElementByXPath(ProgramOverviewLocators.ELMNT_DOWNLOAD_DOCUMENT);
			if (flag) {
				webDB.clickBtnByXPath(ProgramOverviewLocators.ELMNT_DOWNLOAD_DOCUMENT);
				webDB.clickBtnByXPath(ProgramOverviewLocators.ELMNT_DOWNLOAD_BTN);
				flag = webDB.waitElementByXPath(ProgramOverviewLocators.ELMNT_DOWNLOAD_LINK_SITE_REGISTRANTS);
			}
		}
		return flag;
	}

	public boolean clickYTDLink() throws IOException, InterruptedException {
		flag = webDB.waitElementByID(ProgramOverviewLocators.ELMNT_YTD_OPTION);
		if (flag) {
			webDB.clickBtnByID(ProgramOverviewLocators.ELMNT_YTD_OPTION);
		}
		return flag;
	}

	public boolean downloadImageForYTDOption() throws IOException, InterruptedException {
		flag = webDB.waitElementByXPath(ProgramOverviewLocators.ELMNT_DOWNLOAD_LINK_SITE_REGISTRANTS);
		if (flag) {
			webDB.clickBtnByXPath(ProgramOverviewLocators.ELMNT_DOWNLOAD_LINK_SITE_REGISTRANTS);
			flag = webDB.waitElementByXPath(ProgramOverviewLocators.ELMNT_DOWNLOAD_IMAGE);
			if (flag) {
				webDB.clickBtnByXPath(ProgramOverviewLocators.ELMNT_DOWNLOAD_IMAGE);
				webDB.clickBtnByXPath(ProgramOverviewLocators.ELMNT_DOWNLOAD_BTN);
				flag = webDB.waitElementByXPath(ProgramOverviewLocators.ELMNT_DOWNLOAD_LINK_SITE_REGISTRANTS);
			}
		}
		return flag;
	}

	public boolean downloadDocumentForSelfReportedDiscomfort() throws IOException, InterruptedException {
//		try {
			webDB.scrolldown(200);
			Thread.sleep(750);
		flag = webDB.waitElementByXPath(SelfAssessmentLocators.ELMNT_DOWNLOAD_LINK_SELF_REPORTED_DISCOMFORT);
		if (flag) {
			webDB.clickBtnByXPath(SelfAssessmentLocators.ELMNT_DOWNLOAD_LINK_SELF_REPORTED_DISCOMFORT);
			Thread.sleep(750);
			flag = webDB.waitElementByXPath(SelfAssessmentLocators.ELMNT_DOWNLOAD_DOCUMENT);
			if (flag) {
				webDB.clickBtnByXPath(SelfAssessmentLocators.ELMNT_DOWNLOAD_DOCUMENT);
				Thread.sleep(750);
				webDB.clickBtnByXPath(SelfAssessmentLocators.ELMNT_DOWNLOAD_BTN);
				Thread.sleep(1000);
				flag = webDB.waitElementByXPath(SelfAssessmentLocators.ELMNT_DOWNLOAD_LINK_SELF_REPORTED_DISCOMFORT);
				Thread.sleep(1500);
			}
//		}
//		}catch (Exception e){
//			flag = webDB.waitElementByXPath(SelfAssessmentLocators.ELMNT_NO_DATA_SELF_REPORTED_DISCOMFORT);
//			if(flag) {
//				temp = webDB.getTextByXPath(SelfAssessmentLocators.ELMNT_NO_DATA_SELF_REPORTED_DISCOMFORT);
//				flag = temp.contentEquals("No Data Found");
//			}
		}
	
		return flag;
	}

	public boolean downloadImageForSelfReportedDiscomfort() throws IOException, InterruptedException {
		flag = webDB.waitElementByXPath(SelfAssessmentLocators.ELMNT_DOWNLOAD_LINK_SELF_REPORTED_DISCOMFORT);
		if (flag) {
			webDB.clickBtnByXPath(SelfAssessmentLocators.ELMNT_DOWNLOAD_LINK_SELF_REPORTED_DISCOMFORT);
			Thread.sleep(750);
			flag = webDB.waitElementByXPath(SelfAssessmentLocators.ELMNT_DOWNLOAD_IMAGE);
			if (flag) {
				webDB.clickBtnByXPath(SelfAssessmentLocators.ELMNT_DOWNLOAD_IMAGE);
				Thread.sleep(750);
				webDB.clickBtnByXPath(SelfAssessmentLocators.ELMNT_DOWNLOAD_BTN);
				Thread.sleep(750);
				flag = webDB.waitElementByXPath(SelfAssessmentLocators.ELMNT_DOWNLOAD_LINK_SELF_REPORTED_DISCOMFORT);
			Thread.sleep(1500);
			}
		}
		return flag;
	}

	public boolean downloadDocumentForEquiRecommandations() throws IOException, InterruptedException {
		flag = webDB.waitElementByXPath(SelfAssessmentLocators.ELMNT_DOWNLOAD_LINK_EQUI_RECOMMENDATIONS);
		if (flag) {
			webDB.clickBtnByXPath(SelfAssessmentLocators.ELMNT_DOWNLOAD_LINK_EQUI_RECOMMENDATIONS);
			Thread.sleep(750);
			flag = webDB.waitElementByXPath(SelfAssessmentLocators.ELMNT_DOWNLOAD_DOCUMENT);
			if (flag) {
				webDB.clickBtnByXPath(SelfAssessmentLocators.ELMNT_DOWNLOAD_DOCUMENT);
				Thread.sleep(750);
				webDB.clickBtnByXPath(SelfAssessmentLocators.ELMNT_DOWNLOAD_BTN);
				Thread.sleep(750);
				flag = webDB.waitElementByXPath(SelfAssessmentLocators.ELMNT_DOWNLOAD_LINK_EQUI_RECOMMENDATIONS);
				Thread.sleep(1500);
			}
		}
		return flag;
	}

	public boolean downloadImageForEquiRecommandations() throws IOException, InterruptedException {
		flag = webDB.waitElementByXPath(SelfAssessmentLocators.ELMNT_DOWNLOAD_LINK_EQUI_RECOMMENDATIONS);
		if (flag) {
			webDB.clickBtnByXPath(SelfAssessmentLocators.ELMNT_DOWNLOAD_LINK_EQUI_RECOMMENDATIONS);
			Thread.sleep(750);
			flag = webDB.waitElementByXPath(SelfAssessmentLocators.ELMNT_DOWNLOAD_IMAGE);
			if (flag) {
				webDB.clickBtnByXPath(SelfAssessmentLocators.ELMNT_DOWNLOAD_IMAGE);
				Thread.sleep(750);
				webDB.clickBtnByXPath(SelfAssessmentLocators.ELMNT_DOWNLOAD_BTN);
				Thread.sleep(750);
				flag = webDB.waitElementByXPath(SelfAssessmentLocators.ELMNT_DOWNLOAD_LINK_EQUI_RECOMMENDATIONS);
				Thread.sleep(1500);
			}
		}
		return flag;
	}

	public boolean downloadDocumentForTotalActivityRegion() throws IOException, InterruptedException {
		flag = webDB.waitElementByXPath(ProgramOverviewLocators.ELMNT_DOWNLOAD_LINK_TOTAL_ACTV_REGION);
		if (flag) {
			webDB.clickBtnByXPath(ProgramOverviewLocators.ELMNT_DOWNLOAD_LINK_TOTAL_ACTV_REGION);
			Thread.sleep(750);
			flag = webDB.waitElementByXPath(ProgramOverviewLocators.ELMNT_DOWNLOAD_DOCUMENT);
			if (flag) {
				webDB.clickBtnByXPath(ProgramOverviewLocators.ELMNT_DOWNLOAD_DOCUMENT);
				Thread.sleep(750);
				webDB.clickBtnByXPath(ProgramOverviewLocators.ELMNT_DOWNLOAD_BTN);
				Thread.sleep(750);
				flag = webDB.waitElementByXPath(ProgramOverviewLocators.ELMNT_DOWNLOAD_LINK_TOTAL_ACTV_REGION);
			}
		}
		return flag;
	}

	public boolean downloadImageForReasonForAssessment() throws IOException, InterruptedException {
		flag = webDB.waitElementByXPath(ProgramOverviewLocators.ELMNT_DOWNLOAD_LINK_REASON_ASSESSMENT);
		if (flag) {
			webDB.clickBtnByXPath(ProgramOverviewLocators.ELMNT_DOWNLOAD_LINK_REASON_ASSESSMENT);
			Thread.sleep(750);
			flag = webDB.waitElementByXPath(ProgramOverviewLocators.ELMNT_DOWNLOAD_IMAGE);
			if (flag) {
				webDB.clickBtnByXPath(ProgramOverviewLocators.ELMNT_DOWNLOAD_IMAGE);
				Thread.sleep(750);
				webDB.clickBtnByXPath(ProgramOverviewLocators.ELMNT_DOWNLOAD_BTN);
				Thread.sleep(750);
				flag = webDB.waitElementByXPath(ProgramOverviewLocators.ELMNT_DOWNLOAD_LINK_REASON_ASSESSMENT);
			}
		}
		return flag;
	}

	public boolean downloadDocumentForReasonForAssessment() throws IOException, InterruptedException {
		flag = webDB.waitElementByXPath(ProgramOverviewLocators.ELMNT_DOWNLOAD_LINK_REASON_ASSESSMENT);
		if (flag) {
			webDB.clickBtnByXPath(ProgramOverviewLocators.ELMNT_DOWNLOAD_LINK_REASON_ASSESSMENT);
			Thread.sleep(750);
			flag = webDB.waitElementByXPath(ProgramOverviewLocators.ELMNT_DOWNLOAD_DOCUMENT);
			if (flag) {
				webDB.clickBtnByXPath(ProgramOverviewLocators.ELMNT_DOWNLOAD_DOCUMENT);
				Thread.sleep(750);
				webDB.clickBtnByXPath(ProgramOverviewLocators.ELMNT_DOWNLOAD_BTN);
				Thread.sleep(750);
				flag = webDB.waitElementByXPath(ProgramOverviewLocators.ELMNT_DOWNLOAD_LINK_REASON_ASSESSMENT);
			}
		}
		return flag;
	}

	public boolean downloadImageForWorkAreaAssessed() throws IOException, InterruptedException {
		webDB.scrolldown(300);
		Thread.sleep(750);
		flag = webDB.waitElementByXPath(SelfAssessmentLocators.ELMNT_DOWNLOAD_LINK_WORK_AREA_ASSESSED);
		if (flag) {
			webDB.clickBtnByXPath(SelfAssessmentLocators.ELMNT_DOWNLOAD_LINK_WORK_AREA_ASSESSED);
			Thread.sleep(750);
			flag = webDB.waitElementByXPath(SelfAssessmentLocators.ELMNT_DOWNLOAD_IMAGE);
			if (flag) {
				webDB.clickBtnByXPath(SelfAssessmentLocators.ELMNT_DOWNLOAD_IMAGE);
				Thread.sleep(750);
				webDB.clickBtnByXPath(SelfAssessmentLocators.ELMNT_DOWNLOAD_BTN);
				Thread.sleep(750);
				flag = webDB.waitElementByXPath(SelfAssessmentLocators.ELMNT_DOWNLOAD_LINK_WORK_AREA_ASSESSED);
			}
		}
		return flag;
	}

	public boolean downloadDocumentForWorkAreaAssessed() throws IOException, InterruptedException {
		flag = webDB.waitElementByXPath(SelfAssessmentLocators.ELMNT_DOWNLOAD_LINK_WORK_AREA_ASSESSED);
		if (flag) {
			webDB.clickBtnByXPath(SelfAssessmentLocators.ELMNT_DOWNLOAD_LINK_WORK_AREA_ASSESSED);
			Thread.sleep(750);
			flag = webDB.waitElementByXPath(SelfAssessmentLocators.ELMNT_DOWNLOAD_DOCUMENT);
			if (flag) {
				webDB.clickBtnByXPath(SelfAssessmentLocators.ELMNT_DOWNLOAD_DOCUMENT);
				Thread.sleep(750);
				webDB.clickBtnByXPath(SelfAssessmentLocators.ELMNT_DOWNLOAD_BTN);
				Thread.sleep(750);
				flag = webDB.waitElementByXPath(SelfAssessmentLocators.ELMNT_DOWNLOAD_LINK_WORK_AREA_ASSESSED);
			}
		}
		return flag;
	}

	public boolean downloadImagePercentageFromSelfAssessmentActivityByRegion()
			throws IOException, InterruptedException {
		Thread.sleep(4500);
		flag = webDB.waitElementByXPath(SelfAssessmentLocators.ELMNT_DOWNLOAD_LINK_SA_ACTIVITY_REGION);
		if (flag) {
			webDB.clickBtnByXPath(SelfAssessmentLocators.ELMNT_DOWNLOAD_LINK_SA_ACTIVITY_REGION);
			Thread.sleep(750);
			flag = webDB.waitElementByXPath(SelfAssessmentLocators.ELMNT_DOWNLOAD_IMAGE);
			if (flag) {
				webDB.clickBtnByXPath(SelfAssessmentLocators.ELMNT_DOWNLOAD_IMAGE);
				Thread.sleep(750);
				webDB.clickBtnByXPath(SelfAssessmentLocators.ELMNT_DOWNLOAD_BTN);
				Thread.sleep(750);
				flag = webDB.waitElementByXPath(SelfAssessmentLocators.ELMNT_DOWNLOAD_LINK_SA_ACTIVITY_REGION);
			}
		}
		return flag;
	}

	public boolean downloadDocumentPercentageFromSelfAssessmentActivityByRegion()
			throws IOException, InterruptedException {
		Thread.sleep(1500);
		flag = webDB.waitElementByXPath(SelfAssessmentLocators.ELMNT_DOWNLOAD_LINK_SA_ACTIVITY_REGION);
		if (flag) {
			webDB.clickBtnByXPath(SelfAssessmentLocators.ELMNT_DOWNLOAD_LINK_SA_ACTIVITY_REGION);
			Thread.sleep(750);
			flag = webDB.waitElementByXPath(SelfAssessmentLocators.ELMNT_DOWNLOAD_DOCUMENT);
			if (flag) {
				webDB.clickBtnByXPath(SelfAssessmentLocators.ELMNT_DOWNLOAD_DOCUMENT);
				Thread.sleep(750);
				webDB.clickBtnByXPath(SelfAssessmentLocators.ELMNT_DOWNLOAD_BTN);
				Thread.sleep(750);
				flag = webDB.waitElementByXPath(SelfAssessmentLocators.ELMNT_DOWNLOAD_LINK_SA_ACTIVITY_REGION);
			}
		}
		return flag;
	}

	public boolean downloadImageHashFromSelfAssessmentActivityByRegion() throws IOException, InterruptedException {
		Thread.sleep(1000);
		flag = webDB.waitElementByXPath(SelfAssessmentLocators.ELMNT_SA_ACTIVITY_REGION_HASH_OPTION);
		if (flag) {
			webDB.clickBtnByXPath(SelfAssessmentLocators.ELMNT_SA_ACTIVITY_REGION_HASH_OPTION);
			Thread.sleep(750);
			flag = webDB.waitElementByXPath(SelfAssessmentLocators.ELMNT_DOWNLOAD_LINK_SA_ACTIVITY_REGION);
			if (flag) {
				webDB.clickBtnByXPath(SelfAssessmentLocators.ELMNT_DOWNLOAD_LINK_SA_ACTIVITY_REGION);
				Thread.sleep(750);
				flag = webDB.waitElementByXPath(SelfAssessmentLocators.ELMNT_DOWNLOAD_IMAGE);
				if (flag) {
					webDB.clickBtnByXPath(SelfAssessmentLocators.ELMNT_DOWNLOAD_IMAGE);
					Thread.sleep(750);
					webDB.clickBtnByXPath(SelfAssessmentLocators.ELMNT_DOWNLOAD_BTN);
					Thread.sleep(750);
					flag = webDB.waitElementByXPath(SelfAssessmentLocators.ELMNT_DOWNLOAD_LINK_SA_ACTIVITY_REGION);
				}
			}
		}
		return flag;
	}
	

	public boolean downloadDocumentHashFromSelfAssessmentActivityByRegion() throws IOException, InterruptedException {
		Thread.sleep(1000);
		flag = webDB.waitElementByXPath(SelfAssessmentLocators.ELMNT_SA_ACTIVITY_REGION_HASH_OPTION);
		if (flag) {
			webDB.clickBtnByXPath(SelfAssessmentLocators.ELMNT_SA_ACTIVITY_REGION_HASH_OPTION);
			Thread.sleep(750);
			flag = webDB.waitElementByXPath(SelfAssessmentLocators.ELMNT_DOWNLOAD_LINK_SA_ACTIVITY_REGION);
			if (flag) {
				webDB.clickBtnByXPath(SelfAssessmentLocators.ELMNT_DOWNLOAD_LINK_SA_ACTIVITY_REGION);
				Thread.sleep(750);
				flag = webDB.waitElementByXPath(SelfAssessmentLocators.ELMNT_DOWNLOAD_DOCUMENT);
				if (flag) {
					webDB.clickBtnByXPath(SelfAssessmentLocators.ELMNT_DOWNLOAD_DOCUMENT);
					Thread.sleep(750);
					webDB.clickBtnByXPath(SelfAssessmentLocators.ELMNT_DOWNLOAD_BTN);
					Thread.sleep(750);
					flag = webDB.waitElementByXPath(SelfAssessmentLocators.ELMNT_DOWNLOAD_LINK_SA_ACTIVITY_REGION);
				}
			}
		}
		return flag;
	}

	public boolean downloadImageForSelfReportedComfortLevels() throws IOException, InterruptedException {
		Thread.sleep(1000);
		flag = webDB.waitElementByXPath(SelfAssessmentLocators.ELMNT_DOWNLOAD_LINK_SELF_REPORTED_COMFORT_LEVELS);
		if (flag) {
			webDB.clickBtnByXPath(SelfAssessmentLocators.ELMNT_DOWNLOAD_LINK_SELF_REPORTED_COMFORT_LEVELS);
			Thread.sleep(750);
			flag = webDB.waitElementByXPath(SelfAssessmentLocators.ELMNT_DOWNLOAD_IMAGE);
			if (flag) {
				webDB.clickBtnByXPath(SelfAssessmentLocators.ELMNT_DOWNLOAD_IMAGE);
				Thread.sleep(750);
				webDB.clickBtnByXPath(SelfAssessmentLocators.ELMNT_DOWNLOAD_BTN);
				Thread.sleep(750);
				flag = webDB
						.waitElementByXPath(SelfAssessmentLocators.ELMNT_DOWNLOAD_LINK_SELF_REPORTED_COMFORT_LEVELS);
			}
		}
		return flag;
	}

	public boolean downloadDocumentForSelfReportedComfortLevels() throws IOException, InterruptedException {
		Thread.sleep(1000);
		flag = webDB.waitElementByXPath(SelfAssessmentLocators.ELMNT_DOWNLOAD_LINK_SELF_REPORTED_COMFORT_LEVELS);
		if (flag) {
			webDB.clickBtnByXPath(SelfAssessmentLocators.ELMNT_DOWNLOAD_LINK_SELF_REPORTED_COMFORT_LEVELS);
			Thread.sleep(750);
			flag = webDB.waitElementByXPath(SelfAssessmentLocators.ELMNT_DOWNLOAD_DOCUMENT);
			if (flag) {
				webDB.clickBtnByXPath(SelfAssessmentLocators.ELMNT_DOWNLOAD_DOCUMENT);
				Thread.sleep(750);
				webDB.clickBtnByXPath(SelfAssessmentLocators.ELMNT_DOWNLOAD_BTN);
				Thread.sleep(750);
				flag = webDB
						.waitElementByXPath(SelfAssessmentLocators.ELMNT_DOWNLOAD_LINK_SELF_REPORTED_COMFORT_LEVELS);
			}
		}
		return flag;
	}

	public boolean selectHashOptionForEVAL() throws IOException, InterruptedException {
		Thread.sleep(1000);
		flag = webDB.waitElementByXPath(ProgramOverviewLocators.ELMNT_EVAL_HASH_OPTION);
		if (flag) {
			webDB.clickBtnByXPath(ProgramOverviewLocators.ELMNT_EVAL_HASH_OPTION);
			Thread.sleep(750);
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
		Thread.sleep(1000);
		flag = webDB.waitElementByXPath(ProgramOverviewLocators.ELMNT_SA_HASH_OPTION);
		if (flag) {
			webDB.clickBtnByXPath(ProgramOverviewLocators.ELMNT_SA_HASH_OPTION);
			Thread.sleep(750);
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
}
