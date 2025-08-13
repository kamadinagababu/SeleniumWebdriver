package day43;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

//login  ----BeforeClass
//search---@Test
//advanceSearch@Test
//logout-----AfterClass
public class AnnotationsDemo2 {
  @BeforeClass
	void login() 
	{
		System.out.println("Tis is Login");
	}
	@Test(priority=1)
	void search()
	{
		System.out.println("Tis is Search");
	}
	@Test(priority=2)
	void AdvancedSearch()
	{
		System.out.println("Tis is AdvancedSearch");
	}
	@AfterClass
	void logout()
	{
		System.out.println("Tis is Logout");
	}

}
