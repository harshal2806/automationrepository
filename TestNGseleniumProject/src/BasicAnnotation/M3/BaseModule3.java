package BasicAnnotation.M3;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseModule3 {
	@BeforeTest
	public void preModule()
	{
		System.out.println("Pre condition for module 3");
		
	}
	@AfterTest
	public void postModule()
	{
		System.out.println("Post condition for module 3");
		
	}


}
