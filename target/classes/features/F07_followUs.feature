@smoke
  Feature: User can follow the site using FB, Twitter , rss and youtube
    Scenario: User opens facebook link
    When User opens facebook link
    Then "https://www.facebook.com/nopCommerce" is opened in new tab

    Scenario: User opens twitter link
      When User opens twitter link
      Then Twitter is opened in new tab

    Scenario: User opens rss link
      When User opens rss link
      Then RSS is opened in new tab

    Scenario: user opens youtube link
      When User opens youtube link
      Then YouTube is opened in new tab