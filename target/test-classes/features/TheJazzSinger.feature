
Feature: Menude bulunan film ile arama cubugu uzerinden bulunan film ozellikleri ayni olmalidir.
  @jmdb
  Scenario: The Jazz Singer filmi menu uzerimnden bulunur ve bu film arama cubugundan aratilir. Director, Writer, Stars bilgilerinin ayni oldugu dogrilanir.

    Given URL adresine gidilir
    When Arama cubugunun sol tarafinda bulunan Menu butonuna basilir
    And  Gelen ekranda Award & Events basligi altinda bulunan Oscars butonuna tiklanir
    And  Event History basligi altinda 1929 degeri secilir
    And  Honorary Award basligi altinda The Jazz Singer secilir
    Then Gelen ekranda The Jazz Singer a ait Director Writer Stars bilgisi kayit edilir
    Then Ekranin sol ustunde bulunan imdb butonuna tiklanarak Anasayfaya donulur
    And  Arama cubuguna The Jazz Singer yazilir
    And  Sonuclar arasinda gelen The Jazz Singer'a tiklanir
    Then Gelen ekranda The Jazz Singera ait Director Writer Stars bilgisi kayit edilen bilgilerle ayni mi kontrol edilir
    And  See all Photos linkine tiklanir
    And  Gelen ekranda butun fotograflarin linkinin kirik olamadigi test edilir



