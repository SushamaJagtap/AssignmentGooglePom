package com.google.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.google.base.TestBase;
import com.google.config.Xpath;

public class Goggle_03_YouTubePage extends TestBase {

	public Goggle_03_YouTubePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath=Xpath.youtubetext)
	@CacheLookup
	public WebElement youtubetext;
	
	@FindBy(xpath=Xpath.youtubesearchbox)
	@CacheLookup
	public WebElement youtubesearchbox;
	
	
	@FindBy(xpath=Xpath.youtubeuploadbtn)
	@CacheLookup
	public WebElement youtubeuploadbtn;
	
	@FindBy(xpath=Xpath.youtubeSignInBtn)
	@CacheLookup
	public WebElement youtubeSignInbtn;
	
	
	
	
	public String getTitle()
	{
		return driver.getTitle();
	}
	
	public boolean checkYoutubeText() throws InterruptedException
	{
		Thread.sleep(3000);
		return youtubetext.isDisplayed();
	}
	
	public boolean checkYoutubeSearchbox() throws InterruptedException
	{
		Thread.sleep(3000);
		return youtubesearchbox.isDisplayed();
	}
	
	public boolean checkUploadbtn() throws InterruptedException
	{
		Thread.sleep(3000);
		return youtubeuploadbtn.isDisplayed();
	}
	
	public Google_04_YoutubeSignInPage clickOnYouTubeSignInBtn()
	{
		youtubeSignInbtn.click();
		
		return new Google_04_YoutubeSignInPage();
	}
	
	
	
}
