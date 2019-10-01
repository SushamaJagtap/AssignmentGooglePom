package com.google.testcases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.asserts.SoftAssert;

import com.google.base.TestBase;
import com.google.pages.Google_01_Page;
import com.google.pages.Google_02_Page;
import com.google.pages.Google_03_SearchPage;
import com.google.pages.Google_04_SearchSignInPage;
import com.google.util.TestUtil;

public class Google_04_SearchSignInTest extends TestBase{
	
	public SoftAssert softAssert;
	public String sheetName = "Data";
	String match=null;
	
	TestUtil testUtil;
	
	Google_01_Page google_01_Page;
	Google_02_Page google_02_Page;
	Google_03_SearchPage google_03_SearchPage;
	Google_04_SearchSignInPage google_04_SearchSignInPage;

	public Google_04_SearchSignInTest()
	{
		//super();
	}
	
	
	@BeforeTest
	public void execute() throws IOException
	{
		System.out.println(getTC("Google_04_SearchSignInTest"));
		boolean j = false;
		if(getTC("Google_04_SearchSignInTest")==j)
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
		Thread.sleep(7000);
		google_03_SearchPage = google_02_Page.clickOnSearchbtn();
		Thread.sleep(7000);
		google_04_SearchSignInPage = google_03_SearchPage.clickOnSearchSignInbtn();
		Thread.sleep(5000);
	}
	
	@org.testng.annotations.Test(priority=1,dataProvider="getData")
	public void Test(String email,String pass) throws InterruptedException
	{
		match = email;
		google_04_SearchSignInPage.createAccount(email, pass);
		
		Thread.sleep(3000);
		google_04_SearchSignInPage.clickOnSBtn();
		
		
		Thread.sleep(3000);
		String actual = google_04_SearchSignInPage.mailIdtxt();
		
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

	@AfterMethod
	public void quit()
	{
		driver.quit();
	}
	
	
	
}
