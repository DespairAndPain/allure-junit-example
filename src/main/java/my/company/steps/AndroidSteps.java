package my.company.steps;

import io.appium.java_client.AppiumDriver;
import my.company.pages.AbstractPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by stepan on 04.01.17.
 */
public class AndroidSteps {

    private final AppiumDriver<WebElement> driver;

    public AndroidSteps(AppiumDriver<WebElement> driver) {
        this.driver = driver;
    }

    public void openVK() {
        driver.findElementById("ru.zhuck.webapp:id/view_btn_bottom_icon_image").click();
        driver.findElementById("ru.zhuck.webapp:id/fragment_login_et_login").sendKeys("38355");
        driver.findElementById("ru.zhuck.webapp:id/fragment_login_et_password").sendKeys("Kyo8vd_u7o");
    }
}
