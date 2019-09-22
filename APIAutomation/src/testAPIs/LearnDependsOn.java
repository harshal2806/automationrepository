package testAPIs;

import org.testng.annotations.Test;

public class LearnDependsOn 
{
	@Test(dependsOnMethods= {"test2"})
	public void test1()
	{
		System.out.println("testing 1");
		
	}
	@Test
	public void test2()
	{
		System.out.println("testing 2");
		
	}
	@Test
	public void test3()
	{
		System.out.println("testing 3");
		
	}
}
