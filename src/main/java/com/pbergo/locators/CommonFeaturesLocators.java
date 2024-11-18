package com.pbergo.locators;

public class CommonFeaturesLocators {
	/** Link Attribute: XPATH */
	public static final String FROM_DATE_CLICK = "(//div[@class= 'vdp-datepicker'])[1]";
	/** Link Attribute: XPATH */
	public static final String FROM_DATE_INPUT = "(//span[@class= 'prev'])[1]";
	/** Link Attribute: XPATH */
	public static final String FROM_DATE = "(//span[contains(text(), '18')])[1]";
	/** Link Attribute: XPATH */
	public static final String SORTING_ICON_FIRST_ROW = "(//div[@class = 'sortingicon'])[1]";
	/** Link Attribute: XPATH */
	public static final String SORTING_ICON_SECOND_ROW = "(//div[@class = 'sortingicon'])[2]";
	/** Link Attribute: XPATH */
	public static final String SORTING_TOTAL_BOX ="//select[@name ='datatable_length']";
	/** Link Attribute: XPATH */
	public static final String SORTING_TOTAL_BOX_VALUE ="//option[contains(text(), '500')]";

}
