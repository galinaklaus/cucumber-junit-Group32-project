@Resetbutton
Feature: As a user I should be able to click reset button
  Users: store manager, sales manager, truck driver

  Background:
    Given the user is on Vytrack homepage
    When the user clicks on Fleet dropdown
    Then the user clicks on Vehicles under Fleet dropdown

  @sales_manager_reset_button @B26G32-68 @B26G32-77
  Scenario: As a sales manager I should be able to see title of the page
    Then the sales manager sees title of page as "All - Car - Entities - System - Car - Entities - System"

  Scenario: As a sales manager I should be able to click Grid Settings button
    And the sales manager clicks Grid settings button
    Then the sales manager sees popup with "Grid Settings" heading

  Scenario: As a sales manager I should be able to select the Id item
    When the sales manager clicks Grid settings button
    And the sales manager should be able to select Id item checkbox
    And the sales manager clicks Grid settings button
    Then the sales manager sees Id checkbox is selected

  Scenario: As a sales manager I should be able to click the reset button
    And the sales manager clicks Grid settings button
    And the sales manager should be able to select Id item checkbox
    And the sales manager clicks Grid settings button
    And the sales manager sees reset button on the left side of Grid settings
    And the sales manager should be able to click reset button
    And the sales manager clicks Grid settings button
    Then the sales manager sees Id checkbox is unselected

  @store_manager_reset_button @B26G32-78 @B26G32-79
  Scenario: As a store manager I should be able to see title of the page
    Then the store manager sees title of page as "All - Car - Entities - System - Car - Entities - System"

  Scenario: As a store manager I should be able to click Grid Settings button
    And the store manager clicks Grid settings button
    Then the store manager sees popup with "Grid Settings" heading

  Scenario: As a store manager I should be able to select the Id item
    When the store manager clicks Grid settings button
    And the store manager should be able to select Id item checkbox
    And the store manager clicks Grid settings button
    Then the store manager sees Id checkbox is selected

  Scenario: As a store manager I should be able to click the reset button
    And the store manager clicks Grid settings button
    And the store manager should be able to select Id item checkbox
    And the store manager clicks Grid settings button
    And the store manager sees reset button on the left side of Grid settings
    And the store manager should be able to click reset button
    And the store manager clicks Grid settings button
    Then the store manager sees Id checkbox is unselected

  @truck_driver_reset_button @B26G32-89 @B26G32-90
  Scenario: As a truck driver I should be able to see title of the page
    Then the truck driver sees title of page as "Car - Entities - System - Car - Entities - System"

  Scenario: As a truck driver I should be able to click Grid Settings button
    And the truck driver clicks Grid settings button
    Then the truck driver sees popup with "Grid Settings" heading

  Scenario: As a truck driver I should be able to select the Id item
    When the truck driver clicks Grid settings button
    And the truck driver should be able to select Id item checkbox
    And the truck driver clicks Grid settings button
    Then the truck driver sees Id checkbox is selected

  Scenario: As a truck driver I should be able to click the reset button
    And the truck driver clicks Grid settings button
    And the truck driver should be able to select Id item checkbox
    And the truck driver clicks Grid settings button
    And the truck driver sees reset button on the left side of Grid settings
    And the truck driver should be able to click reset button
    And the truck driver clicks Grid settings button
    Then the truck driver sees Id checkbox is unselected
