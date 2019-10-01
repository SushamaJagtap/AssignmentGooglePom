package com.google.testcases;

import java.io.IOException;

import org.testng.SkipException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.google.base.TestBase;
import com.google.pages.Google_01_Page;
import com.google.pages.Google_02_Page;
import com.google.pages.Google_03_GooglePlusPage;

public class Google_03_GooglePlusTest extends TestBase{
	
	public SoftAssert softAssert;
	Google_01_Page google_01_Page;
	Google_02_Page	google_02_Page;
	Google_03_GooglePlusPage google_03_GooglePlusPage;
	public Google_03_GooglePlusTest()
	{
		//super();
	}
	
	
	@BeforeTest
	public void execute() throws IOException
	{
		System.out.println(getTC("Google_03_GooglePlusTest"));
		boolean j = false;
		if(getTC("Google_03_GooglePlusTest")==j)
		{
			throw new SkipException("skipped");
		}
	}
	

	@BeforeMethod
	public void setup() throws InterruptedException
	{
		init();
		softAssert = new SoftAssert();
		google_02_Page = google_01_Page.clickGoogleapp();
		Thread.sleep(3000);
		google_03_GooglePlusPage = google_02_Page.clickOnGooglePlus();
	}
	
	@Test(priority=1)
	public void getTitle() throws InterruptedException
	{
		Thread.sleep(3000);
		String Title = google_03_GooglePlusPage.getTitle();
		softAssert.assertEquals(Title, "Google+", "Title match");
		softAssert.assertAll();
	}
	
	@Test(priority=2)
	public void checkGoogleplustext() throws InterruptedException
	{
		Thread.sleep(3000);
		boolean j = google_03_GooglePlusPage.checkGoogleplustext();
		softAssert.assertTrue(j);
		softAssert.assertAll();
	}
	
	@Test(priority=3)
	public void GooglePlusSearchBox() throws InterruptedException
	{
		Thread.sleep(3000);
		boolean j = google_03_GooglePlusPage.GooglePlusSearchBox();
		softAssert.assertTrue(j);
		softAssert.assertAll();
	}
	
	@BeforeMethod
	public void quit()
	{
		driver.quit();
	}
	
}
