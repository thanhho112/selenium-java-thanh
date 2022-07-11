package lession_13;

public class FirefoxDriver extends WebDriver{

    @Override
    protected void initDriver() {
        System.out.println("initDriver FirefoxDriver");
    }

    @Override
    protected void closeDriver() {
        System.out.println("initDriver FirefoxDriver");
    }
}
