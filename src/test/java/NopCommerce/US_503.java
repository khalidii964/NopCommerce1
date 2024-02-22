package NopCommerce;

import Pages.noCommercePages;
import Utilities.ConfigReader;
import Utilities.UIHelpers;
import Utilities.WebDriverFactory;
import org.testng.annotations.BeforeMethod;

public class US_503 {

    UIHelpers uiHelpers =new UIHelpers();
    noCommercePages noCommercePages=new noCommercePages();
    @BeforeMethod
    public void seetUp(){
        WebDriverFactory.getDriver().get(ConfigReader.getProperty("NopCommerce"));
    }





}
