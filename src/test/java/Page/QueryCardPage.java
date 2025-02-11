package Page;


import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import lombok.Getter;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import utilities.ConfigReader;
import utilities.ReusableMethods;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertTrue;
import static utilities.Driver.getAppiumDriver;

@Getter
public class QueryCardPage {
    public QueryCardPage() {
        PageFactory.initElements(new AppiumFieldDecorator(getAppiumDriver()), this);

    }

    @AndroidFindBy(xpath = "(//android.widget.ImageView[1])[1]")
    private WebElement queryCardLogoElement;
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



    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Details\")")
    public WebElement detailsbutton;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Videos\")")
    public WebElement videosbutton;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Review\")")
    public WebElement reviewbutton;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Shipping & Return\").instance(0)")
    public WebElement shipReturnbutton;



    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Flower Print Foil T-shirt\").instance(1)")
    public WebElement detailscontent;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Product Videos\")")
    public WebElement detailsvideos;


    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.view.View\").instance(28)")
    public WebElement detailreviewstar;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"0\").instance(1)")
    public WebElement detailreview2;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"(0  Reviews)\").instance(1)")
    public WebElement detailreview3;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Shipping & Return\").instance(1)")
    public WebElement detailsShipReturn;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(2)")
    public WebElement whiteHeart;


    @AndroidFindBy(xpath = "(//*[@index='2'])[1]")
    public WebElement wishquant;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(12)")
    public WebElement addcartbag;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Pick Up\")")
    public WebElement pickup;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Delivery\")")
    public WebElement delivery;


    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Shipping Address\"]")
    public WebElement shippingAddress;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"caner oz\n" +
            "+935556677\n" +
            "caner@hotmail.com\n" +
            "Annaba,AnnabaProvince,Algeria,\n" +
            "zuhuratbaba\")")
    public WebElement customeraddress;



    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Save shipping address as a billing address.\")")
    public WebElement billingsavetitle;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(4)")
    public WebElement billingsavebutton;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Billing Address\")")
    public WebElement billingaddresstitle;


    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Apply Promo, Coupon or Voucher\n" +
            "Get discount with your order\")")
    public WebElement discountCouponTitle;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Enter Code\")")
    public WebElement couponEnterCodeTitle;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\")")
    public WebElement couponEditBox;


    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Coupon & Vouchers for you\")")
    public WebElement couponForYouTitle;


    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Order Summary\")")
    public WebElement orderSummaryTitle;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Save & Pay\")")
    public WebElement savePay;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Edit\")")
    public WebElement editAdrButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(1)")
    public WebElement editWriButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Update Address\").instance(0)")
    public WebElement updateAdrTitle;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"caner oz\")")
    public WebElement updateadrnamebox;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(2)")
    public WebElement updateadrDeleteBut;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(0)")
    public WebElement backButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Add\")")
    public WebElement shipAddButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Add Address\")")
    public WebElement addAddressButton;


    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(0)")
    public WebElement addAddressNameBox;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Country\")")
    public WebElement addAddressCountry;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\")")
    public WebElement addAddressCountrybox;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Turkey\")")
    public WebElement addAddressCountryboxTurkey;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"State\")")
    public WebElement addAddressState;


    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\")")
    public WebElement addAddressStatebox;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Ankara Province\")")
    public WebElement addAddressStateboxAnkara;


    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"City\")")
    public WebElement addAddressCity;


    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\")")
    public WebElement addAddressCitybox;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Çankaya\")")
    public WebElement addAddressCityCankaya;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"cihan öztürk\n" +
            "+935556661122\n" +
            "cihan@hotmail.com\n" +
            "Çankaya,AnkaraProvince,Turkey,\n" +
            "Cinnah Caddesi No : 18/7\")")
    public WebElement addedAddress;


    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Delete\")")
    public WebElement updateDeleteButton;



    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"+93\")")
    public WebElement countryCode;


    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Success\n" +
            "Address Deleted Successfully!\"]")
    public WebElement deletedAddSuccess;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Success\n" +
            "Address Updated Successfully!\"]")
    public WebElement updatedAddSuccess;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Success\n" +
            "Address Added Successfully!\"]")
    public WebElement addedAddSuccess;


    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Add\n" +
            "    Added to Wishlist\"]")
    public WebElement addedWish;



    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Remove\n" +
            "    Removed from Wishlist\"]")
    public WebElement removedWish;

























































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



}






