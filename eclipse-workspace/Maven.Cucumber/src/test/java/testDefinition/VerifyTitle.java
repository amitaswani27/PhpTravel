package testDefinition;

import java.util.concurrent.TimeUnit;

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
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}

	@When("^Enter valid \"([^\"]*)\" \"([^\"]*)\" and click login$")
	public void Enter_valid_username_password_and_clic_login(String usern, String pass) throws Throwable {
		
		driver.findElement(By.id("email")).sendKeys(usern);
		driver.findElement(By.id("pass")).sendKeys(pass);
		driver.findElement(By.xpath("//*[@id='u_0_2']")).click();
	}

	@Then("^User should be logged out successfully$")
	public void User_should_be_logged_in_successfully() throws Throwable {
		
		driver.quit();
			}

}
