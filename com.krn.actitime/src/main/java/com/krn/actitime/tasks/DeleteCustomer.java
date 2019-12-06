package com.krn.actitime.tasks;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.krn.actitime.baseclass.BaseClass;

public class DeleteCustomer extends BaseClass{
	
  @Test
  public void testDeleteCustomer() throws InterruptedException  {
	  TP.navigateToTasks(driver);
	  
	  String custName=xlib.getExcelData("Delete Customer", 1,0);
	  driver.findElement(By.xpath("(//input[@placeholder='Start typing name ...'])[1]")).sendKeys(custName);
	  driver.findElement(By.xpath("//span[@class='highlightToken']")).click();
	  driver.findElement(By.xpath("//div[@title='"+custName+"']/..//div[@class='editButton']")).click();
	
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("(//div[text()='ACTIONS'])[1]/..")).click();
	 
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("(//div[text()='Delete'])[2]")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//span[text()='Delete permanently']")).click();
	  Thread.sleep(3000);
	  
  }
}
