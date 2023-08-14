
Feature: add products
  As a user I want to enter Falabella and add a product to the cart

  @busquedaExitosa
  Scenario: add product to cart
    Given the user opens the web page and searches for a product in the search field
    When the user selects a product randomly and adds it to the cart
    Then the user will see a message that their product is in the cart
