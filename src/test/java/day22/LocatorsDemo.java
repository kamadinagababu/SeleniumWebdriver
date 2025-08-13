package day22;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo {

	public static void main(String[] args) {
	  ChromeDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  driver.get("https://demo.opencart.com.gr/");
	  
	  //name
	  //driver.findElement(By.name("search")).sendKeys("t-shirt");
	  
	  //id
	 // boolean LogodisplayStatus=driver.findElement(By.id("logo")).isDisplayed();
	 // System.out.println(LogodisplayStatus);
	  
	  //LinkText and PartialLinkText
	  
	 // driver.findElement(By.linkText("Desktops")).click();
	  
	  //PartialLinkText
	  
	  //driver.findElement(By.partialLinkText("Desk")).click();
	  
	  //TagName
	  
	 // find out group of element
	List<WebElement> headerList =driver.findElements(By.tagName("a"));
	System.out.println("size of headerList:"+headerList.size());
	
	//className
	 //List<WebElement> HederLinks=driver.findElements(By.className("dropdown"));
	//System.out.println("size of headerLinks:"+HederLinks.size());
	  
	 
	}

}
