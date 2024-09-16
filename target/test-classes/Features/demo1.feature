Feature: Test login functionality
  I want to use this template for my feature file

  Scenario Outline: Check login is successful with valid credentials
    Given user is on login page
    When user enters <email> and <password>
    And clicks on login button
    Then user is navigated to home page

    Examples: 
      | email              | password  | status  |
      | Hitha123@gmail.com | Hitha@123 | success |
    	| YTYT@gmail         | fvhjfh7   | Fail    |
