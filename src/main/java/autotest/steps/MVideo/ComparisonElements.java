package autotest.steps.MVideo;

import autotest.DriverManager;
import io.cucumber.java.ru.Когда;
import autotest.methods.AssertElements;
import org.openqa.selenium.chrome.ChromeDriver;

import static autotest.elements.Mvideo_elements.*;
import static autotest.elements.Mvideo_elements.FinalSumma;

public class ComparisonElements {

    ChromeDriver driver = DriverManager.getDriver();
    AssertElements assertElements = new AssertElements();

    @Когда("Получить список товаров в корзине суммировать их стоимость вывести на экран результат сравнения полученной суммы скалькулированной с суммой указанной на странице к оплате")
    public void ComparisonElements() throws InterruptedException {
        assertElements.ComparisonElements(driver, "xpath", BasketProcessorName, BasketProcessorPrice, FinalSumma);
    }
}
