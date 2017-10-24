Feature: Test Amazon Login Page

	Scenario: User able to login with valid credentials
	Given Start the firefox and open Amazon website
	When Enter valid "amit.aswani@Hotmail.com" and "test1234" and click login button
	Then User should be able to login successfully
	And Close the application