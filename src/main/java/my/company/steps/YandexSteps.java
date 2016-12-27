package my.company.steps;

import com.google.common.base.Predicate;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.yandex.qatools.allure.annotations.Attachment;
import ru.yandex.qatools.allure.annotations.Step;

/**
 * The content of the following class is for demonstration purposes only.
 * In your project you should organize your code in the different way, an
 * example move all the selectors to separate place. Usually better to use
 * some other library to organize access to your service pages such as
 * Yandex HTMLElements.
 *
 * @author Dmitry Baev charlie@yandex-team.ru
 *         Date: 28.10.13
 */
public class YandexSteps {

    private final WebDriver driver;
    private final CommonSteps commonSteps;

    public YandexSteps(WebDriver driver) {
        this.driver = driver;
        this.commonSteps = new CommonSteps(driver);
    }

    @Step
    public void search(String text) {
        driver.findElement(By.id("text")).sendKeys(text);
        driver.findElement(By.className("suggest2-form__button")).submit();
        new WebDriverWait(driver, 10)
                .withMessage("Could not load results page")
                .until(mainContainLoaded());
    }

    public void quit() {
        driver.quit();
    }

    private Predicate<WebDriver> mainContainLoaded() {
        return new Predicate<WebDriver>() {
            @Override
            public boolean apply(WebDriver input) {
                return driver.findElement(By.className("main__content")).isDisplayed();
            }
        };
    }

}
