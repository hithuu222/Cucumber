Feature: To test search field functionality
  I want to use this template for my feature file

  Scenario Outline: Validate google search is working
    Given browser is open
    And user is on google search page
   	When user enter text in searchbox
   	And clicks on enter
    Then user is navigated to search page
