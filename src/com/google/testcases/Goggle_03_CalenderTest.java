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
import com.google.pages.Google_03_CalenderPage;

public class Goggle_03_CalenderTest extends TestBase{
	
	public SoftAssert softAssert;
	
	Google_01_Page google_01_Page;
	Google_02_Page google_02_Page;
	Google_03_CalenderPage google_03_CalenderPage;
	
	
	public Goggle_03_CalenderTest()
	{
		//super();
	}
	
	@BeforeTest
	public void execute() throws IOException
	{
		System.out.println(getTC("Goggle_03_CalenderTest"));
		boolean j = false;
		if(getTC("Goggle_03_CalenderTest")==j)
		{
			throw new SkipException("skipped");
		}
	}
	
	
	@BeforeMethod
	public void setup() throws InterruptedException
	{
		init();
		softAssert = new SoftAssert();
		
		google_01_Page  = new Google_01_Page();
		Thread.sleep(5000);
		google_02_Page   =  google_01_Page.clickGoogleapp();
		Thread.sleep(5000);
		google_03_CalenderPage	= google_02_Page.clickOnCalender();
		Thread.sleep(5000);
	}
	
	
	
	
	@Test(priority=1)
	public void getTitle() throws InterruptedException
	{
		Thread.sleep(5000);
		
		String actual = google_03_CalenderPage.getTitle();
		
		softAssert.assertEquals(actual, "Calender");
		softAssert.assertAll();
	}
	
	
	
	
	
	
	
	

}
