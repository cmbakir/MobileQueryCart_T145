package stepdefinitions;

import Page.QueryCardPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.OptionsMet;
import utilities.ReusableMethods;


import javax.sound.midi.InvalidMidiDataException;

import java.io.IOException;
import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static utilities.Driver.getAppiumDriver;
import static utilities.Driver.quitAppiumDriver;

public class Stepdefinition extends OptionsMet {
    QueryCardPage card = new QueryCardPage();
    Actions actions = new Actions(getAppiumDriver());


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
        ReusableMethods.wait(1);
        hideKeyboard();
        ReusableMethods.wait(2);

    }

    @Given("Verifies username {string} in dashboard")
    public void verifies_username_in_dashboard(String userName) {
        ReusableMethods.wait(1);
        VerifyElementText(userName);
    }
    /***US 11   **/
    @Given("As a user muss be {string} phone and {string} password Login")
    public void as_a_user_muss_be_phone_and_password_login(String phoneNumber, String password) {
        card.Login(phoneNumber,password);
    }
    @Given("User clicks the button with itemName {string} and {string} and {string} added WishList")
    public void user_clicks_the_button_with_item_name_and_and_added_wish_list(String itemName, String reviews,String price) {
       xPathElementClick(itemName,reviews,price);
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
    public void user_confirms_that_categories_appear_on_the_screen(){
       // for (int i = 0; i <categoriesMen.size(); i++) {
        //    assertTrue(categoriesMen.get(i).);
      //  }
    }

    @Given("User clicks phone number textbox and {string} phone number")
    public void user_clicks_phone_number_textbox_and_phone_number(String phoneNumber) {
     card. ForgetPasswordPhoneBox(phoneNumber);
    }
    @Given("User clicks NewPasswordTextBox and confirmPasswordTextBox {string}")
    public void user_clicks_new_password_text_box_and_confirm_password_text_box(String newPassword) {
        card.NewPassword(newPassword);
    }
    @Given("User clicks tap coordinates {int}, {int}")
    public void user_clicks_tap_coordinates(Integer x, Integer y) {
        ReusableMethods.wait(1);
        OptionsMet.touchDown(x,y);
        ReusableMethods.wait(1);
    }
    @Given("User swipe to screen coordinates {int}, {int}, {int}, {int}")
    public void user_swipe_to_screen_coordinates(Integer x, Integer y, Integer endX, Integer endY) throws InvalidMidiDataException {
        OptionsMet.swipe(x,y,endX,endY);
        ReusableMethods.wait(2);
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
}

