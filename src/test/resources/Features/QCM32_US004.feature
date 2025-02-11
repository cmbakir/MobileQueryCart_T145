Feature: QCM-32 US004 As a user, I want to be able to see the categories under the categories heading on the homepage and select the product from the category I want.

  Background: User opens the app
    * User makes driver adjustments

  @categories
  Scenario: QCM-38 TC_01 -> US004 Verification of Category Visibility on the Homepage
    * User confirms to be on the homepage
    * User collect all visible categories by swiping
    * User verifies that all categories displayed
    * Driver turns off