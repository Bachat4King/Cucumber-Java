Feature: TestProject: login test project

  Scenario: TestProject: login
    Given go to "https://example.testproject.io/web/"
    When TestProject: enter username "username"
    And TestProject: enter password "12345"
    Then TestProject: click button login
