

Feature: User should be able to click reset Grid Settings Button

  @sm
  Scenario:As a store manager I should be able to click Grid Settings button
    Given User is on VyTrack homepage
    And User clicks on Fleet
    And User clicks on Vehicles under Fleet dropdown
    And the Store manager is on Vehicle page
    When the Store manager sees Grid Settings is on the right side of the Reset button and on the right side of the page
    Then the Store manager should be able to click Grid Settings button

    @zm
    Scenario: As sales manager I should be able to click Grid Settings Button
      Given User is on VyTrack homepage
      And User clicks on Fleet
      And User clicks on Vehicles under Fleet dropdown
      And the Sales Manager is on Vehicle page
      When the Sales Manager sees Grid Settings is on the right side of the Reset button and on the right side of the page
      Then the Sales Manager manager should be able to click Grid Settings button
