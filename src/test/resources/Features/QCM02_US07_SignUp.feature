

Feature: QCM2 US_007 As a user, I would like to be able to register on the site to take advantage of its functions

  Background: User opens the app
    * User makes driver adjustments

  Scenario: TC_01 -> US_007 I should be able to register with my phone number

    * The user verifies und enabled that the "Profile" icon is on the page.
    * User clicks the button with description "Profile"
    * User clicks the button with description "Sign Up"
    * Verifies that the Sign Up button is visible und enabled.
    * Fills out the form according to the rules.
    * The user verifies that the Success message is "Successfully"
    * Verifies that the "Sign In" button is visible.

  Scenario: TC_02 -> US_007 I need to verify that the (Firstname, Email or Phone, Password) in the SignUp form cannot be left blank.
    * User clicks the button with description "Profile"
    * User clicks the button with description "Sign Up"
    * User enters phone number.
    * user enters password that they want to use.
    * user clicks on sign up login button.
    * user confirms that This field is required text is visible.
    * user clicks on back button.
    * User clicks the button with description "Sign Up"
    * user enters username.
    * user enters password that they want to use.
    * user clicks on sign up login button.
    * user confirms that This field is required text is visible.
    * user clicks on back button.
    * User clicks the button with description "Sign Up"
    * user enters username.
    * User enters phone number.
    * user clicks on sign up login button.
    * User Verifies that Password is required text appears
    * user clicks on back button.
    * User clicks the button with description "Sign Up"
    * The user clicks on the use email instead text on the sigUp form.
    * user enters username.
    * user enters password that they want to use.
    * user clicks on sign up login button.
    * The user confirms that the Email is required text appears.

  Scenario: TC_03 -> US_007 I should be able to register with my user email address.
    * User clicks the button with description "Profile"
    * User clicks the button with description "Sign Up"
    * The user clicks on the use email instead text on the sigUp form.
    * As a user, enters the necessary information on the Form.
    * user clicks on sign up login button.
    * The user verifies that the Success message is "Successfully"
  Scenario: TC_04 -> US_007 user should not register without entering valid Email criteria and at least 7 digit phone number.
    * User clicks the button with description "Profile"
    * User clicks the button with description "Sign Up"
    * user enters username.
    * user enters a phone number of less than 7 digits.
    * user enters password that they want to use.
    * user clicks on sign up login button.
    * user confirms receiving error message.
    * user clicks on back button.
    * User clicks the button with description "Sign Up"
    * The user clicks on the use email instead text on the sigUp form.
    * user enters username.
    * user enters an Email that does not meet the Email criteria.

