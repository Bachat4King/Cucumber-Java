Feature: DemoBlaze Website

  Background: go to the home page
    Given go to "https://www.demoblaze.com/index.html"

  Scenario: go to cart page
    Given DemoBlaze: select "Cart" from the navigation bar
    And wait 2 seconds