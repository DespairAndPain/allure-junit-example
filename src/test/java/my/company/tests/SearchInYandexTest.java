package my.company.tests;

import my.company.steps.TestCases.DefaultTestCase;
import my.company.steps.YandexSteps;
import org.junit.Test;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;

@Features("Поиск")
@Stories("yandex.ru")
public class SearchInYandexTest extends DefaultTestCase {

    private YandexSteps steps = new YandexSteps(driver);

    @Test
    public void searchTest() throws Exception {
        steps.open();
        steps.search("Allure framework");
        steps.makeScreenShot();
    }
}

