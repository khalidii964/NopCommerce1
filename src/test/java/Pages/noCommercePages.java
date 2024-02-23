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
////US_505
@FindBy (xpath = ("(//a[normalize-space()='Computers'])[1]"))
public WebElement ComputersButton;
    @FindBy (xpath = ("//ul[@class='top-menu notmobile']//a[normalize-space()='Notebooks']"))
    public WebElement NotebooksButton;

    @FindBy (xpath = ("//a[normalize-space()='List']"))
    public WebElement LinesButton;

    @FindBy (xpath = ("(//a[normalize-space()='Apple MacBook Pro 13-inch'])[1]"))
    public WebElement AppleMacBookPro ;

    @FindBy (xpath = ("//input[@id='small-searchterms']"))
    public WebElement SearchStoreButton ;

    @FindBy (xpath = ("//button[normalize-space()='Search']"))
    public WebElement Search ;
////h2[@class='product-title']//a[contains(text(),'Apple MacBook Pro 13-inch')]
@FindBy (xpath = ("(//a[contains(text(),'Apple MacBook Pro 13-inch')])[2]"))
public WebElement AppleMacbookPro ;













}