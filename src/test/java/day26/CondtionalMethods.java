package day26;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CondtionalMethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/register");
		Thread.sleep(5000);

		//isDisplayed()
	//boolean	LogoStatus=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
	//System.out.println(LogoStatus);
	
	//boolean inputBox=driver.findElement(By.xpath("//input[@id='small-searchterms']")).isDisplayed();
	//System.out.println(inputBox);
	
	//isEnabled();
	
	//boolean status =driver.findElement(By.xpath("//input[@id='FirstName']")).isEnabled();
	//System.out.println(status);
		
		//isSelected()
		
		WebElement male=driver.findElement(By.xpath("//input[@id='gender-male']"));
	
		WebElement female=driver.findElement(By.xpath("//input[@id='gender-female']"));
		
		//System.out.println("before selection");
		//System.out.println(male.isSelected());//false
		//System.out.println(female.isSelected());//false
		
		//System.out.println("after male selection...");
		//male.click();
		//System.out.println(male.isSelected());//true
		//System.out.println(female.isSelected());//false
		
		//System.out.println("after female selection...");
		//female.click();
		//System.out.println(male.isSelected());//false
		//System.out.println(female.isSelected());//true
		
		
		boolean  newsLetter=driver.findElement(By.xpath("//input[@id='Newsletter']")).isSelected();
  
		System.out.println(newsLetter);
		

	}


}
