Feature: Navigation over sport category

  Scenario: Check navigation between sport articles and see more page
    Given page "https://pl.canalplus.com/blog" is loaded
    When first article under sport category is clicked
    And user goes back and click see more under sport category
    Then page "https://pl.canalplus.com/blog/artykuly/sport" with all sport articles shows
