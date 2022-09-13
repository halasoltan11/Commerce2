@smoke
  Feature: F03 | Change Currency to EURO and apply for all products
    Scenario: Select Euro currency from the  list on the top left of home page
      When  user select EURO from list
      Then  All produucts soould be displayed with Euro Symbol
