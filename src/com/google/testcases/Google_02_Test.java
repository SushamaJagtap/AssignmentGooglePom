package com.google.testcases;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.interactions.Actions;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.google.base.TestBase;
import com.google.config.Xpath;
import com.google.pages.Google_01_Page;
import com.google.pages.Google_02_Page;
import com.google.util.ExplicitlyWait;

public class Google_02_Test extends TestBase {
	
	
	Google_02_Page google_02_Page;
	Google_01_Page google_01_Page;
	public SoftAssert softassert;
	Logger log = Logger.getLogger(Google_02_Test.class);
	
	
	
	@BeforeTest
	public void execute() throws IOException
	{
		System.out.println(getTC("Google_02_Test"));
		boolean j = false;
		if(getTC("Google_02_Test")==j)
		{
			throw new SkipException("skipped");
		}
	}
	
	
	@BeforeMethod
	public void setup()
	{
		init();
		softassert = new SoftAssert();
		google_01_Page = new Google_01_Page();
		google_02_Page = google_01_Page.clickGoogleapp();
	}
	
	
	@Test(priority=1)
	public void checkAccount() throws InterruptedException 
	{
		Thread.sleep(5000);
		boolean flag = google_02_Page.checkAccount();
		softassert.assertTrue(flag);
		softassert.assertAll();
		if(flag==true)
		{
			log.debug("Account Verified");
		}else
		{
			log.debug("Account not Verified");
		}
	}
	
	@Test(priority=2)
	public void checkSearchbtn() throws InterruptedException 
	{
		Thread.sleep(5000);
		
		boolean flag = google_02_Page.checkSearchbtn();
		softassert.assertTrue(flag);
		softassert.assertAll();
		if(flag==true)
		{
			log.debug("Search button Verified");
		}else
		{
			log.debug("Search button not Verified");
		}
	}
	
	@Test(priority=3)
	public void checkMap() throws InterruptedException  
	{
		Thread.sleep(5000);
		
		boolean flag = google_02_Page.checkMap();
		softassert.assertTrue(flag);
		softassert.assertAll();
		
		if(flag==true)
		{
			log.debug("Map Verified");
		}else
		{
			log.debug("Map not Verified");
		}
	}
	
	@Test(priority=4)
	public void checkYoutube() throws InterruptedException
	{
		Thread.sleep(5000);
		
		boolean flag = google_02_Page.checkYoutube();
		softassert.assertTrue(flag);
		softassert.assertAll();
		
		if(flag==true)
		{
			log.debug("YouTube Verified");
		}else
		{
			log.debug("Youtube not Verified");
		}
	}
	
	@Test(priority=5)
	public void  checkPlaystore() throws InterruptedException
	{
		Thread.sleep(5000);
		
		boolean flag = google_02_Page.checkYoutube();
		softassert.assertTrue(flag);
		softassert.assertAll();
		
		if(flag==true)
		{
			log.debug("PlayStore Verified");
		}else
		{
			log.debug("PlayStore not Verified");
		}
	}
	
	@Test(priority=6)
	public void  checkNews() throws InterruptedException
	{
		Thread.sleep(5000);
		boolean flag = google_02_Page.checkNews();
		softassert.assertTrue(flag);
		softassert.assertAll();
		
		if(flag==true)
		{
			log.debug("News Verified");
		}else
		{
			log.debug("News not Verified");
		}
	}
	
	@Test(priority=7)
	public void  checkGmail() throws InterruptedException
	{
		Thread.sleep(5000);
		boolean flag = google_02_Page.checkGmail();
		softassert.assertTrue(flag);
		softassert.assertAll();
		
		if(flag==true)
		{
			log.debug("Gmail Verified");
		}else
		{
			log.debug("Gmail not Verified");
		}
	}
	

	@Test(priority=8)
	public void  checkDrive() throws InterruptedException
	{
		Thread.sleep(5000);
		boolean flag = google_02_Page.checkDrive();
		softassert.assertTrue(flag);
		softassert.assertAll();
		
		if(flag==true)
		{
			log.debug("Drive Verified");
		}else
		{
			log.debug("Drive not Verified");
		}
	}
	
	@Test(priority=9)
	public void  checkCalender() throws InterruptedException
	{
		Thread.sleep(5000);
		boolean flag = google_02_Page.checkCalender();
		softassert.assertTrue(flag);
		softassert.assertAll();
		
		if(flag==true)
		{
			log.debug("Calender Verified");
		}else
		{
			log.debug("Claender not Verified");
		}
	}
	
	
	@Test(priority=10)
	public void  checkGooglePlus() throws InterruptedException
	{
		Thread.sleep(5000);
		boolean flag = google_02_Page.checkGooglePlus();
		softassert.assertTrue(flag);
		softassert.assertAll();
		
		if(flag==true)
		{
			log.debug("GoogleApp Verified");
		}else
		{
			log.debug("GoogleApp not Verified");
		}
	}
	
	@Test(priority=11)
	public void  checkTranslate() throws InterruptedException
	{
		Thread.sleep(5000);
		boolean flag = google_02_Page.checkTranslate();
		softassert.assertTrue(flag);
		softassert.assertAll();
		
		if(flag==true)
		{
			log.debug("Translate Verified");
		}else
		{
			log.debug("Translate not Verified");
		}
	}
	
	@Test(priority=12)
	public void  checkPhotos() throws InterruptedException
	{
		Thread.sleep(5000);
		boolean flag = google_02_Page.checkPhotos();
		softassert.assertTrue(flag);
		softassert.assertAll();
		
		if(flag==true)
		{
			log.debug("Photos Verified");
		}else
		{
			log.debug("Photos not Verified");
		}
	}
	
	
	@AfterMethod
	public void quit()
	{
		driver.quit();
	}
	
}
