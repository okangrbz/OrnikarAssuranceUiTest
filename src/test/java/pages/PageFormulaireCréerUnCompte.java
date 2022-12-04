package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PageFormulaireCréerUnCompte {


    public PageFormulaireCréerUnCompte(){

        PageFactory.initElements(Driver.getDriver(), this);


    }

    @FindBy(xpath = "//div[@class='Content_Fo50Ok']//a")
    public WebElement jeMinscris;

    @FindBy(id = "firstname")
    public WebElement prénom;

    @FindBy(id = "lastname")
    public WebElement nom;

    @FindBy(xpath = "//div[@class='kitt_Wrapper_3XF4c ']")
    public WebElement datedenaissance;

    @FindBy(id = "birthdate-day")
    public WebElement day;

    @FindBy(id = "birthdate-month")
    public WebElement month;

    @FindBy(id = "birthdate-year")
    public WebElement year;

    @FindBy(id = "zipcode")
    public WebElement codepostal;

    @FindBy(id = "phone")
    public WebElement phone;

    @FindBy(id = "email")
    public WebElement email;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(xpath = "(//div[@class='kitt_Checkbox_1wQ0F '])[1]")
    public WebElement case1;

    @FindBy(xpath = "(//div[@class='kitt_Checkbox_1wQ0F '])[2]")
    public WebElement case2;

    @FindBy(xpath = "//div[@class='auth_SignUpButton_2oytz']")
    public WebElement signupbouton;

    @FindBy(xpath = "//div[@class='styles_NavigationItem__109BZ']")
    public WebElement actaulDataName;

    @FindBy(xpath = "//div[@class='react-forms_FeedbackContainer_1FTcy']//div")
    public WebElement messageCodePostalInvalid;

    @FindBy(xpath = "//div[@data-testid='form-field-feedback-phone']")
    public WebElement messagephoneinvalide;

    @FindBy(xpath = "//div[@data-testid='form-field-feedback-email']")
    public WebElement messageemailinvalide;





}
