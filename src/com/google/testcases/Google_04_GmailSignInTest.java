package com.google.testcases;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

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
import com.google.pages.Google_03_GmailPage;
import com.google.pages.Google_04_GmailSignInPage;
import com.google.util.TestUtil;

public class Google_04_GmailSignInTest extends TestBase {
	
	public SoftAssert softAssert;
	public String sheetName = "Data";
	String match=null;
	
	TestUtil testUtil;
	Google_01_Page google_01_Page;
	Google_02_Page google_02_Page;
	Google_03_GmailPage google_03_GmailPage;
	Google_04_GmailSignInPage google_04_GmailSignInPage;
	
	Set<String> window = null;
	Iterator<String> it = null;
	String firstWindow = null;
	String SecondWindow = null;
	
	
	@BeforeTest
	public void execute() throws IOException
	{
		System.out.println(getTC("Google_04_GmailSignInTest"));
		boolean j = false;
		if(getTC("Google_04_GmailSignInTest")==j)
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
		google_03_GmailPage = google_02_Page.clickOnGmail();
		Thread.sleep(7000);
		
		window = driver.getWindowHandles();
		it = window.iterator();
		firstWindow = it.next();
		
		google_04_GmailSignInPage = google_03_GmailPage.clickOngmailSignInBtn();
		Thread.sleep(7000);
		

		window = driver.getWindowHandles();
		it = window.iterator();
		firstWindow = it.next();
		SecondWindow = it.next();
		
		System.out.println(firstWindow+"---------------------"+SecondWindow);
		driver.switchTo().window(SecondWindow);
	}
	

	@Test(priority=1,dataProvider="getData")
	public void matchAccount(String emailid,String password) throws InterruptedException
	{
		Thread.sleep(5000);
		match = emailid;
		Thread.sleep(7000);
		google_04_GmailSignInPage.createAccount(emailid,password);
		
	
		Thread.sleep(5000);
		String Firstname = google_04_GmailSignInPage.matchAccount();
		
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
