package com.mercury.qa.testcases;

import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.merqury.qa.base.MerquryTestBase;
import com.merqury.qa.pages.FlightListPage;
import com.merqury.qa.pages.HomePage;
import com.merqury.qa.pages.LoginPage;
import com.merqury.qa.util.MerquryTestUtil;

public class HomePageTest extends MerquryTestBase {
	
	LoginPage loginPage;
	HomePage  homePage;
	FlightListPage flightListPage;
	
	public HomePageTest()
	{
		super();
	}
	@BeforeMethod 
	public void SetUp() throws Exception {
		System.out.println("Driver="+driver); 
		initialization();
		loginPage =new LoginPage(); 
		homePage=loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
		
	}
	@Test
	public void validateHomePageTitleTest()
	{
		String HomepageTiele=homePage.validateHomePageTitle();
		Assert.assertEquals(HomepageTiele, "Find a Flight: Mercury Tours: ");
		MerquryTestUtil.CapturScreenShot();
		MerquryTestUtil.ExtendReport();
	}
	@Test
	public void SelectNoOfPassengerTest()
	{
		homePage.SelectNoOfPassenger(prop.getProperty("NoOfPassenger")); 
		MerquryTestUtil.CapturScreenShot();
		MerquryTestUtil.ExtendReport();
	}
	@Test
	public void SelectCityOfDepertureTest()
	{
		homePage.selectDepartureFrom(prop.getProperty("CityOfDeparture"));
		MerquryTestUtil.CapturScreenShot();
		MerquryTestUtil.ExtendReport();
	}
	@Test
	public void NevigteToFlightListPageTest()
	{
		flightListPage=homePage.NevigateToFlightListPage();
		MerquryTestUtil.CapturScreenShot();
		MerquryTestUtil.ExtendReport();
		
	}
	
	@AfterMethod
	public static void tearDown() {
		MerquryTestUtil.CapturScreenShot();
		MerquryTestUtil.ExtendReport();
		driver.quit();
	}

}
