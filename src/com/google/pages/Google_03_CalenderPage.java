package com.google.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.google.base.TestBase;
import com.google.config.Xpath;

public class Google_03_CalenderPage extends TestBase {
	
	public Google_03_CalenderPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath=Xpath.CalenderSignInBtn)
	public WebElement CalenderSignInBtn;
	
	
	public String getTitle()
	{
		return driver.getTitle();
	}
	
	public Google_04_CalenderSignInPage clickOnCalenderSignInBtn()
	{
		CalenderSignInBtn.click();
		
		return new Google_04_CalenderSignInPage();
	}
	
	
	

}
