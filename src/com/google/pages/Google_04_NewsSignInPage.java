package com.google.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.google.base.TestBase;
import com.google.config.Xpath;

public class Google_04_NewsSignInPage extends TestBase {
	
	public Google_04_NewsSignInPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath=Xpath.email)
	public WebElement email;
	
	@FindBy(xpath=Xpath.pass)
	public WebElement pass;
	
	@FindBy(xpath=Xpath.NewsSBtn)
	public WebElement NewsSBtn;
	
	@FindBy(xpath=Xpath.NewsemailidTxt)
	public WebElement NewsemailidTxt;
	
	public void createAccount(String emailid,String password) throws InterruptedException
	{
		email.sendKeys(emailid);
		Thread.sleep(5000);
		email.sendKeys(Keys.ENTER);
		
		Thread.sleep(5000);
		
		pass.sendKeys(password);
		Thread.sleep(5000);
		pass.sendKeys(Keys.ENTER);
		
		Thread.sleep(5000);
	}
	
	public void clickOnNewsSBtn()
	{
		NewsSBtn.click();
	}
	
	public String getNewsemailidTxt()
	{
		return NewsemailidTxt.getText();
	}
	
	

}
