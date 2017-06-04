package my.company.steps;

import lombok.extern.slf4j.Slf4j;
import my.company.pages.GooglePage;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ru.yandex.qatools.allure.annotations.Step;
import ru.yandex.qatools.allure.annotations.Stories;

import java.util.function.Function;

@Slf4j
public class GoogleSteps extends CommonSteps {

    private final GooglePage googlePage;

    public GoogleSteps(WebDriver driver) {
        super(driver);
        googlePage = new GooglePage(driver);
    }

    public Function<WebElement, Boolean> waitT() {
        return page::waitForElementPresent;
    }

    @Step("Ищем")
    public void enter(String text) {
        log.info("Enter text" + text);
        googlePage.searchElement(text + Keys.ENTER);
        log.info("Wait for element");
        Assert.assertTrue(waitT().apply(googlePage.resultFields));
    }

    @Step("Открываем страницу google.com")
    public void open() {
        googlePage.open();
    }
}
