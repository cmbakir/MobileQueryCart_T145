Feature: QCM-14 US017 As a registered user, I would like to have a page on the site where I can manage my address information

  Background: User opens the app
    * User makes driver adjustments
  @2
  Scenario Outline: QCM-49 TC_01 -> QCM-14 US017 Functionality Test for Update and Delete buttons of Address Menu.
    * User confirms to be on the homepage
    * User clicks the button with description "Profile"
    * User clicks the button with description "Sign In"
    * User logs in with the valid "<email>" and "<password>"
    * User clicks the button with description "Profile"
    * User verifies the addressElement button is viewable and clickable
    * User verifies the addressEditButton button is viewable and clickable
    * User makes a change on the address form and clicks the update address button.
    * User verifies that a success message appeared.
    * User verifies the addressDeleteButton button is viewable and clickable

    * Driver turns off

    Examples:
      |email                   |password    |
      |pinar.user@querycart.com|Query.250203|





  Scenario: QCM-50 TC_02 -> QCM-14 US017 Testing that the new address record should be added
