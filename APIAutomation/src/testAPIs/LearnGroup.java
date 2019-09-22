package testAPIs;

import org.testng.annotations.Test;

public class LearnGroup
{
	@Test(groups= {"sanity"})
	public void test1()
	{
		System.out.println("testing 1");
		
	}
	@Test(groups= {"Regression"})
	public void test2()
	{
		System.out.println("testing 2");
		
	}
	@Test(groups= {"Regression"})
	public void test3()
	{
		System.out.println("testing 3");
		
	}
}


