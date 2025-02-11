package Hooks;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class hooks {

    private Process appiumProcess;

    @Before
    public void startAppiumServer() {
        try {
            ProcessBuilder builder = new ProcessBuilder("appium");
            appiumProcess = builder.start();
            System.out.println("Appium server başlatıldı...");
            Thread.sleep(5000); // Server'ın açılmasını beklemek için süre eklendi.
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    @After
    public void stopAppiumServer() {
        if (appiumProcess != null) {
            appiumProcess.destroy();
            System.out.println("Appium server kapatıldı...");
        }
    }
}


//