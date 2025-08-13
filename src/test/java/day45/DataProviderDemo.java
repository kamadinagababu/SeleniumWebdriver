package day45;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	WebDriver driver;
	@BeforeClass
	void setUp()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	
	
	@Test(dataProvider="dp")
	void testLogin(String Email,String Password) throws InterruptedException
	{
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id=\"input-email\"]")).sendKeys(Email);
		driver.findElement(By.xpath("//input[@id=\"input-password\"]")).sendKeys(Password);
		driver.findElement(By.xpath("//input[@value=\"Login\"]")).click();
		Thread.sleep(3000);
		
		boolean status=driver.findElement(By.xpath("//h2[normalize-space()=\"My Account\"]")).isDisplayed();
		
		if(status==true)
		{
			driver.findElement(By.xpath("//a[@class=\"list-group-item\"][normalize-space()=\"Logout\"]")).click();//logout
			Assert.assertTrue(true);
		}
		else {
			Assert.fail();
		}
	}
	
	
	
	@AfterClass
	void tearDown()
	{
		driver.quit();
	}
	
	
	//create @DataProvider method
	@DataProvider(name="dp",indices= {2,3})
	Object LoginData()
	{
		Object data[][]= {
				
				{"chaith@gmail.com","chaithu123"},
				{"chaith@gmail.com","chthu123"},
				{"chaithu123@gmail.com","chaithu123"},
				{"chaitanyak0324@gmail.com","Chaithu@123"},
				{"chaith345@gmail.com","Chaithu@123"},
				
		                  };
		return data;
	}
}
