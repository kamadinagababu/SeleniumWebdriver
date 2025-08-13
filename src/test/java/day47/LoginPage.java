package day47;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver; //class level
	//constructor
	public LoginPage(WebDriver driver)//local level//receive
	{
		this.driver=driver; //Assign test driver to this class's driver //store the driver
	}
	
	//locators

     By txt_username_loc=By.xpath("//input[@placeholder='Username']");
     By txt_password_loc=By.xpath("//input[@placeholder='Password']");
     By btn_login_loc=By.xpath("//button[normalize-space()='Login']");
	
	//actions
     
     public void setUserName(String user)
     {
    	 driver.findElement(txt_username_loc).sendKeys(user);
     }
     
     public void setPassword(String pwd)
     {
    	 driver.findElement(txt_password_loc).sendKeys(pwd);
     }
     
     public void setLoginBtn()
     {
    	 driver.findElement(btn_login_loc).click();
     }

}
