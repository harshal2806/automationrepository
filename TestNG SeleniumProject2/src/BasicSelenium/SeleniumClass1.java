package BasicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumClass1 {
	
	@Test
	public void test1()
	{
		System.out.println("Testing");
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		
		ChromeDriver dr=new ChromeDriver();
		dr.get("http://www.newtours.demoaut.com/");
		
		dr.findElement(By.name("userName")).sendKeys("mercury"); 
		dr.findElement(By.name("password")).sendKeys("mercury");
		dr.findElement(By.name("login")).click();
		
	
	}

}
