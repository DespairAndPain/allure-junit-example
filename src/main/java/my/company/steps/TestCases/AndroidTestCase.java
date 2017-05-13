package my.company.steps.TestCases;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by stepan on 04.01.17.
 */
public class AndroidTestCase {

    protected final RemoteWebDriver driver = initWebDriver();

    protected RemoteWebDriver initWebDriver() {
        URL url;
        try {
            url = new URL("http://" + System.getProperty("selenium.url") + ":4444/wd/hub");
        } catch (MalformedURLException e) {
            throw new Error(e);
        }
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("version", "6.0.1");
        desiredCapabilities.setCapability("platform", "ANDROID");
        desiredCapabilities.setCapability("deviceName", "nexus5");
        desiredCapabilities.setCapability("clearSystemFiles", "true");
        desiredCapabilities.setCapability("app", "C:\\Gismeteo+v1.1.9.apk");
        System.out.println(url.toString());
        return new AndroidDriver(url, desiredCapabilities);
    }

}
