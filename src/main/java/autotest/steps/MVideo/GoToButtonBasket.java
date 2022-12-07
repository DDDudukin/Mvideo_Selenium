package autotest.steps.MVideo;

import autotest.DriverManager;
import io.cucumber.java.ru.Когда;
import autotest.methods.ActionsWithElements;
import org.openqa.selenium.chrome.ChromeDriver;

import static autotest.elements.Mvideo_elements.ButtonBasket;

public class GoToButtonBasket {

    ChromeDriver driver = DriverManager.getDriver();
    ActionsWithElements actionsWithElements = new ActionsWithElements();

    @Когда("Перейти в корзину")
    public void GoToButtonBasket() throws InterruptedException {
        actionsWithElements.JSClick(driver, "xpath", ButtonBasket);
    }
}
