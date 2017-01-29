Feature:
  As a user who has an account
  I want to be able to buy product from the offer on the page
  and pay with chosen method
  So that I can see results

  Scenario: user is logged in ,he/she choose product and add this to cart and want to but them
    Given User is loged in on account
    When user click on the chosen product
    And click on button add to cart
    And click on button proceed to checkout
    And submit button proceed to checkout in Summary
    And fill all address information
    And with chosen address submit button proceed to checkout
    And agree with terms of service afterwards click button proceed to checkout
    And user choose payment method
    And confirm order
    Then user should see results