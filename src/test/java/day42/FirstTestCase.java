package day42;

import org.testng.annotations.Test;

//open application
//login
//logout

public class FirstTestCase {
	
	
	@Test(priority=200)
	void login()
	{
		System.out.println("login the appliaction");
	}
	
	@Test(priority=15)
	void logout()
	{
		System.out.println("logout the appliaction");
	}
	
	@Test(priority=10)
	void openapp()
	{
		System.out.println("open the appliaction");
	}
	


}
