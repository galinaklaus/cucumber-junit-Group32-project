@vytrack_resfresh_btn @B26G32-60 @B26G32-61
Feature: Vytrack app Refresh button feature

  User story:As a user when I am on Vytrack => Fleet => Vehicles, I should be able to see Export Grid dropdown, Refresh, Reset and Grid Settings Buttons

  Accounts are: truck driver, store manager, sales manager

  Background:
    Given the user is on Vytrack homepage
    When the user clicks on Fleet dropdown
    Then the user clicks on Vehicles under fleet dropdown

  @vehicles_page_truck_driver
  Scenario: Truck driver is able to access Vehicles page

    Then the truck driver sees the title of the page "Car - Entities - System - Car - Entities - System"

  @refresh_button_truck_driver
  Scenario: Truck driver is able to click Refresh button
    When the driver sees Refresh button on the left side of Reset button
    Then the truck driver should be able to click Refresh button
    And the truck driver should see refreshing element is present on the page

