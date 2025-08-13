package day36;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SlideDemo {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		driver.manage().window().maximize();

		
		//minimum slide
	   WebElement Min_Slide=driver.findElement(By.xpath("(//span[@class='ui-slider-handle ui-corner-all ui-state-default'])[1]"));
	  System.out.println("Default Location of the MinSlide :"+Min_Slide.getLocation());//(59, 250)
	  
	  Actions act=new Actions(driver);
	  act.dragAndDropBy(Min_Slide,100,250).perform();
	  System.out.println("Location of the MinSlide after moving :"+Min_Slide.getLocation());//(158, 250)
	  
	  //maximum slide
	  
	  WebElement Max_Slide =driver.findElement(By.xpath("//span[2]"));
	  System.out.println("Location of the MaxSlide :"+Max_Slide.getLocation());//(613, 250)
	  act.dragAndDropBy(Max_Slide, -170, 250).perform();
	  System.out.println("Location of the MaxSlide after moving :"+Max_Slide.getLocation());//(441, 250)
	  
	  
	}

}
