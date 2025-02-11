Feature: QCM12 US015 As a registered user, I would like to be able to see the categories and products of the Women menu on the home page.
  Background: User opens the app
    * User makes driver adjustments

  Scenario: QCM58 TC_01 -> US015 The user should be able to see Women category window and subcategories in the body section.
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

  @15
  Scenario: QCM84 TC_02 -> US015 The user should be able to see Women category window and subcategories in the body section.
    * User confirms to be on the homepage
    * User clicks the button with description "Profile"
    * User clicks the button with description "Sign In"
    * User clicks useEmailInstead
    * User clicks the emailTextBox and sendKeys Email
    * User clicks the passwordTextBox and sendKeys Password
    * User clicks the button "signInLoginButton"
    * User clicks to category
    * User clicks the button with description "Women"
    * User verify to be perform add to cart, add to favorite and view



    * Driver turns off




