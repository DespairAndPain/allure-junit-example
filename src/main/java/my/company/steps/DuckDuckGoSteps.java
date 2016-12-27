package my.company.steps;

import com.google.common.base.Predicate;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by stepan on 27.12.16.
 */
public class DuckDuckGoSteps {
    private final WebDriver driver;
    private final CommonSteps commonSteps;

    public DuckDuckGoSteps(WebDriver driver) {
        this.driver = driver;
        this.commonSteps = new CommonSteps(driver);
    }


    public void enter(String text) {
        driver.findElement(By.id("search_form_input_homepage")).sendKeys(text + Keys.ENTER);
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
