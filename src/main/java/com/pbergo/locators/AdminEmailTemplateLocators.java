package com.pbergo.locators;

public class AdminEmailTemplateLocators {

	/** Link Attribute: XPATH */
	public static final String ELMNT_ADD_TEMPLATE_BTN = "(//*[@class='btn btn_primary'])[2]";
	/** Link Attribute: XPATH */
	public static final String ELMNT_SEARCH_FLD = "(//*[@type='search'])[2]";
	/** Link Attribute: XPATH */
	public static final String ELMNT_EMAIL_EDIT_LNK = "//div[@class='edit_btn']//a[2]";
	/** Link Attribute: XPATH */
	public static final String ELMNT_EMAIL_DELETE_LNK = "//div[@class='edit_btn']//a[4]";

	//Add Email Template Locators
	/** Link Attribute: XPATH */
	public static final String ELMNT_EMAIL_TEMPLATE_NAME_FLD = "(//*[@id='disabledTextInput'])[1]";
	/** Link Attribute: XPATH */
	public static final String ELMNT_SUBJECT_FLD = "(//*[@id='disabledTextInput'])[2]";
	/** Link Attribute: XPATH */
	public static final String ELMNT_CONTENT_FLD = "//div[@role='textbox']";
	/** Link Attribute: XPATH */
	public static final String ELMNT_CLIENT_FLD = "(//input[@class='vs__search'])[2]";
	/** Link Attribute: XPATH */
	public static final String ELMNT_TYPE_FLD = "(//input[@class='vs__search'])[3]";
	/** Link Attribute: XPATH */
	public static final String ELMNT_INCLUDE_CC_FLD = "(//input[@id='disabledTextInput'])[3]";
	/** Link Attribute: XPATH */
	public static final String ELMNT_ADD_NEW_BTN = "//button[@class='btn btn_primary']";
	/** Link Attribute: XPATH */
	public static final String ELMNT_CANCEL_BTN = "//button[@class='btn btn_outline ml_24']";

	// sorting
	/** Link Attribute: XPATH */
	public static final String EMAIL_TEMPLATENAME_COLUMNDATA_ONWHICHSORTINGAPPLIED = "//div[@class='row']//table/tbody/tr/td[1]";
	/** Link Attribute: XPATH */
	public static final String EMAIL_TEMPLATENAME_COLUMNNAME_ONWHICHSORTINGAPPLIED = "(//th[@class='sort'])[1]/a";
	/** Link Attribute: XPATH */
	public static final String EMAIL_TEMPLATENAME_COLUMN_TOTALARROWCOUNT_ONWHICHSORTINGAPPLIED = "(//th[@class='sort'])[1]//div[@class='sortingicon']//img";
	/** Link Attribute: XPATH */
	public static final String EMAIL_TEMPLATENAME_COLUMN_UPARROW_ONWHICHSORTINGAPPLIED = "(//th[@class='sort'])[1]//div[@class='sortingicon']/img[@class='up-arrow']";
	/** Link Attribute: XPATH */
	public static final String EMAIL_TEMPLATENAME_COLUMN_DOWNARROW_ONWHICHSORTINGAPPLIED= "(//th[@class='sort'])[1]//div[@class='sortingicon']/img[@class='down-arrow']";
	
	/** Link Attribute: XPATH */
	public static final String EMAIL_SUBJECT_COLUMNDATA_ONWHICHSORTINGAPPLIED = "//div[@class='row']//table/tbody/tr/td[2]";
	/** Link Attribute: XPATH */
	public static final String EMAIL_SUBJECT_COLUMNNAME_ONWHICHSORTINGAPPLIED = "(//th[@class='sort'])[2]/a";
	/** Link Attribute: XPATH */
	public static final String EMAIL_SUBJECT_COLUMN_TOTALARROWCOUNT_ONWHICHSORTINGAPPLIED = "(//th[@class='sort'])[2]//div[@class='sortingicon']//img";
	/** Link Attribute: XPATH */
	public static final String EMAIL_SUBJECT_COLUMN_UPARROW_ONWHICHSORTINGAPPLIED = "(//th[@class='sort'])[2]//div[@class='sortingicon']/img[@class='up-arrow']";
	/** Link Attribute: XPATH */
	public static final String EMAIL_SUBJECT_COLUMN_DOWNARROW_ONWHICHSORTINGAPPLIED= "(//th[@class='sort'])[2]//div[@class='sortingicon']/img[@class='down-arrow']";
	
	/** Link Attribute: XPATH */
	public static final String EMAIL_CLIENT_COLUMNDATA_ONWHICHSORTINGAPPLIED = "//div[@class='row']//table/tbody/tr/td[3]";
	/** Link Attribute: XPATH */
	public static final String EMAIL_CLIENT_COLUMNNAME_ONWHICHSORTINGAPPLIED = "(//th[@class='sort'])[3]/a";
	/** Link Attribute: XPATH */
	public static final String EMAIL_CLIENT_COLUMN_TOTALARROWCOUNT_ONWHICHSORTINGAPPLIED = "(//th[@class='sort'])[3]//div[@class='sortingicon']//img";
	/** Link Attribute: XPATH */
	public static final String EMAIL_CLIENT_COLUMN_UPARROW_ONWHICHSORTINGAPPLIED = "(//th[@class='sort'])[3]//div[@class='sortingicon']/img[@class='up-arrow']";
	/** Link Attribute: XPATH */
	public static final String EMAIL_CLIENT_COLUMN_DOWNARROW_ONWHICHSORTINGAPPLIED= "(//th[@class='sort'])[3]//div[@class='sortingicon']/img[@class='down-arrow']";
	
	
}
