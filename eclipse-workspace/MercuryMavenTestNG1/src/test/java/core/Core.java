package core;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import utilities.Browser;
import utilities.CommonDriver;

/**
 * 
 * Core class will be considered as the core of framework
 * which will initialize the browser in the beginning and close it at the end.
 *
 */

public class Core {

	/**
	* openbrowser method initialises browser
	* 
	*/

	public WebDriver driver;
	
	@BeforeSuite
	public void openbrowser()
	{
		String BrowserName = CommonDriver.getProperties("browser");
		driver = Browser.get(BrowserName);
		driver.get(CommonDriver.getProperties("URL"));
		initBrowser();
	}
	
	public void initBrowser()
	{
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	/**
	 * closebrowser method will be called at the last 
	 * which will close browser windows and quit the driver session.
	 * 
	 */

	@AfterSuite
	public void closebrowser() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.close();
		driver.quit();
	}
}
