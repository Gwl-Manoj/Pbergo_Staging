/**
 * 
 */
package com.pbergo.base;

import java.awt.AWTException;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author Galaxy Web Links
 * @Project: Bildsy Web
 * @AutomationEngineer: Ravish Soni
 * @Date: November 07, 2021
 */
public interface CommonMethods {

	void tearDown();

	void getBack();

	/**
	 * @param className
	 * @param value
	 */
	void selectOptionByValue(String className, String value);

	/**
	 * This method is used to wait the element through Locator: ID
	 * 
	 * @param element
	 * @param flag
	 * @return
	 * @throws IOException
	 */
	boolean waitElementByID(String element) throws IOException;

	/**
	 * @param element
	 * @throws IOException
	 */
	void clickBtnByID(String element) throws IOException;

	/**
	 * @param element
	 * @param text
	 * @throws IOException
	 */
	void sendTextByID(String element, String text) throws IOException;

	/**
	 * @param element
	 * @param keys
	 * @throws IOException
	 */
	void sendTextByID(String element, Keys keys) throws IOException;

	/**
	 * @param element
	 * @param text
	 * @throws IOException
	 */
	void sendTextByXPath(String element, String text) throws IOException;

	/**
	 * @param element
	 * @param text
	 * @throws IOException
	 */
	void sendTextByCssSelector(String element, String text) throws IOException;

	/**
	 * @param element
	 * @throws IOException
	 */
	void tabToNextFieldByID(String element) throws IOException;

	/**
	 * @param element
	 * @throws IOException
	 */
	void tabToNextFieldByCSS(String element) throws IOException;

	/**
	 * @param element
	 * @throws IOException
	 */
	public void tabToNextFieldByXPath(String element) throws IOException;

	/**
	 * @param text
	 * @return
	 */
	String getTextByID(String text);

	/**
	 * @param element
	 * @param flag
	 * @return
	 * @throws IOException
	 */
	boolean waitElementByXPath(String element) throws IOException;

	/**
	 * This method is used to wait the invisibility of element by Locator: XPath
	 * 
	 * @param element
	 * @param flag
	 * @return
	 * @throws IOException
	 */
	boolean waitInvisibilityOfElementByXPath(String element, boolean flag) throws IOException;

	/**
	 * @param element
	 * @return
	 */
	int countingSizeByXPath(String element);

	/**
	 * @param element
	 * @return
	 */
	int countingSizeByID(String element);

	/**
	 * @param text
	 */
	void clickByText(String text);

	/**
	 * @param text
	 */
	void clickBtnByXPath(String text);

	/**
	 * @param text
	 * @return
	 */
	String getTextByXPath(String text);

	/**
	 * @param element
	 * @param flag
	 * @return
	 * @throws IOException
	 */
	boolean waitElementByCssSelector(String element) throws IOException;

	/**
	 * This method is used to click the element through Locator: cssSelector
	 * 
	 * @param element
	 */
	void clickByCssSelector(String element);

	/**
	 * This method is used to click the Button through Locator: Name
	 * 
	 * @param element
	 * @throws IOException
	 */
	void clickBtnByName(String element) throws IOException;

	/**
	 * This method is used to Count the size of element through Locator: cssSelector
	 * 
	 * @param element
	 * @return
	 */
	int countingSizeByCssSelector(String element);

	/**
	 * This method is used to get the text through Locator: cssSelector.
	 * 
	 * @param text
	 * @return
	 */
	String getTextByCssSelector(String text);

	/**
	 * This method is used to get Page Title.
	 * 
	 * @return
	 */
	String getPageTitle();

	/**
	 * This method is used to refresh the Page
	 */
	void getPageRefresh();

	/**
	 * This method is used to wait to check the Element invisible through Locator:
	 * cssSelector
	 * 
	 * @param element
	 * @param flag
	 * @return
	 * @throws IOException
	 */
	boolean waitInvisibilityOfElementByCssSelector(String element, boolean flag) throws IOException;

	/**
	 * @param fileName
	 * @param sheetName
	 * @return
	 */
	Object[][] getExcelData(String fileName, String sheetName);

	// void elementCheck(String c);

	/**
	 * This method return the Current Year of the Calendar
	 * 
	 * @return
	 */
	int currentYear();

	/**
	 * This method is used to send the text through Locator: XPath.
	 * 
	 * @param element
	 * @param keys
	 * @throws IOException
	 */
	void sendTextByXpath(String element, Keys keys) throws IOException;

	/**
	 * This method is used to convert String into Integer Value
	 * 
	 * @param strngValue
	 * @return
	 */
	int convert(String strngValue);

	/**
	 * This method is used to clear the field through Locator: cssSelector.
	 * 
	 * @param element
	 */
	void clearFieldByCssSelector(String element);

	/**
	 * This method is used to clear the field through Locator: ID.
	 * 
	 * @param element
	 */
	void clearFieldByID(String element);

	/**
	 * This method is used to switch to the Parent Frame.
	 */
	void switchToParentiFrame();

	/**
	 * This method is used to switch to the Child Frame.
	 */
	void switchToChildiFrame();

	/**
	 * This method is used to switch from Child to Parent Frame.
	 */
	void switchFromChildToParentiFrame();

	/**
	 * This method is used to handle a single window
	 */
	String getwindowhandle();

	/**
	 * This method is used to handle multiple window
	 */
	Set<String> getwindowhandles();

	/**
	 * This method is used to switch to window
	 */
	void switchToWindow(String window);

	void scrolldown(int a) throws InterruptedException;

	void scrollToAnElement(String element) throws InterruptedException;

	void scrollRight(String element, int keyevent, int j) throws InterruptedException, AWTException;

	void test(String element) throws InterruptedException;

	/**
	 * @param element
	 * @param text
	 * @throws IOException
	 */
	void pressKeys(int keys) throws IOException, AWTException;

	void switchToiFrame(String element);

	boolean SwitchToWindowByIndex(int a);

	void testSortingFunctionality() throws InterruptedException;

	

	boolean NavigateTo(String url);

	boolean CloseCurremtWindow();

	
	boolean verifyPagination(String showingresultbottomelement, String nextbuttonelement, String allrowsintableelement) throws IOException, InterruptedException;
	
	boolean verifyAscendingOrderSortingFunctionality(String tablecolumndataonwhichsortingapplied, String tablecolumnnameonwhichsortingapplied,String totalarrowscount, String uparrowelement) throws InterruptedException;
	
	boolean verifyDecendingOrderSortingFunctionality(String tablecolumndataonwhichsortingapplied, String tablecolumnnameonwhichsortingapplied) throws InterruptedException;
	
	void selectOptionByText(String element, String value);	
	
	boolean verifyDateFilterFunctionality(String tabledaterowcolumnelements, String norecordsfoundElement) throws InterruptedException;


}
