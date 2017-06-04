package my.company.steps;

import lombok.extern.slf4j.Slf4j;
import my.company.pages.YandexPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import ru.yandex.qatools.allure.annotations.Step;

@Slf4j
public class YandexSteps extends CommonSteps {

    private final YandexPage yandexPage;

    public YandexSteps(WebDriver driver) {
        super(driver);
        yandexPage = new YandexPage(driver);
    }

    @Step
    public void search(String text) {
        log.info("Enter text" + text);
        yandexPage.enterText(text);
        yandexPage.submitQuery();
        log.info("Wait for element");
        Assert.assertTrue(page.waitForElementPresent(yandexPage.resultFields));
    }

    @Override
    @Step
    public void open() {
        yandexPage.open();
    }
}
