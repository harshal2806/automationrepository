package com.merqury.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.merqury.qa.base.MerquryTestBase;

public class HomePage extends MerquryTestBase {
	
	@FindBy(xpath="//input[@value='roundtrip']")
	WebElement TourType;
	
	@FindBy(xpath="//select[@name='passCount']")
	WebElement NoOfPassenger;
	
	@FindBy(xpath="//select[@name='fromPort']")
	WebElement DepartingFrom;
	
	@FindBy(xpath="//input[@name='findFlights']")
	WebElement FlighFinderBtn;
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String validateHomePageTitle()
	{
		return driver.getTitle(); 
	}
	
	public void selectTourType()
	{
		TourType.click();
	}
	public void SelectNoOfPassenger(String num)
	{
		Select sel=new Select(NoOfPassenger);
		sel.selectByVisibleText(num);
	}
	
	public void selectDepartureFrom(String City)
	{
		Select sel1=new Select(DepartingFrom);
		sel1.selectByVisibleText(City);
	}
	
	public FlightListPage NevigateToFlightListPage()
	{
		FlighFinderBtn.click();
		return new FlightListPage();
	}
	
	
	
	
	
	

}
