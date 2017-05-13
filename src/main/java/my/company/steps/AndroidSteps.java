package my.company.steps;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

/**
 * Created by stepan on 04.01.17.
 */
public class AndroidSteps {

    private final RemoteWebDriver driver;

    public AndroidSteps(RemoteWebDriver driver) {
        this.driver = driver;
    }

    public void openVK() {
        driver.findElementsByClassName("android.widget.TextView").get(1).click();
    }
}
