package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P02_login {
    WebDriver driver;

    public P02_login(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(className = "ico-login")
    public WebElement ltab;

    @FindBy(id = "Email")
    public WebElement email;

    @FindBy(id = "Password")
    public WebElement password;

    @FindBy(css = "div[class=\"buttons\"] button[type=\"submit\"]")
    public WebElement lbutton;

    @FindBy(className = "ico-account")
    public WebElement account;

    public void enterLogin(String email, String password){
        this.email.sendKeys(email);
        this.password.sendKeys(password);
    }

}
