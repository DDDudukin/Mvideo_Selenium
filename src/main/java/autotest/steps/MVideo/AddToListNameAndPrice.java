package autotest.steps.MVideo;

import autotest.DriverManager;
import io.cucumber.java.ru.Когда;
import autotest.methods.ActionsWithElements;
import org.openqa.selenium.chrome.ChromeDriver;

import static autotest.elements.Mvideo_elements.*;

public class AddToListNameAndPrice {

    ChromeDriver driver = DriverManager.getDriver();

    ActionsWithElements actionsWithElements = new ActionsWithElements();

    @Когда("Вывести в консоль список всех доступных к продаже товаров в формате Цена полное название")
    public void AddToListNameAndPrice(){
        actionsWithElements.WaitElementsAndAddToListNameAndPrice(driver, "xpath", NameProcessor, PriceProcessor);
    }
}
