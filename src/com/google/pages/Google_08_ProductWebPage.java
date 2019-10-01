package com.google.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.google.base.TestBase;
import com.google.config.Xpath;

public class Google_08_ProductWebPage extends TestBase {
	
	public Google_08_ProductWebPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath=Xpath.WebSearch)
	public WebElement webSearch;
	
	public boolean checkwebSearch()
	{
		return webSearch.isDisplayed();
	}
	
	
	
	@FindBy(xpath=Xpath.googleChrome)
	public WebElement googleChrome;
	
	public boolean checkgoogleChrome()
	{
		return googleChrome.isDisplayed();
	}
	
	
	@FindBy(xpath=Xpath.toolBar)
	public WebElement toolBar;
	
	public boolean checktoolBar()
	{
		return toolBar.isDisplayed();
	}
	
	
	
	@FindBy(xpath=Xpath.bookMarks)
	public WebElement bookMarks;
	
	
	public boolean checkBookMarks()
	{
		return bookMarks.isDisplayed();
	}
	
	
	@FindBy(xpath=Xpath.mobile)
	public WebElement mobile;
	
	public boolean checkmobile()
	{
		return mobile.isDisplayed();
	}
	
	
	@FindBy(xpath=Xpath.mapsforMobile)
	public WebElement mapsforMobile;
	
	public boolean checkmapsforMobile()
	{
		return mapsforMobile.isDisplayed();
	}
	
	
	@FindBy(xpath=Xpath.searchForMobiles)
	public WebElement searchForMobiles;
	
	public boolean checksearchForMobiles()
	{
		return searchForMobiles.isDisplayed();
	}
	
	
	
	@FindBy(xpath=Xpath.adWords)
	public WebElement adWords;
	
	public boolean checkadWords()
	{
		return adWords.isDisplayed();
	}
	
	
	@FindBy(xpath=Xpath.googleAppsForWork)
	public WebElement googleAppsForWork;
	
	public boolean checkgoogleAppsForWork()
	{
		return googleAppsForWork.isDisplayed();
	}
	
	
	@FindBy(xpath=Xpath.googleMyBussiness)
	public WebElement googleMyBussiness;
	
	public boolean checkgoogleMyBussiness()
	{
		return googleMyBussiness.isDisplayed();
	}
	
	@FindBy(xpath=Xpath.adSense)
	public WebElement adSense;
	
	public boolean checkadSense()
	{
		return adSense.isDisplayed();
	}
	
	@FindBy(xpath=Xpath.adMob)
	public WebElement adMob;
	
	public boolean checkadMob()
	{
		return adMob.isDisplayed();
	}
	
	@FindBy(xpath=Xpath.youTube)
	public WebElement youTube;
	
	public boolean checkyouTube()
	{
		return youTube.isDisplayed();
	}
	
	@FindBy(xpath=Xpath.Books)
	public WebElement Books;
	
	public boolean checkBooks()
	{
		return Books.isDisplayed();
	}
	
	
	@FindBy(xpath=Xpath.ImageSearch)
	public WebElement ImageSearch;
	
	public boolean checkImageSearch()
	{
		return ImageSearch.isDisplayed();
	}
	
	@FindBy(xpath=Xpath.News)
	public WebElement News;
	
	public boolean checkNews()
	{
		return News.isDisplayed();
	}
	
	@FindBy(xpath=Xpath.videoSearch)
	public WebElement videoSearch;
	
	public boolean checkvideoSearch()
	{
		return videoSearch.isDisplayed();
	}
	
	@FindBy(xpath=Xpath.picasa)
	public WebElement picasa;
	
	public boolean checkpicasa()
	{
		return picasa.isDisplayed();
	}
	
	
	@FindBy(xpath=Xpath.maps)
	public WebElement maps;
	
	public boolean checkmaps()
	{
		return maps.isDisplayed();
	}
	
	
	@FindBy(xpath=Xpath.earth)
	public WebElement earth;
	
	public boolean checkearth()
	{
		return earth.isDisplayed();
	}
	
	
	@FindBy(xpath=Xpath.panorania)
	public WebElement panorania;
	
	public boolean checkpanorania()
	{
		return panorania.isDisplayed();
	}

	@FindBy(xpath=Xpath.customeSearch)
	public WebElement customeSearch;
	
	public boolean checkcustomeSearch()
	{
		return customeSearch.isDisplayed();
	}
	
	
	@FindBy(xpath=Xpath.scholar)
	public WebElement scholar;
	
	public boolean checkscholar()
	{
		return scholar.isDisplayed();
	}
	
	@FindBy(xpath=Xpath.trends)
	public WebElement trends;
	
	public boolean checktrends()
	{
		return trends.isDisplayed();
	}
	
	@FindBy(xpath=Xpath.gmail)
	public WebElement gmail;
	
	public boolean checkgmail()
	{
		return gmail.isDisplayed();
	}
	
	@FindBy(xpath=Xpath.drive)
	public WebElement drive;
	
	public boolean checkdrive()
	{
		return drive.isDisplayed();
	}
	
	@FindBy(xpath=Xpath.docs)
	public WebElement docs;
	
	public boolean checkdocs()
	{
		return docs.isDisplayed();
	}
	
	@FindBy(xpath=Xpath.sheets)
	public WebElement sheets;
	
	public boolean checksheets()
	{
		return sheets.isDisplayed();
	}
	
	
	@FindBy(xpath=Xpath.slides)
	public WebElement slides;
	
	public boolean checkslides()
	{
		return slides.isDisplayed();
	}
	
	
	@FindBy(xpath=Xpath.forms)
	public WebElement forms;
	
	public boolean checkforms()
	{
		return forms.isDisplayed();
	}
	
	
	@FindBy(xpath=Xpath.drawings)
	public WebElement drawings;
	
	public boolean checkdrawings()
	{
		return drawings.isDisplayed();
	}
	
	
	@FindBy(xpath=Xpath.sales)
	public WebElement sales;
	
	public boolean checksales()
	{
		return sales.isDisplayed();
	}
	
	
	@FindBy(xpath=Xpath.Calender)
	public WebElement Calender;
	
	public boolean checkCalender()
	{
		return Calender.isDisplayed();
	}
	
	
	@FindBy(xpath=Xpath.Translate)
	public WebElement Translate;
	
	public boolean checkTranslate()
	{
		return Translate.isDisplayed();
	}
	
	
	@FindBy(xpath=Xpath.googlecloudprint)
	public WebElement googlecloudprint;
	
	public boolean checkgooglecloudprint()
	{
		return googlecloudprint.isDisplayed();
	}
	
	
	@FindBy(xpath=Xpath.googlekeeps)
	public WebElement googlekeeps;
	
	public boolean checkgooglekeeps()
	{
		return googlekeeps.isDisplayed();
	}
	
	
	@FindBy(xpath=Xpath.googlestore)
	public WebElement googlestore;
	
	public boolean checkgooglestore()
	{
		return googlestore.isDisplayed();
	}
	
	
	
	@FindBy(xpath=Xpath.Googleplus)
	public WebElement Googleplus;
	
	public boolean checkGoogleplus()
	{
		return Googleplus.isDisplayed();
	}
	
	@FindBy(xpath=Xpath.blogger)
	public WebElement blogger;
	
	public boolean checkblogger()
	{
		return blogger.isDisplayed();
	}
	
	
	@FindBy(xpath=Xpath.groups)
	public WebElement groups;
	
	public boolean checkgroups()
	{
		return groups.isDisplayed();
	}
	
	
	@FindBy(xpath=Xpath.hangouts)
	public WebElement hangouts;
	
	public boolean checkhangouts()
	{
		return hangouts.isDisplayed();
	}
	
	@FindBy(xpath=Xpath.code)
	public WebElement code;
	
	public boolean checkcode()
	{
		return code.isDisplayed();
	}
	
	
	
	
	
}
