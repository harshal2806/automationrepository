package library;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import config.Configuration;

public class ApplicationLibrary 
{
	public WebDriver launchBrowser(String browserName)
	{
		WebDriver dr=null;
		if(browserName.equalsIgnoreCase("Chrome"))
		{
        System.setProperty("webdriver.chrome.driver", Configuration.chromeDriver);
        dr=new ChromeDriver();
		dr.manage().window().maximize();
		}else if(browserName.equalsIgnoreCase("firefox"))
		{
			//system.setproperty for geckodriver
			dr=new FirefoxDriver();
		} 
		return dr;
	}
	
	public void nevigate(WebDriver dr,String url)
	{
		dr.get(url);
	}
	public boolean isElementPresent(WebDriver dr, By element)
	{
		if (dr.findElements(element).size()>=1)
			return true;
		else
			return false;
		
	}

}
