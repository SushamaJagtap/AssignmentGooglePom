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
import com.google.pages.Google_12_VerifyReadMailPage;
import com.google.pages.Google_12_VerifyUnreadPage;
import com.google.util.TestUtil;

public class Google_12_VerifyReadMailTest extends TestBase {

	public SoftAssert softAssert;
	Google_01_Page google_01_Page;
	Google_02_Page google_02_Page;
	Google_03_GmailPage google_03_GmailPage;
	Google_04_GmailSignInPage google_04_GmailSignInPage;
	Google_12_VerifyReadMailPage google_12_VerifyReadMailPage;
	
	TestUtil testUtil;
	String sheetName = "Data";
	Set<String> window = null;
	Iterator<String> it = null;
	String firstWindow = null;
	String SecondWindow = null;
	
	
	public Google_12_VerifyReadMailTest()
	{
		//super();
	}
	
	@BeforeTest
	public void execute() throws IOException
	{
		System.out.println(getTC("Google_12_VerifyReadMailTest"));
		boolean j = false;
		if(getTC("Google_12_VerifyReadMailTest")==j)
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

	@Test(dataProvider="getData")
	public void createAccount(String emailid,String password) throws InterruptedException
	{
		Thread.sleep(3000);
		google_12_VerifyReadMailPage = google_04_GmailSignInPage.createAccount5(emailid, password);
		Thread.sleep(7000);
		
		
		String unreadMail = google_12_VerifyReadMailPage.getInboxNo();
		int a = Integer.parseInt(unreadMail);
		
		String totalMail = google_12_VerifyReadMailPage.getRightSideNo();
		int b = Integer.parseInt(totalMail);
		
		System.out.println("Total Read mail is : "+(b-a));
		
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
