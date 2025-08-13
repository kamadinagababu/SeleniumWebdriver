package day37;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		driver.manage().window().maximize();
		
		//upload single file
		
		/*driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("C:\\Users\\durga\\OneDrive\\Pictures\\Documents\\ajeej resume.docx");
		if(driver.findElement(By.xpath("//ul[@id='fileList']//li")).getText().equals("ajeej resume.docx"))
				{
			System.out.println("File Upload successfully");
				}
		else {
			System.out.println("File not Upload ");
		}*/
		
		//upload multiple files
		String file1="C:\\\\Users\\\\durga\\\\OneDrive\\\\Pictures\\\\Documents\\\\ajeej resume.docx";
		String file2="C:\\\\Users\\\\durga\\\\OneDrive\\\\Pictures\\\\Documents\\\\nagababu_resume.docx";
		
		driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys(file1+"\n"+file2);
		int NoOfUploadFiles=driver.findElements(By.xpath("//ul[@id='fileList']//li")).size();
		if(NoOfUploadFiles==2) {
			System.out.println("Files Upload successfully");
		}
		else {
			System.out.println("File failed ");
		}
		


	}

}
