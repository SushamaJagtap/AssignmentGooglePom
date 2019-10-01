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
import com.google.pages.Google_03_MyAccountPage;

public class Google_03_MyAccountTest extends TestBase{
	
	public SoftAssert softAssert;
	Google_01_Page google_01_Page;
	Google_02_Page google_02_Page;
	Google_03_MyAccountPage google_03_MyAccountPage;
	
	
	public Google_03_MyAccountTest()
	{
		super();
	}
	
	@BeforeTest
	public void execute() throws IOException
	{
		System.out.println(getTC("Google_03_MyAccountTest"));
		boolean j = false;
		if(getTC("Google_03_MyAccountTest")==j)
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
		Thread.sleep(3000);
		google_02_Page   =  google_01_Page.clickGoogleapp();
		Thread.sleep(3000);
		google_03_MyAccountPage	= google_02_Page.clickOnMyAccount();
	}
	
	@Test(priority=1)
	public void getTitle() throws InterruptedException
	{
		Thread.sleep(3000);
		String j = google_03_MyAccountPage.getTitle();
		softAssert.assertEquals(j,"Google Account", "Title matched");
		softAssert.assertAll();
	}

	@Test(priority=2)
	public void checkGoogleAccountTxt() throws InterruptedException
	{
		Thread.sleep(3000);
		boolean j = google_03_MyAccountPage.checkGoogleAccountTxt();
		softAssert.assertTrue(j);
		softAssert.assertAll();
	}
	
	
	
	
}
