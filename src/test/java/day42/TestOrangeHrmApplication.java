package day42;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//open application
//test logo presence
//login 
//close
import org.testng.annotations.Test;



public class TestOrangeHrmApplication {
	
	WebDriver driver;
  @Test(priority=1)
  public void openApp() 
  {
	  driver=new ChromeDriver();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	 driver.manage().window().maximize();
	
  }
  @Test(priority=2)
  public void LogoDisplayed() throws InterruptedException 
  {
	  Thread.sleep(5000);
	 boolean logoStatus=driver.findElement(By.xpath("//img[@alt=\"company-branding\"]")).isDisplayed();
	 System.out.println("logo displayed..."+logoStatus);
  }
  
  @Test(priority=3)
  public void Login() 
  {
	  driver.findElement(By.xpath("//input[@placeholder=\"Username\"]")).sendKeys("Admin");
	  driver.findElement(By.xpath("//input[@placeholder=\"Password\"]")).sendKeys("admin123");
	  driver.findElement(By.xpath("//button[normalize-space()=\"Login\"]")).click();
	 
  }
  
  
  @Test(priority=4)
  public void Close() 
  {
	 driver.quit();
  }
  
  
}
