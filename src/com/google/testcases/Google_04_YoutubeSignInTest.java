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
import com.google.pages.Goggle_03_YouTubePage;
import com.google.pages.Google_01_Page;
import com.google.pages.Google_02_Page;
import com.google.pages.Google_03_MyAccountPage;
import com.google.pages.Google_04_AccountSignInPage;
import com.google.pages.Google_04_YoutubeSignInPage;
import com.google.util.TestUtil;

public class Google_04_YoutubeSignInTest extends TestBase{
	
	public SoftAssert softAssert;
	public String sheetName = "Data";
	String match=null;
	
	TestUtil testUtil;
	Google_01_Page google_01_Page;
	Google_02_Page google_02_Page;
	Goggle_03_YouTubePage google_03_YouTubePage;
	Google_04_YoutubeSignInPage google_04_YoutubeSignInPage;
	
	
	@BeforeTest
	public void execute() throws IOException
	{
		System.out.println(getTC("Google_04_YoutubeSignInTest"));
		boolean j = false;
		if(getTC("Google_04_YoutubeSignInTest")==j)
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
		 google_03_YouTubePage = google_02_Page.clickOnYoutube();
		Thread.sleep(7000);
		google_04_YoutubeSignInPage = google_03_YouTubePage.clickOnYouTubeSignInBtn();
		Thread.sleep(7000);
	}
	
	
	
	@Test(priority=2,dataProvider="getData")
	public void matchAccount(String emailid,String password) throws InterruptedException
	{
		match = emailid;
		Thread.sleep(5000);
		
		
	
		Thread.sleep(5000);
		String Firstname = google_04_YoutubeSignInPage.matchAccount();
		
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
