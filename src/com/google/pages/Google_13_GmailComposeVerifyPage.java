package com.google.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.google.base.TestBase;
import com.google.config.Xpath;

public class Google_13_GmailComposeVerifyPage extends TestBase {
	
	public Google_13_GmailComposeVerifyPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath=Xpath.gmailComposeBtn)
	public WebElement gmailComposeBtn;
	
	@FindBy(xpath=Xpath.composeDailogueBox )
	public WebElement composeDailogueBox;
	
	
	public void clickOnGmailComposeBtn()
	{
		gmailComposeBtn.click();
	}
	
	public boolean checkComposeDailogueBox()
	{
		return composeDailogueBox.isDisplayed();
	}
	
	
	

}
