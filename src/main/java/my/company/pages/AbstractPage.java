package my.company.pages;

import lombok.Getter;
import my.company.steps.TestCases.WebDriverConstructor;
import my.company.steps.enums.WebDriverTypes;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

/**
 * Created by Stepan on 07.05.2017.
 */
public class AbstractPage {
    @Getter
    private final WebDriver driver;
    private final long DEFAULT_TIMEOUT = 10L;
    private final Integer DEFAULT_INT_TIMEOUT = 10;

    protected void type(WebElement element, CharSequence text) {
        element.sendKeys(text);
    }

    protected void submit(WebElement element) {
        element.submit();
    }

    public AbstractPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public Boolean waitForElementPresent(WebElement element) {
        return waitFor(ExpectedConditions.visibilityOf(element));
    }

    private Boolean waitFor(ExpectedCondition condition) {
        return waitFor(condition, DEFAULT_INT_TIMEOUT);
    }

    private Boolean waitFor(ExpectedCondition condition, Integer timeoutInSec) {

        WebDriverWait wait = new WebDriverWait(driver, timeoutInSec);
        getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        Boolean result = true;
        try {
            wait.until(condition);
        } catch (TimeoutException e) {
            result = false;
        } catch (Throwable t) {
            throw new Error(t);
        } finally {
            getDriver().manage().timeouts().implicitlyWait(DEFAULT_TIMEOUT, TimeUnit.SECONDS);
        }
        return result;
    }

    public void open() {
        getDriver().get(this.getClass().getAnnotation(Page.class).url());
    }

}
