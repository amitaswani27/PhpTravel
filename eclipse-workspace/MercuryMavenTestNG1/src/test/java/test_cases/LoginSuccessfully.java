package test_cases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import core.Core;
import web_pages.FlightFinder;
import web_pages.LoginPage;

/**
 * LoginSuccessfully Class will have all the test cases which is used to perform
 * all the expected 10 steps, on Login, Flight details and Personal details page.
 * 
 * @author Amit Aswani
 * 
 */

public class LoginSuccessfully extends Core{
	
	@Test
	public void Login()
	{
	LoginPage Login = PageFactory.initElements(driver, LoginPage.class);	
	Login.Login();
	
	FlightFinder FlightDetails = PageFactory.initElements(driver, FlightFinder.class);
	FlightDetails.SelectFlightDetails();
	
	}
}
