package ExcelReader;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReaderDemo {

	/*
	 * Apache POI
	 * poi
	 * poi--ooxml
	 * both should be of same version
	 * 
	 * Steps:
	 * 1. Get the path of the excel file
	 * 2. Access the Workbook/excel
	 * 3. Get the sheet from where data needs to be read
	 * 4. Identify the no of rows
	 * 5. Identify the no of cols
	 * 6. Iterate through rows and cols and read cell data
	 * 
	 * 
	 */
	
	public static void main(String[] args) throws IOException {
		String filePath = "./src/main/java/ExcelReader/TestData.xlsx";
		XSSFWorkbook wb = new XSSFWorkbook(filePath);
		XSSFSheet sheet = wb.getSheet("userdata");
		
//		System.out.println(sheet.getRow(0).getCell(0).getStringCellValue());
//		System.out.println(sheet.getRow(0).getCell(1).getStringCellValue());
//		System.out.println(sheet.getRow(1).getCell(0).getStringCellValue());
//		System.out.println(sheet.getRow(1).getCell(1).getStringCellValue());
//		System.out.println(sheet.getRow(2).getCell(0).getStringCellValue());
//		System.out.println(sheet.getRow(2).getCell(1).getStringCellValue());
		
		int rowCount = sheet.getPhysicalNumberOfRows();
		int colCount = sheet.getRow(0).getLastCellNum();
		
		System.out.println("Row Count ==>> "+rowCount);
		System.out.println("Col Count ==>> "+colCount);
		
		//apply a for loop and print the individual cell value
		for (int row = 0; row < rowCount; row++) {
			for (int col = 0; col < colCount; col++) {
				System.out.println(sheet.getRow(row).getCell(col).getStringCellValue());
			}
		}
		
		
	}
}
