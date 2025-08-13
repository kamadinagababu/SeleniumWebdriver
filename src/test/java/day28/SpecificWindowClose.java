package day28;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpecificWindowClose {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		
		Set<String> WindowIds=driver.getWindowHandles();
		for(String widowId:WindowIds)
		{
			String Title=driver.switchTo().window(widowId).getTitle();
		   if(Title.equals("Human Resources Management Software | OrangeHRM HR Software"))
		   {
			   driver.close();
		   }
		}

	}

}
