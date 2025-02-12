Feature: QCM13 US022 As a registered user, I want to be able to log out of the system securely.
  Background: User opens the app
    * User makes driver adjustments

  Scenario: QCM59 TC_01 -> US022 User Logout test
    * User confirms to be on the homepage
    * User clicks the button with description "Profile"
    * User clicks the button with description "Sign In"
    * User clicks useEmailInstead
    * User clicks the emailTextBox and sendKeys Email
    * User clicks the passwordTextBox and sendKeys Password
    * User clicks the button "signInLoginButton"
    * User clicks to category
    * Verifies Women in SubCategory
    * User clicks to subCategoryForWomen
    * User verify to have subCategoryOfWomen
    * Driver turns off
