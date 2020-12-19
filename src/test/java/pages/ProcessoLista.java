package pages;

import support.DriverQA;

public class ProcessoLista extends BasePage {
    public ProcessoLista(DriverQA driver) {
        super(driver);
    }

    public void clicouNovoProcesso() {
        driver.click("btn-novo");
    }
}
