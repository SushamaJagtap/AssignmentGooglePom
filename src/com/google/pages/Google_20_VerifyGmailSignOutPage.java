package com.google.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.google.base.TestBase;
import com.google.config.Xpath;

public class Google_20_VerifyGmailSignOutPage extends TestBase {
	
	public Google_20_VerifyGmailSignOutPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath=Xpath.SBtn)
	public WebElement SBtn;
	
	public void clickOnSBtn()
	{
		SBtn.click();
	}
	
	@FindBy(xpath=Xpath.SignOutBtn)
	public WebElement SignOutBtn;
	
	public void clickOnSignOutBtn()
	{
		SignOutBtn.click();
	}
	
	

}
