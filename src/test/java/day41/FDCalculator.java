package day41;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

public class FDCalculator {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		
	WebDriver driver =new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.moneycontrol.com/fixed-income/calculator/hsbc/fixed-deposit-calculator-ZZZ-BHS001.html?classic=true");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//button[text()='No thanks']")).click();
	
	String filePath=System.getProperty("user.dir")+"\\exceldata\\SimpleInterestResults.xlsx";
	int rows=ExcelUtils.getRowCount(filePath, "Simple Interest Results");
	
	for(int i=1; i<=rows; i++)
	{
		//read data from excel
		String Princ=ExcelUtils.getCellData(filePath, "Simple Interest Results", i, 0);
		String RateOfInterst=ExcelUtils.getCellData(filePath, "Simple Interest Results", i, 1);
		String Period=ExcelUtils.getCellData(filePath, "Simple Interest Results", i, 2);
		String Days=ExcelUtils.getCellData(filePath, "Simple Interest Results", i, 3);
		String Frequency=ExcelUtils.getCellData(filePath, "Simple Interest Results", i, 4);
		String Maturity_Value=ExcelUtils.getCellData(filePath, "Simple Interest Results", i, 5);
		
		
		
		//pass above data into application
		driver.findElement(By.xpath("//input[@id=\"principal\"]")).sendKeys(Princ);
		driver.findElement(By.xpath("//input[@id=\"interest\"]")).sendKeys(RateOfInterst);
		driver.findElement(By.xpath("//input[@id=\"tenure\"]")).sendKeys(Period);
		
		Select selectDrop=new Select(driver.findElement(By.xpath("//select[@id=\"tenurePeriod\"]")));
		selectDrop.selectByVisibleText(Days);
		Select freqencyDrop= new Select(driver.findElement(By.xpath("//select[@id=\"frequency\"]")));
		freqencyDrop.selectByVisibleText(Frequency);
		driver.findElement(By.xpath("//img[@src=\"https://images.moneycontrol.com/images/mf_revamp/btn_calcutate.gif\"]")).click();
		
		
	
		
		
		//validation
		
		String ExpectedValue=driver.findElement(By.xpath("//span[@id='resp_matval']//strong")).getText();
		
		if(Double.parseDouble(Maturity_Value)==Double.parseDouble(ExpectedValue))
		{
			System.out.println("test passed");
			ExcelUtils.setCellData(filePath, "Simple Interest Results", i, 7, "passed");
			ExcelUtils.fillGreenColor(filePath, "Simple Interest Results", i, 7);
			
		}
		else
		{
			System.out.println("test Failed");
			ExcelUtils.setCellData(filePath, "Simple Interest Results", i, 7, "Failed");
			ExcelUtils.fillRedColor(filePath, "Simple Interest Results", i, 7);
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@class=\"PL5\"]")).click();
	}
	driver.quit();

	}

}
