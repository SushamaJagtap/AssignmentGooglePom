package com.google.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.google.base.TestBase;
import com.google.config.Xpath;

public class Google_04_GmailSignInPage extends TestBase{
	
	public Google_04_GmailSignInPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath=Xpath.email)
	public WebElement email;
	
	@FindBy(xpath=Xpath.pass)
	public WebElement pass;
	
	@FindBy(xpath=Xpath.gmailSBtn)
	public WebElement gmailSBtn;
	
	@FindBy(xpath=Xpath.gmailmailidTxt)
	public WebElement gmailmailidTxt;
	
	
	
	public void createAccount(String emailid,String password) throws InterruptedException
	{
		Thread.sleep(3000);
		
		email.sendKeys(emailid);
		email.sendKeys(Keys.ENTER);
		Thread.sleep(9000);
		
		pass.sendKeys(password);
		Thread.sleep(3000);
		pass.sendKeys(Keys.ENTER);
	}
	
	public Google_10_GmailVerifyPage createAccount1(String emailid,String password) throws InterruptedException
	{
		Thread.sleep(3000);
		
		email.sendKeys(emailid);
		email.sendKeys(Keys.ENTER);
		Thread.sleep(7000);
		
		pass.sendKeys(password);
		Thread.sleep(7000);
		pass.sendKeys(Keys.ENTER);
		
		return new Google_10_GmailVerifyPage();
	}
	
	public Google_11_VerifyStarMailPage createAccount2(String emailid,String password) throws InterruptedException
	{
		Thread.sleep(3000);
		
		email.sendKeys(emailid);
		email.sendKeys(Keys.ENTER);
		Thread.sleep(7000);
		
		pass.sendKeys(password);
		Thread.sleep(7000);
		pass.sendKeys(Keys.ENTER);
		
		return new Google_11_VerifyStarMailPage();
	}
	
	
	public Google_11_VerifyStarMailPage createAccount3(String emailid,String password) throws InterruptedException
	{
		Thread.sleep(3000);
		
		email.sendKeys(emailid);
		email.sendKeys(Keys.ENTER);
		Thread.sleep(7000);
		
		pass.sendKeys(password);
		Thread.sleep(7000);
		pass.sendKeys(Keys.ENTER);
		
		return new Google_11_VerifyStarMailPage();
	}
	
	public Google_12_VerifyUnreadPage createAccount4(String emailid,String password) throws InterruptedException
	{
		Thread.sleep(3000);
		
		email.sendKeys(emailid);
		email.sendKeys(Keys.ENTER);
		Thread.sleep(7000);
		
		pass.sendKeys(password);
		Thread.sleep(7000);
		pass.sendKeys(Keys.ENTER);
		
		return new Google_12_VerifyUnreadPage();
		
	}
	
	public Google_12_VerifyReadMailPage createAccount5(String emailid,String password) throws InterruptedException
	{
		Thread.sleep(3000);
		
		email.sendKeys(emailid);
		email.sendKeys(Keys.ENTER);
		Thread.sleep(7000);
		
		pass.sendKeys(password);
		Thread.sleep(7000);
		pass.sendKeys(Keys.ENTER);
		
		return new Google_12_VerifyReadMailPage();
		
	}
	

	public Google_13_GmailComposeVerifyPage createAccount6(String emailid,String password) throws InterruptedException
	{
		Thread.sleep(3000);
		
		email.sendKeys(emailid);
		email.sendKeys(Keys.ENTER);
		Thread.sleep(7000);
		
		pass.sendKeys(password);
		Thread.sleep(7000);
		pass.sendKeys(Keys.ENTER);
		
		return new Google_13_GmailComposeVerifyPage();
		
	}

	public Google_14_VerifyGmailSendPage createAccount7(String emailid,String password) throws InterruptedException
	{
		Thread.sleep(3000);
		
		email.sendKeys(emailid);
		email.sendKeys(Keys.ENTER);
		Thread.sleep(7000);
		
		pass.sendKeys(password);
		Thread.sleep(7000);
		pass.sendKeys(Keys.ENTER);
		
		return new Google_14_VerifyGmailSendPage();
		
	}
	
	public Google_15_VerifySearchOperationPage createAccount8(String emailid,String password) throws InterruptedException
	{
		Thread.sleep(3000);
		
		email.sendKeys(emailid);
		email.sendKeys(Keys.ENTER);
		Thread.sleep(7000);
		
		pass.sendKeys(password);
		Thread.sleep(7000);
		pass.sendKeys(Keys.ENTER);
		
		return new Google_15_VerifySearchOperationPage();
		
	}
	
	public Google_16_GmailAttachmentPage createAccount9(String emailid,String password) throws InterruptedException
	{
		Thread.sleep(3000);
		
		email.sendKeys(emailid);
		email.sendKeys(Keys.ENTER);
		Thread.sleep(7000);
		
		pass.sendKeys(password);
		Thread.sleep(7000);
		pass.sendKeys(Keys.ENTER);
		
		return new Google_16_GmailAttachmentPage();
		
	}
	
	

	
	public Google_17_VerifyGmailSettingPage createAccount10(String emailid,String password) throws InterruptedException
	{
		Thread.sleep(3000);
		
		email.sendKeys(emailid);
		email.sendKeys(Keys.ENTER);
		Thread.sleep(7000);
		
		pass.sendKeys(password);
		Thread.sleep(7000);
		pass.sendKeys(Keys.ENTER);
		
		return new Google_17_VerifyGmailSettingPage();
		
	}
	
	
	
	
	
	
	public Google_18_VerifyGmailNewLabelPage createAccount11(String emailid,String password) throws InterruptedException
	{
		Thread.sleep(3000);
		
		email.sendKeys(emailid);
		email.sendKeys(Keys.ENTER);
		Thread.sleep(7000);
		
		pass.sendKeys(password);
		Thread.sleep(7000);
		pass.sendKeys(Keys.ENTER);
		
		return new Google_18_VerifyGmailNewLabelPage();
		
	}
	
	
	
	public Google_19_VerifyGmailMovedPage createAccount12(String emailid,String password) throws InterruptedException
	{
		Thread.sleep(3000);
		
		email.sendKeys(emailid);
		email.sendKeys(Keys.ENTER);
		Thread.sleep(7000);
		
		pass.sendKeys(password);
		Thread.sleep(7000);
		pass.sendKeys(Keys.ENTER);
		
		return new Google_19_VerifyGmailMovedPage();
		
	}
	
	
	
	
	public Google_20_VerifyGmailSignOutPage createAccount13(String emailid,String password) throws InterruptedException
	{
		Thread.sleep(3000);
		
		email.sendKeys(emailid);
		email.sendKeys(Keys.ENTER);
		Thread.sleep(7000);
		
		pass.sendKeys(password);
		Thread.sleep(7000);
		pass.sendKeys(Keys.ENTER);
		
		return new Google_20_VerifyGmailSignOutPage();
		
	}
	
	
	public String matchAccount() throws InterruptedException
	{
		Thread.sleep(5000);
		gmailSBtn.click();
		
		Thread.sleep(4000);
		return gmailmailidTxt.getText();
	}

	
	
	
	

}
