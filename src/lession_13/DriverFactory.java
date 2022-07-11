package lession_13;

import sun.plugin2.util.BrowserType;

public class DriverFactory {

    public static WebDriver getWebDriver(String browserType){
        WebDriver driver;

        switch (browserType){
            case "CHROME":
                driver = new ChromeDriver();
                break;
            case "FIREFOX":
                driver = new FirefoxDriver();
                break;
            default:
                throw new IllegalArgumentException("Pls provide correct browserType");
        }

        return driver;
    }
}
