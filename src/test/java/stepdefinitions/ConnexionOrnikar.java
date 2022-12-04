package stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.AllPages;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class ConnexionOrnikar {

    AllPages element =new AllPages();


    @And("I choose Ornikar")
    public void iChooseOrnikar() {
        ReusableMethods.wait(3);
        element.pageConnexion().ornikar.click();
    }

    @And("I entre a valid email")
    public void iEntreAValidEmail() {
        element.pageConnecteOrnikar().email.sendKeys(ConfigurationReader.getProperty("email"));
    }

    @And("I entre a valid Password")
    public void iEntreAValidPassword() {
        element.pageConnecteOrnikar().password.sendKeys(ConfigurationReader.getProperty("motdepasse"));
    }

    @When("I click on the sign-in button below the page")
    public void i_click_on_the_sign_in_button_below_the_page() {
       element.pageConnecteOrnikar().jeMeConnecte.click();
    }
    @Then("I verify sign-in is done successfully")
    public void i_verify_sign_in_is_done_successfully() throws IOException {
        String actualdataName= element.créerUnCompte().actaulDataName.getText();
        Assert.assertTrue(actualdataName.contains(ConfigurationReader.getProperty("nom")));
        ReusableMethods.getScreenshot("Connxionsucceed");
    }


    @And("I verify sign-in is done unsuccessfully")
    public void iVerifySignInIsDoneUnsuccessfully() throws IOException {
        String expectedData="Votre email ou votre mot de passe est incorrect.";
        String actualdata=element.pageConnecteOrnikar().connxionEchouée.getText();
        System.out.println(actualdata);
        Assert.assertTrue(actualdata.contains(expectedData));
        ReusableMethods.getScreenshot("cennexionEchouée");

    }

    @And("I close the browser")
    public void ICloseTheBrowser() {
        Driver.closeDriver();
    }

    @And("I entre an INVALID Password")
    public void iEntreAnINVALIDPassword() {
        element.pageConnecteOrnikar().password.sendKeys(ConfigurationReader.getProperty("motdepassInvalide"));

    }

    @And("I entre a INVALID email")
    public void iEntreAINVALIDEmail() {
        element.pageConnecteOrnikar().email.sendKeys(ConfigurationReader.getProperty("emaiInvalide"));
    }

    @And("I check sign-in is done unsuccessfully")
    public void iCheckSignInIsDoneUnsuccessfully() throws IOException {

        String expectedData="Veuillez saisir un email valide (ex: michael@gmail.com)";
        String actualData= element.créerUnCompte().messageemailinvalide.getText();
        System.out.println(actualData);
        Assert.assertTrue(actualData.contains(expectedData));
        ReusableMethods.getScreenshot("cennexionEchouée");
    }
}
