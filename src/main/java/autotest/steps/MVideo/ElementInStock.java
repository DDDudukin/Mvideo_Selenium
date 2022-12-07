package autotest.steps.MVideo;

import autotest.DriverManager;
import io.cucumber.java.ru.Когда;
import autotest.methods.ChekFilter;
import org.openqa.selenium.chrome.ChromeDriver;

import static autotest.elements.Mvideo_elements.ButtonClear;
import static autotest.elements.Mvideo_elements.ElementInStock;

public class ElementInStock {

    ChromeDriver driver = DriverManager.getDriver();
    ChekFilter chekFilter = new ChekFilter();

    @Когда("В фильтрах выставить Только в наличии Да")
    public void ElementInStock() throws InterruptedException {
        chekFilter.ChekFilter(driver, "xpath", ElementInStock, ButtonClear);
    }
}
