package com.google.testcases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.google.base.TestBase;
import com.google.pages.Google04_PlayStoreSignInPage;
import com.google.pages.Google_01_Page;
import com.google.pages.Google_02_Page;
import com.google.pages.Google_03_PlayStorePage;
import com.google.util.TestUtil;

public class Google04_PlayStoreSignInTest extends TestBase{

	public SoftAssert softAssert;
	public String sheetName = "Data";
	String match=null;
	
	TestUtil testUtil;
	Google_01_Page google_01_Page;
	Google_02_Page google_02_Page;
	Google_03_PlayStorePage google_03_PlayStorePage;
	Google04_PlayStoreSignInPage google04_PlayStoreSignInPage;
	
	
	public Google04_PlayStoreSignInTest()
	{
		//super();
	}
	
	@BeforeTest
	public void execute() throws IOException
	{
		System.out.println(getTC("Google04_PlayStoreSignInTest"));
		boolean j = false;
		if(getTC("Google04_PlayStoreSignInTest")==j)
		{
			throw new SkipException("skipped");
		}
	}
	
	@BeforeMethod
	public void setup() throws InterruptedException, EncryptedDocumentException, IOException
	{
		init();
		softAssert = new SoftAssert();
		
		
		google_01_Page = new Google_01_Page();
		Thread.sleep(5000);
		google_02_Page = google_01_Page.clickGoogleapp();
		Thread.sleep(7000);
		google_03_PlayStorePage = google_02_Page.clickOnPlaystore();
		Thread.sleep(5000);
		google04_PlayStoreSignInPage = google_03_PlayStorePage.clickOnPlayStoreSignInBtn();
		Thread.sleep(5000);
	}
	
	
	
	
	@Test(priority=1,dataProvider="getData")
	public void matchAccount(String emailid,String password) throws InterruptedException
	{
		match = emailid;
		Thread.sleep(5000);
		google04_PlayStoreSignInPage.createAccount(emailid,password);
	
		Thread.sleep(6000);
		String Firstname = google04_PlayStoreSignInPage.matchAccount();
		
		if(match.contains(Firstname))
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