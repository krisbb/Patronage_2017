Feature:
  As a user who has an account
  I want to be able to change/update personal description
  So that I can see changed/updated description

  Scenario: user login and change the personal description
    Given user is loged in on account
    When user click on the my personal information button
    And fill textboxes
    And click save/update button
    Then user should see message that description is changed