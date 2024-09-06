package tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import sayfalar.AnaSayfa;
import sayfalar.GirisYapSayfasi;
import sayfalar.KategoriSayfasi;

import java.time.Duration;

import static java.lang.Thread.sleep;

public class LoginTests {
    private WebDriver driver;
    private AnaSayfa anaSayfa;
    private GirisYapSayfasi girisYapSayfasi;
    private KategoriSayfasi kategoriSayfasi;

    @BeforeEach
    void setup(){
        driver =new ChromeDriver();
        driver.manage().window().maximize();
        anaSayfa =new AnaSayfa(driver);
        girisYapSayfasi =new GirisYapSayfasi(driver);
        kategoriSayfasi =new KategoriSayfasi(driver);
        driver.get("https://www.hepsiburada.com");

    }

    @Test
    void hepsiburadaLoginTesti() throws InterruptedException {

        anaSayfa.elementGozukeneKadarBekle(anaSayfa.hesabim);
        anaSayfa.tusaBas(anaSayfa.hesabim);
       // driver.findElement(By.id("myAccount")).click();
        anaSayfa.elementGozukeneKadarBekle(anaSayfa.girisYap);
        anaSayfa.tusaBas(anaSayfa.girisYap);

        girisYapSayfasi.elementGozukeneKadarBekle(girisYapSayfasi.emailAdresi);
        girisYapSayfasi.alanaYaziYaz(girisYapSayfasi.emailAdresi, "otomasyon@gmail.com");
       // driver.findElement(By.id("txtUserName")).sendKeys("otomasyon@gmail.com");
        girisYapSayfasi.elementGozukeneKadarBekle(girisYapSayfasi.girisYapTusu);
        girisYapSayfasi.tusaBas(girisYapSayfasi.girisYapTusu);
        // driver.findElement(By.id("btnlogin")).click();


    }

    @Test
    void urunAramaTest() throws InterruptedException {
        anaSayfa.elementGozukeneKadarBekleCss(anaSayfa.urunArama);
        anaSayfa.alanaYaziYazCss(anaSayfa.urunArama, "Araba");
        anaSayfa.klavyeTusunaBas(anaSayfa.urunArama, Keys.ENTER);


    }
    @Test
    void kategoriSecmeTest() throws InterruptedException {
        anaSayfa.elementGozukeneKadarBeklePath(anaSayfa.kategoriSec);
        anaSayfa.kategoriSec(anaSayfa.kategoriSec);
        anaSayfa.tusaBasPath(anaSayfa.kategoriSec);
        anaSayfa.elementGozukeneKadarBekleCss(anaSayfa.kitaplar);
        anaSayfa.tusaBasCss(anaSayfa.kitaplar);

        kategoriSayfasi.elementGozukeneKadarBekleCss(kategoriSayfasi.sepeteEkleTusu);
        kategoriSayfasi.tusaBasCss(kategoriSayfasi.sepeteEkleTusu);


    }

    @AfterEach
    void tearDown() {
        driver.close();
    }
}
