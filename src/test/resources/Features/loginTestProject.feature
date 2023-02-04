Feature: TestProject: login test project

  Background: go to testProject website
    Given go to "https://example.testproject.io/web/"

  Scenario: TestProject: login
    When TestProject: enter username "username"
    And TestProject: enter password "12345"
    Then TestProject: click button login
