Feature: Login feature

  Scenario: Login Success
    Given I open Login page
    When I enter email "courtney.matthews@testpro.io"
    And I enter password "Walkonby08!!"
    And I submit
    Then I am logged into the website