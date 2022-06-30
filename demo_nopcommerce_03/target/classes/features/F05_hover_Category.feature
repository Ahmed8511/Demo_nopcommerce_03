@Testing
Feature: choose different categories and sub-categories

  Scenario: hover over the menu and clicks a random category then hovers over and clicks a sub-category if found

    Given hovers over the menu and click a random category
    When clicks a random sub-category

    Then sub-category page loaded