Feature: As a registered user, I would like to have a page on the site where I can select and manage my address information before completing the payment.

  Background: User opens the app
    * User makes driver adjustments

  Scenario: QCM20 [TC_01 -> US_019] Registered user test to edit and add address
            QCM21 [TC_02 -> US_019] Registered user test to delete address

     #Registered user should enter the application
    * User confirms to be on the homepage
    * User clicks the button with description "Profile"
    * User clicks the button with description "Sign In"
    * User clicks the button with description "*Use Email Instead"
    * User clicks the email button "phoneTextBox" and sendKeys "caner.user@querycart.com"
    * User clicks the button "signInLoginButton"
      #user click product
    * User clicks tap coordinates 334, 2062
        #user choose size
    * User clicks the button with description "M"
    * User swipe to screen coordinates 676, 2490, 676, 355
    * User clicks the button with description "Add To Cart"
    * User clicks shopping bag
    #The product has been successfully added to Addcart
    * User verifies to open shopping cart page
    * the user takes a "android.widget.ScrollView" screenshot of that the yellow circle is identified in the shopping bag when the product is selected
    * User clicks the button with description "Proceed to Checkout"
    * User verifies to open shipping information
    * User verify Delivery,pickup title
    * User display address information
    * User should be able to select a different address as billing address
    * User change address information
    * User add new adress
    * User delete adress
    * User should be redirected to the page where they can redeem the discount coupon
    * User clicks tap coordinates 650, 1300
    * The order fee summary should be displayed under the Order Summary heading.
    * User swipe to screen coordinates 676, 2490, 676, 355
    * User verify Save & Pay button
    * User goes to pickup page
    * User verify Save & Pay button











