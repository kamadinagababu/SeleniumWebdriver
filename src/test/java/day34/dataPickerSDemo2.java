package day34;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dataPickerSDemo2 {
	
	static void selectDOB(WebDriver driver,String requireYear,String requireMonth, String requireDate)
	{

		while(true) {
		//select year
		WebElement yearDropdown=driver.findElement(By.xpath("//select[@aria-label='Select year']"));
		
		Select selectYear=new Select(yearDropdown);
		selectYear.selectByVisibleText(requireYear);
		
		//select month
		WebElement monthDropdown=driver.findElement(By.xpath("//select[@aria-label='Select month']"));
		Select selectMonth=new Select(monthDropdown);
		selectMonth.selectByVisibleText(requireMonth);
		
		//select date
		List <WebElement> AllDates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
		for(WebElement dates:AllDates)
		{
			if(dates.getText().equals(requireDate))
			{
				dates.click();
				break;
			}
		}
		
		}
		
	}
public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();

		//input DOB
		
		String requireYear="2023";
		String requireMonth="May";
		String requireDate="25";
		driver.findElement(By.xpath("//input[@id='txtDate']")).click();
		selectDOB(driver,requireYear,requireMonth,requireDate);
			
	}

}
