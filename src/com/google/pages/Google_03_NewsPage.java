package com.google.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.google.base.TestBase;
import com.google.config.Xpath;

public class Google_03_NewsPage extends TestBase{
	
	
	public Google_03_NewsPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(xpath=Xpath.googleNewstext)
	public WebElement googleNewstext;
	

	@FindBy(xpath=Xpath.googleTopNews)
	public WebElement googleTopNews;
	
	@FindBy(xpath=Xpath.NewsSignInBtn)
	public WebElement NewsSignInBtn ;
	
	public String getTitle()
	{
		return driver.getTitle();
	}
	
	
	public boolean checkGoogleNewsText()
	{
		return googleNewstext.isDisplayed();
	}
	
	public boolean checkGoogleTopNews()
	{
		return googleTopNews.isDisplayed();
	}
	
	public Google_04_NewsSignInPage clickOnSignInBtn()
	{
		NewsSignInBtn.click();
		return new Google_04_NewsSignInPage();
	}

}
