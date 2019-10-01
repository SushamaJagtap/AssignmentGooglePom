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
import com.google.pages.Google_03_SearchPage;

public class Google_03_SearchTest extends TestBase  {

	public SoftAssert softassert = new SoftAssert();
	Google_01_Page google_01_Page;
	Google_02_Page google_02_page;
	Google_03_SearchPage google_03_searchPage;
	
	
	public Google_03_SearchTest()
	{
		super();
	}
	
	@BeforeTest
	public void execute() throws IOException
	{
		System.out.println(getTC("Google_03_SearchTest"));
		boolean j = false;
		if(getTC("Google_03_SearchTest")==j)
		{
			throw new SkipException("skipped");
		}
	}
	
	
	
	
	
	@BeforeMethod
	public void setup() throws InterruptedException
	{
		init();
		google_01_Page = new Google_01_Page();
		google_02_page=google_01_Page.clickGoogleapp();
		Thread.sleep(6000);
		google_03_searchPage = google_02_page.clickOnSearchbtn();
	}
	
	
	@Test(priority=1)
	public void checkSearch() throws InterruptedException
	{
		Thread.sleep(3000);
		boolean flag = google_03_searchPage.checkSearch();
		softassert.assertTrue(flag);
		softassert.assertAll();
	}
	
	
	@Test(priority=2)
	public void checkGoogleSearch() throws InterruptedException
	{
		Thread.sleep(3000);
		boolean flag = google_03_searchPage.checkGoogleSearch();
		softassert.assertTrue(flag);
		softassert.assertAll();
	}
	
	@Test(priority=3)
	public void checkLuckybtn() throws InterruptedException
	{
		Thread.sleep(5000);
		boolean flag = google_03_searchPage.checkLuckybtn();
		softassert.assertTrue(flag);
		softassert.assertAll();
	}
	
	
	
	@AfterMethod
	public void quit()
	{
		driver.quit();
	}
}
