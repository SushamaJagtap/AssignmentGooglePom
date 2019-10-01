package com.google.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.google.base.TestBase;
import com.google.config.Xpath;

public class Google_04_YoutubeSignInPage  extends TestBase{
	
	public Google_04_YoutubeSignInPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath=Xpath.email)
	public WebElement email;
	
	@FindBy(xpath=Xpath.pass)
	public WebElement pass;
	
	@FindBy(xpath=Xpath.matchAccount)
	public WebElement matchAccount;
	
	
	public void createAccount(String emailid,String password) throws InterruptedException
	{
		email.sendKeys(emailid);
		email.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		
		pass.sendKeys(password);
		Thread.sleep(3000);
		pass.sendKeys(Keys.ENTER);
	}
	
	public String matchAccount()
	{
		return matchAccount.getText();
	}




	

}
