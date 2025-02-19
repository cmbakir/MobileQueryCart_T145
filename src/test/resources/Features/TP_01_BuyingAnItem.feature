Feature:As a user, I want to be able to buy an item on the Query Cart application


@TP_01
  Scenario: TC_01 > US01 (QCM-51), TC_01 > US04 (QCM-38), TC_01 TC_02 > US12 (QCM-18, QCM-19), TC_01 > US07 (QCM-78),TC_01 > US08 (QCM-56), TC_02 > US15 (QCM-84), TC_01 > US27 (QCM-86), TC_02 > US17 (QCM-50), TC_01 > US24 (QCM-52)
    * User makes driver adjustments
    * User confirms to be on the homepage

    * User collect all visible categories by swiping
    * User verifies that all categories displayed

    * User clicks  homepage tap coordinates 355, 2027
    * User swipe to screen coordinates 676, 2490, 676, 150
    * User verify Details, Videos, Review, Review, Shipping&Return title
    * When the user clicks on this titles, the product information should be displayed.
    * User navigates to back

    * The user verifies und enabled that the "Profile" icon is on the page.
    * User clicks the button with description "Profile"
    * User clicks the button with description "Sign Up"
    * Verifies that the Sign Up button is visible und enabled.
    * Fills out the form according to the rules.
    * The user verifies that the Success message is "Successfully"
    * Verifies that the "Sign In" button is visible.

    * User clicks the button with description "Sign In"
    * Verifies to access to the forgot password page when it clicked
    * User clicks to return back
    * Verifies to switch to the Register page from Log In Page
    * User clicks useEmailInstead
    * User clicks the emailTextBox and sendKeys Email
    * User clicks the passwordTextBox and sendKeys Password
    * Verifies checkbox is selected
    * User clicks the button "signInLoginButton"
    * Verifies visitor is loggedin Successfully

    * User clicks to category
    * User clicks the button with description "Women"
    * User verifies to be perform adding to cart, adding to favorite and view

    * User clicks the Add To Cart icon
    * User clicks the button with description "Proceed to Checkout"

    * User clicks the button with description "Add"
    * User enters new record on the address form and clicks the addAddressButton.
    * User verifies that a success message for adding appeared.

    * User selects an address for shipping.
    * User clicks the button with description "Save & Pay"

    * User verifies the "Stripe" button is viewable and clickable
    * User clicks the button with description "Confirm Order"
    * User fills card informations and clicks the confirm button
    * User verifies that getting success message for order completing
    * User verifies the "Go to order details" button is viewable and clickable
    * User verifies that order details could be appeared after click the last order history.
    * User verifies that invoice is appeared when click download receipt button.
    * Driver turns off

