package my.company.steps.TestCases;

import my.company.providers.SystemProvider;
import my.company.steps.enums.WebDriverTypes;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

public class DefaultTestCase {

    protected WebDriver driver = WebDriverConstructor.driverFactory(SystemProvider.getDriverType());

    @After
    public void quit() {
        if (driver != null) driver.quit();
    }
}
