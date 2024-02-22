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

    //US_501
    @FindBy(xpath = ("(//a[normalize-space()='Register'])[1]"))
    public WebElement VerifyClickableRegisterButton;

    @FindBy (xpath = ("(//h1[normalize-space()='Register'])[1]"))
    public WebElement VerifyClickableRegisterButton1 ;


    @FindBy (xpath = ("(//label[normalize-space()='Male'])[1]"))
    public WebElement ChooseGender;


    @FindBy (xpath = ("(//input[@id='FirstName'])[1]"))
    public WebElement FirstName;

    @FindBy (xpath = ("(//input[@id='LastName'])[1]"))
    public WebElement LastName;


    @FindBy (xpath = ("(//select[@name='DateOfBirthDay'])[1]"))
    public WebElement DateOFBirthDay;

    @FindBy (xpath = ("(//select[@name='DateOfBirthMonth'])[1]"))
    public WebElement DateOfBirthMonth;


    @FindBy (xpath = ("(//select[@name='DateOfBirthYear'])[1]"))
    public WebElement DateOfBirthYear;

    @FindBy (xpath = ("(//input[@id='Email'])[1]"))
    public WebElement EmailAdress;

    @FindBy (xpath = ("(//input[@id='Company'])[1]"))
    public WebElement CompanyName;

    @FindBy (xpath = ("(//input[@id='Password'])[1]"))
    public WebElement Password;

    @FindBy (xpath = ("(//input[@id='ConfirmPassword'])[1]"))
    public WebElement ConfirmPassword;

    @FindBy (xpath = ("(//button[normalize-space()='Register'])[1]"))
    public WebElement ClickRegisterButton;

    @FindBy (xpath = ("//div[@class='result']"))
    public WebElement YourRegistrationCompleted;

    @FindBy (xpath = ("//a[@class='button-1 register-continue-button']"))
    public WebElement ClickContinue;


//US_502
    @FindBy (xpath = ("(//a[normalize-space()='Log in'])[1]"))
    public WebElement AccessLoginPage;

    @FindBy (xpath = ("(//input[@id='Email'])[1]"))
    public WebElement EmailTextBox;


    @FindBy (xpath = ("(//input[@id='Password'])[1]"))
    public WebElement PasswordTextBox;

    @FindBy (xpath = ("(//button[normalize-space()='Log in'])[1]"))
    public WebElement SubmitLogin ;

    @FindBy (xpath = ("(//a[@class='ico-account'])[1]"))
    public WebElement VerifySuccessfulLogin;



    //US_503

    //valid email invalid password

    @FindBy (xpath = "//input[@type='checkbox']")
    public WebElement noCommerceVerify;

    @FindBy (xpath = "(//img[@alt='nopCommerce demo store'])[1]")
    public WebElement noCommerceImage;

    @FindBy (xpath = "(//a[normalize-space()='Log in'])[1]")
    public WebElement loginSingUpButton;

    @FindBy (xpath = "(//strong[normalize-space()='Returning Customer'])[1]")
    public WebElement returningCustomerIsDisplayed;

    @FindBy (xpath = "(//input[@id='Email'])[1]")
    public WebElement validEmailTextBox;

    @FindBy (xpath = "(//input[@id='Password'])[1]")
    public WebElement ınvalidPassTextBox;

    @FindBy (xpath = "(//button[normalize-space()='Log in'])[1]")
    public WebElement clickLoginButon1;

    @FindBy (xpath = "(//div[@class='message-error validation-summary-errors'])[1]")
    public WebElement warningIsDisplayed;


    //invalid email valid password

    @FindBy (xpath = "(//a[normalize-space()='Log in'])[1]")
    public WebElement ınvEmailloginSingUpButton;

    @FindBy (xpath = "(//button[normalize-space()='Log in'])[1]")
    public WebElement InvEmailclickLoginButon;


    @FindBy (xpath = "(//input[@id='Email'])[1]")
    public WebElement invEmail;

    @FindBy (xpath = "(//input[@id='Password'])[1]")
    public WebElement ValidPass;













}