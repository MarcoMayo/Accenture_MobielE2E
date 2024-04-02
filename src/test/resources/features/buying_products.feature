Feature: Use Shopping Cart

  @Buying_Products
  Scenario: Buying products at SwagLabs
    Given that Juan signed-in SwagLabs app
    When He puts in the cart the "Sauce Labs Backpack"
    And He puts in the cart the "Test.allTheThings() T-Shirt (Red)"
    And He does the checkout of his purchase
    Then He should see the message "CHECKOUT: COMPLETE!"

  @Product_Shopping_Cart
  Scenario: Adding products to the shopping cart
    Given that Juan signed-in SwagLabs app
    When He puts in the cart the "Sauce Labs Backpack"
    Then He should see the product in his shopping cart

  @Removing_Products
  Scenario: Removing products from the shopping cart
    Given that Juan signed-in SwagLabs app
    And He puts in the cart the "Sauce Labs Backpack"
    When He removes the "Sauce Labs Backpack" from his shopping cart
    Then His shopping cart should be empty


