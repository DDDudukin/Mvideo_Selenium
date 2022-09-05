package methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ActionsWithWindows {
    public void SwitchWindows(ChromeDriver driver){
        for (String tab : driver.getWindowHandles()){
            driver.switchTo().window(tab);
        }
    }
}
