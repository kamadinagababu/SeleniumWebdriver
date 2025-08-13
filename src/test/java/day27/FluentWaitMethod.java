package day27;

import java.time.Duration;
import java.util.NoSuchElementException; 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import com.google.common.base.Function;
import org.openqa.selenium.support.ui.FluentWait;

public class FluentWaitMethod {

	public static void main(String[] args) {
		 WebDriver driver=new ChromeDriver();
		 
	      //Declaration
		 
	 Wait<WebDriver> Wait =new FluentWait <WebDriver>(driver)
		       .withTimeout(Duration.ofSeconds(30))
		       .pollingEvery(Duration.ofSeconds(5))
		       .ignoring(NoSuchElementException.class);
	
      driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
       driver.manage().window().maximize();
       

    WebElement Username = Wait.until(new Function<WebDriver, WebElement>() {
    public WebElement apply(WebDriver driver) {
      return driver.findElement(By.xpath("//input[@placeholder='Username']"));
    }
  });
    Username.sendKeys("Admin");


//driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");

	}

}
