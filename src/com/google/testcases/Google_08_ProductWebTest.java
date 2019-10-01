package com.google.testcases;

import java.io.IOException;

import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.google.base.TestBase;
import com.google.config.Xpath;
import com.google.pages.Google_08_ProductWebPage;

public class Google_08_ProductWebTest extends TestBase{

	public SoftAssert softAssert;
	Google_08_ProductWebPage google_08_ProductWebPage;
	
	public Google_08_ProductWebTest()
	{
		//super();
	}
	
	@BeforeTest
	public void execute() throws IOException
	{
		System.out.println(getTC("Google_08_ProductWebTest"));
		boolean j = false;
		if(getTC("Google_08_ProductWebTest")==j)
		{
			throw new SkipException("skipped");
		}
	}
	
	@BeforeMethod 
	public void setup() throws InterruptedException
	{
		init();
		softAssert = new SoftAssert();
		Thread.sleep(5000);
		google_08_ProductWebPage = navigateToProductSite();
	}
	
	@Test(priority=1)
	public void checkwebSearch() throws InterruptedException
	{
		Thread.sleep(7000);
		boolean flag = google_08_ProductWebPage.checkwebSearch();
		softAssert.assertTrue(flag);
		softAssert.assertAll();
	}
	
	@Test(priority=2)
	public void checkgoogleChrome() throws InterruptedException
	{
		Thread.sleep(7000);
		boolean flag = google_08_ProductWebPage.checkgoogleChrome();
		softAssert.assertTrue(flag);
		softAssert.assertAll();
	}
	
	@Test(priority=3)
	public void checktoolBar() throws InterruptedException
	{
		Thread.sleep(7000);
		boolean flag = google_08_ProductWebPage.checktoolBar();
		softAssert.assertTrue(flag);
		softAssert.assertAll();
	}
	
	@Test(priority=4)
	public void checkBookMarks() throws InterruptedException
	{
		Thread.sleep(7000);
		boolean flag = google_08_ProductWebPage.checkBookMarks();
		softAssert.assertTrue(flag);
		softAssert.assertAll();
	}
	
	@Test(priority=5)
	public void checkmobile() throws InterruptedException
	{
		Thread.sleep(7000);
		boolean flag = google_08_ProductWebPage.checkmobile();
		softAssert.assertTrue(flag);
		softAssert.assertAll();
	}
	
	@Test(priority=6)
	public void checkmapsforMobile() throws InterruptedException
	{
		Thread.sleep(7000);
		boolean flag = google_08_ProductWebPage.checkmapsforMobile();
		softAssert.assertTrue(flag);
		softAssert.assertAll();
	}
	
	@Test(priority=7)
	public void checksearchForMobiles() throws InterruptedException
	{
		Thread.sleep(7000);
		boolean flag = google_08_ProductWebPage.checksearchForMobiles();
		softAssert.assertTrue(flag);
		softAssert.assertAll();
	}
	
	@Test(priority=8)
	public void checkadWords() throws InterruptedException
	{
		Thread.sleep(7000);
		boolean flag = google_08_ProductWebPage.checkadWords();
		softAssert.assertTrue(flag);
		softAssert.assertAll();
	}
	
	@Test(priority=9)
	public void checkgoogleAppsForWork() throws InterruptedException
	{
		Thread.sleep(7000);
		boolean flag = google_08_ProductWebPage.checkgoogleAppsForWork();
		softAssert.assertTrue(flag);
		softAssert.assertAll();
	}
	
	@Test(priority=10)
	public void checkgoogleMyBussiness() throws InterruptedException
	{
		Thread.sleep(7000);
		boolean flag = google_08_ProductWebPage.checkgoogleMyBussiness();
		softAssert.assertTrue(flag);
		softAssert.assertAll();
	}
	
	
	@Test(priority=11)
	public void checkadSense() throws InterruptedException
	{
		Thread.sleep(7000);
		boolean flag = google_08_ProductWebPage.checkadSense();
		softAssert.assertTrue(flag);
		softAssert.assertAll();
	}
	
	
	@Test(priority=12)
	public void checkadMob() throws InterruptedException
	{
		Thread.sleep(7000);
		boolean flag = google_08_ProductWebPage.checkadMob();
		softAssert.assertTrue(flag);
		softAssert.assertAll();
	}
	
	
	@Test(priority=13)
	public void checkyouTube() throws InterruptedException
	{
		Thread.sleep(7000);
		boolean flag = google_08_ProductWebPage.checkyouTube();
		softAssert.assertTrue(flag);
		softAssert.assertAll();
	}
	
	@Test(priority=14)
	public void checkBooks() throws InterruptedException
	{
		Thread.sleep(7000);
		boolean flag = google_08_ProductWebPage.checkBooks();
		softAssert.assertTrue(flag);
		softAssert.assertAll();
	}
	
	
	
	@Test(priority=15)
	public void checkImageSearch() throws InterruptedException
	{
		Thread.sleep(7000);
		boolean flag = google_08_ProductWebPage.checkImageSearch();
		softAssert.assertTrue(flag);
		softAssert.assertAll();
	}
	
	
	@Test(priority=16)
	public void checkNews() throws InterruptedException
	{
		Thread.sleep(7000);
		boolean flag = google_08_ProductWebPage.checkNews();
		softAssert.assertTrue(flag);
		softAssert.assertAll();
	}
	
	@Test(priority=17)
	public void checkvideoSearch() throws InterruptedException
	{
		Thread.sleep(7000);
		boolean flag = google_08_ProductWebPage.checkvideoSearch();
		softAssert.assertTrue(flag);
		softAssert.assertAll();
	}
	
	
	@Test(priority=18)
	public void checkpicasa() throws InterruptedException
	{
		Thread.sleep(7000);
		boolean flag = google_08_ProductWebPage.checkpicasa();
		softAssert.assertTrue(flag);
		softAssert.assertAll();
	}
	
	@Test(priority=19)
	public void checkmaps() throws InterruptedException
	{
		Thread.sleep(7000);
		boolean flag = google_08_ProductWebPage.checkmaps();
		softAssert.assertTrue(flag);
		softAssert.assertAll();
	}
	
	@Test(priority=20)
	public void checkearth() throws InterruptedException
	{
		Thread.sleep(7000);
		boolean flag = google_08_ProductWebPage.checkearth();
		softAssert.assertTrue(flag);
		softAssert.assertAll();
	}
	
	@Test(priority=21)
	public void checkpanorania() throws InterruptedException
	{
		Thread.sleep(7000);
		boolean flag = google_08_ProductWebPage.checkpanorania();
		softAssert.assertTrue(flag);
		softAssert.assertAll();
	}
	
	@Test(priority=22)
	public void checkcustomeSearch() throws InterruptedException
	{
		Thread.sleep(7000);
		boolean flag = google_08_ProductWebPage.checkcustomeSearch();
		softAssert.assertTrue(flag);
		softAssert.assertAll();
	}
	
	@Test(priority=23)
	public void checkscholar() throws InterruptedException
	{
		Thread.sleep(7000);
		boolean flag = google_08_ProductWebPage.checkscholar();
		softAssert.assertTrue(flag);
		softAssert.assertAll();
	}
	
	@Test(priority=24)
	public void checktrends() throws InterruptedException
	{
		Thread.sleep(7000);
		boolean flag = google_08_ProductWebPage.checktrends();
		softAssert.assertTrue(flag);
		softAssert.assertAll();
	}
	
	@Test(priority=25)
	public void checkgmail() throws InterruptedException
	{
		Thread.sleep(7000);
		boolean flag = google_08_ProductWebPage.checkgmail();
		softAssert.assertTrue(flag);
		softAssert.assertAll();
	}
	
	@Test(priority=26)
	public void checkdrive() throws InterruptedException
	{
		Thread.sleep(7000);
		boolean flag = google_08_ProductWebPage.checkdrive();
		softAssert.assertTrue(flag);
		softAssert.assertAll();
	}
	
	@Test(priority=27)
	public void checkdocs() throws InterruptedException
	{
		Thread.sleep(7000);
		boolean flag = google_08_ProductWebPage.checkdocs();
		softAssert.assertTrue(flag);
		softAssert.assertAll();
	}
	
	@Test(priority=29)
	public void checksheets() throws InterruptedException
	{
		Thread.sleep(7000);
		boolean flag = google_08_ProductWebPage.checksheets();
		softAssert.assertTrue(flag);
		softAssert.assertAll();
	}
	
	@Test(priority=30)
	public void checkslides() throws InterruptedException
	{
		Thread.sleep(7000);
		boolean flag = google_08_ProductWebPage.checkslides();
		softAssert.assertTrue(flag);
		softAssert.assertAll();
	}
	
	@Test(priority=31)
	public void checkforms() throws InterruptedException
	{
		Thread.sleep(7000);
		boolean flag = google_08_ProductWebPage.checkforms();
		softAssert.assertTrue(flag);
		softAssert.assertAll();
	}
	
	@Test(priority=32)
	public void checkdrawings() throws InterruptedException
	{
		Thread.sleep(7000);
		boolean flag = google_08_ProductWebPage.checkdrawings();
		softAssert.assertTrue(flag);
		softAssert.assertAll();
	}
	
	@Test(priority=33)
	public void checksales() throws InterruptedException
	{
		Thread.sleep(7000);
		boolean flag = google_08_ProductWebPage.checksales();
		softAssert.assertTrue(flag);
		softAssert.assertAll();
	}
	
	@Test(priority=34)
	public void checkCalender() throws InterruptedException
	{
		Thread.sleep(7000);
		boolean flag = google_08_ProductWebPage.checkCalender();
		softAssert.assertTrue(flag);
		softAssert.assertAll();
	}
	
	@Test(priority=35)
	public void checkTranslate() throws InterruptedException
	{
		Thread.sleep(7000);
		boolean flag = google_08_ProductWebPage.checkTranslate();
		softAssert.assertTrue(flag);
		softAssert.assertAll();
	}
	
	@Test(priority=36)
	public void checkgooglecloudprint() throws InterruptedException
	{
		Thread.sleep(7000);
		boolean flag = google_08_ProductWebPage.checkgooglecloudprint();
		softAssert.assertTrue(flag);
		softAssert.assertAll();
	}
	
	@Test(priority=37)
	public void checkgooglekeeps() throws InterruptedException
	{
		Thread.sleep(7000);
		boolean flag = google_08_ProductWebPage.checkgooglekeeps();
		softAssert.assertTrue(flag);
		softAssert.assertAll();
	}
	
	@Test(priority=38)
	public void checkgooglestore() throws InterruptedException
	{
		Thread.sleep(7000);
		boolean flag = google_08_ProductWebPage.checkgooglestore();
		softAssert.assertTrue(flag);
		softAssert.assertAll();
	}
	
	@Test(priority=39)
	public void checkGoogleplus() throws InterruptedException
	{
		Thread.sleep(7000);
		boolean flag = google_08_ProductWebPage.checkGoogleplus();
		softAssert.assertTrue(flag);
		softAssert.assertAll();
	}
	
	@Test(priority=40)
	public void checkblogger() throws InterruptedException
	{
		Thread.sleep(7000);
		boolean flag = google_08_ProductWebPage.checkblogger();
		softAssert.assertTrue(flag);
		softAssert.assertAll();
	}
	
	@Test(priority=41)
	public void checkgroups() throws InterruptedException
	{
		Thread.sleep(7000);
		boolean flag = google_08_ProductWebPage.checkgroups();
		softAssert.assertTrue(flag);
		softAssert.assertAll();
	}
	
	@Test(priority=42)
	public void checkhangouts() throws InterruptedException
	{
		Thread.sleep(7000);
		boolean flag = google_08_ProductWebPage.checkhangouts();
		softAssert.assertTrue(flag);
		softAssert.assertAll();
	}
	
	@Test(priority=43)
	public void checkcode() throws InterruptedException
	{
		Thread.sleep(7000);
		boolean flag = google_08_ProductWebPage.checkcode();
		softAssert.assertTrue(flag);
		softAssert.assertAll();
	}
	
	
	
	
	
	@AfterMethod
	public void quit()
	{
		//driver.quit();
	}
	
	
	
	
	
}
