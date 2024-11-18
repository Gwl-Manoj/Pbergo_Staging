package com.pbergo.commonfunctions;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import com.pbergo.base.WebDriverBase;
import com.pbergo.locators.AdminBlogLocators;
import com.pbergo.locators.AdminClientLocators;
import com.pbergo.locators.AdminLeftSidePanelLocators;
import java.util.Iterator; 
import java.util.Set;

public class BlogFunctions {
	private WebDriverBase webDB;
	private boolean flag;

	private WebDriver driver;

	public BlogFunctions(WebDriverBase webDB) {
		this.webDB = webDB;
		
	}
	
	/**
	 * @param userPermittedSection [Passing options from the Menu link]
	 * @return
	 * @throws IOException
	 * @throws InterruptedException
	 */
	public boolean click_AdminBlog_Left_Panel() throws IOException, InterruptedException {
		flag = webDB.waitElementByXPath(AdminLeftSidePanelLocators.ELMNT_BLOG_LINK);
		if (flag) {
		 
			webDB.clickBtnByXPath(AdminLeftSidePanelLocators.ELMNT_BLOG_LINK);
			Thread.sleep(3000);
			
			flag = webDB.waitElementByXPath(AdminBlogLocators.ELMNT_BLOG_HOME_BTN);
			if(flag)
			{
				Reporter.log("Redirected to blog page", true);
			}
			else
			{
				flag = false;
			}
			
		}
		return flag;
	}
	
	public boolean get_AdminBlog_Heading() throws InterruptedException, IOException
	{
		
		
		String parent = webDB.getwindowhandle();
//		String parent=driver.getWindowHandle();
//		System.out.println("The parent window is: "+parent);
		Set<String> s =webDB.getwindowhandles();
		Reporter.log("The parent window is: "+parent, true);

		
//		Set<String> handles=driver.getWindowHandles();
//		for(String actual: handles) {
//		if(!actual.equalsIgnoreCase(currentHandle)) {
//		//Switch to the opened tab
//		driver.switchTo().window(actual);
		
		
		// Now iterate using Iterator
		Iterator<String> I1= s.iterator();

		while(I1.hasNext())
		{

		String child_window=I1.next();


		if(!parent.equals(child_window))
		{
			webDB.switchToWindow(child_window);
//		driver.switchTo().window(child_window);
		
		flag = webDB.waitElementByXPath(AdminBlogLocators.ELMNT_BLOG_HOME_BTN);
		if(flag)
		{
			String actual_blogpageheading= webDB.getTextByXPath(AdminBlogLocators.ELMNT_BLOG_HEADING);
			String expected_blogpageheading = "Admin - Manage Blog Posts";
			flag = actual_blogpageheading.equalsIgnoreCase(expected_blogpageheading);
			Reporter.log("The actual and expected heading is same i.e. "+actual_blogpageheading);
			
		}
		}
		
	}
		return flag;
	}
	
	
	
	
}
