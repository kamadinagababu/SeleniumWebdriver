package day47;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage1 {

	WebDriver driver; //class level
	//constructor
	public LoginPage1(WebDriver driver)//local level//receive
	{
		this.driver=driver; //Assign test driver to this class's driver //store the driver
		PageFactory.initElements(driver, this);
	}
	
	//locators
	
	@FindBy(xpath="//input[@placeholder='Username']")
	WebElement txt_username;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement txt_password;
	
	@FindBy(xpath="//button[normalize-space()='Login']")
	WebElement btn_login;


	//actions
     
     public void setUserName(String user)
     {
    
    	 //using page factory
    	 txt_username.sendKeys(user);
     }
     
     public void setPassword(String pwd)
     {
    	
    	 txt_password.sendKeys(pwd);
     }
     
     public void setLoginBtn()
     {
    	 
    	 btn_login.click();
     }
}
