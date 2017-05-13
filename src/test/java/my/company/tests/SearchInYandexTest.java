package my.company.tests;

import my.company.steps.CommonSteps;
import my.company.steps.TestCases.DefaultTestCase;
import my.company.steps.TestCases.WebDriverConstructor;
import my.company.steps.YandexSteps;
import org.junit.Test;

/**
 * @author Dmitry Baev charlie@yandex-team.ru
 *         Date: 28.10.13
 */
public class SearchInYandexTest extends DefaultTestCase {

    private YandexSteps steps = new YandexSteps(driver);

    @Test
    public void searchTest() throws Exception {
        steps.open();
        steps.search("Allure framework");
        steps.makeScreenShot();
    }
}

