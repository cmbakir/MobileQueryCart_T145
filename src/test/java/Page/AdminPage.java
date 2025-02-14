package Page;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.OptionsMet;
import utilities.ReusableMethods;

import java.util.List;

import static utilities.Driver.*;

public class AdminPage {

    //Actions action = new Actions(startActivity("com.android.chrome", "com.google.android.apps.chrome.Main", false));

    public AdminPage() {
        PageFactory.initElements(new AppiumFieldDecorator(getAppiumDriver2()), this);
    }

    /**
     * Manager paneline giriş yapan method (Appium ile mobil tarayıcı üzerinden)
     */

    public void managerLogin(String managerEmail, String managerPassword) {
        AndroidDriver driver = (AndroidDriver) getAppiumDriver2();

        // Chrome tarayıcısına geçiş
        Driver.startActivity("com.android.chrome", "com.google.android.apps.chrome.Main", false);

        // Admin login sayfasına git
        chromeSearchBox.click();
        //driver.get(ConfigReader.getProperty("managerLoginUrl"));
        urlbox.sendKeys(ConfigReader.getProperty("managerLoginUrl"));
        OptionsMet.touchDown(1245,2727);
        ReusableMethods.wait(13);

        // Giriş yap
        OptionsMet.touchDown(600,1000);
        ReusableMethods.wait(1);
        inputEmail.sendKeys(managerEmail);
        ReusableMethods.wait(2);
        OptionsMet.touchDown(600,1280);
        inputPassword.sendKeys(managerPassword);

        OptionsMet.touchDown(666,1577);
        //adminSignInButton.click();
        ReusableMethods.wait(9);
    }

    /**
     * Bekleyen siparişleri tespit eder ve action butonuna tıklar.
     */
/*


    public void clickActionButtonForPendingRows() {
        AndroidDriver driver = (AndroidDriver) getAppiumDriver();

        try {
            // Tüm sipariş satırlarını al
            List<WebElement> orderRows = driver.findElements(By.xpath("(//android.view.View[@content-desc=\"\"])[1]/android.view.View"));


            // Eğer sipariş yoksa hata mesajı ver
            if (orderRows.isEmpty()) {
                System.out.println("Sipariş listesi boş!");
                return;
            }

            for (WebElement row : orderRows) {
                try {
                    // Siparişin durumunu belirten hücreyi bul
                    WebElement statusElement = row.findElement(By.xpath(".//android.view.View[contains(@content-desc, 'Status:')]"));
                    String statusText = statusElement.getAttribute("content-desc").trim();

                    // Eğer sipariş "Pending" durumundaysa, işlem butonuna tıkla
                    if (statusText.contains("Pending")) {
                        WebElement actionButton = row.findElement(By.xpath(".//android.widget.Button[contains(@content-desc, 'Action')]"));
                        actionButton.click();
                        System.out.println("Pending sipariş bulundu ve Action butonuna tıklandı.");

                        // Sipariş işlemine girdikten sonra döngüden çık
                        return;
                    }
                } catch (Exception e) {
                    System.out.println("Sipariş satırında 'Status' veya 'Action' butonu bulunamadı. Devam ediliyor...");
                }
            }

            // Eğer hiç "Pending" sipariş yoksa uyarı ver
            System.out.println("Bekleyen (Pending) sipariş bulunamadı.");

        } catch (Exception e) {
            System.out.println("Bekleyen siparişleri işlerken hata oluştu: " + e.getMessage());
        }
    }


 */

    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id=\"com.android.chrome:id/search_box_text\"]")
    public WebElement chromeSearchBox;

    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id=\"com.android.chrome:id/url_bar\"]")
    public WebElement urlbox;

    // ======= Manager Giriş Elementleri =======
    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"formEmail\")")
    public WebElement inputEmail;

    @AndroidFindBy(uiAutomator ="new UiSelector().resourceId(\"formPassword\")")
    public WebElement inputPassword;

    @AndroidFindBy(xpath = "//android.widget.Button[@text=\"Sign In\"]")
    public WebElement adminSignInButton;

    // ======= Panel ve Dashboard Elementleri =======
    @AndroidFindBy(xpath = "//android.widget.Button[@text=\"\uE001 Profile\"]")
    public WebElement managerButton;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"\uE065 Dashboard\"]")
    public WebElement dashboardButton;

    @AndroidFindBy(xpath = "//android.widget.Button[@text=\"\uF036\"]")
    public WebElement sidebar;


    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Overview\"]")
    public WebElement onlineOrdersButton;

    @AndroidFindBy(xpath = "//android.widget.Button[@text=\"\uF00D\"]")
    public WebElement xbutton;

    // ======= Sipariş Yönetimi =======
    @AndroidFindBy(xpath = "//android.widget.Button[@text=\"\uE050 Accept\"]")
    public WebElement acceptButton;


    @AndroidFindBy(xpath = "//android.view.View[@text=\"Confirmed\"]")
    public WebElement dropdownMenu;

    @AndroidFindBy(xpath = "//android.widget.CheckedTextView[@resource-id=\"android:id/text1\" and @text=\"Delivered\"]")
    public WebElement labelDelivered;
}
