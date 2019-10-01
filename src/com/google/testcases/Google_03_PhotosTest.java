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
import com.google.pages.Google_03_PhotosPage;

public class Google_03_PhotosTest extends TestBase {
	
	 SoftAssert softAssert;
	Google_01_Page google_01_Page;
	Google_02_Page google_02_Page;
	Google_03_PhotosPage google_03_PhotosPage;
	
	public Google_03_PhotosTest()
	{
		super();
	}

	@BeforeTest
	public void execute() throws IOException
	{
		System.out.println(getTC("Google_03_PhotosTest"));
		boolean j = false;
		if(getTC("Google_03_PhotosTest")==j)
		{
			throw new SkipException("skipped");
		}
	}
	
	
	
	@BeforeMethod
	public void setup() throws InterruptedException
	{
		init();
		softAssert = new SoftAssert();
		google_01_Page = new Google_01_Page();
		google_02_Page = google_01_Page.clickGoogleapp();
		Thread.sleep(5000);
		google_03_PhotosPage = google_02_Page.clickOnPhotos();
	}
	
	@Test(priority=1)
	public void getTitle() throws InterruptedException
	{
		Thread.sleep(3000);
		String Title = google_03_PhotosPage.getTitle();
		Thread.sleep(3000);
		softAssert.assertEquals(Title,"Google Photos - All your photos organized and easy to find","Title matched");
		softAssert.assertAll();
	}
	
	@Test(priority=2)
	public void checkPhotosTxt() throws InterruptedException
	{
		Thread.sleep(3000);
		boolean j = google_03_PhotosPage.checkPhotosTxt();
		softAssert.assertTrue(j);
		softAssert.assertAll();
	}
	
	@Test(priority=3)
	public void checkGoToGooglePhotosBtn() throws InterruptedException
	{
		Thread.sleep(3000);
		boolean j = google_03_PhotosPage.checkGoToGooglePhotosBtn();
		softAssert.assertTrue(j);
		softAssert.assertAll();
	}
	
	
	@AfterMethod
	public void quit()
	{
		driver.quit();
	}
	
	
	
	
}
