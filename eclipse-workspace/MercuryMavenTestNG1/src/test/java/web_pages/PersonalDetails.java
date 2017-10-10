package web_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.CommonDriver;

/**
 * PersonalDetails class refers to the Personal Details page of Mercury site
 * This class includes elements and actions in the form 
 * of method which can be taken at Personal Details page  
 * 
 */

public class PersonalDetails {
	
	WebDriver driver;
	public PersonalDetails (WebDriver driver)
	{
		this.driver = driver;
	}
	
	@FindBy(name = "passFirst0")
	WebElement FirstName;
	
	@FindBy(name = "passLast0")
	WebElement LastName; 
	
	@FindBy(name = "creditnumber")
	WebElement CreditcardNumber;
	
	@FindBy(name = "ticketLess")
	WebElement SelectTicketLess;
	
	@FindBy(name = "buyFlights")
	WebElement SecurePurchase;
	
	 /**
	 * PersonalDet method will fill all the required personal details 
	 * 
	 * and click on Secure Purchase button
	 */

	public void PersonalDet()
	{
		String Fname = CommonDriver.getProperties("FirstName");
		FirstName.sendKeys(Fname);
		
		String Lname = CommonDriver.getProperties("LastName");
		LastName.sendKeys(Lname);
		
		String CCNumber = CommonDriver.getProperties("CreditCardNumber");
		
		CreditcardNumber.sendKeys(CCNumber);
		
		SelectTicketLess.click();
		
		SecurePurchase.click(); 
		
	}
}
