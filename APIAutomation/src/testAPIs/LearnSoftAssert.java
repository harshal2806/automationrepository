package testAPIs;

import org.apache.log4j.Priority;
import org.junit.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LearnSoftAssert 
{
	@Test
	public void test1()
	{
		SoftAssert ars=new  SoftAssert();
		
		//Assert.assertTrue(10>10);
		ars.assertTrue(10>10);
		System.out.println("harshal");
		ars.assertAll();
	}
	@Test(priority=1)
	public void test2()
	{
		System.out.println("Testing2");
		
	}
	@Test(priority=0)
	public void test3()
	{
		System.out.println("Testing3");
	}

}
