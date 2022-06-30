@Testing
Feature: Customer can click the slider wrapper

  Scenario: Customer clicks the Nokia banner on the responsive slider wrapper

    Given Customer clicks the Nokia banner controller
    When Customer clicks the Nokia banner

    Then Customer clicked the banner and got redirected to the Nokia link

  Scenario: Customer clicks the IPhone banner on the responsive slider wrapper

    Given Customer clicks the IPhone banner controller
    When Customer clicks the IPhone banner

    Then Customer clicked the banner and got redirected to the IPhone link