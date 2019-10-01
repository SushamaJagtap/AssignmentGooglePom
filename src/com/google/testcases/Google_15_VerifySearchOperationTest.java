package com.google.testcases;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

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
import com.google.pages.Google_03_GmailPage;
import com.google.pages.Google_03_MapPage;
import com.google.pages.Google_04_GmailSignInPage;
import com.google.pages.Google_15_VerifySearchOperationPage;
import com.google.util.TestUtil;

public class Google_15_VerifySearchOperationTest extends TestBase {
	
	public SoftAssert softAssert;
	TestUtil testUtil;
	String sheetName = "Data";
	Set<String> window = null;
	Iterator<String> it = null;
	String firstwindow = null, secondwindow = null;
	
	
	
	
	
	Google_01_Page google_01_Page;
	Google_02_Page google_02_Page;
	Google_03_GmailPage google_03_GmailPage;
	Google_04_GmailSignInPage google_04_GmailSignInPage;
	Google_15_VerifySearchOperationPage google_15_VerifySearchOperationPage;
	
	public Google_15_VerifySearchOperationTest()
	{
		super();
	}
	
	@BeforeTest
	public void execute() throws IOException
	{
		System.out.println(getTC("Google_15_VerifySearchOperationTest"));
		boolean j = false;
		if(getTC("Google_15_VerifySearchOperationTest")==j)
		{
			throw new SkipException("skipped");
		}
	}
	
	@BeforeMethod 
	public void setup() throws InterruptedException
	{
		init();
		
		Thread.sleep(3000);
		softAssert = new SoftAssert();
		google_01_Page = new Google_01_Page();
		
		Thread.sleep(3000);
		google_02_Page = google_01_Page.clickGoogleapp();
		Thread.sleep(3000);
		
		google_03_GmailPage = google_02_Page.clickOnGmail();
		Thread.sleep(3000);
		
		google_04_GmailSignInPage = google_03_GmailPage.clickOngmailSignInBtn();
	
		window = driver.getWindowHandles();
		it = window.iterator();
		firstwindow = it.next();
		secondwindow = it.next();
		
		System.out.println(firstwindow+"-----"+secondwindow);
		
		Thread.sleep(3000);
		driver.switchTo().window(secondwindow);
	}
	
	
	@Test(dataProvider="getData")
	public void createAccount(String emailid,String password) throws InterruptedException
	{
		Thread.sleep(3000);
		google_15_VerifySearchOperationPage = google_04_GmailSignInPage.createAccount8(emailid, password);
	
		Thread.sleep(3000);
		google_15_VerifySearchOperationPage.checkSearchTextArea("jalajpatel8772@gmail.com");
	
		Thread.sleep(3000);
		boolean flag = google_15_VerifySearchOperationPage.checkSearchMailId();
		softAssert.assertTrue(flag);
		softAssert.assertAll();
	}

	@DataProvider
	public Object[][] getData() throws EncryptedDocumentException, IOException
	{
		testUtil = new TestUtil();
		return testUtil.getData(sheetName);
	}
	
	
	
}
