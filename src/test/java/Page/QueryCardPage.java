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

   // @AndroidFindBy(xpath = "//*[contains(@content-desc, 'Success Login')]")
  //  public WebElement successMessageOzge;
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Success\n" +
            "Your payment has been confirmed\"]")
    public WebElement labelSuccessMessageForPayment;
    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Flower Print Foil T-shirt\n" +
            "0 (0  Reviews)\n" +
            "$65.00\")")
    public WebElement firstElementOfMostPopuler;
    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"M\")")
    public WebElement mSizeButton;
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(12)")
    public WebElement sepetIcon;
    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Pinar Cay\n" +
            "+615551212\n" +
            "pinar.user@querycart.com\n" +
            "Nieuwegein,Utrecht,NetherlandsThe,3437\n" +
            "Updated1\")")
    public WebElement LabelSecondAddress;
    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Confirm Order\")")
    public WebElement confirmOrderButton;
    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"#100225997\n" +
            "04:35 PM, 10-02-2025\n" +
            "Info: \n" +
            "1 Product\n" +
            "Delivery Status: \n" +
            "Pending\n" +
            "Payment Status: \n" +
            "Paid\n" +
            "Total: \n" +
            "$66.30\")")
    public WebElement firstOrderHistory;
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ScrollView\")")
    public WebElement orderDetailsTable;
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.view.View\").instance(4)")
    public WebElement invoiceTable;
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Error\n" +
            "Please select payment method.\"]")
    public WebElement labelErrorMessageForPaymentMethod;
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.view.View\").instance(15)")
    public WebElement stripeMethodCartBox;
    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"confirmBtn\")")
    public WebElement confirmbtnStripeMethod;
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Success\n" +
            "Your payment has been confirmed\"]")
    public WebElement labelSuccessMessageForOrder;
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Thank you for your order!\n" +
            "Your order is confirmed.\"]")
    public WebElement labelThankYouForYourOrder;












    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(2)")
    private WebElement iconFilter;
    @AndroidFindBy (uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(0)")
    private WebElement categoryBackButton;



    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Error\n" +
            "Invalid credentials or you are blocked\"]")
    public WebElement labelErrorMessageForSigningIn;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.view.View\").instance(4)")
    public WebElement labelSuccessMessageForSigningIn;

    @AndroidFindBy (uiAutomator = "new UiSelector().description(\"Category\")")
    private WebElement buttonWomenCategory;

    @AndroidFindBy (xpath = "//android.view.View[@content-desc=\"Women\"]")
    private WebElement labelWomenInCategory;

    @AndroidFindBy (uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(3)")
    private WebElement iconWomenSubCategory;

    @AndroidFindBy (xpath = "//android.view.View[@content-desc=\"Women Clothing\"]")
    private WebElement labelWomenClothing;

    @AndroidFindBy (xpath = "//android.view.View[@content-desc=\"Women Shoes\"]")
    private WebElement labelWomenShoes;

    @AndroidFindBy (xpath = "//android.view.View[@content-desc=\"Women Accessories\"]")
    private WebElement labelWomenAccessories;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Success\n" +
            "Login Successfully.\"]")
    public WebElement successMessageOzge;

    @AndroidFindBy (uiAutomator = "new UiSelector().description(\"M\")")
    public WebElement iconMSize;
























    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(5)")
    private WebElement cartButton;
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(1)")
    private WebElement searchBoxButton;
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\")")
    private WebElement searchBox;


    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(1)")
    private WebElement checkBoxRememberMe;
    // Sign In Page

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(0)")
    private WebElement nameTextBox;
    // Sign Up Page


    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(1)")
    private WebElement emailSignUpBox;


    //@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(1)")
    //private WebElement emailTextBox;
    // Sign Up Page

    @AndroidFindBy (className = "android.view.View)")

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

    //@AndroidFindBy(uiAutomator = "new UiSelector().description(\"Add Address\")")
    //public WebElement addAddressButton;

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

    //Suleyman
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Success\n" +
            "Register Successfully.\"]")
    private WebElement successMassage;
    @AndroidFindBy(accessibility = "*Use Email Instead")
    private WebElement useEmailInst;
    @AndroidFindBy(xpath ="//android.view.View[@content-desc=\"Error\n" +
            "The phone field must be at least 7 characters.\"]")
    private WebElement errorMassagePhone;
    @AndroidFindBy(xpath= "//android.view.View[@content-desc=\"This field is required\"]")
    private WebElement errorWritingNameandPhone;
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Passord is required\"]")
    private WebElement errorWritingPassword;
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Email is required\"]")
    private WebElement errorWritingEmail;
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Enter Valid Email Address\"]")
    private WebElement errorWritingFalseEmail;
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(0)")
    private WebElement returnButton;
   //@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(2)")
   // private WebElement PasswordBox;
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(1)")
    private WebElement PhoneandEmailBox;
   // @AndroidFindBy(accessibility = "Sign Up")
  // private WebElement signUpButton;
    @AndroidFindBy(accessibility = "Juniors")
    private WebElement bodyJuniorsCatgr;
    @AndroidFindBy(accessibility = "Juniors Clothing")
    private WebElement bodyJuniorsClothingAltCatgr;
    @AndroidFindBy(accessibility = "Juniors Sleepwear")
    private WebElement bodyJuniorsSleepwearAltCatgr;
    @AndroidFindBy(accessibility = "Juniors Shoes")
    private WebElement bodyJuniorsShoesAltCatgr;
    @AndroidFindBy(accessibility = "Juniors Accessories")
    private WebElement bodyJuniorsAccessoriesAltCatgr;
    @AndroidFindBy(accessibility = "Juniors Bags")
    private WebElement bodyJuniorsBagsAltCatgr;
    @AndroidFindBy(accessibility = "Juniors Hat & Beres")
    private WebElement bodyJuniorsHatAltCatgr;
    @AndroidFindBy(accessibility = "Category")
    private WebElement categoryButton;
    @AndroidFindBy(accessibility = "Juniors")
    private WebElement juniorsButton;
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Add\n" +
            "Added to Wishlist\"]")
    private WebElement SuccessAddWishlist;
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Wishlist\"]")
    private WebElement wishlistviewTitle;
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Success\n" +
            "Product added to cart\"]")
    private WebElement SuccessPruductAddToCart;
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(3)")
    private WebElement productAddWishlist;
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(24)")
    private WebElement productNewAddWishlist;
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Capacity Large Student Backpack\n" +
            "0 (0  Reviews)\n" +
            "$15.00\"]")
    private WebElement producktCapLargClick;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Black\")")
    private WebElement productSelectColor;
    @AndroidFindBy(accessibility = "Add To Cart")
    private WebElement addToCart;
    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Favorite\"]")
    private WebElement addWishlistFavorite;
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(2)")
    private WebElement filtreIkon;
    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Wishlist\"]")
    private WebElement Wishlist;
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(12)")
    private WebElement carttoButton;
    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(0)")
    private WebElement nameBoxElement;
    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Sign Up\").instance(1)")//new UiSelector().description("Sign Up").instance(1)
    private WebElement signUpLoginButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Change Password\")")
    public WebElement changePassword;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(0)")
    public WebElement oldPasswordbox;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(1)")
    public WebElement newPasswordbox;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(2)")
    public WebElement confirmPasswordbox;

    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Save Changes\")")
    public WebElement saveChangesPassw;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"Change Password\n" +
            "Password Updated Successfully\"]")
    public WebElement successPass;

































































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
    }





}






