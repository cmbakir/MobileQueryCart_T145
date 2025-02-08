Feature: QCM-9 US010 As a user, I would like to have a page where I can follow the latest products on the site where I shop.

  Background: User opens the app
    * User makes driver adjustments
@QCM-24
  Scenario: QCM-24 TC_01 -> QCM-9 US010  Visible testing of "Most Popular" menu title and "See All" icon on the home page navBar.
    * User confirms to be on the homepage
    * User verifies that "Most Popular" menu title on the homepage
    * User verifies that "See All" icon on the homepage
    * Driver turns off

  @QCM-25
  Scenario: QCM-25 TC_02 -> QCM-9 US010 Functional testing of "See All" icon and "back" button after clicking "see all".
    * User confirms to be on the homepage
    * User verifies the "See All" button is enabled
    * User clicks the button with description "See All"
    * User verifies that most popular items are listed when clicked the see all button
    * User verifies that the back button is enabled and navigated to homepage after clicking
    * Driver turns off

