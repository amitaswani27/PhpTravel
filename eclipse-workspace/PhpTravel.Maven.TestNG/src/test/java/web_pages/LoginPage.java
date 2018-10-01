package web_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.CommonDriver;

/**
 * LoginPage class refers to the Login page of PhpTravel web site
 * 
 */

public class LoginPage {
	
	WebDriver driver;
	public LoginPage (WebDriver driver)
	{
		this.driver = driver;
	}
	
	@FindBy(xpath="//*[@id='loginfrm']/div[2]/div[1]/a")
	WebElement SignUp;
	
	@FindBy(name="firstname")
	WebElement FirstName;
	
	@FindBy(name="lastname")
	WebElement LastName;
	
	@FindBy(name="phone")
	WebElement MobileNumber;
	
	@FindBy(name="email")
	WebElement Email;
	
	@FindBy(name="password")
	WebElement Password;
	
	@FindBy(name="confirmpassword")
	WebElement ConfirmPassword;
	
	@FindBy(xpath="//*[@id='headersignupform']/div[9]/button")
	WebElement SignUpF;
	
	@FindBy(name="username")
	WebElement UserName;
	
	@FindBy(name="password")
	WebElement LogPassword;
	
	@FindBy(xpath="//*[@id='loginfrm']/button")
	WebElement Login;
	
	@FindBy(xpath="//*[@id='loginfrm']/div[1]/div[2]/div")
	WebElement ValidationMsg;
	
	
	/**
	 * Login method will enter login credentials and click Login 
	 * 
	 */

	public void Login()
	{
		
		String firstName = CommonDriver.getProperties("FirstName");
		String lastName = CommonDriver.getProperties("LastName");
		String mobileNumber = CommonDriver.getProperties("MobileNumber");
		String email = CommonDriver.getProperties("Email");
		String Fpassword = CommonDriver.getProperties("Password");
		String confirmPassword = CommonDriver.getProperties("ConfirmPassword");
		String userName = CommonDriver.getProperties("UserName");
		String logPassword = CommonDriver.getProperties("LogPassword");
		
		UserName.sendKeys(userName);
		
		LogPassword.sendKeys(logPassword);
				
		Login.click();
		
		/**
		 * Application forgets the login credentials in sometime,  
		 * Hence, boolean present method is checking the invalid credentials error message and signing up again if required
		 * 
		 */
	
		boolean present;
		try {
		   driver.findElement(By.xpath("//*[@id='loginfrm']/div[1]/div[2]/div"));
		   present = true;
		   System.out.println("Need to signup first");
			
			SignUp.click();
			
			FirstName.sendKeys(firstName);
			
			LastName.sendKeys(lastName);
					
			MobileNumber.sendKeys(mobileNumber);
					
			Email.sendKeys(email);
					
			Password.sendKeys(Fpassword);
					
			ConfirmPassword.sendKeys(confirmPassword);
					
			SignUpF.click();
		  
		} catch (NoSuchElementException e) {
		   present = false;
		   
			System.out.println("Loggedin Successfully");
		}
	}
	}

