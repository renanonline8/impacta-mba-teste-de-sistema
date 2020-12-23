package pages;

import org.junit.Assert;
import support.DriverQA;

public class ProcessoLista extends BasePage {
    public ProcessoLista(DriverQA driver) {
        super(driver);
    }

    public void clicouNovoProcesso() {
        driver.click("btn-novo");
    }

    public void abrirProcesso(String idProcesso) {
        driver.click("btn-show_" + idProcesso);
    }

    public void editarProcesso(String idProcesso) {
        driver.click("btn-edit_" + idProcesso);
    }

    public void apagarProcesso(String idProcesso) {
        driver.click("btn-delete_" + idProcesso);
    }

    public void confirmarRemocaoProcesso() {
        driver.ChooseOkOnNextConfirmation();
    }

    public void verifyRegistryNotExist(String idProcess) {
        boolean actual = driver.isDisplayed("codigo_" + idProcess);
        Assert.assertFalse(actual);
    }
}
