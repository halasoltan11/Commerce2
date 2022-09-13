@smoke
Feature: F04 | User will search for products with different parameters
  Scenario Outline: User will search for products with Name
    When User clicks on  search field
    And  Search with "<ProductName>"
    Then User could find "<ProductName>" relative results
    Examples:
      |ProductName|
      |book|
      |laptop|
      |nike|

  Scenario Outline: User will search for products with SKU
    When User clicks on  search field
    And  Search with "<SKU>"
    Then User could find "<SKU>" product details page
    Examples:
      |SKU|
      |SCI_FAITH|
      |APPLE_CAM|
      |SF_PRO_11|