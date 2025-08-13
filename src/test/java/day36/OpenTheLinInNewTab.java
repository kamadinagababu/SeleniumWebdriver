package day36;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenTheLinInNewTab {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();

		WebElement RegisterLink=driver.findElement(By.xpath("//a[normalize-space()='Register']"));
		
		Actions act=new Actions(driver);
		
		act.keyDown(Keys.CONTROL).click(RegisterLink).keyUp(Keys.CONTROL).perform();
		Thread.sleep(5000);
		
		
		//switch to window
		
		
		
		List<String>Ids= new ArrayList (driver.getWindowHandles());
		
		
		//rigister page
		driver.switchTo().window(Ids.get(1));
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Honey");
		
		
		//Home page
		driver.switchTo().window(Ids.get(0));
		driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("welcome");
		
		

}
}