package web_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

/**
 * FlightFinder class refers to the Flight Finder/Details page of Mercury site
 * This class includes elements and actions in the form 
 * of method which can be taken at Flight Finder page.  
 *
 */

public class FlightFinder {
	
	WebDriver driver;
	public FlightFinder (WebDriver driver)
	{
		this.driver = driver;
	}

	@FindBy(xpath = "//input[@value='oneway']")
	WebElement Oneway;
	
	@FindBy(name = "fromPort")
	WebElement Departure;
	
	@FindBy(name = "toPort")
	WebElement Arrival;
	
	@FindBy(xpath="//input[@value='First']")
	WebElement ServiceClass;
	
	@FindBy(name = "findFlights")
	WebElement Continue;
	
	@FindBy(name = "reserveFlights")
	WebElement DepartContinue;
	
	/**
	 * SelectFlightDetails method will select all the required details and click on Continue
	 * and also it will click continue button on Select Flight page
	 * 
	 * @return CategoryPage.class
	 */

	public void SelectFlightDetails()
	{
		Oneway.click();
		
		Select Depart = new Select(Departure);
		Depart.selectByVisibleText("Sydney");
		
		Select Arrival1 = new Select(Arrival);
		Arrival1.selectByVisibleText("London");
		
		ServiceClass.click();
		
		Continue.click();
		
		DepartContinue.click();
	}
	
}
