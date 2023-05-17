Feature: Register user automation exercise

  Scenario: User registration
    Given the user is on the home page
    And the user goes to the login page
    When the user completes the name "Name" and email "test4@test-caixa.com" on the sign up section
    And the user goes to the sign up page
    And the user fills the profile form
    And the user clicks on the create account button
    Then the ecommerce should be show the register confirmation page
