package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestScenarios {
	
	WebDriver driver;
	@Given("^Start the firefox and open Amazon website$")
	public void Start_the_firefox_and_open_Amazon_website() throws Throwable {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Amit\\Desktop\\Selenium\\Selenium\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");	  
	}

	@When("^Enter valid \"([^\"]*)\" and \"([^\"]*)\" and click login button$")
	public void Enter_valid_and_and_click_login_button(String username, String password) throws Throwable {
	  
		driver.findElement(By.name("email")).sendKeys(username);
		driver.findElement(By.name("pass")).sendKeys(password);
		driver.findElement(By.id("u_0_2")).click();
		
	}

	@Then("^User should be able to login successfully$")
	public void User_should_be_able_to_login_successfully() throws Throwable {
		
		System.out.println("User has been logged in successfully");
	   
	}

	@Then("^Close the application$")
	public void Close_the_application() throws Throwable {
	
		driver.quit();
	}

}
