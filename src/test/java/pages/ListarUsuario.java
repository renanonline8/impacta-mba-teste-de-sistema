package pages;

import support.DriverQA;

public class ListarUsuario extends BasePage {
    public ListarUsuario(DriverQA stepDriver) {
        super(stepDriver);
    }

    public void clicaNovoUsuario() {
        driver.click("btn-new");
    }
}
