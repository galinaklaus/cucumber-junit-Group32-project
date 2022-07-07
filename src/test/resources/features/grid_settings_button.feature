
  Feature: VyTrack Grid Settings Button

    @vehicles_page
    Scenario: Sales Manager is able to aces Vehicle page
      Given the Sales Manager is on Vytrack homepage
      When the Sales Manager clicks on Fleet dropdown
      Then the Sales Manager clicks on Vehicles under fleet dropdown
    @grid_reset
      Scenario: Sales Manager is able to click on Grid Reset Button
        Given the Sales Manager is on Vehicle page
        When the Sales Manager sees Grid Settings is on the right side of the Reset button and on the right side of the page
        Then the Sales Manager should be able to click Grid Settings button