package NopCommerce;

import Pages.noCommercePages;
import Utilities.ConfigReader;
import Utilities.TestData;
import Utilities.UIHelpers;
import Utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class US_503  {

    UIHelpers uiHelpers =new UIHelpers();
    noCommercePages noCommercePages=new noCommercePages();
    /*
    AC_03:
1. The user should be able to access the login page by clicking the "Login" button on the website's homepage.
2. On the login page, the user should be prompted to enter the following information:
    - Email Address
    - Password
3. The user should attempt to log in with 6 invalid email and password combinations using the data provider method.
4. The user should receive warnings from the system during invalid login attempts.
5. Then, the user should be able to click the "LOGIN" button with a valid email and password combination provided by the data provider, and log in successfully.
6. The successful login of the user should be verified.
     */

    @BeforeMethod
    public void seetUp(){
        WebDriverFactory.getDriver().get(ConfigReader.getProperty("NopCommerce"));
    }

    @Test(dataProvider = "loginValidEmailInvPass", dataProviderClass = TestData.class)
    public void NegativeTesting1(String email,String password)  {
        noCommercePages.loginButtonClick.click();
        UIHelpers.waitInSeconds(2);
        noCommercePages.writeEmail.sendKeys(email);
        UIHelpers.waitInSeconds(2);
        noCommercePages.writePass.sendKeys(password);
        UIHelpers.waitInSeconds(2);
        noCommercePages.clickLoginAccessButton.click();
        UIHelpers.waitInSeconds(2);
        Assert.assertTrue(noCommercePages.verifyWarningMessage.isDisplayed());
        UIHelpers.waitInSeconds(2);




    }
    @Test(dataProvider = "loginInvalidEmailValidPass", dataProviderClass = TestData.class)
    public void NegativeTesting2(String email,String password){

        noCommercePages.loginButtonClick.click();
        UIHelpers.waitInSeconds(2);
        noCommercePages.writeEmail.sendKeys(email);
        UIHelpers.waitInSeconds(2);
        noCommercePages.writePass.sendKeys(password);
        UIHelpers.waitInSeconds(2);
        noCommercePages.clickLoginAccessButton.click();
        UIHelpers.waitInSeconds(2);
        Assert.assertTrue(noCommercePages.verifyWarningMessage.isDisplayed());
        UIHelpers.waitInSeconds(2);
    }
//
    @Test(dataProvider = "loginValidEmailEmptyPass", dataProviderClass = TestData.class)
    public void NegativeTesting3(String email,String password){
        noCommercePages.loginButtonClick.click();
        UIHelpers.waitInSeconds(2);
        noCommercePages.writeEmail.sendKeys(email);
        UIHelpers.waitInSeconds(2);
        noCommercePages.writePass.sendKeys(password);
        UIHelpers.waitInSeconds(2);
        noCommercePages.clickLoginAccessButton.click();
        UIHelpers.waitInSeconds(2);
        Assert.assertTrue(noCommercePages.verifyWarningMessage.isDisplayed());
        UIHelpers.waitInSeconds(2);
    }

    @Test(dataProvider = "loginEmptyEmailValidPass", dataProviderClass = TestData.class)
    public void NegativeTesting4(String email,String password){
        noCommercePages.loginButtonClick.click();
        UIHelpers.waitInSeconds(2);
        noCommercePages.writeEmail.sendKeys(email);
        UIHelpers.waitInSeconds(2);
        noCommercePages.writePass.sendKeys(password);
        UIHelpers.waitInSeconds(2);
        noCommercePages.clickLoginAccessButton.click();
        UIHelpers.waitInSeconds(2);
        Assert.assertTrue(noCommercePages.verifyWarningEmptyEmailMessage.isDisplayed());
        UIHelpers.waitInSeconds(2);
    }

    @Test(dataProvider = "loginEmptyEmailEmptyPass", dataProviderClass = TestData.class)
    public void NegativeTesting5(String email,String password){
        noCommercePages.loginButtonClick.click();
        UIHelpers.waitInSeconds(2);
        noCommercePages.writeEmail.sendKeys(email);
        UIHelpers.waitInSeconds(2);
        noCommercePages.writePass.sendKeys(password);
        UIHelpers.waitInSeconds(2);
        noCommercePages.clickLoginAccessButton.click();
        UIHelpers.waitInSeconds(2);
        Assert.assertTrue(noCommercePages.verifyWarningEmptyEmailMessage.isDisplayed());
        UIHelpers.waitInSeconds(2);
    }


    @Test(dataProvider = "loginValidEmailValidPass", dataProviderClass = TestData.class)
    public void PositiveTesting(String email,String password){
        noCommercePages.loginButtonClick.click();
        UIHelpers.waitInSeconds(2);
        noCommercePages.writeEmail.sendKeys(email);
        UIHelpers.waitInSeconds(2);
        noCommercePages.writePass.sendKeys(password);
        UIHelpers.waitInSeconds(2);
        noCommercePages.clickLoginAccessButton.click();
        UIHelpers.waitInSeconds(2);



    }

    @AfterClass
    public void tearDown(){
    WebDriverFactory.getDriver().close();
    }




}
