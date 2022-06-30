@Testing
Feature: Follow us hyper-links open the equivalent URLs

  Scenario: Customer scrolls down to the bottom of the page and clicks the follow us icons/hyper-links

    Given Customer scrolls-down to the bottom of the page
    When Customer clicks the facebook icon
    And Customer clicks the twitter icon
    And Customer clicks the rss icon
    And Customer clicks the youtube icon

    Then Customer opened the facebook page
    And Customer opened the twitter page
    And Customer opened the rss page
    And Customer opened the youtube page