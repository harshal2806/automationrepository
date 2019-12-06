package Youtube;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DateSelection {

	public static void main(String[] args) throws InterruptedException {
		// lounch browser
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");

		ChromeDriver dr = new ChromeDriver();
		dr.get("https://www.crmpro.com/");
		dr.manage().window().maximize();
		
		dr.findElement(By.xpath("//a[@href=\"https://www.crmpro.com/register/\"]")).click();
		dr.findElement(By.id("payment_plan_id")).click();
		WebElement Edition=dr.findElement(By.id("payment_plan_id"));
		
		Select edi=new Select(Edition);
		edi.selectByIndex(1);
		Thread.sleep(2000);
		
		dr.findElement(By.xpath("//input[@name='first_name']")).sendKeys("Harshal");
		dr.findElement(By.xpath("//input[@name='surname']")).sendKeys("Jain");
		dr.findElement(By.xpath("//input[@name='email']")).sendKeys("jharshal643@gmail.com");
		dr.findElement(By.xpath("//input[@name='email_confirm']")).sendKeys("jharshal643@gmail.com");
		dr.findElement(By.xpath("//input[@name='username']")).sendKeys("harshal26");
		dr.findElement(By.xpath("//input[@name='password']")).sendKeys("harshal@26");
		dr.findElement(By.xpath("//input[@name='passwordconfirm']")).sendKeys("harshal@26");
		WebElement checkbox=dr.findElement(By.xpath("//input[@name='agreeTerms']"));
		
		boolean status=checkbox.isSelected();
		System.out.println(status);
		checkbox.click();
		System.out.println(status);
		
		dr.findElement(By.id("submitButton")).click();
		
		
		
	}

}
