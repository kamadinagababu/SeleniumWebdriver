package day35;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickActions {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://vinothqaacademy.com/mouse-event/");
		driver.manage().window().maximize();
		//double click action

		WebElement DoubleClick=driver.findElement(By.xpath("//button[@id='dblclick']"));
		Actions act=new Actions(driver);
		
		act.doubleClick(DoubleClick).perform();
		

	}

}
