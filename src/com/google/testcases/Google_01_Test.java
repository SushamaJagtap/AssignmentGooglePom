package com.google.testcases;

import java.awt.CheckboxGroup;
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


public class Google_01_Test extends TestBase{
	
	SoftAssert softAssert = new SoftAssert();
	Google_01_Page google01page;
	Google_02_Page google_02_page;
	Logger log = Logger.getLogger(Google_01_Test.class);
	
	public Google_01_Test()
	{
		super();
	}
	
	
	@BeforeTest
	public void execute() throws IOException
	{
		System.out.println(getTC("Google_01_Test"));
		boolean j = false;
		if(getTC("Google_01_Test")==j)
		{
			throw new SkipException("skipped");
		}
	}
	
	
	
	
	@BeforeMethod
	public void setup()
	{
		init();
		log.debug("Browser launched");
		google01page = new Google_01_Page();
	}
	
	@Test(priority=1)
	public void checkSearch()
	{
		log.debug("Searchbox verified");
		boolean flag = google01page.checkSearch();
		softAssert.assertTrue(flag);
		softAssert.assertAll();
	}
	
	
	@Test(priority=2)
	public void CheckGoogleSearch()
	{
		log.debug("Google Searchbox verified");
		boolean flag = google01page.checkGoogleSearch();
		softAssert.assertTrue(flag);
		softAssert.assertAll();
	}
	
	@Test(priority=3)
	public void CheckLuckybtn()
	{
		log.debug("Luckybutton verified");
		boolean flag = google01page.checkLuckybtn();
		softAssert.assertTrue(flag);
		softAssert.assertAll();
	}
	
	@Test(priority=4)
	public void CheckSignin()
	{
		log.debug("Signin button verified");
		boolean flag = google01page.checkSignin();
		softAssert.assertTrue(flag);
		softAssert.assertAll();
	}
	
	@Test(priority=5)
	public void clickGoogle()
	{
		google_02_page = google01page.clickGoogleapp();
		log.debug("click on Google");
		
	}
	
	@AfterMethod
	public void quit()
	{
		driver.quit();
	}
	

}
