Feature: login

  Scenario: login with valid credentials
    Given go to "https://parabank.parasoft.com/parabank/index.htm" page
    When user enters "tauser" and "123"
    Then click "LOG IN" button

  Scenario: get list of elements
    Given go to "https://demoqa.com/text-box" page
    Then print list of input elements


