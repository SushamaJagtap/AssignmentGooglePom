package com.google.util;

import java.io.IOException;
import java.util.Hashtable;

import org.apache.poi.EncryptedDocumentException;

public class TestUtil {
	
	
	public Object[][] getData(String sheetName) throws EncryptedDocumentException, IOException
	{
		ExcelReaderData excelReaderData = new  ExcelReaderData("E:\\Selenium Java Program\\Assignment_Google_Pom\\src\\com\\google\\config\\Book1.xlsx",sheetName);
		int row = excelReaderData.getRowNum();
		int cell = excelReaderData .getCellNum();
		
		Hashtable<Object, Object> table = new Hashtable<Object,Object>();		
	
		Object[][] data = new Object[row-1][cell];
		
		for(int i=0;i<row-1;i++)
		{
			for(int j=0;j<cell;j++)
			{
				table.put(excelReaderData.getCellData(0, j),excelReaderData.getCellData(i+1, j));
				data[i][0] = table;
			}
		}
		return data;
	}
	

}
