@Testing
Feature: customer can register with valid data
  Scenario: customer registers with valid data

    Given Customer clicks the Register tab

    When Customer clicks any radio button to choose gender
    And Customer enters their First name and Last name
    And Customer selects their Date of Birth: Select [Day, Month, Year]
    And Customer enters their email: "tester@autooo.com"

    And Customer fills in the Company name

    And Customer enters their Password and Confirm it: "P@ssw00rd"
    And Customer clicks the REGISTER button

    Then Customer registered successfully
    And Customer clicked the CONTINUE button