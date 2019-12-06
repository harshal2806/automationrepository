package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.page.HomePage;
import com.crm.qa.page.LoginPage;

public class LoginPageTest extends TestBase {
	LoginPage loginPage;
	HomePage homepage;
	
	public LoginPageTest() {
		super();
	}
	@BeforeMethod
	public void setup()
	{
		initialization();
		loginPage=new LoginPage();
	}
	@Test
	public void validateLoginPageTest()
	{
		String Title=loginPage.validateLoginPageTitle();
		Assert.assertEquals(Title, "<title>Free CRM #1 cloud software for any business large or small");
	}
	@Test
	public void CRMlogoTest() {
		boolean flag=loginPage.validateCRMimage();
		Assert.assertTrue(flag);
	}
	@Test
	public void loginTest() {
		homepage=loginPage.login(prop.getProperty("username"),"password");
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
		
	}

}
