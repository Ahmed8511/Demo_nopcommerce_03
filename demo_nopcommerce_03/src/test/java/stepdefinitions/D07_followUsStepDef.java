package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;
import pages.P03_homePage;


public class D07_followUsStepDef {

    P03_homePage home = new P03_homePage(Hooks.driver);


    @When("click the facebook icon")
    public void clickFacebook() throws InterruptedException {
        home.fb.click();
        Thread.sleep(4000);
    }

    @And("click the twitter icon")
    public void clickTwitter() throws InterruptedException {
        home.tw.click();
        Thread.sleep(4000);
    }

    @And("click the youtube icon")
    public void clickYoutube() throws InterruptedException {
        home.yt.click();
        Thread.sleep(4000);
    }

    @And("click the rss icon")
    public void clickRSS() throws InterruptedException {
        home.rss.click();
        Thread.sleep(4000);
        Hooks.driver.navigate().to("https://demo.nopcommerce.com/");
        Thread.sleep(2000);

    }


    @Then("all links opens")
    public void links(){
        SoftAssert assertion = new SoftAssert();
        assertion.assertEquals(home.fb.getAttribute("href"),"http://www.facebook.com/nopCommerce");
        assertion.assertEquals(home.tw.getAttribute("href"),"https://twitter.com/nopCommerce");
        assertion.assertEquals(home.yt.getAttribute("href"),"http://www.youtube.com/user/nopCommerce");
        assertion.assertEquals(home.rss.getAttribute("href"),"https://demo.nopcommerce.com/news/rss/1");
        assertion.assertAll();
    }


}
