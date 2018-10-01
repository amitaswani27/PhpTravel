package web_pages;


import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.CommonDriver;

/**
 * BookTour class refers to the Tour Details for the PhpTravel website
 * This class includes elements and actions in the form 
 * of method which can be taken at Book Tour page.  
 *
 */

public class BookTour {
	
	WebDriver driver;
	
	public BookTour (WebDriver driver)
	{
		this.driver = driver;
	}

	@FindBy(xpath = "//*[@id='collapse']/ul[1]/li[1]/a") 
	WebElement Home;
	
	@FindBy(xpath = "//*[@id='body-section']/section/div[2]/div/div/div[2]/ul/li[3]/a")
	WebElement Tours;
	
	@FindBy(xpath = "//*[@id='s2id_autogen10']/a/span[1]")
	WebElement FromCity;
	
	@FindBy(xpath = "//*[@id='select2-drop']/div/input")
	WebElement inputcity;
	
	@FindBy(xpath="//*[@id='select2-drop']/ul/li/ul/li/div")
	WebElement autosuggFrom;
	
	@FindBy(xpath="//*[@id='TOURS']/form/div[5]/button")
	WebElement TourSearch;
	
	@FindBy(xpath="//*[@id='body-section']/div[3]/div[2]/div[2]/div/form/div[4]/button")
	WebElement Book;
	
	@FindBy(name="passport[1][name]")
	WebElement GuestName1;
	
	@FindBy(name="passport[1][passportnumber]")
	WebElement GuestPass1;
	
	@FindBy(name="passport[1][age]")
	WebElement GuestAge1;
	
	@FindBy(name="passport[2][name]")
	WebElement GuestName2;
	
	@FindBy(name="passport[2][passportnumber]")
	WebElement GuestPass2;
	
	@FindBy(name="passport[2][age]")
	WebElement GuestAge2;
	
	@FindBy(name="logged")
	WebElement Confirmbooking;
	
	@FindBy(xpath="//*[@id='invoiceTable']/tbody/tr[2]/td/div[1]/table/tbody/tr/td/div[3]")
	WebElement Invoice;
	
	
	/**
	 * TourDetails method will select all the required details and click on Continue
	 * and also it will click continue button on Book Tour page
	 * 
	 * @return CategoryPage.class
	 */

	public void TourDetails()
	{
		
		String InputFromCity = CommonDriver.getProperties("InputFromCity");
		String guestname1 = CommonDriver.getProperties("GuestName1");
		String guestpass1 = CommonDriver.getProperties("GuestPass1");
		String guestage1 = CommonDriver.getProperties("GuestAge1");
		String guestname2 = CommonDriver.getProperties("GuestName2");
		String guestpass2 = CommonDriver.getProperties("GuestPass2");
		String guestage2 = CommonDriver.getProperties("GuestAge2");
		
		Home.click();
		
		Home.click();
		
		Tours.click();
		
		Tours.click();
		
		FromCity.click();
		
		inputcity.sendKeys(InputFromCity);

		autosuggFrom.click();
		
		TourSearch.click();
		
		Book.click();
		
		GuestName1.sendKeys(guestname1);
	    
	    GuestPass1.sendKeys(guestpass1);
	    
	    GuestAge1.sendKeys(guestage1);
	    
	    GuestName2.sendKeys(guestname2);
	    
	    GuestPass2.sendKeys(guestpass2);
	    
	    GuestAge2.sendKeys(guestage2);
	    
	    Confirmbooking.click();
	    
		/**
		 * boolean present method will verify whether the booking confirmation Invoice is captured or not
		 * 
		 */
	    
	    boolean present;
		try {
		   driver.findElement(By.xpath("//*[@id='invoiceTable']/tbody/tr[2]/td/div[1]/table/tbody/tr/td/div[3]"));
		   present = true;
		   System.out.println("Booking has been confirmed");
			
				  
		} catch (NoSuchElementException e) {
		   present = false;
		   
			System.out.println("Booking has not confirmed");
		}
		
	}
	
}
