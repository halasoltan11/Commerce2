@smoke
Feature: F02_Login | users could use login functionality to use their accounts
  #TestScenario1
  Scenario: user could login with valid email and password
  Given user go to login page
  When user login "testh9@example.com" and "P@ssw0rd"
  And user press on login button
  Then  user login to the system successfully

    #TestScenario2
  Scenario: user could login with invalid email and password
    Given user go to login page
    When user login "wrong@example.com" and "P@ssw0rd"
    And user press on login button
    Then  user could not login to the system
