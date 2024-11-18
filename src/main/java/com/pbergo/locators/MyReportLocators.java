package com.pbergo.locators;

public class MyReportLocators {
	
	/** Link Attribute: XPATH */
	public static final String MYREPORTS = "(//a[contains(text(), ' My Reports ')])[1]";
	/** Link Attribute: XPATH */
	public static final String DATEOFASSESSMENT = "((//table[@class='table table-bordered table dataTable no-footer'])[1]//tbody//tr//td)[1]";
	/** Link Attribute: XPATH */
	public static final String MYREPORTS_VIEW = "(//div[@class='edit_btn']//a//img)[1]";
	/** Link Attribute: XPATH */
	public static final String MYREPORTS_DOWNLOAD = "(//div[@class='edit_btn']//a//img)[2]";
	/** Link Attribute: XPATH */
	public static final String MYREPORTS_DOWNLOAD_PRINT_BTN = "//*[@id='sidebar']//print-preview-button-strip//div/cr-button[1]";
	/** Link Attribute: XPATH */
	public static final String MYREPORTS_DOWNLOAD_PDF = "//button[text()='Download as PDF']";
	/** Link Attribute: XPATH */
	public static final String MYREPORTS_DOWNLOAD_PDF_Text = "(//td[@class='tablemenu']/a)[1]";
	/** Link Attribute: XPATH */
	public static final String MYREPORTS_CURRENTREPORTSEARCHTEXT = "(((//table[@class='table table-bordered table dataTable no-footer'])[1]//tbody//tr)//td[4]/p)";
	/** Link Attribute: XPATH */
	public static final String MYREPORTS_CURRENTREPORTSEARCHINPUTFIELD = "(//input[@type='search'])[2]";
	/** Link Attribute: XPATH */
	public static final String MYREPORTS_EQUIPEMENTRECOMMENDATIONSEARCHTEXT = "(((//table[@class='table table-bordered table dataTable no-footer'])[2]//tbody//tr)[2]//td)[2]/p";
	/** Link Attribute: XPATH */
	public static final String MYREPORTS_EQUIPEMENTRECOMMENDATIONSEARCHINPUTFIELD = "(//input[@type='search'])[3]";
	/** Link Attribute: XPATH */
	public static final String MYREPORTS_EQUIPEMENTRECOMMENDATIONVIEWBTN = "((//table[@class='table table-bordered table dataTable no-footer'])[2]//tbody//tr//td//button//img)[1]";
	/** Link Attribute: XPATH */
	public static final String MYREPORTS_EQUIPEMENTRECOMMENDATIONCLOSEBTNBTN = "(//a[@class='modal_close'])[2]";
	/** Link Attribute: XPATH */
	public static final String MYREPORTS_RECOMMENDEDVIDEOS_CARDCOUNT = "//div[@style='width: 268px;']";
	/** Link Attribute: XPATH */
	public static final String MYREPORTS_RECOMMENDEDVIDEOS_NEXTARROW = "//div[@class='position-relative owl-slider custom_report_crousel']//div[@class='owl-next']";
	/** Link Attribute: XPATH */
	public static final String MYREPORTS_RECOMMENDEDVIDEOS_DISABLEDNEXTARROW = "//div[@class='position-relative owl-slider custom_report_crousel']//div[@class='owl-next disabled']";
	/** Link Attribute: XPATH */
	public static final String MYREPORTS_RECOMMENDEDVIDEOS_CARDIMAGE = "(//div[@class='first_section follow_ups recommneded_video']//div[@class='image'])[1]";
	

	

	
	

}
