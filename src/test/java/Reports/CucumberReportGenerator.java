package Reports;
import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
public class CucumberReportGenerator { //Json Raporu Html formatına çeviriyor. Test run edildikten sonra her rapor için bunu çalıştırmak gerekir.
    public static void main(String[] args) {
        File reportOutputDirectory = new File("target/cucumber-reports");
        List<String> jsonFiles = new ArrayList<>();
        jsonFiles.add("target/cucumber-reports/CucumberTestReport.json");
        Configuration config = new Configuration(reportOutputDirectory, "MobileQueryCart_T145");
        ReportBuilder reportBuilder = new ReportBuilder(jsonFiles, config);
        reportBuilder.generateReports();
    }
}