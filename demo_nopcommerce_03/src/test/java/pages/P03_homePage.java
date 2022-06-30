package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P03_homePage {

    WebDriver driver;

    public P03_homePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy(id = "customerCurrency")
    public WebElement cc;

    @FindBy(xpath = "//div[@class=\"prices\"] //span")
    public WebElement pc;







    @FindBy(id = "small-searchterms")
    public WebElement search;

    @FindBy(css = "button[type=\"submit\"]")
    public WebElement sb;

    @FindBy(id = "q")
    public WebElement sk;








    @FindBy(xpath = "//div [@class=\"header-menu\"]  //ul[@class]")
    public WebElement hm;

    @FindBy(xpath = "//a[@href=\"/computers\"]")
    public WebElement mc;

    @FindBy(xpath = "//a[@href=\"/software\"]")
    public WebElement ss;










    @FindBy(xpath = "//*[@id=\"nivo-slider\"]/a[1]")
    public WebElement n;

    @FindBy(xpath = "//div[6]/div[3]/div/div/div/div/div[1]/div[2]/a[1]")
    public WebElement nb;








    @FindBy(linkText = "Facebook")
    public WebElement fb;

    @FindBy(linkText = "Twitter")
    public WebElement tw;

    @FindBy(linkText = "RSS")
    public WebElement rss;

    @FindBy(linkText = "YouTube")
    public WebElement yt;



}