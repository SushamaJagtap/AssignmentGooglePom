package com.google.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.google.base.TestBase;
import com.google.config.Xpath;

public class Google_11_VerifyStarMailPage extends TestBase{
	
	public Google_11_VerifyStarMailPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath=Xpath.starred)
	public WebElement starred;
	
	
	@FindBy(xpath=Xpath.starredNo)
	public WebElement starredNo;
	
	
	

	public void clickOnStarred()
	{
		/*List<WebElement> list =	driver.findElements(By.xpath("//span[@title='Starred']"));
		return list.size();*/
		
		starred.click();
	}	
	
	
	public String getstarredNo()
	{
		/*List<WebElement> list =	driver.findElements(By.xpath("//span[@title='Starred']"));
		return list.size();*/
		
		return starredNo.getText();
	}	
	
	
	

}
