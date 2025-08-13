package day39;


import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks
{

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
		
		
		
		//capture the link
		List <WebElement>links=driver.findElements(By.tagName("a"));
		//System.out.println(links);
		int NoOfBrokenLinks=0;
		
		for(WebElement linkElement:links)
		{
			String hrefattributeValue= linkElement.getAttribute("href");
			//System.out.println(hrefattributeValue);
			if(hrefattributeValue==null || hrefattributeValue.isEmpty())
			{
				System.out.println("not possible to check ");
				continue;
			}
			
			//hit to the server
		try {
			
		        URL urlLink=new URL(hrefattributeValue); //converted to string to url format
			//open coonect to the server
			
		       HttpURLConnection conn=(HttpURLConnection)urlLink.openConnection();
		       conn.connect();//connect the server and sent request the server
		         if(conn.getResponseCode()>=400)
		   {
			  
			System.out.println(hrefattributeValue+"this is broken link");	
			NoOfBrokenLinks++;
		   }
		        else
			  
		     {
			  System.out.println(hrefattributeValue+"this not broken link");	
		     }
		  
			}
		catch(Exception e)
			{
				
			}
		
		}
		
		System.out.println(NoOfBrokenLinks);

	}

}
