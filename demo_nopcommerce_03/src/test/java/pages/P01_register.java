package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class P01_register {
    WebDriver driver;

    public P01_register(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(className = "ico-register")
    public WebElement rtab;

    @FindBy(xpath = "// input[@type=\"radio\"]")
    public WebElement gender;

    @FindBy(id = "FirstName")
    public WebElement fn;

    @FindBy(id = "LastName")
    public WebElement ln;

    @FindBy(xpath = "//select[@name=\"DateOfBirthDay\"]  //option [@value=\"22\"]")
    public WebElement d;

    @FindBy(xpath = "//select[@name=\"DateOfBirthMonth\"]  //option [@value=\"2\"]")
    public WebElement m;

    @FindBy(xpath = "//select[@name=\"DateOfBirthYear\"]  //option [@value=\"2001\"]")
    public WebElement y;

    @FindBy(id = "Email")
    public WebElement email;

    @FindBy(id = "Company")
    public WebElement cname;

    @FindBy(id = "Password")
    public WebElement pass;

    @FindBy(id = "ConfirmPassword")
    public WebElement cpass;

    @FindBy(id = "register-button")
    public WebElement rbutton;

    @FindBy(className = "result")
    public WebElement assertion;


}
