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
















}