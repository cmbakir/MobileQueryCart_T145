
Feature: QCM30-US025 As a registered user, I would like to have a page about the orders I want to return and be able to manage my product returns.

  Background: User opens the app
    * User makes driver adjustments
    * User confirms to be on the homepage
    * User clicks the button with description "Profile"
    * User clicks the button with description "Sign In"
    * User clicks the button with "*Use Email Instead"
    * As a user must be "registeredEmail" email and "registeredPassword" password Login
@ozlem
  Scenario: QCM47 TC_01 -> US025 Return Request Button Visibility on Order History Page, Add Return Reason, Note, Attachment and Return Process Started

    Given Manager is on the Dashboard page and accept order
    And Returns to the Query Cart app as the user
    Given User clicks the button with description "Profile"
    When User clicks the button with description "Order History"
    Then The "Order History" title should be displayed
    And User clicks on the first order in the list
    And User scroll down the screen
    And User clicks the button with description Return Request
    Then The Order ID title should be displayed
    Given User is on the "Request Return" page and should be selected product
    When User enters a reason for the return in the "Return Reason" field
    And User enters a note in the "Return Note" field
    And User attaches a document or photo in the "Attachment" field
    And User clicks "Request Return" button
    Then User should be redirected to the Return Orders page
    And the Return Orders page should show a notification or status indicating that the return process has started
    And Driver turns off