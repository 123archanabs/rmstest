package com.base;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class Excelfile {
	
	public String getExcelData(String sheetName,int row,int cell) throws EncryptedDocumentException, IOException
	{
		 FileInputStream fis=new FileInputStream("C:\\selenium\\com.test\\src\\TestData\\NewWork.xlsx");
		 Workbook wb = WorkbookFactory.create(fis);
		 String data = wb.getSheet(sheetName).getRow(row).getCell(cell).getStringCellValue();
		 wb.close();
		 return data; 
		}
	
	
	public String getExcelData2(String sheetName,int row,int cell) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("C:\\selenium\\com.test\\src\\TestData\\NewWork.xlsx");
		 Workbook wb = WorkbookFactory.create(fis);
		 String data =  wb.getSheet(sheetName).getRow(row).getCell(cell).getStringCellValue();
		wb.close();
		return data;

	

		}

}

