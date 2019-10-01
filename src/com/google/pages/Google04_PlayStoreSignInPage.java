package com.google.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.google.base.TestBase;
import com.google.config.Xpath;

public class Google04_PlayStoreSignInPage extends TestBase {

	public Google04_PlayStoreSignInPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath=Xpath.email)
	public WebElement email;
	
	@FindBy(xpath=Xpath.pass)
	public WebElement pass;
	
	@FindBy(xpath=Xpath.palyStoremailidTxt)
	public WebElement palyStoremailidTxt;
	
	
	@FindBy(xpath=Xpath.palyStoresBtn)
	public WebElement palyStoresBtn;
	
	
	
	public void createAccount(String emailid,String password) throws InterruptedException
	{
		email.sendKeys(emailid);
		email.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		
		pass.sendKeys(password);
		Thread.sleep(3000);
		pass.sendKeys(Keys.ENTER);
	}
	
	
	
	
	public String matchAccount() throws InterruptedException
	{
		Thread.sleep(5000);
		palyStoresBtn.click();
		
		return palyStoremailidTxt.getText();
	}



	
	
}
