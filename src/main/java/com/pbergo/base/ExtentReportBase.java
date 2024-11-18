package com.pbergo.base;

import java.io.IOException;

import org.apache.commons.mail.EmailException;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

//import Library_Files.MailUtil;
//import Library_Files.ZipFiles;


public class ExtentReportBase {

	public static ExtentSparkReporter htmlReporter;
	public static ExtentReports extent;
	public static ExtentTest test;
	private static Platform platform;
	private WebDriverBase webDB;
	private screenshot screenshots;
	private static WebDriver driver;

	@BeforeSuite
	public void setUp() throws InterruptedException {

		htmlReporter = new ExtentSparkReporter("./ExtentReports/TestReports.html");
		extent = new ExtentReports(); 
		webDB = new WebDriverBase();
		screenshots = new screenshot(driver);
		extent.attachReporter(htmlReporter);
		htmlReporter.config().setDocumentTitle("PBErgo Web Automation Report");
		htmlReporter.config().setReportName("PBErgo Report");
		extent.setSystemInfo("Build", "1.1");
		
		extent.setSystemInfo("User Name", "Galaxy");
		
		Platform platformname = platform.getCurrent();
		String platformname1 = platformname.toString();
		
		extent.setSystemInfo("Platform", platformname1);
		
		extent.setSystemInfo("Environment/Server", "Staging");
		
		htmlReporter.config().setDocumentTitle("PBergo Extent Report");
		htmlReporter.config().setTheme(Theme.STANDARD);
	}

	@AfterMethod
	public void getResult(ITestResult result) throws EmailException, IOException, InterruptedException {
		if (result.getStatus() == ITestResult.FAILURE) {
			
//			String screenshotPath = webDB.screenshot1( result.getMethod().getMethodName());
//          test.fail("Test Case failed check screenshot"+test.addScreenCaptureFromPath(screenshotPath)); // To capture the screenshot show on page
			
//			test.addScreenCaptureFromPath(screenshotPath);
//			String methodname = result.getMethod().getMethodName();
//			String feature = result.getTestClass().getName() +" : "+ result.getMethod().getMethodName() + " <br>" + "<a href='"+ screenshotPath + "'target=_blank >"+methodname+" Screenshot"+"</a>";
//			test = extent.createTest(result.getMethod().getDescription(),feature);
//			
			
			try {
	            // Taking the screenshot
	            String screenshotPath = webDB.screenshot(result.getMethod().getMethodName());
	            String methodname = result.getMethod().getMethodName();
//				String feature = result.getTestClass().getName() +" : "+ result.getMethod().getMethodName() + " <br>" + "<a href='"+ screenshotPath + "'target=_blank >"+methodname+" Screenshot"+"</a>";
//				test = extent.createTest(result.getMethod().getDescription(),feature);
				
	            test.fail(methodname+" Failed case screenshot taken", MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
	        } catch (Exception e) {
	            test.fail("Failed to capture screenshot: " + e.getMessage());
	        }
			
			
			test.log(Status.FAIL, MarkupHelper.createLabel(result.getName() + " Test case FAILED due to below issues:",
					ExtentColor.RED));
			test.fail(result.getThrowable());
		} else if (result.getStatus() == ITestResult.SUCCESS) {
			test.log(Status.PASS, MarkupHelper.createLabel(result.getName() + " Test Case PASSED", ExtentColor.GREEN));
		} else {
			test.log(Status.SKIP,
					MarkupHelper.createLabel(result.getName() + " Test Case SKIPPED", ExtentColor.ORANGE));
			test.skip(result.getThrowable());
		}
		
	}
	
	
	@AfterSuite
	public void tearDown() throws EmailException, InterruptedException {
		
		
		Thread.sleep(1000);
		extent.flush();
		
		String source = System.getProperty("user.dir")+ "/" + "ExtentReports";
		String destination =System.getProperty("user.dir")+ "/" + "ExtentReports" + "/"+"ExtentReports.zip";
	
		ZipFiles zf = new ZipFiles();
		zf.zipDirectory(source, destination);
		
		Thread.sleep(3000);
		MailUtil.sendNotificationMail("PBErgo Execution Report");
		 
	}
}
