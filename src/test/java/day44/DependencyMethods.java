package day44;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyMethods {
	@Test
	void open()
	{
		Assert.assertTrue(true); //pass
	}
	@Test(dependsOnMethods= {"open"})
	void login()
	{
		Assert.assertTrue(true);//pass
	}
	@Test(dependsOnMethods= {"login"})
	void search()
	{
		Assert.assertTrue(false);//fail
	}
	@Test(dependsOnMethods= {"search","login"})//skip 
	void AdvanceSearch()
	{
		Assert.assertTrue(true);
	}
	@Test(dependsOnMethods= {"login"})
	void logout()
	{
		Assert.assertTrue(true);//pass
	}
	

}
