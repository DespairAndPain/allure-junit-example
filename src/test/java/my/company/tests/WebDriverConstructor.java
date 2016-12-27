package my.company.tests;

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
            url = new URL("http://192.168.0.103:32769/wd/hub");
        } catch (MalformedURLException e) {
            throw new Error(e);
        }
        System.out.println(url.toString());
        return new RemoteWebDriver(url, DesiredCapabilities.firefox());
    }
}
