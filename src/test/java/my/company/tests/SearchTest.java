package my.company.tests;

import my.company.steps.CommonSteps;
import my.company.steps.TestCases.WebDriverConstructor;
import my.company.steps.YandexSteps;
import org.testng.annotations.Test;
/**
 * @author Dmitry Baev charlie@yandex-team.ru
 *         Date: 28.10.13
 */
public class SearchTest extends WebDriverConstructor {

    private YandexSteps steps = new YandexSteps(driver);
    private CommonSteps commonSteps = new CommonSteps(driver);

    @Test
    public void searchTest() throws Exception {
        commonSteps.openMainPage("http://ya.ru");
        steps.search("Allure framework");
        commonSteps.makeScreenShot();
        steps.quit();
    }
}

