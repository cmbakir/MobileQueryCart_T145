Feature: QCM29-US018 View and manage shopping history in the Dashboard

  As a registered user, I would like to have a page in my Dashboard where I can view my shopping history

  Background: User opens the app
    * User makes driver adjustments
    * User confirms to be on the homepage
    * User clicks the button with description "Profile"
    * User clicks the button with description "Sign In"
    * User clicks the button with "*Use Email Instead"
    * As a user must be "registeredEmail" email and "registeredPassword" password Login

  Scenario:  QCM46 TC_01 -> US018 Access and interact with the Order History page

    Given User clicks the button with description "Profile"
    When User clicks the button with description "Order History"
    Then The "Order History" title should be displayed
    And User clicks on the first order in the list
    And User scroll down the screen
    And User clicks the button with description "Download Receipt"
    Then The "QueryCart - Shop Smarter, Live Better" title should be displayed
    Then User returns to previous page
    Then User clicks the button with description "Cancel Order"
    Then User should see an "Order Canceled Successfully!" message on the popup page.
    And Driver turns off