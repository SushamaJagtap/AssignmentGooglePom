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
import com.google.pages.Google_03_NewsPage;
import com.google.pages.Google_04_NewsSignInPage;
import com.google.util.TestUtil;

public class Google_04_NewsSignInTest extends TestBase{
	
	public SoftAssert softAssert;
	public String sheetName = "Data";
	String match=null;
	
	TestUtil testUtil;
	Google_01_Page google_01_Page;
	Google_02_Page google_02_Page;
	Google_03_NewsPage google_03_NewsPage;
	Google_04_NewsSignInPage google_04_NewsSignInPage;
	
	
	
	public Google_04_NewsSignInTest()
	{
		//super();
	}
	
	@BeforeTest
	public void execute() throws IOException
	{
		System.out.println(getTC("Google_04_NewsSignInTest"));
		boolean j = false;
		if(getTC("Google_04_NewsSignInTest")==j)
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
		Thread.sleep(5000);
		google_02_Page = google_01_Page.clickGoogleapp();
		Thread.sleep(7000);
		google_03_NewsPage = google_02_Page.clickOnNews();
		Thread.sleep(7000);
		google_04_NewsSignInPage = google_03_NewsPage.clickOnSignInBtn();
		Thread.sleep(4000);
	}
	
	
	@Test(dataProvider="getData")
	public void creatAccount(String email,String pass ) throws InterruptedException
	{
		Thread.sleep(5000);
		match = email;
		google_04_NewsSignInPage.createAccount(email, pass);
		
		Thread.sleep(3000);
		google_04_NewsSignInPage.clickOnNewsSBtn();
		
		
		Thread.sleep(3000);
		String actual = google_04_NewsSignInPage.getNewsemailidTxt();
		
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
