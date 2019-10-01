package com.google.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.google.base.TestBase;
import com.google.config.Xpath;

public class Google_05_HindiPage extends TestBase {
	
	public Google_05_HindiPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath=Xpath.HindiSearch)
	public WebElement HindiSearch;
	
	@FindBy(xpath=Xpath.HindiLuckyDay)
	public WebElement HindiLuckyDay;

	@FindBy(xpath=Xpath.HindiSignInBtn)
	public WebElement HindiSignInBtn;
	
	
	public String getHindiSearchTxt()
	{
		return HindiSearch.getText();
	}
	
	public String getHindiLuckyDayTxt()
	{
		return HindiLuckyDay.getText();
	}
	
	public String getHindiSignInBtnTxt()
	{
		return HindiSignInBtn.getText();
	}
	
	

	
	
	
	

}
