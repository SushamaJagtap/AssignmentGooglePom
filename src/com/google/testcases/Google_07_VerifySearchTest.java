package com.google.testcases;

import java.io.IOException;

import org.testng.SkipException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.google.base.TestBase;
import com.google.config.Xpath;
import com.google.pages.Google_01_Page;
import com.google.pages.Google_07_VerifySearchPage;

public class Google_07_VerifySearchTest extends TestBase {
	
	public SoftAssert softAssert;
	Google_01_Page google_01_Page;
	Google_07_VerifySearchPage google_07_VerifySearchPage;
	
	
	public Google_07_VerifySearchTest()
	{
		//super();
	}
	
	
	@BeforeTest
	public void execute() throws IOException
	{
		System.out.println(getTC("Google_07_VerifySearchTest"));
		boolean j = false;
		if(getTC("Google_07_VerifySearchTest")==j)
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
		google_07_VerifySearchPage = google_01_Page.clickOnSearch(Xpath.searchName1);
	}
	
	@Test(priority=1)
	public void getWikipediaTxt() throws InterruptedException
	{
		Thread.sleep(3000);
		String expected = Xpath.searchName1;
		String actual = google_07_VerifySearchPage.getWikipediaTxt();
		
		if(actual.contains(expected))
		{
			softAssert.assertTrue(true);
		}else{
			softAssert.assertTrue(false);
		}softAssert.assertAll();
	}
	
	
	
	
	
	
	
	

}
