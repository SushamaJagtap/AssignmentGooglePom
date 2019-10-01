package com.google.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.google.base.TestBase;
import com.google.config.Xpath;

public class Google_15_VerifySearchOperationPage extends TestBase {
	
	public Google_15_VerifySearchOperationPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath=Xpath.searchTextArea)
	public WebElement searchTextArea;
	
	@FindBy(xpath=Xpath.searchMailId)
	public WebElement searchMailId;
	
	
	public void checkSearchTextArea(String str) throws InterruptedException
	{
		Thread.sleep(3000);
		searchTextArea.sendKeys(str);
		searchTextArea.sendKeys(Keys.ENTER);
	}
	
	public boolean checkSearchMailId()
	{
		return searchMailId.isDisplayed();
	}
	
	
	
	
	

}
