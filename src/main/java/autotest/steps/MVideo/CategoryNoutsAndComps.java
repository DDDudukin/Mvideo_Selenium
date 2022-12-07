package autotest.steps.MVideo;

import autotest.DriverManager;
import io.cucumber.java.ru.Когда;
import autotest.methods.ActionsWithElements;
import org.openqa.selenium.chrome.ChromeDriver;

import static autotest.elements.Mvideo_elements.CategoryNoutsAndComps;

public class CategoryNoutsAndComps {

    ChromeDriver driver = DriverManager.getDriver();
    ActionsWithElements actionsWithElements = new ActionsWithElements();

    @Когда("Перейти в категорию Ноутбуки и компьютеры")
    public void CategoryNoutsAndComps(){
        actionsWithElements.WaitAndMoveToElement(driver, "xpath", CategoryNoutsAndComps);
    }
}
