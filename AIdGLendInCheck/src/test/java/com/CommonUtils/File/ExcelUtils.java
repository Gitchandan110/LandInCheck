package com.CommonUtils.File;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	static File Path = new File("C:\\Users\\Chandan\\Git\\LandInCheck\\AIdGLendInCheck\\Test Data\\InputData.xlsx");
		
	public static String ReadExcel(String sheetName, int rownum, int cellnum) throws IOException {

		FileInputStream fis = new FileInputStream(Path);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet(sheetName);
		Row row = sheet.getRow(rownum);
		Cell cell = row.getCell(cellnum);
		//System.out.println("Row data:" + sheet.getRow(rownum).getCell(cellnum));
		fis.close();
		return sheet.getRow(rownum).getCell(cellnum).toString();

	}

}