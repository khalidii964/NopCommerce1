package NopCommerce;

import Pages.noCommercePages;
import Utilities.ConfigReader;
import Utilities.UIHelpers;
import Utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class US_506 {
    private WebDriver driver;
    UIHelpers uiHelpers = new UIHelpers();

    Pages.noCommercePages noCommercePages = new noCommercePages();

    @BeforeMethod
    public void setUp() {
        WebDriverFactory.getDriver().get(ConfigReader.getProperty("NopCommerce"));
        driver = WebDriverFactory.getDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/"); // Directly using the URL here
    }

    @Test
    public void testGiftCardSelectionAndAddition() {
        WebElement giftsTab = uiHelpers.waitForVisibility(driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Gift Cards']")), 10);
        uiHelpers.clickOnElementJsExecutor(giftsTab);

        WebElement scrollingDown = driver.findElement(By.xpath("//div[@class='item-grid']"));
        uiHelpers.scrollToElementJsExecutor(scrollingDown);

        WebElement firstGiftCard = uiHelpers.waitForVisibility(driver.findElement(By.xpath("(//a[contains(text(),'$25 Virtual Gift Card')])[2]")), 10);
        uiHelpers.clickOnElementJsExecutor(firstGiftCard);

        // Wait and scroll to the Add to Cart button
        WebElement scrollToAdd = uiHelpers.waitForVisibility(driver.findElement(By.xpath("//button[@id='add-to-cart-button-43']")), 10);
        uiHelpers.scrollToElementJsExecutor(scrollToAdd);

        // Attempt to add to cart, expecting to fill mandatory fields first
        uiHelpers.clickOnElementJsExecutor(scrollToAdd);

        // Fill in the mandatory fields
        driver.findElement(By.id("giftcard_43_RecipientName")).sendKeys("Someone");
        driver.findElement(By.id("giftcard_43_RecipientEmail")).sendKeys("someone@gmail.com");
        driver.findElement(By.id("giftcard_43_SenderName")).sendKeys("Polina");
        driver.findElement(By.id("giftcard_43_SenderEmail")).sendKeys("polya3hus@gmail.com");
        driver.findElement(By.id("giftcard_43_Message")).sendKeys("Happy B-Day from Polina :))");

        // Add the filled gift card to the cart again
        uiHelpers.clickOnElementJsExecutor(scrollToAdd);

        // Verify the product has been added to the shopping cart
        WebElement successNotification = uiHelpers.waitForVisibility(driver.findElement(By.xpath("//div[contains(@class, 'bar-notification success')]")), 10);
        Assert.assertTrue(successNotification.isDisplayed(), "The product has been added to your shopping cart.");
    }

    @AfterMethod
    public void tearDown() {
        WebDriverFactory.quitDriver();
    }
}
