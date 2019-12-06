package BasicSelenium;

import java.util.Iterator;
import java.util.Set;

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
		//dr.findElement(By.name("login")).click();
		
		Set<String> s=dr.getWindowHandles();
		
		for(String m:s)
		{
			System.out.println(s);
			
		}
		
		Iterator<String>it=s.iterator();
		while(it.hasNext())
		{
			//System.out.println(it.next());
			dr.switchTo().window(it.next());
		}
	
	}

}
