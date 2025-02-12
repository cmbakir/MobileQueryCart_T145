
Feature: US_014 As a registered user, I would like to be able to see the categories and products of the Juniors menu on the home page.

  Background: User opens the app
    * User makes driver adjustments

  Scenario: TC_01 -> US_014 As a registered user, I should be able to view the juniors and subcategories on the home page header.
    * User clicks the button with description "Profile"
    * User clicks the button with description "Sign In"
    * As a user muss be "phoneNumberSuleyman" phone and "passwordSuleyman" password Login
    * The user scrolls the screen 7 times to the screen coordinate from 1300,1200 to 65,1200.
    * user confirms that the juniors category is visible.
    * user confirms that the juniors Clothing subcategory is visible.
    * user confirms that the juniors Seleepwear subcategory is visible.
    * The user scrolls the screen 1 times to the screen coordinate from 1300,1200 to 65,1200.
    * user confirms that the juniors Shose subcategory is visible.
    * The user scrolls the screen 1 times to the screen coordinate from 1300,1200 to 65,1200.
    * user confirms that the juniors Accessories subcategory is visible.
    * user confirms that the juniors Bags subcategory is visible.
    * user confirms that the juniors Hat & Beres subcategory is visible.

  Scenario: TC_02 -> US_014 As a registered user, I should be able to perform operations on the juniors category on the home page header.
    * User clicks the button with description "Profile"
    * User clicks the button with description "Sign In"
    * As a user muss be "phoneNumberSuleyman" phone and "passwordSuleyman" password Login
    * User click on juniors category.
    * Verifies that the filter icon is visible and accessible.
    * (5-6 years old) Adds Disney Mickey Mouse to wishlist.
    * (7-8 years old, yellow) Adds Kids Girls Raglan Style to wishlist.
    * The user scrolls the screen 1 times to the screen coordinate from 680,2728 to 620,115.
    * user clicks on capacity Large Student Backpack
    * The user scrolls the screen 1 times to the screen coordinate from 680,2728 to 620,1115.
    * Adds capacity Large Student Backpack to wishlist and selects black color and adds to cart.
    * The user views their wishlist and confirms that they are on the "Wishlist" page.
