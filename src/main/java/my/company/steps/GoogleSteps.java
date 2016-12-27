package my.company.steps;

import com.google.common.base.Predicate;
import org.apache.commons.logging.LogFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.logging.Logger;

public class GoogleSteps {

    private Logger logger  = Logger.getLogger(LogFactory.class.getName());
    private final WebDriver driver;
    private final CommonSteps commonSteps;

    public GoogleSteps(WebDriver driver) {
        this.driver = driver;
        this.commonSteps = new CommonSteps(driver);
    }


    public void enter(String text) {
        logger.info("Enter text" + text);
        driver.findElement(By.id("lst-ib")).sendKeys(text + Keys.ENTER);
        logger.info("Wait for element");
        new WebDriverWait(driver, 10)
                .withMessage("Could not load results page")
                .until(mainContainLoaded());
    }

    private Predicate<WebDriver> mainContainLoaded() {
        return new Predicate<WebDriver>() {
            @Override
            public boolean apply(WebDriver input) {
                return driver.findElement(By.className("rc")).isDisplayed();
            }
        };
    }
}
