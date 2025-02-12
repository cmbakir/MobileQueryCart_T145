Feature: QCM-15 US024 As a registered user, I want to have a payment page where I can pay for my orders that I control.

Background:User logs in and add an item to the shopping cart

  * User makes driver adjustments
  * User clicks the button with description "Profile"
  * User clicks the button with description "Sign In"
  * User clicks the button with "*Use Email Instead"
  * As a user must be "emailPinar" email and "passwordQuery" password Login
  * User adds an item to shopping card and goes to the shopping card.
  * User clicks the button with description "Proceed to Checkout"
  * User selects an address for shipping.
  * User clicks the button with description "Save & Pay"

@US24
  Scenario: QCM-52 TC_01 -> QCM-15 US024 Testing that card information form of Stripe Payment Method could be filled and payment could be made

  * User clicks the confirm order button without selected payment method, then an error message should be appeared.
  * User verifies the "Stripe" button is viewable and clickable
  * User clicks the button with description "Confirm Order"
  * User fills card informations and clicks the confirm button
  * User verifies that getting success message for order completing
  * User verifies the "Go to order details" button is viewable and clickable
  * User verifies that order details could be appeared after click the last order history.
  * User verifies that invoice is appeared when click download receipt button.
  * Driver turns off



  Scenario: QCM-53 TC_02 -> QCM-15 US024 Testing that shopping must be resumed after completing the order.

    * User clicks the confirm order button without selected payment method, then an error message should be appeared.
    * User verifies the "Stripe" button is viewable and clickable
    * User clicks the button with description "Confirm Order"
    * User fills card informations and clicks the confirm button
    * User verifies that getting success message for order completing
    * User verifies the "Go to shopping" button is viewable and clickable
    * User confirms to be on the homepage
    * Driver turns off



