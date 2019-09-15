package BasicAnnotation.M2;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseModule2 {
	@BeforeTest
	public void preModule()
	{
		System.out.println("Pre condition for module 2");
		
	}
	@AfterTest
	public void postModule()
	{
		System.out.println("Post condition for module 2");
		
	}


}
