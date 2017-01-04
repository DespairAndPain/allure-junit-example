package my.company.tests;

import my.company.steps.AndroidSteps;
import my.company.steps.TestCases.AndroidTestCase;
import my.company.steps.TestCases.WebDriverConstructor;
import org.junit.Test;

/**
 * Created by stepan on 04.01.17.
 */
public class AndroidTest extends AndroidTestCase {

    private AndroidSteps androidSteps = new AndroidSteps(driver);

    @Test
    public void firstTest() {

        androidSteps.openVK();
    }

}
