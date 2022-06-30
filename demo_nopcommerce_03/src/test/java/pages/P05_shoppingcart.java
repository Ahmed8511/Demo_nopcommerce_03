package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P05_shoppingcart {

    WebDriver driver;

    public P05_shoppingcart(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy(id = "add-to-cart-button-4")
    public WebElement ac;

    @FindBy(xpath = "//div[@class=\"item-box\"][2]//div[@class=\"product-item\"]//div[@class=\"picture\"]")
    public WebElement mbp;

    @FindBy(xpath = "//div[@id=\"bar-notification\"]//div")
    public WebElement sn;

    @FindBy(xpath = "//div[@id=\"bar-notification\"]//p")
    public WebElement snc;
}
