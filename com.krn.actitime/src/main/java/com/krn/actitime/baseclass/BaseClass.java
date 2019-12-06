package com.krn.actitime.baseclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.krn.actitime.taskspage.TasksPage;

public class BaseClass {
	public WebDriver driver;
	public ExcelLibrary  xlib;
	public   TasksPage TP ;
	public WebDriverWait wait;

	  @BeforeClass
	  public  void openBrowser() {
		  driver = new FirefoxDriver();
		  TP = new TasksPage();
		  xlib= new ExcelLibrary();
		  driver.manage().window().maximize();
		  driver.get("https://demo.actitime.com");
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  
		  String expectedTitle= "actiTIME - Login";
		  String actualTitle= driver.getTitle();
		  Assert.assertEquals(actualTitle, expectedTitle);
		  
		
		  
	  }
	  @BeforeMethod
	  public void login()  {
		  String un = xlib.getExcelData("Login", 1, 0);
		  String pw = xlib.getExcelData("Login", 1, 1);
		  driver.findElement(By.id("username")).sendKeys(un);
		  driver.findElement(By.name("pwd")).sendKeys(pw);
		  driver.findElement(By.id("loginButton")).click();
		  String expectedText= "Enter Time-Track";
		  String actualText=driver.findElement(By.xpath("(//td[text()='Enter Time-Track'])[1]")).getText();
		  Assert.assertEquals(actualText, expectedText);
		  
		  
		  
		 
		 
	  }	
	  @AfterMethod
	  public void logout() {
		
		  driver.findElement(By.xpath("//a[text()='Logout' and @class='logout']")).click();
		
	  }
	  @AfterClass
	  public void closeBrowser() {
		  driver.close();
	  
	
  }
}
