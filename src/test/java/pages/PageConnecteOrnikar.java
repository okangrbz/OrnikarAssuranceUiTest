package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PageConnecteOrnikar {


    public PageConnecteOrnikar(){

        PageFactory.initElements(Driver.getDriver(), this);

    }



    @FindBy(xpath = "//div[@class='Content_Fo50Ok']//a")
    public WebElement jeMinscris;

    @FindBy(id = "email")
    public WebElement email;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(xpath = "//div[@class='kitt_Checkbox_1wQ0F ']")
    public WebElement SeSouvenirCase;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement jeMeConnecte;

    @FindBy(xpath = "//*[text()='Votre email ou votre mot de passe est incorrect.']")
    public WebElement connxionEchouée;



}
