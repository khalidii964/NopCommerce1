package Pages;

import Utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class noCommercePages {
    public noCommercePages() {
        PageFactory.initElements(WebDriverFactory.getDriver(), this);
    }
    // You can create your own

    @FindBy(xpath = ("("))
    public WebElement xxxxxxx;
    @FindBy (xpath = ("("))
    public WebElement xxxxxxxx;
    @FindBy (xpath = ("("))
    public WebElement xxxxxxxxx;


}