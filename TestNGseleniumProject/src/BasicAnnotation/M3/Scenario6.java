package BasicAnnotation.M3;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Scenario6{
	@Test
	public void test1()
	{
		System.out.println("Test case1 from Scenario6");
	}

	@Test
	public void test2()
	{
		System.out.println("Test case2 from Scenario6");
	}

	@Test
	public void test3()
	{
		System.out.println("Test case3 from Scenario6");
	}
	@BeforeMethod
	public void testCasePreCondition()
	{
		System.out.println("Test case pre condition");
	}
	@AfterMethod
	public void testCasePotCondition()
	{
		System.out.println("Test case post condition");
	}
	@BeforeClass
	public void preScenario()
		{
			System.out.println("Pre condition for Scenario6");
		}
	@AfterClass
	public void postScenario()
	{
		System.out.println("Post condition for Scenario6");
				
		
	}

}