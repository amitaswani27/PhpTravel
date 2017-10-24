package testDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class VerifyTitle {
	
	/**
	 * open_Facebook method will open the FireFox and hit the Facebook URL.
	 * 
	 * @author Amit Aswani
	 * 
	 */
	
	WebDriver driver;
		
	@Given("^Start Firefox and open Facebook$")
	public void Start_Firefox_and_open_Facebook() throws Throwable {
		
		System.setProperty("webdriver.gecko.driver", "./Resource/Drivers/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}
	
	/**
	 * Following method will enter the parameterized username and password.
	 * 
	 * And click on Login button
	 * 
	 */

	@When("^Enter valid \"([^\"]*)\" \"([^\"]*)\" and click login$")
	public void Enter_valid_username_password_and_click_login(String usern, String pass) throws Throwable {
		
		driver.findElement(By.id("email")).sendKeys(usern);
		driver.findElement(By.id("pass")).sendKeys(pass);
		driver.findElement(By.xpath("//*[@id='u_0_2']")).click();
	}

	/**
	 * logout successfully method will simply quit the application
	 * 
	 */
	
	@Then("^User should be logged out successfully$")
	public void user_should_be_logged_out_successfully() throws Throwable {
		
	   driver.quit();
	   
	   throw new PendingException();
	}
}
