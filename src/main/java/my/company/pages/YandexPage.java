package my.company.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Page(url = "http://ya.ru")
public class YandexPage extends AbstractPage {
    public YandexPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "text")
    public WebElement textField;

    @FindBy(css = ".suggest2-form__button")
    public WebElement suggestForm;

    @FindBy(css = ".main__content")
    public WebElement resultFields;

    public void enterText(String text) {
        type(textField, text);
    }

    public void submitQuery() {
        submit(suggestForm);
    }
}
