package my.company.tests;

import my.company.steps.DuckDuckGoSteps;
import my.company.steps.TestCases.DefaultTestCase;
import org.junit.Test;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;

@Features("Поиск")
@Stories("duckduckgo.com")
public class SearchInDuckDuckGoTest extends DefaultTestCase {

    private DuckDuckGoSteps steps = new DuckDuckGoSteps(driver);

    @Test
    public void searchTest() throws Exception {
        steps.open();
        steps.enter("Not Allure Report");
        steps.makeScreenShot();
    }

}
