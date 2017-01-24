Feature: login


  Scenario: login as correct username and password
    Given I navigate to the login page
    And I enter the following for Login
      |username|password|
      |admin   |adminpasssword|

    And I click login button
    Then I should see the userform page


