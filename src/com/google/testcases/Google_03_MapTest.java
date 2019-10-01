package com.google.testcases;

import java.io.IOException;

import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.google.base.TestBase;
import com.google.pages.Google_01_Page;
import com.google.pages.Google_02_Page;
import com.google.pages.Google_03_MapPage;

public class Google_03_MapTest extends TestBase{
	
	public SoftAssert softAssert;
	
	Google_01_Page google_01_page;
	Google_02_Page google_02_page;
	Google_03_MapPage google_03_mapPage;
	
	public Google_03_MapTest()
	{
		//super();
	}
	
	@BeforeTest
	public void execute() throws IOException
	{
		System.out.println(getTC("Google_03_MapTest"));
		boolean j = false;
		if(getTC("Google_03_MapTest")==j)
		{
			throw new SkipException("skipped");
		}
	}
	
	
	
	@BeforeMethod
	public void setup() throws InterruptedException
	{
		init();
		softAssert = new SoftAssert();
		google_01_page = new Google_01_Page();
		google_02_page = google_01_page.clickGoogleapp();
		Thread.sleep(3000);
		google_03_mapPage = google_02_page.clickOnMap();	
	}
	
	
	@Test(priority=1)
	public void checkSerachGoogleMap() throws InterruptedException
	{
		Thread.sleep(3000);
		boolean flag = google_03_mapPage.checkSerachGoogleMap();
		softAssert.assertTrue(flag);
		softAssert.assertAll();
	}
	
	@Test(priority=2)
	public void checkHorizontal() throws InterruptedException
	{
		Thread.sleep(3000);
		boolean flag = google_03_mapPage.checkHorizontal();
		softAssert.assertTrue(flag);
		softAssert.assertAll();
	}
	
	
	
	@AfterMethod
	public void quit()
	{
		driver.quit();
	}
	
	
	
	
}
