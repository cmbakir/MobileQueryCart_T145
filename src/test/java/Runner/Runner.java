package Runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty",
                "json:target/cucumber.json", "json:target/cucumber-reports/CucumberTestReport.json",},//json rapor almak için "json:target/cucumber-reports/CucumberTestReport.json" eklendi.
        features = "src/test/resources/features",
        glue = {"stepdefinitions", "Hooks"},//Appium server ı otomatik çalıştırmak için buraya hooks eklendi
        monochrome = true,//Rapor için eklendi
        tags = " @TP_01" ,
        dryRun = false

)
public class Runner {
}
