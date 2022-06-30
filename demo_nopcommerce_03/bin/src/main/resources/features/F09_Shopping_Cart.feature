@Testing
Feature: Customer can add products to cart

  Scenario: Customer selects a product and clicks the ADD TO CART button

    Given Customer scrolls-down and selects a random product and clicks it
    When Customer clicks the ADD TO CART button

    Then The selected product gets added to the customer's shopping cart and s message appears saying The product has been added to your shopping cart