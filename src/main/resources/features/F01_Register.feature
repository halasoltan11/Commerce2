@smoke
Feature: F01_Register | users could register with new accounts
  Scenario: guest user could register with valid data successfully
 Given user go to register page
    When user select gender type
    And  user enter first name "automation" and "tester"
    When user enter date of birth
    And  user enter email "testh9@example.com"
    When user fills Password fields
    And user clicks on register button
  Then  success message is displayed

