Feature: QCM13 US022 As a registered user, I want to be able to log out of the system securely.
  Background: User opens the app
    * User makes driver adjustments

    @022
  Scenario: QCM59 TC_01 -> US022 User Logout test
    * User confirms to be on the homepage
    * Verifies the visibility of the Profile menu
    * User clicks the button with description "Profile"
    * User clicks the button with description "Sign In"
    * User clicks useEmailInstead
    * User clicks the emailTextBox and sendKeys Email
    * User clicks the passwordTextBox and sendKeys Password
    * User clicks the button "signInLoginButton"
    * User clicks the button with description "Profile"
    * Verifies the visibility of the Logout menu
    * Verifies user is loggedout Successfully
    * Driver turns off
