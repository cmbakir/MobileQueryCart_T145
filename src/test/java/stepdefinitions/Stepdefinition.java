package stepdefinitions;

import Page.QueryCardPage;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.OptionsMet;
import utilities.ReusableMethods;


import javax.sound.midi.InvalidMidiDataException;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static utilities.Driver.getAppiumDriver;
import static utilities.Driver.quitAppiumDriver;

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

    @Given("User verifies that {string} menu title on the homepage")
    public void user_verifies_that_menu_title_on_the_homepage(String string) {

    }

    @Given("User verifies that {string} icon on the homepage")
    public void user_verifies_that_icon_on_the_homepage(String string) {

    }

    @Given("User verifies the {string} button is enabled")
    public void user_verifies_the_button_is_enabled(String string) {

    }

    @Given("User verifies that most popular items are listed when clicked the see all button")
    public void user_verifies_that_most_popular_items_are_listed_when_clicked_the_see_all_button() {

    }

    @Given("User verifies that the back button is enabled and navigated to homepage after clicking")
    public void user_verifies_that_the_back_button_is_enabled_and_navigated_to_homepage_after_clicking() {

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

            if (visibleCategories.size() >= TOTAL_CATEGORIES) {
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




}

