@api
Feature: API Testing

  Scenario: Get List of Users
    Given API: send "GET" request to "https://reqres.in/api/users?page=2"
    Then API: response status code should be 200
    And API: match "data[0].id" == "7"

  Scenario: Create User
    Given API: raw body
      """
      {
      "name": "morpheus",
      "job": "leader"
      }
      """
    When API: send "POST" request to "https://reqres.in/api/users"
    Then API: response status code should be 201
    And API: match "name" == "morpheus"
    And API: match "job" == "leader"


  Scenario: Update User
    Given API: raw body
      """
      {
      "name": "morpheus",
      "job": "zion resident"
      }
      """
    When API: send "PUT" request to "https://reqres.in/api/users/2"
    Then API: response status code should be 200
    And API: match "name" == "morpheus"
    And API: match "job" == "zion resident"

  Scenario: Update User using PATCH
    Given API: raw body
      """
      {
      "name": "Bastian",
      "job": "zion resident"
      }
      """
    When API: send "PATCH" request to "https://reqres.in/api/users/2"
    Then API: response status code should be 200
    And API: match "name" == "Bastian"
    And API: match "job" == "zion resident"


  Scenario: Delete User
    When API: send "DELETE" request to "https://reqres.in/api/users/2"
    Then API: response status code should be 204


