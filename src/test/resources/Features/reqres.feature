@api
Feature: api testing using reqres

  Scenario: list users
    Given API: send "GET" request to "https://reqres.in/api/users?page=2"
    Then API: response status code should be 200

