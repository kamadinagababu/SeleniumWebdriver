package day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDrodown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		//Login steps
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.tagName("button")).click();
	
		
		//click on PIM option
		driver.findElement(By.linkText("PIM")).click();
		
		driver.findElement(By.xpath("//div[6]//div[1]//div[2]//div[1]//div[1]//div[2]//i[1]")).click();
		
		//selection single option
		
		//driver.findElement(By.xpath("//span[normalize-space()='Financial Analyst']")).click();
		
		//print the all options
     List<WebElement >options=driver.findElements(By.xpath("//div[@role='listbox']//span"));
   
     System.out.println(options.size());
     
     for(WebElement op:options)
     {
    	 System.out.println(op.getText());
     }
		
}

}
