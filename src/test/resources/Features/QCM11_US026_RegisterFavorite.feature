Feature: As a registered user, I want to have a favorite products page on the site and I want to be able to manage this page.


  Background: User opens the app
    * User makes driver adjustments

  Scenario:QCM22 [TC_01 -> US_026] Test for the registered user to mark the product as a favorite
           QCM23 [TC_02 -> US_026] Wishlist page usage test

     #Registered user should enter the application
    * User confirms to be on the homepage
    * User clicks the button with description "Profile"
    * User clicks the button with description "Sign In"
    * User clicks the button with description "*Use Email Instead"
    * User clicks the email button "phoneTextBox" and sendKeys "caner.user@querycart.com"
    * User clicks the button "signInLoginButton"
     #Registered user should mark a product as a favorite
    * the user takes a "android.widget.ScrollView" screenshot of the element they want to take a screenshot of
    * On the page that opens, click on the white heart sign in the upper right corner of the products.
    #Registered user see white heart changes to red heart
    * the user takes a "android.widget.ScrollView" screenshot of the element they want to take a screenshot of
     #Registered user can view and remove the product they have marked as a Wishlist favorite
    * User clicks the button with description "Wishlist"
    * User see Wishlist title and wishlist item quantity
    #remove
    * On the page that opens, click on the red heart sign in the upper right corner of the products.
    * User see Wishlist title and wishlist item quantity when wishlist is empty












