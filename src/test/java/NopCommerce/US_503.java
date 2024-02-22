package NopCommerce;

import Pages.noCommercePages;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import Utilities.UIHelpers;
import Utilities.ConfigReader;
import Utilities.WebDriverFactory;
import org.testng.annotations.Test;
import Utilities.TestData;

public class US_503 {

    /*
   // 1. The user should be able to access the login page by clicking the "Login" button on the website's homepage.
    2. On the login page, the user should be prompted to enter the following information: - Email Address - Password
    3. The user should attempt to log in with 6 invalid email and password combinations using the data provider method.
    4. The user should receive warnings from the system during invalid login attempts.
    5. Then, the user should be able to click the "LOGIN" button with a valid email and password combination provided by the data provider, and log in successfully.
    6. The successful login of the user should be verified.
     */

    noCommercePages noCommercePages = new noCommercePages();
    UIHelpers uiHelpers = new UIHelpers();
    @BeforeMethod
    public void setUp(){
        //1-Navigate to the URL 'http://automationexercise.com'.
        WebDriverFactory.getDriver().get(ConfigReader.getProperty("nopcommerce"));
    }
    @Test(dataProvider = "loginValidEmailInvalidPassData", dataProviderClass = TestData.class)
    public void loginPagevalidEmailInValidPass(String email, String password){

        noCommercePages.noCommerceVerify.click();
        // 1. The user should be able to access the login page by clicking the "Login" button on the website's homepage.
        Assert.assertTrue(noCommercePages.noCommerceImage.isDisplayed());
        noCommercePages.loginSingUpButton.click();
        // 2. On the login page, the user should be prompted to enter the following information: - Email Address - Password
        Assert.assertTrue(noCommercePages.returningCustomerIsDisplayed.isDisplayed() );
        // 3. The user should attempt to log in with 6 invalid email and password combinations using the data provider method.
        noCommercePages.validEmailTextBox.sendKeys(email);
        noCommercePages.ınvalidPassTextBox.sendKeys(password);

        noCommercePages.clickLoginButon1.click();
        // 4. The user should receive warnings from the system during invalid login attempts.
        Assert.assertTrue(noCommercePages.warningIsDisplayed.isDisplayed());
    }
    @Test(dataProvider = "loginInvalidEmailValidPass", dataProviderClass = TestData.class)
    public void loginPageInvalidEmailValidPass(String email, String password){

        // 1. The user should be able to access the login page by clicking the "Login" button on the website's homepage.


        // 2. On the login page, the user should be prompted to enter the following information: - Email Address - Password


        // 3. The user should attempt to log in with 6 invalid email and password combinations using the data provider method.


        // 4. The user should receive warnings from the system during invalid login attempts.

    }




}
