package sayfalar;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.By.xpath;

public class Sayfa {

    WebDriver driver;

    public Sayfa(WebDriver driver){
        this.driver =driver;
    }
    public void elementGozukeneKadarBekle(String elementId) throws InterruptedException {
        WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(20L));
        Thread.sleep(5000);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id(elementId)));

    }
    public void elementGozukeneKadarBekleCss(String elementId) throws InterruptedException {
        WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(20L));
        Thread.sleep(500);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(elementId)));

    }
    public void elementGozukeneKadarBeklePath(String elementId) throws InterruptedException {
        WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(20L));
        Thread.sleep(500);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(elementId)));

    }


    public void tusaBas(String tusId){
        driver.findElement(By.id(tusId)).click();
    }

    public void alanaYaziYaz(String elementId ,String emailAdresi){
        driver.findElement(By.id(elementId)).sendKeys(emailAdresi);

    }
    public void alanaYaziYazCss(String elementId ,String yazi){
        driver.findElement(By.cssSelector(elementId)).sendKeys(yazi);

    }
    public void klavyeTusunaBas(String elementId , Keys klavyeTusu){
        driver.findElement(By.cssSelector(elementId)).sendKeys(klavyeTusu);
    }

    public void  kategoriSec(String kategoriSec ){
        driver.findElements(By.xpath("//ul[@class='sf-MenuItems-MXhuaBP08HFYcFicDzFl']//span[@class='sf-MenuItems-UHHCg2qrE5_YBqDV_7AC']/span[.='Kitap, Müzik, Film, Hobi']"));

    }
    public void tusaBasCss(String tusId){
        driver.findElement(By.cssSelector(tusId)).click();
    }
    public void tusaBasPath(String tusId){
        driver.findElement(By.xpath(tusId)).click();
    }

}
