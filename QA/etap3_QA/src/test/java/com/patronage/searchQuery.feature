Feature:
  As a user
  I want to be able to search some products on page
  So that I can see search results

  Scenario: Search for product on page
    Given user is on start page
    When user provide search phrase
    Then user should see search results