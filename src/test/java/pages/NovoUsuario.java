package pages;

import support.DriverQA;

public class NovoUsuario extends BasePage {

    public NovoUsuario(DriverQA stepDriver) {
        super(stepDriver);
    }

    public void input(String campo, String valor) {
        driver.sendKeys(valor, campo);
    }
}
