package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.AllPages;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

import static utilities.Driver.getDriver;


public class CréerUnCompte {

    AllPages element =new AllPages();
    Actions action=new Actions(Driver.getDriver());
    Faker fek=new Faker();
    String name="";


    @Given("I go to the OrnikarAssurance-Auto page")
    public void i_go_to_the_ornikar_assurance_auto_page() {
        getDriver().get(ConfigurationReader.getProperty("baseUrl"));
    }
    @When("I accept cookies")
    public void i_accept_cookies() {
        ReusableMethods.wait(4);
        if (element.pageConnexion().cookidismiss.isDisplayed()){
            element.pageConnexion().cookidismiss.click();


        }
        getDriver().manage().deleteAllCookies();
    }

    @And("I press <Connexion>")
    public void iPressConnexion() {
        element.pageConnexion().connexion.click();
    }


    @And("I press on <je m'inscris>")
    public void iPressOnJeMInscris() {
        element.pageConnecteOrnikar().jeMinscris.click();
    }

    @And("I use the native keyboard to enter my firstname into the prénom input field")
    public void iUseTheNativeKeyboardToEnterMyFirstnameIntoThePrénomInputField() {
        name=fek.name().firstName();
        element.créerUnCompte().prénom.sendKeys(name);
    }


    @And("I use the native keyboard to enter my lastname into the nom input field")
    public void iUseTheNativeKeyboardToEnterMyLastnameIntoTheNomInputField() {
        element.créerUnCompte().nom.sendKeys(fek.name().lastName());
    }


    @And("I use the native keyboard to enter valid date of birth in the Date de naissance input field")
    public void iUseTheNativeKeyboardToEnterValidDateOfBirthInTheDateDeNaissanceInputField() {
        element.créerUnCompte().day.sendKeys(ConfigurationReader.getProperty("day"));
        element.créerUnCompte().month.sendKeys(ConfigurationReader.getProperty("month"));
        element.créerUnCompte().year.sendKeys(ConfigurationReader.getProperty("year"));
    }

    @When("I use the native keyboard to enter valid ZIP Code  in the <Code Postale> input field")
    public void i_use_the_native_keyboard_to_enter_valid_zip_code_in_the_Code_Postale_input_field() {
        element.créerUnCompte().codepostal.sendKeys(ConfigurationReader.getProperty("codepostal"));
    }

    @When("I use the native keyboard to enter valid phone number in the <Numéro de téléphone> input field")
    public void i_use_the_native_keyboard_to_enter_valid_phone_number_in_the_Numéro_de_téléphone_input_field() {
        element.créerUnCompte().phone.sendKeys(ConfigurationReader.getProperty("numTel"));
    }

    @When("I use the native keyboard to enter valid Email in the <Adresse email> input field")
    public void i_use_the_native_keyboard_to_enter_valid_email_in_the_Adresse_email_input_field() {
        element.créerUnCompte().email.sendKeys(fek.internet().emailAddress());
    }

    @When("I use the native keyboard to enter valid password in the <Mot de passe> input field")
    public void i_use_the_native_keyboard_to_enter_valid_password_in_the_Mot_de_passe_input_field() {
        element.créerUnCompte().password.sendKeys(ConfigurationReader.getProperty("motdepasse"));
    }

    @And("I tick the box <J accepte de recevoir des offres commerciales de la part d Ornikar.>")
    public void iTickTheBoxJAccepteDeRecevoirDesOffresCommercialesDeLaPartDOrnikar() {
        element.créerUnCompte().case1.click();
    }

    @And("I tick the box <J accepte et je comprends les conditions générales d utilisation et la politique de confidentialité d Ornikar.>")
    public void iTickTheBoxJAccepteEtJeComprendsLesConditionsGénéralesDUtilisationEtLaPolitiqueDeConfidentialitéDOrnikar() {
        action.moveToElement(element.créerUnCompte().case1).perform();
        action.sendKeys(Keys.TAB).click().perform();
    }

    @Then("I press to <Je m'inscris>")
    public void iPressToJeMInscris() {
        element.créerUnCompte().signupbouton.click();
    }


    @And("I can create my account")
    public void iCanCreateMyAccount() throws IOException {

        String actualdataName= element.créerUnCompte().actaulDataName.getText();
        Assert.assertTrue(actualdataName.contains(name));
        ReusableMethods.getScreenshot("CréerUnComptepozitifScenario");
    }


    @Then("L utilisateur clique sur le bouton Je m'inscris")
    public void lUtilisateurCliqueSurLeBoutonJeMInscris() {
        element.créerUnCompte().signupbouton.click();
    }

    @And("I use the native keyboard to enter INVALIDE ZIP Code  in the {string} input field")
    public void iUseTheNativeKeyboardToEnterINVALIDEZIPCodeInTheInputField(String codePostal) throws IOException {
        element.créerUnCompte().codepostal.sendKeys(codePostal);
        ReusableMethods.getScreenshot("invalideCodePostale");
    }

    @And("I should see the message <Veuillez saisir un code postal valide>.")
    public void iShouldSeeTheMessageVeuillezSaisirUnCodePostalValide() {
        String expectedData="Veuillez saisir un code postal valide (ex: 44100)";
        String actualData= element.créerUnCompte().messageCodePostalInvalid.getText();
        System.out.println(actualData);
        Assert.assertTrue(actualData.contains(expectedData));

    }



    @And("I use the native keyboard to enter INVALIDE phone number in the {string} input field")
    public void iUseTheNativeKeyboardToEnterINVALIDEPhoneNumberInTheInputField(String numdeTel) {
        element.créerUnCompte().phone.sendKeys(numdeTel);


    }

    @And("I should see the message <Veuillez saisir un numéro de téléphone valide>.")
    public void iShouldSeeTheMessageVeuillezSaisirUnNuméroDeTéléphoneValide() throws IOException {
        String expectedData="Veuillez saisir un numéro de téléphone valide";
        String actualData= element.créerUnCompte().messagephoneinvalide.getText();
        System.out.println(actualData);
        Assert.assertTrue(actualData.contains(expectedData));
        ReusableMethods.getScreenshot("invalidPhone");

    }

    @And("I use the native keyboard to enter INVALIDE Email in the {string} input field")
    public void iUseTheNativeKeyboardToEnterINVALIDEEmailInTheInputField(String email) {
        element.créerUnCompte().email.sendKeys(email);
    }


    @And("I should see the message <Veuillez saisir un email valide \\(ex: michael@gmail.com)>.")
    public void iShouldSeeTheMessageVeuillezSaisirUnEmailValideExMichaelGmailCom() throws IOException {
        String expectedData="Veuillez saisir un email valide (ex: michael@gmail.com)";
        String actualData= element.créerUnCompte().messageemailinvalide.getText();
        System.out.println(actualData);
        Assert.assertTrue(actualData.contains(expectedData));
        ReusableMethods.getScreenshot("invalidEmail");

    }

    @And("I use the native keyboard to enter INVALIDE password in the {string} input field")
    public void iUseTheNativeKeyboardToEnterINVALIDEPasswordInTheInputField(String pass) throws IOException {
        element.créerUnCompte().password.sendKeys(pass);
        ReusableMethods.getScreenshot("invalideMotdePasse");
    }


    @And("I can't create my account")
    public void iCanTCreateMyAccount() {
        Assert.assertTrue(element.créerUnCompte().signupbouton.isDisplayed());

    }
}
