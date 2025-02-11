Feature: QCM-15 US024 As a registered user, I want to have a payment page where I can pay for my orders that I control.

@pin
  Scenario Outline: QCM-52 TC_01 -> QCM-15 US024 Testing of Stripe Payment Method On the Payment Information page
    * User makes driver adjustments
    * User clicks the button with description "Profile"
    * User clicks the button with description "Sign In"
    * User logs in with the valid "<email>" and "<password>"
    * User adds an item to shopping card and goes to the shopping card.
    * User clicks the button with description "Proceed to Checkout"
    * User selects an address for shipping.
    * User clicks the button with description "Save & Pay"
    * User clicks the confirm order button without selected payment method, then an error message should be appeared.
    * User verifies the "Stripe" button is viewable and clickable
    * User clicks the button with description "Confirm Order"


  Examples:
    |email                   |password    |
    |pinar.user@querycart.com|Query.250203|

  @pin
  Scenario: QCM-53 TC_02 -> QCM-15 US024 Testing that card information form could be filled and payment could be made

    * User fills card informations and clicks the confirm button
    * User verifies that getting success message for order completing

  @pin
  Scenario: QCM-54 TC_03 -> QCM-15 US024  Testing that order completion message should be displayed

   * User verifies the Thank you for your order! Your order is confirmed. message is displayed.

  @pin
  Scenario: QCM-55 TC_04 -> QCM-15 US024  Testing that order details and invoice should be viewable and shopping must be resumed

    * User verifies the "Go to order details" button is viewable and clickable
    * User verifies that order details could be appeared after click the last order history.
    * User verifies that invoice is appeared when click download receipt button.
    * User navigates to back
    * User verifies the "Go to shopping" button is viewable and clickable
    * User confirms to be on the homepage
    * Driver turns off