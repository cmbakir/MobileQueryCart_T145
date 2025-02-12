Feature: QCM-36 US016 As a registered user, I would like to have a dedicated dashboard page on the site to check my actions and settings on the site.

  Background: User opens the app
    * User makes driver adjustments

  @dashboard
  Scenario: QCM-40 TC_01 -> US016 Verification of Profile Icon, Dashboard Navigation, and My Account Information
    * User logs in
    * User clicks the button with description "Profile"
    * User verifies that "My Account" text is visible
    * User clicks the button with description "My Account"
    * User verifies the "Total Orders" text is visible
    * User verifies the "Total Completed" text is visible
    * User verifies the "Total Returnd" text is visible
    * User verifies the "Wallet Balance" text is visible
    * User goes back
    * User clicks the button with description "Order History"
    * User verifies that "Order History" text is visible
    * Driver turns off