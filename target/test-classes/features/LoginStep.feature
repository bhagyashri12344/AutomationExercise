Feature: Swag Labs Login
 
Scenario: Successful Login with valid credentials
    Given I am on the Swag Labs login page
    When I enter valid username and password
    And I click on the login button
    Then I should be redirected to the inventory page
 
  Scenario: Unsuccessful Login with invalid credentials
    Given I am on the Swag Labs login page
    When I enter invalid username and password
    And I click on the login button
    Then I should see an error message
