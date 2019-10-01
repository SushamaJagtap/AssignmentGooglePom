package com.google.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.google.base.TestBase;
import com.google.config.Xpath;

public class Google_01_Page  extends TestBase{

	 
	
	public Google_01_Page()
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath=Xpath.search)
	public WebElement search;
	
	@FindBy(xpath=Xpath.googlesearch)
	public WebElement googlesearch;
	
	
	@FindBy(xpath=Xpath.luckybtn)
	public WebElement luckybtn;
	
	@FindBy(xpath=Xpath.signin)
	public WebElement signin;
	
	@FindBy(xpath=Xpath.googleapp)
	public WebElement googleapp;
	
	
	@FindBy(xpath=Xpath.HindiBtn)
	public WebElement HindiBtn;
	
	public boolean checkSearch()
	{
		drawBorder(search, driver);
		return search.isDisplayed();
	}
	
	public boolean checkGoogleSearch()
	{
		drawBorder(googlesearch, driver);
		return googlesearch.isDisplayed();
	}
	
	public boolean checkLuckybtn()
	{
		drawBorder(luckybtn, driver);
		return luckybtn.isDisplayed();
	}
	
	public boolean checkSignin()
	{
		drawBorder(signin, driver);
		return signin.isDisplayed();
	}
	
	public  Google_02_Page clickGoogleapp()
	{
		googleapp.click();
		return  new Google_02_Page() ;
	}
	
	
	public Google_05_HindiPage clickOnHindiBtn() throws InterruptedException
	{
		HindiBtn.click();
		Thread.sleep(5000);
		
		driver.navigate().back();
		
		return new Google_05_HindiPage();
	}
	
	public Google_07_VerifySearchPage clickOnSearch(String str) throws InterruptedException
	{
		search.sendKeys(str);
		Thread.sleep(3000);
		search.sendKeys(Keys.ENTER);
		
		return new Google_07_VerifySearchPage();
	}
	
	
	
	
	
	
	
}

