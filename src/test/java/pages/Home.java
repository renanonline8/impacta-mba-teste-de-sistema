package pages;

import support.DriverQA;

public class Home extends BasePage{

    private static String URL = "http://agapito-server.herokuapp.com/";

    public Home(DriverQA stepsDriver){super(stepsDriver);}

    public void open() {
        driver.openURL(URL);
    }
}
