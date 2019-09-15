package BasicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandleIframe 
{
	@Test
	public void test1() throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		
		ChromeDriver dr=new ChromeDriver();
		dr.get("https://paytm.com/");
		dr.manage().window().maximize();
		
		Thread.sleep(3000);
		dr.findElement(By.xpath("//div[text()='Log In/Sign Up']")).click();
		//dr.switchTo().frame(dr.findElement(By.tagName("iframe")));
		dr.switchTo().frame(0);
		Thread.sleep(3000);
		dr.findElement(By.xpath("//span[text()='Login/Signup with mobile number and password']")).click();
		
	}

}
