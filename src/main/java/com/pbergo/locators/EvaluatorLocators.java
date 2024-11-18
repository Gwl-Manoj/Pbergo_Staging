package com.pbergo.locators;

public class EvaluatorLocators 
{
	/** Link Attribute: XPATH */
	public static final String ELMNT_EVALUATOR_LEFTSIDEPANEL = "(//a[text()=' Evaluator '])[1]";

	/** Link Attribute: XPATH */
	public static final String ELMNT_BY_REGION = "(//div[@name='Region'])[2]";
	/** Link Attribute: XPATH */
	public static final String ELMNT_PAGEHEADING = "//h2[text()='Evaluators']";
	/** Link Attribute: XPATH */
	public static final String ELMNT_REPORTSINREVIEW_SEARCHFIELD = "(//input[@placeholder='Search'])[2]";
	/** Link Attribute: XPATH */
	public static final String ELMNT_SEARCHFIELD = "(//input[@placeholder='Search'])[1]";
	/** Link Attribute: XPATH */
	public static final String ELMNT_REPORTSINREVIEW_EMAILID = "(//p[@class='email_tag']/a)";
	/** Link Attribute: XPATH */
	public static final String ELMNT_REPORTSINREVIEW_CHECKBOX = "//input[@id='flexCheckDefault0']";
	/** Link Attribute: XPATH */
	public static final String ELMNT_REPORTSINREVIEW_STATUSFILTER = "(//div[@class='vs__dropdown-toggle'])[4]";
	/** Link Attribute: XPATH */
	public static final String ELMNT_REPORTSINREVIEW_STATUSFILTEROPTIONS = "((//ul[@class='vs__dropdown-menu'])//li)";
	/** Link Attribute: XPATH */
	public static final String ELMNT_REPORTSINREVIEW_STATUS = "(((//table[@class='table table-bordered table dataTable no-footer'])[2]//tbody//tr)[1]//td)[7]";
	/** Link Attribute: XPATH */
	public static final String ELMNT_REPORTSINREVIEW_STATUS_UPDATEBTN = "//span[text()='Update']";
	/** Link Attribute: XPATH */
	public static final String ELMNT_REPORTSINREVIEW_DATASETBTN = "((((//table[@class='table table-bordered table dataTable no-footer'])[2]//tbody//tr)[1]//td)[8]//a)[1]";
	/** Link Attribute: XPATH */
	public static final String ELMNT_REPORTSINREVIEW_EDITSURVEYREPORTBTN = "((((//table[@class='table table-bordered table dataTable no-footer'])[2]//tbody//tr)[1]//td)[8]//a)[2]";
	/** Link Attribute: XPATH */
	public static final String ELMNT_REPORTSINREVIEW_ADDCOMMENTBTN = "((((//table[@class='table table-bordered table dataTable no-footer'])[2]//tbody//tr)[1]//td)[8]//a)[3]";
	/** Link Attribute: XPATH */
	public static final String ELMNT_REPORTSINREVIEW_HISTORYBTN = "((((//table[@class='table table-bordered table dataTable no-footer'])[2]//tbody//tr)[1]//td)[8]//a)[4]";
	/** Link Attribute: XPATH */
	public static final String ELMNT_REPORTSINREVIEW_DATASETDOWNLOADBTN = "//a[@class='ml_12 xl_download']";
	/** Link Attribute: XPATH */
	public static final String ELMNT_REPORTSINREVIEW_ADDCOMMENTINPUTFIELD = "//textarea[@class='form-control']";
	/** Link Attribute: XPATH */
	public static final String ELMNT_REPORTSINREVIEW_ADDCOMMENTBTNAFTERINPUT = "//button[text()=' Add Comment ']";
	/** Link Attribute: XPATH */
	public static final String ELMNT_REPORTSINREVIEW_COMMENTADDEDSUCCESSMSG = "//p[text()='Comment added successfully.']";
	/** Link Attribute: XPATH */
	public static final String ELMNT_REPORTSINREVIEW_DATASETCLOSEBTN = "(//button[@class='btn-close'])[1]";
	/** Link Attribute: XPATH */
	public static final String ELMNT_REPORTSINREVIEW_HISTORYHEADING = "(//h2[text()='Test comment'])[1]";
	/** Link Attribute: XPATH */
	public static final String ELMNT_REPORTSINREVIEW_HISTORYH2HEADING = "//h2[text()='History']";
	/** Link Attribute: XPATH */
	public static final String ELMNT_REPORTSINREVIEW_HISTORYCLOSEBTN = "(//button[@class='btn-close'])[3]";
	/** Link Attribute: XPATH */
	public static final String ELMNT_REPORTSINREVIEW_SURVEYNEXTBTN = "//input[@class='sg-button sg-next-button']";
	/** Link Attribute: XPATH */
	public static final String ELMNT_REPORTSINREVIEW_SURVEYSUCCESSMSG = "//div[@class='sg-instructions']";
	/** Link Attribute: XPATH */
	public static final String ELMNT_REPORTSINREVIEW_SEARCHINPUTFIELD = "//div[@id='datatable_filter']//input";
	/** Link Attribute: XPATH */
	public static final String ELMNT_REPORTSINREVIEW_SEARCHTEXT = "(//a[@class='hover_first_name']//p)";
	/** Link Attribute: XPATH */
	public static final String ELMNT_CLIENTVIEWBTN = "(//div[@class='edit_btn']//a)[1]";
	/** Link Attribute: XPATH */
	public static final String ELMNT_EMPLOYEESEARCHHEADING = "//h2[@class='Employee_head']";
	/** Link Attribute: id */
	public static final String ELMNT_EMPLOYEESUBMITBTN = "sg_SubmitButton";
	
	
	/** Link Attribute: XPATH */
	public static final String CLIENTNAME_COLUMNDATA_ONWHICHSORTINGAPPLIED = "(//div[@class='row']//table/tbody)[1]/tr/td[1]";
	/** Link Attribute: XPATH */
	public static final String CLIENTNAME_COLUMNNAME_ONWHICHSORTINGAPPLIED = "(//th[@class='sort client_name_evaluator'])/a";
	/** Link Attribute: XPATH */
	public static final String CLIENTNAME_COLUMN_TOTALARROWCOUNT_ONWHICHSORTINGAPPLIED = "(//th[@class='sort client_name_evaluator'])//div[@class='sortingicon']//img";
	/** Link Attribute: XPATH */
	public static final String CLIENTNAME_COLUMN_UPARROW_ONWHICHSORTINGAPPLIED = "(//th[@class='sort client_name_evaluator'])//div[@class='sortingicon']/img[@class='up-arrow']";
	/** Link Attribute: XPATH */
	public static final String CLIENTNAME_COLUMN_DOWNARROW_ONWHICHSORTINGAPPLIED = "(//th[@class='sort client_name_evaluator'])//div[@class='sortingicon']/img[@class='down-arrow']";
	
	/** Link Attribute: XPATH */
	public static final String STATUS_COLUMNDATA_ONWHICHSORTINGAPPLIED = "(//div[@class='row']//table/tbody)[1]/tr/td[3]";
	/** Link Attribute: XPATH */
	public static final String STATUS_COLUMNNAME_ONWHICHSORTINGAPPLIED = "(//th[@class='status_col_evaluator move_icon'])/a";
	/** Link Attribute: XPATH */
	public static final String STATUS_COLUMN_TOTALARROWCOUNT_ONWHICHSORTINGAPPLIED = "(//th[@class='status_col_evaluator move_icon'])[1]//div[@class='sortingicon']//img";
	/** Link Attribute: XPATH */
	public static final String STATUS_COLUMN_UPARROW_ONWHICHSORTINGAPPLIED = "(//th[@class='status_col_evaluator move_icon'])[1]//div[@class='sortingicon']/img[@class='up-arrow']";
	/** Link Attribute: XPATH */
	public static final String STATUS_COLUMN_DOWNARROW_ONWHICHSORTINGAPPLIED = "(//th[@class='status_col_evaluator move_icon'])[1]//div[@class='sortingicon']/img[@class='down-arrow']";
	
	/** Link Attribute: XPATH */
	public static final String DATEOFEVAL_COLUMNDATA_ONWHICHSORTINGAPPLIED = "(//div[@class='row']//table/tbody)[2]/tr/td[2]";
	/** Link Attribute: XPATH */
	public static final String DATEOFEVAL_COLUMNNAME_ONWHICHSORTINGAPPLIED = "(//th[@class='sort date_evaluator'])/a";
	/** Link Attribute: XPATH */
	public static final String DATEOFEVAL_COLUMN_TOTALARROWCOUNT_ONWHICHSORTINGAPPLIED = "(//th[@class='sort date_evaluator'])//div[@class='sortingicon']//img";
	/** Link Attribute: XPATH */
	public static final String DATEOFEVAL_COLUMN_UPARROW_ONWHICHSORTINGAPPLIED = "(//th[@class='sort date_evaluator'])//div[@class='sortingicon']/img[@class='up-arrow']";
	/** Link Attribute: XPATH */
	public static final String DATEOFEVAL_COLUMN_DOWNARROW_ONWHICHSORTINGAPPLIED = "(//th[@class='sort date_evaluator'])//div[@class='sortingicon']/img[@class='down-arrow']";
	
	/** Link Attribute: XPATH */
	public static final String FIRSTNAME_COLUMNDATA_ONWHICHSORTINGAPPLIED = "(//div[@class='row']//table/tbody)[2]/tr/td[3]";
	/** Link Attribute: XPATH */
	public static final String FIRSTNAME_COLUMNNAME_ONWHICHSORTINGAPPLIED = "(//th[@class='sort name_evaluator])[1]/a";
	/** Link Attribute: XPATH */
	public static final String FIRSTNAME_COLUMN_TOTALARROWCOUNT_ONWHICHSORTINGAPPLIED = "(//th[@class='sort name_evaluator'])[1]//div[@class='sortingicon']//img";
	/** Link Attribute: XPATH */
	public static final String FIRSTNAME_COLUMN_UPARROW_ONWHICHSORTINGAPPLIED = "(//th[@class='sort name_evaluator'])[1]//div[@class='sortingicon']/img[@class='up-arrow']";
	/** Link Attribute: XPATH */
	public static final String FIRSTNAME_COLUMN_DOWNARROW_ONWHICHSORTINGAPPLIED = "(//th[@class='sort name_evaluator'])[1]//div[@class='sortingicon']/img[@class='down-arrow']";
	
	/** Link Attribute: XPATH */
	public static final String LASTNAME_COLUMNDATA_ONWHICHSORTINGAPPLIED = "(//div[@class='row']//table/tbody)[2]/tr/td[4]";
	/** Link Attribute: XPATH */
	public static final String LASTNAME_COLUMNNAME_ONWHICHSORTINGAPPLIED = "(//th[@class='sort name_evaluator])[2]/a";
	/** Link Attribute: XPATH */
	public static final String LASTNAME_COLUMN_TOTALARROWCOUNT_ONWHICHSORTINGAPPLIED = "(//th[@class='sort name_evaluator'])[2]//div[@class='sortingicon']//img";
	/** Link Attribute: XPATH */
	public static final String LASTNAME_COLUMN_UPARROW_ONWHICHSORTINGAPPLIED = "(//th[@class='sort name_evaluator'])[2]//div[@class='sortingicon']/img[@class='up-arrow']";
	/** Link Attribute: XPATH */
	public static final String LASTNAME_COLUMN_DOWNARROW_ONWHICHSORTINGAPPLIED = "(//th[@class='sort name_evaluator'])[2]//div[@class='sortingicon']/img[@class='down-arrow']";
	
	/** Link Attribute: XPATH */
	public static final String EMAILADDRESS_COLUMNDATA_ONWHICHSORTINGAPPLIED = "(//div[@class='row']//table/tbody)[2]/tr/td[5]";
	/** Link Attribute: XPATH */
	public static final String EMAILADDRESS_COLUMNNAME_ONWHICHSORTINGAPPLIED = "(//th[@class='sort email_evaluator'])/a";
	/** Link Attribute: XPATH */
	public static final String EMAILADDRESS_COLUMN_TOTALARROWCOUNT_ONWHICHSORTINGAPPLIED = "(//th[@class='sort email_evaluator'])//div[@class='sortingicon']//img";
	/** Link Attribute: XPATH */
	public static final String EMAILADDRESS_COLUMN_UPARROW_ONWHICHSORTINGAPPLIED = "(//th[@class='sort email_evaluator'])//div[@class='sortingicon']/img[@class='up-arrow']";
	/** Link Attribute: XPATH */
	public static final String EMAILADDRESS_COLUMN_DOWNARROW_ONWHICHSORTINGAPPLIED = "(//th[@class='sort email_evaluator'])//div[@class='sortingicon']/img[@class='down-arrow']";
	
	/** Link Attribute: XPATH */
	public static final String CLIENT_COLUMNDATA_ONWHICHSORTINGAPPLIED = "(//div[@class='row']//table/tbody)[2]/tr/td[6]";
	/** Link Attribute: XPATH */
	public static final String CLIENT_COLUMNNAME_ONWHICHSORTINGAPPLIED = "(//th[@class='sort name_evaluator'])[3]/a";
	/** Link Attribute: XPATH */
	public static final String CLIENT_COLUMN_TOTALARROWCOUNT_ONWHICHSORTINGAPPLIED = "(//th[@class='sort name_evaluator'])[3]//div[@class='sortingicon']//img";
	/** Link Attribute: XPATH */
	public static final String CLIENT_COLUMN_UPARROW_ONWHICHSORTINGAPPLIED = "(//th[@class='sort name_evaluator'])[3]//div[@class='sortingicon']/img[@class='up-arrow']";
	/** Link Attribute: XPATH */
	public static final String CLIENT_COLUMN_DOWNARROW_ONWHICHSORTINGAPPLIED = "(//th[@class='sort name_evaluator'])[3]//div[@class='sortingicon']/img[@class='down-arrow']";
	
	/** Link Attribute: XPATH */
	public static final String STATUSRR_COLUMNDATA_ONWHICHSORTINGAPPLIED = "(//div[@class='row']//table/tbody)[2]/tr/td[7]";
	/** Link Attribute: XPATH */
	public static final String STATUSRR_COLUMNNAME_ONWHICHSORTINGAPPLIED = "(//th[@class='sort name_evaluator move_icon'])/a";
	/** Link Attribute: XPATH */
	public static final String STATUSRR_COLUMN_TOTALARROWCOUNT_ONWHICHSORTINGAPPLIED = "(//th[@class='sort name_evaluator move_icon'])//div[@class='sortingicon']//img";
	/** Link Attribute: XPATH */
	public static final String STATUSRR_COLUMN_UPARROW_ONWHICHSORTINGAPPLIED = "(//th[@class='sort name_evaluator move_icon'])//div[@class='sortingicon']/img[@class='up-arrow']";
	/** Link Attribute: XPATH */
	public static final String STATUSRR_COLUMN_DOWNARROW_ONWHICHSORTINGAPPLIED = "(//th[@class='sort name_evaluator move_icon'])//div[@class='sortingicon']/img[@class='down-arrow']";
	
	
	
	
	
	
		
	
}
