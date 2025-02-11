Feature: QCM-33 US009 As a user, I want to be able to see all the categories on the site under the Categories heading.

  Background: User opens the app
    * User makes driver adjustments


    Scenario: QCM-37 TC_01 -> US009 Verification of Category Icon and Navigation Titles in Navbar
      * User verifies the "Category" button is displayed
      * User clicks the button with description "Category"
      * User verifies that "Men", "Women", "Juniors" is displayed
      * User clicks the button with description "Men"
      * User verifies that "Men" text is visible
      * User goes back
      * User clicks the button with description "Women"
      * User verifies that "Women" text is visible
      * User goes back
      * User clicks the button with description "Juniors"
      * User verifies that "Juniors" text is visible
      * Driver turns off


    @category
    Scenario: QCM-77 TC_02 -> US009 Verification of Filter Icon in Categories
      * User clicks the button with description "Category"
      * User clicks the button with description "Men"
      * User verifies that the Filter button is displayed and clicks it
      * User verifies that "Filter & Sorting" text is visible
      * User goes back
      * User clicks the button with description "Women"
      * User verifies that the Filter button is displayed and clicks it
      * User verifies that "Filter & Sorting" text is visible
      * User goes back
      * User clicks the button with description "Juniors"
      * User verifies that the Filter button is displayed and clicks it
      * User verifies that "Filter & Sorting" text is visible
      * Driver turns off