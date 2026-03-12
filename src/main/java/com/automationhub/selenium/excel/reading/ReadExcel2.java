package com.automationhub.selenium.excel.reading;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel2 {

	public static void main(String args[]) throws IOException {

		// Locate the file

		String fileLocation = "C:\\Users\\priya\\eclipse-workspace\\testing.qa\\src\\test\\resources\\TestData\\CreateLead.xlsx";

		// Locate the workbook & Sheet

		XSSFWorkbook wbook = new XSSFWorkbook(fileLocation);

		XSSFSheet sheet = wbook.getSheetAt(0);

		// to get the last row number and last cell number

		int lastRowNum = sheet.getLastRowNum(); // this will not take the header

		int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();

		System.out.println("No.of Rows: " + lastRowNum);

		System.out.println("Inclusive of header: " + physicalNumberOfRows);

		short lastCellNum = sheet.getRow(0).getLastCellNum();
		

		// There is no direct function to get cell

		System.out.println("No.of cells:" + lastCellNum);

		// Read the data from the cell (Rows & Column)

		for (int i = 1; i <= lastRowNum; i++) {

			XSSFRow row = sheet.getRow(i);

			for (int j = 0; j < lastCellNum; j++) {

				XSSFCell cell = row.getCell(j);

				
				  
				  DataFormatter dft = new DataFormatter();
				  
				  String value = dft.formatCellValue(cell);
				  
				 

				//String value = cell.getStringCellValue();

				System.out.println(value);

			}

			// Close the resource

			wbook.close();

		}
	}
}
