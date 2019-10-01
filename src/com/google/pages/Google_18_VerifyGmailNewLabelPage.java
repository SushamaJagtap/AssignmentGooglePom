package com.google.pages;

import org.apache.xmlbeans.impl.common.XPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.google.base.TestBase;
import com.google.config.Xpath;

public class Google_18_VerifyGmailNewLabelPage extends TestBase {
	
	public Google_18_VerifyGmailNewLabelPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath=Xpath.createNewLabel)
	public WebElement createNewLabel;
	
	public void clickOncreateNewLabel()
	{
		createNewLabel.click();
	}
	
	
	
	@FindBy(xpath=Xpath.newLabelTxt)
	public WebElement newLabelTxt;
	
	public void enterNewLabelTxt(String str )
	{
		newLabelTxt.sendKeys(str);;
	}
	
	
	
	

}
