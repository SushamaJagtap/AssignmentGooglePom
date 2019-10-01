package com.google.testcases;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


import com.google.base.TestBase;
import com.google.pages.Google_01_Page;
import com.google.pages.Google_02_Page;
import com.google.pages.Google_03_NewsPage;

public class Google_03_NewsTest extends TestBase{
	
	
	
	public SoftAssert softAssert;
	
	Google_01_Page google_01_Page;
	Google_02_Page google_02_Page; 
	Google_03_NewsPage google_03_NewsPage;
	/*logger = Logger.getLogger(Google_03_NewsTest.class);*/
	Logger logger = Logger.getLogger(Google_03_NewsTest.class);
	
	public Google_03_NewsTest()
	{
		super();
	}
	
	@BeforeTest
	public void execute() throws IOException
	{
		System.out.println(getTC("Google_03_NewsTest"));
		boolean j = false;
		if(getTC("Google_03_NewsTest")==j)
		{
			throw new SkipException("skipped");
		}
	}
	
	
	
	

	@BeforeMethod
	public void setup() throws InterruptedException
	{
		
		init();
		logger.debug("Before Method");
		softAssert = new SoftAssert();
		google_01_Page = new Google_01_Page();
		google_02_Page = google_01_Page.clickGoogleapp();
		Thread.sleep(7000);
		google_03_NewsPage = google_02_Page.clickOnNews();
		
		Thread.sleep(3000);
		
	}
	
	
	
	@Test(priority=1)
	public void getTitle() throws InterruptedException
	{
		Thread.sleep(5000);
		String title = driver.getTitle();
		softAssert.assertEquals(title, "Google News","title matched");
		softAssert.assertAll();
	}
	
	
	@Test(priority=2)
	public void checkGoogleNewsText() throws InterruptedException
	{
		Thread.sleep(5000);
		boolean flag = google_03_NewsPage.checkGoogleNewsText();
		softAssert.assertTrue(flag);
		softAssert.assertAll();
	}

	
	@Test(priority=3)
	public void CheckGoogleTopNews() throws InterruptedException
	{
		Thread.sleep(5000);
		boolean flag = google_03_NewsPage.checkGoogleTopNews();
		softAssert.assertTrue(flag);
		softAssert.assertAll();
	}
	
	@AfterMethod
	public void quit()
	{
		driver.quit();
	}

}
