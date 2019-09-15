package BasicAnnotation.M2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Scenario3 {
	@Test
	public void test1()
	{
		System.out.println("Test case1 from Scenario3");
	}

	@Test
	public void test2()
	{
		System.out.println("Test case2 from Scenario3");
	}

	@Test
	public void test3()
	{
		System.out.println("Test case3 from Scenario3");
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
			System.out.println("Pre condition for Scenario3");
		}
	@AfterClass
	public void postScenario()
	{
		System.out.println("Post condition for Scenario3");
				
		
	}

}
