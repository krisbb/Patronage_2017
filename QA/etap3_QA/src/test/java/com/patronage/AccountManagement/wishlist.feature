Feature:
  As a user who has an account
  I want to be able to make my wishlists with products i'm interesting in
  So that I can see created wishlist with products which I chose

  Scenario: user want to add some products to wishlist
    Given user is logged in
    When user click on the product
    And user click on the add to wishlist button
    Then user should see message
