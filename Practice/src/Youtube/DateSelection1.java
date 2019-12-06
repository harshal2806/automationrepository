package Youtube;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DateSelection1 {

	public static void main(String[] args) {
		// lounch browser
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");

		ChromeDriver dr = new ChromeDriver();
		dr.get("https://www.crmpro.com/");
		dr.manage().window().maximize();
		// login
		dr.findElement(By.xpath("//input[@name='username']")).sendKeys("harshal26");
		dr.findElement(By.xpath("//input[@name='password']")).sendKeys("harshal@26");
		dr.findElement(By.xpath("//input[@value='Login']")).click();
		dr.switchTo().frame("mainpanel");
		// select date
		/*String date = "7-November-2020";
		String dateArr[] = date.split("-");
		String month = dateArr[1];
		String year = dateArr[2];
		String day = dateArr[0];

		dr.findElement(By.xpath("//select[@name='slctMonth']")).click();
		Select mon = new Select(dr.findElement(By.xpath("//select[@name='slctMonth']")));
		mon.selectByVisibleText(month);
		dr.findElement(By.xpath("//select[@name='slctYear']")).click();
		Select yer = new Select(dr.findElement(By.xpath("//select[@name='slctYear']")));
		yer.selectByVisibleText(year);
		
		dr.findElement(By.cssSelector("td[onmouseover=\"calendarMouseOver(this, '15', '11', '2020', 0, '');\"]")).click();*/
	

	}
	
	public static void  setDate(WebDriver dr,WebElement element,String dateVal)
	{
		JavascriptExecutor js=((JavascriptExecutor)dr);
		js.executeScript("arguments[0].setAttributr('value',"+dateVal+"')", element);
	}
}
