package com.google.util;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Hashtable;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.google.base.TestBase;

public class ExcelReaderData extends TestBase {

	Workbook book;
	Sheet sheet;
	String sheetname = null;
	int count1 = 0;
	int count2 = 0;

	public ExcelReaderData(String filePath, String sheetName) throws EncryptedDocumentException, IOException {
		sheetname = sheetName;
		FileInputStream fis = new FileInputStream(filePath);
		book = WorkbookFactory.create(fis);
		sheet = book.getSheet(sheetName);
	}

	public int getRowNum() {
		sheet = book.getSheet(sheetname);
		for (Row r : sheet) {
			count1++;
		}
		return count1;
	}

	public int getCellNum() {
		sheet = book.getSheet(sheetname);
		for (Row r : sheet) {
			for (org.apache.poi.ss.usermodel.Cell c : r) {
				count2++;
			}
			break;
		}
		return count2;
	}

	public Object getCellData(int i, int j) {
		
		sheet = book.getSheet(sheetname);

		String str = null;

		Row r = sheet.getRow(i);

		Cell c = r.getCell(j);

		org.apache.poi.ss.usermodel.CellType type = c.getCellTypeEnum();
		
		if (type == org.apache.poi.ss.usermodel.CellType.STRING) {
			str = c.getStringCellValue();
		} else {
			if (type == org.apache.poi.ss.usermodel.CellType.NUMERIC) {
				long l = (long) c.getNumericCellValue();
				str = String.valueOf(l);
			}
		}

		Object obj;
		obj = str;

		return obj;
	}

	{

	}

}
