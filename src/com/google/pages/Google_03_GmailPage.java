package com.google.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.google.base.TestBase;
import com.google.config.Xpath;

public class Google_03_GmailPage extends TestBase{
	
	public Google_03_GmailPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(xpath=Xpath.gmailImg)
	public WebElement gmailImg;
	
	@FindBy(xpath=Xpath.signinbtn)
	public WebElement signinbtn;

	@FindBy(xpath=Xpath.createaccbtn)
	public WebElement createaccbtn;
	
	
	@FindBy(xpath=Xpath.gmailSignInBtn)
	public WebElement gmailSignInBtn;
	
	public String getTitle()
	{
		return driver.getTitle();
	}
	
	public boolean checkGmailImg() throws InterruptedException
	{
		Thread.sleep(3000);
		return gmailImg.isDisplayed();
	}

	public boolean checkSignInBtn()
	{
		return signinbtn.isDisplayed();
	}
	
	public boolean checkCreateAccBtn()
	{
		return createaccbtn.isDisplayed();
	}
	
	public Google_04_GmailSignInPage clickOngmailSignInBtn()
	{
		gmailSignInBtn.click();
		return new Google_04_GmailSignInPage();
	}
	

}
