package day40;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDataFromExcel {

	public static void main(String[] args) throws IOException {
		FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\myfile.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet("dataSheet");
		XSSFRow row1=sheet.createRow(0);
		row1.createCell(0).setCellValue("Java");
		row1.createCell(1).setCellValue("123");
		row1.createCell(2).setCellValue("automation");
		
		XSSFRow row2=sheet.createRow(1);
		row2.createCell(0).setCellValue("Python");
		row2.createCell(1).setCellValue("143");
		row2.createCell(2).setCellValue("Selenium");
		
		XSSFRow row3=sheet.createRow(2);
		row3.createCell(0).setCellValue("Cypress");
		row3.createCell(1).setCellValue("1111");
		row3.createCell(2).setCellValue("TestNg");
		
		XSSFRow row4=sheet.createRow(3);
		row4.createCell(0).setCellValue("C#");
		row4.createCell(1).setCellValue("9880");
		row4.createCell(2).setCellValue("Manuall");
		
		workbook.write(file);
		workbook.close();
		file.close();
		

	}

}
