package maventestpractice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

	public static void main(String[] args) throws IOException {
	File File = new File("D:\\excel\\");
	
	FileInputStream fis=new FileInputStream(File);
	XSSFWorkbook workbook=new XSSFWorkbook(fis);
	XSSFSheet sheet=workbook.getSheetAt(0);
	
/*	String cellvalue=sheet.getRow(0).getCell(0).getStringCellValue();
	String cellvalue1=sheet.getRow(0).getCell(1).getStringCellValue();
    System.out.println(cellvalue);
	System.out.println(cellvalue1);*/
	
	int rowcount=sheet.getPhysicalNumberOfRows();
	for(int i=0; i<rowcount; i++) {
		XSSFRow row=sheet.getRow(i);
		
		int cellcount=row.getPhysicalNumberOfCells();
		for(int j=0; j<cellcount; j++) {
			XSSFCell cell=row.getCell(j);
			
			String cellvalue=	getcellvalue(cell);
			System.out.print("||"+cellvalue);
			}
	System.out.println();
	}

	workbook.close();
	fis.close();
	}

	public static String getcellvalue(XSSFCell cell) {
		switch(cell.getCellType()){
		case NUMERIC:
		return String.valueOf(cell.getNumericCellValue());
		
		case BOOLEAN:
			return String.valueOf(cell.getBooleanCellValue());
			
		case STRING:
			return cell.getStringCellValue();
			
			default:
				return cell.getStringCellValue();
				
				
				}
	}
	
	
	
	
}

	
	
