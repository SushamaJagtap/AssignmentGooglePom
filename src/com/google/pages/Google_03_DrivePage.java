package com.google.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.google.base.TestBase;
import com.google.config.Xpath;

public class Google_03_DrivePage extends TestBase{
	
	
	public Google_03_DrivePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	@FindBy(xpath=Xpath.googledrivetext)
	public WebElement googledrivetext;
	
	@FindBy(xpath=Xpath.meetDrive)
	public WebElement meetDrive;
	
	
	@FindBy(xpath=Xpath.usingDrive)
	public WebElement usingDrive;
	
	@FindBy(xpath=Xpath.driveicon)
	public WebElement driveicon;
	
	@FindBy(xpath=Xpath.gotoDrive)
	public WebElement gotoDrive;
	
	@FindBy(xpath=Xpath.DriveSignInBtn)
	public WebElement DriveSignInBtn;
	
	
	public String getTitle()
	{
		return driver.getTitle();
	}
	
	public boolean checkGoogleDriveText()
	{
		return googledrivetext.isDisplayed();
	}
	
	public boolean checkMeetDrive()
	{
		return meetDrive.isDisplayed();
	}
	
	public boolean checkUsingDrive()
	{
		return usingDrive.isDisplayed();
	}

	public boolean checkDriveIcon()
	{
		return driveicon.isDisplayed();
	}
	
	public boolean checkGotoDrive()
	{
		return gotoDrive.isDisplayed();
	}
	
	public Google_04_DriveSignInPage clickOnDriveSignInBtn()
	{
		DriveSignInBtn.click();
		
		return new Google_04_DriveSignInPage();
	}
	
}
