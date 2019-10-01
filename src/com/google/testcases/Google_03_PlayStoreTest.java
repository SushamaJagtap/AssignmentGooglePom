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
import com.google.pages.Google_03_PlayStorePage;

public class Google_03_PlayStoreTest extends TestBase {

	public SoftAssert softAssert;
	Google_01_Page google_01_Page;
	Google_02_Page google_02_Page;
	Google_03_PlayStorePage google_03_PlayStorePage;
	
	
	public Google_03_PlayStoreTest()
	{
		//super();
	}
	
	
	@BeforeTest
	public void execute() throws IOException
	{
		System.out.println(getTC("Google_03_PlayStoreTest"));
		boolean j = false;
		if(getTC("Google_03_PlayStoreTest")==j)
		{
			throw new SkipException("skipped");
		}
	}
	
	
	
	@BeforeMethod
	public void setup() throws InterruptedException
	{
		init();
		softAssert = new SoftAssert();
		google_01_Page = new  Google_01_Page();
		google_02_Page = google_01_Page.clickGoogleapp();
		Thread.sleep(3000);
		google_03_PlayStorePage	= google_02_Page.clickOnPlaystore();
	}
	
	
	@Test(priority=1)
	public void getTitle() throws InterruptedException
	{
		Thread.sleep(3000);
		String title = google_03_PlayStorePage.getTitle();
		softAssert.assertEquals(title, "Google Play");
		softAssert.assertAll();
	}
	
	@Test(priority=2)
	public void checkPlayStoreImg() throws InterruptedException
	{
		Thread.sleep(3000);
		boolean flag = google_03_PlayStorePage.checkPlayStoreImg();
		softAssert.assertTrue(flag);
		softAssert.assertAll();
	}
	
	@Test(priority=3)
	public void checkPlaySearchBox() throws InterruptedException
	{
		Thread.sleep(3000);
		boolean flag = google_03_PlayStorePage.checkPlaySearchBox();
		softAssert.assertTrue(flag);
		softAssert.assertAll();
	}
	
	@Test(priority=4)
	public void checkPlayContent() throws InterruptedException
	{
		Thread.sleep(3000);
		boolean flag = google_03_PlayStorePage.checkPlayContent();
		softAssert.assertTrue(flag);
		softAssert.assertAll();
	}
	
	
	
}
