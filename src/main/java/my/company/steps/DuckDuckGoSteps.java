package my.company.steps;

import com.google.common.base.Predicate;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.logging.LogFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.logging.Logger;

/**
 * Created by stepan on 27.12.16.
 */
@Slf4j
public class DuckDuckGoSteps extends CommonSteps {

    private final WebDriver driver;
    private final CommonSteps commonSteps;

    public DuckDuckGoSteps(WebDriver driver) {
        super(driver);
        this.driver = driver;
        this.commonSteps = new CommonSteps(driver);
    }


    public void enter(String text) {
        log.info("Enter text" + text);
        driver.findElement(By.id("search_form_input_homepage")).sendKeys(text + Keys.ENTER);
        log.info("Wait for element");
        new WebDriverWait(driver, 10)
                .withMessage("Could not load results page")
                .until(mainContainLoaded());
    }

    private Predicate<WebDriver> mainContainLoaded() {
        return new Predicate<WebDriver>() {
            @Override
            public boolean apply(WebDriver input) {
                return driver.findElement(By.className("result__a")).isDisplayed();
            }
        };
    }
}
