Feature: To test login functionality

  Scenario Outline: Check login is successful with valid credentials
    Given User is on login page
    When User enters <username> and <password>
    And clicks on login button
    Then user is navigated to homepage

    Examples: 
      | username | password             |
      | practice | SuperSecretPassword! |
