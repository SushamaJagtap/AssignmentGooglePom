package com.google.pages;


import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;




import com.google.base.TestBase;
import com.google.config.Xpath;
import com.google.testcases.Google_02_Test;

public class Google_02_Page extends TestBase {

	
	
	
	Google_02_Test  Google_02_Test;
	
	
	public Google_02_Page()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath=Xpath.account)
	public WebElement account;
	
	@FindBy(xpath=Xpath.searchbtn)
	public WebElement searchbtn;
	
	@FindBy(xpath=Xpath.map)
	public WebElement map;
	
	@FindBy(xpath=Xpath.youtube)
	public WebElement youtube;
	
	@FindBy(xpath=Xpath.playstore)
	public WebElement playstore;
	
	@FindBy(xpath=Xpath.news)
	public WebElement news;
	
	@FindBy(xpath=Xpath.gmail)
	public WebElement gmail;
	
	@FindBy(xpath=Xpath.drive)
	public WebElement drive;
	
	@FindBy(xpath=Xpath.calender)
	public WebElement calender;
	
	@FindBy(xpath=Xpath.googleplus)
	public WebElement googleplus;
	
	@FindBy(xpath=Xpath.translate)
	public WebElement translate;
	
	@FindBy(xpath=Xpath.photos)
	public WebElement photos;
	
	public boolean checkAccount()
	{
		drawBorder(account, driver);
			return account.isDisplayed();
		
	}
	
	public boolean checkSearchbtn() 
	{
		drawBorder(searchbtn, driver);
		return searchbtn.isDisplayed();
	}
	
	public boolean checkMap() 
	{
		drawBorder(map, driver);
		return map.isDisplayed();
	}
	
	public boolean checkYoutube() 
	{
		drawBorder(youtube, driver);
		return youtube.isDisplayed();
	}
	
	public boolean checkPlaystore()
	{
		drawBorder(playstore, driver);
		return playstore.isDisplayed();
	}
	
	public boolean checkNews()
	{
		drawBorder(news, driver);
		return news.isDisplayed();
	}
	
	public boolean checkGmail()
	{
		drawBorder(gmail, driver);
		return gmail.isDisplayed();
	}
	
	public boolean checkDrive()
	{
		drawBorder(drive, driver);
		return drive.isDisplayed();
	}
	
	public boolean checkCalender()
	{
		drawBorder(calender, driver);
		return calender.isDisplayed();
	}
	
	public boolean checkGooglePlus()
	{
		drawBorder(googleplus, driver);
		return googleplus.isDisplayed();
	}
	
	public boolean checkTranslate()
	{
		drawBorder(translate, driver);
		return translate.isDisplayed();
	}
	
	public boolean checkPhotos()
	{
		drawBorder(photos, driver);
		return photos.isDisplayed();
	}

	
//---------------------------------Clicking--------------------------------	
	
	

	public Google_03_MyAccountPage clickOnMyAccount()
	{
		drawBorder(account, driver);
		account.click();
		
		return new Google_03_MyAccountPage();
			
	}
	
	
	public Google_03_SearchPage clickOnSearchbtn() 
	{
		drawBorder(searchbtn, driver);
		searchbtn.click();
		
		  return new Google_03_SearchPage(); 
	}
	
	
	
	public Google_03_MapPage clickOnMap() throws InterruptedException 
	{
		drawBorder(map, driver);
		Thread.sleep(5000);
		map.click();
		 return  new Google_03_MapPage() ;
	}
	
	public Goggle_03_YouTubePage clickOnYoutube() 
	{
		drawBorder(youtube, driver);
		youtube.click();
		return new Goggle_03_YouTubePage();
	}
	
	public Google_03_PlayStorePage clickOnPlaystore()
	{
		drawBorder(playstore, driver);
		playstore.click();
		return new Google_03_PlayStorePage();
	}
	
	public Google_03_NewsPage clickOnNews()
	{
		drawBorder(news, driver);
		news.click();
		return new Google_03_NewsPage();
	}
	
	public Google_03_GmailPage clickOnGmail()
	{
		drawBorder(gmail, driver);
		gmail.click();
		return new Google_03_GmailPage();
	}
	
	public Google_03_DrivePage clickOnDrive()
	{
		drawBorder(drive, driver);
		drive.click();
		return new Google_03_DrivePage();
	}
	
	public Google_03_CalenderPage clickOnCalender()
	{
		drawBorder(calender, driver);
		calender.click();
		
		return new Google_03_CalenderPage();
		
	}
	
	public Google_03_GooglePlusPage clickOnGooglePlus()
	{
		drawBorder(googleplus, driver);
		googleplus.click();
		
		return new Google_03_GooglePlusPage(); 
	}
	
	public Google_03_TranslatePage clickOnTranslate()
	{
		drawBorder(translate, driver);
		translate.click();
		return new Google_03_TranslatePage();
	}
	
	public Google_03_PhotosPage clickOnPhotos()
	{
		drawBorder(photos, driver);
		photos.click();
		return new Google_03_PhotosPage();
	}










}
