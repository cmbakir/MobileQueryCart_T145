package Page;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

import static utilities.Driver.getAppiumDriver;
import static utilities.Driver.startActivity;

public class AdminPage {

    AdminPage admin = new AdminPage();
    //Actions action = new Actions(startActivity("com.android.chrome", "com.google.android.apps.chrome.Main", false));

    public AdminPage() {
        PageFactory.initElements(new AppiumFieldDecorator(getAppiumDriver()), this);
    }

    /**
     * Manager paneline giriş yapan method (Appium ile mobil tarayıcı üzerinden)
     */
    public void managerLogin(String managerEmail, String managerPassword) {
        AndroidDriver driver = (AndroidDriver) getAppiumDriver();

        // Chrome tarayıcısına geçiş
        Driver.startActivity("com.android.chrome", "com.google.android.apps.chrome.Main", false);

        // Admin login sayfasına git
        driver.get(ConfigReader.getProperty("managerLoginUrl"));

        // Giriş yap
        inputEmail.sendKeys(managerEmail);
        ReusableMethods.wait(1);
        inputPassword.sendKeys(managerPassword);
        adminSignInButton.click();
        ReusableMethods.wait(2);
    }

    /**
     * Bekleyen siparişleri tespit eder ve action butonuna tıklar.
     */

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



    // ======= Manager Giriş Elementleri =======
    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id=\"formEmail\"]")
    public WebElement inputEmail;

    @AndroidFindBy(xpath ="//android.widget.EditText[@resource-id=\"formPassword\"]")
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
