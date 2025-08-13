package day38;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessTesting {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--headless=new");
		
		WebDriver driver=new ChromeDriver(options);
		
		driver.get("https://www.opencart.com/index.php?route=cms/demo");
		
		
		String Actual_Title=driver.getTitle();
		String expected_Title="OpenCart - Demo";
		
	if(Actual_Title.equals(expected_Title))
	{
		System.out.println("test passed");
	}
	else {
	    System.out.println("test failed");
	  
	}
	driver.quit();
	}

}
