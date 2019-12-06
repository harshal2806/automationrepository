package BasicSelenium;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SeleniumClass2 {

  @Test
  public void test1() throws InterruptedException 
   {

		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver_win32 (1)//chromedriver.exe");
		
		ChromeDriver dr=new ChromeDriver(); 
		System.out.println("driver="+dr);
		dr.get("http://www.newtours.demoaut.com/");
		dr.manage().window().maximize();
		//Text  box
		dr.findElement(By.xpath("//input[@name='userName']")).sendKeys("mercury");
		dr.findElement(By.xpath("//input[@name='password']")).sendKeys("mercury");
		//button
		dr.findElement(By.xpath("//input[@name='login']")).click(); 
		/*//radiobutton
		dr.findElement(By.xpath("//input[@value='oneway']")).click();
		//Dropdown
		WebElement pass=dr.findElement(By.xpath("//select[@name='passCount']"));
		
		Select sel=new Select(pass);
		sel.selectByIndex(2);
		
		
		Thread.sleep(2000);
		sel.selectByValue("2");
		
		Thread.sleep(2000);
		sel.selectByVisibleText("4");
		
		//**Write code to handle other dropdown
		dr.findElement(By.xpath("//input[@name='findFlights']")).click();
		WebElement table=dr.findElement(By.xpath("//table[@cellspacing='1'][1]/tbody"));
		
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
		//click to continue
		dr.findElement(By.xpath("//input[@name='reserveFlights']")).click();
		
		//country drop down
		WebElement country=dr.findElement(By.xpath("//select[@name='delCountry']"));
		Select cont =new Select(country);
		
		
		List<WebElement>allOptions=cont.getOptions();
		int k=allOptions.size();
		System.out.println(k);
		
		for(int i=0;i<k;i++)
		{
			WebElement option=allOptions.get(i);
			String text=option.getText();
			System.out.println(text);
		}
		cont.selectByIndex(3);
				
		
		//Alert
		Alert alt=dr.switchTo().alert();	
		System.out.println(alt.getText());
		
		alt.accept();
		//alt.dismiss();
		
		//check box
		
		WebElement check=dr.findElement(By.xpath("//input[@name='ticketLess']"));
		
		System.out.println(check.isSelected());
		check.click();
		System.out.println(check.isSelected());
		
		//click on secured flight
		dr.findElement(By.xpath("//input[@name='buyFlights']")).click();
		
		System.out.println(dr.findElement(By.xpath("//font[@size='+1']")).getText());
		
		//image
		WebElement img=dr.findElement(By.xpath("//img[@alt='Mercury Tours']"));
		System.out.println(img.getAttribute("width"));
		System.out.println(img.getAttribute("height"));
		
		dr.findElement(By.xpath("//img[@src='/images/forms/Logout.gif']")).click();
*/
		
		

}
}