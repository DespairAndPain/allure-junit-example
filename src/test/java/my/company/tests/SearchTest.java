package my.company.tests;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import my.company.steps.WebDriverSteps;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

/**
 * @author Dmitry Baev charlie@yandex-team.ru
 *         Date: 28.10.13
 */
public class SearchTest {

    private WebDriverSteps steps;

    @Before
    public void setUp() throws Exception {
        URL url = new URL("http://192.168.0.103:32768/wd/hub");
        System.out.println(url.toString());
        steps = new WebDriverSteps(new RemoteWebDriver(url, DesiredCapabilities.chrome()));
    }

    @Test
    public void searchTest() throws Exception {
        steps.openMainPage();
        steps.search("Allure framework");
        steps.makeScreenShot();
        steps.quit();
    }
}

