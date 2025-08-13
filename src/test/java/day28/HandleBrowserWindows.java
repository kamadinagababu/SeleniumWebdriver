package day28;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowserWindows {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		
		Set<String> WindowIds=driver.getWindowHandles();
		
		//Approch1 2 windows
		/*
		List<String> winddowList=new ArrayList(WindowIds);
	     //System.out.println(winddowList);//[9D4E77DE08D1CB4A6CF85E967E9B660C, D7C360437A2C491D64D9CC090B2BCEFD]
	     String parentId=winddowList.get(0);
	     String ChildId=winddowList.get(1);
	     
	     //Switch to child window
	     driver.switchTo().window(ChildId);
	     System.out.println(driver.getTitle());
	     
	     //Switch to parent window
	      driver.switchTo().window(parentId);
	     System.out.println(driver.getTitle());
	     */
		
		//Approch2 more windows
		
		for(String windId:WindowIds)
		{
			 String title=driver.switchTo().window(windId).getTitle();
			if(title.equals("OrangeHRM")) {
				System.out.println(driver.getCurrentUrl());
			}
		}
	    
	}
	

}
