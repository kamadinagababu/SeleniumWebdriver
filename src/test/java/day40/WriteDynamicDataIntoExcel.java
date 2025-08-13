package day40;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDynamicDataIntoExcel {

	public static void main(String[] args) throws IOException {
		FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\myfile_dynamic.xlsx");
       XSSFWorkbook workbook=new XSSFWorkbook();
       XSSFSheet sheet=workbook.createSheet("DaynamicData");
       
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter how many rows?");
    int  NoOfRows=sc.nextInt();
    System.out.println("Enter how many Cells");
    int NoOfCells=sc.nextInt();
    
    
    for(int r=0; r<=NoOfRows; r++)
    {
    	
    	XSSFRow currentRow=sheet.createRow(r);
    	for(int c=0; c<NoOfCells; c++)
    	{
    		XSSFCell cell=currentRow.createCell(c);
    		
    	cell.setCellValue(sc.next());
    	}
    }
    
    workbook.write(file);
    workbook.close();
    file.close();
    System.out.println("File created......");
    
	}
	

}
