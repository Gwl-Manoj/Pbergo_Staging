package com.pbergo.locators;

public class UsersLocators {

	
	/** Link Attribute: XPATH */
	public static final String ELMNT_USER_LEFT_HEADINFG = "(//ul[@class='nav flex-column']/li)[2]";
	/** Link Attribute: XPATH */
	public static final String ELMNT_ADD_NEW_USER_BTN = "//a[@href='/admin/add_user']";
	
	//ADD user form locators
	/** Link Attribute: XPATH */
	public static final String ELMNT_FirstNameField = "//input[@name='first_name']";
	/** Link Attribute: XPATH */
	public static final String ELMNT_LastNameField = "//input[@name='Last Name']";
	/** Link Attribute: XPATH */
	public static final String ELMNT_EmailField = "//input[@name='email']";
	/** Link Attribute: XPATH */
	public static final String ELMNT_PasswordField = "//input[@name='Password']";
	/** Link Attribute: XPATH */
	public static final String ELMNT_Userroles_Field = "//input[@placeholder='User Role']";
	/** Link Attribute: XPATH */
	public static final String ELMNT_Client = "//input[@placeholder='Client']";
	/** Link Attribute: XPATH */
	public static final String ELMNT_Client_Field = "//input[@placeholder='Client']";
	/** Link Attribute: XPATH */
	public static final String ELMNT_Region_Filed = "(//input[@placeholder='Region'])[2]";
	/** Link Attribute: XPATH */
	public static final String ELMNT_Client_DATA_ACCESS_CHKBOX = "//label[text()='Galaxy_QA_Client_Testing']";
	/** Link Attribute: XPATH */
	public static final String ELMNT_Client_DATA_ACCESS_1CHKBOX = "//input[@id='3']";
	/** Link Attribute: XPATH */
	public static final String ELMNT_SEND_USER_NOTIFICATION_CHKBOX = "//label[@for='flexCheckDefault']";
	/** Link Attribute: XPATH */
	public static final String ELMNT_ISACTIVE_CHKBOX = "//label[@for='flexCheckDefault1']";
	/** Link Attribute: XPATH */
	public static final String ELMNT_ADD_BTN = "//button[@class='btn btn_primary']";
	/** Link Attribute: XPATH */
	public static final String ELMNT_CANCEL_BTN = "//button[@class='btn btn_outline ml_24']";
	
	// Search Locators
	/** Link Attribute: XPATH */
	public static final String ELMNT_SEARCH_FIELD = "//input[@placeholder='Search']";
	
	// Edit locator
	/** Link Attribute: XPATH */
	public static final String ELMNT_EDIT_LINK = "//img[@class='edit-icon']";
	/** Link Attribute: XPATH */
	public static final String ELMNT_USER_ROLE_TEXT = "//div[@name='User Role']//span";
	
	
	
	//Delete Locator
	/** Link Attribute: XPATH */
	public static final String ELMNT_DELETE_LINK = "//a[@title='Delete']";
	/** Link Attribute: ID */
	public static final String ELMNT_DELETE_REASON_FIELD = "exampleInputEmail1";
	/** Link Attribute: XPATH */
	public static final String ELMNT_DELETE_YES_BTN = "//button[@class='btn btn_primary mr_10']";

	
	// sorting
	/** Link Attribute: XPATH */
	public static final String USERCUSTOMER_COLUMNDATA_ONWHICHSORTINGAPPLIED = "//div[@class='row']//table/tbody/tr/td[1]";
	/** Link Attribute: XPATH */
	public static final String USERCUSTOMER_COLUMNNAME_ONWHICHSORTINGAPPLIED = "(//th[@class='sort'])[1]/a";
	/** Link Attribute: XPATH */
	public static final String USERCUSTOMER_COLUMN_TOTALARROWCOUNT_ONWHICHSORTINGAPPLIED = "(//th[@class='sort'])[1]//div[@class='sortingicon']//img";
	/** Link Attribute: XPATH */
	public static final String USERCUSTOMER_COLUMN_UPARROW_ONWHICHSORTINGAPPLIED = "(//th[@class='sort'])[1]//div[@class='sortingicon']/img[@class='up-arrow']";
	/** Link Attribute: XPATH */
	public static final String USERCUSTOMER_COLUMN_DOWNARROW_ONWHICHSORTINGAPPLIED= "(//th[@class='sort'])[1]//div[@class='sortingicon']/img[@class='down-arrow']";
	
	/** Link Attribute: XPATH */
	public static final String USER_NAME_COLUMNDATA_ONWHICHSORTINGAPPLIED = "//div[@class='row']//table/tbody/tr/td[2]";
	/** Link Attribute: XPATH */
	public static final String USER_NAME_COLUMNNAME_ONWHICHSORTINGAPPLIED = "(//th[@class='sort'])[2]/a";
	/** Link Attribute: XPATH */
	public static final String USER_NAME_COLUMN_TOTALARROWCOUNT_ONWHICHSORTINGAPPLIED = "(//th[@class='sort'])[2]//div[@class='sortingicon']//img";
	/** Link Attribute: XPATH */
	public static final String USER_NAME_COLUMN_UPARROW_ONWHICHSORTINGAPPLIED = "(//th[@class='sort'])[2]//div[@class='sortingicon']/img[@class='up-arrow']";
	/** Link Attribute: XPATH */
	public static final String USER_NAME_COLUMN_DOWNARROW_ONWHICHSORTINGAPPLIED= "(//th[@class='sort'])[2]//div[@class='sortingicon']/img[@class='down-arrow']";
	
	/** Link Attribute: XPATH */
	public static final String USER_EMAIL_COLUMNDATA_ONWHICHSORTINGAPPLIED = "//div[@class='row']//table/tbody/tr/td[3]";
	/** Link Attribute: XPATH */
	public static final String USER_EMAIL_COLUMNNAME_ONWHICHSORTINGAPPLIED = "(//th[@class='sort'])[3]/a";
	/** Link Attribute: XPATH */
	public static final String USER_EMAIL_COLUMN_TOTALARROWCOUNT_ONWHICHSORTINGAPPLIED = "(//th[@class='sort'])[3]//div[@class='sortingicon']//img";
	/** Link Attribute: XPATH */
	public static final String USER_EMAIL_COLUMN_UPARROW_ONWHICHSORTINGAPPLIED = "(//th[@class='sort'])[3]//div[@class='sortingicon']/img[@class='up-arrow']";
	/** Link Attribute: XPATH */
	public static final String USER_EMAIL_COLUMN_DOWNARROW_ONWHICHSORTINGAPPLIED= "(//th[@class='sort'])[3]//div[@class='sortingicon']/img[@class='down-arrow']";
	
	
	/** Link Attribute: XPATH */
	public static final String USER_ROLE_COLUMNDATA_ONWHICHSORTINGAPPLIED = "//p[@class='role-permission']";
	/** Link Attribute: XPATH */
	public static final String USER_ROLE_COLUMNNAME_ONWHICHSORTINGAPPLIED = "(//th[@class='sort'])[4]/a";
	/** Link Attribute: XPATH */
	public static final String USER_ROLE_COLUMN_TOTALARROWCOUNT_ONWHICHSORTINGAPPLIED = "(//th[@class='sort'])[4]//div[@class='sortingicon']//img";
	/** Link Attribute: XPATH */
	public static final String USER_ROLE_COLUMN_UPARROW_ONWHICHSORTINGAPPLIED = "(//th[@class='sort'])[4]//div[@class='sortingicon']/img[@class='up-arrow']";
	/** Link Attribute: XPATH */
	public static final String USER_ROLE_COLUMN_DOWNARROW_ONWHICHSORTINGAPPLIED= "(//th[@class='sort'])[4]//div[@class='sortingicon']/img[@class='down-arrow']";
	
	/** Link Attribute: XPATH */
	public static final String USER_CREATEDDATE_COLUMNDATA_ONWHICHSORTINGAPPLIED = "//div[@class='row']//table/tbody/tr/td[5]";
	/** Link Attribute: XPATH */
	public static final String USER_CREATEDDATE_COLUMNNAME_ONWHICHSORTINGAPPLIED = "(//th[@class='sort created_date_col'])[1]/a";
	/** Link Attribute: XPATH */
	public static final String USER_CREATEDDATE_COLUMN_TOTALARROWCOUNT_ONWHICHSORTINGAPPLIED = "(//th[@class='sort created_date_col'])[1]//div[@class='sortingicon']//img";
	/** Link Attribute: XPATH */
	public static final String USER_CREATEDDATE_COLUMN_UPARROW_ONWHICHSORTINGAPPLIED = "(//th[@class='sort created_date_col'])[1]//div[@class='sortingicon']/img[@class='up-arrow']";
	/** Link Attribute: XPATH */
	public static final String USER_CREATEDDATE_COLUMN_DOWNARROW_ONWHICHSORTINGAPPLIED= "(//th[@class='sort created_date_col'])[1]//div[@class='sortingicon']/img[@class='down-arrow']";
	
	/** Link Attribute: XPATH */
	public static final String USER_ACTIVE_COLUMNDATA_ONWHICHSORTINGAPPLIED = "//div[@class='row']//table/tbody/tr/td[6]";
	/** Link Attribute: XPATH */
	public static final String USER_ACTIVE_COLUMNNAME_ONWHICHSORTINGAPPLIED = "(//th[@class='sort'])[5]/a";
	/** Link Attribute: XPATH */
	public static final String USER_ACTIVE_COLUMN_TOTALARROWCOUNT_ONWHICHSORTINGAPPLIED = "(//th[@class='sort'])[5]//div[@class='sortingicon']//img";
	/** Link Attribute: XPATH */
	public static final String USER_ACTIVE_COLUMN_UPARROW_ONWHICHSORTINGAPPLIED = "(//th[@class='sort'])[5]//div[@class='sortingicon']/img[@class='up-arrow']";
	/** Link Attribute: XPATH */
	public static final String USER_ACTIVE_COLUMN_DOWNARROW_ONWHICHSORTINGAPPLIED= "(//th[@class='sort'])[5]//div[@class='sortingicon']/img[@class='down-arrow']";
	/** Link Attribute: XPATH */
	public static final String USER_NAMEFIELD= "((//table[@class='table table-bordered table dataTable no-footer']//tbody/tr)[1]//td)[2]";
	
	
	
	
	
	
	
	
}
