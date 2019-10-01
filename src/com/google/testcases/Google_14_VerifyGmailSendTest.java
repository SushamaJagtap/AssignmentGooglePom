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
import com.google.pages.Google_14_VerifyGmailSendPage;
import com.google.util.TestUtil;

public class Google_14_VerifyGmailSendTest extends TestBase{
	
	public SoftAssert softAssert;
	Google_01_Page google_01_Page;
	Google_02_Page google_02_Page;
	Google_03_GmailPage google_03_GmailPage;
	Google_04_GmailSignInPage google_04_GmailSignInPage;
	Google_14_VerifyGmailSendPage google_14_VerifyGmailSendPage;
	
	TestUtil testUtil;
	String sheetName = "Data";
	
	
	Set<String> window = null;
	Iterator<String> it =  null;
	String firstwindow = null , secondwindow = null;
	
	
	
	
	
	
	public Google_14_VerifyGmailSendTest()
	{
		//super();
	}
	
	@BeforeTest
	public void execute() throws IOException
	{
		System.out.println(getTC("Google_14_VerifyGmailSendTest"));
		boolean j = false;
		if(getTC("Google_14_VerifyGmailSendTest")==j)
		{
			throw new SkipException("skipped");
		}
	}
	
	@BeforeMethod
	public void setup() throws InterruptedException
	{
		init();
		softAssert = new SoftAssert();
		
		google_01_Page = new  Google_01_Page();
		google_02_Page = google_01_Page.clickGoogleapp();
		Thread.sleep(3000);
		
		google_03_GmailPage = google_02_Page.clickOnGmail();
		Thread.sleep(3000);
		  
		window = driver.getWindowHandles();
		it = window.iterator();
		firstwindow = it.next();
	
		google_04_GmailSignInPage = google_03_GmailPage.clickOngmailSignInBtn();
		Thread.sleep(3000);
		
		window = driver.getWindowHandles();
		it = window.iterator();
		firstwindow = it.next();
		secondwindow = it.next();
	
		Thread.sleep(3000);
		driver.switchTo().window(secondwindow);
		
	}
	
		@Test(dataProvider="getData")
		public void createAccount(String emailid,String password) throws InterruptedException
		{
			Thread.sleep(3000);
			google_14_VerifyGmailSendPage =	google_04_GmailSignInPage.createAccount7(emailid, password);
	
			Thread.sleep(7000);
			google_14_VerifyGmailSendPage.clickOnGmailComposeBtn();
			
			Thread.sleep(7000);
			google_14_VerifyGmailSendPage.checkSendMailTo("jalajpatel8772@gmail.com");
			
			Thread.sleep(7000);
			google_14_VerifyGmailSendPage.checkSendMaiSubject("Testing purpose");
			
			Thread.sleep(7000);
			google_14_VerifyGmailSendPage.checkSendMailTextArea("Automation Testing");		
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
