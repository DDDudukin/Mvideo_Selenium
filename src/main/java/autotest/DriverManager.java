package autotest;

import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {
    private static ChromeDriver driver;

    public static synchronized ChromeDriver getDriver() {
        if (driver == null) {
            driver = new ChromeDriver();
        }
        return driver;
    }
}