package com.pbergo.locators;

public class PMRequestLocators {
	/** Link Attribute: XPATH */
	public static final String REQUEST = "(//a[contains(text(), ' Requests ')])[1]";
	/** Link Attribute: XPATH */
	public static final String REQUEST_SEARCH = "(//label[@class= 'float-none']//input)[1]";
	/** Link Attribute: XPATH */
	public static final String REQUEST_SEARCH_DATA = "(//table[@class= 'table table-bordered table dataTable no-footer']//tbody//tr//td)[2]//p";
	/** Link Attribute: XPATH */
	public static final String REQUEST_SEARCH_DATA_COMPLETE = "(//div[@class= 'edit_btn']//a)[1]";
	/** Link Attribute: XPATH */
	public static final String REQUEST_SEARCH_DATA_COMPLETE_BTN = "(//span[@class= 'ok-btn btn btn_primary'])[1]";
	/** Link Attribute: XPATH */
	public static final String REQUEST_SEARCH_DATA_DATASET = "(//div[@class= 'edit_btn']//a)[2]";
	/** Link Attribute: XPATH */
	public static final String REQUEST_SEARCH_DATA_HISTORY = "(//div[@class= 'edit_btn']//a)[3]";
	/** Link Attribute: XPATH */
	public static final String REQUEST_SEARCH_DATA_HISTORY_SEARCH_DATA_VIEW_DOWNLOAD = "//a[@class= 'ml_12 xl_download']";
	/** Link Attribute: XPATH */
	public static final String REQUEST_SEARCH_DATA_HISTORY_SEARCH_DATA_VIEW_CLOSE = "(//button[@class= 'btn-close'])[1]";
	/** Link Attribute: XPATH */
	public static final String REQUEST_SEARCH_DATA_HISTORY_CLOSE = "(//button[@class= 'btn-close'])[2]";
	/** Link Attribute: XPATH */
	public static final String REPORTS_SEARCH_DATA_COMMENT_TOAST = "//p[@class= 'v-toast__text']";
	
	
	public static final String REQUEST_SEARCH_DATA_COMPLETE_TXT ="Status updated Complete successfully.";
	
	/** Link Attribute: XPATH */
	public static final String DATEOFEVAL_COLUMNDATA_ONWHICHSORTINGAPPLIED = "//div[@class='row']//table/tbody/tr/td[2]";
	/** Link Attribute: XPATH */
	public static final String DATEOFEVAL_COLUMNNAME_ONWHICHSORTINGAPPLIED = "(//th[@class='sort req_to_req_on'])[1]/a";
	/** Link Attribute: XPATH */
	public static final String DATEOFEVAL_COLUMN_TOTALARROWCOUNT_ONWHICHSORTINGAPPLIED = "(//th[@class='sort req_to_req_on'])[1]//div[@class='sortingicon']//img";
	/** Link Attribute: XPATH */
	public static final String DATEOFEVAL_COLUMN_UPARROW_ONWHICHSORTINGAPPLIED = "(//th[@class='sort req_to_req_on'])[1]//div[@class='sortingicon']/img[@class='up-arrow']";
	/** Link Attribute: XPATH */
	public static final String DATEOFEVAL_COLUMN_DOWNARROW_ONWHICHSORTINGAPPLIED = "(//th[@class='sort req_to_req_on'])[1]//div[@class='sortingicon']/img[@class='down-arrow']";
	
	
	/** Link Attribute: XPATH */
	public static final String FIRSTNAME_COLUMNDATA_ONWHICHSORTINGAPPLIED = "//div[@class='row']//table/tbody/tr/td[3]";
	/** Link Attribute: XPATH */
	public static final String FIRSTNAME_COLUMNNAME_ONWHICHSORTINGAPPLIED = "(//th[@class='sort req_to_name'])[1]/a";
	/** Link Attribute: XPATH */
	public static final String FIRSTNAME_COLUMN_TOTALARROWCOUNT_ONWHICHSORTINGAPPLIED = "(//th[@class='sort req_to_name'])[1]//div[@class='sortingicon']//img";
	/** Link Attribute: XPATH */
	public static final String FIRSTNAME_COLUMN_UPARROW_ONWHICHSORTINGAPPLIED = "(//th[@class='sort req_to_name'])[1]//div[@class='sortingicon']/img[@class='up-arrow']";
	/** Link Attribute: XPATH */
	public static final String FIRSTNAME_COLUMN_DOWNARROW_ONWHICHSORTINGAPPLIED = "(//th[@class='sort req_to_name'])[1]//div[@class='sortingicon']/img[@class='down-arrow']";
	
	/** Link Attribute: XPATH */
	public static final String LASTNAME_COLUMNDATA_ONWHICHSORTINGAPPLIED = "//div[@class='row']//table/tbody/tr/td[4]";
	/** Link Attribute: XPATH */
	public static final String LASTNAME_COLUMNNAME_ONWHICHSORTINGAPPLIED = "(//th[@class='sort req_to_name'])[2]/a";
	/** Link Attribute: XPATH */
	public static final String LASTNAME_COLUMN_TOTALARROWCOUNT_ONWHICHSORTINGAPPLIED = "(//th[@class='sort req_to_name'])[2]//div[@class='sortingicon']//img";
	/** Link Attribute: XPATH */
	public static final String LASTNAME_COLUMN_UPARROW_ONWHICHSORTINGAPPLIED = "(//th[@class='sort req_to_name'])[2]//div[@class='sortingicon']/img[@class='up-arrow']";
	/** Link Attribute: XPATH */
	public static final String LASTNAME_COLUMN_DOWNARROW_ONWHICHSORTINGAPPLIED = "(//th[@class='sort req_to_name'])[2]//div[@class='sortingicon']/img[@class='down-arrow']";
	
	/** Link Attribute: XPATH */
	public static final String EMAILADDRESS_COLUMNDATA_ONWHICHSORTINGAPPLIED = "//div[@class='row']//table/tbody/tr/td[5]";
	/** Link Attribute: XPATH */
	public static final String EMAILADDRESS_COLUMNNAME_ONWHICHSORTINGAPPLIED = "(//th[@class='sort req_to_email'])/a";
	/** Link Attribute: XPATH */
	public static final String EMAILADDRESS_COLUMN_TOTALARROWCOUNT_ONWHICHSORTINGAPPLIED = "(//th[@class='sort req_to_email'])//div[@class='sortingicon']//img";
	/** Link Attribute: XPATH */
	public static final String EMAILADDRESS_COLUMN_UPARROW_ONWHICHSORTINGAPPLIED = "(//th[@class='sort req_to_email'])//div[@class='sortingicon']/img[@class='up-arrow']";
	/** Link Attribute: XPATH */
	public static final String EMAILADDRESS_COLUMN_DOWNARROW_ONWHICHSORTINGAPPLIED = "(//th[@class='sort req_to_email'])//div[@class='sortingicon']/img[@class='down-arrow']";
	
	/** Link Attribute: XPATH */
	public static final String STATUS_COLUMNDATA_ONWHICHSORTINGAPPLIED = "//div[@class='row']//table/tbody/tr/td[6]";
	/** Link Attribute: XPATH */
	public static final String STATUS_COLUMNNAME_ONWHICHSORTINGAPPLIED = "(//th[@class='sort sml_status req_status move_icon'])/a";
	/** Link Attribute: XPATH */
	public static final String STATUS_COLUMN_TOTALARROWCOUNT_ONWHICHSORTINGAPPLIED = "(//th[@class='sort sml_status req_status move_icon'])[1]//div[@class='sortingicon']//img";
	/** Link Attribute: XPATH */
	public static final String STATUS_COLUMN_UPARROW_ONWHICHSORTINGAPPLIED = "(//th[@class='sort sml_status req_status move_icon'])[1]//div[@class='sortingicon']/img[@class='up-arrow']";
	/** Link Attribute: XPATH */
	public static final String STATUS_COLUMN_DOWNARROW_ONWHICHSORTINGAPPLIED = "(//th[@class='sort sml_status req_status move_icon'])[1]//div[@class='sortingicon']/img[@class='down-arrow']";
	
}
