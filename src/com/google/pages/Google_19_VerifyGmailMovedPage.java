package com.google.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.google.base.TestBase;
import com.google.config.Xpath;

public class Google_19_VerifyGmailMovedPage  extends TestBase{
	
	public Google_19_VerifyGmailMovedPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath=Xpath.checkBox)
	public WebElement checkBox;
	
	public void clickOnCheckBox()
	{
		checkBox.click();
	}
	
	
	@FindBy(xpath=Xpath.moveToImg)
	public WebElement moveToImg;
	
	public void clickOnMoveToImg()
	{
		moveToImg.click();
	}
	
	@FindBy(xpath=Xpath.selectlabel)
	public WebElement selectlabel;
	
	public void clickOnSelectlabel()
	{
		selectlabel.click();
	}
	
	@FindBy(xpath=Xpath.labeltext)
	public WebElement labeltext;
	
	public boolean checkLabelText()
	{
		return labeltext.isDisplayed();
	}
	
	

}
