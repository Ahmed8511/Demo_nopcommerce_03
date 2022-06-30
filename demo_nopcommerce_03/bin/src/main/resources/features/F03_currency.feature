@Testing
Feature: Customer can switch between currencies [US-Euro]

  Scenario: Customer switches between US and Euro

    Given Customer checks and finds products currency
    When Customer switches the currency

    Then Customer found the desired currency