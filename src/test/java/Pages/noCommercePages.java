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

    //US_506

    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Gift Cards']")
    private WebElement giftsTab;

    @FindBy(xpath = "//div[@class='item-grid']")
    private WebElement scrollingDown;

    @FindBy(xpath = "(//a[contains(text(),'$25 Virtual Gift Card')])[2]")
    private WebElement firstGiftCard;

    @FindBy(xpath = "//button[@id='add-to-cart-button-43']")
    private WebElement addToCartButton;

    @FindBy(xpath = "//input[@id='giftcard_43_RecipientName']")
    private WebElement recipientName;

    @FindBy(xpath = "//input[@id='giftcard_43_RecipientEmail']")
    private WebElement recipientEmail;

    @FindBy(xpath = "//input[@id='giftcard_43_SenderName']")
    private WebElement senderName;

    @FindBy(xpath = "//input[@id='giftcard_43_SenderEmail']")
    private WebElement senderEmail;

    @FindBy(xpath = "//textarea[@id='giftcard_43_Message']")
    private WebElement giftMessage;


    //US_503

    @FindBy (xpath = ("(//a[normalize-space()='Log in'])[1]"))
    public WebElement loginButtonClick  ;

    @FindBy (xpath = ("(//input[@id='Email'])[1]"))
    public WebElement writeEmail ;

    @FindBy (xpath = ("(//input[@id='Password'])[1]"))
    public WebElement writePass ;

    @FindBy (xpath = ("(//button[normalize-space()='Log in'])[1]"))
    public WebElement clickLoginAccessButton ;

    @FindBy (xpath = ("(//div[@class='message-error validation-summary-errors'])[1]"))
    public WebElement verifyWarningMessage ;


    @FindBy (xpath = ( "(//span[@id='Email-error'])[1]"))
    public WebElement verifyWarningEmptyEmailMessage;














}