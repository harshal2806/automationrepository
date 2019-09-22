package BasicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Practicesel1
{
	@Test
	
		public void Prac1() throws InterruptedException {
			
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");

		ChromeDriver driver=new  ChromeDriver();
		driver.get("http://demo.actitime.com");
		/*String expectedTitle="actiTIME - Login";
		String actualTitle=driver.getTitle();
		System.out.println(actualTitle);
		if (actualTitle.equals(expectedTitle)) { 
		               System.out.println("Pass"); 
		}else{
		               System.out.println("fail"); 
		}*/
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.linkText("Login")).click();
		Thread.sleep(10000);
		String expectedText=driver.findElement(By.xpath("//td[text()='Enter Time-Track']")).getText();
		//System.out.println(expectedText);
		String actualText="Enter Time-Track";
		if (expectedText.equals(actualText)) {
		              System.out.println("Pass");
		}else{
		              System.out.println("fail");
		}

		
		
		}
	

	}

	
	


