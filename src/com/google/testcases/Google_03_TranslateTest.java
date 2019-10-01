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
import com.google.pages.Google_03_TranslatePage;

public class Google_03_TranslateTest extends TestBase{
	
	public SoftAssert softAssert;
	Google_01_Page google_01_Page;
	Google_02_Page google_02_Page;
	Google_03_TranslatePage google_03_TranslatePage;
	
	public Google_03_TranslateTest()
	{
		//super();
	}
	
	@BeforeTest
	public void execute() throws IOException
	{
		System.out.println(getTC("Google_03_TranslateTest"));
		boolean j = false;
		if(getTC("Google_03_TranslateTest")==j)
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
		Thread.sleep(3000);
		google_03_TranslatePage	= google_02_Page.clickOnTranslate();
	}
	
	@Test(priority=1)
	public void checkTitle()
	{
		String Title = google_03_TranslatePage.getTitle();
		softAssert.assertEquals(Title,"Google Translate");
		softAssert.assertAll();
	}
	
	@Test(priority=2) 
	public void checkTranslateTxt()
	{
		boolean j = google_03_TranslatePage.checkTranslateTxt();
		softAssert.assertTrue(j);
		softAssert.assertAll();
	}
	
	@Test(priority=3) 
	public void checkTranslateBtn()
	{
		boolean j = google_03_TranslatePage.checkTranslateBtn();
		softAssert.assertTrue(j);
		softAssert.assertAll();
	}
	
	
	@AfterMethod
	public void quit()
	{
		driver.quit();
	}
	
	
	
	
	
	
	

}
