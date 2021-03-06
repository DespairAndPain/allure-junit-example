package my.company.steps;

import lombok.extern.slf4j.Slf4j;
import my.company.pages.DuckDuckGoPage;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import ru.yandex.qatools.allure.annotations.Step;

/**
 * Created by stepan on 27.12.16.
 */
@Slf4j
public class DuckDuckGoSteps extends CommonSteps {

    private final DuckDuckGoPage duckDuckGoPage;

    public DuckDuckGoSteps(WebDriver driver) {
        super(driver);
        this.duckDuckGoPage = new DuckDuckGoPage(driver);
    }

    @Step("Ищем")
    public void enter(String text) {
        log.info("Enter text" + text);
        duckDuckGoPage.searchElement(text + Keys.ENTER);
        log.info("Wait for element");
        Assert.assertTrue(page.waitForElementPresent(duckDuckGoPage.searchResult));
    }

    @Step("Открываем страницу duckDuckGo.com")
    public void open() {
        duckDuckGoPage.open();
    }
}
