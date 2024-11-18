package com.pbergo.locators;

public class SelfAssessmentLocators {
	
	/** Link Attribute: XPATH */
	public static final String ELMNT_SELF_ASSESSMENT_LEFTSIDEPANEL = "//*[@id='sidebarMenu']//li[2]";
	/** Link Attribute: XPATH */
	public static final String ELMNT_NO_DATA_SA_ACTIVITY_REGION = "//div[@class='mapping SAActivityByRegionHeight']//*[@class='no_data']";
	/** Link Attribute: XPATH */
	public static final String ELMNT_NO_DATA_SELF_REPORTED_DISCOMFORT = "(//div[@class='white_card border_radius_20'])[1]//*[@class='no_data']";
	/** Link Attribute: XPATH */
	public static final String ELMNT_NO_DATA_EQUI_RECOMMENDATIONS = "(//div[@class='white_card border_radius_20'])[2]//*[@class='no_data']";
	
	/** Link Attribute: XPATH */
	public static final String ELMNT_DOWNLOAD_LINK_SA_ACTIVITY_REGION = "//div[@class='visited_pages align-items-baseline d-flex justify-content-end']//a";
	/** Link Attribute: XPATH */
	public static final String ELMNT_DOWNLOAD_LINK_SELF_REPORTED_DISCOMFORT = "(//*[@class='align-self-center ml_24'])[1]/a";
	/** Link Attribute: XPATH */
	public static final String ELMNT_DOWNLOAD_LINK_EQUI_RECOMMENDATIONS = "(//*[@class='align-self-center ml_24'])[2]/a";
	/** Link Attribute: XPATH */
	public static final String ELMNT_DOWNLOAD_LINK_WORK_AREA_ASSESSED = "(//*[@class='align-self-center ml_24'])[3]//a";
	/** Link Attribute: XPATH */
	public static final String ELMNT_DOWNLOAD_LINK_SELF_REPORTED_COMFORT_LEVELS = "//*[@class='align-self-center ml_24 left_mg']//a";
	
	
	/**option Attribute: Xpath*/
	public static final String ELMNT_SA_ACTIVITY_REGION_HASH_OPTION = "//button[@id='hash-tab2']";
	/**option Attribute: ID*/
	public static final String ELMNT_SA_ACTIVITY_REGION_PERCENT_OPTION = "//button[@id='percent-tab2']";
	
	/**option Attribute: Xpath*/
	public static final String ELMNT_EVAL_HASH_OPTION = "//button[@id='hash-tabMitiSite']";
	public static final String ELMNT_SA_HASH_OPTION = "//button[@id='hash-tabMitiSelf']";
	
	public static final String ELMNT_EVAL_USD = "(//*[@class='usd_rspns'])[1]";
	public static final String ELMNT_SA_USD = "(//*[@class='usd_rspns'])[2]";
	public static final String ELMNT_EVAL_USD_NUMBER = "(//*[@id=='hashMitiSite']//h3";
	public static final String ELMNT_SA_USD_NUMBER = "(//*[@id=='hashMitiSelf']//h3";
	
	
	
	
	
	public static final String ELMNT_DOWNLOAD_DOCUMENT = "(//div[@class='col-md-3'])[1]//a";
	public static final String ELMNT_DOWNLOAD_IMAGE = "(//div[@class='col-md-3'])[2]//a";
	public static final String ELMNT_DOWNLOAD_BTN = "//*[@class='btn btn_primary sml_download']";
	public static final String ELMNT_CANCEL_BTN = "//*[@class='btn btn_primary_light mr_30']";
	public static final String ELMNT_CROSS_BTN = "//*[@class='btn-close']";
}
