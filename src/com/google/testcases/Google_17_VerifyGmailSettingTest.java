package com.google.testcases;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.junit.After;
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
import com.google.pages.Google_17_VerifyGmailSettingPage;
import com.google.util.TestUtil;

public class Google_17_VerifyGmailSettingTest extends TestBase{
	
	public SoftAssert softAssert;
	Google_01_Page google_01_Page;
	Google_02_Page google_02_Page;
	Google_03_GmailPage google_03_GmailPage;
	Google_04_GmailSignInPage google_04_GmailSignInPage;
	Google_17_VerifyGmailSettingPage google_17_VerifyGmailSettingPage;
	
	TestUtil testUtil;
	String sheetName = "Data";
	
	Set<String> window = null;
	Iterator<String> it = null;
	String firstwindow = null;
	String secondwindow = null;
	
	
	
	public Google_17_VerifyGmailSettingTest()
	{
		//super();
	}
	
	@BeforeTest
	public void execute() throws IOException
	{
		System.out.println(getTC("Google_17_VerifyGmailSettingTest"));
		boolean j = false;
		if(getTC("Google_17_VerifyGmailSettingTest")==j)
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
		
		Thread.sleep(3000);
		google_03_GmailPage = google_02_Page.clickOnGmail();
		
		Thread.sleep(3000);
		google_04_GmailSignInPage = google_03_GmailPage.clickOngmailSignInBtn();
		
	
		window = driver.getWindowHandles();
		it = window.iterator();
		firstwindow = it.next();
		secondwindow = it.next();
		
		System.out.println(firstwindow+"---------"+secondwindow);
		
		driver.switchTo().window(secondwindow);
	
	}
	
	@Test(dataProvider="getData")
	public void createAccount(String emailid,String password) throws InterruptedException
	{
		Thread.sleep(3000);
		google_17_VerifyGmailSettingPage = google_04_GmailSignInPage.createAccount10(emailid, password);
		
		Thread.sleep(3000);
		google_17_VerifyGmailSettingPage.clickOnSettingIcon();
		
		Thread.sleep(3000);
		google_17_VerifyGmailSettingPage.clickOnSettingTxt();
		
		boolean flag = google_17_VerifyGmailSettingPage.checksettingPage();
		softAssert.assertTrue(flag);
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
