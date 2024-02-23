package NopCommerce;

import Pages.noCommercePages;
import Utilities.ConfigReader;
import Utilities.UIHelpers;
import Utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class US_504 {
    /*
    AC_04:
1. I should be able to access the platform's homepage
2. I should be able to confirm the presence of the tab menu on the page and verify that its elements are listed.
3. I should be able to click on each element in the tab menu.
4. I should be confident that clicking on each element in the tab menu directs me to its respective page.
5. If a tab element contains submenus, I should be confident that each submenu is clickable and directs me to its respective page.
     */
    UIHelpers uiHelpers =new UIHelpers();
    noCommercePages noCommercePages=new noCommercePages();

    @BeforeMethod
    public void seetUp(){
        WebDriverFactory.getDriver().get(ConfigReader.getProperty("NopCommerce"));
    }
    @Test
    public void createListOfElements(){
        Actions actions = new Actions(WebDriverFactory.getDriver());
        actions.moveToElement(noCommercePages.computer).build().perform();

        for (int i = 0; i < noCommercePages.computerList.size(); i++) {
           noCommercePages.scrollToElement(noCommercePages.computer);
            actions.moveToElement(noCommercePages.computer).build().perform();
            noCommercePages.clickMethod(noCommercePages.computerList.get(i));
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        for (int i = 0; i < noCommercePages.electronicsList.size(); i++) {
            noCommercePages.scrollToElement(noCommercePages.electronics);
            actions.moveToElement(noCommercePages.electronics).build().perform();
            noCommercePages.clickMethod(noCommercePages.electronicsList.get(i));
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        for (int i = 0; i < noCommercePages.apparelList.size(); i++) {
            noCommercePages.scrollToElement(noCommercePages.apparel);
            actions.moveToElement(noCommercePages.apparel).build().perform();
            noCommercePages.clickMethod(noCommercePages.apparelList.get(i));
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }




    }
}
