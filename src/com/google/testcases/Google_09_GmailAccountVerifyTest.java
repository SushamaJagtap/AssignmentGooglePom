package com.google.testcases;

import java.io.IOException;

import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.google.base.TestBase;
import com.google.pages.Google_09_GmailAccountVerifyPage;

public class Google_09_GmailAccountVerifyTest extends TestBase{
	
	Google_09_GmailAccountVerifyPage google_09_GmailAccountVerifyPage;
	
	
	public Google_09_GmailAccountVerifyTest()
	{
		//super();
	}
	
	@BeforeTest
	public void execute() throws IOException
	{
		System.out.println(getTC("Google_09_GmailAccountVerifyTest"));
		boolean j = false;
		if(getTC("Google_09_GmailAccountVerifyTest")==j)
		{
			throw new SkipException("skipped");
		}
	}
	
	@BeforeMethod
	public void setup() throws InterruptedException
	{
		init();
		Thread.sleep(3000);
		google_09_GmailAccountVerifyPage = navigateToGmailAccountVerify();
		Thread.sleep(3000);
	}
	
	@Test
	public void test()
	{
		System.out.println("not a valid site");
	}
	
	@AfterMethod 
	public void quit()
	{
		//driver.quit();
	}
	

}
