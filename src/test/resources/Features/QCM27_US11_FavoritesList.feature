Feature: QCM27-US011 As a registered user, I would like to be able to create a favorites list on the site

  Background: User opens the app
    * User makes driver adjustments

  Scenario: QCM43 TC_01 -> US011 Wishlist button should be visible and active on the homepage navbar
    Given User clicks the button with description "Profile"
    When User clicks the button with description "Sign In"
    Then User clicks the button with "*Use Email Instead"
    Then As a user must be "registeredEmail" email and "registeredPassword" password Login
    Then User Verifies the visibility and functionality of the "Wishlist" button
    And Driver turns off

  Scenario: QCM44 TC_02 -> US011 Test to select favorite products and add to wishlist
    Given User clicks the button with description "Profile"
    When User clicks the button with description "Sign In"
    Then User clicks the button with " *Use Email Instead"
    Then As a user must be "registeredEmail" email and "registeredPassword" password Login
    Then User clicks the button with itemName "Flower Print Foil T-shirt" and "0 (0  Reviews)" and "$65.00" added WishList
    Then Toaster is displayed
    And Driver turns off
