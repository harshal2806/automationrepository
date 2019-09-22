package SamplePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestingClass {

	@Test
	public void test()
	{
		System.out.println("Harshal Testing");
		
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		
		ChromeDriver dr= new ChromeDriver();
		dr.get("http://www.newtours.demoaut.com/");
		dr.manage().window().maximize();
		//login
		dr.findElement(By.xpath("//input[@name='userName']")).sendKeys("jharshal643@gmail.com");
		dr.findElement(By.xpath("//input[@name='password']")).sendKeys("harshal@26");
		dr.findElement(By.xpath("//input[@name='login']")).click();
		
		dr.close();
	}
}
