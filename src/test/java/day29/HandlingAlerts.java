package day29;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlerts {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =new ChromeDriver();
		
	driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	driver.manage().window().maximize();
	
	//1) normal alert with OK button
	/*
	driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
	Thread.sleep(5000);
	
	//driver.switchTo().alert().accept();
	Alert myAlert=driver.switchTo().alert();
	System.out.println(myAlert.getText());
	myAlert.accept();
	*/
	
	//2)Confirm Alert with OK&Cancel button
	
	//driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
	//driver.switchTo().alert().accept(); // close alert using ok button
	//driver.switchTo().alert().dismiss(); //close alert using cancel button
	
	
	//3) prompt alert -input box
	
    driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
   Alert  MyPromtAlert=driver.switchTo().alert();
   MyPromtAlert.sendKeys("welcome");
   //MyPromtAlert.accept();
   MyPromtAlert.dismiss();	
   }
	

	

}
