package day29;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCheckboxes {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("//input[@id='sunday']")).click();
		
		List<WebElement> CheckBoxes=driver.findElements(By.xpath("//input[@class=\"form-check-input\" and @type=\"checkbox\"]"));
		
		//1) select all boxes using normal for loop
		
		/*for(int i=0; i<CheckBoxes.size(); i++)
		{
			CheckBoxes.get(i).click();
		}*/
		
		
		//2) select all boxes using enhanced for loop
		
		//for( WebElement CheckBox:CheckBoxes)
		//{
		//	CheckBox.click();
		//}

		
		//3) select last 3 checkBoxes
		//for(int i=4; i<CheckBoxes.size(); i++)
		//{
		//	CheckBoxes.get(i).click();
		//}
		
		
		//4) select first 3 checkBoxes
		//for(int i=0; i<3; i++) {
		//	CheckBoxes.get(i).click();
		//}
		
		//5) Unselect CheckBoxes if they are selected
		  for(int i=0; i<3; i++)
		    { 
			CheckBoxes.get(i).click();
			}
		  
			Thread.sleep(5000);
			
			for(int i=0; i<CheckBoxes.size(); i++)
			{
				if(CheckBoxes.get(i).isSelected())
				{
					CheckBoxes.get(i).click();
				}
				
			}
		
	}

}
