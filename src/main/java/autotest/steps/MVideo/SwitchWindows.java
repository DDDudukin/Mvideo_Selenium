package autotest.steps.MVideo;

import autotest.DriverManager;
import io.cucumber.java.ru.Когда;
import autotest.methods.ActionsWithWindows;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchWindows {

    ChromeDriver driver = DriverManager.getDriver();
    ActionsWithWindows actionsWithWindows = new ActionsWithWindows();

    @Когда("Перейти на новую вкладку")
    public void SwitchWindows(){
        actionsWithWindows.SwitchWindows(driver);
    }
}
