package com.google.testcases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.SkipException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.google.base.TestBase;
import com.google.pages.Google_01_Page;
import com.google.pages.Google_02_Page;
import com.google.pages.Google_03_MapPage;
import com.google.pages.Google_04_MapSignInPage;
import com.google.util.TestUtil;

public class Google_04_MapSignInTest extends TestBase {
	
	public SoftAssert softAssert;
	String sheetName = "Data";
	String match=null;
	TestUtil testUtil;
	
	Google_01_Page google_01_Page;
	Google_02_Page google_02_Page;
	Google_03_MapPage google_03_MapPage;
	Google_04_MapSignInPage google_04_MapSignInPage;
	
	
	public Google_04_MapSignInTest()
	{
		//super();
	}
	
	@BeforeTest
	public void execute() throws IOException
	{
		System.out.println(getTC("Google_04_MapSignInTest"));
		boolean j = false;
		if(getTC("Google_04_MapSignInTest")==j)
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
		google_02_Page = google_01_Page.clickGoogleapp();
		Thread.sleep(5000);
		google_03_MapPage = google_02_Page.clickOnMap();
		Thread.sleep(9000);
		google_04_MapSignInPage = google_03_MapPage.clickOnMapSignBtn();
		Thread.sleep(10000);
	}
	
	
	@Test(priority=2,dataProvider="getData")
	public void matchAccount(String emailid,String password) throws InterruptedException
	{
		Thread.sleep(5000);
		match = emailid;
		google_04_MapSignInPage.createAccount(emailid, password);
		
		String actual = google_04_MapSignInPage.getMailIdTxt();
			
		if(match.contains(actual))
		{
			softAssert.assertAll();
		}
	}
	
	 	@DataProvider
	    public Object[][] getData() throws EncryptedDocumentException, IOException
	    {
	    	testUtil = new TestUtil();
	    	return testUtil.getData(sheetName);
	    }
		
	
	
}
