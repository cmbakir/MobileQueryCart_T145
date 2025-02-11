Feature: QCM-31 US002 As a user, I would like to have easy links in the bottom bar of the home page so that I can easily perform internal site operations.

  Background: User opens the app
    * User makes driver adjustments

  @quick
  Scenario: QCM-37 TC_01 -> US002 Visibility testing of Easy Links on the home page
    * User verifies the "Home" button is displayed
    * User verifies the "Category" button is displayed
    * User verifies the Cart button is displayed
    * User verifies the "Wishlist" button is displayed
    * User verifies the "Profile" button is displayed
    * Driver turns off

  @quick
  Scenario: QCM-75 TC_02 -> US002 Functional testing of Easy Links on the home page
    * User logs in
    * User clicks the button with description "Home"
    * User verifies that the Home Page has been accessed
    * User clicks the button with description "Category"
    * User verifies that Categories is displayed
    * User clicks the Cart button
    * User verifies that the cart is displayed
    * User clicks the button with description "Wishlist"
    * User verifies that Wishlist is displayed
    * User clicks the button with description "Profile"
    * User verifies that the Profile is displayed
    * Driver turns off

  @quick
  Scenario: QCM-76 TC_03 -> US002 Visibility and Functional testing of Search Box on the home page
    * User verifies the Search Box button is displayed
    * User clicks the Search Box button
    * User verifies that "Search" text is visible
    * User sends send keys "Nike"
    * User verifies that "Search Results" text is visible
    * Driver turns off