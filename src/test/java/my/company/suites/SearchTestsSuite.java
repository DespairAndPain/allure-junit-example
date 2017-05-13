package my.company.suites;

import my.company.tests.SearchInDuckDuckGoTest;
import my.company.tests.SearchInGoogleTest;
import my.company.tests.SearchInYandexTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({SearchInYandexTest.class,
        SearchInGoogleTest.class,
        SearchInDuckDuckGoTest.class})
public class SearchTestsSuite {
}
