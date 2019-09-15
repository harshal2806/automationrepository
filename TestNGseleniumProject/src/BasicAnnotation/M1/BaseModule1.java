package BasicAnnotation.M1;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseModule1 {
	@BeforeTest
	public void preModule()
	{
		System.out.println("Pre condition for module 1");
		
	}
	@AfterTest
	public void postModule()
	{
		System.out.println("Post condition for module 1");
		
	}


}
