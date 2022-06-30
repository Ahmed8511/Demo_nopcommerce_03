@Testing
Feature: Follow us links open

  Scenario: click the follow us icons

    When click the facebook icon
    And click the twitter icon
    And click the youtube icon
    And click the rss icon


    Then all links opens