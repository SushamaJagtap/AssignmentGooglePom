package com.google.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;


import com.google.config.Xpath;
import com.google.pages.Google_08_ProductWebPage;
import com.google.pages.Google_09_GmailAccountVerifyPage;
import com.google.util.WebEventListener;

public class TestBase {

	public static WebDriver driver;
	public static EventFiringWebDriver eventFiringWebDriver;
	public static WebEventListener webEventListener;
	
	public TestBase()
	{
		
	}
	
	
	public void init()
	{
		try{
			String browser = Xpath.browser;
			if(browser.equalsIgnoreCase("firefox"))
			{
			System.setProperty("webdriver.gecko.driver", "E:\\jars\\SeleniumJAR\\geckodriver.exe");
			driver = new FirefoxDriver();
			}else
			{
			if(browser.equalsIgnoreCase("chrome"))
			{
				System.setProperty("webdriver.chrome.driver","E:\\jars\\SeleniumJAR\\Chrome\\NewChrome\\chromedriver.exe");
				driver = new ChromeDriver();
			}
		}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	
		eventFiringWebDriver = new EventFiringWebDriver(driver);
		webEventListener = new WebEventListener();
		eventFiringWebDriver.register(webEventListener);
		driver = eventFiringWebDriver;
		
		driver.get(Xpath.site);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Xpath.implicitly_wait,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(Xpath.pageload_timeout, TimeUnit.SECONDS);
		
		
		driver.manage().deleteAllCookies();
		
		
		}
	
	public void init1()
	{
		try{
			String browser = Xpath.browser;
			if(browser.equalsIgnoreCase("firefox"))
			{
			System.setProperty("webdriver.gecko.driver", "E:\\jars\\SeleniumJAR\\geckodriver.exe");
			driver = new FirefoxDriver();
			}else
			{
			if(browser.equalsIgnoreCase("ie"))
			{
				System.setProperty("webdriver.ie.driver","E:\\jars\\SeleniumJAR\\Internet Explorer jar\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();
			}
		}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		eventFiringWebDriver = new EventFiringWebDriver(driver);
		webEventListener = new WebEventListener();
		eventFiringWebDriver.register(webEventListener);
		driver = eventFiringWebDriver;
	
	}
	
	public Google_08_ProductWebPage navigateToProductSite()
	{
		driver.navigate().to(Xpath.navigateSite);
		
		return new Google_08_ProductWebPage();
	}
	
	public Google_09_GmailAccountVerifyPage navigateToGmailAccountVerify()
	{
		driver.navigate().to(Xpath.gmailNavigateSite);
		
		return new Google_09_GmailAccountVerifyPage();
	}
	
	
	public void drawBorder(WebElement element,WebDriver driver)
	{
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].style.border='3px solid red'",element);
	}
	
	
	
	public static boolean getTC(String testcase) throws IOException 
	{
		int count1=0;
		boolean j = true;
		File f = new File("E:\\Selenium Java Program\\Assignment_Google_Pom\\src\\com\\google\\config\\Book1.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook book = WorkbookFactory.create(fis);
		Sheet sheet = book.getSheetAt(1);
		for(Row r:sheet)
		{
			count1++;
		}
		for(int i=1;i<count1;i++)
		{
			Row r = sheet.getRow(i);
			Cell c = r.getCell(0);
			String str1 = c.getStringCellValue();
			if(str1.equalsIgnoreCase(testcase))
			{
				Cell c1 = r.getCell(1);
				String str2 = c1.getStringCellValue();
				if(str2.equalsIgnoreCase("Yes"))
				{
					j = true;
				}else
				{
					j = false;
				}
			}
		}
		   return j;
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
