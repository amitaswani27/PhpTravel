package testDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class VerifyTitle {
	
	WebDriver driver;
		
	@Given("^Start Firefox and open Facebook$")
	public void Start_Firefox_and_open_Facebook() throws Throwable {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Amit\\Desktop\\Selenium\\Selenium\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
	}

	@When("^Enter valid \"([^\"]*)\" \"([^\"]*)\" and clic login$")
	public void Enter_valid_username_password_and_clic_login(String usern, String pass) throws Throwable {
		
		driver.findElement(By.id("email")).sendKeys(usern);
		driver.findElement(By.id("pass")).sendKeys(pass);
		driver.findElement(By.id("u_0_2")).click();
	}

	@Then("^User should be logged in successfully$")
	public void User_should_be_logged_in_successfully() throws Throwable {
		
		String actualTitle = driver.getTitle();
		System.out.println("Actual Title is: " + actualTitle);
		System.out.println("Logged in successfully");
		driver.quit();
			}

}
