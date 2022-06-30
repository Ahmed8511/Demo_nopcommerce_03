package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.asserts.SoftAssert;
import pages.P03_homePage;
import pages.P05_shoppingcart;

public class D09_ShoppingCartStepDef {

    P05_shoppingcart cart = new P05_shoppingcart(Hooks.driver);


    @Given("select product and click add to cart button")
    public void addCart() throws InterruptedException {
        Hooks.driver.navigate().to("https://demo.nopcommerce.com/apple-macbook-pro-13-inch");
        cart.ac.click();
        Thread.sleep(4000);
    }

    @Then("product added to cart")
    public void cartAssertion(){
        P03_homePage P03 = new P03_homePage(Hooks.driver);
        SoftAssert wishlistAssertion = new SoftAssert();
        wishlistAssertion.assertEquals(cart.snc.getText(),"The product has been added to your shopping cart");
        wishlistAssertion.assertEquals(cart.sn.getCssValue("background-color"), "rgba(75, 176, 122, 1)");
        wishlistAssertion.assertAll();
    }

}
