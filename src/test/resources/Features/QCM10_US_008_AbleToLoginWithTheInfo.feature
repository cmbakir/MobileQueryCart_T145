Feature: QCM8 US001 As a registered user, I would like to be able to log in with the information I registered with (email/phone and password).
  Background: User opens the app
    * User makes driver adjustments
  @08
  Scenario: QCM56 TC_01 -> US008 The user should be able to see the elements on the sign in page and log in with the relevant information.
    * User confirms to be on the homepage
    * User clicks the button with description "Profile"
    * User clicks the button with description "Sign In"
    * Verifies checkbox is selected
    * Verifies to access to the forgot password page when it clicked
    * Verifies to switch to the Register page from Log In Page
    * User clicks the nameTextBox and sendKeys Name
    * User clicks the emailTextBox and sendKeys Email
    * User clicks the passwordTextBox and sendKeys Password
    * User clicks the button SignUp
    * Driver turns off




