package my.company.tests;

import my.company.steps.CommonSteps;
import my.company.steps.GoogleSteps;
import my.company.steps.TestCases.WebDriverConstructor;
import org.junit.Test;

public class SecondTest  extends WebDriverConstructor {


    private GoogleSteps steps = new GoogleSteps(driver);
    private CommonSteps commonSteps = new CommonSteps(driver);

    @Test
    public void searchTest() throws Exception {
        commonSteps.openMainPage("http://google.com");
        steps.enter("Not Allure Report");
        commonSteps.makeScreenShot();
        driver.quit();
    }
}
