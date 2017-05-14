package my.company.steps.TestCases;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by stepan on 04.01.17.
 */
public class AndroidTestCase {

    protected final AppiumDriver<WebElement> driver = initWebDriver();

    protected AndroidDriver<WebElement> initWebDriver() {
        URL url;
        try {
            url = new URL("http://" + System.getProperty("selenium.url") + ":4444/wd/hub");
        } catch (MalformedURLException e) {
            throw new Error(e);
        }
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("version", "7.0.1");
        desiredCapabilities.setCapability("platform", "ANDROID");
        desiredCapabilities.setCapability("deviceName", "PixelXL");
        desiredCapabilities.setCapability("clearSystemFiles", "true");
        desiredCapabilities.setCapability("app", new File("/Gismeteo+v1.1.10.apk").getAbsolutePath());
        System.out.println(url.toString());
        return new AndroidDriver<>(url, desiredCapabilities);
    }

}
