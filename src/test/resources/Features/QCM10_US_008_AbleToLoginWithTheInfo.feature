Feature: QCM8 US001 As a registered user, I would like to be able to log in with the information I registered with (email/phone and password).
  Background: User opens the app
    * User makes driver adjustments
  @08
  Scenario: QCM56 TC_01 -> US008 The user should be able to see the elements on the sign in page and log in with the relevant information.
    * User confirms to be on the homepage
    * User clicks the button with description "Profile"
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
    * Driver turns off

  @09
  Scenario: QCM57 TC_02 -> US008 The user should be able to see the elements on the sign in page and log in with the relevant information.
    * User confirms to be on the homepage
    * User clicks the button with description "Profile"
    * User clicks the button with description "Sign In"
    * User clicks useEmailInstead
    * User clicks the emailTextBox and sendKeys Email
    * User clicks the passwordTextBox and sendKeys invalidPassword
    * User clicks the button "signInLoginButton"
    * Verifies visitor is login not Successfully
    * Driver turns off



