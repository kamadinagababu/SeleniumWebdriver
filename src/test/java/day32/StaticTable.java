package day32;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTable {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//1) find out number of rows in a table
		
		int rows=driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size(); //multiple table
		//int rows=driver.findElements(By.tagName("tr")).size();//single table
		System.out.println("No of Rows:"+rows);
		
		//2) find out number of columns in a table v 
		int columns=driver.findElements(By.xpath("//table[@name='BookTable']//tr//th")).size();  //multiple table
		//int columns=driver.findElements(By.tagName("th")).size(); //single table
		System.out.println("No of columns:"+columns);
		
		//3)read data from specific  row & col
		String AuthorName=driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[2]")).getText();
		System.out.println("Authorname is:"+AuthorName);  //Mukesh
		
	    //4)read the all data from rows and columns
		
		/*System.out.println("BookName"+"\t"+"Author"+"\t"+"Subject"+"\t"+"Price");
		for(int r=2; r<=rows; r++)
		{
			for(int c=1; c<=columns; c++)
			{
			String value=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
			System.out.print(value+"\t");
			}
			System.out.println();
		}*/
		
		//print book names whose author is mukesh 
		
		/*for(int r=2; r<=rows; r++)
		{
			String AuthorNames=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
			//System.out.println(AuthorNames);
			if(AuthorNames.equals("Mukesh"))
			{
				String Booknames=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
				System.out.println(Booknames);
			}
		}*/
		
		//find the total price all the books
		
		int total=0;
		for(int r=2; r<=rows; r++) {
			for(int c=1; c<=columns; c++)
			{
				String price=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText();
				
				//string convert to number
				total=total+Integer.parseInt(price);
				
			}
			
		}
		System.out.println("Total price of books:"+total);
		
		
	}
	

}
