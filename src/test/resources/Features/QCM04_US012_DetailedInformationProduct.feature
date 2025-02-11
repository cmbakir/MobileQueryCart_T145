Feature: As a user, I want to be able to access detailed information about the product I have selected on the page

  Background: User opens the app
    * User makes driver adjustments

  Scenario:QCM18 [TC_01 -> US_012] Test to display details,videos,review,shipping&return headers -
           QCM19 [TC_02 -> US_012] Test for displaying product information when clicking on relevant headings


    # Click on the first product that appears on the home page
    * User clicks  homepage tap coordinates 355, 2027
    # scroll down to see product details
    * User swipe to screen coordinates 676, 2490, 676, 355
    * User verify Details, Videos, Review, Review, Shipping&Return title
    * When the user clicks on this titles, the product information should be displayed.



