package day27;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicityWait {

	public static void main(String[] args) {
		
		
		 WebDriver driver=new ChromeDriver();
		 //declaration
		 WebDriverWait myWait=new WebDriverWait(driver,Duration.ofSeconds(10));
				
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
	WebElement TextUsername=myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));
	TextUsername.sendKeys("Admin");
	
	WebElement TextPassword=myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Password']")));
	TextPassword.sendKeys("Admin");
	
	WebElement LoginBtn=myWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Login']")));
	LoginBtn.click();
	
	
	//driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");

	}

}
