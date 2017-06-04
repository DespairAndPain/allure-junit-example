package my.company.tests;

import my.company.steps.GoogleSteps;
import my.company.steps.TestCases.DefaultTestCase;
import org.junit.Test;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;

@Features("Поиск")
@Stories("google.com")
public class SearchInGoogleTest extends DefaultTestCase {

    private GoogleSteps steps = new GoogleSteps(driver);

    @Test
    public void searchTest() throws Exception {
        steps.open();
        steps.enter("Not Allure Report");
        steps.makeScreenShot();
    }
}
