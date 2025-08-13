package day43;

import org.testng.annotations.*;

public class AllAnnotationsDemo {
	
	@Test
	void test1()
	{
		System.out.println("this is method 1");
	}
	@Test
	void test2()
	{
		System.out.println("this is method 2");
	}
	@BeforeTest
    void bt()
    {
		System.out.println("this is beforeTest method...");
    }
	@AfterTest
	void at()
	{
		System.out.println("this is afterTest method...");
	}
	@BeforeSuite
	void bs()
	{
		System.out.println("this is beforeSuite method...");
	}
	@AfterSuite
	void as()
	{
		System.out.println("this is afterSuite method...");
	}
	@BeforeClass
	void bc()
	{
		System.out.println("this is beforeClass method...");
	}
	@AfterClass
	void ac()
	{
		System.out.println("this is afterClass method...");
	}
	@BeforeMethod
	void bm()
	{
		System.out.println("this is beforeMethod..");
	}
	@AfterMethod
	void am()
	{
		System.out.println("this is afterMethod...");
	}
}
