package com.google.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.google.base.TestBase;
import com.google.config.Xpath;

public class Google_03_TranslatePage extends TestBase {

	public Google_03_TranslatePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath=Xpath.TranslateTxt)
	public WebElement TranslateTxt;
	
	@FindBy(xpath=Xpath.TranslateBtn)
	public WebElement TranslateBtn;
	
	@FindBy(xpath=Xpath.TranslateSignInBtn)
	public WebElement TranslateSignInBtn;
	
	
	
	public boolean checkTranslateTxt()
	{
		return TranslateTxt.isDisplayed();
	}
	
	public boolean checkTranslateBtn()
	{
		return TranslateBtn.isDisplayed();
	}
	
	
	public String getTitle()
	{
		return driver.getTitle();
	}
	
	public Google_04_TranslateSignInPage clickOnTranslateSignInBtn()
	{
		TranslateSignInBtn.click();
		
		return new Google_04_TranslateSignInPage();
	}
	
	
	
	
	
	
}
