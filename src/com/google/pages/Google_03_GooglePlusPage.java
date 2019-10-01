package com.google.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.google.base.TestBase;
import com.google.config.Xpath;

public class Google_03_GooglePlusPage extends TestBase{

	public Google_03_GooglePlusPage()
	{
		PageFactory.initElements(driver,this); 
	}
	
	
	@FindBy(xpath =Xpath.Googleplustext)
	public WebElement Googleplustext;
	
	@FindBy(xpath =Xpath.GooglePlusSearchBox)
	public WebElement GooglePlusSearchBox;
	
	
	public String getTitle()
	{
		return driver.getTitle();
	}
	
	public boolean checkGoogleplustext()
	{
			return Googleplustext.isDisplayed();
	}
	
	public boolean GooglePlusSearchBox()
	{
			return GooglePlusSearchBox.isDisplayed();
	}
	
	
}
