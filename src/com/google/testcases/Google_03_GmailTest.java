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
import com.google.pages.Google_03_GmailPage;

public class Google_03_GmailTest extends TestBase{
	
	public SoftAssert softAssert;
	Google_01_Page google_01_Page;
	Google_02_Page google_02_Page;
	Google_03_GmailPage google_03_GmailPage;
	
	public Google_03_GmailTest()
	{
		//super();
	}
	
	@BeforeTest
	public void execute() throws IOException
	{
		System.out.println(getTC("Google_03_GmailTest"));
		boolean j = false;
		if(getTC("Google_03_GmailTest")==j)
		{
			throw new SkipException("skipped");
		}
	}
	
	
	
	
	
	
	@BeforeMethod
	public void setup() throws InterruptedException
	{
		init();
		softAssert = new SoftAssert();
		google_01_Page  = new  Google_01_Page();
		google_02_Page	= google_01_Page.clickGoogleapp();
		Thread.sleep(3000);
		google_03_GmailPage	= google_02_Page.clickOnGmail();
	}
	
	@Test(priority=1)
	public void getTitle() throws InterruptedException
	{
		Thread.sleep(3000);
		String title = driver.getTitle();
		softAssert.assertTrue(true);
		softAssert.assertAll();
	}
	
	@Test(priority=2)
	public void checkGmailImg() throws InterruptedException
	{
		Thread.sleep(5000);
		boolean flag = google_03_GmailPage.checkGmailImg();
		softAssert.assertTrue(flag);
		softAssert.assertAll();
	}
	
	@Test(priority=3)
	public void checkSignInBtn() throws InterruptedException
	{
		Thread.sleep(3000);
		boolean flag = google_03_GmailPage.checkSignInBtn();
		softAssert.assertTrue(flag);
		softAssert.assertAll();
	}
	
	@Test(priority=4)
	public void checkCreateAccBtn() throws InterruptedException
	{
		Thread.sleep(3000);
		boolean flag = google_03_GmailPage.checkCreateAccBtn();
		softAssert.assertTrue(flag);
		softAssert.assertAll();
	}
	
	
	
	
	@AfterMethod
	public void quit()
	{
		driver.quit();
	}
	

}
