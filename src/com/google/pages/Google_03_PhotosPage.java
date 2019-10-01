package com.google.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.google.base.TestBase;
import com.google.config.Xpath;

public class Google_03_PhotosPage extends TestBase {
	
	public Google_03_PhotosPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath= Xpath.PhotosTxt)
	public WebElement PhotosTxt;
	
	@FindBy(xpath= Xpath.GoToGooglePhotosBtn)
	public WebElement GoToGooglePhotosBtn;
	
	@FindBy(xpath= Xpath.PhotosSignInBtn)
	public WebElement PhotosSignInBtn;
	
	
	public String getTitle()
	{
		return driver.getTitle();
	}
	
	
	public boolean checkPhotosTxt()
	{
		return PhotosTxt.isDisplayed();
	}

	public boolean checkGoToGooglePhotosBtn()
	{
		return GoToGooglePhotosBtn.isDisplayed();
	}
	
	public Google_04_PhotosSignInPage clickOnPhotosSignInBtn() throws InterruptedException
	{
		Thread.sleep(5000);
		PhotosSignInBtn.click();
		
		return new Google_04_PhotosSignInPage();
		
	}
	
}
