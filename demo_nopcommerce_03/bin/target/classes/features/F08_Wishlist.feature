@Testing
Feature: Customer can add products to their wishlist

  Scenario: Customer selects a product and clicks Add to wishlist icon

    Given Customer scrolls-down and selects a random product and clicks it

    When Customer clicks the add to wishlist icon

    Then The selected product gets added to the customer's wishlist and message appears saying The product has been added to your wishlist