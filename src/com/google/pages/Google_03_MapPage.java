package com.google.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.google.base.TestBase;
import com.google.config.Xpath;

public class Google_03_MapPage extends TestBase {

	public Google_03_MapPage() 
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath=Xpath.serachgooglemap) 
	@CacheLookup
	public WebElement serachgooglemap;
	
	@FindBy(xpath=Xpath.horizontalmap) 
	@CacheLookup
	public WebElement horizontal;
	
	
	@FindBy(xpath=Xpath.mapSignInBtn)
	public WebElement mapSignInBtn; 
	
	
	public boolean checkSerachGoogleMap()
	{
		return serachgooglemap.isDisplayed();
	}
	
	public boolean checkHorizontal()
	{
		return horizontal.isDisplayed();
	}
	
	public Google_04_MapSignInPage clickOnMapSignBtn()
	{
		mapSignInBtn.click();
		return new Google_04_MapSignInPage();
	}
	
	
}
	

