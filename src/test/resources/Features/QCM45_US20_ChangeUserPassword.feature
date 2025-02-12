Feature: [US_020]As a registered user, I want to change my password on my dashboard page

  Background: User opens the app
    * User makes driver adjustments

  Scenario: Change Password link should be visible and active on the Dashboard page


    * User confirms to be on the homepage
    * User clicks the button with description "Profile"
    * User clicks the button with description "Sign In"
    * User clicks the button with description "*Use Email Instead"
    * User clicks the email button "phoneTextBox" and sendKeys "hakan.user@querycart.com" with that password "Query.250203"
    * User clicks the button "signInLoginButton"
    * User clicks the button with description "Profile"
    * User see Change Password title and click.
    * User see Old password, New password, Confirm password title.
    * User see Old password, New password, Confirm password boxes
    * User change password "Query.250203" to "Query.250204" successfully with use boxes.




