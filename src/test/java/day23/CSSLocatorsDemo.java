package day23;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSLocatorsDemo {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		//driver.manage().window().maximize();
		
		//tag and id ----tag#id
		 
		//driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("t-shirt");
		//driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("t-shirt");
		
		//tag and class-----tag.calssname
		//driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("t-shirt");
		//driver.findElement(By.cssSelector(".search-box-text")).sendKeys("t-shirt");
		
		
		//tag and attribute-----tag[attribute="value"]
		
		//driver.findElement(By.cssSelector("input[name='q']")).sendKeys("t-shirt");
		//driver.findElement(By.cssSelector("[name='q']")).sendKeys("t-shirt");
		
		//tag class and attribute---tag.classname[attribute='value']
		
		//driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("t-shirt");
		//driver.findElement(By.cssSelector(".search-box-text[name='q']")).sendKeys("t-shirt");
		
	}

}
