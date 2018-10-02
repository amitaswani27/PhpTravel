Selenium automation-framework
The TestNG automation framework guidance for the http://www.phptravels.net/


- Create a new Maven project 


1. pom.xml file
Get the required dependencies from: https://mvnrepository.com
Add the following dependencies-
Selenium, TestNG


2. Create a basic Maven - testng framework structure
Create a new Maven Project. Add all the relevant dependencies as aforementioned.

3. The Webdrivers
Get the firefox driver:
You can download geckdriver from here: https://github.com/mozilla/geckodriver/releases
Similary, download chrome driver from here: http://chromedriver.chromium.org/

set up the driver on the Browser page, import the org.openqa.selenium.WebDriver;
So, every page has a WebDriver object called (for simplicity we can call it driver).

4. The Core - (To run before and after test suite, and initiate browser)
Core will help to run the required test suite with the help of TestNG such as 

	@BeforeSuite
	public void openbrowser()

	public void initBrowser()

	@AfterSuite
	public void closebrowser()

5. Create Utilities package:
Browsers: Inside this, all browser settings which is required to open a browser will be done.
CommonDriver: For reading the property files input data will be done in this class.

6. The Web pages
All the elements for all the used pages will be store in this package and will be easily fetched and used in the test cases.

7. Test Cases
All the test cases will be setup in this package to execute appropriately. As in the current project, both Login and Tour booking test cases are written inside this and well executed with the help of TestNG.

8. Test Output
A TestNG report will be generated and saved under the test-output folder which will show all the pass and failed test cases status.

