package lession_13;

public class TestWebDriver {

    public static void main(String[] args) {

        WebDriver driver = null;

        // Try.. catch trường họp NULLPOINTEREXCEPTIOn khi không truyền đúng browser

        try {
            driver = DriverFactory.getWebDriver("SAFARI");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("[INFO] Start testing on SHROME browser");
            driver = DriverFactory.getWebDriver("CHROME");
        }

        try{
            driver.initDriver();
            //Logic test
            //Open page
            // Go to URL...

        } catch (Exception e){   //thuường xảy ra NULLPOITEREXCEPTION hơn
            e.printStackTrace();
            System.out.println("[ERR] Could not start broser");
        } finally {             // sau khi thực thi xong logic test thì tui sẽ close broser
            if (driver != null){
                driver.closeDriver();
            }
        }

    }
}
