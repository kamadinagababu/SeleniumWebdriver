package day40;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//File----->Workbook---->Sheet----->Row--->Cell
public class ReadingDataFromExcel
{

	public static void main(String[] args) throws IOException
	{
		
	FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\testdata\\sampleData.xlsx");
	
	XSSFWorkbook workbook=new XSSFWorkbook(file);
	
	XSSFSheet sheet=workbook.getSheet("Sheet1");
	
	int TotalRows=sheet.getLastRowNum();
	int TotalCells=sheet.getRow(0).getLastCellNum();
	//System.out.println("number of rows:"+TotalRows);//6
	//System.out.println("number of Cells:"+TotalCells);//4
	
	for(int r=0; r<=TotalRows; r++)
	{
		XSSFRow currentRow=sheet.getRow(r);
	
		for(int c=0; c<TotalCells; c++)
		{
			XSSFCell cell=currentRow.getCell(c);
			System.out.print(cell.toString()+"\t");
			
		}
		System.out.println();
	}
	workbook.close();
	file.close();
	
	

	}

}
