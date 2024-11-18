package com.pbergo.commonfunctions;

import java.io.IOException;

import org.openqa.selenium.Keys;

import com.pbergo.base.WebDriverBase;
import com.pbergo.locators.AdminLeftSidePanelLocators;
import com.pbergo.locators.LoginLocators;
import com.pbergo.locators.UserProfileMenu;
//import com.pbergo.locators.HeaderSectionLocators;
//import com.pbergo.locators.LeftSidePanelLocators;

public class UIBasicFunctions {
	private WebDriverBase webDB;
	private boolean flag;
	private String temp;
	private String text;
//	private static WebDriver driver;
	

	public UIBasicFunctions(WebDriverBase webDB) {
		this.webDB = webDB;
	}

	public boolean userLoggedIN() throws IOException, InterruptedException {
//		flag = webDB.waitElementByXPath(LoginLocators.ELMNT_MANAGE_COOKIES_CLOSE_BTN);
//		if(flag)
//		{
//			webDB.clickBtnByXPath(LoginLocators.ELMNT_MANAGE_COOKIES_CLOSE_BTN);
//				
//		}
		
		flag = webDB.waitElementByXPath(LoginLocators.ELMNT_PRIVACY_OK_BTN);
		if (flag) {
			webDB.clickBtnByXPath(LoginLocators.ELMNT_PRIVACY_OK_BTN);
			flag = webDB.waitElementByID(LoginLocators.ELMNT_EMAIL_ADDRESS);
			if (flag) {
				webDB.sendTextByID(LoginLocators.ELMNT_EMAIL_ADDRESS, "qa@pbergo.com");
				System.out.println("Entered the email address in email input field");
				
				webDB.sendTextByID(LoginLocators.ELMNT_PASSWORD, "Admin@123456789");
				System.out.println("Entered the password in password input field");
				Thread.sleep(750);
				webDB.actionMoveToElementByXPath(LoginLocators.ELMNT_LOGIN_BTN);
				
				Thread.sleep(1000);
				webDB.clickBtnByXPath(LoginLocators.ELMNT_LOGIN_BTN);
				Thread.sleep(3000);
				
				flag = webDB.waitElementByXPath(UserProfileMenu.ELMNT_MENU_DROP_DOWN_LINK);
				if(flag)
					{
					System.out.println("User logged in successfully");
					}
				else
				{
					System.out.println("user login failed");
				}
				
			}
		}
		return flag;
	}
	
	/**
	 * @param userPermittedSection [Passing options from the Menu link]
	 * @return
	 * @throws IOException
	 * @throws InterruptedException
	 */
	public boolean openAdminDashboard() throws IOException, InterruptedException {
		flag = webDB.waitElementByXPath(UserProfileMenu.ELMNT_MENU_DROP_DOWN_LINK);
		if (flag) {
			webDB.actionMoveToElementByXPath(UserProfileMenu.ELMNT_MENU_DROP_DOWN_LINK).perform();
			Thread.sleep(2000);
			webDB.clickBtnByXPath(UserProfileMenu.ELMNT_MENU_DROP_DOWN_LINK);
			Thread.sleep(1000);
			flag = webDB.waitElementByXPath(UserProfileMenu.ELMNT_MENU_ADM_DASHBOARD_LNK);
			if(flag) {
				webDB.clickBtnByXPath(UserProfileMenu.ELMNT_MENU_ADM_DASHBOARD_LNK);
				flag = webDB.waitElementByXPath(AdminLeftSidePanelLocators.ELMNT_USER_ROLE_LINK);
				System.out.println("User redirected to admin dashboard");
			}
		}
		return flag;
	}
	
	/**
	 * @param userPermittedSection [Passing options from the Menu link]
	 * @return
	 * @throws IOException
	 * @throws InterruptedException
	 */
	public boolean openEmployeeDashboard(String leftSidePanelLink) throws IOException, InterruptedException {
		flag = webDB.waitElementByXPath(UserProfileMenu.ELMNT_MENU_DROP_DOWN_LINK);
		if (flag) {
			webDB.actionMoveToElementByXPath(UserProfileMenu.ELMNT_MENU_DROP_DOWN_LINK).perform();
			Thread.sleep(1000);
			webDB.clickBtnByXPath(UserProfileMenu.ELMNT_MENU_DROP_DOWN_LINK);
			Thread.sleep(1000);
			flag = webDB.waitElementByXPath(UserProfileMenu.ELMNT_MENU_EMPLOYEE_DASHBOARD_LNK);
			if(flag) {
				webDB.clickBtnByXPath(UserProfileMenu.ELMNT_MENU_EMPLOYEE_DASHBOARD_LNK);
				
				Thread.sleep(2000);
				flag = webDB.waitElementByXPath(leftSidePanelLink);
				System.out.println("User redirected to employee dashboard");
			}
		}
		return flag;
	}
	
	/**
	 * @throws IOException 
	 * @throws InterruptedException 
	 * 
	 * 
	 */
	public boolean verifySearchFunctionality(String searchinputfieldelement,String searchtext) throws IOException, InterruptedException
	{
		
		flag = webDB.waitElementByXPath(searchinputfieldelement);
		if(flag)
		{
			webDB.scrollToAnElement(searchinputfieldelement);
			text = webDB.getTextByXPath(searchtext+"["+1+"]");
			System.out.println("The text to be searched is "+text);
			Thread.sleep(1000);
			webDB.clickBtnByXPath(searchinputfieldelement);
			Thread.sleep(750);
			webDB.sendTextByXPath(searchinputfieldelement, text);
			Thread.sleep(750);
			webDB.sendTextByXpath(searchinputfieldelement, Keys.ENTER);
			Thread.sleep(2000);
			int totalemailids = webDB.countingSizeByXPath(searchtext);
			for(int i=1; i<=totalemailids; i++)
			{
				String emailids = webDB.getTextByXPath(searchtext+"["+i+"]");
				if(emailids.equals(text))
				{
					System.out.println("The search result is same for result number "+i);
					flag = true;
//					Thread.sleep(1500);
				}
				else
				{
					System.out.println("The search result is different for result number "+i);
					flag = false;
					
				}
				Thread.sleep(1500);
			}
		}
		
		
		return flag;
	}
	
//	public static String screenshot( String Classname) throws IOException, InterruptedException // Capture the screenshot
//	{
//		Thread.sleep(750);
//		SimpleDateFormat sdf = new SimpleDateFormat("dd_MM_yyyy");  //yyyyMMdd
//		String date = sdf.format(new Date());
//		String fileNamePicture = Classname+"_"+date+".png";
//
//		File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		String destination = System.getProperty("user.dir")+"/ExtentReports/screenshot/"+ fileNamePicture;
//
//		String relPath = "screenshot" + "/" + fileNamePicture;
//		File finalDestination = new File(destination);
//	    FileHandler.copy(scr, finalDestination);
//	    return relPath;
//	
//	}
	
	
}
