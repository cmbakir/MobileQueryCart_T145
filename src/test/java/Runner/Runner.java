package Runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty",
                "json:target/cucumber.json", "json:target/cucumber-reports/CucumberTestReport.json",},
        features = "src/test/resources/features",
        glue = {"stepdefinitions", "Hooks"},

        monochrome = true,
        tags = " @jenkins" ,

        dryRun = false



)
public class Runner {
}
