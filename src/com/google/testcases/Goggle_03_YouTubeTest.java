package com.google.testcases;

import java.io.IOException;

import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.google.base.TestBase;
import com.google.pages.Goggle_03_YouTubePage;
import com.google.pages.Google_01_Page;
import com.google.pages.Google_02_Page;
import com.google.pages.Google_03_SearchPage;

public class Goggle_03_YouTubeTest extends TestBase {
	
	public SoftAssert softAssert;
	
	Google_01_Page google_01_Page;
	Google_02_Page google_02_page;
	Goggle_03_YouTubePage google_03_YouTubePage;
	
	public Goggle_03_YouTubeTest()
	{
		//super();
	}
	
	
	@BeforeClass
	public static void execute() throws IOException
	{
		System.out.println(getTC("Goggle_03_YouTubeTest"));
		boolean j = false;
		if(getTC("Goggle_03_YouTubeTest")==j)
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
		google_02_page = google_01_Page.clickGoogleapp();
		Thread.sleep(3000);
		google_03_YouTubePage = google_02_page.clickOnYoutube();
	}

	@Test(priority=1)
	public void compareTitle() throws InterruptedException
	{
		Thread.sleep(3000);
	     String title = google_03_YouTubePage.getTitle();
	     softAssert.assertEquals("YouTube", title, "title match");
	     softAssert.assertAll();
	}
	
	@Test(priority=2)
	public void checkYoutubeText() throws InterruptedException
	{
		Thread.sleep(3000);
		boolean flag = google_03_YouTubePage.checkYoutubeText();
		softAssert.assertTrue(flag);
		softAssert.assertAll();
	}
	
	@Test(priority=3)
	public void checkYoutubeSearchbox() throws InterruptedException
	{
		Thread.sleep(3000);
		boolean flag = google_03_YouTubePage.checkYoutubeSearchbox();
		softAssert.assertTrue(flag);
		softAssert.assertAll();
	}
	
	
	@Test(priority=4)
	public void checkUploadbtb() throws InterruptedException
	{
		Thread.sleep(3000);
		boolean flag = google_03_YouTubePage.checkUploadbtn();
		softAssert.assertTrue(flag);
		softAssert.assertAll();
	}
	
	
	@AfterMethod
	public void quit()
	{
		driver.quit();
	}
	
	
	
	
	
}
