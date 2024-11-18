package com.pbergo.locators;

public class PMReportsLocators {
	/** Link Attribute: XPATH */
	public static final String REPORTS = "(//a[contains(text(), ' Reports ')])[1]";
	/** Link Attribute: XPATH */
	public static final String REPORTS_SEARCH = "(//label[@class= 'mb-0']//input)[1]";
	/** Link Attribute: XPATH */
	public static final String REPORTS_SEARCH_DATA = "(//table[@class= 'table table-bordered table dataTable no-footer']//tbody//tr//td)[6]";
	/** Link Attribute: XPATH */
	public static final String REPORTS_SEARCH_DATA_VIEW = "(//a[@title= 'Data Set'])[1]";
	/** Link Attribute: XPATH */
	public static final String REPORTS_SEARCH_DATA_EDIT = "(//a[@title='Edit Survey Report'])[1]";
	/** Link Attribute: XPATH */
	public static final String REPORTS_SEARCH_DATA_HISTORY = "(//div[@class= 'edit_btn']//a)[3]";
	/** Link Attribute: XPATH */
	public static final String REPORTS_SEARCH_DATA_COMMENT = "(//a[@title= 'Add Comment'])[1]";
	/** Link Attribute: XPATH */
	public static final String REPORTS_SEARCH_DATA_VIEW_DOWNLOAD = "//a[@class= 'ml_12 xl_download']";
	/** Link Attribute: XPATH */
	public static final String REPORTS_SEARCH_DATA_VIEW_CLOSE = "((//h2[text()= 'Data Set'])[1]//following::button)[1]";
	/** Link Attribute: XPATH */
	public static final String REPORTS_SEARCH_DATA_HISTORY_CLOSE = "((//h2[text()= 'History'])[1]//following::button)[1]";
	/** Link Attribute: XPATH */
	public static final String REPORTS_SEARCH_DATA_COMMENT_TXT_AREA = "(//textarea[@class= 'form-control'])";
	/** Link Attribute: XPATH */
	public static final String REPORTS_SEARCH_DATA_COMMENT_BTN = "//button[@class= 'btn btn_primary mr_10']";
	/** Link Attribute: XPATH */
	public static final String REPORTS_SEARCH_DATA_COMMENT_TOAST = "//p[@class= 'v-toast__text']";
	/** Link Attribute: XPATH */
	public static final String REPORTS_SEARCH_DOWNLOAD_POPUP = "//h2[contains(text(), 'Data Set')]";
	/** Link Attribute: XPATH */
	public static final String REPORTS_SEARCH_HISTORY_POPUP = "//h2[contains(text(), 'History')]";
	/** Link Attribute: XPATH */
	public static final String REPORTS_SEARCH_EDIT_NEXT_BTN = "(//input[@class= 'sg-button sg-next-button'])[1]";
	/** Link Attribute: XPATH */
	public static final String REPORTS_SEARCH_EDIT_SUBMIT_BTN = "(//input[@class= 'sg-button sg-submit-button'])[1]";
	/** Link Attribute: XPATH */
	public static final String REPORTS_SEARCH_EDIT_SUCCESS_MSG = "(//div[@class= 'sg-instructions'])[1]";
	
	
	public static final String REPORTS_SEARCH_DATA_COMMENT_TOAST_TXT ="Comment added successfully.";
	public static final String REPORTS_SEARCH_DATA_COMPLETE_TXT ="Status updated Complete successfully.";
	
	/** Link Attribute: XPATH */
	public static final String DATEOFEVAL_COLUMNDATA_ONWHICHSORTINGAPPLIED = "//div[@class='row']//table/tbody/tr/td[2]";
	/** Link Attribute: XPATH */
	public static final String DATEOFEVAL_COLUMNNAME_ONWHICHSORTINGAPPLIED = "(//th[@class='sort divi_DOE'])[1]/a";
	/** Link Attribute: XPATH */
	public static final String DATEOFEVAL_COLUMN_TOTALARROWCOUNT_ONWHICHSORTINGAPPLIED = "(//th[@class='sort divi_DOE'])[1]//div[@class='sortingicon']//img";
	/** Link Attribute: XPATH */
	public static final String DATEOFEVAL_COLUMN_UPARROW_ONWHICHSORTINGAPPLIED = "(//th[@class='sort divi_DOE'])[1]//div[@class='sortingicon']/img[@class='up-arrow']";
	/** Link Attribute: XPATH */
	public static final String DATEOFEVAL_COLUMN_DOWNARROW_ONWHICHSORTINGAPPLIED = "(//th[@class='sort divi_DOE'])[1]//div[@class='sortingicon']/img[@class='down-arrow']";
	
	/** Link Attribute: XPATH */
	public static final String CLIENTNAME_COLUMNDATA_ONWHICHSORTINGAPPLIED = "//div[@class='row']//table/tbody/tr/td[3]";
	/** Link Attribute: XPATH */
	public static final String CLIENTNAME_COLUMNNAME_ONWHICHSORTINGAPPLIED = "(//th[@class='sort equal_col'])[1]/a";
	/** Link Attribute: XPATH */
	public static final String CLIENTNAME_COLUMN_TOTALARROWCOUNT_ONWHICHSORTINGAPPLIED = "(//th[@class='sort equal_col'])[1]//div[@class='sortingicon']//img";
	/** Link Attribute: XPATH */
	public static final String CLIENTNAME_COLUMN_UPARROW_ONWHICHSORTINGAPPLIED = "(//th[@class='sort equal_col'])[1]//div[@class='sortingicon']/img[@class='up-arrow']";
	/** Link Attribute: XPATH */
	public static final String CLIENTNAME_COLUMN_DOWNARROW_ONWHICHSORTINGAPPLIED = "(//th[@class='sort equal_col'])[1]//div[@class='sortingicon']/img[@class='down-arrow']";
	
	/** Link Attribute: XPATH */
	public static final String FIRSTNAME_COLUMNDATA_ONWHICHSORTINGAPPLIED = "//div[@class='row']//table/tbody/tr/td[4]";
	/** Link Attribute: XPATH */
	public static final String FIRSTNAME_COLUMNNAME_ONWHICHSORTINGAPPLIED = "(//th[@class='sort equal_col'])[2]/a";
	/** Link Attribute: XPATH */
	public static final String FIRSTNAME_COLUMN_TOTALARROWCOUNT_ONWHICHSORTINGAPPLIED = "(//th[@class='sort equal_col'])[2]//div[@class='sortingicon']//img";
	/** Link Attribute: XPATH */
	public static final String FIRSTNAME_COLUMN_UPARROW_ONWHICHSORTINGAPPLIED = "(//th[@class='sort equal_col'])[2]//div[@class='sortingicon']/img[@class='up-arrow']";
	/** Link Attribute: XPATH */
	public static final String FIRSTNAME_COLUMN_DOWNARROW_ONWHICHSORTINGAPPLIED = "(//th[@class='sort equal_col'])[2]//div[@class='sortingicon']/img[@class='down-arrow']";
	
	/** Link Attribute: XPATH */
	public static final String LASTNAME_COLUMNDATA_ONWHICHSORTINGAPPLIED = "//div[@class='row']//table/tbody/tr/td[5]";
	/** Link Attribute: XPATH */
	public static final String LASTNAME_COLUMNNAME_ONWHICHSORTINGAPPLIED = "(//th[@class='sort equal_col'])[3]/a";
	/** Link Attribute: XPATH */
	public static final String LASTNAME_COLUMN_TOTALARROWCOUNT_ONWHICHSORTINGAPPLIED = "(//th[@class='sort equal_col'])[3]//div[@class='sortingicon']//img";
	/** Link Attribute: XPATH */
	public static final String LASTNAME_COLUMN_UPARROW_ONWHICHSORTINGAPPLIED = "(//th[@class='sort equal_col'])[3]//div[@class='sortingicon']/img[@class='up-arrow']";
	/** Link Attribute: XPATH */
	public static final String LASTNAME_COLUMN_DOWNARROW_ONWHICHSORTINGAPPLIED = "(//th[@class='sort equal_col'])[3]//div[@class='sortingicon']/img[@class='down-arrow']";
	
	/** Link Attribute: XPATH */
	public static final String EMAILADDRESS_COLUMNDATA_ONWHICHSORTINGAPPLIED = "//div[@class='row']//table/tbody/tr/td[6]";
	/** Link Attribute: XPATH */
	public static final String EMAILADDRESS_COLUMNNAME_ONWHICHSORTINGAPPLIED = "(//th[@class='sort col_to_email'])/a";
	/** Link Attribute: XPATH */
	public static final String EMAILADDRESS_COLUMN_TOTALARROWCOUNT_ONWHICHSORTINGAPPLIED = "(//th[@class='sort col_to_email'])//div[@class='sortingicon']//img";
	/** Link Attribute: XPATH */
	public static final String EMAILADDRESS_COLUMN_UPARROW_ONWHICHSORTINGAPPLIED = "(//th[@class='sort col_to_email'])//div[@class='sortingicon']/img[@class='up-arrow']";
	/** Link Attribute: XPATH */
	public static final String EMAILADDRESS_COLUMN_DOWNARROW_ONWHICHSORTINGAPPLIED = "(//th[@class='sort col_to_email'])//div[@class='sortingicon']/img[@class='down-arrow']";
	
	/** Link Attribute: XPATH */
	public static final String EVALUATOR_COLUMNDATA_ONWHICHSORTINGAPPLIED = "//div[@class='row']//table/tbody/tr/td[7]";
	/** Link Attribute: XPATH */
	public static final String EVALUATOR_COLUMNNAME_ONWHICHSORTINGAPPLIED = "(//th[@class='sort coloum_of_evaluaotr'])/a";
	/** Link Attribute: XPATH */
	public static final String EVALUATOR_COLUMN_TOTALARROWCOUNT_ONWHICHSORTINGAPPLIED = "(//th[@class='sort coloum_of_evaluaotr'])//div[@class='sortingicon']//img";
	/** Link Attribute: XPATH */
	public static final String EVALUATOR_COLUMN_UPARROW_ONWHICHSORTINGAPPLIED = "(//th[@class='sort coloum_of_evaluaotr'])//div[@class='sortingicon']/img[@class='up-arrow']";
	/** Link Attribute: XPATH */
	public static final String EVALUATOR_COLUMN_DOWNARROW_ONWHICHSORTINGAPPLIED = "(//th[@class='sort coloum_of_evaluaotr'])//div[@class='sortingicon']/img[@class='down-arrow']";
	
	/** Link Attribute: XPATH */
	public static final String STATUS_COLUMNDATA_ONWHICHSORTINGAPPLIED = "//div[@class='row']//table/tbody/tr/td[8]";
	/** Link Attribute: XPATH */
	public static final String STATUS_COLUMNNAME_ONWHICHSORTINGAPPLIED = "(//th[@class='sort col_to_ststus move_icon'])[1]/a";
	/** Link Attribute: XPATH */
	public static final String STATUS_COLUMN_TOTALARROWCOUNT_ONWHICHSORTINGAPPLIED = "(//th[@class='sort col_to_ststus move_icon'])[1]//div[@class='sortingicon']//img";
	/** Link Attribute: XPATH */
	public static final String STATUS_COLUMN_UPARROW_ONWHICHSORTINGAPPLIED = "(//th[@class='sort col_to_ststus move_icon'])[1]//div[@class='sortingicon']/img[@class='up-arrow']";
	/** Link Attribute: XPATH */
	public static final String STATUS_COLUMN_DOWNARROW_ONWHICHSORTINGAPPLIED = "(//th[@class='sort col_to_ststus move_icon'])[1]//div[@class='sortingicon']/img[@class='down-arrow']";
	

}
