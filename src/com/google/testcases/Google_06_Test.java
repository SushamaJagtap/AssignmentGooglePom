package com.google.testcases;

import java.io.IOException;

import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.google.base.TestBase;

public class Google_06_Test extends TestBase {

	public Google_06_Test()
	{
		//super();
	}
	
	
	@BeforeTest
	public void execute() throws IOException
	{
		System.out.println(getTC("Google_06_Test"));
		boolean j = false;
		if(getTC("Google_06_Test")==j)
		{
			throw new SkipException("skipped");
		}
	}
	
	
	@BeforeMethod
	public void setup()
	{
		init1();
	}
	
	@Test
	public void quit()
	{
		driver.close();
	}
	
	
	
}
