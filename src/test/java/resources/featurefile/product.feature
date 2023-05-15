@regression @sanity
Feature: Product Test
  As user I want to verify that six products are displayed on page


  Scenario: User should be able to verify six products are displayed on page
    Given I am on homepage
    When I enter username "standard_user"
    And I enter password "secret_sauce"
    And I click on login button
    Then I should login successfully
    And I should be able to verify that six products are displayed on page