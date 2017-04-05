package my.company.tests;

import my.company.steps.CommonSteps;
import my.company.steps.DuckDuckGoSteps;
import my.company.steps.TestCases.WebDriverConstructor;
import org.junit.Test;

public class SearchInDuckDuckGoTest extends WebDriverConstructor {

    private DuckDuckGoSteps steps = new DuckDuckGoSteps(driver);

    @Test
    public void searchTest() throws Exception {
        steps.openMainPage("https://duckduckgo.com/");
        steps.enter("Not Allure Report");
        steps.makeScreenShot();
        driver.quit();
    }

}
