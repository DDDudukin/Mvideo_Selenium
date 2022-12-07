package autotest.methods;

import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChekFilter {
    ActionsWithElements actionsWithElements = new ActionsWithElements();
    @Given("Проверка на фильтр В наличии")

    public void ChekFilter(ChromeDriver driver, String typeSelector, String selector, String chekFilter) throws InterruptedException {
        actionsWithElements.WaitElement(driver, typeSelector, selector);
        if (driver.findElements(By.xpath(chekFilter)).size() > 0){
            driver.findElement(By.xpath(chekFilter)).click();
            Thread.sleep(1000);
            actionsWithElements.JSClick(driver, typeSelector, selector);
        }
        else {
            actionsWithElements.JSClick(driver, typeSelector, selector);
        }
    }
    @Given("Проверка на фильтр Тактовая частота")

    public void CheckFilterFrequency(ChromeDriver driver, String typeSelector, String selector, String checkFilterFrequency) throws InterruptedException {
        actionsWithElements.WaitElement(driver, typeSelector, checkFilterFrequency);
        if (driver.findElements(By.xpath(checkFilterFrequency)).size() > 0) {
            actionsWithElements.JSClick(driver, typeSelector, checkFilterFrequency);
            Thread.sleep(1000);
            actionsWithElements.WaitElementsAndClickChekBox(driver, typeSelector, selector);
        } else {
            actionsWithElements.WaitElementsAndClickChekBox(driver, typeSelector, selector);
        }
    }
}
