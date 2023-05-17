Feature: Login in the the eCommerce automation exercise

  Scenario: Login with a wrong user
    Given the user is on the home page
    And the user goes to the login page
    When the user logs in with email "test@test-caixa.com" and password "1234567"
    Then the ecommerce should be show an error message: "Your email or password is incorrect!"

  Scenario: Login with a valid user
    Given the user is on the home page
    And the user goes to the login page
    When the user logs in with email "test2@test-caixa.com" and password "12345678"
    Then the ecommerce should show the logout link on the top bar

