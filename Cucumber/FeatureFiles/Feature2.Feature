Feature: As a user I want test login feature with multiple data sets

  Scenario Outline: To test login scenario with multiple data sets
    Given Application is up and running
    When I enter <username> and <password> on login page
    Then I should be logged in successfully

    Examples: 
      | username    | password |
      | anandbhayre | test@acv |
      | harshaljain | temp@sef |
      | abc         | test@123 |
      | efg         | test@456 |
