package tgfm;

import org.openqa.selenium.WebDriver;

public class Browser {
    private static ThreadLocal<WebDriver> webDriver = new ThreadLocal<WebDriver>();
 
    public static WebDriver getBrowser() {
        return webDriver.get();
    }
 
    public static void setWebDriver(WebDriver driver) {
        webDriver.set(driver);
    }
}
