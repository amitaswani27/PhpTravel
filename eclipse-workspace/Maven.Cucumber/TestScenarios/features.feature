Feature: Test Amazon Login Page

	Scenario: User able to login with valid credentials
	Given Start Firefox and open PhpTravel
	When Enter valid user name and password and click login button
	Then User should be able to login successfully
	And Close the application