Feature: topmenu
  As a user I want to check top menu tab options on Homepage

  Background: I am on homepage

  @sanity @smoke @regression
  Scenario: User should navigate to desktop page successfully
    When I mouse hover and click on desktop tab
    And I select menu "Show AllDesktops"
    Then I should navigate to desktop page successfully

  @smoke @regression
  Scenario: User should navigate to laptop and notebook page successfully
    When I mouse hover and click on laptop and notebook tab
    And I select menu "Show AllLaptops & Notebooks"
    Then I should navigate to laptop and notebook page successfully

  @regression
  Scenario: User should navigate to component page successfully
    When I mouse hover and click on component tab
    And I select menu "Show AllComponents"
    Then I should navigate to component page successfully