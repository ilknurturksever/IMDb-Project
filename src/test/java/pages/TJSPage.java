package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TJSPage {

    public WebElement Screenshot;

    public TJSPage() {PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "(//*[text()='Caz Mugannisi'])[2]")
    public WebElement  JazzInHonoraryAward;

    @FindBy(xpath = "(//li[@class='ipc-metadata-list__item'])[1]")
    public WebElement JazzDirectorText;

    @FindBy(xpath = "(//*[@class='ipc-metadata-list__item'])[2]")
    public WebElement JazzWritersText;

    @FindBy(xpath = "(//*[@class='ipc-inline-list ipc-inline-list--show-dividers ipc-inline-list--inline ipc-metadata-list-item__list-content baseAlt'])[3]")
    public WebElement JazzStarsText;

    @FindBy(xpath = "(//*[text()='Caz Mugannisi'])[1]")
    public WebElement SearchResult;

    @FindBy(xpath = "(//*[@class='ipc-metadata-list__item'])[1]")
    public WebElement JazzDirectorText1;

    @FindBy(xpath = "(//*[@class='ipc-metadata-list-item__content-container'])[2]")
    public WebElement JazzWritersText1;

    @FindBy(xpath = "(//*[@class='ipc-inline-list ipc-inline-list--show-dividers ipc-inline-list--inline ipc-metadata-list-item__list-content baseAlt'])[3]")
    public WebElement JazzStarsText1;

    @FindBy(xpath = "//*[@class='sc-7643a8e3-10 itwFpV']")
    public WebElement ScreenshotJ;
}
