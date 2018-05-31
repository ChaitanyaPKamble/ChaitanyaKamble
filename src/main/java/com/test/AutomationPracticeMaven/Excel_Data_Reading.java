package com.test.AutomationPracticeMaven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFAnchor;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Data_Reading {

	public static void main(String[] args) throws IOException {
		
		Excelreading();

	}
	
	public static void Excelreading() throws IOException{
		File f = new File("Resource/ExcelData.xlsx");
		FileInputStream fis = new FileInputStream(f);
		XSSFWorkbook X = new XSSFWorkbook(fis);
		XSSFSheet s = X.getSheet("Sheet1");
		XSSFCell c = s.getRow(1).getCell(1);
		String XYZ = c.getStringCellValue();
		System.out.println(XYZ);
		
	}

}
