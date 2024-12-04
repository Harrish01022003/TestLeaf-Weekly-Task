package week6.day1;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellValue;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Integration {
	
	public static Object[][] readExcel() throws IOException {
		XSSFWorkbook obj = new XSSFWorkbook("./data/sample.xlsx");
		//index from 0
		XSSFSheet sheetAt = obj.getSheetAt(0);
		
		int rowValue = sheetAt.getLastRowNum();
		System.out.println(rowValue);
		
		
//		XSSFRow rowValue1 = sheetAt.getRow(1);
//		System.out.println(rowValue1);
//		
		
		// with header
		int allRow = sheetAt.getPhysicalNumberOfRows();
		System.out.println(allRow);
		
		//colum
		
		int cell = sheetAt.getRow(1).getLastCellNum();
		System.out.println(cell);
		
		//3rd row 1st cell all value numeric
		double all = sheetAt.getRow(3).getCell(2).getNumericCellValue();
		System.out.println(all);
		
		//string
		String all1 = sheetAt.getRow(3).getCell(1).getStringCellValue();
		System.out.println(all1);
		
		String[][] data = new String[rowValue][cell];
		
		for (int i = 1; i < rowValue; i++) {
			for (int j = 0; j < cell; j++) {
				String value = sheetAt.getRow(i).getCell(j).getStringCellValue();
				System.out.println(value);

				data[i-1][j]=value;
				
			}
			
		}
		obj.close();
		return data;
		
		
		
		
	}
	
	

}
