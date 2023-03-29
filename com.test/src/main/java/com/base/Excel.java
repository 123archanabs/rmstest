package com.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Excel {
	
	
	/*String Filepath="C:\\selenium\\com.test\\src\\TestData\\Login.xlsx";
	String Filename="Login";
	String sheetname="Sheet1";
	
    File file =new File(Filepath);
    FileInputStream fis = new FileInputStream(file);
    XSSFWorkbook workbook = new XSSFWorkbook(fis);
    XSSFSheet sheet = workbook.getSheet(sheetname);
    int row = sheet.getLastRowNum();
    System.out.println(row);
    String Data=sheet.getRow(1).getCell(0).getStringCellValue();
    System.out.println(Data);
    
    for (int i = 1; i < row; i++) {
      Row  row1 = sheet.getRow(i);

        for (int j = 0; j < row1.getLastCellNum(); j++) {
        	
            String Data1=sheet.getRow(i).getCell(j).getStringCellValue();
	
            System.out.print(Data1);

        }
        System.out.println();

    }


	}*/
	@Test
		public String getExcelData(String sheetName,int row,int cell) throws EncryptedDocumentException, IOException {
			 FileInputStream fis=new FileInputStream("C:\\selenium\\com.test\\src\\TestData\\NewWork.xlsx");
			 Workbook wb = WorkbookFactory.create(fis);
			 String data = wb.getSheet(sheetName).getRow(row).getCell(cell).getStringCellValue();
			 wb.close();
			 return data;
			 }
		
}
