package pages;

import org.junit.Assert;
import support.DriverQA;

public class ProcessoRegistro extends BasePage {

    private String numeroProcesso;

    public ProcessoRegistro(DriverQA driver) {
        super(driver);
    }

    public void checkMessage(String message) {
        String alertMessage = driver.getText("notice");
        Assert.assertEquals(message, alertMessage);
    }

    public String getNumeroProcesso() {
        return numeroProcesso;
    }

    public String setNumeroProcesso() {
        String codigo = driver.getText("codigo");
        this.numeroProcesso = codigo;
        return codigo;
    }

    public void clicarVoltar()
    {
        driver.click(".ls-btn-primary-danger", "css");
    }

    public String obterCodigoProcesso() {
        return driver.getText("codigo");
    }

    public void checkField(String field, String value) {
        String expected = driver.getText(field);
        String actual = value;
        Assert.assertEquals(expected, actual);
    }
}
