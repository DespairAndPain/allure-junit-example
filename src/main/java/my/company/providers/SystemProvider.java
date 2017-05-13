package my.company.providers;

import my.company.steps.enums.WebDriverTypes;

import java.util.Arrays;

public class SystemProvider {

    private static final WebDriverTypes LOCAL_DRIVER_TYPE = WebDriverTypes.CHROME;
    private static final WebDriverTypes DRIVER_TYPE = Arrays.stream(WebDriverTypes.values())
            .filter(num -> num.name().equals(System.getProperty("browser.type", LOCAL_DRIVER_TYPE.name())))
            .findFirst().get();

    public static String getHubURL() {
        return System.getProperty("selenium.url", "192.168.99.100");
    }

    public static WebDriverTypes getDriverType() {
        return DRIVER_TYPE;
    }
}
