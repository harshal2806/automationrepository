package BasicSelenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumPratice1 {
	
	
	@Test
	public void LoginPage()
	{
System.out.println("Testing");
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		
		ChromeDriver dr=new ChromeDriver();
		dr.get("http://automationpractice.com/index.php");
	}

}
