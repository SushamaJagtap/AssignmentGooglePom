package com.google.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.google.base.TestBase;
import com.google.config.Xpath;

public class Google_14_VerifyGmailSendPage extends TestBase{
	
	public Google_14_VerifyGmailSendPage()
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath=Xpath.gmailComposeBtn)
	public WebElement gmailComposeBtn;
	
	public void clickOnGmailComposeBtn() throws InterruptedException
	{
		Thread.sleep(3000);
		gmailComposeBtn.click();
	}
	
	@FindBy(xpath=Xpath.sendMailTo)
	public WebElement sendMailTo;
	
	public void checkSendMailTo(String str) throws InterruptedException
	{
		Thread.sleep(3000);
		sendMailTo.sendKeys(str);
	}
	
	
	@FindBy(xpath=Xpath.sendMaiSubject)
	public WebElement sendMaiSubject;

	public void checkSendMaiSubject(String str) throws InterruptedException
	{
		Thread.sleep(3000);
		sendMaiSubject.sendKeys(str);
	}
	
	
	@FindBy(xpath=Xpath.sendMailTextArea)
	public WebElement sendMailTextArea;

	public void checkSendMailTextArea(String str) throws InterruptedException
	{
		Thread.sleep(3000);
		sendMailTextArea.sendKeys(str);
	}
	
	
	@FindBy(xpath=Xpath.sendBtn)
	public WebElement sendBtn;
	
	public void clickOnSendBtn() throws InterruptedException
	{
		Thread.sleep(3000);
		sendBtn.click();
	}
	
	
	
	
	
}
