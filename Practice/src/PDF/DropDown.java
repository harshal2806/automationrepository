package PDF;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class DropDown {
	@Test
	public void DropDown() {
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("http://yatra.com/");
		WebDriverWait wait=new WebDriverWait(driver, 10);
		WebElement parentMenu=driver.findElement(By.xpath("//a[@class='setting-btn']"));
		wait.until(ExpectedConditions.visibilityOf(parentMenu));
		Actions act=new Actions(driver);
		act.moveToElement(parentMenu).perform();
		//WebElement subMenu=driver.findElement(By.xpath("(//a[@href='http://railtourpackages.yatra.com/trainpackages/home'])[1]"));
		//act.moveToElement(subMenu).perform();
		act.contextClick(parentMenu).perform();
		//System.out.println("Begin");
		//act.sendKeys("T").perform();
		act.sendKeys(Keys.DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();

	}

}
