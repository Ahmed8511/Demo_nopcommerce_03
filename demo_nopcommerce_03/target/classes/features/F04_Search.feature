@Testing
Feature: Customer can search for any products

  Scenario: searches for the products using product name

    Given type product name in the search text field
    When click the search button

    Then product found with name

  Scenario: Customer searches for the desired products using SKU

    Given type product SKU in the search text field
    When click the search button

    Then product found with sku