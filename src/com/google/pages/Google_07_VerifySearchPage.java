package com.google.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.google.base.TestBase;
import com.google.config.Xpath;

public class Google_07_VerifySearchPage extends TestBase {
	
	public Google_07_VerifySearchPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath=Xpath.wikipedia)
	public WebElement wikipedia;
	
	
	public String getWikipediaTxt()
	{
		return wikipedia.getText();
	}
	

}
