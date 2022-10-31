package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import pages.ImdbPage;
import pages.TJSPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TheJazzSingerStepDefinitions {

    ImdbPage imdbPage=new ImdbPage();
    TJSPage  tjsPage=new TJSPage();

    @When("Honorary Award basligi altinda The Jazz Singer secilir")
    public void basligi_altinda_secilir() {

        imdbPage.HonoraryAwardTitle.isDisplayed();
        tjsPage.JazzInHonoraryAward.click();


    }
    @Then("Gelen ekranda The Jazz Singer a ait Director Writer Stars bilgisi kayit edilir")
    public void gelen_ekranda_the_jazz_singer_a_ait_director_writer_stars_bilgisi_kayit_edilir() throws IOException {

        List<String> InformationList=new ArrayList<>();
        String JazzDirectorText= tjsPage.JazzDirectorText.getText();
        String JazzWritersText= tjsPage.JazzWritersText.getText();
        String JazzStarsText= tjsPage.JazzStarsText.getText();
        ReusableMethods.waitFor(2);

        ReusableMethods.getScreenshot("Caz Mugannisi",tjsPage.ScreenshotJ);

    }
    @Then("Arama cubuguna The Jazz Singer yazilir")
    public void arama_cubuguna_the_jazz_singer_yazilir() {

        imdbPage.SearchBox.sendKeys("The Jazz Singer" +Keys.ENTER);
    }
    @Then("Sonuclar arasinda gelen The Jazz Singer'a tiklanir")
    public void sonuclar_arasinda_gelen_the_jazz_singer_a_tiklanir() {

        ReusableMethods.waitFor(3);
        tjsPage.SearchResult.click();
    }
    @Then("Gelen ekranda The Jazz Singera ait Director Writer Stars bilgisi kayit edilen bilgilerle ayni mi kontrol edilir")
    public void gelen_ekranda_the_jazz_singera_ait_director_writer_stars_bilgisi_kayit_edilen_bilgilerle_ayni_mi_kontrol_edilir() throws InterruptedException {

        String directorText=ConfigReader.getProperty("JazzDirector");
        String directorText1=tjsPage.JazzDirectorText1.getText();
        System.out.println(directorText);
        String director="Alan Crosland";
        Assert.assertEquals(directorText.contains(director),directorText1.contains(director));
      /*
        String directorText= imdbPage.JazzDirectorText.getText();
        String directorTextResult= imdbPage.JazzDirectorText1.getText();
        String x = "Alan Crosland";
        System.out.println(directorText);
        System.out.println();
        Assert.assertTrue(directorText.contains(x));
        Assert.assertTrue(directorTextResult.contains(x));
        Assert.assertEquals(directorText.contains(x),directorTextResult.contains(x));
*/
        String writersText=ConfigReader.getProperty("JazzWriters");
        String writersText1=tjsPage.JazzWritersText1.getText();
        System.out.println(writersText);
        String writers="Samson Raphaelson(play)Alfred A. Cohn(adaptation)Jack Jarmuth(titles)";
        Assert.assertEquals(writersText.contains(writers),writersText1.contains(writers));

        String starsText=ConfigReader.getProperty("JazzStars");
        String starsText1=tjsPage.JazzStarsText1.getText();
        System.out.println(starsText);
        String stars="Al JolsonMay McAvoyWarner Oland";
        Assert.assertEquals(starsText.contains(stars),starsText1.contains(stars));

    }
    @Then("Gelen ekranda butun fotograflarin linkinin kirik olamadigi test edilir")
    public void gelen_ekranda_butun_fotograflarin_linkinin_kirik_olamadigi_test_edilir() {

        for (int i = 0; i <imdbPage.PhotoList1.size(); i++) {
            imdbPage.PhotoList1.get(i).click();
            ReusableMethods.waitFor(3);
            imdbPage.PhotoClose.click();
        }

    }


}
