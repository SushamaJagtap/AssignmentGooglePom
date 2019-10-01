package com.google.util;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import com.google.base.TestBase;

public class TakeScreenshot extends TestBase {

	public String timestamp() 
	{
		return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
	}

	public void takescreenshot() throws IOException, InterruptedException {

		File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		FileHandler.copy(f, new File("F:\\GoogleAssiErrorScreenShots\\"+timestamp()+".jpeg"));

	}

}
