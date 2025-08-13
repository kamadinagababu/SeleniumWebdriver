package day44;

import org.testng.annotations.Test;

public class SignupTests {
	
	@Test(priority=1,groups= {"regression"})
	void signupByEmail()
	{
		System.out.println("this is the Signup By Email...");
	}
	@Test(priority=2,groups= {"regression"})
	void signupByFacebook()
	{
		System.out.println("this is the Signup By Facebook...");
	}
	@Test(priority=3,groups= {"regression"})
	void signupByTwitter()
	{
		System.out.println("this is the Signup By Twitter...");
	}

}
