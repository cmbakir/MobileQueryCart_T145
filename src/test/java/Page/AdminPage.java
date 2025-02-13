package Page;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

import static utilities.Driver.getAppiumDriver;

public class AdminPage {

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
            List<WebElement> orderRows = driver.findElements(By.xpath("//tr"));

            // Eğer sipariş yoksa hata mesajı ver
            if (orderRows.isEmpty()) {
                System.out.println("Sipariş listesi boş!");
                return;
            }

            for (WebElement row : orderRows) {
                try {
                    // Siparişin durumunu belirten hücreyi bul
                    WebElement statusElement = row.findElement(By.xpath(".//td[contains(@class, 'status-column')]"));
                    String statusText = statusElement.getText().trim();

                    // Eğer sipariş "Pending" durumundaysa, işlem butonuna tıkla
                    if (statusText.equalsIgnoreCase("Pending")) {
                        WebElement actionButton = row.findElement(By.xpath(".//button[contains(@class, 'db-table-action view')]"));
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
    @AndroidFindBy(xpath = "(//*[@class='w-full h-12 px-4 rounded-lg text-base border border-[#D9DBE9] hover:border-primary/30 focus-within:border-primary/30 transition-all duration-500'])[1]")
    public WebElement inputEmail;

    @AndroidFindBy(xpath = "(//*[@class='w-full h-12 px-4 rounded-lg text-base border border-[#D9DBE9] hover:border-primary/30 focus-within:border-primary/30 transition-all duration-500'])[2]")
    public WebElement inputPassword;

    @AndroidFindBy(xpath = "(//*[@class='font-bold text-center w-full h-12 leading-12 rounded-full bg-primary text-white capitalize mb-6'])[1]")
    public WebElement adminSignInButton;

    // ======= Panel ve Dashboard Elementleri =======
    @AndroidFindBy(xpath = "(//*[@class='lab-line-user text-xl py-5'])[1]")
    public WebElement managerButton;

    @AndroidFindBy(xpath = "(//*[@class='text-sm font-medium capitalize whitespace-nowrap'])[1]")
    public WebElement dashboardButton;

    @AndroidFindBy(xpath = "(//*[@class='text-base flex-auto'])[1]")
    public WebElement onlineOrdersButton;

    // ======= Sipariş Yönetimi =======
    @AndroidFindBy(xpath = "(//*[@class='flex items-center justify-center text-white gap-2 px-4 h-[38px] rounded shadow-db-card bg-[#2AC769]'])[1]")
    public WebElement acceptButton;

    @AndroidFindBy(xpath = "//*[@class='swal2-confirm swal2-styled']")
    public WebElement accept2button;

    @AndroidFindBy(xpath = "(//*[@class='text-sm capitalize appearance-none pl-4 pr-10 h-[38px] rounded border border-primary bg-white text-primary'])[2]")
    public WebElement dropdownMenu;

    @AndroidFindBy(xpath = "(//option[@value='10'])[2]")
    public WebElement labelDelivered;
}
