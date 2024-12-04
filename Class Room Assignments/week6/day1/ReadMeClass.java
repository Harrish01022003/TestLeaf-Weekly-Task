package week6.day1;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCell.*;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadMeClass {
	
	public static void main(String[] args) throws IOException {
		
		XSSFWorkbook obj = new XSSFWorkbook("./data/readme.xlsx");
		XSSFSheet sheetByIndex = obj.getSheetAt(0);      /// sheet one
		XSSFSheet sheetByName = obj.getSheet("Sheet1");      /// sheet one by name 

		System.out.println(sheetByIndex.getLastRowNum());
		System.out.println(sheetByName.getLastRowNum());
		System.out.println(sheetByIndex.getFirstRowNum());
		
		//get the row
		XSSFRow firstRow = sheetByIndex.getRow(0);
		// just getting the value of the row
		//System.out.println(firstRow);
		
		//get cell count
		
		XSSFCell cell = firstRow.getCell(0);
		System.out.println(cell);
		
		
		
		
		
		
		
		
		



	
	
	}
}
