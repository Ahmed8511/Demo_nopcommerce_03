@Testing
Feature: Customer can search for any products

  Scenario: Customer searches for the desired products using product name

    Given Type "Apple" in the search text field
    When Click the SEARCH button or press the enter key

    Then Customer can find Apple products

  Scenario: Customer searches for the desired products using SKU

    Given Type "APPLE_CAM" in the search text field
    When Click the SEARCH button or press the enter key

    Then Customer found the Apple product