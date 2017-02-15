package my.company.steps.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class WebDriverConstructor {

    protected final WebDriver driver = initWebDriver();

    protected WebDriver initWebDriver() {
        URL url;
        try {
            url = new URL("http://" + System.getProperty("selenium.url") + ":4444/wd/hub");
        } catch (MalformedURLException e) {
            throw new Error(e);
        }
        System.out.println(url.toString());
        return new RemoteWebDriver(url, DesiredCapabilities.chrome());
    }
}
