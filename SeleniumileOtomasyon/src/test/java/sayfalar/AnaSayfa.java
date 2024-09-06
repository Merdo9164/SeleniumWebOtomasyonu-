package sayfalar;

import org.openqa.selenium.WebDriver;

public class AnaSayfa extends Sayfa {
    public final String hesabim ="myAccount";
    public final String girisYap ="login";

    public final String urunArama ="[placeholder='Ürün, kategori veya marka ara']";

    public final String kategoriSec ="//ul[@class='sf-MenuItems-MXhuaBP08HFYcFicDzFl']//span[@class='sf-MenuItems-UHHCg2qrE5_YBqDV_7AC']/span[.='Kitap, Müzik, Film, Hobi']";

    public final String kitaplar ="[src='https://images.hepsiburada.net/banners/0/banner_20230824142211.jpeg']";

    public AnaSayfa(WebDriver driver) {
        super(driver);
    }
}
