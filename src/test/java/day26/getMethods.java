package day26;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getMethods {

	public static void main(String[] args) throws InterruptedException {

    WebDriver driver=new ChromeDriver();
    
    //get(Url)
    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    Thread.sleep(5000);
  
    driver.manage().window().maximize();
   
    
    //getTitle()
    System.out.println(driver.getTitle());
    
    //getCurrentUrl()
   System.out.println(driver.getCurrentUrl());
    
    //getPageSourceCode()
   // System.out.println(driver.getPageSource());
    
    //getWindowHandle()
    //System.out.println(driver.getWindowHandle());//15D84F96CBFB3D6314C29C2E4FB64950
                                                 //C7833C4800C464E2436F39D47B0023BB
    
    //getWindowHandles()
    driver.findElement(By.linkText("OrangeHRM, Inc")).click();
     Set<String> windIds=driver.getWindowHandles();
     System.out.println(windIds);
    
	}
	
	

}
