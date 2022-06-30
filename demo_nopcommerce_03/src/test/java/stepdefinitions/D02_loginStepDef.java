package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;
import pages.P02_login;
import pages.P03_homePage;

import java.time.Duration;

public class D02_loginStepDef {

    P02_login login = new P02_login(Hooks.driver);


    @Given("click login button")
    public void clickLoginButton() {
        login.ltab.click();
    }

    @When("enter email and password")
    public void enterEmailAndPassword() {
        login.email.sendKeys("aaa@aaa.aaa");
        login.password.sendKeys("password");

    }

    @And("click login")
    public void clickLogin() {
        login.lbutton.click();
        Hooks.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @Then("logged in successfully")
    public void loggedInSuccessfully() {
        SoftAssert Assertion = new SoftAssert();
        Assertion.assertEquals(Hooks.driver.getCurrentUrl(), "https://demo.nopcommerce.com/");
        Assertion.assertTrue(login.account.isDisplayed());
        Assertion.assertAll();
    }
}
