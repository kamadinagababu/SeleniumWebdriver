package day47;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest {
	WebDriver driver;
	@BeforeClass
	void setUp()
	{
		driver=new ChromeDriver();//created driver 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	}
	@Test
	void testLogin()
	{
		//create Object
		LoginPage lg=new LoginPage(driver);//passing driver
		lg.setUserName("Admin");
		lg.setPassword("admin123");
		lg.setLoginBtn();
	}
	@AfterClass
	void tearDown()
	{
		driver.close();
	}

}
