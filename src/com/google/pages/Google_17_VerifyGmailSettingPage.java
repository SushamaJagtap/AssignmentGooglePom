package com.google.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.google.base.TestBase;
import com.google.config.Xpath;

public class Google_17_VerifyGmailSettingPage extends TestBase {
	
	public Google_17_VerifyGmailSettingPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath=Xpath.settingIcon)
	public WebElement settingIcon;
	
	public void clickOnSettingIcon()
	{
		settingIcon.click();
	}
	
	@FindBy(xpath=Xpath.settingTxt)
	public WebElement settingTxt;
	
	public void clickOnSettingTxt()
	{
		settingTxt.click();
	}
	
	
	@FindBy(xpath=Xpath.settingPage)
	public WebElement settingPage;
	
	public boolean checksettingPage()
	{
		return settingPage.isDisplayed();
	}
	
	

}
