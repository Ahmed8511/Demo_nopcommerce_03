@Testing
Feature: Customer can log in with valid credentials

  Scenario: Customer logs in with valid credentials

    Given Customer clicks the Login tab
    When Customer enters "tester@autooo.com" and "P@ssw00rd"
    And Customer clicks the login button

    Then Customer logged in successfully