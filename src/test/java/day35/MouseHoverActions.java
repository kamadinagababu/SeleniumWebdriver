package day35;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverActions {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://vinothqaacademy.com/mouse-event/");
		driver.manage().window().maximize();
		
		WebElement Self_Video_Course=driver.findElement(By.xpath("//div[@class='collapse navbar-collapse pull-right']//a[contains(text(),'Self Paced Video Course')]"));
		WebElement Cypress_course_Circulam=driver.findElement(By.xpath("//div[@class='collapse navbar-collapse pull-right']//a[normalize-space()='Cypress Course Curriculum']"));
		//moseHover actions
		
		Actions act=new Actions(driver);
		act.moveToElement(Self_Video_Course).moveToElement(Cypress_course_Circulam).click().build().perform();
		//act.moveToElement(Self_Video_Course).moveToElement(Cypress_course_Circulam).click().perform();
	}

}
