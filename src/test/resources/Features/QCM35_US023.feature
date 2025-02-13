Feature: QCM-35 US023 As a user, I want to create a favorite list with the products I like without registering.

  Background: User opens the app
    * User makes driver adjustments


    Scenario: QCM-41 TC_01 -> US023 Verification of Sign-In Requirement for Saving Products to Favorites
      * User clicks the button with itemName "Flower Print Foil T-shirt" and "0 (0  Reviews)" and "$65.00" added WishList
      * User verifies the "Sign in to continue shopping" text is visible
      * User logs in with email
      * User clicks the button with itemName "Flower Print Foil T-shirt" and "0 (0  Reviews)" and "$65.00" added WishList
      * Toaster is displayed
      * User Verifies the visibility and functionality of the "Wishlist" button
      * Driver turns off

  @wishlist
    Scenario: QCM-42 TC_02 -> US023 Verification of Sign-Up Requirement for Saving Products to Favorites
      * User clicks the button with itemName "Flower Print Foil T-shirt" and "0 (0  Reviews)" and "$65.00" added WishList
      * User verifies the "Sign in to continue shopping" text is visible
      * User registers
      * User clicks the button with itemName "Flower Print Foil T-shirt" and "0 (0  Reviews)" and "$65.00" added WishList
      * Toaster is displayed
      * User Verifies the visibility and functionality of the "Wishlist" button
      * Driver turns off
