package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import utilities.ConfigReader;
import utilities.Driver;

public class meinProfileStepDef {
    @Given("Kullanici ana sayfaya gider")
    public void kullaniciAnaSayfayaGider() {
        Driver.getDriver().get("https://amazon.com");
    }

    @And("Kullanici ana sayfayı doğrular")
    public void kullaniciAnaSayfayıDoğrular() {

    }

    @And("Kullanici {int} sn bekler")
    public void kullaniciSnBekler(int arg0) {
    }
}
