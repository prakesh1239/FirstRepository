package excelfilereadtesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelread2 {
	
	public static void main(String[] args) throws IOException {
		
		FileInputStream fis=new FileInputStream("src\\test\\resources\\excelfiles\\excelintigation.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheet("rakesh");
		
		int rowcount=sheet.getPhysicalNumberOfRows();
		
		System.out.println(rowcount);
		for(int i=0;i<rowcount;i++) {
			XSSFRow row=sheet.getRow(i);
			if (row != null) { 
			int cellcount=row.getPhysicalNumberOfCells();
			for(int j=0;j<cellcount;j++) {
				XSSFCell cell=row.getCell(j);
				String cellValue = getCellValue(cell);
				
				System.out.println(cellValue);
				 
			}
			System.out.println();
		}
		wb.close();
		fis.close();
		}
	}

	private static String getCellValue(Cell cell) {
		
		switch (cell.getCellType()) {
		case STRING:
			return cell.getStringCellValue();
		case NUMERIC:
			return String.valueOf(cell.getNumericCellValue());
		case BOOLEAN:
			return String.valueOf(cell.getBooleanCellValue());
			
		case BLANK:
			return "";
		default:
			return cell.getStringCellValue();
		}
		
		
	}

}
