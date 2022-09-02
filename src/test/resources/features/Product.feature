
Feature: Test to product feature
  Background:
    Given User navigates to url

  Scenario:To test product function
    When User clicks on Products button
    Then Users sees ALL PRODUCTS page successfully
    When User enters product name in search input and click search button
    When Verify 'SEARCHED PRODUCTS' is visible

    Scenario:to test add product function
      When User hovers over first product and click Add to cart
      And  User clicks Continue Shopping button
      When User hovers over second product and click Add to cart
      And User  clicks 'View Cart' button
      Then User sees both products are added to Cart
      Then User sees their prices, quantity and total price