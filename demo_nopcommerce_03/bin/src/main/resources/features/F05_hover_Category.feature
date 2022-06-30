@Testing
Feature: Customer can choose different categories and sub-categories

  Scenario: Customer hovers over the header-menu and clicks a random category then hovers over and clicks a sub-category if found

    Given Customer hovers over the header-menu and clicks a random category then hovers over it
    When Customer clicks a random sub-category if found

    Then Customer opened a sub-category page