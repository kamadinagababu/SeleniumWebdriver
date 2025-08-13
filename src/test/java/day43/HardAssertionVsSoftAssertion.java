package day43;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardAssertionVsSoftAssertion {
	
	//@Test
	void Hardassertion()
	{
		System.out.println("testing...");
		System.out.println("testing...");
		Assert.assertEquals(1, 2);//hardAssertion got fail rest of statements not executed
		System.out.println("testing...");
		System.out.println("testing...");
	}
	
	@Test
	void Softassertion()
	{
		System.out.println("testing...");
		System.out.println("testing...");
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(1, 3);//SoftAssertion got fail rest of statements will  executed
		System.out.println("testing...");
		System.out.println("testing...");
		sa.assertAll();
	}

}
