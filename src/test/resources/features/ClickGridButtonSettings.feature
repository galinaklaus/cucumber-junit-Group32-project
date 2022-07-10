@B26G32-83
Feature: User should be able to click reset Grid Settings Button

  @zm @B26G32-81
  Scenario: As sales manager I should be able to click Grid Settings Button
    Given User is on VyTrack homepage
    And User clicks on Fleet
    And User clicks on Vehicles under Fleet dropdown
    And the Sales Manager is on Vehicle page
    When the Sales Manager sees Grid Settings is on the right side of the Reset button and on the right side of the page
    Then the Sales Manager manager should be able to click Grid Settings button
    And the Sales Manager sees "NAME" , "SORT" and "SHOW"