package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;
import pages.P03_homePage;

public class D03_currenciesStepDef {

    P03_homePage home = new P03_homePage(Hooks.driver);
    Select select = new Select(home.cc);
    String Currency;

    @Given("check products currency")
    public void lookProductsCurrency(){
        if (home.pc.getText().contains("$") == true)
            Currency = "US Dollar";
        else
            Currency = "Euro";
    }

    @When("switch the currency")
    public void changeCurrency(){
        if (Currency == "US Dollar") {
            select.selectByVisibleText("Euro");
            Currency = "Euro";
        }else {
            select.selectByVisibleText("US Dollar");
            Currency = "US Dollar";
        }
    }

    @Then("found the currency")
    public void currencyAssertion(){
        SoftAssert assertion = new SoftAssert();
        home.cc = select.getFirstSelectedOption();
        assertion.assertTrue(home.cc.getText().contains(Currency));
        assertion.assertAll();
    }

}
