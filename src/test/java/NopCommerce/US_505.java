package NopCommerce;

import Pages.noCommercePages;
import Utilities.ConfigReader;
import Utilities.UIHelpers;
import Utilities.WebDriverFactory;
import org.apache.logging.log4j.message.ReusableMessage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class US_505 {
UIHelpers uiHelpers= new UIHelpers();
    Pages.noCommercePages noCommercePages = new noCommercePages();
    @BeforeMethod
    public void AccessRegistrationPage(){
        // 1.Navigate to the registration page
        WebDriverFactory.getDriver().get(ConfigReader.getProperty("NopCommerce"));

    }
    @Test
    public void  VerifyClickableRegisterButton() {
        noCommercePages.ComputersButton.isDisplayed();
        uiHelpers.clickOnElementJsExecutor(noCommercePages.NotebooksButton);
       noCommercePages.LinesButton.click();
       uiHelpers.clickOnElementJsExecutor(noCommercePages.SearchStoreButton);
       noCommercePages.SearchStoreButton.sendKeys("Apple MacBook Pro 13-inch");
        noCommercePages.Search.click();
        noCommercePages.AppleMacBookPro.click();


    }
    }
