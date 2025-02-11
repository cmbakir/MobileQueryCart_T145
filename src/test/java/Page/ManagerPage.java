package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import java.util.List;
import java.util.NoSuchElementException;

public class ManagerPage {

    public ManagerPage(){PageFactory.initElements(Driver.getWebdriver(),this);}

    public static void managerLogin(String managerLoginUrl, String managerEmail, String registeredPassword) {
        ManagerPage managerPage= new ManagerPage();
        Driver.getWebdriver().get(ConfigReader.getProperty(managerLoginUrl));
        managerPage.inputEmail.sendKeys(managerEmail);
        ReusableMethods.wait(1);
        managerPage.inputPassword.sendKeys(registeredPassword);
        managerPage.adminSignInButton.click();
        ReusableMethods.wait(1);
    }

    public static void clickActionButtonForPendingRows(WebDriver webdriver) {
        List<WebElement> rows = webdriver.findElements(By.xpath("//tr"));
        for (WebElement row : rows) {
            try {
                WebElement statusElement = row.findElement(By.xpath(".//td[2]"));
                String statusText = statusElement.getText().trim();
                // Eğer status "Pending" ise, action butonuna tıkla
                if (statusText.equalsIgnoreCase("Pending")) {
                    WebElement actionButton = row.findElement(By.xpath(".//button[contains(@class, 'db-table-action view')]"));
                    actionButton.click();
                    System.out.println("Pending satırı bulundu ve Action butonuna tıklandı.");
                }
            } catch (NoSuchElementException e) {
                System.out.println("Satırda 'Status' veya 'Action' butonu bulunamadı.");
            }
        }
    }

    @FindBy(xpath = "(//*[@class='w-full h-12 px-4 rounded-lg text-base border border-[#D9DBE9] hover:border-primary/30 focus-within:border-primary/30 transition-all duration-500'])[1]" )
    public WebElement inputEmail;

    @FindBy(xpath = "(//*[@class='w-full h-12 px-4 rounded-lg text-base border border-[#D9DBE9] hover:border-primary/30 focus-within:border-primary/30 transition-all duration-500'])[1]" )
    public WebElement inputPassword;

    @FindBy(xpath = "(//*[@class='font-bold text-center w-full h-12 leading-12 rounded-full bg-primary text-white capitalize mb-6'])[1]")
    public WebElement adminSignInButton;

    @FindBy(xpath = "(//*[@class='lab-line-user text-xl py-5'])[1]")
    public WebElement managerButton;

    @FindBy(xpath = "(//*[@class='text-sm font-medium capitalize whitespace-nowrap'])[1]")
    public WebElement dashboardButton;

    @FindBy(xpath = "(//*[@class='text-base flex-auto'])[1]")
    public WebElement onlineOrdersButton;

    @FindBy(xpath = "(//*[@class='flex items-center justify-center text-white gap-2 px-4 h-[38px] rounded shadow-db-card bg-[#2AC769]'])[1]")
    public WebElement acceptButton;

    @FindBy(xpath = "//*[@class='swal2-confirm swal2-styled']")
    public WebElement accept2button;

    @FindBy(xpath = "(//*[@class='text-sm capitalize appearance-none pl-4 pr-10 h-[38px] rounded border border-primary bg-white text-primary'])[2]")
    public WebElement dropdownMenu;

    @FindBy (xpath = "(//option[@value='10'])[2]")
    public WebElement labelDelivered;


}
