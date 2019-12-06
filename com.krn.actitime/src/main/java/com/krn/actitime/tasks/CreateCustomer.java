package com.krn.actitime.tasks;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.krn.actitime.baseclass.BaseClass;

public class CreateCustomer extends BaseClass {
	 
  @Test
  public void testCreateCustomer() throws InterruptedException   {
	 
	  TP.navigateToTasks(driver);
	  
	  TP.clickOnAddCustomer(driver);
	  
	  driver.findElement(By.xpath("//div[text()='+ New Customer']")).click();
	  
	  
	  String custName=xlib.getExcelData("Create Customer", 1, 0);
	  String d = xlib.getExcelData("Create Customer", 1, 1);
	  
	  driver.findElement(By.xpath("(//input[@placeholder='Enter Customer Name'])[2]")).sendKeys(custName);
	  
	  driver.findElement(By.xpath("//textarea[@placeholder='Enter Customer Description']")).sendKeys(d);
	  
	  driver.findElement(By.xpath("//div[text()='  Create Customer']")).click();
	  Thread.sleep(3000);
	  
	  
  
  }
}
