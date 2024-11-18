package com.pbergo.locators;

public class AdminUserRoleLocators {

	/** Link Attribute: XPATH */
	public static final String ELMNT_ADD_USER_ROLE_BTN= "(//*[@class='btn btn_primary'])[2]";
	/** Link Attribute: XPATH */
	public static final String ELMNT_SEARCH_FLD = "(//*[@type='search'])[2]";
	/** Link Attribute: XPATH */
	public static final String ELMNT_USER_EDIT_LNK = "//div[@class='edit_btn']//a[1]";
	/** Link Attribute: XPATH */
	public static final String ELMNT_USER_DELETE_LNK = "//div[@class='edit_btn']//a[2]";
	
	
	
	/*Add User Role Page Locators*/
	/** Link Attribute: XPATH */
	public static final String ELMNT_ROLE_NAME_FLD= "(//*[@id='disabledTextInput'])[1]";
	/** Link Attribute: XPATH */
	public static final String ELMNT_DESCRIPTION_FLD= "(//*[@id='disabledTextInput'])[2]";
	/** Link Attribute: ID */
	public static final String ELMNT_USR_ROLE_VIEW_CHKBOX= "ac_ur_v";
	
	/** Link Attribute: XPATH */
	public static final String ELMNT_SAVE_BTN = "//button[@class='btn btn_primary']";
	/** Link Attribute: XPATH */
	public static final String ELMNT_CANCEL_BTN = "//button[@class='btn btn_outline ml_24']";
	
	//sorting
	/** Link Attribute: XPATH */
	public static final String USERROLENAME_COLUMNDATA_ONWHICHSORTINGAPPLIED= "//p[@class='role-permission']";
	/** Link Attribute: XPATH */
	public static final String USERROLENAME_COLUMNNAME_ONWHICHSORTINGAPPLIED= "(//th[@class='sort'])[1]/a";
	/** Link Attribute: XPATH */
	public static final String USERROLENAME_COLUMN_TOTALARROWCOUNT_ONWHICHSORTINGAPPLIED= "(//th[@class='sort'])[1]//div[@class='sortingicon']//img";
	/** Link Attribute: XPATH */
	public static final String USERROLENAME_COLUMN_UPARROW_ONWHICHSORTINGAPPLIED= "(//th[@class='sort'])[1]//div[@class='sortingicon']/img[@class='up-arrow']";
	/** Link Attribute: XPATH */
	public static final String USERROLENAME_COLUMN_DOWNARROW_ONWHICHSORTINGAPPLIED= "(//th[@class='sort'])[1]//div[@class='sortingicon']/img[@class='down-arrow']";
	
	
	/** Link Attribute: XPATH */
	public static final String DESCRIPTION_COLUMNDATA_ONWHICHSORTINGAPPLIED= "//p[@class='description_para']";
	/** Link Attribute: XPATH */
	public static final String DESCRIPTION_COLUMNNAME_ONWHICHSORTINGAPPLIED= "(//th[@class='sort'])[2]/a";
	/** Link Attribute: XPATH */
	public static final String DESCRIPTION_COLUMN_TOTALARROWCOUNT_ONWHICHSORTINGAPPLIED= "(//th[@class='sort'])[2]//div[@class='sortingicon']//img";
	/** Link Attribute: XPATH */
	public static final String DESCRIPTION_COLUMN_UPARROW_ONWHICHSORTINGAPPLIED= "(//th[@class='sort'])[2]//div[@class='sortingicon']/img[@class='up-arrow']";
	/** Link Attribute: XPATH */
	public static final String DESCRIPTION_COLUMN_DOWNARROW_ONWHICHSORTINGAPPLIED= "(//th[@class='sort'])[2]//div[@class='sortingicon']/img[@class='down-arrow']";
	
	
	
	
}
