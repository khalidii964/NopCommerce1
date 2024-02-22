package NopCommerce;

import Pages.noCommercePages;
import Utilities.ConfigReader;
import Utilities.UIHelpers;
import Utilities.WebDriverFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class US_502 {
    UIHelpers uiHelpers = new UIHelpers();

    Pages.noCommercePages noCommercePages = new noCommercePages();

//    Test Steps:
//
//   1. Access Login Page:
//
//    Click on the "Login" button on the website's homepage to navigate to the login page.
//
//    2.Enter Login Credentials:
//
//    Enter the registered email address into the "Email Address" field.
//
//    Enter the correct password into the "Password" field.
//
//   3. Submit Login Information:
//
//    Click the "Login" button after correctly filling in the email address and password.
//
//    4.Verify Successful Login:
//
//    Confirm that the user is successfully logged in after clicking the "Login" button.




    @BeforeMethod
    public void AccessRegistrationPage(){
        // 1.Navigate to the registration page
        WebDriverFactory.getDriver().get(ConfigReader.getProperty("NopCommerce"));

    }

    @Test
    public void AccessLoginPage(){
        // 1. Access Login Page:
        // Click on the "Login" button on the website's homepage to navigate to the login page.
        noCommercePages.AccessLoginPage.click();
        //This is the Email and Password That we Have Used in this Project

        //Email: t.one@techno.com
        //Password: Qwerty12
       // 2.Enter Login Credentials:
        // Enter the registered email address into the "Email Address" field.
        // Enter the correct password into the "Password" field.
        noCommercePages.EmailTextBox.sendKeys("t.one@techno.com");
        noCommercePages.PasswordTextBox.sendKeys("Qwerty12");

       // 3. Submit Login Information:
        //Click the "Login" button after correctly filling in the email address and password.
        noCommercePages.SubmitLogin.click();

       // 4.Verify Successful Login:
        //  Confirm that the user is successfully logged in after clicking the "Login" button.
        // i have Selected  My Account menu to  verify successful login
        Assert.assertTrue(noCommercePages.VerifySuccessfulLogin.isDisplayed());

    }
}
