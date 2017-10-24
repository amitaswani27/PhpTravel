Feature: Test Facebook smoke test

  Scenario Outline: Test login functionality with valid credentials
    Given Start Firefox and open Facebook
    When Enter valid "<username>" "<password>" and click login
    Then User should be logged out successfully

    Examples: 
      | username          | password |
      | Test1@hotmail.com | 1234$    |
      | Test2@hotmail.com | 1234$    |
      | Test3@hotmail.com | 1234$    |
