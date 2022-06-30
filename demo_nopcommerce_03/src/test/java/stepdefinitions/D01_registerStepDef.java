package stepdefinitions;


import org.testng.asserts.SoftAssert;
import pages.P01_register;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.P03_homePage;

import java.time.Duration;


public class D01_registerStepDef {

    P01_register register = new P01_register(Hooks.driver);

    @Given("click on the Register tab")
    public void clickOnTheRegisterTab() {
        register.rtab.click();
    }

    @And("chose gender")
    public void choseGender() {
        register.gender.click();
    }

    @And("enter first name and last name")
    public void enterFirstNameAndLastName() {
        register.fn.sendKeys("Ibrahim");
        register.ln.sendKeys("Anter");
    }

    @And("select date of birth")
    public void selectDateOfBirth() {
        register.d.click();
        register.m.click();
        register.y.click();
    }

    @And("enter email")
    public void enterEmail() {
        register.email.sendKeys("aaa@aaa.aaa");
    }

    @And("enter company name")
    public void enterCompanyName() {
        register.cname.sendKeys("Ansqtara");
    }

    @And("enter password")
    public void enterPassword() {
        register.pass.sendKeys("password");
        register.cpass.sendKeys("password");
    }

    @And("click on register button")
    public void clickOnRegisterButton() {
        register.rbutton.click();
        Hooks.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @Then("registered successfully")
    public void RegistrationAssertion() {
        SoftAssert registrationAssertion = new SoftAssert();
        registrationAssertion.assertTrue(register.assertion.getText().contains("Your registration completed"));
        registrationAssertion.assertEquals(register.assertion.getCssValue("color"), "rgba(76, 177, 124, 1)");
        registrationAssertion.assertAll();
    }

}
