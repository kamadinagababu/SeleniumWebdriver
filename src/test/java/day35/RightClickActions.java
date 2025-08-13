package day35;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickActions {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://vinothqaacademy.com/mouse-event/");
		driver.manage().window().maximize();

		WebElement rightClickAction=driver.findElement(By.xpath("//button[@id='rightclick']"));
		Actions act=new Actions(driver);
		act.contextClick(rightClickAction).perform();
		Thread.sleep(5000);
		
		//click Alert Popup
		
		driver.findElement(By.xpath("//a[normalize-space()='Alert Popup']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Alert Box']")).click();
		driver.switchTo().alert().accept();
	}

}
