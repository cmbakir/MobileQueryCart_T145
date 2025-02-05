@2
Feature: US_11 WishList

  Background: User opens the app
    * User makes driver adjustments

  Scenario:  Test to select favorite products and add to wishlist
    * User clicks the button with description "Profile"
    * User clicks the button with description "Sign In"
    * As a user muss be "phoneNumber" phone and "password" password Login
    * User clicks the button with itemName "Flower Print Foil T-shirt" and "0 (0  Reviews)" and "$65.00" added WishList
    * Toaster is displayed
    * Driver turns off

  Scenario: Change Password
    * User clicks the button with description "Profile"
    * User clicks the button with description "Sign In"
    * As a user muss be "phoneNumber" phone and "password" password Login
    * User clicks the button with description "Profile"
    * User clicks the button with description "Change Password"
     # * Old Password new Password and Confirm Password
@Add
  Scenario: Produkte add to card
    * User clicks the button with description "Profile"
    * User clicks the button with description "Sign In"
    * As a user muss be "phoneNumber" phone and "password" password Login
    * User clicks tap coordinates 313, 2408
    * User clicks tap coordinates 433, 2397
    * User swipe to screen coordinates 643, 2499, 660, 1537
    * User clicks tap coordinates 455, 1867
    * User clicks tap coordinates 1207, 2710

  @3
  Scenario: Test display of categories on screen
    *  User clicks the button with description "Categories"
    *  User confirms that categories appear on the screen
    *  Driver turns off

  @FP
  Scenario: Forgot Password Test
    *  User clicks the button with description "Profile"
    * User clicks the button with description "Sign In"
    * User clicks the button with description "Forgot Password"
    * Verifies username "Forgot Password" in dashboard
    * Verifies username "Back to sign in" in dashboard
    * User clicks phone number textbox and "6505551212" phone number
    * User clicks the button with description "Get OTP"
   # * Verifies username "The User verify is successfully." in dashboard
    * User clicks NewPasswordTextBox and confirmPasswordTextBox "Wise.123"
    *  User clicks the button with description "Submit"
    * User clicks the button with description "Profile"
    * Verifies username "oske" in dashboard
    * Driver turns off


