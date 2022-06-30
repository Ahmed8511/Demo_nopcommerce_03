package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;
import pages.P03_homePage;
import pages.P04_wishlist;

public class D08_WishlistStepDef {

    P04_wishlist wish = new P04_wishlist(Hooks.driver);


    @When("click add to wishlist icon")
    public void addProduct() throws InterruptedException {
        Hooks.driver.navigate().to("https://demo.nopcommerce.com/apple-macbook-pro-13-inch");
        wish.wi.click();
        Thread.sleep(3000);
    }

    @Then("product added to wishlist")
    public void wishlistAssertion(){
        SoftAssert assertion = new SoftAssert();
        assertion.assertEquals(wish.snc.getText(),"The product has been added to your wishlist");
        assertion.assertEquals(wish.sn.getCssValue("background-color"), "rgba(75, 176, 122, 1)");
        assertion.assertAll();
    }

}
