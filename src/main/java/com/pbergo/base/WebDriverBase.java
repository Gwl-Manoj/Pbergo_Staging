package com.pbergo.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Duration;

import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.swing.plaf.ScrollBarUI;

import org.apache.log4j.Logger;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.format.datetime.joda.LocalDateParser;
import org.springframework.format.datetime.joda.LocalDateTimeParser;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;



/**
 * @author Galaxy Web Links
 * @Project: PBErgo Web
 * @AutomationEngineer: Manoj
 * 
 */

public class WebDriverBase implements CommonMethods {
	private static WebDriver driver;
	private SoftAssert softAssert;
	private Assertion hardAssert;
	private SoftAssert sftAsrt;
	protected WebDriverWait wait;
	String platformName = System.getProperty("platformName");
	public static Logger log = null;
	private WebDriverManager wdm;
	File targetFolder;
	boolean flag;
	int recordsonpage = 0;
	static String startDateString;
	static String endDateString;
	String totalrecordscountstring;
//	int uparrowcount1;
	// boolean flag = false;

	private static final DateFormat sdf = new SimpleDateFormat("MMM dd, yyyy");
	private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMM dd, yyyy");

	String userName = System.getProperty("userName");
	String password = System.getProperty("password");
	String siteUrl = System.getProperty("url");

	public WebDriverBase() throws InterruptedException {
//		if (System.getProperty("platformName").equals("Firefox")
//				|| System.getProperty("platformName").equalsIgnoreCase("firefox")) {
////			WebDriverManager.firefoxdriver().setup();
//			WebDriverManager.firefoxdriver().clearDriverCache().setup();
//			driver = new FirefoxDriver();
//		} else if (System.getProperty("platformName").equals("chrome")
//				|| System.getProperty("platformName").equalsIgnoreCase("Chrome")) {
//			WebDriverManager.chromedriver().clearDriverCache().setup();
//			ChromeOptions chromeoptions = new ChromeOptions();
//			chromeoptions.addArguments("--start-maximized");
//			chromeoptions.addArguments("--remote-allow-origins=*");
//			
//
////			chromeoptions.setHeadless(true);
//			// wdm = WebDriverManager.chromedriver().watch();
//			// WebDriverManager.chromedriver().setup();
////			System.setProperty("webdriver.chrome.driver",
////					System.getProperty("user.dir") + File.separator + "drivers" + File.separator + "chromedriver.exe");
//			driver = new ChromeDriver(chromeoptions);
//			driver.manage().deleteAllCookies();
//			
//		} else if (System.getProperty("platformName").equals("edge")
//				|| System.getProperty("platformName").equalsIgnoreCase("Edge")) {
//			WebDriverManager.edgedriver().setup();
////			System.setProperty("webdriver.edge.driver", System.getProperty("user.dir") + File.separator + "drivers"
////					+ File.separator + "MicrosoftWebDriver.exe");
//			driver = new EdgeDriver();
//		}
//
//		softAssert = new SoftAssert();
//		hardAssert = new Assertion();
//		String waitTime = "4";
//		driver.manage().timeouts().implicitlyWait(Long.parseLong(waitTime), TimeUnit.SECONDS);
//		driver.manage().window().setPosition(new Point(0, 0));
//		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
//
//		// Explicit Wait + Expected Conditions
//		wait = new WebDriverWait(driver, 30);
//		driver.get(siteUrl);
//		Thread.sleep(2000);

//		driver = wdm.create();
//        targetFolder = new File(System.getProperty("user.dir") + "\\src\\test\\resources\\excutedscriptvideos\\"+createFolderWithDate()+"\\");
//		wdm.startRecording(date+".mp4");
	}

	public void openBrowser() throws InterruptedException {
		if (System.getProperty("platformName").equals("Firefox")
				|| System.getProperty("platformName").equalsIgnoreCase("firefox")) {
//			WebDriverManager.firefoxdriver().setup();
			WebDriverManager.firefoxdriver().clearDriverCache().setup();
			driver = new FirefoxDriver();
		} else if (System.getProperty("platformName").equals("chrome")
				|| System.getProperty("platformName").equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().clearDriverCache().setup();
			ChromeOptions chromeoptions = new ChromeOptions();
			chromeoptions.addArguments("--start-maximized");
			chromeoptions.addArguments("--remote-allow-origins=*");
			chromeoptions.setHeadless(false);
//			chromeoptions.setHeadless(true);
			// wdm = WebDriverManager.chromedriver().watch();
			// WebDriverManager.chromedriver().setup();
//			System.setProperty("webdriver.chrome.driver",
//					System.getProperty("user.dir") + File.separator + "drivers" + File.separator + "chromedriver.exe");
			driver = new ChromeDriver(chromeoptions);
			driver.manage().deleteAllCookies();

		} else if (System.getProperty("platformName").equals("edge")
				|| System.getProperty("platformName").equalsIgnoreCase("Edge")) {
			WebDriverManager.edgedriver().setup();
//			System.setProperty("webdriver.edge.driver", System.getProperty("user.dir") + File.separator + "drivers"
//					+ File.separator + "MicrosoftWebDriver.exe");
			driver = new EdgeDriver();
		}

		softAssert = new SoftAssert();
		hardAssert = new Assertion();
		String waitTime = "4";
		driver.manage().timeouts().implicitlyWait(Long.parseLong(waitTime), TimeUnit.SECONDS);
		driver.manage().window().setPosition(new Point(0, 0));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		// Explicit Wait + Expected Conditions
		wait = new WebDriverWait(driver, 30);
		driver.get(siteUrl);
		Thread.sleep(2000);
	}

//	public boolean verifyHelpPopUpWindowDisplayOrNot() {
//		if (countingSizeByID("tutorialButtonSkip") == 1) {
//			clickBtnByXPath(ContentsViewHelpTutorialLocators.ELMNT_SKIP_BTN);
//			flag = true;
//		} else {
//			flag = true;
//		}
//		return flag;
//	}

	/**
	 * This method is used to perform assertEquals of element Text by ID.
	 * 
	 * @param locators
	 * @param expectedMsg
	 */
	public void assertElementTextByID(String locators, String expectedMsg) {
		softAssert.assertEquals(this.getTextByID(locators), expectedMsg);
	}

	/**
	 * This method is used to call the assertAll method at the end of the method.
	 */
	public void assertAllElement() {
		softAssert.assertAll();
	}

	/**
	 * This method is used to check the alert is present or not on the page.
	 * 
	 * @return
	 */
	public boolean isAlertPresent() {
		try {
			// this.getScreenshot();
			this.driver.switchTo().alert().accept();
			return true;
		} // try
		catch (NoAlertPresentException noAlrtEx) {
			System.out.println("No Alert present.");
			return false;
		} // catch
	} // isAlertPresent()

	int countActive;

	public Actions actionDragAndDropByXPathUsingCoordinates(String elementSliderCircle, String elementSliderLine,
			int xCoord, int sliderLineWidth) {
		Actions act = new Actions(driver);
		act.clickAndHold(driver.findElement(By.xpath(elementSliderCircle)))
				.moveToElement(findOnlyElementByXPath(elementSliderCircle), sliderLineWidth, 0).release().perform();
		return act;
	}

	public int getXCoordinate(String element) {
		int xCoord = findOnlyElementByXPath(element).getLocation().getX();
		System.out.println("xCoord of GOTOPage" + xCoord);
		return xCoord;
	}

	public int getYCoordinate(String element) {
		int yCoord = findOnlyElementByXPath(element).getLocation().getY();
		return yCoord;
	}

	public int getWidthOfElementDimension(String element, int percentageNumber) {
		Dimension sliderLineSize = driver.findElement(By.xpath(element)).getSize();
		int width = (sliderLineSize.getWidth() * percentageNumber) / 100;
		System.out.println("width of Go To Page: " + width);
		return width;
	}

	/**
	 * This method is perform to move the element by XPath
	 * 
	 * @param element
	 * @return
	 * @throws IOException
	 */
	public Actions actionMoveToElementByXPath(String element) {
		Actions act = new Actions(driver);
		act.moveToElement(findOnlyElementByXPath(element)).perform();
		return act;
	}

	/**
	 * @param element
	 * @return
	 * @throws IOException
	 */
	public Actions actionMoveToElementByCssSelector(String element) {
		Actions actCssSel = new Actions(driver);
		actCssSel.moveToElement(driver.findElement(By.cssSelector(element))).perform();
		return actCssSel;
	}

	public Actions actionClickAnyWhere() {
		Actions actionsClick = new Actions(driver);
		actionsClick.click().build().perform();
		return actionsClick;
	}

	public Actions actionClickAnyWhere(int xCoordinate, int yCoordinate) {
		Actions actionsClick = new Actions(driver);
		actionsClick.moveByOffset(xCoordinate, yCoordinate).click().build().perform();
		return actionsClick;
	}

	public WebDriver passingWebDriverInstance(WebDriverBase driver) {
		return this.driver;
	}

	public WebElement findOnlyElementByXPath(String element) {
		WebElement ele = driver.findElement(By.xpath(element));
		return ele;
	}

	/**
	 * @param element
	 * @return
	 */
	public boolean checkLoaderByXPath(String element) {
		boolean checkLoader = driver.findElement(By.xpath(element)).isDisplayed();
		return checkLoader;
	}

	/**
	 * @param element
	 */
	public boolean checkLoaderByCssSelector(String element) {
		boolean checkLoaderCssSelector = driver.findElement(By.cssSelector(element)).isDisplayed();
		return checkLoaderCssSelector;
	}

	@Override
	public boolean waitElementByID(String element) throws IOException {
		try {
			this.wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(element)));
		} catch (Exception e) {
			Reporter.log("Element is not found in the page " + element + " Exception" + e, true);
			getScreenshot();
			return false;
		}
		return true;
	}

	/**
	 * Wait For an Element By XPath
	 * 
	 * @param element
	 * @throws IOException
	 */
	public boolean waitElementByXPath(String element) throws IOException {
		try {
			this.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(element)));
		} catch (Exception e) {
			Reporter.log("Element is not found in the page " + element + " Exception " + e, true);
			// getScreenshot(element);
			return false;
		}
		return true;
	}

	/**
	 * Wait For an Element By Name
	 * 
	 * @param element
	 * @throws IOException
	 */
	public boolean waitElementByName(String element) throws IOException {
		try {
			this.wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(element)));
		} catch (Exception e) {
			Reporter.log("Element is not found in the page " + element + " Exception " + e, true);
			// getScreenshot(element);
			return false;
		}
		return true;
	}

	@Override
	public boolean waitInvisibilityOfElementByXPath(String element, boolean flag) throws IOException {
		try {
			this.wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(element)));
		} catch (Exception e) {
			if (flag) {
				getScreenshot();
				Reporter.log("Element is not found in the page " + element + " Exception" + e, true);
			}
			return false;
		}
		return true;
	}

	@Override
	/**
	 * This method is used to perform waiting the invisibility of element through
	 * Locator: cssSelector and if exception occurs then get the screenshot.
	 * 
	 * @param element
	 * @param flag
	 * @return
	 * @throws IOException
	 */
	public boolean waitInvisibilityOfElementByCssSelector(String element, boolean flag) throws IOException {
		try {
			this.wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(element)));
		} catch (Exception e) {
			if (flag) {
				getScreenshot();
				Reporter.log("Element is not found in the page " + element + " Exception" + e, true);
			}
			return false;
		}
		return true;
	}

	@Override
	public void clearFieldByCssSelector(String element) {
		driver.findElement(By.cssSelector(element)).clear();
	}

	public void clearFieldByXpath(String element) {
		driver.findElement(By.xpath(element)).clear();
	}

	@Override
	public void switchToParentiFrame() {
		driver.switchTo().frame(0);
	}

	@Override
	public void switchToChildiFrame() {
		driver.switchTo().frame("mainContentIframe");
	}

	@Override
	public void switchFromChildToParentiFrame() {
		driver.switchTo().parentFrame();
	}

	public void switchToDefault() {
		driver.switchTo().defaultContent();
	}

//	public void switchToCreditCardNo() {
//		driver.switchTo().frame(MiraFitLocators.ELMNT_iFRAME_CARD_NO);
//	}
//
//	public void switchToExpirationDate() {
//		driver.switchTo().frame(MiraFitLocators.ELMNT_iFRAME_EXPIRATION_DATE);
//	}
//	
//	public void switchToCVV() {
//		driver.switchTo().frame(MiraFitLocators.ELMNT_iFRAME_CVV);
//	}

	@Override
	public void sendTextByXpath(String element, Keys keys) throws IOException {
		try {
			driver.findElement(By.xpath(element)).sendKeys(keys);
		} catch (Exception e) {
			Reporter.log("Unable to send the text " + element + " Exception " + e, true);
			getScreenshot();
		}
	}

	public void sendTextByName(String element, Keys keys) throws IOException {
		try {
			driver.findElement(By.name(element)).sendKeys(keys);
		} catch (Exception e) {
			Reporter.log("Unable to send the text " + element + " Exception " + e, true);
			getScreenshot();
		}
	}

	@Override
	public int convert(String strngValue) {
		int val = 0;
		try {
			val = Integer.parseInt(strngValue);
		} catch (NumberFormatException e) {

			System.out.println("Invalid String");
		}
		return val;
	}

	/**
	 * This method is used to clear the field's content through Locator: ID.
	 * 
	 * @param element
	 */
	@Override
	public void clearFieldByID(String element) {
		driver.findElement(By.id(element)).clear();
	}

	/**
	 * This method is used to swipe the page to element until it shows
	 * 
	 * @param elementName
	 * @locators cssSelector
	 */
	public void swipeToElement(String elementName) {
		RemoteWebElement element = (RemoteWebElement) driver.findElement(By.cssSelector(elementName));
		String elementID = element.getId();
		HashMap<String, String> scrollObject = new HashMap<String, String>();
		scrollObject.put("element", elementID);
		scrollObject.put("toVisible", "not an empty string");
		((JavascriptExecutor) driver).executeScript("window:scroll", scrollObject);
	}

	public void swipeToElementThrXPath(String elementName) {
		RemoteWebElement element = (RemoteWebElement) driver.findElement(By.xpath(elementName));
		String elementID = element.getId();
		HashMap<String, String> scrollObject = new HashMap<String, String>();
		scrollObject.put("element", elementID);
		scrollObject.put("toVisible", "not an empty string");
		((JavascriptExecutor) driver).executeScript("window:scroll", scrollObject);
	}

	/**
	 * This method is used to click the element through Locator: ID and get the
	 * screenshot if exception occurs.
	 * 
	 * @param element
	 * @throws IOException
	 */
	@Override
	public void clickBtnByID(String element) throws IOException {
		try {
			driver.findElement(By.id(element)).click();
			// Reporter.log("Clicked the element " + element, true);
		} catch (Exception e) {
			getScreenshot();
			Reporter.log("Unable to click the element in the page " + element + "Exception " + e, true);
		}
	}

	@Override
	public void clickBtnByName(String element) throws IOException {
		try {
			driver.findElement(By.name(element)).click();
			// Reporter.log("Clicked the element " + element, true);
		} catch (Exception e) {
			getScreenshot();
			Reporter.log("Unable to click the element in the page " + element + "Exception " + e, true);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.learningblox.learningbloxMaven.CommonMethods#sendTextByID(java.lang.
	 * String, java.lang.String)
	 */
	@Override
	public void sendTextByID(String element, String text) throws IOException {
		try {
			driver.findElement(By.id(element)).sendKeys(text);
		} catch (Exception e) {
			Reporter.log("Unable to send the text " + element + " Exception " + e, true);
			getScreenshot();
		}
	}

	@Override
	public void sendTextByCssSelector(String element, String text) throws IOException {
		try {
			driver.findElement(By.cssSelector(element)).sendKeys(text);
			// Reporter.log("Entered the text for the element " + element,
			// true);
		} catch (Exception e) {
			Reporter.log("Unable to send the text " + element + " Exception " + e, true);
			getScreenshot();
		}
	}

	/**
	 * @param element
	 * @param keys
	 * @throws IOException
	 */
	@Override
	public void sendTextByID(String element, Keys keys) throws IOException {
		try {
			driver.findElement(By.id(element)).sendKeys(keys);
			// Reporter.log("Entered the text for the element " + element,
			// true);
		} catch (Exception e) {
			Reporter.log("Unable to send the text " + element + " Exception " + e, true);
			getScreenshot();
		}
	}

	@Override
	public void tabToNextFieldByID(String element) throws IOException {
		try {
			driver.findElement(By.id(element)).sendKeys(Keys.TAB);
			// Reporter.log("Entered the text for the element " + element,
			// true);
		} catch (Exception e) {
			Reporter.log("Unable to send the text " + element + " Exception " + e, true);
			getScreenshot();
		}
	}

	@Override
	public void tabToNextFieldByXPath(String element) throws IOException {
		try {
			driver.findElement(By.xpath(element)).sendKeys(Keys.TAB);
			// Reporter.log("Entered the text for the element " + element,
			// true);
		} catch (Exception e) {
			Reporter.log("Unable to send the text " + element + " Exception " + e, true);
			getScreenshot();
		}
	}

	@Override
	public void tabToNextFieldByCSS(String element) throws IOException {
		try {
			driver.findElement(By.cssSelector(element)).sendKeys(Keys.TAB);
			// Reporter.log("Entered the text for the element " + element,
			// true);
		} catch (Exception e) {
			Reporter.log("Unable to send the text " + element + " Exception " + e, true);
			getScreenshot();
		}
	}

	/**
	 * @param element
	 * @param text
	 * @throws IOException
	 */
	@Override
	public void sendTextByXPath(String element, String text) throws IOException {
		try {
			driver.findElement(By.xpath(element)).sendKeys(text);
			// Reporter.log("Entered the text for the element " + element,
			// true);
		} catch (Exception e) {
			getScreenshot();
			Reporter.log("Unable to send the text " + element + " Exception " + e, true);
		}
	}

	/**
	 * @param element
	 * @param text
	 * @throws IOException
	 */

	public void sendTextByName(String element, String text) throws IOException {
		try {
			driver.findElement(By.name(element)).sendKeys(text);
			// Reporter.log("Entered the text for the element " + element,
			// true);
		} catch (Exception e) {
			getScreenshot();
			Reporter.log("Unable to send the text " + element + " Exception " + e, true);
		}
	}

	@Override
	public void tearDown() {
		driver.quit();
		driver = null;
	}

	/**
	 * @param element
	 * @throws IOException
	 */
	@Override
	public boolean waitElementByCssSelector(String element) throws IOException {
		try {
			this.wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(element)));
		} catch (Exception e) {
			Reporter.log("Element is not found in the page " + element + " Exception" + e, true);
			getScreenshot();
			return false;
		}
		return true;
	}

	@Override
	public void clickByCssSelector(String element) {
		try {
			driver.findElement(By.cssSelector(element)).click();
			// Reporter.log("Clicked the element " + element, true);
		} catch (Exception e) {
			getScreenshot();
			Reporter.log("Unable to click the element in the page " + element + " Exception " + e, true);
		}
	}

	@Override
	public int countingSizeByCssSelector(String element) {
		return driver.findElements(By.cssSelector(element)).size();
	}

	@Override
	public int countingSizeByID(String element) {
		return driver.findElements(By.id(element)).size();
	}

	@Override
	public int countingSizeByXPath(String element) {
		return driver.findElements(By.xpath(element)).size();
	}

	@Override
	// dropdown list
	public void selectOptionByValue(String className, String value) {
		Select dropdown = new Select(driver.findElement(By.className(className)));
		// dropdown.deselectAll();
		dropdown.selectByValue(value);
	}

	@Override
	// dropdown list
	public void selectOptionByText(String element, String value) {
		Select dropdown = new Select(driver.findElement(By.xpath(element)));
		dropdown.selectByVisibleText(value);
	}
	
	@Override
	public void clickByText(String text) {
		try {
			driver.findElement(By.xpath("//*[text()='" + text + "']")).click();
			// Reporter.log("Clicked the element " + element, true);
		} catch (Exception e) {
			getScreenshot();
			Reporter.log("Unable to click the by using text in the page " + text + " Exception " + e, true);
		}
	}

	@Override
	public void clickBtnByXPath(String text) {
		try {
			driver.findElement(By.xpath(text)).click();
			// Reporter.log("Clicked the element " + element, true);
		} catch (Exception e) {
			getScreenshot();
			Reporter.log("Unable to click the by using text in the page " + text + " Exception " + e, true);
		}
	}

	// @Override
	public void clickBtnByCssSelector(String text) {
		try {
			driver.findElement(By.cssSelector(text)).click();
			// Reporter.log("Clicked the element " + element, true);
		} catch (Exception e) {
			getScreenshot();
			Reporter.log("Unable to click the by using text in the page " + text + " Exception " + e, true);
		}
	}

	public String getAttributeByID(String element, String valueAttribute) {
		return driver.findElement(By.id(element)).getAttribute(valueAttribute);
	}

	public String getAttributeByXPath(String element, String valueAttribute) {
		return driver.findElement(By.xpath(element)).getAttribute(valueAttribute);
	}

	public String getAttributeByCssSelector(String element, String valueAttribute) {
		return driver.findElement(By.cssSelector(element)).getAttribute(valueAttribute);
	}

	public String getPageSourceOfExistingPage() {
		return driver.getPageSource();
	}

	@Override
	public String getTextByXPath(String text) {
		return driver.findElement(By.xpath(text)).getText();
	}

	@Override
	public String getPageTitle() {
		return driver.getTitle();
	}

	@Override
	public void getPageRefresh() {
		driver.navigate().refresh();
	}

	@Override
	public String getTextByID(String text) {

		return driver.findElement(By.id(text)).getText();
		// // Reporter.log("Clicked the element " + element, true);
		// } catch (Exception e) {
		// getScreenshot();
		// Reporter.log("Unable to click the by using text in the page " + text
		// + " Exception " + e, true);
		// }
	}

	@Override
	public String getTextByCssSelector(String text) {
		return driver.findElement(By.cssSelector(text)).getText();
		// Reporter.log("Clicked the element " + element, true);
	}

	@Override
	public void getBack() {
		try {
			driver.navigate().back();
			// Reporter.log("Clicked the element " + element, true);
		} catch (Exception e) {
			getScreenshot();
			Reporter.log("Unable to click back to previous page with Exception " + e, true);
		}
	}

	/**
	 * Define path for Screenshot file.
	 */
	protected String getScreenshotSavePath() {
		String packageName = this.getClass().getPackage().getName();
		File dir = new File(System.getProperty("user.dir") + File.separator + "screenshot" + File.separator
				+ packageName + File.separator);
		dir.mkdirs();
		return dir.getAbsolutePath();
	}

	/**
	 * Generic Method: This method is used to load the Properties file at run time
	 * and returns it.
	 */
	public Properties getProperties(String propertyFileName) {
		Properties properties = new Properties();
		InputStream inputStream = getClass().getClassLoader().getResourceAsStream(propertyFileName);
		try {
			properties.load(inputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return properties;
	}

	/**
	 * Take Screenshot on failure.
	 */
	protected void getScreenshot() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssSSS");
		String date = sdf.format(new Date());
		String url = driver.getCurrentUrl().replaceAll("[\\/:*\\?\"<>\\|]", "_");
		String ext = ".png";
		String path = getScreenshotSavePath() + File.separator + date + "_" + url + ext;

		try {
			if (driver instanceof TakesScreenshot) {
				File tmpFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				org.openqa.selenium.io.FileHandler.copy(tmpFile, new File(path));
				log.error("Captured Screenshot for Failure: " + path);
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	/**
	 * Assert Actual and Expected Strings
	 */
	protected void assertStrings(String actual, String expected) {
		try {
			Assert.assertEquals(actual, expected);
			log.info("Actual string: [ " + actual + " ] does match with Expected string: [ " + expected + " ]");

		} catch (AssertionError e) {
			log.error("Actual string: [ " + actual + " ] does not match with Expected string: [ " + expected + " ]");
			getScreenshot();
			Assert.fail();
		}
	}

	@Override
	public Object[][] getExcelData(String fileName, String sheetName) {
		Object[][] arrayExcelData = null;

		try {
			FileInputStream fs = new FileInputStream(fileName);

			XSSFWorkbook book = new XSSFWorkbook(fs);
			XSSFSheet sheet = book.getSheet(sheetName);
			XSSFRow row = sheet.getRow(0);
			XSSFCell cell = row.getCell(0);

			int columnCount = row.getLastCellNum();
			int rowCount = sheet.getLastRowNum() + 1;

			System.out.println("totalNoOfCols = " + columnCount);
			System.out.println("totalNoOfRows = " + rowCount);

			arrayExcelData = new Object[rowCount - 1][columnCount - 3];

			for (int i = 1; i < rowCount; i++) {
				Row rss = sheet.getRow(i);
				for (int j = 3; j < columnCount; j++) {
					cell = sheet.getRow(i).getCell(j);

					switch (cell.getCellTypeEnum()) {
					case NUMERIC:
						System.out.println(sheet.getRow(i).getCell(j).getNumericCellValue());
						System.out.println("=========================================");
						arrayExcelData[i - 1][j - 3] = rss.getCell(j).getNumericCellValue();
						System.out.println(arrayExcelData[i - 1][j - 3] = rss.getCell(j).getNumericCellValue());
						break;
					case STRING:
						System.out.println(sheet.getRow(i).getCell(j).getStringCellValue());
						System.out.println("=========================================");
						arrayExcelData[i - 1][j - 3] = rss.getCell(j).getStringCellValue();
						System.out.println(arrayExcelData[i - 1][j - 3] = rss.getCell(j).getStringCellValue());
						break;
					}
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
			e.printStackTrace();
		}
		return arrayExcelData;
	}

	DateFormat sdf1 = new SimpleDateFormat("MMMM yyyy");
	DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("MMMM  yyyy");

	/**
	 * This method is used to check the Month and Year of the Calendar after open it
	 * from
	 * 
	 * Super Admin: Discount Page: Create and Edit.
	 * 
	 * @param calendarDatePickerTable
	 * @param arrCaldrDiscountDate
	 * @param arrMonth
	 * @param arrYear
	 * @param calendarMonthPath
	 * @param calendarYearPath
	 * @param calendarNextButton
	 * 
	 * @throws InterruptedException
	 * @throws ParseException
	 */
	public void selectCalendarMonthYear(String calendarDatePickerTable, String[] arrCaldrDiscountDate, int arrMonth,
			int arrYear, String calendarMonthPath, String calendarYearPath, String calendarNextButton)
			throws InterruptedException, ParseException {
		// DateFormat sdf = new SimpleDateFormat("MMMM yyyy");
		// DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMMM yyyy");

		// String sdfMonthYearFormat = "MMMM yyyy";
		Date currentDate = new Date();
		System.out.println("currentDate: " + currentDate);
		System.out.println(sdf1.format(currentDate));

		// System.out.println(sdf1.format(currentDate));
		// Date discountDate = sdf1.parse(arrCaldrDiscountDate[arrMonth] + " " +
		// arrCaldrDiscountDate[arrYear]);
		Date discountDate = sdf1.parse(arrCaldrDiscountDate[arrMonth] + " " + arrCaldrDiscountDate[arrYear]);
		System.out.println("date1: " + sdf1.format(discountDate));

		// this.getDateCompare(String[] arrCaldrDiscountDate, int arrMonth, int
		// arrYear);
		// Date discountDate = this.getDateCompare(arrCaldrDiscountDate,
		// arrMonth, arrYear);
		for (int countCaldrTable = 1; countCaldrTable <= this.countingSizeByCssSelector(calendarDatePickerTable)
				|| countCaldrTable >= this.countingSizeByCssSelector(calendarDatePickerTable); countCaldrTable++) {
			Thread.sleep(2000);
			// sdf1.format(currentDate);
			if (discountDate.before(currentDate)) {
				System.out.println("discountDateCreatedDD: " + discountDate);
				break;
			}
			if (arrCaldrDiscountDate[arrMonth].equals(this.getTextByCssSelector(calendarMonthPath))
					&& arrCaldrDiscountDate[arrYear].equals(this.getTextByCssSelector(calendarYearPath))) {
				break;
			}
			clickBtnByCssSelector(calendarNextButton);
		}
	}

	/**
	 * This method is used to select the day of the Calendar after open it from
	 * 
	 * Super Admin: Discount Page: Create and Edit.
	 * 
	 * This method is used after Method: selectCalendarMonthYear()
	 * 
	 * @param calendarTotalRow
	 * @param calendarActiveDate
	 * @param arrCaldrDiscountDate
	 * @param arrDay
	 * @throws ParseException
	 * 
	 * @throws InterruptedException
	 */
//	public void selectCalendarDayFromOpenedCalendar(String calendarTotalRow, String calendarActiveDate,
//			String[] arrCaldrDiscountDate, int arrDay) throws ParseException {

	// Date discountDate = this.getDateCompare(arrCaldrDiscountDate,
	// arrMonth, arrYear);
	// if (discountDate.before(currentDate)) {
	// clickBtnByCssSelector(SuperAdmCreateDiscountPage.CURRENT_DATE);
	// } else {
//		int totalCalendarRow = this.countingSizeByCssSelector(calendarTotalRow) - 1;
//
//		for (int countCaldrRow = 1; countCaldrRow <= totalCalendarRow; countCaldrRow++) {
//			if (this.countingSizeByCssSelector(
//					calendarTotalRow + SuperAdmLeftSideBar.NTH_CHILD + "(" + countCaldrRow + ") td a") > 0) {
//				String selectCalendarDay = null;
//				int countDisabledCaldrDay = 8 - countingSizeByCssSelector(
//						calendarTotalRow + SuperAdmLeftSideBar.NTH_CHILD + "(" + countCaldrRow + ") td a");
//
//				int countCaldrDay;
//				for (countCaldrDay = countDisabledCaldrDay; countCaldrDay <= countingSizeByCssSelector(calendarTotalRow
//						+ SuperAdmLeftSideBar.NTH_CHILD + "(" + countCaldrRow + ") td"); countCaldrDay++) {
//
//					selectCalendarDay = getTextByCssSelector(
//							calendarTotalRow + SuperAdmLeftSideBar.NTH_CHILD + "(" + countCaldrRow + ") td"
//									+ SuperAdmLeftSideBar.NTH_CHILD + "(" + countCaldrDay + ") " + calendarActiveDate); //
//
//					if (Integer.parseInt(selectCalendarDay) == Integer.parseInt(arrCaldrDiscountDate[arrDay])) {
//						clickBtnByCssSelector(calendarTotalRow + SuperAdmLeftSideBar.NTH_CHILD + "(" + countCaldrRow
//								+ ") td" + SuperAdmLeftSideBar.NTH_CHILD + "(" + countCaldrDay + ") "
//								+ calendarActiveDate);
//						break;
//					}
//				}
//				if (Integer.parseInt(selectCalendarDay) == Integer.parseInt(arrCaldrDiscountDate[arrDay])) {
//					break;
//				}
//			}
//		}
//	}

	/**
	 * This method is used to sort the table data into ascending order related to
	 * String values.
	 * 
	 * @param totalPaginationCount
	 * @param sortColPositionNo
	 * @param tableColumnRowCount
	 * @param tableRowNumber
	 * @param tableRowData
	 * @param swipeToLastElementAtBottom
	 * @param paginationBtnNext
	 * @param paginationBtnDisabled
	 * @param expctedMsgNoRecrdFound
	 * @throws InterruptedException
	 */
	public void sortingAscdngColStringData(String totalPaginationCount, Object sortColPositionNo,
			String tableColumnRowCount, String tableRowNumber, String tableRowData, String swipeToLastElementAtBottom,
			String paginationBtnNext, String paginationBtnDisabled, String expctedMsgNoRecrdFound)
			throws InterruptedException {

		ArrayList<String> actualStoreDate = new ArrayList<String>();
		ArrayList<String> expectedStoreDate = new ArrayList<String>();
		int countSortColPositionNo = Integer.parseInt(String.valueOf(sortColPositionNo));

		int aPaginationCount = this.countingSizeByCssSelector(totalPaginationCount);
		if (aPaginationCount >= 3) {

			for (int countPage = 1; countPage <= aPaginationCount; countPage++) {
				for (int countDate = 1; countDate <= this.countingSizeByCssSelector(
						tableColumnRowCount + "(" + countSortColPositionNo + ")"); countDate++) {
					Thread.sleep(500);
					String sortDateActual = this.getTextByCssSelector(
							tableRowNumber + "(" + countDate + ")" + tableRowData + "(" + countSortColPositionNo + ")");
					Thread.sleep(500);
					if (sortDateActual.equals("") || sortDateActual.equals("N/A")) {
						sortDateActual = " ";
						actualStoreDate.add(sortDateActual);
						expectedStoreDate.add(sortDateActual);
					} else {
						actualStoreDate.add(sortDateActual);
						expectedStoreDate.add(sortDateActual);
					}
				}

				swipeToElement(swipeToLastElementAtBottom);

				Thread.sleep(1000);
				if (this.countingSizeByCssSelector(
						totalPaginationCount + paginationBtnNext + paginationBtnDisabled + " a") == 1) {
					break;
				}
				this.clickBtnByCssSelector(totalPaginationCount + paginationBtnNext + " a");
			}
			Collections.sort(expectedStoreDate, String.CASE_INSENSITIVE_ORDER); //

			System.out.println("actualStoreDate: " + actualStoreDate);
			System.out.println("expectedStoreDate: " + expectedStoreDate);
			sftAsrt = new SoftAssert();
			sftAsrt.assertEquals(actualStoreDate, expectedStoreDate);
			sftAsrt.assertAll();
		} else {
			sftAsrt = new SoftAssert();
			sftAsrt.assertEquals(this.getTextByCssSelector(tableColumnRowCount + "(1)"), expctedMsgNoRecrdFound);
			sftAsrt.assertAll();
		}
	}

	/**
	 * Get the current date (Screenshot dependent)
	 */
	private String getDate() {
		int day, month, year;
		int second, minute, hour;
		GregorianCalendar date = new GregorianCalendar();
		day = date.get(Calendar.DAY_OF_MONTH);
		month = date.get(Calendar.MONTH);
		year = date.get(Calendar.YEAR);
		second = date.get(Calendar.SECOND);
		minute = date.get(Calendar.MINUTE);
		hour = date.get(Calendar.HOUR);
		String dateTime = +day + "_" + (month + 1) + "_" + year + "_" + hour + "_" + minute + "_" + second;
		return dateTime;
	}

	private String createFolderWithDate() {
		Date today = Calendar.getInstance().getTime();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		String folderName = formatter.format(today);
		return folderName;
	}

	@Override
	public int currentYear() {
		int year = Calendar.getInstance().get(Calendar.YEAR);
		return year;
	}

	@Override
	public String getwindowhandle() {
		return driver.getWindowHandle();
	}

	@Override
	public Set<String> getwindowhandles() {
		return driver.getWindowHandles();

	}

	@Override
	public void switchToWindow(String window) {
		driver.switchTo().window(window);

	}

	@Override
	public void scrolldown(int a) throws InterruptedException {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0," + a + ")", "");
		Thread.sleep(1000);
	}

	@Override
	public void scrollRight(String element, int keyevent, int j) throws InterruptedException, AWTException {
		driver.findElement(By.xpath(element)).click();
		Thread.sleep(750);
		Robot robot = new Robot();
		for (int i = 0; i < j; i++) {
			robot.keyPress(keyevent);
		}

		Thread.sleep(1000);

	}

	@Override
	public void scrollToAnElement(String element) throws InterruptedException {

		Actions act = new Actions(driver);
		act.scrollToElement(driver.findElement(By.xpath(element))).perform();

		Thread.sleep(1000);
	}

	@Override
	public void test(String element) throws InterruptedException {
		driver.findElement(By.xpath(element)).click();
		Thread.sleep(750);

		driver.findElement(By.xpath(element)).sendKeys(Keys.ARROW_RIGHT);
		Thread.sleep(750);
		driver.findElement(By.xpath(element)).sendKeys(Keys.ARROW_RIGHT);
		Thread.sleep(750);
	}

	@Override
	public void pressKeys(int keys) throws AWTException {
		Robot robot = new Robot();
		robot.keyPress(keys);
//		Faker faker = new Faker();
//		int number =faker.number().numberBetween(0, 9);
//		robot.keyPress(KeyEvent.VK_N);
//		robot.keyPress(KeyEvent.VK_A);
//		robot.keyPress(KeyEvent.VK_M);
//		robot.keyPress(KeyEvent.VK_E);
//		robot.keyPress(KeyEvent.VK_+number);

	}

	@Override
	public void switchToiFrame(String element) {
		WebElement element1 = driver.findElement(By.xpath(element));

		driver.switchTo().frame(element1);

	}

	public File filelocation(String Classname) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd_MM_yyyy"); // yyyyMMdd
		String date = sdf.format(new Date());
		String fileNamePicture = Classname + "_" + date + ".png";
		File scr = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		return scr;

	}

	public static String screenshot(String Classname) throws IOException, InterruptedException // Capture the screenshot

	{
		Thread.sleep(750);
		SimpleDateFormat sdf = new SimpleDateFormat("dd_MM_yyyy"); // yyyyMMdd
		String date = sdf.format(new Date());
		String fileNamePicture = Classname + "_" + date + ".png";

		File scr = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String destination = System.getProperty("user.dir") + "/ExtentReports/screenshot/" + fileNamePicture;

		String relPath = "screenshot" + "/" + fileNamePicture;
		File finalDestination = new File(destination);
		FileHandler.copy(scr, finalDestination);
		return relPath;

	}

	public static String screenshot1(String Classname) throws IOException, InterruptedException // Capture the
																								// screenshot

	{
		Thread.sleep(2000);
		SimpleDateFormat sdf = new SimpleDateFormat("dd_MM_yyyy"); // yyyyMMdd
		String date = sdf.format(new Date());
		String fileNamePicture = date + ".png";
		File scr = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		////////
		// String destination =
		//////// System.getProperty("user.dir")+".\\Screenshots\\"+Classname+"_"+date+".jpg";
		String destination = System.getProperty("user.dir") + "/screenshot/" + fileNamePicture;
		String relPath = "screenshot" + "/" + fileNamePicture;
		File finalDestination = new File(destination);
		FileHandler.copy(scr, finalDestination);

		return relPath;

	}

	public boolean SwitchToWindowByIndex(int a) {
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> windowStrings = new ArrayList<>(windowHandles);
		String reqWindow = windowStrings.get(a);
		driver.switchTo().window(reqWindow);
		System.out.println("Switched to " + driver.getTitle());
		return flag;

	}

//	public void testSortingFunctionality() throws InterruptedException {
////		String lastTwoDigits;
//		WebElement sorticon = driver.findElement(By.xpath("(//div[@class = 'sortingicon'])[1]"));
//		sorticon.click();
//		WebElement sotBox = driver.findElement(By.xpath("(//select[@name ='datatable_length'])[1]"));
//		selectOptionByText("(//select[@name ='datatable_length'])[1]", "500");
//		Thread.sleep(2000);
//		
//		Thread.sleep(2000);
////		WebElement value = driver.findElement(By.xpath("//p[@class= 'float-lg-start text-sm-center']"));
//		scrolldown(3500);
//
////		value.click();
//		Thread.sleep(2000);
//		String totalTest = getTextByXPath("//p[@class= 'float-lg-start text-sm-center']").replace("Showing 1 to ", "");
//		System.out.println("The fetched data is: " + totalTest);
//		if (totalTest.contains(" ") && totalTest.length() >= 2) {
//			// Find the last space in the string
//			int lastSpaceIndex = totalTest.lastIndexOf(" ");
//
//			// Extract the last two characters after the space
//			String lastTwoDigits = totalTest.substring(lastSpaceIndex + 1);
//
//			// Check if the extracted part is a digit and contains exactly two characters
//			if (lastTwoDigits.length() >= 2) {
//				lastTwoDigits = lastTwoDigits.substring(lastTwoDigits.length() - 2);
//			}
//
//			System.out.println("Last two digits: " + lastTwoDigits);
////			getPageRefresh();
//			scrollToAnElement("//p[@class='role-permission']");
//			Thread.sleep(2000);
//
//			        try {
//			           
//			            // Step 1: Locate the column header and click it to sort the column (assuming it's a sortable table)
//			            WebElement sortHeader = driver.findElement(By.xpath("//p[@class='role-permission']"));
//			            sortHeader.click(); // Click to sort by this column
//
//			            // Step 2: Fetch the unsorted column data (before sorting)
//			            List<WebElement> columnElements = driver.findElements(By.xpath("//p[@class='role-permission']"));
//
//			            // Store the text values in a list before sorting
//			            List<String> originalList = new ArrayList<>();
//			            for (WebElement element : columnElements) {
//			                originalList.add(element.getText());
//			            }
//
//			            // Print original list
//			            System.out.println("Original List: " + originalList);
//
//			            // Step 3: Perform sorting on the column by clicking the header
//			            sortHeader.click(); // Assuming clicking the header sorts it
//
//			            // Step 4: Fetch the column data again (after sorting)
//			            List<WebElement> sortedColumnElements = driver.findElements(By.xpath("//p[@class='role-permission']"));
//
//			            // Store the sorted values in a list
//			            List<String> sortedListFromPage = new ArrayList<>();
//			            for (WebElement element : sortedColumnElements) {
//			                sortedListFromPage.add(element.getText());
//			            }
//
//			            // Print sorted list from the webpage
//			            System.out.println("Sorted List from Page: " + sortedListFromPage);
//
//			            // Step 5: Verify if the sorting is correct by comparing it with a manually sorted list
//			            List<String> manuallySortedList = new ArrayList<>(originalList);
//			            Collections.sort(manuallySortedList); // Sort manually
//
//			            // Print manually sorted list
//			            System.out.println("Manually Sorted List: " + manuallySortedList);
//
//			            // Step 6: Compare the manually sorted list with the sorted list from the webpage
//			            if (manuallySortedList.equals(sortedListFromPage)) {
//			                System.out.println("Sorting is working correctly.");
//			            } else {
//			                System.out.println("Sorting is incorrect.");
//			            }
//
//			        } catch (Exception e) {
//			            e.printStackTrace();
//			        } 
//			    }
//			}
//
//			
//			
//			
//			
//			
//			
////			List<WebElement> columnElements = driver.findElements(By.xpath("//p[@class='role-permission']"));
////			List<String> actualColumnData = new ArrayList<>();
////
////			for (WebElement element : columnElements) {
////				actualColumnData.add(element.getText());
////
////			}
////			System.out.println("The Fetched user role data is: " + actualColumnData);
////			WebElement sorticon = driver.findElement(By.xpath("(//select[@name ='datatable_length'])[1]"));
////			sorticon.click();
////			Thread.sleep(2000);
////			List<WebElement> beforeFilterName = driver.findElements(By.xpath("//p[@class='role-permission']"));
////			List<String> beforeFilterNameList = new ArrayList<>();
////			
////			for (WebElement s1 : beforeFilterName) {
////				beforeFilterNameList.add(s1.getText());
////
////			}
////			System.out.println(beforeFilterNameList);
////			Thread.sleep(2000);
//////			Select s = new Select(SortBy);
//////			s.selectByValue("name");
////			Reporter.log("----------------< Result after sorting By Name >------------------", true);
////			WebElement sorticon1 = driver.findElement(By.xpath("(//select[@name ='datatable_length'])[1]"));
////			sorticon1.click();
////			Thread.sleep(2000);
////			List<WebElement> afterNamefilter = driver.findElements(By.xpath("//p[@class='role-permission']"));
////			
////			List<String> afterfilterNamelist = new ArrayList<>();
////			
////			for(WebElement s2:afterNamefilter)
////			{
////				afterfilterNamelist.add(s2.getText());
//////				System.out.println(s2.getText());
////				
////			}
////			
////			System.out.println(afterfilterNamelist);
////			
////			System.out.println("==================Collection result ===============================");
////			Collections.sort(beforeFilterNameList);
////			System.out.println(beforeFilterNameList);
////			
////			System.out.println("=================================================");
////			softAssert.assertEquals(beforeFilterNameList, afterfilterNamelist);
////			softAssert.assertAll();
//////			Collections.sort(afterfilterpricelist);
//////			System.out.println(afterfilterpricelist);
////			
//////			softassert.assertEquals(beforeFilterNameList, afterfilterNamelist);
//////			
//////			softassert.assertAll();
////			
////			
////			// Create a copy of the actual list to sort it for comparison
////			List<String> expectedSortedData = new ArrayList<>(actualColumnData);
////			System.out.println("The expected sorted data ");
////			Collections.sort(expectedSortedData); // Ascending order sorting
////			
////			// Verify if the column data is correctly sorted
////			Assert.assertEquals(actualColumnData, expectedSortedData, "Column is not sorted correctly.");
//			
////			int num = Integer.valueOf(lastTwoDigits);
////
////			for (int i = 1; i <= num; i++) {
////
////				String ordername = getTextByXPath(
////						"((//table[@class='table table-bordered table dataTable no-footer']//tbody//tr)[" + i
////								+ "]//td)[1]");
////				System.out.println("The fetched result is :  " + ordername);
////			}
//
////		} else {
////			System.out.println("Invalid input or no space found.");
////		}
//
////		int name = totalTest.lastIndexOf(2);
////		System.out.println("The fetched data is: " + name);
//
//		// Find and click the column header to trigger sorting
////		WebElement header = driver.findElement(By.xpath("//th[contains(text(),'Column Name')]"));
////		header.click();
//
//		// Wait until the sorting is complete and the table is refreshed
////	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
////	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//tbody/tr/td[1]"))); // Adjust the locator
//
//		// Capture all values from the column after sorting
//		 // Adjust
//																											
//		
////	}

//	 public void pagination(String element, String element2) {
//	        // Set up ChromeDriver (Make sure to provide the correct path to the driver)
////	        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
////	        WebDriver driver = new ChromeDriver();
//
//	        try {
//	            // Navigate to the target URL
////	            driver.get();
//
//	            boolean hasNextPage = true;
//	            
//	            // Loop through pagination
//	            while (hasNextPage) {
//	                // Example: Fetch data from the current page
//	                List<WebElement> dataRows = driver.findElements(By.xpath(element));
//	                
//	                for (WebElement row : dataRows) {
//	                    // Example: Extract text or attributes from each row
//	                    System.out.println(row.getText());
//	                }
//
//	                // Check if the "Next" button is present and enabled
//	                List<WebElement> nextButton = driver.findElements(By.xpath(element2));
//	                
//	                if (nextButton.size() > 0 && nextButton.get(0).isDisplayed() && nextButton.get(0).isEnabled()) {
//	                    nextButton.get(0).click();  // Click the "Next" button
//	                } else {
//	                    hasNextPage = false;  // No "Next" button available, stop the loop
//	                }
//	            }
//
//	        } catch (Exception e) {
//	            e.printStackTrace();
//	        } finally {
//	            // Close the browser after the automation completes
//	            driver.quit();
//	        }
//	    }

	public boolean NavigateTo(String url) {
		driver.get(url);
		return flag;
	}

	public boolean CloseCurremtWindow() {
		driver.close();
		return flag;
	}

	public static String getLastNumber(String input) {
        // Split the string by spaces
        String[] parts = input.split(" ");
        // The last number is in the last part after "of"
        return parts[parts.length - 1];
    }
	
	public boolean verifyPagination(String showingresultbottomelement, String nextbuttonelement, String allrowsintableelement) throws IOException, InterruptedException
	{
		getPageRefresh();
		Thread.sleep(4000);
		flag = waitElementByXPath(showingresultbottomelement);
		
		if(flag)
		{
		int count = 0;
//		String totalrecordscountstring = driver.findElement(By.xpath(showingresultbottomelement)).getText().replace("Showing 1 to 10 of ", "");
/////////////////////////////////////////////////
		
//		String totalTest = getTextByXPath(showingresultbottomelement).replace("Showing 1 to ", "");
//		System.out.println("The fetched data is: " + totalTest);
//		if (totalTest.contains(" ") && totalTest.length() >= 2) {
//			// Find the last space in the string
//			int lastSpaceIndex = totalTest.lastIndexOf(" ");
//
//			// Extract the last two characters after the space
//			String lastTwoDigits = totalTest.substring(lastSpaceIndex + 1);
//
//			// Check if the extracted part is a digit and contains exactly two characters
//			if (lastTwoDigits.length() >= 2) {
//				totalrecordscountstring = lastTwoDigits.substring(lastTwoDigits.length() - 2);
//			}
//			System.out.println("Last two digits: " + totalrecordscountstring);
		///////////////////////////////////////////////
		String totalTest = getTextByXPath(showingresultbottomelement);
		  String lastNumber = getLastNumber(totalTest);
	        
	        System.out.println("The last number is: " + lastNumber);
		System.out.println("The total records count is "+lastNumber);
		int totalrecordscount = Integer.parseInt(lastNumber);
		if(totalrecordscount>10)
		{
			System.out.println("Pagination is available as total records count is greater than 10.");
			int actualpagination = totalrecordscount / 10;
			int remainder = totalrecordscount % 10;
			if(remainder>=1)
			{
				actualpagination++;
				System.out.println("The actual pagination count is "+actualpagination);
			}
			
			try {
				
			int allpages = driver.findElements(By.xpath(nextbuttonelement)).size();
			int recordsonpage1 = 0;
			
			for(int j = 0; allpages>0; j++)
			{
				scrollToAnElement(nextbuttonelement);
				Thread.sleep(750);
				int recordsonparticularpage = countingSizeByXPath(allrowsintableelement);
				recordsonpage1 = recordsonpage1 + recordsonparticularpage;
				driver.findElement(By.xpath(nextbuttonelement)).click();
				System.out.println("Click on next button as its enabled");
				Thread.sleep(3000);
				
				
				count++;
				 boolean nextbutton = driver.findElement(By.xpath(nextbuttonelement)).isEnabled();
				if(nextbutton==true)
				{
					System.out.println("Next button is enabled");
				}
				else
				{
					System.out.println("Next button is in disabled state");
					break;
				}
			}
			int recordsonparticularpage1 = countingSizeByXPath(allrowsintableelement);
			int recordsonpage= recordsonpage1+recordsonparticularpage1;
			if(recordsonpage==totalrecordscount)
			{
				System.out.println("Total records on page are same i.e. "+recordsonpage);
				flag = true;
			}
			else
			{
				System.out.println("Total records on page are different i.e. "+recordsonpage);
				flag = false;
			}
			
			}
			catch(Exception e)
			{
				
			}
		
		
		count = count+1;
		Reporter.log("The total pagination count is "+count, true);
		if(actualpagination == count ==true)	
		{
			Reporter.log("The Actual and expected pagination count is same i.e. "+count, true);
			Reporter.log(" ", true);
			flag = true;
		}
		
		else
			{
				Reporter.log("The Actual and expected pagination count is Different i.e. "+count, true);
				Reporter.log(" ", true);
				flag = false;
			}
			
		count =0;
		}
		
	else
	{
		System.out.println("No pagination is available as total records count is less than 10.");
	}
		}
		else
		{
			System.out.println("The pagination is not present on webpage");
		}
		
//		}
		return flag;
	}
	
	
//	public boolean testignoreverifyAscendingOrderSortingFunctionality(String tablecolumndataonwhichsortingapplied, String tablecolumnnameonwhichsortingapplied, String uparrowelement) throws InterruptedException 
//	{	
//			int totalrecordsintablecount = countingSizeByXPath(tablecolumndataonwhichsortingapplied);
//			if(totalrecordsintablecount>0)
//			{
//			selectOptionByText("(//select[@name ='datatable_length'])[1]", "500");
//			Thread.sleep(2000);
//			
////			========================
//			
//			int uparrowcount = countingSizeByXPath(uparrowelement);
//			if(uparrowcount>=1)
//			{
//			
//			List<WebElement> columnElements = driver.findElements(By.xpath(tablecolumndataonwhichsortingapplied));
//			List<String> actualColumnData = new ArrayList<>();
//
//			for (WebElement element : columnElements) {
//				actualColumnData.add(element.getText());
//			}
//			
//			System.out.println("The Fetched data before sorting is: " + actualColumnData);
//			List<String> actualColumnData1 = new ArrayList<>(actualColumnData);
//			Collections.sort(actualColumnData1); // Ascending order sorting
//
//			System.out.println("The fetched data after sorting is: "+actualColumnData1);
//			// Verify if the column data is correctly sorted
//			if(actualColumnData.equals(actualColumnData1))
//			{
//				System.out.println("Column is sorted correctly by ascending order.");
//				flag = true;
//			}
//			else
//			{
//				System.out.println("Column is not sorted correctly by ascending order.");
//				flag = false;
//			}
////			Assert.assertEquals(actualColumnData, actualColumnData1, "Column is sorted correctly.");
//			
//			}
//			else
//			{
//				System.out.println("The up arrow is not displayed.");
//				Thread.sleep(1500);
//				
//				clickBtnByXPath(tablecolumnnameonwhichsortingapplied);
//				Thread.sleep(3000);
//				clickBtnByXPath(tablecolumnnameonwhichsortingapplied);
//				Thread.sleep(3000);
//				
//				int uparrowcount1 = countingSizeByXPath(uparrowelement);
//				if(uparrowcount1>=1)
//				{
//				
//				List<WebElement> columnElements = driver.findElements(By.xpath(tablecolumndataonwhichsortingapplied));
//				List<String> actualColumnData = new ArrayList<>();
//
//				for (WebElement element : columnElements) {
//					actualColumnData.add(element.getText());
//				}
//				
//				System.out.println("The Fetched data before sorting is: " + actualColumnData);
//				List<String> actualColumnData1 = new ArrayList<>(actualColumnData);
//				Collections.sort(actualColumnData1); // Ascending order sorting
//
//				System.out.println("The fetched data after sorting is: "+actualColumnData1);
//				// Verify if the column data is correctly sorted
//				if(actualColumnData.equals(actualColumnData1))
//				{
//					System.out.println("Column is sorted correctly by ascending order.");
//					flag = true;
//				}
//				else
//				{
//					System.out.println("Column is not sorted correctly by ascending order.");
//					flag = false;
//				}
//				}
//				else
//				{
//					System.out.println("The decending order results are not selected ");
//				}
//			}
//			
//
//		} 
//			else {
//			System.out.println("No records are present in table");
//		}
//			
//		return flag;
//		
//	}
	
	
	///////////////
	
//	public boolean verifyAscendingOrderSortingFunctionalitytest(String tablecolumndataonwhichsortingapplied, String tablecolumnnameonwhichsortingapplied, String totalarrowscount, String uparrowelement) throws InterruptedException 
//	{	
//			int totalrecordsintablecount = countingSizeByXPath(tablecolumndataonwhichsortingapplied);
//			if(totalrecordsintablecount>0)
//			{
//			selectOptionByText("(//select[@name ='datatable_length'])[1]", "500");
//			Thread.sleep(2000);
//			
////			========================
//			int arrowcount= countingSizeByXPath(totalarrowscount);
//			if(arrowcount>=2)
//			{
//				clickBtnByXPath(tablecolumnnameonwhichsortingapplied);
//				Thread.sleep(3000);
//				clickBtnByXPath(tablecolumnnameonwhichsortingapplied);
//				Thread.sleep(3000);
//			int uparrowcount = countingSizeByXPath(uparrowelement);
//			if(uparrowcount>=1)
//			{
//			
//			List<WebElement> columnElements = driver.findElements(By.xpath(tablecolumndataonwhichsortingapplied));
//			List<String> actualColumnData = new ArrayList<>();
//
//			for (WebElement element : columnElements) {
//				actualColumnData.add(element.getText());
//			}
//			
//			System.out.println("The Fetched data before sorting is: " + actualColumnData);
//			List<String> actualColumnData1 = new ArrayList<>(actualColumnData);
//			Collections.sort(actualColumnData1); // Ascending order sorting
//
//			System.out.println("The fetched data after sorting is: "+actualColumnData1);
//			// Verify if the column data is correctly sorted
//			if(actualColumnData.equals(actualColumnData1))
//			{
//				System.out.println("Column is sorted correctly by ascending order.");
//				flag = true;
//			}
//			else
//			{
//				System.out.println("Column is not sorted correctly by ascending order.");
//				flag = false;
//			}
////			Assert.assertEquals(actualColumnData, actualColumnData1, "Column is sorted correctly.");
//			}
//			else
//			{
//				int uparrowcount1 = countingSizeByXPath(uparrowelement);
//				if(uparrowcount1>=1)
//				{
//				
//				List<WebElement> columnElements = driver.findElements(By.xpath(tablecolumndataonwhichsortingapplied));
//				List<String> actualColumnData = new ArrayList<>();
//
//				for (WebElement element : columnElements) {
//					actualColumnData.add(element.getText());
//				}
//				
//				System.out.println("The Fetched data before sorting is: " + actualColumnData);
//				List<String> actualColumnData1 = new ArrayList<>(actualColumnData);
//				Collections.sort(actualColumnData1); // Ascending order sorting
//
//				System.out.println("The fetched data after sorting is: "+actualColumnData1);
//				// Verify if the column data is correctly sorted
//				if(actualColumnData.equals(actualColumnData1))
//				{
//					System.out.println("Column is sorted correctly by ascending order.");
//					flag = true;
//				}
//				else
//				{
//					System.out.println("Column is not sorted correctly by ascending order.");
//					flag = false;
//				}
//				}
//				else
//				{
//					System.out.println("Up arrow is not dispplayed");
//					flag = false;
//				}
//
//			}
//			}
//			else
//			{
//				System.out.println("The two arrows are not displayed.");
//				Thread.sleep(1500);
//				
//				int uparrowcount1 = countingSizeByXPath(uparrowelement);
//				if(uparrowcount1>=1)
//				{
//				
//				List<WebElement> columnElements = driver.findElements(By.xpath(tablecolumndataonwhichsortingapplied));
//				List<String> actualColumnData = new ArrayList<>();
//
//				for (WebElement element : columnElements) {
//					actualColumnData.add(element.getText());
//				}
//				
//				System.out.println("The Fetched data before sorting is: " + actualColumnData);
//				List<String> actualColumnData1 = new ArrayList<>(actualColumnData);
//				Collections.sort(actualColumnData1); // Ascending order sorting
//
//				System.out.println("The fetched data after sorting is: "+actualColumnData1);
//				// Verify if the column data is correctly sorted
//				if(actualColumnData.equals(actualColumnData1))
//				{
//					System.out.println("Column is sorted correctly by ascending order.");
//					flag = true;
//				}
//				else
//				{
//					System.out.println("Column is not sorted correctly by ascending order.");
//					flag = false;
//				}
//				}
//				else
//				{
//					System.out.println("The decending order results are not selected ");
//				}
//			}
//			
//
//		} 
//			else {
//			System.out.println("No records are present in table");
//		}
//			
//		return flag;
//		
//	}

	public boolean verifyAscendingOrderSortingFunctionality(String tablecolumndataonwhichsortingapplied, String tablecolumnnameonwhichsortingapplied, String totalarrowscount, String uparrowelement) throws InterruptedException 
	{	
		int totalrecordsintablecount = countingSizeByXPath(tablecolumndataonwhichsortingapplied);
		if(totalrecordsintablecount>0)
		{
		selectOptionByText("(//select[@name ='datatable_length'])[1]", "500");
		Thread.sleep(8000);
		
//		========================
		int arrowcount= countingSizeByXPath(totalarrowscount);
		if(arrowcount>=2)
		{
			scrollToAnElement(tablecolumnnameonwhichsortingapplied);
			Thread.sleep(1000);
			clickBtnByXPath(tablecolumnnameonwhichsortingapplied);
			Thread.sleep(8000);
			clickBtnByXPath(tablecolumnnameonwhichsortingapplied);
			Thread.sleep(8000);
		int uparrowcount = countingSizeByXPath(uparrowelement);
//		int uparrowcount1 = countingSizeByXPath(uparrowelement);
		if(uparrowcount>=1)
		{
		
		List<WebElement> columnElements = driver.findElements(By.xpath(tablecolumndataonwhichsortingapplied));
		List<String> actualColumnData = new ArrayList<>();

		for (WebElement element : columnElements) {
			actualColumnData.add(element.getText());
		}
		
		System.out.println("The Fetched results are: " + actualColumnData);
		List<String> actualColumnData1 = new ArrayList<>(actualColumnData);
		Collections.sort(actualColumnData1, String.CASE_INSENSITIVE_ORDER); // Ascending order sorting

		System.out.println("The expected results after sorting are: "+actualColumnData1);
		// Verify if the column data is correctly sorted
		if(actualColumnData.equals(actualColumnData1))
		{
			System.out.println("Column is sorted correctly by ascending order.");
			flag = true;
		}
		else
		{
			System.out.println("Column is not sorted correctly by ascending order.");
			flag = false;
		}
//		Assert.assertEquals(actualColumnData, actualColumnData1, "Column is sorted correctly.");
		}
			else
			{
				System.out.println("Up arrow is not displayed");
				flag = false;
			}

		}
		
		else 
		{
			System.out.println("The two arrows are not displayed.");
			Thread.sleep(1500);
			
			int uparrowcount1 = countingSizeByXPath(uparrowelement);
			if(uparrowcount1>=1)
			{
			
			List<WebElement> columnElements = driver.findElements(By.xpath(tablecolumndataonwhichsortingapplied));
			List<String> actualColumnData = new ArrayList<>();

			for (WebElement element : columnElements) {
				actualColumnData.add(element.getText());
			}
			
			System.out.println("The Fetched data before sorting is: " + actualColumnData);
			List<String> actualColumnData1 = new ArrayList<>(actualColumnData);
			Collections.sort(actualColumnData1, String.CASE_INSENSITIVE_ORDER); // Ascending order sorting

			System.out.println("The fetched data after sorting is: "+actualColumnData1);
			// Verify if the column data is correctly sorted
			if(actualColumnData.equals(actualColumnData1))
			{
				System.out.println("Column is sorted correctly by ascending order.");
				flag = true;
			}
			else
			{
				System.out.println("Column is not sorted correctly by ascending order.");
				flag = false;
			}
			}
			
			
			else
			{
				scrollToAnElement(tablecolumnnameonwhichsortingapplied);
				Thread.sleep(1000);
				clickBtnByXPath(tablecolumnnameonwhichsortingapplied);
				Thread.sleep(8000);
				
				int uparrowcount2 = countingSizeByXPath(uparrowelement);
				if(uparrowcount2>=1)
				{
				System.out.println("The Ascending order results are selected ");
				List<WebElement> columnElements = driver.findElements(By.xpath(tablecolumndataonwhichsortingapplied));
				List<String> actualColumnData = new ArrayList<>();

				for (WebElement element : columnElements) {
					actualColumnData.add(element.getText());
				}
				
				System.out.println("The Fetched data before sorting is: " + actualColumnData);
				List<String> actualColumnData1 = new ArrayList<>(actualColumnData);
				Collections.sort(actualColumnData1, String.CASE_INSENSITIVE_ORDER); // Ascending order sorting

				System.out.println("The fetched data after sorting is: "+actualColumnData1);
				// Verify if the column data is correctly sorted
				if(actualColumnData.equals(actualColumnData1))
				{
					System.out.println("Column is sorted correctly by ascending order.");
					flag = true;
				}
				else
				{
					System.out.println("Column is not sorted correctly by ascending order.");
					flag = false;
				}
				}
			}
		}
		

	} 
		else {
		System.out.println("No records are present in table");
	}
		
	return flag;
	}

	
	///////////////////
	public boolean verifyDecendingOrderSortingFunctionality(String tablecolumndataonwhichsortingapplied, String tablecolumnnameonwhichsortingapplied) throws InterruptedException 
	{	
			int totalrecordsintablecount = countingSizeByXPath(tablecolumndataonwhichsortingapplied);
			if(totalrecordsintablecount>0)
			{
			selectOptionByText("(//select[@name ='datatable_length'])[1]", "500");
			Thread.sleep(8000);
			
			List<WebElement> columnElements = driver.findElements(By.xpath(tablecolumndataonwhichsortingapplied));
			List<String> actualColumnDatabeforefilter = new ArrayList<>();

			for (WebElement element : columnElements) {
				actualColumnDatabeforefilter.add(element.getText());
			}
			
			System.out.println("The Fetched data before sorting is: " + actualColumnDatabeforefilter);
			
			Thread.sleep(1500);
			clickBtnByXPath(tablecolumnnameonwhichsortingapplied);
			Thread.sleep(8000);
			
			clickBtnByXPath(tablecolumnnameonwhichsortingapplied);
			Thread.sleep(8000);
			
			int downarrowcount = countingSizeByXPath("(//img[@class='down-arrow'])[1]");
			if(downarrowcount>=1)
			{
				System.out.println("The decending order results are selected ");
			List<WebElement> columnElements1 = driver.findElements(By.xpath(tablecolumndataonwhichsortingapplied));
			List<String> actualColumnDataafterfilter = new ArrayList<>();

			for (WebElement element : columnElements1) {
				actualColumnDataafterfilter.add(element.getText());
			}
			
			System.out.println("The fetched data after sorting is: " + actualColumnDataafterfilter);
//			List<String> actualColumnData1 = new ArrayList<>(actualColumnData);
			Collections.sort(actualColumnDatabeforefilter, String.CASE_INSENSITIVE_ORDER.reversed()); // Ascending order sorting

			System.out.println("The fetched results after sorting is: "+actualColumnDatabeforefilter);
			// Verify if the column data is correctly sorted
			if(actualColumnDatabeforefilter.equals(actualColumnDataafterfilter))
			{
				System.out.println("Column is sorted correctly by decending order.");
				flag = true;
			}
			else
			{
				System.out.println("Column is not sorted correctly by decending order.");
				flag = false;
			}
	
		} 
			else
			{
				System.out.println("The decending order results are not selected ");
				flag = false;
			}
			}
			
			else {
			System.out.println("No records are present in table");
		}
			
			
		return flag;
		
	}
	
//	public boolean ignore_verifyAscendingOrderSortingFunctionalityOfDateColumn(String tablecolumndataonwhichsortingapplied, String tablecolumnnameonwhichsortingapplied, String totalarrowscount, String uparrowelement) throws InterruptedException 
//	{	
////		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM dd, yyyy");
//		DateTimeFormatter formatter = new DateTimeFormatterBuilder().parseCaseInsensitive()
//	            .append(DateTimeFormatter.ofPattern("MMM dd, yyyy")).toFormatter();
//		
//		int totalrecordsintablecount = countingSizeByXPath(tablecolumndataonwhichsortingapplied);
//		if(totalrecordsintablecount>0)
//		{
//		selectOptionByText("(//select[@name ='datatable_length'])[1]", "500");
//		Thread.sleep(2000);
//		
//		int arrowcount= countingSizeByXPath(totalarrowscount);
//		if(arrowcount>=2)
//		{
//			scrollToAnElement(tablecolumnnameonwhichsortingapplied);
//			Thread.sleep(1000);
//			clickBtnByXPath(tablecolumnnameonwhichsortingapplied);
//			Thread.sleep(3000);
//			clickBtnByXPath(tablecolumnnameonwhichsortingapplied);
//			Thread.sleep(3000);
//		int uparrowcount = countingSizeByXPath(uparrowelement);
//		if(uparrowcount>=1)
//		{
//		
//		List<WebElement> columnElements = driver.findElements(By.xpath(tablecolumndataonwhichsortingapplied));
//		
//		List<String> actualColumnData = new ArrayList<>();
//
//		for (WebElement element : columnElements) {
//			actualColumnData.add(element.getText());
//		}
//		
//		 List<LocalDate> dates = new ArrayList<>();
//	        for (String dateString : actualColumnData) {
//	            dates.add(LocalDate.parse(dateString, formatter));
//	        }
//		
//		System.out.println("The Fetched results are: " + dates);
//		List<String> actualColumnData1 = new ArrayList<>(actualColumnData);
//		Collections.sort(dates); 
//
//		System.out.println("The expected results after sorting are: "+dates);
//     	List<LocalDate> datesbeforefilter = new ArrayList<>();
//	        for (String dateString : actualColumnData1) {
//	        	datesbeforefilter.add(LocalDate.parse(dateString, formatter));
//	        }
//     	
//         if(dates.equals(datesbeforefilter))
//         {
//         	System.out.println("The results after Ascending sorting are same i.e. "+dates);
//         	flag = true;
//         }
//         else
//         {
//         	System.out.println("The results after Ascending sorting are different i.e. "+dates);
//         	flag = false;
//         }
//        }
//			else
//			{
//				System.out.println("Up arrow is not displayed");
//				flag = false;
//			}
//
//		}
//		
//		else 
//		{
//			System.out.println("The two arrows are not displayed.");
//			Thread.sleep(1500);
//			
//			int uparrowcount1 = countingSizeByXPath(uparrowelement);
//			if(uparrowcount1>=1)
//			{
//			
//			List<WebElement> columnElements = driver.findElements(By.xpath(tablecolumndataonwhichsortingapplied));
//			List<String> actualColumnData = new ArrayList<>();
//
//			for (WebElement element : columnElements) {
//				actualColumnData.add(element.getText());
//			}
//			
//			 List<LocalDate> dates = new ArrayList<>();
//		        for (String dateString : actualColumnData) {
//		            dates.add(LocalDate.parse(dateString, formatter));
//		        }
//			
//			System.out.println("The Fetched results are: " + dates);
//			List<String> actualColumnData1 = new ArrayList<>(actualColumnData);
//			Collections.sort(dates); 
//
//			System.out.println("The expected results after sorting are: "+dates);
//	        	List<LocalDate> datesbeforefilter = new ArrayList<>();
//		        for (String dateString : actualColumnData1) {
//		        	datesbeforefilter.add(LocalDate.parse(dateString, formatter));
//		        }
//	        	
//	            if(dates.equals(datesbeforefilter))
//	            {
//	            	System.out.println("The results after Ascending sorting are same i.e. "+dates);
//	            	flag = true;
//	            }
//	            else
//	            {
//	            	System.out.println("The results after Ascending sorting are different i.e. "+dates);
//	            	flag = false;
//	            }
//			}
//			
//			
//			else
//			{
//				scrollToAnElement(tablecolumnnameonwhichsortingapplied);
//				Thread.sleep(1000);
//				clickBtnByXPath(tablecolumnnameonwhichsortingapplied);
//				Thread.sleep(3000);
//				
//				int uparrowcount2 = countingSizeByXPath(uparrowelement);
//				if(uparrowcount2>=1)
//				{
//				System.out.println("The Ascending order results are selected ");
//				List<WebElement> columnElements = driver.findElements(By.xpath(tablecolumndataonwhichsortingapplied));
//				List<String> actualColumnData = new ArrayList<>();
//
//				for (WebElement element : columnElements) {
//					actualColumnData.add(element.getText());
//				}
//				
//				 List<LocalDate> dates = new ArrayList<>();
//			        for (String dateString : actualColumnData) {
//			            dates.add(LocalDate.parse(dateString, formatter));
//			        }
//				
//				System.out.println("The Fetched results are: " + dates);
//				List<String> actualColumnData1 = new ArrayList<>(actualColumnData);
//				Collections.sort(dates); 
//
//				System.out.println("The expected results after sorting are: "+dates);
//		        	List<LocalDate> datesbeforefilter = new ArrayList<>();
//			        for (String dateString : actualColumnData1) {
//			        	datesbeforefilter.add(LocalDate.parse(dateString, formatter));
//			        }
//		        	
//		            if(dates.equals(datesbeforefilter))
//		            {
//		            	System.out.println("The results after Ascending sorting are same i.e. "+dates);
//		            	flag = true;
//		            }
//		            else
//		            {
//		            	System.out.println("The results after Ascending sorting are different i.e. "+dates);
//		            	flag = false;
//		            }
//				}
//			}
//		}
//		
//
//	} 
//		else 
//		{
//		System.out.println("No records are present in table");
//		}
//		
//	return flag;
//	}

//	public boolean ignore_verifyDecendingOrderSortingFunctionalityOfDateColumn(String tablecolumndataonwhichsortingapplied, String tablecolumnnameonwhichsortingapplied) throws InterruptedException 
//	{	
////		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM dd, yyyy");
//
//		DateTimeFormatter formatter = new DateTimeFormatterBuilder().parseCaseInsensitive()
//	            .append(DateTimeFormatter.ofPattern("MMM dd, yyyy")).toFormatter();
//		
//			int totalrecordsintablecount = countingSizeByXPath(tablecolumndataonwhichsortingapplied);
//			if(totalrecordsintablecount>0)
//			{
//			selectOptionByText("(//select[@name ='datatable_length'])[1]", "500");
//			Thread.sleep(2000);
//			
//			List<WebElement> columnElements = driver.findElements(By.xpath(tablecolumndataonwhichsortingapplied));
//			List<String> actualColumnDatabeforefilter = new ArrayList<>();
//
//			for (WebElement element : columnElements) {
//				actualColumnDatabeforefilter.add(element.getText());
//			}
//			
//			List<LocalDate> dates = new ArrayList<>();
//	        for (String dateString : actualColumnDatabeforefilter) {
//	            dates.add(LocalDate.parse(dateString, formatter));
//	        }
//		
//		System.out.println("The Fetched results before applying filter are: " + dates);
//		dates.sort(Comparator.reverseOrder());
//		System.out.println("The expected results for descending order filter are: " + dates);
//			Thread.sleep(1500);
//			clickBtnByXPath(tablecolumnnameonwhichsortingapplied);
//			Thread.sleep(3000);
//			
//			clickBtnByXPath(tablecolumnnameonwhichsortingapplied);
//			Thread.sleep(5000);
//			
//			int downarrowcount = countingSizeByXPath("(//img[@class='down-arrow'])[1]");
//			if(downarrowcount>=1)
//			{
//				System.out.println("The decending order results are selected ");
//			List<WebElement> columnElements1 = driver.findElements(By.xpath(tablecolumndataonwhichsortingapplied));
//			List<String> actualColumnDataafterfilter = new ArrayList<>();
//
//			for (WebElement element : columnElements1) {
//				actualColumnDataafterfilter.add(element.getText());
//			}
//			
//			List<LocalDate> datesafterfilter = new ArrayList<>();
//	        for (String dateString : actualColumnDataafterfilter) {
//	        	datesafterfilter.add(LocalDate.parse(dateString, formatter));
//	        }
//        	
//            if(dates.equals(datesafterfilter))
//            {
//            	System.out.println("The results after descendig order sorting are same i.e. "+dates);
//            	flag = true;
//            }
//            else
//            {
//            	System.out.println("The results after descendig order sorting are different i.e. "+dates);
//            	flag = false;
//            }
//			
//		} 
//			else
//			{
//				System.out.println("The descending order results are not selected ");
//				flag = false;
//			}
//			}
//			
//			else {
//			System.out.println("No records are present in table");
//		}
//			
//			
//		return flag;
//		
//	}
//	
	//============================================================
	
	public boolean verifyAscendingOrderSortingFunctionalityOfDateColumn(String tablecolumndataonwhichsortingapplied, String tablecolumnnameonwhichsortingapplied, String totalarrowscount, String uparrowelement) throws InterruptedException 
	{	
//		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM dd, yyyy");
		DateTimeFormatter formatter = new DateTimeFormatterBuilder().parseCaseInsensitive()
	            .append(DateTimeFormatter.ofPattern("MMM dd, yyyy")).toFormatter();
		DateTimeFormatter formatter1 = new DateTimeFormatterBuilder().parseCaseInsensitive()
	            .append(DateTimeFormatter.ofPattern("MMMM dd, yyyy")).toFormatter();
		
		int totalrecordsintablecount = countingSizeByXPath(tablecolumndataonwhichsortingapplied);
		if(totalrecordsintablecount>0)
		{
		selectOptionByText("(//select[@name ='datatable_length'])[1]", "500");
		Thread.sleep(8000);
		
		int arrowcount= countingSizeByXPath(totalarrowscount);
		if(arrowcount>=2)
		{
			scrollToAnElement(tablecolumnnameonwhichsortingapplied);
			Thread.sleep(1000);
			clickBtnByXPath(tablecolumnnameonwhichsortingapplied);
			Thread.sleep(8000);
			clickBtnByXPath(tablecolumnnameonwhichsortingapplied);
			Thread.sleep(8000);
		int uparrowcount = countingSizeByXPath(uparrowelement);
		if(uparrowcount>=1)
		{
		
		List<WebElement> columnElements = driver.findElements(By.xpath(tablecolumndataonwhichsortingapplied));
		
		List<String> actualColumnData = new ArrayList<>();

		for (WebElement element : columnElements) {
			actualColumnData.add(element.getText());
		}
		
		 List<LocalDate> dates = new ArrayList<>();
	        for (String dateString : actualColumnData) {
	        	 LocalDate parsedDate = parseDate(dateString, formatter, formatter1);
	                dates.add(parsedDate);
//	            dates.add(LocalDate.parse(dateString, formatter));
	        }
		
		System.out.println("The Fetched results are: " + dates);
		List<String> actualColumnData1 = new ArrayList<>(actualColumnData);
		Collections.sort(dates); 

		System.out.println("The expected results after sorting are: "+dates);
     	List<LocalDate> datesbeforefilter = new ArrayList<>();
	        for (String dateString : actualColumnData1) {
	        	LocalDate parsedDate = parseDate(dateString, formatter, formatter1);
	        	datesbeforefilter.add(parsedDate);
//	        	datesbeforefilter.add(LocalDate.parse(dateString, formatter));
	        }
     	
         if(dates.equals(datesbeforefilter))
         {
         	System.out.println("The results after Ascending sorting are same i.e. "+dates);
         	flag = true;
         }
         else
         {
         	System.out.println("The results after Ascending sorting are different i.e. "+dates);
         	flag = false;
         }
        }
			else
			{
				System.out.println("Up arrow is not displayed");
				flag = false;
			}

		}
		
		else 
		{
			System.out.println("The two arrows are not displayed.");
			Thread.sleep(1500);
			
			int uparrowcount1 = countingSizeByXPath(uparrowelement);
			if(uparrowcount1>=1)
			{
			
			List<WebElement> columnElements = driver.findElements(By.xpath(tablecolumndataonwhichsortingapplied));
			List<String> actualColumnData = new ArrayList<>();

			for (WebElement element : columnElements) {
				actualColumnData.add(element.getText());
			}
			
			 List<LocalDate> dates = new ArrayList<>();
		        for (String dateString : actualColumnData) {
		        	LocalDate parsedDate = parseDate(dateString, formatter, formatter1);
	                dates.add(parsedDate);
//		            dates.add(LocalDate.parse(dateString, formatter));
		        }
			
			System.out.println("The Fetched results are: " + dates);
			List<String> actualColumnData1 = new ArrayList<>(actualColumnData);
			Collections.sort(dates); 

			System.out.println("The expected results after sorting are: "+dates);
	        	List<LocalDate> datesbeforefilter = new ArrayList<>();
		        for (String dateString : actualColumnData1) {
		        	LocalDate parsedDate = parseDate(dateString, formatter, formatter1);
		        	datesbeforefilter.add(parsedDate);
//		        	datesbeforefilter.add(LocalDate.parse(dateString, formatter));
		        }
	        	
	            if(dates.equals(datesbeforefilter))
	            {
	            	System.out.println("The results after Ascending sorting are same i.e. "+dates);
	            	flag = true;
	            }
	            else
	            {
	            	System.out.println("The results after Ascending sorting are different i.e. "+dates);
	            	flag = false;
	            }
			}
			
			
			else
			{
				scrollToAnElement(tablecolumnnameonwhichsortingapplied);
				Thread.sleep(1000);
				clickBtnByXPath(tablecolumnnameonwhichsortingapplied);
				Thread.sleep(8000);
				
				int uparrowcount2 = countingSizeByXPath(uparrowelement);
				if(uparrowcount2>=1)
				{
				System.out.println("The Ascending order results are selected ");
				List<WebElement> columnElements = driver.findElements(By.xpath(tablecolumndataonwhichsortingapplied));
				List<String> actualColumnData = new ArrayList<>();

				for (WebElement element : columnElements) {
					actualColumnData.add(element.getText());
				}
				
				 List<LocalDate> dates = new ArrayList<>();
			        for (String dateString : actualColumnData) {
			        	LocalDate parsedDate = parseDate(dateString, formatter, formatter1);
		                dates.add(parsedDate);
//			            dates.add(LocalDate.parse(dateString, formatter));
			        }
				
				System.out.println("The Fetched results are: " + dates);
				List<String> actualColumnData1 = new ArrayList<>(actualColumnData);
				Collections.sort(dates); 

				System.out.println("The expected results after sorting are: "+dates);
		        	List<LocalDate> datesbeforefilter = new ArrayList<>();
			        for (String dateString : actualColumnData1) {
			        	LocalDate parsedDate = parseDate(dateString, formatter, formatter1);
			        	datesbeforefilter.add(parsedDate);
//			        	datesbeforefilter.add(LocalDate.parse(dateString, formatter));
			        }
		        	
		            if(dates.equals(datesbeforefilter))
		            {
		            	System.out.println("The results after Ascending sorting are same i.e. "+dates);
		            	flag = true;
		            }
		            else
		            {
		            	System.out.println("The results after Ascending sorting are different i.e. "+dates);
		            	flag = false;
		            }
				}
			}
		}
		

	} 
		else 
		{
		System.out.println("No records are present in table");
		}
		
	return flag;
	}

	public boolean verifyDecendingOrderSortingFunctionalityOfDateColumn(String tablecolumndataonwhichsortingapplied, String tablecolumnnameonwhichsortingapplied) throws InterruptedException 
	{	
//		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM dd, yyyy");

		DateTimeFormatter formatter = new DateTimeFormatterBuilder().parseCaseInsensitive()
	            .append(DateTimeFormatter.ofPattern("MMM dd, yyyy")).toFormatter();
		DateTimeFormatter formatter1 = new DateTimeFormatterBuilder().parseCaseInsensitive()
	            .append(DateTimeFormatter.ofPattern("MMMM dd, yyyy")).toFormatter();
		
			int totalrecordsintablecount = countingSizeByXPath(tablecolumndataonwhichsortingapplied);
			if(totalrecordsintablecount>0)
			{
			selectOptionByText("(//select[@name ='datatable_length'])[1]", "500");
			Thread.sleep(8000);
			
			List<WebElement> columnElements = driver.findElements(By.xpath(tablecolumndataonwhichsortingapplied));
			List<String> actualColumnDatabeforefilter = new ArrayList<>();

			for (WebElement element : columnElements) {
				actualColumnDatabeforefilter.add(element.getText());
			}
			
			List<LocalDate> dates = new ArrayList<>();
	        for (String dateString : actualColumnDatabeforefilter) {
	        	LocalDate parsedDate = parseDate(dateString, formatter, formatter1);
                dates.add(parsedDate);
//	            dates.add(LocalDate.parse(dateString, formatter));
	        }
		
		System.out.println("The Fetched results before applying filter are: " + dates);
		dates.sort(Comparator.reverseOrder());
		System.out.println("The expected results for descending order filter are: " + dates);
			Thread.sleep(1500);
			clickBtnByXPath(tablecolumnnameonwhichsortingapplied);
			Thread.sleep(8000);
			
			clickBtnByXPath(tablecolumnnameonwhichsortingapplied);
			Thread.sleep(8000);
			
			int downarrowcount = countingSizeByXPath("(//img[@class='down-arrow'])[1]");
			if(downarrowcount>=1)
			{
				System.out.println("The decending order results are selected ");
			List<WebElement> columnElements1 = driver.findElements(By.xpath(tablecolumndataonwhichsortingapplied));
			List<String> actualColumnDataafterfilter = new ArrayList<>();

			for (WebElement element : columnElements1) {
				
				actualColumnDataafterfilter.add(element.getText());
			}
			
			List<LocalDate> datesafterfilter = new ArrayList<>();
	        for (String dateString : actualColumnDataafterfilter) {
	        	LocalDate parsedDate = parseDate(dateString, formatter, formatter1);
	        	datesafterfilter.add(parsedDate);
//	        	datesafterfilter.add(LocalDate.parse(dateString, formatter));
	        }
        	
            if(dates.equals(datesafterfilter))
            {
            	System.out.println("The results after descendig order sorting are same i.e. "+dates);
            	flag = true;
            }
            else
            {
            	System.out.println("The results after descendig order sorting are different i.e. "+dates);
            	flag = false;
            }
			
		} 
			else
			{
				System.out.println("The descending order results are not selected ");
				flag = false;
			}
			}
			
			else {
			System.out.println("No records are present in table");
		}
			
			
		return flag;
		
	}
	
	
	//===================================================
//	public boolean verifyAscendingOrderSortingFunctionalityOfDateAndTimeColumntest(String tablecolumndataonwhichsortingapplied, String tablecolumnnameonwhichsortingapplied, String totalarrowscount, String uparrowelement) throws InterruptedException 
//	{	
////		DateTimeFormatter formatter = new DateTimeFormatterBuilder().parseCaseInsensitive()
////	            .append(DateTimeFormatter.ofPattern("MMM dd, yyyy hh:mm a")).toFormatter();
//		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM dd, yyyy h:mm a");
//		DateTimeFormatter singleDigitHourFormatter = DateTimeFormatter.ofPattern("MMM dd, yyyy h:mm a");
//        DateTimeFormatter doubleDigitHourFormatter = DateTimeFormatter.ofPattern("MMM dd, yyyy hh:mm a");
//
//		int totalrecordsintablecount = countingSizeByXPath(tablecolumndataonwhichsortingapplied);
//		if(totalrecordsintablecount>0)
//		{
//		selectOptionByText("(//select[@name ='datatable_length'])[1]", "500");
//		Thread.sleep(2000);
//		
//		int arrowcount= countingSizeByXPath(totalarrowscount);
//		if(arrowcount>=2)
//		{
//			scrollToAnElement(tablecolumnnameonwhichsortingapplied);
//			Thread.sleep(1000);
//			clickBtnByXPath(tablecolumnnameonwhichsortingapplied);
//			Thread.sleep(3000);
//			clickBtnByXPath(tablecolumnnameonwhichsortingapplied);
//			Thread.sleep(3000);
//		int uparrowcount = countingSizeByXPath(uparrowelement);
//		if(uparrowcount>=1)
//		{
//		
//		List<WebElement> columnElements = driver.findElements(By.xpath(tablecolumndataonwhichsortingapplied));
//		
//		List<String> actualColumnData = new ArrayList<>();
//
//		for (WebElement element : columnElements) {
//			actualColumnData.add(element.getText());
//		}
//		
//		 List<LocalDateTime> dates = new ArrayList<>();
//	        for (String dateString : actualColumnData) {
//	            dates.add(LocalDateTime.parse(dateString, formatter));
//	        }
//		
//		System.out.println("The Fetched results are: " + dates);
//		List<String> actualColumnData1 = new ArrayList<>(actualColumnData);
//		Collections.sort(dates); 
//
//		System.out.println("The expected results after sorting are: "+dates);
//     	List<LocalDateTime> datesbeforefilter = new ArrayList<>();
//	        for (String dateString : actualColumnData1) {
//	        	datesbeforefilter.add(LocalDateTime.parse(dateString, formatter));
//	        }
//     	
//         if(dates.equals(datesbeforefilter))
//         {
//         	System.out.println("The results after sorting are same i.e. "+dates);
//         	flag = true;
//         }
//         else
//         {
//         	System.out.println("The results after sorting are different i.e. "+dates);
//         	flag = false;
//         }
//        }
//			else
//			{
//				System.out.println("Up arrow is not displayed");
//				flag = false;
//			}
//
//		}
//		
//		else 
//		{
//			System.out.println("The two arrows are not displayed.");
//			Thread.sleep(1500);
//			
//			int uparrowcount1 = countingSizeByXPath(uparrowelement);
//			if(uparrowcount1>=1)
//			{
//			
//			List<WebElement> columnElements = driver.findElements(By.xpath(tablecolumndataonwhichsortingapplied));
//			List<String> actualColumnData = new ArrayList<>();
//
//			for (WebElement element : columnElements) {
//				actualColumnData.add(element.getText());
//			}
//			
//			 List<LocalDateTime> dates = new ArrayList<>();
//		        for (String dateString : actualColumnData) {
//		            dates.add(LocalDateTime.parse(dateString, formatter));
//		        }
//			
//			System.out.println("The Fetched results are: " + dates);
//			List<String> actualColumnData1 = new ArrayList<>(actualColumnData);
//			Collections.sort(dates); 
//
//			System.out.println("The expected results after sorting are: "+dates);
//	        	List<LocalDateTime> datesbeforefilter = new ArrayList<>();
//		        for (String dateString : actualColumnData1) {
//		        	datesbeforefilter.add(LocalDateTime.parse(dateString, formatter));
//		        }
//	        	
//	            if(dates.equals(datesbeforefilter))
//	            {
//	            	System.out.println("The results after sorting are same i.e. "+dates);
//	            	flag = true;
//	            }
//	            else
//	            {
//	            	System.out.println("The results after sorting are different i.e. "+dates);
//	            	flag = false;
//	            }
//			}
//			
//			
//			else
//			{
//				scrollToAnElement(tablecolumnnameonwhichsortingapplied);
//				Thread.sleep(1000);
//				clickBtnByXPath(tablecolumnnameonwhichsortingapplied);
//				Thread.sleep(3000);
//				
//				int uparrowcount2 = countingSizeByXPath(uparrowelement);
//				if(uparrowcount2>=1)
//				{
//				System.out.println("The Ascending order results are selected ");
//				List<WebElement> columnElements = driver.findElements(By.xpath(tablecolumndataonwhichsortingapplied));
//				List<String> actualColumnData = new ArrayList<>();
//
//				for (WebElement element : columnElements) {
//					actualColumnData.add(element.getText());
//				}
//				System.out.println("The actual column data is "+actualColumnData);
//				 List<LocalDateTime> dates = new ArrayList<>();
//			        for (String dateString : actualColumnData) { // 0(\\d):", " $1: // (\\d):", " 0$1:
//			        	String normalizedDate = dateString.replaceAll(" (\\d):", " 0$1:");
//			        	dates.add(LocalDateTime.parse(normalizedDate, formatter));
////			        	LocalDateTime parseDate = parseDate(dateString, doubleDigitHourFormatter,singleDigitHourFormatter);
////			            dates.add(parseDate);
//			        }
//				
//				System.out.println("The Fetched results are: " + dates);
//				List<String> actualColumnData1 = new ArrayList<>(actualColumnData);
//				Collections.sort(dates); 
//
//				System.out.println("The expected results after sorting are: "+dates);
//		        	List<LocalDateTime> datesbeforefilter = new ArrayList<>();
//			        for (String dateString : actualColumnData1) {
//			        	String normalizedDate = dateString.replaceAll(" (\\d):", " 0$1:");
////			        	dates.add(LocalDateTime.parse(normalizedDate, formatter));
////			        	LocalDateTime parseDate = parseDate(dateString, doubleDigitHourFormatter,singleDigitHourFormatter);
////			            dates.add(parseDate);
//			        	datesbeforefilter.add(LocalDateTime.parse(normalizedDate, formatter));
//			        }
//		        	
//		            if(dates.equals(datesbeforefilter))
//		            {
//		            	System.out.println("The results after Ascending sorting are same i.e. "+dates);
//		            	flag = true;
//		            }
//		            else
//		            {
//		            	System.out.println("The results after Ascending sorting are different i.e. "+dates);
//		            	flag = false;
//		            }
//				}
//			}
//		}
//		
//
//	} 
//		else 
//		{
//		System.out.println("No records are present in table");
//		}
//		
//	return flag;
//	}
	
	 private static LocalDate parseDate(String dateString, DateTimeFormatter... formatters) {
	        for (DateTimeFormatter formatter : formatters) {
	            try {
	                return LocalDate.parse(dateString, formatter);
	            } catch (DateTimeParseException e) {
	                // Continue to the next formatter if parsing fails
	            }
	        }
	        throw new IllegalArgumentException("Date format not supported: " + dateString);
	    }
	 
	 public boolean verifyAscendingOrderSortingFunctionalityOfDateTimeColumn(String tablecolumndataonwhichsortingapplied, String tablecolumnnameonwhichsortingapplied, String totalarrowscount, String uparrowelement) throws InterruptedException 
		{	
//			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM dd, yyyy");
			DateTimeFormatter formatter = new DateTimeFormatterBuilder().parseCaseInsensitive()
		            .append(DateTimeFormatter.ofPattern("MMM dd, yyyy h:mm a")).toFormatter();
			DateTimeFormatter formatter1 = new DateTimeFormatterBuilder().parseCaseInsensitive()
		            .append(DateTimeFormatter.ofPattern("MMM dd, yyyy hh:mm a")).toFormatter();
			
			int totalrecordsintablecount = countingSizeByXPath(tablecolumndataonwhichsortingapplied);
			if(totalrecordsintablecount>0)
			{
			selectOptionByText("(//select[@name ='datatable_length'])[1]", "500");
			Thread.sleep(8000);
			
			int arrowcount= countingSizeByXPath(totalarrowscount);
			if(arrowcount>=2)
			{
				scrollToAnElement(tablecolumnnameonwhichsortingapplied);
				Thread.sleep(1000);
				clickBtnByXPath(tablecolumnnameonwhichsortingapplied);
				Thread.sleep(8000);
				clickBtnByXPath(tablecolumnnameonwhichsortingapplied);
				Thread.sleep(8000);
			int uparrowcount = countingSizeByXPath(uparrowelement);
			if(uparrowcount>=1)
			{
			
			List<WebElement> columnElements = driver.findElements(By.xpath(tablecolumndataonwhichsortingapplied));
			
			List<String> actualColumnData = new ArrayList<>();

			for (WebElement element : columnElements) {
				actualColumnData.add(element.getText());
			}
			
			 List<LocalDateTime> dates = new ArrayList<>();
		        for (String dateString : actualColumnData) {
		        	LocalDateTime parsedDate = parseDateTime(dateString, formatter, formatter1);
		                dates.add(parsedDate);
//		            dates.add(LocalDate.parse(dateString, formatter));
		        }
			
			System.out.println("The Fetched results are: " + dates);
			List<String> actualColumnData1 = new ArrayList<>(actualColumnData);
			Collections.sort(dates); 

			System.out.println("The expected results after sorting are: "+dates);
	     	List<LocalDateTime> datesbeforefilter = new ArrayList<>();
		        for (String dateString : actualColumnData1) {
		        	LocalDateTime parsedDate = parseDateTime(dateString, formatter, formatter1);
		        	datesbeforefilter.add(parsedDate);
//		        	datesbeforefilter.add(LocalDate.parse(dateString, formatter));
		        }
	     	
	         if(dates.equals(datesbeforefilter))
	         {
	         	System.out.println("The results after Ascending sorting are same i.e. "+dates);
	         	flag = true;
	         }
	         else
	         {
	         	System.out.println("The results after Ascending sorting are different i.e. "+dates);
	         	flag = false;
	         }
	        }
				else
				{
					System.out.println("Up arrow is not displayed");
					flag = false;
				}

			}
			
			else 
			{
				System.out.println("The two arrows are not displayed.");
				Thread.sleep(1500);
				
				int uparrowcount1 = countingSizeByXPath(uparrowelement);
				if(uparrowcount1>=1)
				{
				
				List<WebElement> columnElements = driver.findElements(By.xpath(tablecolumndataonwhichsortingapplied));
				List<String> actualColumnData = new ArrayList<>();

				for (WebElement element : columnElements) {
					actualColumnData.add(element.getText());
				}
				
				 List<LocalDateTime> dates = new ArrayList<>();
			        for (String dateString : actualColumnData) {
			        	LocalDateTime parsedDate = parseDateTime(dateString, formatter, formatter1);
		                dates.add(parsedDate);
//			            dates.add(LocalDate.parse(dateString, formatter));
			        }
				
				System.out.println("The Fetched results are: " + dates);
				List<String> actualColumnData1 = new ArrayList<>(actualColumnData);
				Collections.sort(dates); 

				System.out.println("The expected results after sorting are: "+dates);
		        	List<LocalDateTime> datesbeforefilter = new ArrayList<>();
			        for (String dateString : actualColumnData1) {
			        	LocalDateTime parsedDate = parseDateTime(dateString, formatter, formatter1);
			        	datesbeforefilter.add(parsedDate);
//			        	datesbeforefilter.add(LocalDate.parse(dateString, formatter));
			        }
		        	
		            if(dates.equals(datesbeforefilter))
		            {
		            	System.out.println("The results after Ascending sorting are same i.e. "+dates);
		            	flag = true;
		            }
		            else
		            {
		            	System.out.println("The results after Ascending sorting are different i.e. "+dates);
		            	flag = false;
		            }
				}
				
				
				else
				{
					scrollToAnElement(tablecolumnnameonwhichsortingapplied);
					Thread.sleep(1000);
					clickBtnByXPath(tablecolumnnameonwhichsortingapplied);
					Thread.sleep(8000);
					
					int uparrowcount2 = countingSizeByXPath(uparrowelement);
					if(uparrowcount2>=1)
					{
					System.out.println("The Ascending order results are selected ");
					List<WebElement> columnElements = driver.findElements(By.xpath(tablecolumndataonwhichsortingapplied));
					List<String> actualColumnData = new ArrayList<>();

					for (WebElement element : columnElements) {
						actualColumnData.add(element.getText());
					}
					
					 List<LocalDateTime> dates = new ArrayList<>();
				        for (String dateString : actualColumnData) {
				        	LocalDateTime parsedDate = parseDateTime(dateString, formatter, formatter1);
			                dates.add(parsedDate);
//				            dates.add(LocalDate.parse(dateString, formatter));
				        }
					
					System.out.println("The Fetched results are: " + dates);
					List<String> actualColumnData1 = new ArrayList<>(actualColumnData);
					Collections.sort(dates); 

					System.out.println("The expected results after sorting are: "+dates);
			        	List<LocalDateTime> datesbeforefilter = new ArrayList<>();
				        for (String dateString : actualColumnData1) {
				        	LocalDateTime parsedDate = parseDateTime(dateString, formatter, formatter1);
				        	datesbeforefilter.add(parsedDate);
//				        	datesbeforefilter.add(LocalDate.parse(dateString, formatter));
				        }
			        	
			            if(dates.equals(datesbeforefilter))
			            {
			            	System.out.println("The results after Ascending sorting are same i.e. "+dates);
			            	flag = true;
			            }
			            else
			            {
			            	System.out.println("The results after Ascending sorting are different i.e. "+dates);
			            	flag = false;
			            }
					}
				}
			}
			

		} 
			else 
			{
			System.out.println("No records are present in table");
			}
			
		return flag;
		}
	 
	 public boolean verifyDecendingOrderSortingFunctionalityOfDateTimeColumn(String tablecolumndataonwhichsortingapplied, String tablecolumnnameonwhichsortingapplied) throws InterruptedException 
		{	
		 DateTimeFormatter formatter = new DateTimeFormatterBuilder().parseCaseInsensitive()
		            .append(DateTimeFormatter.ofPattern("MMM dd, yyyy h:mm a")).toFormatter();
			DateTimeFormatter formatter1 = new DateTimeFormatterBuilder().parseCaseInsensitive()
		            .append(DateTimeFormatter.ofPattern("MMM dd, yyyy hh:mm a")).toFormatter();
			
				int totalrecordsintablecount = countingSizeByXPath(tablecolumndataonwhichsortingapplied);
				if(totalrecordsintablecount>0)
				{
				selectOptionByText("(//select[@name ='datatable_length'])[1]", "500");
				Thread.sleep(8000);
				
				List<WebElement> columnElements = driver.findElements(By.xpath(tablecolumndataonwhichsortingapplied));
				List<String> actualColumnDatabeforefilter = new ArrayList<>();

				for (WebElement element : columnElements) {
					actualColumnDatabeforefilter.add(element.getText());
				}
				
				List<LocalDateTime> dates = new ArrayList<>();
		        for (String dateString : actualColumnDatabeforefilter) {
		        	LocalDateTime parsedDate = parseDateTime(dateString, formatter, formatter1);
		        	dates.add(parsedDate);
		        	
//		            dates.add(LocalDateTime.parse(dateString, formatter));
		        }
			
			System.out.println("The Fetched results before applying filter are: " + dates);
			dates.sort(Comparator.reverseOrder());
			System.out.println("The expected results for descending order filter are: " + dates);
				Thread.sleep(1500);
				clickBtnByXPath(tablecolumnnameonwhichsortingapplied);
				Thread.sleep(8000);
				
				clickBtnByXPath(tablecolumnnameonwhichsortingapplied);
				Thread.sleep(8000);
				
				int downarrowcount = countingSizeByXPath("(//img[@class='down-arrow'])[1]");
				if(downarrowcount>=1)
				{
					System.out.println("The decending order results are selected ");
				List<WebElement> columnElements1 = driver.findElements(By.xpath(tablecolumndataonwhichsortingapplied));
				List<String> actualColumnDataafterfilter = new ArrayList<>();

				for (WebElement element : columnElements1) {
					actualColumnDataafterfilter.add(element.getText());
				}
				
				List<LocalDateTime> datesafterfilter = new ArrayList<>();
		        for (String dateString : actualColumnDataafterfilter) {
		        	LocalDateTime parsedDate = parseDateTime(dateString, formatter, formatter1);
		        	datesafterfilter.add(parsedDate);
//		        	datesafterfilter.add(LocalDateTime.parse(dateString, formatter));
		        }
	        	
	            if(dates.equals(datesafterfilter))
	            {
	            	System.out.println("The results after descendig order sorting are same i.e. "+dates);
	            	flag = true;
	            }
	            else
	            {
	            	System.out.println("The results after descendig order sorting are different i.e. "+dates);
	            	flag = false;
	            }
				
			} 
				else
				{
					System.out.println("The descending order results are not selected ");
					flag = false;
				}
				}
				
				else {
				System.out.println("No records are present in table");
			}
				
				
			return flag;
			
		}
	 
	 private static LocalDateTime parseDateTime(String dateString, DateTimeFormatter... formatters) {
	        for (DateTimeFormatter formatter : formatters) {
	            try {
	                return LocalDateTime.parse(dateString, formatter);
	            } catch (DateTimeParseException e) {
	                // Continue to the next formatter if parsing fails
	            }
	        }
	        throw new IllegalArgumentException("Date format not supported: " + dateString);
	    }

//	public boolean verifyDecendingOrderSortingFunctionalityOfDateAndTimeColumn(String tablecolumndataonwhichsortingapplied, String tablecolumnnameonwhichsortingapplied) throws InterruptedException 
//	{	
//		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM dd, yyyy h:mm a");
//
//			int totalrecordsintablecount = countingSizeByXPath(tablecolumndataonwhichsortingapplied);
//			if(totalrecordsintablecount>0)
//			{
//			selectOptionByText("(//select[@name ='datatable_length'])[1]", "500");
//			Thread.sleep(2000);
//			
//			List<WebElement> columnElements = driver.findElements(By.xpath(tablecolumndataonwhichsortingapplied));
//			List<String> actualColumnDatabeforefilter = new ArrayList<>();
//
//			for (WebElement element : columnElements) {
//				actualColumnDatabeforefilter.add(element.getText());
//			}
//			
//			List<LocalDateTime> dates = new ArrayList<>();
//	        for (String dateString : actualColumnDatabeforefilter) {
//	            dates.add(LocalDateTime.parse(dateString, formatter));
//	        }
//		
//		System.out.println("The Fetched results before applying filter are: " + dates);
//		dates.sort(Comparator.reverseOrder());
//		System.out.println("The expected results for descending order filter are: " + dates);
//			Thread.sleep(1500);
//			clickBtnByXPath(tablecolumnnameonwhichsortingapplied);
//			Thread.sleep(3000);
//			
//			clickBtnByXPath(tablecolumnnameonwhichsortingapplied);
//			Thread.sleep(5000);
//			
//			int downarrowcount = countingSizeByXPath("(//img[@class='down-arrow'])[1]");
//			if(downarrowcount>=1)
//			{
//				System.out.println("The decending order results are selected ");
//			List<WebElement> columnElements1 = driver.findElements(By.xpath(tablecolumndataonwhichsortingapplied));
//			List<String> actualColumnDataafterfilter = new ArrayList<>();
//
//			for (WebElement element : columnElements1) {
//				actualColumnDataafterfilter.add(element.getText());
//			}
//			
//			List<LocalDateTime> datesafterfilter = new ArrayList<>();
//	        for (String dateString : actualColumnDataafterfilter) {
//	        	datesafterfilter.add(LocalDateTime.parse(dateString, formatter));
//	        }
//        	
//            if(dates.equals(datesafterfilter))
//            {
//            	System.out.println("The results after descendig order sorting are same i.e. "+dates);
//            	flag = true;
//            }
//            else
//            {
//            	System.out.println("The results after descendig order sorting are different i.e. "+dates);
//            	flag = false;
//            }
//			
//		} 
//			else
//			{
//				System.out.println("The descending order results are not selected ");
//				flag = false;
//			}
//			}
//			
//			else {
//			System.out.println("No records are present in table");
//		}
//			
//			
//		return flag;
//		
//	}

	
	public boolean verifyDateFilterFunctionality_testing() throws InterruptedException
	{
		// Define Date Format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy");

        // Input the start and end dates (Adjust selectors as per your page)
        WebElement startDateInput = driver.findElement(By.xpath("(//div[@class='vdp-datepicker']//input)[1]"));  // Adjust locator
        WebElement endDateInput = driver.findElement(By.xpath("(//div[@class='vdp-datepicker']//input)[2]"));      // Adjust locator
      
        // Generate dynamic dates (today's date and a start date 7 days ago)
        LocalDate endDate1 = LocalDate.now();
        LocalDate startDate1 = endDate1.minusDays(7);
        
        startDateString = startDate1.format(formatter);
        System.out.println("Start date is: "+startDateString);
        endDateString = endDate1.format(formatter);
        System.out.println("End date is: "+endDateString);

//        WebElement startDatePicker = driver.findElement(By.xpath("(//div[@class='vdp-datepicker']//input)[1]")); // Example locator
//        startDatePicker.click();
//        clickBtnByXPath("(//span[@class='cell day'])[1]");
//        Thread.sleep(1500);
        
        
        // Select start date dynamically from the date picker (Use your method to interact with the date picker)
//        selectDateFromDatePicker(driver, "(//span[@class='cell day'])[1]");  // Custom method to select a date

        // Locate and open the date picker for end date (Adjust the locator)
//        WebElement endDatePicker = driver.findElement(By.xpath("(//div[@class='vdp-datepicker']//input)[2]")); // Example locator
//        endDatePicker.click();
//        clickBtnByXPath("(//span[@class='cell day today'])[2]");
        
        
        // Select end date dynamically from the date picker
//        selectDateFromDatePicker(driver, "(//span[@class='cell day today'])[2]");  // Custom method to select a date

        
//        startDateInput.sendKeys(startDateString); // Example start date
//        Thread.sleep(1500);
//        endDateInput.sendKeys(endDateString);   // Example end date
        
     // Select start date using the date picker
        selectDateFromPicker(driver, "(//div[@class='vdp-datepicker']//input)[1]", startDateString); // Adjust locator
        // Select end date using the date picker
        selectDateFromPicker(driver, "(//div[@class='vdp-datepicker']//input)[2]", endDateString);     // Adjust locator

        Thread.sleep(3000);
        // Extract the dates from the table (Adjust table row/column locators)
        scrollToAnElement("(//div[@class='row']//table/tbody/tr/td[5])[1]");
        Thread.sleep(750);
        List<WebElement> dateElements = driver.findElements(By.xpath("//div[@class='row']//table/tbody/tr/td[5]"));  // Assuming date is in the first column

//        // Parse the start and end dates
//        LocalDate startDate = LocalDate.parse("2024-10-01", formatter);
//        LocalDate endDate = LocalDate.parse("2024-10-10", formatter);

        // Iterate over the extracted dates and validate
        for (WebElement dateElement : dateElements) {
        	
            String dateText = dateElement.getText();
            LocalDate tableDate = LocalDate.parse(dateText, formatter);
            
            if (tableDate.isBefore(startDate1) || tableDate.isAfter(endDate1)) {
                System.out.println("Date out of range: " + tableDate);
            } else {
                System.out.println("Date within range: " + tableDate);
            }
        }
        

		
		return flag;
	}
	
	 // Custom method to select a date from the date picker
	public static void selectDateFromPicker(WebDriver driver, String datePickerLocator, String dateFormatted) throws InterruptedException {
//        WebElement datePickerStartInput = driver.findElement(By.xpath("(//div[@class='vdp-datepicker']//input)[1]"));  // Adjust locator for date picker input
//        datePickerStartInput.clear();
//        datePickerStartInput.click();
//        Thread.sleep(750);
//        datePickerStartInput.sendKeys(startDateString);  // Send the formatted date string
//        
//        WebElement datePickerEndInput = driver.findElement(By.xpath("(//div[@class='vdp-datepicker']//input)[2]"));  // Adjust locator for date picker input
//        datePickerEndInput.clear();
//        datePickerEndInput.click();
//        Thread.sleep(750);
//        datePickerEndInput.sendKeys(endDateString);  // Send the formatted date string
        
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement datePicker = driver.findElement(By.xpath("(//div[@class='vdp-datepicker']//input)[1]"));  // Adjust locator for date picker
//        js.executeScript("arguments[0].value = arguments[1];", datePicker, startDateString);
        js.executeScript("arguments[0].value = arguments[1]; arguments[0].dispatchEvent(new Event('change'));", datePicker, startDateString);
        Thread.sleep(1500);
        
        
        WebElement enddatePicker = driver.findElement(By.xpath("(//div[@class='vdp-datepicker']//input)[2]"));  // Adjust locator for date picker
//        js.executeScript("arguments[0].value = arguments[1];", enddatePicker, endDateString);
        js.executeScript("arguments[0].value = arguments[1]; arguments[0].dispatchEvent(new Event('change'));", enddatePicker, endDateString);
        Thread.sleep(1500);
    }


	public boolean verifyDateFilterFunctionality(String tabledaterowcolumnelements, String norecordsfoundElement) throws InterruptedException
	{
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM d, yyyy");

		WebElement startDatePicker = driver.findElement(By.xpath("(//div[@class='vdp-datepicker']//input)[1]")); 
		startDatePicker.click();
		Thread.sleep(750);
		String startmonthyear = getTextByXPath("(//span[@class='day__month_btn up'])[1]");
		String[] parts = startmonthyear.split(" ");

		String month = parts[0];
		String year = parts[1];
		String startdate1 = getTextByXPath("(//span[@class='cell day'])[1]");
		Thread.sleep(750);
		String startdatefinal = month + " " + startdate1 + ", " + year;
		System.out.println("The start date is: " + startdatefinal);
		LocalDate startDate = LocalDate.parse(startdatefinal, formatter);
		System.out.println("The Start date selected is: " + startDate);
		clickBtnByXPath("(//span[@class='cell day'])[1]");
		
		Thread.sleep(1500);

		WebElement endDatePicker = driver.findElement(By.xpath("(//div[@class='vdp-datepicker']//input)[2]"));
		endDatePicker.click();
		Thread.sleep(750);
		clickBtnByXPath("(//span[@class='cell day today'])[2]");
		Thread.sleep(1500);
		LocalDate endDate1 = LocalDate.now();
		endDateString = endDate1.format(formatter);
		System.out.println("The End date selected is: " + endDateString);

		// Extract the dates from the table
//		scrollToAnElement("(//div[@class='row']//table/tbody/tr/td[5])[1]");
//		Thread.sleep(750);
		int resultscountafterfilter = countingSizeByXPath(tabledaterowcolumnelements);
		System.out.println("Total result count is: "+ resultscountafterfilter);
		if(resultscountafterfilter>0)
		{
		List<WebElement> dateElements = driver.findElements(By.xpath(tabledaterowcolumnelements));

		DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("MMMM d, yyyy");

		// Iterate over the extracted dates and validate
		for (WebElement dateElement : dateElements) 
		{

			String dateText = dateElement.getText().split(" \\d{1,2}:\\d{2} ")[0];

			LocalDate tableDate1 = LocalDate.parse(dateText, inputFormatter);
			String formattedDate = tableDate1.format(formatter);
			LocalDate tableDate = LocalDate.parse(formattedDate, formatter);
			if (tableDate.isBefore(startDate) || tableDate.isAfter(endDate1)) {
				System.out.println("Date out of range: " + tableDate);
				flag = false;
			} else {
				System.out.println("Date within range: " + tableDate);
				flag = true;
			}
		}
		}
		else
		{
			boolean norecordsfoundelement = driver.findElement(By.xpath(norecordsfoundElement)).isDisplayed();
			if(norecordsfoundelement==true)
			{
				System.out.println("There are no results within dates applied. And the No records found message is displayed on screen.");
				flag = true;
			}
			else
			{
				System.out.println("There are no results within dates applied. And the No records found message is not displayed on screen.");
				flag = false;
			}
			
		}

		return flag;
	}

	@Override
	public void testSortingFunctionality() throws InterruptedException {
		
		
	}

}