package autotest.steps.MVideo;
import autotest.DriverManager;
import io.cucumber.java.ru.Когда;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenMVideo {
    ChromeDriver driver = DriverManager.getDriver();
    @Когда("Открыть сайт Мвидео")
    public void OpenMVideo(){
        driver.get("https://www.mvideo.ru/");
    }
}
