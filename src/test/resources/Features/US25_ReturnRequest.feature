
Feature: As a registered user, I would like to have a page about the orders I want to return and be able to manage my product returns.

  Background: User opens the app
    * User makes driver adjustments
    * User confirms to be on the homepage
    * User clicks the button with description "Profile"
    * User clicks the button with description "Sign In"
    * User enters "phoneNumber" and "password" and clicks on the “Sign In” button.

  Scenario: Return Request Button Visibility on Order History Page
    Given User is on the Dashboard page
    When User clicks on the Order History section
    And User selects a delivered order
    Then the "Return Request" button should be visible and active

  Scenario: Add Return Reason, Note, Attachment and Return Process Started
    Given User is on the "Request Return" page with a selected product
    When User enters a reason for the return in the "Reason for Return" field
    And User enters a note in the "Note" field
    And User attaches a document or photo in the "Attachment" field
    And User clicks the "Request Return" button
    Then User should be redirected to the Return Orders page
    And the Return Orders page should show a notification or status indicating that the return process has started
    And Driver turns off

