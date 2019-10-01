package com.google.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.google.base.TestBase;
import com.google.config.Xpath;

public class Google_03_MyAccountPage extends TestBase{
	
	public Google_03_MyAccountPage()
	{
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath=Xpath.googleAccountTxt)
	public  WebElement googleAccountTxt;
	
	@FindBy(xpath=Xpath.accountsigninbtn)
	public WebElement accountsigninbtn;
	
	public String getTitle()
	{
		return driver.getTitle();
	}
	
	public boolean checkGoogleAccountTxt()
	{
		return googleAccountTxt.isDisplayed();
	}
	
	
	public Google_04_AccountSignInPage clickOnSignInBtn()
	{
		accountsigninbtn.click();
		
		return new  Google_04_AccountSignInPage();
	}
	
	
	
}
