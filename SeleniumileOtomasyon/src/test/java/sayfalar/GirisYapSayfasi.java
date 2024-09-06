package sayfalar;

import org.openqa.selenium.WebDriver;

public class GirisYapSayfasi extends Sayfa {
    public final String emailAdresi ="txtUserName";
    public final String girisYapTusu ="btnlogin";

    public GirisYapSayfasi(WebDriver driver) {
        super(driver);
    }
}
