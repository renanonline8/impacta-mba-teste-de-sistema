package pages;

import org.junit.Assert;
import support.DriverQA;

public class ProcessoRegistro extends BasePage {

    public ProcessoRegistro(DriverQA driver) {
        super(driver);
    }

    public void checkMessage(String message) {
        String alertMessage = driver.getText("notice");
        Assert.assertEquals(message, alertMessage);
    }
}
