package com.google.testcases;

import java.io.IOException;

import org.testng.SkipException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.google.base.TestBase;
import com.google.pages.Google_01_Page;
import com.google.pages.Google_05_HindiPage;


	/*	Run->RunConfiguration->common->other->utf-8->apply and save*/

public class Google_05_HindiTest extends TestBase{
	
	public SoftAssert softAssert;
	String expected=null;
	Google_01_Page google_01_Page;
	Google_05_HindiPage google_05_HindiPage;
	
	public Google_05_HindiTest()
	{
		//super();
	}
	

	@BeforeTest
	public void execute() throws IOException
	{
		System.out.println(getTC("Google_05_HindiTest"));
		boolean j = false;
		if(getTC("Google_05_HindiTest")==j)
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
		google_05_HindiPage = google_01_Page.clickOnHindiBtn();
	}
	
	@Test(priority=1)
	public void getHindiSearchTxt() throws InterruptedException
	{
		Thread.sleep(3000);
		expected = "Google सर्च";
		String actual = google_05_HindiPage.getHindiSearchTxt();
		System.out.println(actual);
		softAssert.assertEquals(actual,expected);
		softAssert.assertAll();
	}
	
	@Test(priority=2)
	public void getHindiLuckyDayTxt() throws InterruptedException
	{
		Thread.sleep(3000);
		expected = "आज मेरी किस्मत अच्छी है";
		String actual = google_05_HindiPage.getHindiLuckyDayTxt();
		softAssert.assertEquals(actual,expected);
		softAssert.assertAll();
	}
	
	@Test(priority=3)
	public void getHindiSignInBtnTxt() throws InterruptedException
	{
		Thread.sleep(3000);
		expected = "साइन इन";
		String actual = google_05_HindiPage.getHindiSignInBtnTxt();
		softAssert.assertEquals(actual,expected);
		softAssert.assertAll();
	}
	
	
	

}
