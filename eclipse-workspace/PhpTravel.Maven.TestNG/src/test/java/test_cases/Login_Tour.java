package test_cases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import core.Core;
import web_pages.BookTour;
import web_pages.LoginPage;

/**
 * LoginSuccessfully Class will have all the test cases which is used to perform
 * all the expected steps, on Login and Tour booking details page.
 * 
 * @author Amit Aswani
 * 
 */

public class Login_Tour extends Core{
	
	@Test
	public void Login()
	{
	LoginPage Login = PageFactory.initElements(driver, LoginPage.class);	
	Login.Login();
	
	BookTour TourDetails = PageFactory.initElements(driver, BookTour.class);
	TourDetails.TourDetails();
	
	}
}
