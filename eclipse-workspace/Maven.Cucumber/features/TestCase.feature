Feature: Test Facebook smoke test

  Scenario Outline: Test login functionality with valid credentials
    Given Start Firefox and open Facebook
    When Enter valid "<username>" "<password>" and clic login
    Then User should be logged in successfully

    Examples: 
      | username                | password  |
      | amit.aswani@hotmail.com | Lata1234$ |
      | amit.aswani@hotmail.com | Lata1234$ |
      | amit.aswani@hotmail.com | Lata1234$ |
