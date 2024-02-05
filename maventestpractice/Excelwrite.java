package maventestpractice;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelwrite {

	public static void main(String[] args) throws IOException {
File file	=	new File("D:\\excell for practice\\write excel.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet();
		sheet.createRow(0);
		sheet.createRow(1);// how many times we can give like this 
		sheet.getRow(0).createCell(0);
		sheet.getRow(0).createCell(0).setCellValue("rakesh");
		sheet.getRow(0).createCell(1);
		sheet.getRow(0).createCell(1).setCellValue("rajesh");
		sheet.getRow(0).createCell(2);
		sheet.getRow(0).createCell(2).setCellValue("rasi");
		sheet.getRow(1).createCell(2);
		sheet.getRow(1).createCell(2).setCellValue("happy");
		FileOutputStream fos = new FileOutputStream("D:\\excell for practice\\write excel.xlsx");

		workbook.write(fos);
		workbook.close();

	}
}
