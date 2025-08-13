package day21;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.WebDriver;

/*
 TEST CASE
 1.Launch Browser (Chrome)
 2.Open URL(https://www.opencart.com/)
 3.Validate title should be "OpenCart - Open Source Shopping Cart Solution"
 4.close Browser
 */

public class FirstTestCase {

	public static void main(String[] args) {
		// 1.Launch Browser (Chrome)
		ChromeDriver driver=new ChromeDriver();
		//EdgeDriver driver=new EdgeDriver();
		
		//WebDriver driver=new ChromeDriver();
		// 2.Open URL(https://www.opencart.com/)
		driver.get("https://www.opencart.com/");
		
		// 3.Validate title should be "Your Store"
		
      String actual_Title=driver.getTitle();
      
     if(actual_Title.equals("OpenCart - Open Source Shopping Cart Solution"))
    {
    	  System.out.println("test passed");
   }
      else {
    	  System.out.println("test failed");
      }
     // 4.close Browser
     driver.close();
     //driver.quit();
     
	}

}
