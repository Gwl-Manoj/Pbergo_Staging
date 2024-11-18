package com.pbergo.base;

import java.util.Date;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;


public class screenshot 
{
	public static WebDriver driver;
	
	public screenshot(WebDriver driver)
	{
		this.driver = driver;
	}
public static String screenshots( String Classname) throws IOException, InterruptedException // Capture the screenshot
	
	{
		Thread.sleep(750);
		SimpleDateFormat sdf = new SimpleDateFormat("dd_MM_yyyy");  //yyyyMMdd
		String date = sdf.format(new Date());
		String fileNamePicture = Classname+"_"+date+".png";

		File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String destination = System.getProperty("user.dir")+"/ExtentReports/screenshot/"+ fileNamePicture;

		String relPath = "screenshot" + "/" + fileNamePicture;
		File finalDestination = new File(destination);
	    FileHandler.copy(scr, finalDestination);
	    return relPath;
	
	}
	

}
