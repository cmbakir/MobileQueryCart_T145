package Page;



import com.github.javafaker.Faker;

import io.appium.java_client.MobileBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.cucumber.java.bs.A;
import lombok.Getter;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import utilities.ConfigReader;
import utilities.OptionsMet;
import utilities.ReusableMethods;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertTrue;
import static utilities.Driver.getAppiumDriver;

@Getter
public class QueryCardPage {

    Actions actions = new Actions(getAppiumDriver());
    Faker faker=new Faker();
    public QueryCardPage() {
        PageFactory.initElements(new AppiumFieldDecorator(getAppiumDriver()), this);

    }

    @AndroidFindBy(xpath = "(//android.widget.ImageView[1])[1]")
    public WebElement queryCardLogoElement;
    @AndroidFindBy(xpath = "(//android.widget.ImageView[1])[2]")
    private WebElement searchBoxElement;
    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Sign In\").instance(1)")
    private WebElement signInLoginButton;
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(0)")
    private WebElement phoneTextBox;
    @AndroidFindBy(accessibility = "See All")
    private WebElement seeAllIconElement;
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(1)")
    private WebElement passwordTextBox;
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(2)")
    private WebElement rememberMeCheckBox;
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.view.View\").instance(4)")
    private WebElement addWishListToast;
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.view.View\").instance(9)")
    private List<WebElement> categories;
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\")")
    private WebElement forgotPssPhoneBox;
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(0)")
    private WebElement newPasswordBox;
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(1)")
    private WebElement confirmPasswordBox;
    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"See All\")")
    public WebElement seeAllButton;
    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Most Popular\")")
    public WebElement labelMostPopular;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"(8 Products Found)\"]")
    public WebElement labelProductFound;
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(0)")
    public WebElement buttonBack;
    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"*Use Email Instead\")")
    public WebElement buttonUseEmailInstead;
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(0)")
    private WebElement emailTextBox;
    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Address\")")
    public WebElement addressElement;
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(1)")
    public WebElement addressEditIcon;
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(2)")
    public WebElement addressDeleteIcon;
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(4)")
    public WebElement streetaddressBox;
    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Update Address\").instance(1)")
    public WebElement updateAdressButton;
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Success\n" +
            "Address Updated Successfully!\"]")
    public WebElement labelSuccessMessageForUpdatingAddress;
    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Add New Address\")")
    public WebElement addNewAddressButton;
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(0)")
    public WebElement fullNameTextBox;
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(1)")
    public WebElement addNewAddressEmailTextBox;
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(2)")
    public WebElement addNewAddressPhoneTextBox;
    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Country\")")
    public WebElement countryDropDownMenu;
    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"State\")")
    public WebElement stateDropDownMenu;
    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"City\")")
    public WebElement cityDropDownMenu;
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(3)")
    public WebElement zipCodeTextBox;
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(4)")
    public WebElement streetAddressTextBox;
    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Add Address\")")
    public WebElement addAddressButton;
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\")")
    public WebElement addressDropDownSearchBox;
    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Turkey\")")
    public WebElement firstOptionOfCountryDropDown;
    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Istanbul Province\")")
    public WebElement firstOptionOfStateDropDown;
    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Istanbul\")")
    public WebElement firstOptionOfCityDropDown;
    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Delete\")")
    public WebElement addressDeleteButton;
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Success\n" +
            "Address Added Successfully!\"]")
    public WebElement labelSuccessMessageForAddingAddress;
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Success\n" +
            "Address Deleted Successfully!\"]")
    public WebElement labelSuccessMessageForDeletingAddress;
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(2)")
    private WebElement iconFilter;
    @AndroidFindBy (uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(0)")
    private WebElement categoryBackButton;
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(0)")
    private WebElement filterCloseButton;






















    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(5)")
    private WebElement cartButton;
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(1)")
    private WebElement searchBoxButton;
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\")")
    private WebElement searchBox;


    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(2)")
    private WebElement checkBoxRememberMe;
    // Sign In Page

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(0)")
    private WebElement nameTextBox;
    // Sign Up Page


    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(1)")
    //private WebElement emailTextBox;
    // Sign Up Page

    @AndroidFindBy (uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(2)")
    private WebElement passwordTextBox2;
    // Sign Up Page

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Sign Up\").instance(1)")
    private WebElement signUpButton;
    // Sign Up Page

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Success\n" +
            "Register Successfully.\"]")
    private WebElement alertSuccessMessageForSigningUp;
    // Sign Up Page

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"*Use Email Instead\"]")
    private WebElement itemUseEmailInstead;

    @AndroidFindBy(xpath = "//android.widget.ScrollView/android.widget.EditText[1]")
    private WebElement EmailBox;

    @AndroidFindBy(xpath = "//android.widget.ScrollView/android.widget.EditText[2]")
    private WebElement PasswordBox;

    //@AndroidFindBy(xpath = "(//android.view.View[@content-desc=\"Sign In\"])[2]")
    //private WebElement signInLoginButton;


    //OrderHistory
    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"#1102251000\n" +
            "02:36 AM, 11-02-2025\n" +
            "Info: \n" +
            "1 Product\n" +
            "Delivery Status: \n" +
            "Pending\n" +
            "Payment Status: \n" +
            "Paid\n" +
            "Total: \n" +
            "$110.98\")")
    private WebElement firstOrderDetailsButton;
    public void firstOrderDetailsButton(){
    }

    //OrderHistory
    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Cancel Order\")")
    private WebElement CancelOrderButton;

    //OrderHistory
    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Download Receipt\")")
    private WebElement downloadReceiptButton;


    public void LogoGorunurTest() {

        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        assertTrue(queryCardLogoElement.isDisplayed());
        queryCardLogoElement.click();
    }

    public void Login(String phoneNumber, String password) {
        Actions actions = new Actions(getAppiumDriver());
        phoneTextBoxClickAndSendKeys(ConfigReader.getProperty(phoneNumber));
        // Telefon numarası alanından sonra Tab ile şifre alanına geç
        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys(ConfigReader.getProperty(password)).perform();
        ReusableMethods.wait(1);
        // Şifre alanından sonra Tab ile "remember me" checkbox'ına geç
        actions.sendKeys(Keys.TAB).perform();
        signInLoginClick();
    }

    public void LoginWithEmail(String registeredEmail, String registeredPassword) {
        Actions actions = new Actions(getAppiumDriver());
        phoneTextBoxClickAndSendKeys(ConfigReader.getProperty(registeredEmail));
        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys(ConfigReader.getProperty(registeredPassword)).perform();
        ReusableMethods.wait(1);
        actions.sendKeys(Keys.TAB).perform();
        signInLoginClick();
    }


    public void SearchBoxGorunurlukClickTest() {
        assertTrue(searchBoxElement.isDisplayed());
        searchBoxElement.click();
    }

    public void phoneTextBoxClickAndSendKeys(String phoneNumber) {
        assertTrue(phoneTextBox.isDisplayed());
        phoneTextBox.click();
        phoneTextBox.sendKeys(phoneNumber);
    }

    public void signInLoginClick() {
        assertTrue(signInLoginButton.isDisplayed());
        signInLoginButton.click();
    }

    public void wishListToast() {
        System.out.println(addWishListToast.getText());
        assertTrue(addWishListToast.isEnabled());
    }

    public void ForgetPasswordPhoneBox(String phoneNumber) {
        assertTrue(forgotPssPhoneBox.isDisplayed());
        assertTrue(forgotPssPhoneBox.isEnabled());
        forgotPssPhoneBox.click();
        forgotPssPhoneBox.sendKeys(phoneNumber);

    }

    public void NewPassword(String newPassword) {
        assertTrue(newPasswordBox.isDisplayed());
        assertTrue(newPasswordBox.isEnabled());
        newPasswordBox.click();
        newPasswordBox.sendKeys(newPassword);
        assertTrue(confirmPasswordBox.isDisplayed());
        assertTrue(confirmPasswordBox.isEnabled());
        confirmPasswordBox.click();
        confirmPasswordBox.sendKeys(newPassword);

    }
    public void emailTextBoxClickAndSendKeys(String email) {
        buttonUseEmailInstead.click();
        assertTrue(emailTextBox.isDisplayed());
        emailTextBox.click();
        emailTextBox.sendKeys(email);

    }









    public void cartButtonVisibilityTest(){
        assertTrue(cartButton.isDisplayed());
    }

    public void cartButtonClick(){
        cartButton.click();
        ReusableMethods.wait(1);
    }

    public void searchBoxButtonVisibilityTest(){
        assertTrue(searchBoxButton.isDisplayed());
    }

    public void searchBoxButtonClick(){
        searchBoxButton.click();
        ReusableMethods.wait(1);
    }

    public void searchBoxSendKeys(String keys){
        searchBox.click();
        ReusableMethods.wait(1);

        searchBox.sendKeys(keys);
        ReusableMethods.wait(1);

        Actions actions = new Actions(getAppiumDriver());
        actions.sendKeys(Keys.ENTER).perform();
        ReusableMethods.wait(1);
    }

    public void addNewAddress () throws InterruptedException {

        fullNameTextBox.click();
        fullNameTextBox.sendKeys(faker.name().fullName());
        actions.sendKeys(Keys.TAB).perform();
        addNewAddressEmailTextBox.sendKeys(faker.internet().emailAddress());
        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys(Keys.TAB).perform();
        ReusableMethods.wait(1);
        addNewAddressPhoneTextBox.sendKeys(faker.numerify("##########"));
        countryDropDownMenu.click();
        addressDropDownSearchBox.click();
        addressDropDownSearchBox.sendKeys("Turkey");
        firstOptionOfCountryDropDown.click();
        stateDropDownMenu.click();
        addressDropDownSearchBox.click();
        addressDropDownSearchBox.sendKeys("Istanbul Province");
        ReusableMethods.wait(1);
        firstOptionOfStateDropDown.click();
        ReusableMethods.wait(1);
        cityDropDownMenu.click();
        addressDropDownSearchBox.click();
        addressDropDownSearchBox.sendKeys("Istanbul");
        firstOptionOfCityDropDown.click();
        ReusableMethods.wait(1);
        zipCodeTextBox.click();
        zipCodeTextBox.sendKeys(faker.numerify("#####"));
        ReusableMethods.wait(1);
        actions.sendKeys(Keys.TAB).perform();
        ReusableMethods.wait(2);
        streetaddressBox.sendKeys(faker.address().streetAddress());
        actions.sendKeys(Keys.TAB).perform();
        ReusableMethods.wait(2);
        addAddressButton.click();
    }

    public void verifySuccessMessage(WebElement element){

        assertTrue (element.getAttribute("content-desc").contains("Successfully"));
    }

    public void verifyIconFilter(){
        Assert.assertTrue(iconFilter.isDisplayed());
        iconFilter.click();
        ReusableMethods.wait(2);
    }

    public void clickCategoryBackButton(){
        ReusableMethods.wait(1);
        categoryBackButton.click();
        ReusableMethods.wait(1);
    }

    public void clickFilterCloseButton(){
        ReusableMethods.wait(1);
        filterCloseButton.click();
    }

}






