package autotest.steps.MVideo;

import autotest.DriverManager;
import io.cucumber.java.ru.Когда;
import autotest.methods.ActionsWithElements;
import org.openqa.selenium.chrome.ChromeDriver;

import static autotest.elements.Mvideo_elements.CategoryProcessors;

public class CategoryProcessors {

    ChromeDriver driver = DriverManager.getDriver();
    ActionsWithElements actionsWithElements = new ActionsWithElements();

    @Когда("Открыть в новой вкладке раздел Процессоры")
    public void CategoryProcessors(){
        actionsWithElements.WaitElementAndOpenOnNewWindow(driver, "xpath", CategoryProcessors);
    }
}
