package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChekFilter {
    ActionsWithElements actionsWithElements = new ActionsWithElements();

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
}
