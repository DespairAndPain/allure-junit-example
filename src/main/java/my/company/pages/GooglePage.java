package my.company.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

@Page(url="http://google.com")
public class GooglePage extends AbstractPage {

    public GooglePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "lst-ib")
    public WebElement searchField;

    @FindBy(css = ".rc")
    public WebElement resultFields;

    public GooglePage searchElement(CharSequence seq) {
        type(searchField, seq);
        return this;
    }
}
