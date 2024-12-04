package week6.day1;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.CellValue;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TwoDimentional {
	
	public static String[][] readExcelData() throws InvalidFormatException, IOException  {
		XSSFWorkbook obj = new XSSFWorkbook("./CreateLead/sample.xlsx");
		//index from 0
		XSSFSheet sheetAt = obj.getSheetAt(0);
		
		int rowValue = sheetAt.getLastRowNum();
		System.out.println("Row count" + rowValue);
		
		
		// to get row value
//		XSSFRow rowValue1 = sheetAt.getRow(1);
	//	System.out.println(rowValue1);
//		
		
		// with header
		int allRow = sheetAt.getPhysicalNumberOfRows();
		System.out.println(allRow);
		
		//colum
		
		int cell = sheetAt.getRow(1).getLastCellNum();
		System.out.println("column count" + cell);
		
		//3rd row 1st cell all value numeric
		String all = sheetAt.getRow(3).getCell(2).getStringCellValue();
		System.out.println(all);
		
		//string
		String all1 = sheetAt.getRow(3).getCell(1).getStringCellValue();
		System.out.println(all1);
		
		System.out.println("<--------------------------------------------->");
		
		String[][] data = new String[rowValue][cell];
		
		for (int i = 1; i < rowValue; i++) {
			
			for (int j = 0; j < cell; j++) {
				
				String full = sheetAt.getRow(i).getCell(j).getStringCellValue();
				System.out.println(full);
				data[0][0] = "TestLeaf";
				data[0][1] = "Gokul";
				data[0][2] = "Sekar";
				data[0][3] = "95";
				
				data[1][0] = "Qeagle";
				data[1][1] = "Saravanan";
				data[1][2] = "L";
				data[1][3] = "75";

	
				data[i-1][j]=full;
			}
		}
		
		obj.close();
		return data;

	}
}
