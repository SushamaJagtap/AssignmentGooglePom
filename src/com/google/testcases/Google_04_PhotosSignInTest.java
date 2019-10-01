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
import com.google.pages.Google_03_PhotosPage;
import com.google.pages.Google_03_TranslatePage;
import com.google.pages.Google_04_PhotosSignInPage;
import com.google.pages.Google_04_TranslateSignInPage;
import com.google.util.TestUtil;

public class Google_04_PhotosSignInTest extends TestBase {
	
	public SoftAssert softAssert;
	public String sheetName = "Data";
	String match=null;
	
	TestUtil testUtil;
	
	Google_01_Page google_01_Page;
	Google_02_Page google_02_Page;
	Google_03_PhotosPage google_03_PhotosPage;
	Google_04_PhotosSignInPage google_04_PhotosSignInPage;
	
	
	
	public Google_04_PhotosSignInTest()
	{
		//super();
	}
	
	@BeforeTest
	public void execute() throws IOException
	{
		System.out.println(getTC("Google_04_PhotosSignInTest"));
		boolean j = false;
		if(getTC("Google_04_PhotosSignInTest")==j)
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
		google_03_PhotosPage = google_02_Page.clickOnPhotos();
		Thread.sleep(7000);
		google_04_PhotosSignInPage = google_03_PhotosPage.clickOnPhotosSignInBtn();
		Thread.sleep(7000);
	}
	
	@org.testng.annotations.Test(priority=1,dataProvider="getData")
	public void Test(String email,String pass) throws InterruptedException
	{
		Thread.sleep(5000);
		
		match = email;
		google_04_PhotosSignInPage.createAccount(email, pass);
		
		Thread.sleep(3000);
		google_04_PhotosSignInPage.clickOnPhotosSBtn();
		
		Thread.sleep(3000);
		String actual = google_04_PhotosSignInPage.getmailIdtxt();
		
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
		//driver.quit();
	}
	
	

}
