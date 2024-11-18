package com.pbergo.locators;

public class AdminClientLocators {

	
	
	/** Link Attribute: XPATH */
	public static final String ELMNT_ADD_NEW_CLIENT_BTN = "//a[@href='/admin/add_client']";
	
	//ADD user form locators
	/** Link Attribute: NAME */
	public static final String ELMNT_COMPANYNAME_FIELD = "company_name";
	/** Link Attribute: NAME */
	public static final String ELMNT_COMPANYCODE_FIELD = "company_code";
	/** Link Attribute: XPATH */
	public static final String ELMNT_MANAGESELFASSESSMENT_FIELD = "//div[@name='self_assessment_button_status']//input";
	/** Link Attribute: XPATH */
	public static final String ELMNT_CLIENTTYPE_FIELD = "//div[@name='client_type']//input";
	/** Link Attribute: XPATH */
	public static final String ELMNT_CLIENTSTATUS_FIELD = "//div[@name='status']//input";
	/** Link Attribute: XPATH */
	public static final String ELMNT_FOLLOWUPSTATUS_FIELD = "//div[@name='followup_status']//input";
	/** Link Attribute: NAME */
	public static final String ELMNT_BANNERIMAGE_FIELD = "banner_image";
	/** Link Attribute: XPATH */
	public static final String ELMNT_PRIMARYCOLOR_FIELD = "(//input[@class='color-input'])[1]";
	/** Link Attribute: NAME */
	public static final String ELMNT_LOGO_FIELD = "logo_file";
	/** Link Attribute: XPATH */
	public static final String ELMNT_SECONDARYCOLOR_FIELD = "(//input[@class='color-input'])[2]";
	/** Link Attribute: NAME */
	public static final String ELMNT_BILLABLECOST_FIELD = "billablecost";
	/** Link Attribute: XPATH */
	public static final String ELMNT_REGION_FIELD = "(//div[@name='Region']//input)[2]";
	/** Link Attribute: XPATH */
	public static final String ELMNT_DEFAULTUSERROLE_FIELD = "//div[@name='default_user_role']//input";
	/** Link Attribute: XPATH */
	public static final String ELMNT_MYREPORTTYPE_FIELD = "//div[@name='report_type']//input";
	/** Link Attribute: ID */
	public static final String ELMNT_WORKFROMHOME_CHECKBOX = "work_from_home";
	/** Link Attribute: XPATH */
	public static final String ELMNT_WORKFROMHOME_CHECKBOXXPATH = "//input[@id='work_from_home']";
	
	/** Link Attribute: ID */
	public static final String ELMNT_WORKFROMHOMEICON_FIELD = "work_from_home_icon";
	/** Link Attribute: XPATH */
	public static final String ELMNT_FORMLINKS_HEADING = "//h4[text()='Form Links']";
	
	/** Link Attribute: NAME */
	public static final String ELMNT_SELFASSESMENTLINK_FIELD = "formlink_self_assessment";
	/** Link Attribute: NAME */
	public static final String ELMNT_ERGOEVALLINK_FIELD = "formlink_ergo_eval";
	/** Link Attribute: NAME */
	public static final String ELMNT_SCHEDULEREQUEST_FIELD = "formlink_schedule_request";
	/** Link Attribute: NAME */
	public static final String ELMNT_SELFASSESMENT_FOLLOWUPLINK_FIELD = "formlink_self_assesment_follow_up";
	/** Link Attribute: NAME */
	public static final String ELMNT_ERGOEVAL_FOLLOWUPLINK_FIELD = "formlink_ergo_eval_follow_up";
	/** Link Attribute: XPATH */
	public static final String ELMNT_ADD_BTN = "//button[@class='btn btn_primary']";
	
	// Search Locators
	/** Link Attribute: XPATH */
	public static final String ELMNT_SEARCH_FIELD = "//input[@placeholder='Search']";
	
	
	// Edit locator
	/** Link Attribute: XPATH */
	public static final String ELMNT_EDIT_LINK = "//img[@class='edit-icon']";
	/** Link Attribute: XPATH */
	public static final String ELMNT_EDIT_CLIENTTYPE_TEXT = "//div[@name='client_type']//span";
	
	
	
	//Delete Locator
	/** Link Attribute: XPATH */
	public static final String ELMNT_DELETE_LINK = "(//a[@title='Delete'])[1]";
	/** Link Attribute: ID */
	public static final String ELMNT_DELETE_REASON_FIELD = "exampleInputEmail1";
	/** Link Attribute: XPATH */
	public static final String ELMNT_DELETE_YES_BTN = "//button[@class='btn btn_primary mr_10']";

	// sorting
	/** Link Attribute: XPATH */
	public static final String CLIENT_CLIENTNAME_COLUMNDATA_ONWHICHSORTINGAPPLIED = "//div[@class='row']//table/tbody/tr/td[1]";
	/** Link Attribute: XPATH */
	public static final String CLIENT_CLIENTNAME_COLUMNNAME_ONWHICHSORTINGAPPLIED = "(//th[@class='sort'])[1]/a";
	/** Link Attribute: XPATH */
	public static final String CLIENT_CLIENTNAME_COLUMN_TOTALARROWCOUNT_ONWHICHSORTINGAPPLIED = "(//th[@class='sort'])[1]//div[@class='sortingicon']//img";
	/** Link Attribute: XPATH */
	public static final String CLIENT_CLIENTNAME_COLUMN_UPARROW_ONWHICHSORTINGAPPLIED = "(//th[@class='sort'])[1]//div[@class='sortingicon']/img[@class='up-arrow']";
	/** Link Attribute: XPATH */
	public static final String CLIENT_CLIENTNAME_COLUMN_DOWNARROW_ONWHICHSORTINGAPPLIED= "(//th[@class='sort'])[1]//div[@class='sortingicon']/img[@class='down-arrow']";
	
	/** Link Attribute: XPATH */
	public static final String CLIENT_CLIENTCODE_COLUMNDATA_ONWHICHSORTINGAPPLIED = "//div[@class='row']//table/tbody/tr/td[2]";
	/** Link Attribute: XPATH */
	public static final String CLIENT_CLIENTCODE_COLUMNNAME_ONWHICHSORTINGAPPLIED = "(//th[@class='sort'])[2]/a";
	/** Link Attribute: XPATH */
	public static final String CLIENT_CLIENTCODE_COLUMN_TOTALARROWCOUNT_ONWHICHSORTINGAPPLIED = "(//th[@class='sort'])[2]//div[@class='sortingicon']//img";
	/** Link Attribute: XPATH */
	public static final String CLIENT_CLIENTCODE_COLUMN_UPARROW_ONWHICHSORTINGAPPLIED = "(//th[@class='sort'])[2]//div[@class='sortingicon']/img[@class='up-arrow']";
	/** Link Attribute: XPATH */
	public static final String CLIENT_CLIENTCODE_COLUMN_DOWNARROW_ONWHICHSORTINGAPPLIED= "(//th[@class='sort'])[2]//div[@class='sortingicon']/img[@class='down-arrow']";
	
	/** Link Attribute: XPATH */
	public static final String CLIENT_STATUS_COLUMNDATA_ONWHICHSORTINGAPPLIED = "//div[@class='row']//table/tbody/tr/td[3]";
	/** Link Attribute: XPATH */
	public static final String CLIENT_STATUS_COLUMNNAME_ONWHICHSORTINGAPPLIED = "(//th[@class='sort'])[3]/a";
	/** Link Attribute: XPATH */
	public static final String CLIENT_STATUS_COLUMN_TOTALARROWCOUNT_ONWHICHSORTINGAPPLIED = "(//th[@class='sort'])[3]//div[@class='sortingicon']//img";
	/** Link Attribute: XPATH */
	public static final String CLIENT_STATUS_COLUMN_UPARROW_ONWHICHSORTINGAPPLIED = "(//th[@class='sort'])[3]//div[@class='sortingicon']/img[@class='up-arrow']";
	/** Link Attribute: XPATH */
	public static final String CLIENT_STATUS_COLUMN_DOWNARROW_ONWHICHSORTINGAPPLIED= "(//th[@class='sort'])[3]//div[@class='sortingicon']/img[@class='down-arrow']";
	
	/** Link Attribute: XPATH */
	public static final String CLIENT_CREATEDDATE_COLUMNDATA_ONWHICHSORTINGAPPLIED = "//div[@class='row']//table/tbody/tr/td[4]";
	/** Link Attribute: XPATH */
	public static final String CLIENT_CREATEDDATE_COLUMNNAME_ONWHICHSORTINGAPPLIED = "(//th[@class='sort date_of_created'])[1]/a";
	/** Link Attribute: XPATH */
	public static final String CLIENT_CREATEDDATE_COLUMN_TOTALARROWCOUNT_ONWHICHSORTINGAPPLIED = "(//th[@class='sort date_of_created'])[1]//div[@class='sortingicon']//img";
	/** Link Attribute: XPATH */
	public static final String CLIENT_CREATEDDATE_COLUMN_UPARROW_ONWHICHSORTINGAPPLIED = "(//th[@class='sort date_of_created'])[1]//div[@class='sortingicon']/img[@class='up-arrow']";
	/** Link Attribute: XPATH */
	public static final String CLIENT_CREATEDDATE_COLUMN_DOWNARROW_ONWHICHSORTINGAPPLIED= "(//th[@class='sort date_of_created'])[1]//div[@class='sortingicon']/img[@class='down-arrow']";
	
	
	
	
	
	
	
	
}
