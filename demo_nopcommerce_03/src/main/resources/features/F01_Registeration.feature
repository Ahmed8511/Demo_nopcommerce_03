@Testing
Feature: register with valid data
  Scenario: user enter valid data

    Given click on the Register tab

    And chose gender
    And enter first name and last name
    And select date of birth
    And enter email

    And enter company name

    And enter password
    And click on register button

    Then registered successfully