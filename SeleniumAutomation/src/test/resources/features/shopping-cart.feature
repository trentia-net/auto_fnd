Feature: Add product to shopping cart

  Scenario the user select a product and add it to the shopping cart
    Given the user is on the home page
    And the user opens a product on the home page
    When the user adds the product to the cart
    Then the eCommerce has the product added on the shopping cart