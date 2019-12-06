package com.mercury.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.merqury.qa.base.MerquryTestBase;
import com.merqury.qa.pages.HomePage;
import com.merqury.qa.pages.LoginPage;
import com.merqury.qa.util.MerquryTestUtil;

public class LoginPageTest extends MerquryTestBase { 
	
	public LoginPage loginPage;
	public HomePage  homePage;

	public LoginPageTest()
	{
		super();
	}
	
	@BeforeMethod 
	public void SetUp() throws Exception {
		System.out.println("Driver="+driver);  
		initialization();
		loginPage =new LoginPage();  
	}
	@Test(priority=1)
	public void LoginPageTitleTest() {
		String title=loginPage.validateLoginPageTitle();
		Assert.assertEquals(title,"Welcome: Mercury Tours");
		MerquryTestUtil.CapturScreenShot();
		MerquryTestUtil.ExtendReport();
	}
	
	@Test(priority=2)
	public void MerquryLogoTest()
	{
		boolean flag=loginPage.validateMerquryLogo();
		Assert.assertTrue(flag);
		MerquryTestUtil.CapturScreenShot();
		MerquryTestUtil.ExtendReport();
	}
	
	@Test(priority=3)
	public void loginTest()
	{
		homePage=loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
	}
	
	
	
	
	
	
	
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
	}
	

}
