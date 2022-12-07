package autotest.steps.MVideo;

import autotest.DriverManager;
import io.cucumber.java.ru.Когда;
import autotest.methods.ActionsWithElements;
import org.openqa.selenium.chrome.ChromeDriver;

import static autotest.elements.Mvideo_elements.*;

public class AddElementsToBasket {


    ActionsWithElements actionsWithElements = new ActionsWithElements();
    ChromeDriver driver = DriverManager.getDriver();
    @Когда("Добавить по одной единице каждого доступного товара в корзину")
    public void AddElementsToBasket() throws InterruptedException {
        DriverManager.getDriver();
        actionsWithElements.WaitElementsAndClickAndAddToBasket(driver, "xpath", ButtonAddToBasket);
    }
}
