package day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
	WebElement drpDwonElement=driver.findElement(By.xpath("//select[@id='country']"));
	
	Select DropDownCountry=new Select(drpDwonElement);
	
	//select option for the dropDown
	//DropDownCountry.selectByVisibleText("France");
	//DropDownCountry.selectByValue("france");
	//DropDownCountry.selectByIndex(5);
	
	//capture the options from the drop down
	List <WebElement>Options=DropDownCountry.getOptions();
	System.out.println(Options.size());

	//printing the options using for loop 
	
	/*for(int i=0; i<Options.size(); i++)
	{
		System.out.println(Options.get(i).getText());
	}
	*/
	
	
	//using enhanced for loop
	for( WebElement op:Options)
	{
		System.out.println(op.getText());
	}
		
	}

}

