package com.google.testcases;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
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
import com.google.pages.Google_10_GmailVerifyPage;
import com.google.util.TestUtil;

public class Google_10_GmailVerifyTest extends TestBase{

	public SoftAssert softAssert;
	Google_01_Page google_01_Page;
	Google_02_Page google_02_Page;
	Google_03_GmailPage google_03_GmailPage;
	Google_04_GmailSignInPage google_04_GmailSignInPage;
	Google_10_GmailVerifyPage google_10_GmailVerifyPage;
	TestUtil testUtil;
	String sheetName = "Data";
	Set<String> window = null;
	Iterator<String> it = null;
	String firstWindow = null;
	String SecondWindow = null;
	
	
	
	
	public Google_10_GmailVerifyTest()
	{
		//super();
	}
	
	@BeforeTest
	public void execute() throws IOException
	{
		System.out.println(getTC("Google_10_GmailVerifyTest"));
		boolean j = false;
		if(getTC("Google_10_GmailVerifyTest")==j)
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

	@Test(priority=1,dataProvider="getData")
	public void createAccount(String emailid,String password) throws InterruptedException
	{
		Thread.sleep(3000);
		google_10_GmailVerifyPage = google_04_GmailSignInPage.createAccount1(emailid, password);
		
		
		/*String inboxNo = google_10_GmailVerifyPage.getInboxNo();
		System.out.println(inboxNo+"------------------------"); 
		int a = Integer.parseInt(inboxNo);
		
		Thread.sleep(10000);
		String rightSideNo = google_10_GmailVerifyPage.getRightSideNo();
		System.out.println(rightSideNo+"------------------------");
		Thread.sleep(9000);
		int b = Integer.parseInt(rightSideNo);
	
			softAssert.assertEquals(a, b);
			softAssert.assertAll();*/
		
		Thread.sleep(9000);
		
		String rightSideNo = google_10_GmailVerifyPage.getRightSideNo();
		int a = Integer.parseInt(rightSideNo);
		System.out.println(a);
		
		List<WebElement> l = driver.findElements(By.xpath("//table[@cellpadding='0' and @id=':1t']//descendant::tr"));
		l.size();
		
		System.out.println(l.size());
		
		if(l.size()!=a)
		{
			driver.findElement(By.xpath("//div[@id=\":k5\"]")).click();
			
			l = driver.findElements(By.xpath("//table[@id=\":mq\"]//descendant::tr"));
		}
		
		System.out.println(l.size());
		
		
		
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
