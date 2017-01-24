Feature: login
  Scenario: login as correct username and password
    Given I navigate to the login page
    And I enter the username as admin and passwrod
    And I click login button
    Then I should see the userform page


