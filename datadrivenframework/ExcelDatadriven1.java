package datadrivenframework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ExcelDatadriven1 {
     
	@DataProvider
	public String[][] getdat() throws Exception  {
		File file=new File("\\javaseason\\maventest\\src\\test\\resources\\excelfiles\\excelintigation.xlsx");
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheet("rakesh");
		int rows=sheet.getPhysicalNumberOfRows();
		int columns=sheet.getRow(0).getLastCellNum();
	
	String[][] data=new String[rows-1][columns];
		for(int i=0;i<rows-1;i++) {
		    for(int j=0; j<columns; j++) {
				
		    	DataFormatter df=new DataFormatter();
		    	data[i][j]=df.formatCellValue(sheet.getRow(i+1).getCell(j));
				
			}
		    for(String[] dataarray:data) {
		    System.out.println(Arrays.toString(dataarray));
		}
		
	
		   
	}
		return data;

	
	}
}


	       
		

	


