package com.pbergo.locators;

public class EmployeeSearchLocators 
{
	/** Link Attribute: XPATH */
	public static final String EMPLOYEE_SEARCH = "(//a[contains(text(), ' Employee Search ')])[1]";
	/** Link Attribute: XPATH */
	public static final String EMPLOYEE_SEARCH_SEARCHBAR = "(//label[@class= 'mb-0']//input)[1]";
	/** Link Attribute: XPATH */
	public static final String EMPLOYEE_SEARCH_SEARCHBAR_DATA = "(//p[@class= 'email_tag'])";
	/** Link Attribute: XPATH */
	public static final String EMPLOYEE_SEARCH_SEARCHBAR_DATA_VIEW_BTN = "(//a[@title= 'View Employee'])[1]";
	/** Link Attribute: XPATH */
	public static final String EMPLOYEE_SEARCH_STATUS_DRPDWN = "(//span[@class= 'vs__selected'])[1]";
	/** Link Attribute: XPATH */
	public static final String EMPLOYEE_SEARCH_DOWNLOAD_ALL_BTN = "(//a[contains(text(), ' Download All ')])[1]";
	/** Link Attribute: XPATH */
	public static final String EMPLOYEE_SEARCH_DOWNLOAD_POPUP = "(//span[contains(text(), 'Download')])[1]";
	/** Link Attribute: XPATH */
	public static final String EMPLOYEE_SEARCH_CARD_BTN = "(//button[contains(text(), ' Card ')])[1]";
	/** Link Attribute: XPATH */
	public static final String EMPLOYEE_SEARCH_LIST_BTN = "(//button[contains(text(), ' List ')])[1]";
	/** Link Attribute: XPATH */
	public static final String EMPLOYEE_SEARCH_FILTER_ACTIVE_DATA = "(//p[@class= 'email_tag'])[1]";
	/** Link Attribute: XPATH */
	public static final String EMPLOYEE_SEARCH_FILTER_INACTIVE_DATA = "(//td[contains(text(), 'No Records found')])[1]";
	/** Link Attribute: XPATH */
	public static final String EMPLOYEE_SEARCH_SELF_ASSESSMENT_SEARCH = "(//div[@id= 'datatable_filter']//input)[1]";
	/** Link Attribute: XPATH */
	public static final String EMPLOYEE_SEARCH_ERGO_EVAL_SEARCH = "(//div[@id= 'datatable_filter']//input)[2]";
	/** Link Attribute: XPATH */
	public static final String EMPLOYEE_SEARCH_FOLLOW_UPS_SEARCH = "(//div[@id= 'datatable_filter']//input)[3]";
	/** Link Attribute: XPATH */
	public static final String EMPLOYEE_SEARCH_SCHDULE_REQUEST_FORM_SEARCH = "(//div[@id= 'datatable_filter']//input)[4]";
	/** Link Attribute: XPATH */
	public static final String EMPLOYEE_SEARCH_SELF_ASSESSMENT_NAME = "((//table[@class= 'table table-bordered table dataTable no-footer']//tbody//tr)[1]//td//p)[1]";
	/** Link Attribute: XPATH */
	public static final String EMPLOYEE_SEARCH_SELF_ASSESSMENT_DATASET = "(//div[@class= 'edit_btn']//a)[1]";
	/** Link Attribute: XPATH */
	public static final String EMPLOYEE_SEARCH_SELF_ASSESSMENT_SUMMARYREPORT = "(//div[@class= 'edit_btn']//a)[2]";
	/** Link Attribute: XPATH */
	public static final String EMPLOYEE_SEARCH_SELF_ASSESSMENT_HISTORY = "(//div[@class= 'edit_btn']//a)[3]";
	/** Link Attribute: XPATH */
	public static final String EMPLOYEE_SEARCH_SELF_ASSESSMENT_DOWNLOAD = "(//div[@class= 'edit_btn']//a)[4]";
	/** Link Attribute: XPATH */
	public static final String EMPLOYEE_SEARCH_SELF_ASSESSMENT_DATASET_DOWNLOAD = "//a[@class= 'ml_12 xl_download']";
	/** Link Attribute: XPATH */
	public static final String EMPLOYEE_SEARCH_SELF_ASSESSMENT_DATASET_DOWNLOAD_CLOSE = "(//button[@class= 'btn-close'])[1]";
	/** Link Attribute: XPATH */
	public static final String EMPLOYEE_SEARCH_SELF_ASSESSMENT_SUMMARYREPORT_TEXT = "";
	/** Link Attribute: XPATH */
	public static final String EMPLOYEE_SEARCH_SELF_ASSESSMENT_SUMMARYREPORT_DOWNLOAD_BTN = "";
	/** Link Attribute: XPATH */
	public static final String EMPLOYEE_SEARCH_SELF_ASSESSMENT_HISTORY_CLOSE = "((//h2[text()='History'])//following::button)[1]";
	/** Link Attribute: XPATH */
	public static final String EMPLOYEE_SEARCH_ERGO_EVALS_TEXT = "(//h3[@class = 'card_heading'])[2]";
	/** Link Attribute: XPATH */
	public static final String EMPLOYEE_SEARCH_ERGO_EVALS_SEARCH = "(//div[@class = 'dataTables_filter'])[2]//input";
	/** Link Attribute: XPATH */
	public static final String EMPLOYEE_SEARCH_ERGO_EVALS_NAME = "((//table[@class = 'table table-bordered table dataTable no-footer'])[2]//tbody//td//p)[1]";
	/** Link Attribute: XPATH */
	public static final String EMPLOYEE_SEARCH_ERGO_EVALS_DATASET = "(//table[@class='table table-bordered table dataTable no-footer'])[2]//a[@title='Data Set']";
	/** Link Attribute: XPATH */
	public static final String EMPLOYEE_SEARCH_ERGO_EVALS_HISTORY = "((//div[@class = 'edit_btn'])[3]//a)[3]";
	/** Link Attribute: XPATH */
	public static final String EMPLOYEE_SEARCH_ERGO_EVALS_DATASET_CLOSE = "(//button[@class = 'btn-close'])[1]";
	/** Link Attribute: XPATH */
	public static final String EMPLOYEE_SEARCH_ERGO_EVALS_DOWNLOAD_BTN = "//a[@class = 'ml_12 xl_download']";
	/** Link Attribute: XPATH */
	public static final String EMPLOYEE_SEARCH_ERGO_EVALS_HISTORY_CLOSE = "(//button[@class = 'btn-close'])[2]";
	/** Link Attribute: XPATH */
	public static final String EMPLOYEE_SEARCH_FOLLOW_UPS_TEXT = "(//h3[@class = 'card_heading'])[3]";
	/** Link Attribute: XPATH */
	public static final String EMPLOYEE_SEARCH_FOLLOW_UP_SEARCH = "(//div[@id='datatable_filter'])[3]//input";
	/** Link Attribute: XPATH */
	public static final String EMPLOYEE_SEARCH_FOLLOW_UPS_NAME = "((//table[@class='table table-bordered table dataTable no-footer'])[3]//tbody//td)[1]//p";
	/** Link Attribute: XPATH */
	public static final String EMPLOYEE_SEARCH_FOLLOW_UPS_DATASET = "(//table[@class='table table-bordered table dataTable no-footer'])[3]//a[@title='Data Set']";
	/** Link Attribute: XPATH */
	public static final String EMPLOYEE_SEARCH_FOLLOW_UPS_HISTORY = "((//div[@class='edit_btn follow_ml'])[1]//a)[2]";
	/** Link Attribute: XPATH */
	public static final String EMPLOYEE_SEARCH_FOLLOW_UPS_DATASET_CLOSE = "(//button[@class= 'btn-close'])[1]";
	/** Link Attribute: XPATH */
	public static final String EMPLOYEE_SEARCH_FOLLOW_UPS_DOWNLOAD_BTN = "(//a[@class='ml_12 xl_download'])";
	/** Link Attribute: XPATH */
	public static final String EMPLOYEE_SEARCH_FOLLOW_UPS_HISTORY_CLOSE = "(//button[@class= 'btn-close'])[2]";
	/** Link Attribute: XPATH */
	public static final String EMPLOYEE_SEARCH_SCHEDULE_REQUEST_FORM_TEXT = "(//h3[@class = 'card_heading'])[4]";
	/** Link Attribute: XPATH */
	public static final String EMPLOYEE_SEARCH_SCHEDULE_REQUEST_FORM_SEARCH = "(//div[@id='datatable_filter'])[4]//input";
	/** Link Attribute: XPATH */
	public static final String EMPLOYEE_SEARCH_SCHEDULE_REQUEST_FORM_NAME = "((//table[@class= 'table table-bordered table dataTable no-footer'])[4]//tbody//td//p)[1]";
	/** Link Attribute: XPATH */
	public static final String EMPLOYEE_SEARCH_SCHEDULE_REQUEST_FORM_DATASET = "(//table[@class='table table-bordered table dataTable no-footer'])[4]//a[@title='Data Set']";
	/** Link Attribute: XPATH */
	public static final String EMPLOYEE_SEARCH_SCHEDULE_REQUEST_FORM_HISTORY = "(//table[@class='table table-bordered table dataTable no-footer'])[4]//a[@title='History']";
	/** Link Attribute: XPATH */
	public static final String EMPLOYEE_SEARCH_SCHEDULE_REQUEST_FORM_DATASET_CLOSE = "(//button[@class= 'btn-close'])[1]";
	/** Link Attribute: XPATH */
	public static final String EMPLOYEE_SEARCH_SCHEDULE_REQUEST_FORM_DOWNLOAD_BTN = "(//a[@class='ml_12 xl_download'])";
	/** Link Attribute: XPATH */
	public static final String EMPLOYEE_SEARCH_SCHEDULE_REQUEST_FORM_HISTORY_CLOSE = "(//button[@class= 'btn-close'])[2]";
	
	// sorting
		/** Link Attribute: XPATH */
		public static final String REQUESTON_COLUMNDATA_ONWHICHSORTINGAPPLIED = "//div[@class='row']//table/tbody/tr/td[1]";
		/** Link Attribute: XPATH */
		public static final String REQUESTON_COLUMNNAME_ONWHICHSORTINGAPPLIED = "(//th[@class='sort req_sml'])[1]/a";
		/** Link Attribute: XPATH */
		public static final String REQUESTON_COLUMN_TOTALARROWCOUNT_ONWHICHSORTINGAPPLIED = "(//th[@class='sort req_sml'])[1]//div[@class='sortingicon']//img";
		/** Link Attribute: XPATH */
		public static final String REQUESTON_COLUMN_UPARROW_ONWHICHSORTINGAPPLIED = "(//th[@class='sort req_sml'])[1]//div[@class='sortingicon']/img[@class='up-arrow']";
		/** Link Attribute: XPATH */
		public static final String REQUESTON_COLUMN_DOWNARROW_ONWHICHSORTINGAPPLIED = "(//th[@class='sort req_sml'])[1]//div[@class='sortingicon']/img[@class='down-arrow']";

		/** Link Attribute: XPATH */
		public static final String FIRSTNAME_COLUMNDATA_ONWHICHSORTINGAPPLIED = "(//div[@class='row']//table/tbody)[1]/tr/td[1]";
		/** Link Attribute: XPATH */
		public static final String FIRSTNAME_COLUMNNAME_ONWHICHSORTINGAPPLIED = "(//th[@class='sort sml_n_last_first'])[1]/a";
		/** Link Attribute: XPATH */
		public static final String FIRSTNAME_COLUMN_TOTALARROWCOUNT_ONWHICHSORTINGAPPLIED = "(//th[@class='sort'])[1]//div[@class='sortingicon']//img";
		/** Link Attribute: XPATH */
		public static final String FIRSTNAME_COLUMN_UPARROW_ONWHICHSORTINGAPPLIED = "(//th[@class='sort'])[1]//div[@class='sortingicon']/img[@class='up-arrow']";
		/** Link Attribute: XPATH */
		public static final String FIRSTNAME_COLUMN_DOWNARROW_ONWHICHSORTINGAPPLIED = "(//th[@class='sort'])[1]//div[@class='sortingicon']/img[@class='down-arrow']";
		
		/** Link Attribute: XPATH */
		public static final String LASTNAME_COLUMNDATA_ONWHICHSORTINGAPPLIED = "(//div[@class='row']//table/tbody)[1]/tr/td[2]";
		/** Link Attribute: XPATH */
		public static final String LASTNAME_COLUMNNAME_ONWHICHSORTINGAPPLIED = "(//th[@class='sort sml_n_last_first'])[2]/a";
		/** Link Attribute: XPATH */
		public static final String LASTNAME_COLUMN_TOTALARROWCOUNT_ONWHICHSORTINGAPPLIED = "(//th[@class='sort'])[2]//div[@class='sortingicon']//img";
		/** Link Attribute: XPATH */
		public static final String LASTNAME_COLUMN_UPARROW_ONWHICHSORTINGAPPLIED = "(//th[@class='sort'])[2]//div[@class='sortingicon']/img[@class='up-arrow']";
		/** Link Attribute: XPATH */
		public static final String LASTNAME_COLUMN_DOWNARROW_ONWHICHSORTINGAPPLIED = "(//th[@class='sort'])[2]//div[@class='sortingicon']/img[@class='down-arrow']";
		
		/** Link Attribute: XPATH */
		public static final String EMAILADDRESS_COLUMNDATA_ONWHICHSORTINGAPPLIED = "(//div[@class='row']//table/tbody)[1]/tr/td[3]";
		/** Link Attribute: XPATH */
		public static final String EMAILADDRESS_COLUMNNAME_ONWHICHSORTINGAPPLIED = "(//th[@class='sort'])[1]/a";
		/** Link Attribute: XPATH */
		public static final String EMAILADDRESS_COLUMN_TOTALARROWCOUNT_ONWHICHSORTINGAPPLIED = "(//th[@class='sort pending_col'])//div[@class='sortingicon']//img";
		/** Link Attribute: XPATH */
		public static final String EMAILADDRESS_COLUMN_UPARROW_ONWHICHSORTINGAPPLIED = "(//th[@class='sort pending_col'])//div[@class='sortingicon']/img[@class='up-arrow']";
		/** Link Attribute: XPATH */
		public static final String EMAILADDRESS_COLUMN_DOWNARROW_ONWHICHSORTINGAPPLIED = "(//th[@class='sort pending_col'])//div[@class='sortingicon']/img[@class='down-arrow']";
		
		/** Link Attribute: XPATH */
		public static final String LOCATION_COLUMNDATA_ONWHICHSORTINGAPPLIED = "//div[@class='row']//table/tbody/tr/td[5]";
		/** Link Attribute: XPATH */
		public static final String LOCATION_COLUMNNAME_ONWHICHSORTINGAPPLIED = "(//th[@class='sort req_sml'])[2]/a";
		/** Link Attribute: XPATH */
		public static final String LOCATION_COLUMN_TOTALARROWCOUNT_ONWHICHSORTINGAPPLIED = "(//th[@class='sort req_sml'])[2]//div[@class='sortingicon']//img";
		/** Link Attribute: XPATH */
		public static final String LOCATION_COLUMN_UPARROW_ONWHICHSORTINGAPPLIED = "(//th[@class='sort req_sml'])[2]//div[@class='sortingicon']/img[@class='up-arrow']";
		/** Link Attribute: XPATH */
		public static final String LOCATION_COLUMN_DOWNARROW_ONWHICHSORTINGAPPLIED = "(//th[@class='sort req_sml'])[2]//div[@class='sortingicon']/img[@class='down-arrow']";
		
		/** Link Attribute: XPATH */
		public static final String COMFORT_COLUMNDATA_ONWHICHSORTINGAPPLIED = "//div[@class='row']//table/tbody/tr/td[6]";
		/** Link Attribute: XPATH */
		public static final String COMFORT_COLUMNNAME_ONWHICHSORTINGAPPLIED = "(//th[@class='sort sml_eval_col'])/a";
		/** Link Attribute: XPATH */
		public static final String COMFORT_COLUMN_TOTALARROWCOUNT_ONWHICHSORTINGAPPLIED = "(//th[@class='sort sml_eval_col'])//div[@class='sortingicon']//img";
		/** Link Attribute: XPATH */
		public static final String COMFORT_COLUMN_UPARROW_ONWHICHSORTINGAPPLIED = "(//th[@class='sort sml_eval_col'])//div[@class='sortingicon']/img[@class='up-arrow']";
		/** Link Attribute: XPATH */
		public static final String COMFORT_COLUMN_DOWNARROW_ONWHICHSORTINGAPPLIED = "(//th[@class='sort sml_eval_col'])//div[@class='sortingicon']/img[@class='down-arrow']";
		
		/** Link Attribute: XPATH */
		public static final String STATUS_COLUMNDATA_ONWHICHSORTINGAPPLIED = "//div[@class='row']//table/tbody/tr/td[7]";
		/** Link Attribute: XPATH */
		public static final String STATUS_COLUMNNAME_ONWHICHSORTINGAPPLIED = "(//th[@class='sort sml_eval_col move_icon'])/a";
		/** Link Attribute: XPATH */
		public static final String STATUS_COLUMN_TOTALARROWCOUNT_ONWHICHSORTINGAPPLIED = "(//th[@class='sort sml_eval_col move_icon'])//div[@class='sortingicon']//img";
		/** Link Attribute: XPATH */
		public static final String STATUS_COLUMN_UPARROW_ONWHICHSORTINGAPPLIED = "(//th[@class='sort sml_eval_col move_icon'])//div[@class='sortingicon']/img[@class='up-arrow']";
		/** Link Attribute: XPATH */
		public static final String STATUS_COLUMN_DOWNARROW_ONWHICHSORTINGAPPLIED = "(//th[@class='sort sml_eval_col move_icon'])//div[@class='sortingicon']/img[@class='down-arrow']";

		
		/** Link Attribute: XPATH */
		public static final String REGION_COLUMNDATA_ONWHICHSORTINGAPPLIED = "(//div[@class='row']//table/tbody)[1]/tr/td[4]";
		/** Link Attribute: XPATH */
		public static final String REGION_COLUMNNAME_ONWHICHSORTINGAPPLIED = "(//th[@class='sort sml_region'])[1]/a";
		/** Link Attribute: XPATH */
		public static final String REGION_COLUMN_TOTALARROWCOUNT_ONWHICHSORTINGAPPLIED = "(//th[@class='sort sml_region'])[1]//div[@class='sortingicon']//img";
		/** Link Attribute: XPATH */
		public static final String REGION_COLUMN_UPARROW_ONWHICHSORTINGAPPLIED = "(//th[@class='sort sml_region'])[1]//div[@class='sortingicon']/img[@class='up-arrow']";
		/** Link Attribute: XPATH */
		public static final String REGION_COLUMN_DOWNARROW_ONWHICHSORTINGAPPLIED = "(//th[@class='sort sml_region'])[1]//div[@class='sortingicon']/img[@class='down-arrow']";
		

}
