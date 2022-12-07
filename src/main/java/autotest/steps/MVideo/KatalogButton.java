package autotest.steps.MVideo;
import autotest.DriverManager;
import io.cucumber.java.ru.Когда;
import autotest.methods.ActionsWithElements;
import org.openqa.selenium.chrome.ChromeDriver;

import static autotest.elements.Mvideo_elements.ButtonKatalog;

public class KatalogButton {
    ChromeDriver driver = DriverManager.getDriver();
    ActionsWithElements actionsWithElements = new ActionsWithElements();

    @Когда("Нажать кнопку Каталог")
    public void KatalogButton(){
        actionsWithElements.WaitAndClickElement(driver, "xpath", ButtonKatalog);
    }
}
