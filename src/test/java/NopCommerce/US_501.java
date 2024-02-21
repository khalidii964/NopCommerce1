package NopCommerce;

import Pages.noCommercePages;
import Utilities.ConfigReader;
import Utilities.UIHelpers;
import Utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.sql.Driver;

public class US_501 {

    UIHelpers uiHelpers = new UIHelpers();

    noCommercePages noCommercePages = new noCommercePages();




    /*
    Test Steps:
1. Access Registration Page:
   - Open the website and navigate to the registration page.

2. Verify Clickable Register Button:
   - Check if the "Register" button on the registration page is clickable.

3. Enter Customer Data:
   - Fill in all relevant fields on the registration page with appropriate customer data.

4. Select Date of Birth:
   - Choose the Date of Birth using the dropdown menu (SELECT) provided.

5. Submit Registration:
   - Click the "Register" button after filling in all required information correctly.

6. Confirm Registration Completion:
   - Verify that the user's registration is successfully completed.

7. Check Confirmation Message:
   - Ensure that a confirmation message is displayed on the screen confirming the successful registration.
     */


    @BeforeMethod
    public void AccessRegistrationPage(){
        // 1.Navigate to the registration page
        WebDriverFactory.getDriver().get(ConfigReader.getProperty("NopCommerce"));

    }

    @Test
    public void  VerifyClickableRegisterButton(){
        //2. Verify Clickable Register Button:
        noCommercePages.VerifyClickableRegisterButton.click();
        Assert.assertTrue(noCommercePages.VerifyClickableRegisterButton1.isDisplayed());
        System.out.println(noCommercePages.VerifyClickableRegisterButton1);


        //3. Enter Customer Data:
        noCommercePages.FirstName.sendKeys("Khaliddd");
        noCommercePages.LastName.sendKeys("Hassannn");
        noCommercePages.ChooseGender.click();

       // 4. Select Date of Birth:
        noCommercePages.DateOFBirthDay.click();
        Select selectDay= new Select(noCommercePages.DateOFBirthDay);
        selectDay.selectByVisibleText("1");

        noCommercePages.DateOfBirthMonth.click();
        Select selectMonth= new Select(noCommercePages.DateOfBirthMonth);
        selectMonth.selectByVisibleText("January");

        noCommercePages.DateOfBirthYear.click();
        Select selectYear= new Select(noCommercePages.DateOfBirthYear);
        selectYear.selectByVisibleText("1915");

      //  5. Submit Registration:
       // - Click the "Register" button after filling in all required information correctly.

//        - **First Name:** _Team One_
//        - **Last Name:** _Techno{random}_
//                - **Date of Birth:** _May 5, 2005_
//                - **Email:** _t.one@techno.com_
//        - **Password:** _Qwerty12_
        noCommercePages.EmailAdress.sendKeys("novara1953@snooodi.com");
        noCommercePages.CompanyName.sendKeys("TechnoStudyyy");

        noCommercePages.Password.sendKeys("Khalid123");
        noCommercePages.ConfirmPassword.sendKeys("Khalid123");

        noCommercePages.ClickRegisterButton.click();


       // 6. Confirm Registration Completion:
        //- Verify that the user's registration is successfully completed.
        Assert.assertTrue(noCommercePages.YourRegistrationCompleted.isDisplayed());


       // 7. Check Confirmation Message:
        //- Ensure that a confirmation message is displayed on the screen confirming the successful registration.
        noCommercePages.ClickContinue.click();







    }

}
