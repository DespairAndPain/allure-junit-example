package my.company.tests;

import my.company.steps.AndroidSteps;
import my.company.steps.TestCases.AndroidTestCase;
import org.junit.Test;


public class AndroidTest extends AndroidTestCase {

    private AndroidSteps androidSteps = new AndroidSteps(driver);

    @Test
    public void firstTest() {
        androidSteps.openVK();
    }
}
