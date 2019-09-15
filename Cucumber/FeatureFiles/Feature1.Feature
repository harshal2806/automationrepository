Feature: As user I want to test login feature

  Scenario: To test Loginscenario with valid credentials
    Given Application is up and running
    When I enter valid credentials
    Then I should be logged in successfully
