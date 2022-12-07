package autotest.steps;

import autotest.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {

    ChromeDriver driver;

    @Before
    public ChromeDriver SetUp() {
        //WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.chrome.driver", "C:/Users/Denis/IdeaProjects/Mvideo_Selenium/src/main/resources/chromedriver_108/chromedriver_108.exe");
        driver = DriverManager.getDriver();
        driver.manage().window().maximize();
        //driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
        return driver;
    }
    @After
    public void TearDown() {
        driver.close();
    }
}
