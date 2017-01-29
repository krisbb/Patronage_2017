Feature:
  As a user who has an account
  I want to be able to add my new address
  So that I can see results

  Scenario: user login on account and add new address
    Given user is logged in on account
    And navigate to my account page
    When user click on my addresses button
    And click on add new address button
    And fill empty text boxes
    And click save button
    Then user should see the new added data address
