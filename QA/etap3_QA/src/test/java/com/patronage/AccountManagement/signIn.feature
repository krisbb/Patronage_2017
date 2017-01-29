Feature:
  As a user who has an account
  I want to be able to sign in on my account
  So that I can see welcome information

  Scenario: user want to login on account from the main page
    Given user is on main page
    When user click on sign in button
    And fill correctly email and password

#      |         email            | password |
#      | gajek.krzysiek@gmail.com | tester   |

    And click submit sign in
    Then user should see welcome information