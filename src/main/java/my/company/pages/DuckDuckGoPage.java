package my.company.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Page(url = "https://duckduckgo.com/")
public class DuckDuckGoPage extends AbstractPage {

    @FindBy(css = ".result__a")
    public WebElement searchResult;
    @FindBy(id = "search_form_input_homepage")
    public WebElement searchField;

    public DuckDuckGoPage(WebDriver driver) {
        super(driver);
    }

    public DuckDuckGoPage searchElement(CharSequence seq) {
        type(searchField, seq);
        return this;
    }
}
