package com.krn.actitime.taskspage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TasksPage {
	public void navigateToTasks(WebDriver driver) {
		
		 driver.findElement(By.xpath("//a[@href='/tasks/tasklist.do']")).click();
	}
	public void clickOnAddCustomer(WebDriver driver) {
		driver.findElement(By.xpath("//div[text()='Add New']")).click();
		
	}
}

