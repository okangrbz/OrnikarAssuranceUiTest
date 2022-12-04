package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PageConnecteOrnikarAssurance {

    public PageConnecteOrnikarAssurance(){

        PageFactory.initElements(Driver.getDriver(), this);


    }
    @FindBy(id = "email")
    public WebElement email;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(xpath = "//*[text()='Je me connecte']")
    public WebElement jeMeConnecte;


}
