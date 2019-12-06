package com.merqury.qa.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.merqury.qa.util.MerquryTestUtil;
import com.merqury.qa.util.WebEventListener;

public class MerquryTestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	public static EventFiringWebDriver e_driver;
	public static WebEventListener eventListener;
	 
	public MerquryTestBase()
	{
		prop=new Properties();
		try {
			FileInputStream ip=new FileInputStream("D:\\automationrepository\\MercuryToursSiteTesting\\src\\main\\java\\com\\merqury\\qa\\config\\confugation.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace(); 
		}

	}
	
	public static void initialization() throws Exception
	{ 
		String browsername=prop.getProperty("browser");
		
		if (browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver_win32 (1)//chromedriver.exe");
			 driver=new ChromeDriver();  
		}else if (browsername.equals("FF")) 
		{ 
			System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\geckodriver.exe");
			 driver = new FirefoxDriver();
		}
		
		e_driver =new EventFiringWebDriver(driver);
		eventListener=new WebEventListener();
		e_driver.register(eventListener);
		driver=e_driver;
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(MerquryTestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);//we can store this to properties..
		driver.manage().timeouts().implicitlyWait(MerquryTestUtil.PAGE_IMPICIT_WAIT, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		
		
	}
	
	
	

}
