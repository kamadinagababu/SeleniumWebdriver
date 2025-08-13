package day38;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreenshots {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//1)capture full page screenshot
		
		/*TakesScreenshot ts=(TakesScreenshot)driver;
		
		File SourceFile=ts.getScreenshotAs(OutputType.FILE);
		//D:\workspace\java projects\SeleniumWebdriver\screenshots
		
	  File targetFile=new File(System.getProperty("user.dir")+"\\screenshots\\fullpage.png");
	  SourceFile.renameTo(targetFile); //copy Sourcefile to Targetfile
	  */
		
		//2)capture the screenshot of specific page
		
		/*WebElement FeatureProductPage=driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
		File SourceFile=FeatureProductPage.getScreenshotAs(OutputType.FILE);
		 File targetFile=new File(System.getProperty("user.dir")+"\\screenshots\\futureproducts.png");
		  SourceFile.renameTo(targetFile);
         */
		
		
		//3)capture the screenshot of specific element
		
		WebElement Logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		File SourceFile=Logo.getScreenshotAs(OutputType.FILE);
		File targetFile=new File(System.getProperty("user.dir")+"\\screenshots\\logo.png");
		 SourceFile.renameTo(targetFile);
		 driver.quit();
	}
	

}
