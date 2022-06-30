package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;
import pages.P03_homePage;

public class D06_homeSlidersStepDef {

    P03_homePage home = new P03_homePage(Hooks.driver);



    @When("click on the Nokia banner")
    public void clickNokiaBanner(){
        home.n.click();
    }

    @Then("user redirected to the Nokia product link")
    public void slidersAssertionNokia(){
        SoftAssert assertion = new SoftAssert();
        assertion.assertEquals(home.n.getAttribute("href"), "http://demo.nopcommerce.com/");
        assertion.assertAll();
    }


}
