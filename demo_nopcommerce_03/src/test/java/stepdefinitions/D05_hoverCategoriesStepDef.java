package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;
import pages.P03_homePage;

public class D05_hoverCategoriesStepDef {

    P03_homePage home = new P03_homePage(Hooks.driver);
    Actions h = new Actions(Hooks.driver);

    @Given("hovers over the menu and click a random category")
        public void hoverHeader() throws InterruptedException {
        h.moveToElement(home.hm).perform();
        Thread.sleep(2000);
        h.moveToElement(home.mc).perform();
        }

    @When("clicks a random sub-category")
    public void clickSubCategory() throws InterruptedException {
        h.moveToElement(home.ss);
        h.click().build().perform();
        Thread.sleep(2000);
    }

    @Then("sub-category page loaded")
    public void hoverAssertion(){
        SoftAssert assertion = new SoftAssert();
        assertion.assertEquals(Hooks.driver.getCurrentUrl(), "https://demo.nopcommerce.com/software");
        assertion.assertAll();

    }



}
