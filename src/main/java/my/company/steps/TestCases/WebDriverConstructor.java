package my.company.steps.TestCases;

import my.company.providers.SystemProvider;
import my.company.steps.enums.WebDriverTypes;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class WebDriverConstructor {

    private WebDriverTypes driverType;

    private WebDriverConstructor(WebDriverTypes type) {
        driverType = type;
    }

    static WebDriver driverFactory(WebDriverTypes types) {
        return new WebDriverConstructor(types).initWebDriver();
    }

    public WebDriver initWebDriver() {
        switch (driverType) {
            case REMOTE_CHROME:
                return getRemoteDriver();
            case CHROME:
                return new ChromeDriver(DesiredCapabilities.chrome());
            default:
                throw new Error("Cant find driver");
        }
    }

    private WebDriver getRemoteDriver() {
        URL url;
        try {
            url = new URL("http://" + SystemProvider.getHubURL() + ":4444/wd/hub");
        } catch (MalformedURLException e) {
            throw new Error(e);
        }
        System.out.println(url.toString());
        return new RemoteWebDriver(url, DesiredCapabilities.chrome());
    }
}
