package com.automationhub.selenium.excel.reading;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel3 {

	public static String[][] getExcelData() throws IOException {

		String fileLocation = "C:\\Users\\priya\\eclipse-workspace\\testing.qa\\src\\test\\resources\\TestData\\CreateLead.xlsx";
		
		XSSFWorkbook wbook = new XSSFWorkbook(fileLocation);
		
		XSSFSheet sheet = wbook.getSheetAt(0);
		
		int lastRowNum = sheet.getLastRowNum();
		
		System.out.println("No.of Rows: "+ lastRowNum);
		
		short lastCellNum = sheet.getRow(0).getLastCellNum();
		
		System.out.println("No.of cells:"+lastCellNum);
		
		String[][] data = new String[lastRowNum][lastCellNum];
		
		for (int i = 1; i <=lastRowNum; i++) {	
			
			XSSFRow row = sheet.getRow(i);
			
			for (int j = 0; j < lastCellNum; j++) {
				
				XSSFCell cell = row.getCell(j);
				
				DataFormatter dft = new DataFormatter();
				
				String value = dft.formatCellValue(cell);
				
				data[i-1][j] = value;
				
			} 
		}
		
			wbook.close();
		
		
		return data;











	}

}
