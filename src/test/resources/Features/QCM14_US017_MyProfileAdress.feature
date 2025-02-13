Feature: QCM-14 US017 As a registered user, I would like to have a page on the site where I can manage my address information

  Background:User logs in

    * User makes driver adjustments
    * User clicks the button with description "Profile"
    * User clicks the button with description "Sign In"
    * User clicks the button with "*Use Email Instead"
    * As a user must be "emailPinar" email and "passwordQuery" password Login

  @US17
  Scenario: QCM-49 TC_01 -> QCM-14 US017 Functionality Test for Update and Delete buttons of Address Menu.

    * User clicks the button with description "Profile"
    * User verifies the "Address" button is viewable and clickable
    * User verifies the addressEditIcon is viewable and clickable
    * User makes a change on the address form and clicks the update address button.
    * User verifies that a success message for updating appeared.
    * User verifies the addressDeleteIcon is viewable and clickable
    * User verifies that a success message for deleting appeared.
    * Driver turns off


  @US17
  Scenario: QCM-50 TC_02 -> QCM-14 US017 Testing that the new address record should be added

    * User clicks the button with description "Profile"
    * User verifies the "Address" button is viewable and clickable
    * User verifies the "Add New Address" button is viewable and clickable
    * User enters new record on the address form and clicks the addAddressButton.
    * User verifies that a success message for adding appeared.
    * Driver turns off


