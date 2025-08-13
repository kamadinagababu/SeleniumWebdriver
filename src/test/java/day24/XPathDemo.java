package day24;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class XPathDemo {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//Xpath with single attribute
	//driver.findElement(By.xpath("//input[@placeholder='Search store']")).sendKeys("t-shirt");
		
		//Xpath with multiple attributes
		
		//driver.findElement(By.xpath("//input[@name='q'][@placeholder='Search store']")).sendKeys("t-shirt");
		
		//Xpath with and or operators
		
		//driver.findElement(By.xpath("//input[@name='q'and @placeholder='Search store']")).sendKeys("t-shirt");
		
		//driver.findElement(By.xpath("//input[@name='q' or @placeholder='Sea']")).sendKeys("t-shirt");
		
		//Xpath with innertext
		//driver.findElement(By.xpath("//*[text()=' Electronics ']")).click();
		
		//boolean disPlayStatus=driver.findElement(By.xpath("//h2[text()='Welcome to our store']")).isDisplayed();
		//System.out.println(disPlayStatus);
		//String value=driver.findElement(By.xpath("//h2[text()='Welcome to our store']")).getText();
		//System.out.println(value);
		
		//Xpath with contains
		
		//driver.findElement(By.xpath("//input[contains(@placeholder,'Sea')]")).sendKeys("cloths");
		 
		//Xpath with starts-with
		
		//driver.findElement(By.xpath("//input[starts-with(@placeholder,'Sea')]")).sendKeys("cloths");
	}

}
