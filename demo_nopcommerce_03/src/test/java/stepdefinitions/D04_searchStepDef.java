package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;
import pages.P03_homePage;

import java.time.Duration;

public class D04_searchStepDef {

    P03_homePage home = new P03_homePage(Hooks.driver);
    String searchedProductname;
    String searchedProductsku;

    @Given("type product name in the search text field")
    public void searchProductname(){
        home.search.sendKeys("Apple");
        searchedProductname = "Apple";
    }

    @When("click the search button")
    public void clickSearch(){
        home.sb.click();
        Hooks.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
    }

    @Then("product found with name")
    public void searchAssertion(){
        SoftAssert assertion = new SoftAssert();
        assertion.assertEquals(home.sk.getAttribute("value"),searchedProductname);
        assertion.assertAll();
    }

    @Given("type product SKU in the search text field")
    public void searchProductsku(){
        home.search.sendKeys("AP_MBP_13");
        searchedProductsku = "AP_MBP_13";
    }


    @Then("product found with sku")
    public void skuSearchAssertion(){
        SoftAssert searchAssertion = new SoftAssert();
        searchAssertion.assertEquals(home.sk.getAttribute("value"),searchedProductsku);
        searchAssertion.assertAll();
    }



}
