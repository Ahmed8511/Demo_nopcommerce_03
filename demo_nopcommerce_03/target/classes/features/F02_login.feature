@Testing
Feature: login with valid credentials

  Scenario: logs in with valid credentials

    Given click login button
    When enter email and password
    And click login

    Then logged in successfully