package com.google.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.google.base.TestBase;
import com.google.config.Xpath;

public class Google_12_VerifyUnreadPage extends TestBase {
	
	
	public Google_12_VerifyUnreadPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath=Xpath.inboxNo)
	public WebElement inboxNo;
	
	
	public String getInboxNo()
	{
		return inboxNo.getText();
	}

}
