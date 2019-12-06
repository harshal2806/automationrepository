package com.crm.qa.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactoryFinder;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	//page factory /OR- obect repositiry
	
	@FindBy(name="username")
	WebElement usename;
	
	@FindBy(name="password")
	WebElement password;
	@FindBy(name="logo")
	WebElement CRMlogo;
	@FindBy(xpath="//a[@class='btn btn-primary btn-xs-2 btn-shadow btn-rect btn-icon btn-icon-left']")
	WebElement login;
	


//itializing thw page objects
public LoginPage()
{
	PageFactory.initElements(driver,this);//this= current class object-all above variables intialize with driveri 
}                                         //instede of this u can use this.loginpage

//actons

public String validateLoginPageTitle()
{
	return driver.getTitle();
}
public boolean validateCRMimage() {
	return CRMlogo.isDisplayed();
	
}
public HomePage login(String un, String pwd) {
	usename.sendKeys(un);
	password.sendKeys(pwd);
	login.click();
	return new HomePage();
	
}



}