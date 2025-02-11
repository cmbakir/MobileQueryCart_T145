package stepdefinitions;

import Page.QueryCardPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.ConfigReader;
import utilities.OptionsMet;
import utilities.ReusableMethods;


import javax.sound.midi.InvalidMidiDataException;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static utilities.Driver.*;


public class Stepdefinition extends OptionsMet {
    QueryCardPage card = new QueryCardPage();
    Actions actions = new Actions(getAppiumDriver());
    AndroidDriver driver = (AndroidDriver) getAppiumDriver();

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
    public void user_verify_to_be_perform_add_to_cart_add_to_favorite_and_view() throws InvalidMidiDataException {
        ReusableMethods.wait(2);

        // Tüm ürünleri liste olarak al
        for (int i = 0; i <6 ; i++) {
            List<WebElement> products = driver.findElements(By.xpath("//android.view.View[@content-desc and @index='" + i + "']"));

            for (WebElement product : products) {
                String productName = product.getAttribute("content-desc");
                if (productName != null && !productName.trim().isEmpty()) {
                    System.out.println("Ürün: " + productName);
                    System.out.println(product.getSize());



                    // Ürünü tıklayarak detayına gir
                    touchDown(352, 909);
                   // product.click();
                    ReusableMethods.wait(2);

                    // "Add to Cart" butonunu bul ve tıkla
                    OptionsMet.swipe(700,2369,679,914);
                    card.iconMSize.click();
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
    }
}
