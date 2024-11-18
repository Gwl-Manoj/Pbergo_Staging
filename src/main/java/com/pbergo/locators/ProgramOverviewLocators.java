package com.pbergo.locators;

public class ProgramOverviewLocators {
	
	
	public static final String ELMNT_PROGRAMOVERVIEW_LEFTSIDEPANEL = "(//a[text()=' Program Overview '])[1]";

	/** Link Attribute: XPATH */
	public static final String ELMNT_BY_REGION = "(//input[@placeholder=\"By Region\"])[1]";
	/** Link Attribute: ID */
	public static final String ELMNT_CURRENT_OPTION = "allpercent-tabSite";
	/**option Attribute: ID*/
	public static final String ELMNT_YTD_OPTION = "hash-tabSite";
	/**option Attribute: ID*/
	public static final String ELMNT_EVAL_HASH_OPTION = "hash-tabMitiSite";
	public static final String ELMNT_SA_HASH_OPTION = "hash-tabMitiSelf";
	public static final String ELMNT_ACTIVITY_REGION_HASH_OPTION = "hash-tab2";
	/**option Attribute: ID*/
	public static final String ELMNT_EVAL_PERCENT_OPTION = "percent-tabMitiSite";
	
	public static final String ELMNT_EVAL_USD_NUMBER = "//div[@id='hashMitiSite']//h3";
	public static final String ELMNT_SA_USD_NUMBER = "//div[@id='hashMitiSelf']//h3";
	public static final String ELMNT_EVAL_USD = "(//h2[@class='miti_cost move_usd']//strong)[1]";
	public static final String ELMNT_SA_USD = "(//h2[@class='miti_cost move_usd']//strong)[2]";
	/** Link Attribute: XPATH */
	public static final String ELMNT_DOWNLOAD_LINK_SITE_REGISTRANTS = "(//div[@class='align-items-center d-flex justify-content-end']//a)[1]";
	/** Link Attribute: XPATH */
	public static final String ELMNT_DOWNLOAD_LINK_TOTAL_ACTV_REGION = "//div[@class='d-flex justify-content-end']//a";
	/** Link Attribute: XPATH */
	public static final String ELMNT_DOWNLOAD_LINK_REASON_ASSESSMENT = "//div[@class='m-auto']//a";
	/** Link Attribute: XPATH */
	public static final String ELMNT_DOWNLOAD_LINK_WORK_AREA_ASSESSMENT = "//div[@class='col-4 col-sm-4 align-self-center text-end']//a";
	
	/** Link Attribute: XPATH */
	public static final String Pagination = "(//p[@class='float-lg-start text-sm-center'])[1]";
	
	public static final String ELMNT_DOWNLOAD_DOCUMENT = "(//div[@class='col-md-3'])[1]//a";
	public static final String ELMNT_DOWNLOAD_IMAGE = "(//div[@class='col-md-3'])[2]//a";
	public static final String ELMNT_DOWNLOAD_BTN = "//*[@class='btn btn_primary sml_download']";
	public static final String ELMNT_CANCEL_BTN = "//*[@class='btn btn_primary_light mr_30']";
	public static final String ELMNT_CROSS_BTN = "//*[@class='btn-close']";
	public static final String ELMNT_NO_DATA_FOUND = "//h2[@class='no_data']";
	
}
