package day35;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragonDropAction {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demo.automationtesting.in/Static.html");
		driver.manage().window().maximize();

		Actions act=new Actions(driver);
		WebElement angular=driver.findElement(By.xpath("//img[@id='angular']"));
		WebElement DropArea=driver.findElement(By.xpath("//div[@id='droparea']"));
		WebElement mongo=driver.findElement(By.xpath("//img[@id='mongo']"));
		WebElement node=driver.findElement(By.xpath("//img[@id='node']"));
		
	act.dragAndDrop(angular, DropArea).perform();
	act.dragAndDrop(mongo, DropArea).perform();
	act.dragAndDrop(node, DropArea).perform();
	}
}
