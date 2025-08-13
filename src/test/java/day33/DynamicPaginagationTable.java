package day33;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicPaginagationTable {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demo3x.opencartreports.com/admin/");
		driver.manage().window().maximize();
		
		//Login page
		driver.findElement(By.xpath("//input[@id='input-username']")).sendKeys("demo");
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("demo");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
		driver.findElement(By.xpath("//a[@class='parent collapsed'][normalize-space()='Customers']")).click(); //main menu
		driver.findElement(By.xpath("//ul[@id='collapse5']//a[contains(text(),'Customers')]")).click(); //child
		
		//Showing 1 to 7 of 7 (1 Pages) keep changes number
		String text=driver.findElement(By.xpath("//div[@class='col-sm-6 text-right']")).getText();
		//System.out.println(text); //Showing 1 to 7 of 7 (1 Pages)
		
		//find out no of pages
		//String convert to integer
		int Total_PAges=Integer.parseInt(text.substring(text.indexOf("(")+1,text.indexOf("Pages")-1));
		//System.out.println(Total_PAges);
		
		//repeating pages
		for(int p=1; p<=Total_PAges; p++)

		{
			
			/*if(p<1)
			{
				WebElement active_page=driver.findElement(By.xpath("//ul[@class=''pagination]//*[text()="+p+"]"));
				active_page.click()
			}*/
			//reading the data from the page
			
		int NoOfRows=driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr")).size();
		
		for(int r=1; r<=NoOfRows; r++)
		{
			String CustomerName=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[2]")).getText();
			String Email=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[3]")).getText();
			String Status=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[7]")).getText();
			System.out.println(CustomerName+"\t"+Email+"\t"+Status);
			
			
		}
		
		}
		
	  
	   
	}

	
}
