
@Wip
Feature: As a User I should be able to click reset button

  Users: store manager, sales manager truck driver

  Background:
    Given User is on VyTrack homepage
    And User clicks on Fleet
    And User clicks on Vehicles under Fleet dropdown

  Scenario: User see the title of the page

    Then User see title of page

  Scenario: User should be able to click Grid settings

    And User click Grid setting
    Then User see section with "Grid Settings" heading

  Scenario: User should be able to select Id from grid setting

    When User click Grid setting
    And User click on Id from checkbox
    And  User click Grid setting
    Then User see id checkbox is selected

  Scenario: User is able to do reset

    When User click Grid setting
    And User click on Id from checkbox
    Then User see id checkbox is selected
    And  User click Grid setting
    And  User sees Reset button is on the left side of Grid settings
    When User click the reset button
    Then User see id checkbox is unselected