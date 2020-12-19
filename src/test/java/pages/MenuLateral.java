package pages;

import support.DriverQA;

public class MenuLateral extends BasePage {

    public MenuLateral(DriverQA stepDriver) { super(stepDriver); }

    public void clicouProcesso() {
        driver.click("processos");
    }

    public void clickUsuarios() {
        driver.click("users");
    }
}
