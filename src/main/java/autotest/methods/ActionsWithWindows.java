package autotest.methods;

import io.cucumber.java.en.Given;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionsWithWindows {
    @Given("Переключение между окнами")
    public void SwitchWindows(ChromeDriver driver){
        for (String tab : driver.getWindowHandles()){
            driver.switchTo().window(tab);
        }
    }
}
