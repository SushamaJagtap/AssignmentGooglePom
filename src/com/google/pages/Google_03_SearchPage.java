package com.google.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.google.base.TestBase;
import com.google.config.Xpath;

public class Google_03_SearchPage extends TestBase{
	
	public Google_03_SearchPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(xpath=Xpath.search)
	@CacheLookup
	public WebElement search;
	
	@FindBy(xpath=Xpath.googlesearch)
	@CacheLookup
	public WebElement googlesearch;
	
	@FindBy(xpath=Xpath.luckybtn)
	@CacheLookup
	public WebElement luckybtn ;
	
	@FindBy(xpath=Xpath.SearchSignInbtn)
	@CacheLookup
	public WebElement SearchSignInbtn;
	
	public boolean checkSearch()
	{
		return search.isDisplayed();
	}
	
	public boolean checkGoogleSearch()
	{
		return googlesearch.isDisplayed();
	}
	
	public boolean checkLuckybtn()
	{
		return luckybtn.isDisplayed();
	}
	
	public Google_04_SearchSignInPage clickOnSearchSignInbtn()
	{
		SearchSignInbtn.click();
		return new Google_04_SearchSignInPage();
	}
	
	
	
	
	

}
