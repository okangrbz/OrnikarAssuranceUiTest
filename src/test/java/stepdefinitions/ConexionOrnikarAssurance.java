package stepdefinitions;

import io.cucumber.java.en.And;
import pages.AllPages;
import utilities.ReusableMethods;

public class ConexionOrnikarAssurance {
AllPages element=new AllPages();
    @And("I choose OrnikarAssurance")
    public void iChooseOrnikarAssurance() {

        ReusableMethods.wait(3);
        element.pageConnexion().ornikarAssurance.click();
    }



}
