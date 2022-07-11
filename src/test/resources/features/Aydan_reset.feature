@B26G32-90 @B26G32-89
Feature: As a Truck driver I should be able to click reset button

  Users: store manager, sales manager truck driver

  Background:
    Given the user is on VyTrack homepage
    And the user clicks on Fleet
    And the user clicks on Vehicles under Fleet dropdown

  Scenario: Truck driver see the title of the page "Car-Entities-System-Car-Entities-System"

    Then Truck driver see title of page as "Car - Entities - System - Car - Entities - System"

 Scenario: Truck driver should be able to click Grid settings


   And Truck driver click Grid setting

   Then Truck driver see section with "Grid Settings" heading

  Scenario: Truck driver should be able to select Id from grid setting

    When Truck driver click Grid setting
    And Truck driver click on Id from checkbox
    And  Truck driver click Grid setting
    Then  Truck driver see Id checkbox is selected

  Scenario: Truck driver is able to do reset
    When Truck driver sees reset on the left side of the Grid setting
    When Truck driver click Grid setting
    And  Truck driver click on Id from checkbox
    And  Truck driver click Grid setting
    When Truck driver clicks the reset button
    Then  Truck driver see Id checkbox is unselected
