package com.google.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.google.base.TestBase;
import com.google.config.Xpath;

public class Google_12_VerifyReadMailPage extends TestBase{
	
	public Google_12_VerifyReadMailPage()
	{
			PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath=Xpath.inboxNo)
	public WebElement inboxNo;
	
	@FindBy(xpath=Xpath.rightSideNo)
	public WebElement rightSideNo;
	
	
	public String getInboxNo()
	{
		return inboxNo.getText();
	}
	
	public String getRightSideNo()
	{
		return rightSideNo.getText();
	}
	
	
	
	

}
