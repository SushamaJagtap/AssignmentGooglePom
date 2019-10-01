package com.google.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.google.base.TestBase;
import com.google.config.Xpath;

public class Google_04_TranslateSignInPage extends TestBase {
	
	public Google_04_TranslateSignInPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath=Xpath.email)
	public WebElement email;
	
	
	@FindBy(xpath=Xpath.pass)
	public WebElement pass;
	
	@FindBy(xpath=Xpath.TranslateSBtn)
	public WebElement TranslateSBtn;
	
	@FindBy(xpath=Xpath.TranslatemailidTxt)
	public WebElement TranslatemailidTxt;
	
	public void createAccount(String username,String password) throws InterruptedException
	{
		email.sendKeys(username);
		Thread.sleep(5000);
		email.sendKeys(Keys.ENTER);
		
		Thread.sleep(5000);
		
		pass.sendKeys(password);
		Thread.sleep(5000);
		pass.sendKeys(Keys.ENTER);
		
		Thread.sleep(5000);
	}
	
	
	
	public String getmailIdtxt() throws InterruptedException
	{
		Thread.sleep(5000);
			
		TranslateSBtn.click();
		
		return TranslatemailidTxt.getText();
	}
	
	

	
	
	
	

}
