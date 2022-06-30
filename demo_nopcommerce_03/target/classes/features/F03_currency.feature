@Testing
Feature: Customer can switch between currencies

  Scenario: switch between US and Euro

    Given check products currency
    When switch the currency

    Then found the currency