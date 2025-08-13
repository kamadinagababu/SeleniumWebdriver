package day38;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class handleSSl {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.setAcceptInsecureCerts(true); //accept ssl certificate
		WebDriver driver=new ChromeDriver(options);
	
		driver.get("https://expired.badssl.com/");
		
		System.out.println(driver.getTitle());
	
	}

}
