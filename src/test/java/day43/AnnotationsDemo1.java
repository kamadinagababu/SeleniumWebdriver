package day43;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//login----BeforeMethod
//search-----@Test
//logout-----AfterMethod
//login
//advance search----@Test
//logout
public class AnnotationsDemo1 {
	@BeforeMethod
	void login()
	{
		System.out.println("This is Login....");
	}
	@AfterMethod
    void logout()
    {
    	System.out.println("This is Logout....");
    }
    @Test(priority=1)
    void search()
    {
    	System.out.println("This is Serach....");
    }
    @Test(priority=2)
    void AdvanceSearch()
    {
    	System.out.println("This is Adanced Search....");
    }
	
}
