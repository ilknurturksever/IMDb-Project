package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.ImdbPage;
import pages.TCPage;
import pages.TJSPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TheCircusStepDefinitions {

    ImdbPage imdbPage=new ImdbPage();
    TCPage tcPage=new TCPage();

    @Given("URL adresine gidilir")
    public void url_adresine_gidilir() {

        Driver.getDriver().get(ConfigReader.getProperty("URL"));

    }
    @When("Arama cubugunun sol tarafinda bulunan Menu butonuna basilir")
    public void arama_cubugunun_sol_tarafinda_bulunan_butonuna_basilir() {

        imdbPage.MenuButton.click();

    }
    @When("Gelen ekranda Award & Events basligi altinda bulunan Oscars butonuna tiklanir")
    public void gelen_ekranda_basligi_altinda_bulunan_butonuna_tiklanir() {

        imdbPage.AwardEventTitle.isDisplayed();
        ReusableMethods.waitFor(2);
        imdbPage.OscarsButton.click();
    }
    @When("Event History basligi altinda 1929 degeri secilir")
    public void basligi_altinda_degeri_secilir() {

        imdbPage.EventHistoryTitle.isDisplayed();
        imdbPage.EventHistoryCount.click();
    }

    @When("Honorary Award basligi altinda The Circus secilir")
    public void honorary_award_basligi_altinda_the_circus_secilir() {

        imdbPage.HonoraryAwardTitle.isDisplayed();
        tcPage.CircusInHonoraryAward.click();
    }
    @Then("Gelen ekranda The Circus a ait Director Writer Stars bilgisi kayit edilir")
    public void gelen_ekranda_the_circus_a_ait_director_writer_stars_bilgisi_kayit_edilir() throws IOException {

        List<String> InformationList=new ArrayList<>();
        String CircusDirectorText= tcPage.CircusDirectorText.getText();
        String CircusWriterText= tcPage.CircusWriterText.getText();
        String CircusStarsText= tcPage.CircusStarsText.getText();
        ReusableMethods.waitFor(2);

        ReusableMethods.getScreenshot("Şarlo Sirkte",tcPage.Screenshot);
    }
    @Then("Ekranin sol ustunde bulunan imdb butonuna tiklanarak Anasayfaya donulur")
    public void ekranin_sol_ustunde_bulunan_imdb_butonuna_tiklanarak_anasayfaya_donulur() {

        imdbPage.IMDbHomePages.click();
        ReusableMethods.waitFor(5);
    }
    @Then("Arama cubuguna The Circus yazilir")
    public void arama_cubuguna_the_circus_yazilir() {

        imdbPage.SearchBox.sendKeys("The Circus"+ Keys.ENTER);

    }
    @Then("Sonuclar arasinda gelen The Circus'a tiklanir")
    public void sonuclar_arasinda_gelen_the_circus_a_tiklanir() {

        tcPage.SearchResult.click();
    }
    @Then("Gelen ekranda The Circus a ait Director Writer Stars bilgisi kayit edilen bilgilerle ayni mi kontrol edilir")
    public void gelen_ekranda_the_circus_a_ait_director_writer_stars_bilgisi_kayit_edilen_bilgilerle_ayni_mi_kontrol_edilir() {

        String directorText=ConfigReader.getProperty("CircusDirector");
        String directorText1=tcPage.CircusDirectorText1.getText();
        System.out.println(directorText);
        String director="Charles Chaplin";
        Assert.assertEquals(directorText.contains(director),directorText1.contains(director));

        String writerText=ConfigReader.getProperty("CircusWriter");
        String writerText1=tcPage.CircusWriterText1.getText();
        System.out.println(writerText);
        String writer="Charles Chaplin";
        Assert.assertEquals(writerText.contains(writer),writerText1.contains(writer));

        String starsText=ConfigReader.getProperty("CircusStars");
        String starsText1=tcPage.CircusStarsText1.getText();
        System.out.println(starsText);
        String stars="Charles Chaplin";
        Assert.assertEquals(starsText.contains(stars),starsText1.contains(stars));
    }
    @Then("See all Photos linkine tiklanir")
    public void see_all_photos_linkine_tiklanir() {

        imdbPage.PhotosTitle.click();
    }
    @Then("Gelen ekranda butun fotograflarin linklerinin kirik olamadigi test edilir")
    public void gelen_ekranda_butun_fotograflarin_linklerinin_kirik_olamadigi_test_edilir() {

        for (int i = 0; i <tcPage.PhotoList2.size(); i++) {
            tcPage.PhotoList2.get(i).click();
            ReusableMethods.waitFor(2);
            imdbPage.PhotoClose.click();
        }
        tcPage.Next.click();
        ReusableMethods.waitFor(2);

        for (int i = 0; i <tcPage.PhotoList2.size() ; i++) {
            tcPage.PhotoList2.get(i).click();
            ReusableMethods.waitFor(2);
            imdbPage.PhotoClose.click();
        }
    }

}
