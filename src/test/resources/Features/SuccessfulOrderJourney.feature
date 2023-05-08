Feature: Successful order journey

  Background:User is on online store home page - Spraystore
    Given User navigate to login page
    Then User enter username and password
    Then User is logged in

  Scenario: Validate that order is successfully placed
    Given User navigates to hand bag category
    Then User adds two item
    Then User click on checkout

