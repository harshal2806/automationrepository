package BasicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Registration 
{  @Test
	  public void test1() throws InterruptedException 
{

		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		
		ChromeDriver dr= new ChromeDriver();
		dr.get("http://www.newtours.demoaut.com/");
		dr.manage().window().maximize();
		
		//Register
		dr.findElement(By.xpath("//a[text()='REGISTER']")).click();
		dr.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Harshal");
		dr.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Jain"); 
		dr.findElement(By.xpath("//input[@name='phone']")).sendKeys("8552949513");
		dr.findElement(By.xpath("//input[@id='userName']")).sendKeys("jharshal643@gmail.com");
		dr.findElement(By.xpath("//input[@name='address1']")).sendKeys("Telegaon,damdere,Pune");
		dr.findElement(By.xpath("//input[@name='city']")).sendKeys("Pune");
		dr.findElement(By.xpath("//input[@name='state']")).sendKeys("Maharashtra");
		dr.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("412208");
		dr.findElement(By.xpath("//select[@name='country']")).sendKeys("India");
		dr.findElement(By.xpath("//input[@id='email']")).sendKeys("jharshal643@gmail.com");
		dr.findElement(By.xpath("//input[@type='password']")).sendKeys("harshal@26");
		dr.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("harshal@26");
		dr.findElement(By.xpath("//input[@name='register']")).click();
		
		
		
		
		
		
		
		
		
		
		
}
}
