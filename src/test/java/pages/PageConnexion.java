package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PageConnexion {

    public PageConnexion(){

        PageFactory.initElements(Driver.getDriver(), this);


    }

    @FindBy(xpath = "(//div[@class='kitt_Content_oxWk7'])[1]")
    public WebElement connexion;

    @FindBy(id = "axeptio_btn_dismiss")
    public WebElement cookidismiss;

    @FindBy(xpath = "(//div[@class='kitt_RadioButton_qzcRS'])[1]")
    public WebElement ornikar;

    @FindBy(xpath = "(//div[@class='kitt_RadioButton_qzcRS'])[2]")
    public WebElement ornikarAssurance;




}
