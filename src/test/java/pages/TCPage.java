package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class TCPage {

    public TCPage() {PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "//*[text()='Şarlo Sirkte']")
    public WebElement CircusInHonoraryAward;

    @FindBy(xpath = "(//*[@class='ipc-metadata-list-item__list-content-item ipc-metadata-list-item__list-content-item--link'])[1]")
    public WebElement CircusDirectorText;

    @FindBy(xpath = "(//*[@class='ipc-metadata-list-item__list-content-item ipc-metadata-list-item__list-content-item--link'])[1]")
    public WebElement CircusWriterText;

    @FindBy(xpath = "(//*[@class='ipc-inline-list ipc-inline-list--show-dividers ipc-inline-list--inline ipc-metadata-list-item__list-content baseAlt'])[3]")
    public WebElement CircusStarsText;

    @FindBy(xpath = "(//*[text()='Şarlo Sirkte'])[1]")
    public WebElement SearchResult;

    @FindBy(xpath = "(//*[@class='ipc-metadata-list-item__list-content-item ipc-metadata-list-item__list-content-item--link'])[1]")
    public WebElement CircusDirectorText1;

    @FindBy(xpath = "(//*[@class='ipc-metadata-list-item__list-content-item ipc-metadata-list-item__list-content-item--link'])[1]")
    public WebElement CircusWriterText1;

    @FindBy(xpath = "(//*[@class='ipc-inline-list ipc-inline-list--show-dividers ipc-inline-list--inline ipc-metadata-list-item__list-content baseAlt'])[3]")
    public WebElement CircusStarsText1;

    @FindBy(xpath = "//img[@height='100']")
    public List<WebElement> PhotoList2;

    @FindBy(xpath = "(//a[@class='prevnext'])[1]")
    public WebElement Next;

    @FindBy(xpath = "//*[@class='sc-7643a8e3-10 itwFpV']")
    public WebElement Screenshot;
}
