Feature: Feature to test google search functionality

  Scenario: Validate google search is working
    Given Browser is open
    And user is on google serach page
    When user enters the text in search box
    And hits enter
    Then user is navigates to search results
