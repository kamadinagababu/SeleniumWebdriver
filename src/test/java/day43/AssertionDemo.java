package day43;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionDemo {
	@Test
	void testTitle()
	{
		String Actual_Title="OpenCart";
		String Expected_Title="OpenShop";
		Assert.assertEquals(Actual_Title, Expected_Title);
	}
	
	/*@Test
	void testTitle()
	{
		String Actual_Title="OpenCart";
		String Expected_Title="OpenShop";
		if(Actual_Title.equals(Expected_Title))
		{
			System.out.println("test passed");
			Assert.assertTrue(true);
		}
		else
		{
			System.out.println("test failed");
			Assert.assertTrue(false);
		}
	}*/
	
	

}
