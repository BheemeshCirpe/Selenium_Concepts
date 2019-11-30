package com.selenium.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class File_Reading {

@DataProvider(name= "codes_data")
	
	public Object[][] excel() throws IOException
	{
	

		File file = new File(System.getProperty("user.dir")+"Test data\\order_codes.xlsx");
		  String[][] a = new String[4][1];
		FileInputStream inputStream = new FileInputStream(file);
	
		XSSFWorkbook book1 = new XSSFWorkbook(inputStream);
		XSSFSheet sheet1 = book1.getSheet("Sheet1");
		
		
		
		for (int i = 0; i < 4; i++) {  

			XSSFRow row = sheet1.getRow(i + 1);  //Start from Row 2

			for (int j = 0; j <=1; j++)  

				a[i][j] = row.getCell(j).getStringCellValue();

		}

		return a;
	}
	
	
	
}
