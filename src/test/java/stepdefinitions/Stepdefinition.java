package stepdefinitions;

import Page.ManagerPage;
import Page.QueryCardPage;

import io.appium.java_client.MobileBy;
import io.appium.java_client.pagefactory.AndroidFindBy;


import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.ConfigReader;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;

import io.cucumber.java.en.Then;


import org.junit.Assert;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import utilities.Driver;
import utilities.OptionsMet;
import utilities.ReusableMethods;



import javax.sound.midi.InvalidMidiDataException;


import java.sql.DriverManager;
import java.util.ArrayList;


import java.time.Duration;


import static Page.ManagerPage.clickActionButtonForPendingRows;
import static org.junit.Assert.*;
import static utilities.Driver.*;


import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Stepdefinition extends OptionsMet {
    QueryCardPage card = new QueryCardPage();
    Actions actions = new Actions(getAppiumDriver());


    private final int TOTAL_CATEGORIES = 44;
    private Set<String> visibleCategories = new HashSet<>();

    @Given("User makes driver adjustments")
    public void user_makes_driver_adjustments() {
        getAppiumDriver();
    }

    @Given("User confirms to be on the homepage")
    public void user_confirms_to_be_on_the_homepage() {
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
        actions.sendKeys("Wise123*").perform();
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
        ReusableMethods.wait(3);
        assertTrue(card.getCheckBoxRememberMe().isEnabled());


    }

    @Given("Verifies to access to the forgot password page when it clicked")
    public void verifies_to_access_to_the_forgot_password_page_when_it_clicked() {
        clickButtonByDescription("Forgot Password");
        getAppiumDriver().navigate().back();

    }

    @Given("Verifies to switch to the Register page from Log In Page")
    public void verifies_to_switch_to_the_register_page_from_log_in_page() {
        clickButtonByDescription("Sign Up");
        clickButtonByDescription("*Use Email Instead");


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
        ReusableMethods.wait(10);
        //assertTrue(card.getAlertSuccessMessageForSigningUp().getAttribute("content-desc").contains("Success"));
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
    public void user_verifies_the_button_is_viewable_and_clickable(String string) {

        OptionsMet.viewAndClick("Address");


    }

    @Given("User verifies the addressEditButton button is viewable and clickable")
    public void user_verifies_the_buton_is_viewable_and_clickable() {

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
        ReusableMethods.wait(2);


    }

    @Given("User verifies that a success message for updating appeared.")
    public void user_verifies_that_a_success_message_appeared() {

        assertTrue(card.labelSuccessMessageForUpdatingAddress.getAttribute("content-desc").contains("Successfully"));
        ReusableMethods.wait(2);

    }

    @Given("User verifies the addressDeleteButton button is viewable and clickable")
    public void user_verifies_the_address_delete_button_button_is_viewable_and_clickable() {

        assertTrue(card.addressDeleteIcon.isDisplayed());
        assertTrue(card.addressDeleteIcon.isEnabled());
        card.addressDeleteIcon.click();
        ReusableMethods.wait(2);
        OptionsMet.viewAndClick("Delete");

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
        card.clickFilterCloseButton();
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


    @Given("User verifies that {string}, {string}, {string} is displayed")
    public void user_verifies_that_is_displayed(String description1, String description2, String description3) {

        ReusableMethods.wait(3);

        VerifyElementText(description1);
        VerifyElementText(description2);
        VerifyElementText(description3);
    }

    @Given("User verifies that the Filter button is displayed and clicks it")
    public void user_verifies_that_the_filter_button_is_displayed_and_clicks_it() {
        ReusableMethods.wait(2);
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

  
}