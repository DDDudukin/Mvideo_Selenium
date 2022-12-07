package autotest.steps.MVideo;

import autotest.DriverManager;
import io.cucumber.java.ru.Когда;
import autotest.methods.ChekFilter;
import org.openqa.selenium.chrome.ChromeDriver;

import static autotest.elements.Mvideo_elements.*;
import static autotest.elements.Mvideo_elements.CheckFilterFrequency;

public class CheckBoxesFrequency {

    ChromeDriver driver = DriverManager.getDriver();
    ChekFilter chekFilter = new ChekFilter();

    @Когда("В фильтре Тактовая частота выставить все активные")
    public void CheckBoxesFrequency() throws InterruptedException {
        chekFilter.CheckFilterFrequency(driver, "xpath", CheckBoxesFrequency, CheckFilterFrequency);
    }
}
