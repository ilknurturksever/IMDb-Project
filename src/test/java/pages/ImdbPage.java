package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class ImdbPage {

    public ImdbPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@id='imdbHeader-navDrawerOpen--desktop']")
    public WebElement MenuButton;

    @FindBy(xpath = "(//*[@class='navlinkcat__item'])[4]")
    public WebElement AwardEventTitle;

    @FindBy(xpath = "//*[text()='Oscars']")
    public WebElement OscarsButton;

    @FindBy(xpath = "//*[@class='event-history-widget__title']")
    public WebElement EventHistoryTitle;

    @FindBy(xpath = "//*[text()='1929']")
    public WebElement EventHistoryCount;

    @FindBy(xpath = "//*[text()='Honorary Award']" )
    public WebElement HonoraryAwardTitle;

    @FindBy(xpath = "//*[@id='home_img_holder']")
    public WebElement IMDbHomePages;

    @FindBy(xpath = "//*[@id='suggestion-search']")
    public WebElement SearchBox;

    @FindBy(xpath = "(//h3[@class='ipc-title__text'])[1]")
    public WebElement PhotosTitle;

    @FindBy(xpath = "//img[@height='100']")
    public List<WebElement> PhotoList1;

    @FindBy(xpath = "//div[@class='ipc-button__text']")
    public WebElement PhotoClose;




    // @FindAll({})
   // public List<WebElement> x;




}
