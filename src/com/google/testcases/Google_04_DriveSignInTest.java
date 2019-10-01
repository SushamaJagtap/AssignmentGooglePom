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
import com.google.pages.Google_01_Page;
import com.google.pages.Google_02_Page;
import com.google.pages.Google_03_DrivePage;
import com.google.pages.Google_03_GmailPage;
import com.google.pages.Google_04_DriveSignInPage;
import com.google.pages.Google_04_GmailSignInPage;
import com.google.util.TestUtil;

public class Google_04_DriveSignInTest extends TestBase  {
	
	public SoftAssert softAssert;
	public String sheetName = "Data";
	String match=null;
	
	TestUtil testUtil;
	Google_01_Page google_01_Page;
	Google_02_Page google_02_Page;
	Google_03_DrivePage Google_03_DrivePage;
	Google_04_DriveSignInPage google_04_DriveSignInPage;
	

	public Google_04_DriveSignInTest()
	{
		//super();
	}
	
	@BeforeTest
	public void execute() throws IOException
	{
		System.out.println(getTC("Google_04_DriveSignInTest"));
		boolean j = false;
		if(getTC("Google_04_DriveSignInTest")==j)
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
		Google_03_DrivePage = google_02_Page.clickOnDrive();
		Thread.sleep(7000);
		google_04_DriveSignInPage = Google_03_DrivePage.clickOnDriveSignInBtn();
		Thread.sleep(7000);
	}
	

	@Test(priority=2,dataProvider="getData")
	public void matchAccount(String emailid,String password) throws InterruptedException
	{
		Thread.sleep(5000);
		match = emailid;
		Thread.sleep(5000);
		google_04_DriveSignInPage.createAccount(emailid,password);
	
		Thread.sleep(5000);
		String Firstname = google_04_DriveSignInPage.matchAccount();
		
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
