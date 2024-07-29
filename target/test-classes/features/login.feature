Feature: Validating log-in page

  Scenario Outline: Succesfull log-in scenario
    Given user is on the login page
    When user gives  username and password with excel row "<row>"
    And clicks on the login button
    Then user validates whether login was successsfull

    Examples: 
      | row |
      |   1 |
      |   2 |
      |   3 |
