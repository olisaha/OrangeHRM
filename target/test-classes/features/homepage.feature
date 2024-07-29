Feature: Validating home page elements

  Scenario: Validating the Web-page Logo
    Given the user logs in using valid credentials
    Then the user validates whether the Logo of the page is present

    Scenario: Validating all the side panel elements
    Given the user logs in using valid credentials
    Then user validates wheteher 12 elements are present in the side panel
    And validates whether each side panel elements open corresponding link