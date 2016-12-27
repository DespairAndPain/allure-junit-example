package my.company.steps;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import ru.yandex.qatools.allure.annotations.Attachment;
import ru.yandex.qatools.allure.annotations.Step;

public class CommonSteps {

    private final WebDriver driver;

    public CommonSteps(WebDriver driver) {
        this.driver = driver;
    }

    @Step
    public void openMainPage(String url) {
        driver.get(url);
    }

    @Attachment
    @Step("Make screen shot of results page")
    public byte[] makeScreenShot() {
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }

}
