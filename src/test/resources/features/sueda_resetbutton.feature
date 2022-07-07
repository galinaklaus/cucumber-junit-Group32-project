@sueda
Feature: As a user I should be able to click reset button
  Users: store manager, sales manager, truck driver

  Background:
    Given the user is on Vytrack homepage
    When the user clicks on Fleet dropdown
    Then the user clicks on Vehicles under Fleet dropdown

  Scenario: As a sales manager I should be able to see title of the page
    Then the sales manager sees title of page as "All - Car - Entities - System - Car - Entities - System"

  Scenario: As a sales manager I should be able to click Grid Settings button
    And the sales manager clicks Grid settings button
    Then the sales manager sees popup with "Grid Settings" heading

  Scenario: As a sales manager I should be able to select the Id item
    When the sales manager clicks Grid settings button
    And the sales manager should be able to select Id item checkbox
    And the sales manager clicks Grid settings button
    Then the sales manager sees Id column

  Scenario: As a sales manager I should be able to click the reset button
    And the sales manager clicks Grid settings button
    And the sales manager should be able to select Id item checkbox
    And the sales manager clicks Grid settings button
    And the sales manager sees reset button on the left side of Grid settings
    And the sales manager should be able to click reset button
    And the sales manager clicks Grid settings button
    Then the sales manager should be able to see previously selected item is unselected