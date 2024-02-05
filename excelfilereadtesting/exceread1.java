package excelfilereadtesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class exceread1 {

	public static void main(String[] args) throws IOException {

		FileInputStream fis =new FileInputStream("D:\\excel\\excelread.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		
		XSSFRow row=null;
		XSSFCell cell=null;
	for(int i=0; i<sheet.getLastRowNum(); i++) {
		row =sheet.getRow(i);
		
		for(int j=0; j<row.getLastCellNum();j++) {
			
			cell = row.getCell(j);
			
			if(cell.getCellType()==CellType.NUMERIC)
			{
				System.out.println(cell.getNumericCellValue());
			}
			else if(cell.getCellType()==CellType.STRING)
			{
				System.out.println(cell.getStringCellValue());
			}
	
			}
		
	}
		
}
}
