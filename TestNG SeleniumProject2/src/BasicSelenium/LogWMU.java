package BasicSelenium;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class LogWMU
{
	@Test
	public void book1() throws InterruptedException
	{
		//lounch browser
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		
		ChromeDriver dr= new ChromeDriver();
		dr.get("http://www.newtours.demoaut.com/");
		dr.manage().window().maximize();
		//login
		dr.findElement(By.xpath("//input[@name='userName']")).sendKeys("jharshal643@gmail.com");
		dr.findElement(By.xpath("//input[@name='password']")).sendKeys("harshal@26");
		//dr.findElement(By.xpath("//input[@name='login']")).click();
		
		//2nd user
		//dr.findElement(By.xpath("//input[@name='userName']")).sendKeys("mercury");
		//dr.findElement(By.xpath("//input[@name='password']")).sendKeys("mercury");
		//dr.findElement(By.xpath("//input[@name='login']")).click();
		
		/*dr.findElement(By.xpath("//input[@value='roundtrip']")).click();
		WebElement pass=dr.findElement(By.xpath("//select[@name='passCount']"));
		
		Select sel= new Select(pass);
		
		sel.selectByIndex(0);
		Thread.sleep(2000);
		
		dr.findElement(By.xpath("//input[@name='servClass']")).click();
		WebElement airline=dr.findElement(By.xpath("//select[@name='airline']"));
		Select air=new Select(airline);
		air.selectByIndex(0);
		Thread.sleep(2000);
		
		dr.findElement(By.xpath("//input[@name='findFlights']")).click();
		
		WebElement table=dr.findElement(By.xpath("//table[@cellspacing='1'][1]"));
		
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		
		for(WebElement r:rows)
		{
			List<WebElement> cols=r.findElements(By.tagName("td"));
					for(WebElement c:cols)
			{
				System.out.print(c.getText()+" ");
			}
			System.out.println();
		}
		//checkbox
		dr.findElement(By.xpath("//input[@name='reserveFlights']")).click();
		dr.findElement(By.xpath("//input[@name='ticketLess'][1]")).click();
		//dropdown
		WebElement country=dr.findElement(By.xpath("//select[@onchange='javascript:CheckCountry()']"));
		
		Select con=new Select(country);
		con.selectByIndex(3);
		Thread.sleep(2000);
		//Alert
		Alert alt=dr.switchTo().alert();
		alt.accept();
		
		dr.findElement(By.xpath("//input[@name='buyFlights']")).click();
		
		System.out.println(dr.findElement(By.xpath("//font[@size='+1']")).getText());
		WebElement img=dr.findElement(By.xpath("//img[@src='/images/nav/logo.gif']"));
		System.out.println(img.getAttribute("width"));
		System.out.println(img.getAttribute("height"));*/
		//dr.findElement(By.xpath("//img[@src='/images/forms/Logout.gif']")).click();
			
	}
	


}
