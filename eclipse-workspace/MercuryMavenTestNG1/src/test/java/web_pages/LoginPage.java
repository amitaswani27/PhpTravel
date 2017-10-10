package web_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.CommonDriver;

/**
 * LoginPage class refers to the Login page of Mercury site
 * 
 */

public class LoginPage {
	
	WebDriver driver;
	public LoginPage (WebDriver driver)
	{
		this.driver = driver;
	}

	@FindBy(name="userName")
	WebElement UserName;
	
	@FindBy(name="password")
	WebElement Password;
	
	@FindBy(name="login")
	WebElement Login;
	
	/**
	 * Login method will enter login credentials and click Login 
	 * 
	 */

	public void Login()
	{
		String username = CommonDriver.getProperties("username");
		String password = CommonDriver.getProperties("password");
		
		UserName.sendKeys(username);
		
		Password.sendKeys(password);
		
		Login.click();
	}
}
