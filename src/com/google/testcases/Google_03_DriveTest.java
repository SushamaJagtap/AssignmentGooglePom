package com.google.testcases;

import java.io.IOException;

import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.log4testng.Logger;

import com.google.base.TestBase;
import com.google.pages.Google_01_Page;
import com.google.pages.Google_02_Page;
import com.google.pages.Google_03_DrivePage;


public class Google_03_DriveTest extends TestBase{
	
	public SoftAssert softAssert;
	Google_01_Page google_01_Page;
	Google_02_Page google_02_Page; 
	Google_03_DrivePage google_03_DrivePage;
	Logger logger =  Logger.getLogger(Google_03_DriveTest.class); 
	
	public Google_03_DriveTest()
	{
		super();
	}
	
	
	@BeforeTest
	public void execute() throws IOException
	{
		System.out.println(getTC("Google_03_DriveTest"));
		boolean j = false;
		if(getTC("Google_03_DriveTest")==j)
		{
			throw new SkipException("skipped");
		}
	}
	
	
	
	@BeforeMethod
	public void setup() throws InterruptedException
	{
		logger.debug("@BeforeMethod");
		init();
		logger.debug("google page opened");
		softAssert = new SoftAssert();
		google_01_Page = new Google_01_Page();
		google_02_Page = google_01_Page.clickGoogleapp();
		logger.debug("clicked on google app");
		Thread.sleep(3000);
		google_03_DrivePage	= google_02_Page.clickOnDrive();
		logger.debug("clicked on Drive");
	}
	
	
	@Test(priority=1)
	public void getTitle() throws InterruptedException
	{
		logger.debug("matching title");
		Thread.sleep(3000);
		String title = driver.getTitle();
		softAssert.assertEquals(title,"Google Drive: Free Cloud Storage for Personal Use");
		softAssert.assertAll();
	}
	
	@Test(priority=2)
	public void checkGoogleDriveText() throws InterruptedException
	{
		logger.debug("checkGoogleDriveText");
		Thread.sleep(3000);
		boolean flag = google_03_DrivePage.checkGoogleDriveText();
		softAssert.assertTrue(flag);
		softAssert.assertAll();
	}
	
	@Test(priority=3)
	public void checkMeetDrive() throws InterruptedException
	{
		logger.debug("checkMeetDrive");
		Thread.sleep(3000);
		boolean flag = google_03_DrivePage.checkMeetDrive();
		softAssert.assertTrue(flag);
		softAssert.assertAll();
	}
	
	@Test(priority=4)
	public void checkUsingDrive() throws InterruptedException
	{
		logger.debug("checkUsingDrive");
		Thread.sleep(3000);
		boolean flag = google_03_DrivePage.checkUsingDrive();
		softAssert.assertTrue(flag);
		softAssert.assertAll();
	}
	
	
	@Test(priority=5)
	public void checkDriveIcon() throws InterruptedException
	{
		logger.debug("checkDriveIcon");
		Thread.sleep(3000);
		boolean flag = google_03_DrivePage.checkDriveIcon();
		softAssert.assertTrue(flag);
		softAssert.assertAll();
	}
	
	@Test(priority=6)
	public void checkGotoDrive() throws InterruptedException
	{
		logger.debug("checkGotoDrive");
		
		Thread.sleep(3000);
		boolean flag = google_03_DrivePage.checkGotoDrive();
		softAssert.assertTrue(flag);
		softAssert.assertAll();
	}
	
	
	@AfterMethod
	public void quit()
	{
		driver.quit();
	}
	

}
