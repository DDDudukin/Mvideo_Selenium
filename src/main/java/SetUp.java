import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

//public class SetUp {
//    ChromeDriver driver;
//   @When("Сделать настройки и Открыть сайт mvideo.ru")
//    public ChromeDriver SetUp(){
//        //System.setProperty("webdriver.chrome.driver", "C:\\Users\\Denis\\IdeaProjects\\Mvideo_Selenium\\src\\main\\resources\\chromedriver_105\\chromedriver_105.exe");
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        //driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
//        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
//        driver.get("https://www.mvideo.ru/");
//        return driver;
//    }
//}
