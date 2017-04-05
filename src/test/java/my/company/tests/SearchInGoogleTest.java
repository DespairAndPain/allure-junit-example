package my.company.tests;

import my.company.steps.CommonSteps;
import my.company.steps.GoogleSteps;
import my.company.steps.TestCases.WebDriverConstructor;
import org.junit.Test;

public class SearchInGoogleTest extends WebDriverConstructor {

    private GoogleSteps steps = new GoogleSteps(driver);

    @Test
    public void searchTest() throws Exception {
        steps.openMainPage("http://google.com");
        steps.enter("Not Allure Report");
        steps.makeScreenShot();
        driver.quit();
    }
}
