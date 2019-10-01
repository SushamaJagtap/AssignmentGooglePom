package com.google.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.google.base.TestBase;
import com.google.config.Xpath;

public class Google_03_PlayStorePage extends TestBase{
	
	public Google_03_PlayStorePage()
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath=Xpath.playstoreimg)
	public WebElement playstoreimg;
	
	@FindBy(xpath=Xpath.playcontent)
	public WebElement playcontent;
	
	@FindBy(xpath= Xpath.playsearchbox)
	public WebElement playsearchbox;
	
	@FindBy(xpath= Xpath.palyStoreSignInBtn)
	public WebElement palyStoreSignInBtn;
	
	public String getTitle()
	{
		return driver.getTitle();
	}
	
	public boolean checkPlayStoreImg()
	{
		return playstoreimg.isDisplayed();
	}
	
	public boolean checkPlaySearchBox()
	{
		return playsearchbox.isDisplayed();
	}
	
	public boolean checkPlayContent()
	{
		return playcontent.isDisplayed();
	}
	
	public Google04_PlayStoreSignInPage clickOnPlayStoreSignInBtn()
	{
		palyStoreSignInBtn.click();
		return new  Google04_PlayStoreSignInPage();
	}
	
	
	
	
}
