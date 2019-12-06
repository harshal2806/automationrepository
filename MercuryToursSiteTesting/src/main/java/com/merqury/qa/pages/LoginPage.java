package com.merqury.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.merqury.qa.base.MerquryTestBase;

public class LoginPage extends MerquryTestBase{
	
	//Page Factory OR-Object Repository
	@FindBy(xpath="//input[@name='userName']")
	WebElement username;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement password;
	
	@FindBy(xpath="//input[@name='login']")
	WebElement loginbtn;
	
	@FindBy(xpath="//img[@src='/images/nav/logo.gif']")
	WebElement Logo;
	
	//Initializing the page objects
	public LoginPage()
	{
		PageFactory.initElements(driver, this); 
	}
	//Actions
	public String validateLoginPageTitle()
	{
		return driver.getTitle();
	}
	
	public boolean validateMerquryLogo()//if logo available it return true,otherwise false
	{
		return Logo.isDisplayed();
	}
	
	public HomePage login(String uname,String pwd)
	{
		username.sendKeys(uname);
		password.sendKeys(pwd);
		loginbtn.click();
		
		return new HomePage();
		
	}
	

}
