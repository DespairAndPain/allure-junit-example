package my.company.steps;

import com.google.common.base.Predicate;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.yandex.qatools.allure.annotations.Step;

@Slf4j
public class YandexSteps extends CommonSteps {

    private final WebDriver driver;

    public YandexSteps(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    @Step
    public void search(String text) {
        log.info("Enter text" + text);
        driver.findElement(By.id("text")).sendKeys(text);
        driver.findElement(By.className("suggest2-form__button")).submit();
        log.info("Wait for element");
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
