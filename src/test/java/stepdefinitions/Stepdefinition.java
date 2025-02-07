package stepdefinitions;

import Page.QueryCardPage;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.OptionsMet;
import utilities.ReusableMethods;


import javax.sound.midi.InvalidMidiDataException;

import static org.junit.Assert.*;
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
    @Given("User verifies the addressElement button is viewable and clickable")
    public void user_verifies_the_button_is_viewable_and_clickable() {

        assertTrue(card.addressElement.isDisplayed());
        assertTrue(card.addressElement.isEnabled());
        card.addressElement.click();

    }

    @Given("User verifies the addressEditButton button is viewable and clickable")
    public void user_verifies_the_buton_is_viewable_and_clickable() {

        assertTrue(card.addressEditButton.isDisplayed());
        assertTrue(card.addressEditButton.isEnabled());
        card.addressEditButton.click();
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
    @Given("User verifies that a success message appeared.")
    public void user_verifies_that_a_success_message_apeared() {

        assertTrue(card.labelSuccessMessageForAdress.isDisplayed());

        ReusableMethods.wait(2);

    }
    @Given("User verifies the addressDeleteButton button is viewable and clickable")
    public void user_verifies_the_address_delete_button_button_is_viewable_and_clickable() {

        assertTrue(card.addressDeleteButton.isDisplayed());
        assertTrue(card.addressDeleteButton.isEnabled());
        card.addressDeleteButton.click();
        ReusableMethods.wait(2);
    }




}

