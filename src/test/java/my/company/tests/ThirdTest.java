package my.company.tests;

import my.company.steps.CommonSteps;
import my.company.steps.DuckDuckGoSteps;
import my.company.steps.TestCases.WebDriverConstructor;
import org.junit.Test;

/**
 * Created by stepan on 27.12.16.
 */
public class ThirdTest extends WebDriverConstructor {

    private DuckDuckGoSteps steps = new DuckDuckGoSteps(driver);
    private CommonSteps commonSteps = new CommonSteps(driver);

    @Test
    public void searchTest() throws Exception {
        commonSteps.openMainPage("https://duckduckgo.com/");
        steps.enter("Not Allure Report");
        commonSteps.makeScreenShot();
        driver.quit();
    }

}
