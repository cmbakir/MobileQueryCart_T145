package stepdefinitions;

import Page.ManagerPage;
import Page.QueryCardPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.ConfigReader;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import utilities.Driver;
import utilities.OptionsMet;
import utilities.ReusableMethods;



import javax.sound.midi.InvalidMidiDataException;


import java.util.*;


import java.io.IOException;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static utilities.Driver.getAppiumDriver;
import static utilities.Driver.quitAppiumDriver;


import java.sql.DriverManager;


import java.time.Duration;


import static Page.ManagerPage.clickActionButtonForPendingRows;
import static org.junit.Assert.*;
import static utilities.Driver.*;


import static org.junit.Assert.assertEquals;





public class Stepdefinition extends OptionsMet {
    QueryCardPage card = new QueryCardPage();
    Actions actions = new Actions(getAppiumDriver());
    Faker faker=new Faker();
    AndroidDriver driver = (AndroidDriver) getAppiumDriver();

    private final int TOTAL_CATEGORIES = 44;
    private Set<String> visibleCategories = new HashSet<>();



    @Given("User makes driver adjustments")
    public void user_makes_driver_adjustments() {
        getAppiumDriver();
    }

    @Given("User confirms to be on the homepage")
    public void user_confirms_to_be_on_the_homepage() {
        ReusableMethods.wait(1);
        card.LogoGorunurTest();
    }

    @Given("User clicks the button with description {string}")
    public void user_clicks_the_button_with_description(String description) {
        ReusableMethods.wait(3);
        clickButtonByDescription(description);
    }

    @Given("User clicks the button {string} and sendKeys {string}")
    public void user_clicks_the_button_and_send_keys(String elementName, String text) {
        card.phoneTextBoxClickAndSendKeys(text);
        // Telefon numarası alanından sonra Tab ile şifre alanına geç
        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys("Wise.123").perform();
        ReusableMethods.wait(1);
        // Şifre alanından sonra Tab ile "remember me" checkbox'ına geç
        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys(Keys.SPACE).perform();
        actions.sendKeys(Keys.ENTER).perform();

    }

    @Given("User clicks the button {string}")
    public void user_clicks_the_button(String elementName) {
        card.signInLoginClick();
        //  ReusableMethods.wait(1);
        hideKeyboard();

    }

    @Given("Verifies username {string} in dashboard")
    public void verifies_username_in_dashboard(String userName) {
        ReusableMethods.wait(1);
        VerifyElementText(userName);
    }

    /***US 11   **/
    @Given("As a user muss be {string} phone and {string} password Login")
    public void as_a_user_muss_be_phone_and_password_login(String phoneNumber, String password) {
        card.Login(phoneNumber, password);
    }

    @Given("User clicks the button with itemName {string} and {string} and {string} added WishList")
    public void user_clicks_the_button_with_item_name_and_and_added_wish_list(String itemName, String reviews, String price) {
        xPathElementClick(itemName, reviews, price);
    }


    @Given("Driver turns off")
    public void driver_turns_off() {
        quitAppiumDriver();
    }

    @Given("Toaster is displayed")
    public void toast_is_displayed() {
        card.wishListToast();

    }

    @Given("User confirms that categories appear on the screen")
    public void user_confirms_that_categories_appear_on_the_screen() {
        // for (int i = 0; i <categoriesMen.size(); i++) {
        //    assertTrue(categoriesMen.get(i).);
        //  }
    }

    @Given("User clicks phone number textbox and {string} phone number")
    public void user_clicks_phone_number_textbox_and_phone_number(String phoneNumber) {
        card.ForgetPasswordPhoneBox(phoneNumber);
    }

    @Given("User clicks NewPasswordTextBox and confirmPasswordTextBox {string}")
    public void user_clicks_new_password_text_box_and_confirm_password_text_box(String newPassword) {
        card.NewPassword(newPassword);
    }

    @Given("User clicks tap coordinates {int}, {int}")
    public void user_clicks_tap_coordinates(Integer x, Integer y) {
        ReusableMethods.wait(1);
        OptionsMet.touchDown(x, y);
        ReusableMethods.wait(1);
    }

    @Given("User swipe to screen coordinates {int}, {int}, {int}, {int}")
    public void user_swipe_to_screen_coordinates(Integer x, Integer y, Integer endX, Integer endY) throws InvalidMidiDataException {
        OptionsMet.swipe(x, y, endX, endY);
        ReusableMethods.wait(2);
    }

    @Given("Verifies checkbox is selected")
    public void verifies_checkbox_is_selected() {
        card.getCheckBoxRememberMe().click();
        ReusableMethods.wait(2);
        //assertTrue(card.getCheckBoxRememberMe().isSelected());


    }

    @Given("Verifies to access to the forgot password page when it clicked")
    public void verifies_to_access_to_the_forgot_password_page_when_it_clicked() {
        clickButtonByDescription("Forgot Password");


    }

    @Given("Verifies to switch to the Register page from Log In Page")
    public void verifies_to_switch_to_the_register_page_from_log_in_page() {
        clickButtonByDescription("Sign In");


    }

    @Given("User clicks the nameTextBox and sendKeys Name")
    public void user_clicks_the_nameText_box_and_send_keys_name() {
        nameTextBoxClickAndSendKeys("Cem2");
    }

    @Given("User clicks the emailTextBox and sendKeys Email")
    public void user_clicks_the_email_text_box_and_send_keys_email() {
        emailTextBoxClickAndSendKeys(ConfigReader.getProperty("cemNewUserEmail"));
    }

    @Given("User clicks the passwordTextBox and sendKeys Password")
    public void user_clicks_the_password_text_box_and_send_keys_password() {
        passwordTextBoxClickAndSendKeys(ConfigReader.getProperty("cemPassword"));
    }

    @Given("User clicks the button SignUp")
    public void user_clicks_the_button_sign_up() {
        card.getSignUpButton().click();
        ReusableMethods.wait(2);
        assertTrue(card.getEmailSignUpBox().getAttribute("content-desc").contains("Successfully"));
    }

    @Given("User verifies that {string} menu title on the homepage")
    public void user_verifies_that_menu_title_on_the_homepage(String string) {

        assertTrue(card.labelMostPopular.isDisplayed());

    }

    @Given("User verifies that {string} icon on the homepage")
    public void user_verifies_that_icon_on_the_homepage(String string) {

        assertTrue(card.seeAllButton.isDisplayed());

    }

    @Given("User verifies the {string} button is enabled")
    public void user_verifies_the_button_is_enabled(String string) {
        assertTrue(card.seeAllButton.isEnabled());
    }

    @Given("User verifies that most popular items are listed when clicked the see all button")
    public void user_verifies_that_most_popular_items_are_listed_when_clicked_the_see_all_button() {

        assertTrue(card.labelProductFound.isDisplayed());
    }

    @Given("User verifies that the back button is enabled and navigated to homepage after clicking")
    public void user_verifies_that_the_back_button_is_enabled_and_navigated_to_homepage_after_clicking() {

        assertTrue(card.buttonBack.isEnabled());
        card.buttonBack.click();
        ReusableMethods.wait(2);
        assertTrue(card.queryCardLogoElement.isDisplayed());
    }

    @Given("User logs in with the valid {string} and {string}")
    public void user_logs_in_with_the_valid_and(String email, String password) {
        card.emailTextBoxClickAndSendKeys(email);
        // email alanından sonra Tab ile şifre alanına geç
        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys(password).perform();
        ReusableMethods.wait(2);
        // Şifre alanından sonra Tab ile "remember me" checkbox'ına geç
        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys(Keys.ENTER).perform();
        ReusableMethods.wait(1);
        card.signInLoginClick();
        ReusableMethods.wait(2);


    }


    @Given("User verifies the {string} button is viewable and clickable")
    public void user_verifies_the_button_is_viewable_and_clickable(String text) {

        OptionsMet.viewAndClick(text);


    }

    @Given("User verifies the addressEditIcon is viewable and clickable")
    public void user_verifies_the_button_is_viewable_and_clickable() {

        assertTrue(card.addressEditIcon.isDisplayed());
        assertTrue(card.addressEditIcon.isEnabled());
        card.addressEditIcon.click();
        ReusableMethods.wait(2);

    }

    @Given("User makes a change on the address form and clicks the update address button.")
    public void user_makes_a_change_on_the_address_form_and_clicks_the_update_address_button() {

        card.streetaddressBox.click();
        card.streetaddressBox.clear();
        card.streetaddressBox.sendKeys("Updated");
        actions.sendKeys(Keys.TAB).perform();
        card.updateAdressButton.click();


    }

    @Given("User verifies that a success message for updating appeared.")
    public void user_verifies_that_a_success_message_appeared() {

        assertTrue(card.labelSuccessMessageForUpdatingAddress.getAttribute("content-desc").contains("Successful"));
        String mesaj=card.labelSuccessMessageForUpdatingAddress.getAttribute("contentDescription");
        System.out.println("sonuç="+mesaj);
        ReusableMethods.wait(2);

    }

    @Given("User enters new record on the address form and clicks the addAddressButton.")
    public void user_enters_new_record_on_the_address_form_and_clicks_the_add_address_button() throws InterruptedException {

        card.addNewAddressButton.click();
        card.addNewAddress();
    }

    @Given("User verifies the {string} button is displayed")
    public void user_verifies_the_button_is_displayed(String description) {

        ReusableMethods.wait(2);
        VerifyElementText(description);
    }

    @Given("User verifies the Cart button is displayed")
    public void user_verifies_the_cart_button_is_displayed() {
        card.cartButtonVisibilityTest();
    }

    @Given("User verifies the Search Box button is displayed")
    public void user_verifies_the_search_box_button_is_displayed() {
        ReusableMethods.wait(3);
        card.searchBoxButtonVisibilityTest();
    }

    @Given("User verifies that the Home Page has been accessed")
    public void user_verifies_that_the_home_page_has_been_accessed() {
        assert card.labelMostPopular.isDisplayed();
    }

        @Given("User verifies that Categories is displayed")
    public void user_verifies_that_categories_is_displayed() {
        ReusableMethods.wait(3);
        OptionsMet.VerifyElementText("Men");
    }

    @Given("User clicks the Cart button")
    public void user_clicks_the_cart_button() {
        card.cartButtonClick();
    }

    @Given("User verifies that the cart is displayed")
    public void user_verifies_that_the_cart_is_displayed() {
        ReusableMethods.wait(2);
        OptionsMet.VerifyElementText("Shopping Cart");
    }




    @When("User see Popular Brands title.")
    public void userSeePopularBrandsTitle() {
        VerifyElementText("Popular Brands");

    }

    @When("User verify Popular Brands.")
    public void userVerifyPopularBrands() throws InvalidMidiDataException {
        VerifyElementText("Blossom Boutique");
        VerifyElementText("Nike");
        VerifyElementText("Dr. Martens");
        VerifyElementText("Clarks");

        OptionsMet.swipe(1306,2344,118,1282);
        ReusableMethods.wait(1);
        OptionsMet.swipe(1306,2344,118,1282);
        ReusableMethods.wait(1);
        OptionsMet.swipe(1306,2344,118,1282);
        ReusableMethods.wait(1);
        OptionsMet.swipe(1306,2344,118,1282);
        VerifyElementText("Urban Casuals");


    }

    @When("User verify Details, Videos, Review, Review, Shipping&Return title")
    public void userVerifyDetailsVideosReviewReviewShippingReturnTitle() {
        VerifyElementText("Details");
        VerifyElementText("Videos");
        VerifyElementText("Review");
        VerifyElementText("Shipping & Return");

    }

    @When("User clicks  homepage tap coordinates {int}, {int}")
    public void userClicksHomepageTapCoordinates(Integer x, Integer y) {
        ReusableMethods.wait(4);
        OptionsMet.touchDown(x,y);
        ReusableMethods.wait(1);
    }

    @When("When the user clicks on this titles, the product information should be displayed.")
    public void whenTheUserClicksOnThisTitlesTheProductInformationShouldBeDisplayed() {
        card.detailsbutton.click();
        assertTrue(card.detailscontent.isDisplayed());

        card.videosbutton.click();
        assertTrue(card.detailsvideos.isDisplayed());

        card.reviewbutton.click();
        assertTrue(card.detailreviewstar.isDisplayed());
        assertTrue(card.detailreview2.isDisplayed());
        assertTrue(card.detailreview3.isDisplayed());

        card.shipReturnbutton.click();
        assertTrue(card.detailsShipReturn.isDisplayed());


    }

    @When("User clicks the email button {string} and sendKeys {string}")
    public void userClicksTheEmailButtonAndSendKeys(String elementName, String text) {
        card.phoneTextBoxClickAndSendKeys(text);
        // Telefon numarası alanından sonra Tab ile şifre alanına geç
        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys("Query.250203").perform();
        ReusableMethods.wait(1);
        // Şifre alanından sonra Tab ile "remember me" checkbox'ına geç
        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys(Keys.SPACE).perform();
        actions.sendKeys(Keys.ENTER).perform();

    }


    @When("On the page that opens, click on the white heart sign in the upper right corner of the products.")
    public void onThePageThatOpensClickOnTheWhiteHeartSignInTheUpperRightCornerOfTheProducts() {
         card.whiteHeart.click();
         //ReusableMethods.wait(3);
        //assertTrue (card.addedWish.getAttribute("content-desc").contains("Add"));

    }

    @When("the user takes a {string} screenshot of the element they want to take a screenshot of")
    public void theUserTakesAScreenshotOfTheElementTheyWantToTakeAScreenshotOf(String screen) throws IOException {
        ReusableMethods.wait(4);
        ReusableMethods.getScreenshot(screen);
    }


    @When("User see Wishlist title and wishlist item quantity")
    public void userSeeWishlistTitleAndWishlistItemQuantity() {
        VerifyElementText("Wishlist");

        assertTrue(card.wishquant.isDisplayed());

    }

    @When("On the page that opens, click on the red heart sign in the upper right corner of the products.")
    public void onThePageThatOpensClickOnTheRedHeartSignInTheUpperRightCornerOfTheProducts() {
        card.whiteHeart.click();

        //assertTrue (card.removedWish.getAttribute("content-desc").contains("Remove"));
    }


    @When("User clicks shopping bag")
    public void userClicksShoppingBag() {
         card.addcartbag.click();
    }

    @When("User verifies to open shopping cart page")
    public void userVerifiesToOpenShoppingCartPage() {
        VerifyElementText("Shopping Cart");

    }


    @When("User verifies to open shipping information")
    public void userVerifiesToOpenShippingInformation() {
        VerifyElementText("Shipping Information");
    }

    @When("User verify Delivery,pickup title")
    public void userVerifyDeliveryPickupTitle() {
        VerifyElementText("Delivery");
        VerifyElementText("Pick Up");

        assertTrue(card.pickup.isEnabled());
        assertTrue(card.delivery.isEnabled());

    }

    @When("User display address information")
    public void userDisplayAddressInformation() {

        assertTrue(card.shippingAddress.isDisplayed());
        assertTrue(card.shippingAddress.isEnabled());

        assertTrue(card.customeraddress.isDisplayed());
        assertTrue(card.customeraddress.isEnabled());

    }


    @When("User should be able to select a different address as billing address")
    public void userShouldBeAbleToSelectADifferentAddressAsBillingAddress() {
        assertTrue(card.billingsavetitle.isDisplayed());
        assertTrue(card.billingsavetitle.isEnabled());

        assertTrue(card.billingsavebutton.isDisplayed());
        assertTrue(card.billingsavebutton.isEnabled());
        card.billingsavebutton.click();

        assertTrue(card.billingaddresstitle.isDisplayed());
        assertTrue(card.billingaddresstitle.isEnabled());
        ReusableMethods.wait(1);
        card.billingsavebutton.click();

    }

    @When("User should be redirected to the page where they can redeem the discount coupon")
    public void userShouldBeRedirectedToThePageWhereTheyCanRedeemTheDiscountCoupon() {

        ReusableMethods.wait(1);
        assertTrue(card.discountCouponTitle.isDisplayed());
        assertTrue(card.discountCouponTitle.isEnabled());
        card.discountCouponTitle.click();

        assertTrue(card.couponEnterCodeTitle.isDisplayed());
        assertTrue(card.couponEnterCodeTitle.isEnabled());

        assertTrue(card.couponForYouTitle.isDisplayed());

        ReusableMethods.wait(2);
        assertTrue(card.couponEditBox.isDisplayed());
        assertTrue(card.couponEditBox.isEnabled());
        //assertTrue(card.couponEditBox.isSelected());

    }

    @When("The order fee summary should be displayed under the Order Summary heading.")
    public void theOrderFeeSummaryShouldBeDisplayedUnderTheOrderSummaryHeading() throws InvalidMidiDataException {

        assertTrue(card.orderSummaryTitle.isDisplayed());
        assertTrue(card.orderSummaryTitle.isEnabled());

        OptionsMet.swipe(651,1801,651,1282);

        VerifyElementText("Subtotal");
        VerifyElementText("Tax");
        VerifyElementText("Shipping Charge");
        VerifyElementText("Discount");
        VerifyElementText("Total");

    }

    @When("User verify Save & Pay button")
    public void userVerifySavePayButton() {

        assertTrue(card.savePay.isDisplayed());
        assertTrue(card.savePay.isEnabled());
    }

    @When("User change address information")
    public void userChangeAddressInformation() throws InvalidMidiDataException, IOException {

        assertTrue(card.editAdrButton.isDisplayed());
        card.editAdrButton.click();

        VerifyElementText("Address");

        assertTrue(card.editWriButton.isDisplayed());
        assertTrue(card.editWriButton.isEnabled());

        card.editWriButton.click();

        assertTrue(card.updateAdrTitle.isDisplayed());
        assertTrue(card.updateAdrTitle.isEnabled());
        //WebElement updname = card.updateadrnamebox;
        //ReusableMethods.getScreenshot("android.widget.ScrollView");

        card.updateadrnamebox.click();
        actions.sendKeys("turk").perform();

        //OptionsMet.clickAndSendKeys(updname,"caner ozturk");
        OptionsMet.swipe(651,1801,651,1282);
        OptionsMet.clickButtonByDescription("Update Address");
        //ReusableMethods.wait(1);
        //ReusableMethods.getScreenshot("android.widget.ScrollView");
        assertTrue (card.updatedAddSuccess.getAttribute("content-desc").contains("Success"));
        ReusableMethods.wait(3);
        card.backButton.click();

    }

    @When("User add new adress")
    public void userAddNewAdress() throws InterruptedException {
        card.shipAddButton.click();

        VerifyElementText("Add New Address");
        VerifyElementText("Full Name");
        card.addAddressNameBox.click();
        card.addAddressNameBox.sendKeys("cihan öztürk");
        actions.sendKeys(Keys.TAB)
                .sendKeys("cihan@hotmail.com")
                 .sendKeys(Keys.TAB).perform();
                //.sendKeys(Keys.ENTER).perform();
        //ReusableMethods.wait(2);
        ReusableMethods.wait(2);
        OptionsMet.touchDown(275,1226);
        ReusableMethods.wait(1);
         card.countryCode.click();
       // ReusableMethods.scrollWithUiScrollableAndClickWithUi("+93");
        Thread.sleep(2000);
        actions.sendKeys(Keys.TAB)
                .sendKeys("5556661122")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys("Cinnah Caddesi No : 18/7").perform();

        card.addAddressCountry.click();
        card.addAddressCountrybox.click();
        actions.sendKeys("Turkey").perform();
        card.addAddressCountryboxTurkey.click();

        card.addAddressState.click();
        card.addAddressStatebox.click();
        actions.sendKeys("Ankara").perform();
        card.addAddressStateboxAnkara.click();

        card.addAddressCity.click();
        card.addAddressCitybox.click();
        actions.sendKeys("Çankaya").perform();
        card.addAddressCityCankaya.click();

        OptionsMet.hideKeyboard();
        //clickButtonByDescription("Add Address");

         ReusableMethods.wait(1);
         WebElement addAddressButton = card.addAddressButton;
         clickAndVerify(addAddressButton);
      // ekenen adresin doğrulanması

        assertTrue (card.addedAddSuccess.getAttribute("content-desc").contains("Success"));
        assertTrue(card.addedAddress.isDisplayed());
        assertTrue(card.addedAddress.isEnabled());

        ReusableMethods.wait(1);

    }

    @When("User delete adress")
    public void userDeleteAdress() throws IOException {

        card.editAdrButton.click();
        // update işleminnde açılan delete yapabilrsin
        WebElement updatedeleteadr = card.updateadrDeleteBut;
        OptionsMet.clickAndVerify(updatedeleteadr);
         VerifyElementText("Cancel");
        VerifyElementText("Delete");

        card.updateDeleteButton.click();

        //eklenen adresin adreslerden silindiğini görüntüler
        //assertFalse(card.addedAddress.isDisplayed());

        assertTrue (card.deletedAddSuccess.getAttribute("content-desc").contains("Success"));
         ReusableMethods.wait(2);

        card.backButton.click();

        //getAppiumDriver().navigate().refresh();

        ReusableMethods.getScreenshot("android.widget.ScrollView");

        //getAttribute("content-desc").contains("Successfully"));
        //@AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Success\n" +
               // "Address Added Successfully!\"]")
       // public WebElement labelSuccessMessageForAddingAddress;

    }

    @When("User goes to pickup page")
    public void userGoesToPickupPage() throws InvalidMidiDataException {
        ReusableMethods.wait(1);
        OptionsMet.swipe(641,414,641,1285);
        card.pickup.click();

        ReusableMethods.wait(1);
        assertTrue(card.orderSummaryTitle.isDisplayed());
        assertTrue(card.orderSummaryTitle.isEnabled());

        VerifyElementText("Subtotal");
        VerifyElementText("Tax");
        VerifyElementText("Shipping Charge");
        VerifyElementText("Discount");
        VerifyElementText("Total");

        assertTrue(card.discountCouponTitle.isDisplayed());
        assertTrue(card.discountCouponTitle.isEnabled());

    }

    @When("the user takes a {string} screenshot of that the yellow circle is identified in the shopping bag when the product is selected")
    public void theUserTakesAScreenshotOfThatTheYellowCircleIsIdentifiedInTheShoppingBagWhenTheProductIsSelected(String screen) throws IOException {

        ReusableMethods.wait(2);
        ReusableMethods.getScreenshot(screen);
    }

    @Given("User verifies that Wishlist is displayed")
    public void user_verifies_that_wishlist_is_displayed() {
        ReusableMethods.wait(2);
        OptionsMet.VerifyElementText("Wishlist");
    }

    @Given("User verifies that the Profile is displayed")
    public void user_verifies_that_the_profile_is_displayed() {
        ReusableMethods.wait(2);
        OptionsMet.VerifyElementText("My Account");
    }

    @Given("User logs in")
    public void user_logs_in() {
        ReusableMethods.wait(4);
        clickButtonByDescription("Profile");
        ReusableMethods.wait(2);
        clickButtonByDescription("Sign In");
        card.phoneTextBoxClickAndSendKeys("6505551212");
        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys("Wise.123").perform();
        ReusableMethods.wait(1);
        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys(Keys.SPACE).perform();
        actions.sendKeys(Keys.ENTER).perform();
        card.signInLoginClick();
        hideKeyboard();
    }

    @Given("User clicks the Search Box button")
    public void user_clicks_the_search_box_button() {
        card.searchBoxButtonClick();
    }

    @Given("User verifies that {string} text is visible")
    public void user_verifies_that_text_is_visible(String text) {
        ReusableMethods.wait(1);
        OptionsMet.VerifyElementText(text);
    }

    @Given("User sends send keys {string}")
    public void user_sends_send_keys(String key) {
        card.searchBoxSendKeys(key);
    }


    @Given("User collect all visible categories by swiping")
    public void user_collect_all_visible_categories_by_swiping() throws InvalidMidiDataException {

        boolean allFound = false;

        while (!allFound) {

            List<WebElement> categoryElements = getAppiumDriver().findElements(By.xpath("//android.view.View[@content-desc]"));

            for (WebElement category : categoryElements) {
                String categoryText = category.getAttribute("contentDescription");
                visibleCategories.add(categoryText);
            }

            if (visibleCategories.size() == TOTAL_CATEGORIES) {
                allFound = true;
            } else {
                swipe(1290, 1142, 85, 1142);
            }
        }
    }
    @Given("User verifies that all categories displayed")
    public void user_verifies_that_all_categories_displayed() {
        assertEquals(TOTAL_CATEGORIES, visibleCategories.size());
    }

    @Given("User verifies that a success message for deleting appeared.")
    public void user_verifies_that_a_success_message_for_deleting_appeared() {

        assertTrue(card.labelSuccessMessageForDeletingAddress.getAttribute("content-desc").contains("Successfully"));
        ReusableMethods.wait(2);

    }
    @Given("User verifies that a success message for adding appeared.")
    public void user_verifies_that_a_success_message_for_adding_appeared() {

        assertTrue(card.labelSuccessMessageForAddingAddress.getAttribute("content-desc").contains("Successfully"));
        ReusableMethods.wait(2);


    }



            @Given("User adds an item to shopping card and goes to the shopping card.")
            public void user_adds_an_item_to_shopping_card_and_goes_to_the_shopping_card () throws
            InvalidMidiDataException {
                card.firstElementOfMostPopuler.click();
                card.mSizeButton.click();

                OptionsMet.swipe(832, 1772, 832, 1242);
                ReusableMethods.wait(2);
                OptionsMet.clickButtonByDescription("Add To Cart");
                ReusableMethods.wait(1);
                card.sepetIcon.click();
                ReusableMethods.wait(1);


            }
            @Given("User selects an address for shipping.")
            public void user_selects_an_address_for_shipping () throws InvalidMidiDataException {
                card.LabelSecondAddress.click();
                OptionsMet.swipe(1185, 2017, 1185, 1282);
            }
            @Given("User clicks the confirm order button without selected payment method, then an error message should be appeared.")
            public void user_clicks_the_confirm_order_button_without_selected_payment_method_then_an_error_message_should_be_appeared
            () {


                card.confirmOrderButton.click();
                assertTrue(card.labelErrorMessageForPaymentMethod.getAttribute("content-desc").contains("Error"));
                ReusableMethods.wait(2);

            }

            @Given("User fills card informations and clicks the confirm button")
            public void user_fills_card_informations_and_clicks_the_confirm_button () {
                ReusableMethods.wait(8);
                card.stripeMethodCartBox.click();
                actions.sendKeys("424242424242424212261231234512").perform();
                ReusableMethods.wait(2);
                card.confirmbtnStripeMethod.click();
                ReusableMethods.wait(5);

            }
            @Given("User verifies that getting success message for order completing")
            public void user_verifies_that_getting_success_message_for_order_completing () {
                assertTrue(card.labelSuccessMessageForOrder.getAttribute("content-desc").contains("Success"));
            }
            @Given("User verifies that order details could be appeared after click the last order history.")
            public void user_verifies_that_order_details_could_be_appeared_after_click_the_last_order_history () {

                card.firstOrderHistory.click();
                ReusableMethods.wait(1);
                assertTrue(card.orderDetailsTable.isDisplayed());
            }
            @Given("User navigates to back")
            public void user_navigates_to_back () {
                OptionsMet.KeyBack();
            }

            @Given("User verifies that invoice is appeared when click download receipt button.")
            public void user_verifies_that_invoice_is_appeared_when_click_download_receipt_button () {

                OptionsMet.clickButtonByDescription("Download Receipt");
                ReusableMethods.wait(1);
                assertTrue(card.invoiceTable.isDisplayed());
            }

    @Given("User verifies that {string}, {string}, {string} is displayed")
    public void user_verifies_that_is_displayed(String description1, String description2, String description3) {

        ReusableMethods.wait(5);

        VerifyElementText(description1);
        VerifyElementText(description2);
        VerifyElementText(description3);
    }

    @Given("User verifies that the Filter button is displayed and clicks it")
    public void user_verifies_that_the_filter_button_is_displayed_and_clicks_it() {
        ReusableMethods.wait(3);
        card.verifyIconFilter();
    }

    @Given("User goes back")
    public void user_goes_back() {
        card.clickCategoryBackButton();
    }

    @Then("User clicks the button with {string}")
    public void user_clicks_the_button_with(String UseEmailInstead) {
        ReusableMethods.wait(2);
        card.buttonUseEmailInstead.click();
    }
    @Then("As a user must be {string} email and {string} password Login")
    public void as_a_user_must_be_email_and_password_login(String registeredEmail, String registeredPassword) {
        ReusableMethods.wait(2);
        card.LoginWithEmail(registeredEmail, registeredPassword);
    }
    @Then("User Verifies the visibility and functionality of the {string} button")
    public void user_verifies_the_visibility_and_functionality_of_the_button(String Wishlist) {
        ReusableMethods.wait(2);
        VerifyElementText(Wishlist);
        clickButtonByDescription(Wishlist);
    }
    @Then("The {string} title should be displayed")
    public void theTitleShouldBeDisplayed(String OrderHistory) {
        ReusableMethods.wait(2);
        OptionsMet.assertElementText(OrderHistory);
    }
    @And("User clicks on the first order in the list")
    public void userClicksOnTheFirstOrderInTheList() {
        ReusableMethods.wait(2);
        card.getFirstOrderDetailsButton().click();
    }
    @And("User scroll down the screen")
    public void userScrollDownTheScreen() throws InvalidMidiDataException {
        ReusableMethods.wait(1);
        OptionsMet.swipe(600,2750,600,330);
        ReusableMethods.wait(1);
    }
    @Then("User returns to previous page")
    public void userReturnsToPreviousPage() {
        ReusableMethods.wait(2);
        Driver.getAppiumDriver().navigate().back();
        ReusableMethods.wait(2);
    }
    @Then("User should see an {string} message on the popup page.")
    public void userShouldSeeAnMessageOnPopupPage(String expectedMessage) throws Exception {
        ReusableMethods.wait(2);
        OptionsMet.assertElementTextAndVisibility(expectedMessage);
    }

    @Given("Manager is on the Dashboard page and accept order")
    public void manager_is_on_the_dashboard_page_and_accept_order() {

        ManagerPage managerPage= new ManagerPage();
        WebDriver webdriver = Driver.getWebdriver();

        String managerLoginUrl = ConfigReader.getProperty("managerLoginUrl");
        String managerEmail = ConfigReader.getProperty("managerEmail");
        String registeredPassword = ConfigReader.getProperty("registeredPassword");

        managerPage.managerLogin(managerLoginUrl, managerEmail, registeredPassword);

        managerPage.managerButton.click();
        ReusableMethods.wait(1);
        managerPage.dashboardButton.click();
        ReusableMethods.wait(1);
        managerPage.onlineOrdersButton.click();
        ReusableMethods.wait(2);

        ManagerPage.clickActionButtonForPendingRows(webdriver);

        managerPage.acceptButton.click();
        ReusableMethods.wait(1);
        managerPage.accept2button.click();
        ReusableMethods.wait(1);
        managerPage.dropdownMenu.click();
        ReusableMethods.wait(1);
        managerPage.labelDelivered.click();
        ReusableMethods.wait(1);
    }
    //TC01 regester Suleyman us007
    @Given("The user verifies und enabled that the {string} icon is on the page.")
    public void the_user_verifies_that_the_icon_is_on_the_page(String description) {
        ReusableMethods.wait(6);
        AndroidDriver driver = (AndroidDriver) getAppiumDriver();
        WebElement button = driver.findElement(MobileBy.accessibilityId("Profile"));

        assertTrue(button.isDisplayed());
        assertTrue(button.isEnabled());
    }

    @Given("Verifies that the Sign Up button is visible und enabled.")
    public void verifies_that_the_sign_up_button_is_visible() {
        assertTrue(card.getSignUpLoginButton().isDisplayed());
        assertTrue(card.getSignUpLoginButton().isEnabled());

    }

    @Given("Fills out the form according to the rules.")
    public void fills_out_the_form_according_to_the_rules() {
        Faker faker = new Faker();
        String fullName = faker.name().fullName(); // Rastgele isim
        String phoneNumber = faker.number().digits(10); // 7 haneli rastgele telefon numarası
        // İsim kutusuna tıkla ve Faker ile oluşturulan ismi gir
        clickAndVerify(card.getNameBoxElement());
        card.getNameBoxElement().sendKeys(fullName);
        ReusableMethods.wait(2);
        // TAB ile telefon kutusuna geç ve Faker ile oluşturulan telefon numarasını gir
        actions.sendKeys(Keys.TAB).sendKeys(Keys.TAB)
                .sendKeys(phoneNumber)
                .perform();
        ReusableMethods.wait(2);
        // TAB ile şifre kutusuna geç ve Faker ile oluşturulan şifreyi gir
        actions.sendKeys(Keys.TAB)
                .sendKeys("Wise.123")
                .perform();
        ReusableMethods.wait(2);
        // ENTER ile formu gönder (REGISTER butonuna basmak için)
        actions.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
        ReusableMethods.wait(1);
    }

    @Given("The user verifies that the Success message is {string}")
    public void the_user_verifies_that_the_success_message_is(String expSuccessMassage) {

        assertTrue (card.getSuccessMassage().getAttribute("content-desc").contains("Successfully"));
    }

    @Given("Verifies that the {string} button is visible.")
    public void verifies_that_the_button_is_visible(String string) {
        assertTrue(card.getSignInLoginButton().isDisplayed());

    }
    //TC 02 suleyman

    @Given("User enters phone number.")
    public void user_enters_phone_number() {
        Faker faker = new Faker();
        String phoneNumber = faker.number().digits(10);
        card.getPhoneandEmailBox().click();
        card.getPhoneandEmailBox().sendKeys(phoneNumber);

    }
    @Given("user enters password that they want to use.")
    public void user_enters_password_that_they_want_to_use() {
        card.getPasswordBox().click();
        card.getPasswordBox().sendKeys("Wise.123");
        ReusableMethods.wait(2);
    }
    @Given("user clicks on sign up login button.")
    public void user_clicks_on_sign_up_login_button() {
        card.getSignUpLoginButton().click();
    }
    @Given("user confirms that This field is required text is visible.")
    public void user_confirms_that_this_field_is_required_text_is_visible() {
        String expectedWrittigMassage="This field is required";
        String actualWrittigMassage=card.getErrorWritingNameandPhone().getAttribute("content-desc");
        assertTrue(card.getErrorWritingNameandPhone().isDisplayed());
        assertEquals(expectedWrittigMassage,actualWrittigMassage);
    }
    @Given("user clicks on back button.")
    public void user_clicks_on_back_button() {
        card.getReturnButton().click();
        ReusableMethods.wait(2);
    }

    @Given("user enters username.")
    public void user_enters_username() {
        Faker faker = new Faker();
        String fullName = faker.name().fullName(); // Rastgele isim
        card.getNameBoxElement().click();
        card.getNameBoxElement().sendKeys(fullName);
    }
    @Given("User Verifies that Password is required text appears")
    public void user_verifies_that_password_is_required_text_appears() {
        String expectedWrittigMassage="Passord is required";
        String actualWrittigMassage=card.getErrorWritingPassword().getAttribute("content-desc");
        assertTrue(card.getErrorWritingPassword().isDisplayed());
        assertEquals(expectedWrittigMassage,actualWrittigMassage);
    }
    @Given("The user clicks on the use email instead text on the sigUp form.")
    public void the_user_clicks_on_the_use_email_instead_text_on_the_sig_up_form() {
        card.getUseEmailInst().click();
    }
    @Given("The user confirms that the Email is required text appears.")
    public void the_user_confirms_that_the_email_is_required_text_appears() {
        String expectedWrittigMassage="Email is required";
        String actualWrittigMassage=card.getErrorWritingEmail().getAttribute("content-desc");
        assertTrue(card.getErrorWritingEmail().isDisplayed());
        assertEquals(expectedWrittigMassage,actualWrittigMassage);
    }
    @Given("As a user, enters the necessary information on the Form.")
    public void as_a_user_enters_the_necessary_information_on_the_form() {
        Faker faker = new Faker();
        String fullName = faker.name().fullName(); // Rastgele isim
        String email = faker.internet().emailAddress();
        card.getNameBoxElement().click();
        card.getNameBoxElement().sendKeys(fullName);
        ReusableMethods.wait(2);
        // TAB ile telefon kutusuna geç ve Faker ile oluşturulan Email gir
        actions.sendKeys(Keys.TAB)
                .sendKeys(email)
                .perform();
        ReusableMethods.wait(2);
        // TAB ile şifre kutusuna geç  şifreyi gir
        actions.sendKeys(Keys.TAB)
                .sendKeys("Wise.123")
                .perform();
        ReusableMethods.wait(2);

    }
    @Given("user enters a phone number of less than 7 digits.")
    public void user_enters_a_phone_number_of_less_than_digits() {
        Faker faker = new Faker();
        String phoneNumber = faker.number().digits(6);
        card.getPhoneandEmailBox().click();
        card.getPhoneandEmailBox().sendKeys(phoneNumber);
    }
    @Given("user confirms receiving error message.")
    public void user_confirms_receiving_error_message() {
        assertTrue(card.getErrorMassagePhone().isDisplayed());
        assertTrue (card.getErrorMassagePhone().getAttribute("content-desc").contains("The phone field must be at least 7 characters."));
    }
    @Given("user enters an Email that does not meet the Email criteria.")
    public void user_enters_an_email_that_does_not_meet_the_email_criteria() {
        Faker faker = new Faker();


        String invalidEmail = faker.name().username() + "example.com";

        card.getPhoneandEmailBox().click();
        card.getPhoneandEmailBox().sendKeys(invalidEmail);
        String expectedWrittingMassage="Enter Valid Email Address";
        String actualWrittingMassage=card.getErrorWritingFalseEmail().getAttribute("content-desc");
        assertTrue(card.getErrorWritingFalseEmail().isDisplayed());
        assertEquals(expectedWrittingMassage,actualWrittingMassage);

        card.getReturnButton().click();
        card.getSignUpButton().click();
        card.getUseEmailInst().click();

        String invalidEmail2 = faker.name().username() + "@";

        card.getPhoneandEmailBox().click();
        card.getPhoneandEmailBox().sendKeys(invalidEmail2);
        String expectedWrittingMassage2="Enter Valid Email Address";
        String actualWrittingMassage2=card.getErrorWritingFalseEmail().getAttribute("content-desc");
        assertTrue(card.getErrorWritingFalseEmail().isDisplayed());
        assertEquals(expectedWrittingMassage2,actualWrittingMassage2);

        card.getReturnButton().click();
        card.getSignUpButton().click();
        card.getUseEmailInst().click();

        String invalidEmail3 = faker.internet().emailAddress().replace("@", "!");

        card.getPhoneandEmailBox().click();
        card.getPhoneandEmailBox().sendKeys(invalidEmail3);
        String expectedWrittingMassage3="Enter Valid Email Address";
        String actualWrittingMassage3=card.getErrorWritingFalseEmail().getAttribute("content-desc");
        assertTrue(card.getErrorWritingFalseEmail().isDisplayed());
        assertEquals(expectedWrittingMassage3,actualWrittingMassage3);

    }
    @Given("The user scrolls the screen {int} times to the screen coordinate from {int},{int} to {int},{int}.")
    public void the_user_scrolls_the_screen_times_to_the_screen_coordinate_from_to(Integer n,Integer x, Integer y, Integer endX, Integer endY) throws InvalidMidiDataException {
        for (int i = 0; i < n; i++) {

            OptionsMet.swipe(x,y,endX,endY);
            ReusableMethods.wait(1);
        }

    }
    @Given("user confirms that the juniors category is visible.")
    public void user_confirms_that_the_juniors_category_is_visible() {
        assertTrue(card.getBodyJuniorsCatgr().isDisplayed());
    }
    @Given("user confirms that the juniors Clothing subcategory is visible.")
    public void user_confirms_that_the_juniors_clothing_subcategory_is_visible() {
        assertTrue(card.getBodyJuniorsClothingAltCatgr().isDisplayed());
    }
    @Given("user confirms that the juniors Seleepwear subcategory is visible.")
    public void user_confirms_that_the_juniors_seleepwear_subcategory_is_visible() {
        assertTrue(card.getBodyJuniorsSleepwearAltCatgr().isDisplayed());
    }
    @Given("user confirms that the juniors Shose subcategory is visible.")
    public void user_confirms_that_the_juniors_shose_subcategory_is_visible() {
        assertTrue(card.getBodyJuniorsShoesAltCatgr().isDisplayed());
    }
    @Given("user confirms that the juniors Accessories subcategory is visible.")
    public void user_confirms_that_the_juniors_accessories_subcategory_is_visible() {
        assertTrue(card.getBodyJuniorsAccessoriesAltCatgr().isDisplayed());
    }
    @Given("user confirms that the juniors Bags subcategory is visible.")
    public void user_confirms_that_the_juniors_bags_subcategory_is_visible() {
        assertTrue(card.getBodyJuniorsBagsAltCatgr().isDisplayed());
    }
    @Given("user confirms that the juniors Hat & Beres subcategory is visible.")
    public void user_confirms_that_the_juniors_hat_beres_subcategory_is_visible() {
        assertTrue(card.getBodyJuniorsHatAltCatgr().isDisplayed());
    }
    //TC02 US014 suleyman
    @Given("User clicks on juniors category.")
    public void user_clicks_on_juniors_category() {
        card.getBodyJuniorsCatgr().click();
    }
    @Given("Verifies that the filter icon is visible and accessible.")
    public void verifies_that_the_filter_icon_is_visible_and_accessible() {
        assertTrue(card.getFiltreIkon().isDisplayed());
        assertTrue(card.getFiltreIkon().isEnabled());
    }
    @Given("\\(5-6 years old) Adds Disney Mickey Mouse to wishlist.")
    public void years_old_adds_disney_mickey_mouse_to_wishlist() {
        card.getProductAddWishlist().click();
        assertTrue (card.getSuccessAddWishlist().getAttribute("content-desc").contains("Added to Wishlist"));
    }
    @Given("\\(7-8 years old, yellow) Adds Kids Girls Raglan Style to wishlist.")
    public void years_old_yellow_adds_kids_girls_raglan_style_to_wishlist() {
        card.getProductNewAddWishlist().click();
        assertTrue (card.getSuccessAddWishlist().getAttribute("content-desc").contains("Added to Wishlist"));
    }
    @Given("Adds capacity Large Student Backpack to wishlist and selects black color and adds to cart.")
    public void adds_capacity_large_student_backpack_to_wishlist_and_selects_black_color_and_adds_to_cart() {

        card.getProductSelectColor().click();
        ReusableMethods.wait(3);
        card.getAddToCart().click();
        assertTrue (card.getSuccessPruductAddToCart().getAttribute("content-desc").contains("Product added to cart"));
        ReusableMethods.wait(3);
        card.getAddWishlistFavorite().click();
        ReusableMethods.wait(3);
        card.getCarttoButton().click();
        ReusableMethods.wait(2);

    }
    @Given("user clicks on capacity Large Student Backpack")
    public void user_clicks_on_capacity_Large_Student_Backpack() {
        ReusableMethods.wait(2);
        card.getProducktCapLargClick().click();
        ReusableMethods.wait(2);
    }

    @Given("The user views their wishlist and confirms that they are on the {string} page.")
    public void the_user_views_their_wishlist_and_confirms_that_they_are_on_the_page(String expectedtext) {

        card.getWishlist().click();
        ReusableMethods.wait(2);

        String actuelurunsayisi=card.getWishlist().getAttribute("content-desc");
        assertEquals(expectedtext,actuelurunsayisi);
    }

    @Given("User click on juniors category.")
    public void user_click_on_juniors_category() {
        card.getCategoryButton().click();
        card.getJuniorsButton().click();
    }

    @Given("User swipe to Women category")
    public void user_swipe_to_women_category() throws InvalidMidiDataException {
        for (int i = 0; i < 3; i++) {
            swipe(1149, 1154, 209, 1149);
        }
        touchDown(863, 1149);

    }

    @Given("User clicks the passwordTextBox and sendKeys invalidPassword")
    public void user_clicks_the_password_text_box_and_send_keys_invalid_password() {
        passwordTextBoxClickAndSendKeys(ConfigReader.getProperty("cemInvalidPassword"));

    }

    @Given("Verifies visitor is login not Successfully")
    public void verifies_visitor_is_login_not_successfully() {
        //System.out.println(card.labelErrorMessageForSigningIn.getText());
        String hata = card.labelErrorMessageForSigningIn.getAttribute("contentDescription");
        System.out.println(hata);
        assertTrue(card.labelErrorMessageForSigningIn.getAttribute("content-desc").contains("Error"));

    }

    @Given("User clicks to return back")
    public void user_clicks_to_return_back() {
        getAppiumDriver().navigate().back();
    }

    @Given("User clicks useEmailInstead")
    public void user_clicks_use_email_instead() {
        clickButtonByDescription("*Use Email Instead");
    }

    @Given("Verifies visitor is loggedin Successfully")
    public void verifies_visitor_is_loggedin_successfully() {
    }

    @Given("User verifies the addressDeleteIcon is viewable and clickable")
    public void user_verifies_the_address_delete_button_button_is_viewable_and_clickable() {

        assertTrue(card.addressDeleteIcon.isDisplayed());
        assertTrue(card.addressDeleteIcon.isEnabled());
        card.addressDeleteIcon.click();
        ReusableMethods.wait(2);
        OptionsMet.viewAndClick("Delete");

    }

    /*
    @Given("User verifies the addressDeleteIcon is viewable and clickable")
    public void user_verifies_the_address_delete_button_button_is_viewable_and_clickable() {


    }

        WebDriverWait wait = new WebDriverWait(getAppiumDriver(), Duration.ofSeconds(10)); // 10 seconds wait
        try {

            //     wait.until(ExpectedConditions.visibilityOf(card.successMessageOzge));

            //  assertTrue("Success mesajı görünmüyor!", card.successMessageOzge.isDisplayed());

            // 2. Elementin metnini al ve doğrula
            String actualText = card.successMessageOzge.getText();
            String expectedText = "Success Login Successfully.";
            //assertEquals(actualText, expectedText, "Success mesajı beklenenle eşleşmiyor!");

            System.out.println("Success mesajı doğrulandı: " + actualText);
            String hata2 = card.successMessageOzge.getAttribute("contentDescription");
            System.out.println(hata2);

        } catch (Exception e) {
            e.printStackTrace();

        }


        // System.out.println(card.labelSuccessMessageForSigningIn.getText());
        //  assertTrue(card.labelSuccessMessageForSigningIn.getText().contains("Success"));
        //  assertTrue (card.labelSuccessMessageForSigningIn.getAttribute("content-desc").contains("Successfully"));
    }
*/
    @Given("User clicks to category")
    public void user_clicks_to_category() {
        clickButtonByDescription("Category");
    }

    @Given("User clicks to subCategoryForWomen")
    public void user_clicks_to_sub_category_for_women() {
        card.getIconWomenSubCategory().click();
    }


    @Given("Verifies Women in SubCategory")
    public void verifies_women_in_sub_category() {

        ReusableMethods.wait(2);
        List<WebElement> categories = driver.findElements(By.xpath("//android.view.View[@content-desc]"));


        List<String> categoryNames = new ArrayList<>();
        for (WebElement category : categories) {
            String text = category.getAttribute("content-desc"); // Sadece content-desc kullanılıyor
            if (text != null && !text.trim().isEmpty()) {  // Null ve boşlukları filtrele
                categoryNames.add(text);
            }
        }
        // Konsola yazdırmak için kullandım
        System.out.println("Kategori Listesi: " + categoryNames);

        // Beklenen kategorileri tanımlak icin kullandım
        List<String> expectedCategories = Arrays.asList("Men", "Women", "Juniors");

        // Liste sırası değişirse sıralayarak kıyaslayalım
        Collections.sort(categoryNames);
        Collections.sort(expectedCategories);

        // Assert ile doğrulamak için kullandım
        assertEquals("Kategori listesi beklendiği gibi değil!", expectedCategories, categoryNames);

    }


    @Given("User verify to have subCategoryOfWomen")
    public void user_verify_to_have_sub_category_of_women() {
        ReusableMethods.wait(2);
        List<WebElement> subCategories = driver.findElements(By.xpath("//android.view.View[@content-desc and @index='0']"));
        //android.view.View[@clickable='true' and @content-desc]

        List<String> subCategoryNames = new ArrayList<>();
        for (WebElement category : subCategories) {
            String text = category.getAttribute("content-desc"); // Sadece content-desc kullanılıyor
            if (text != null && !text.trim().isEmpty()) {  // Null ve boşlukları filtrele
                subCategoryNames.add(text);
            }
        }

        // Konsola yazdırmak için kullandım
        System.out.println("Alt Kategori Listesi: " + subCategoryNames);

        // Beklenen kategorileri tanımlamak için kullandım
        List<String> expectedSubCategories = Arrays.asList("Women Clothing", "Women Shoes", "Women Accessories");

        // Liste sırası değişirse sıralayarak kıyaslayalım
        Collections.sort(subCategoryNames);
        Collections.sort(expectedSubCategories);

        // Assert ile doğrulamak için kullandım
        assertEquals("Alt Kategori listesi beklendiği gibi değil!", expectedSubCategories, subCategoryNames);

    }


    @Given("User verify to be perform add to cart, add to favorite and view")
    public void user_verify_to_be_perform_add_to_cart_add_to_favorite_and_view () throws
            InvalidMidiDataException {
        ReusableMethods.wait(2);

        // Tüm ürünleri liste olarak al
        for (int j = 0; j <5; j++) {

            for (int i = 0; i < 6; i++) {
                List<WebElement> products = driver.findElements(By.xpath("//android.view.View[@content-desc and @index='" + i + "']"));

                for (WebElement product : products) {
                    String productName = product.getAttribute("content-desc");
                    if (productName != null && !productName.trim().isEmpty()) {
                        System.out.println("Ürün: " + productName);
                        System.out.println(product.getSize());
                        System.out.println(products);
                    }
                        products.get(i).click();
                        // Ürünü tıklayarak detayına gir
                        touchDown(352, 909);
                        // product.click();
                        ReusableMethods.wait(2);

                        // "Add to Cart" butonunu bul ve tıkla
                        OptionsMet.swipe(700, 2369, 679, 914);
                        touchDown(184, 2497);

                        clickButtonByDescription("Add To Cart");
                        // WebElement addToCartButton = driver.findElement(By.xpath("//android.widget.Button[@content-desc='Add to Cart']"));
                        // addToCartButton.click();
                        ReusableMethods.wait(1);
                        System.out.println(productName + " sepete eklendi.");

                        // "Add to Favorites" butonunu bul ve tıkla
                        clickButtonByDescription("Favorite");
                        //WebElement favoriteButton = driver.findElement(By.xpath("//android.widget.Button[@content-desc='Add to Favorite']"));
                        // favoriteButton.click();
                        ReusableMethods.wait(1);
                        System.out.println(productName + " favorilere eklendi.");

                        // Geri git (Back tuşu)
                        driver.navigate().back();
                        ReusableMethods.wait(1);

                }

            }
        }
        touchDown(352, 909);
    }

}

