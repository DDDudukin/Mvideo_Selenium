package methods;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.*;

public class ActionsWithElements {
    public WebElement WaitElement(ChromeDriver driver, String typeSelector, String selector) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        By element = null;
        if (typeSelector == "xpath") {
            element = By.xpath(selector);
        } else if (typeSelector == "id") {
            element = By.id(selector);
        }
        return wait.until(ExpectedConditions.presenceOfElementLocated(element));
    }

    public void WaitAndClickElement(ChromeDriver driver, String typeSelector, String selector) {
        WaitElement(driver, typeSelector, selector).click();
    }

//    public void WaitElementAndSendKeys(ChromeDriver driver, String typeSelector, String selector, String value) {
//        WaitElement(driver, typeSelector, selector).sendKeys(value);
//    }

    public void WaitAndMoveToElement(ChromeDriver driver, String typeSelector, String selector) {
        WaitElement(driver, typeSelector, selector);
        Actions newTab = new Actions(driver);
        newTab
                .moveToElement(driver.findElement(By.xpath(selector)))
                .build()
                .perform();
    }

    public void WaitElementAndOpenOnNewWindow(ChromeDriver driver, String typeSelector, String selector) {
        WaitElement(driver, typeSelector, selector);
        Actions newTab = new Actions(driver);
        newTab
                .moveToElement(driver.findElement(By.xpath("//span[text()='Процессоры']")))
                .keyDown(Keys.CONTROL)
                .click(driver.findElement(By.xpath("//span[text()='Процессоры']")))
                .keyUp(Keys.CONTROL)
                .build()
                .perform();
    }

    public WebElement WaitElementForClick(ChromeDriver driver, String typeSelector, String selector) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        By element = null;
        if (typeSelector == "xpath") {
            element = By.xpath(selector);
        } else if (typeSelector == "id") {
            element = By.id(selector);
        }
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void JSClick(ChromeDriver driver, String typeSelector, String selector){
        WaitElementForClick(driver, typeSelector, selector);
        WebElement element = WaitElementForClick(driver, typeSelector, selector);
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("arguments[0].click()", element);
    }
    public void WaitElementsAndClickChekBox(ChromeDriver driver, String typeSelector, String selector){
        WaitElement(driver, typeSelector, selector);
        List<WebElement> elements = driver.findElements(By.xpath(selector));
        for (int i = 0; i < elements.size(); i++){
            int j = i + 1;
           JSClick(driver, typeSelector, selector + "[" + j + "]");
        }
    }
    public void WaitElementsAndAddToListNameAndPrice(ChromeDriver driver, String typeSelector, String selectorName, String selectorPrice){
       Map<String, String> map = new HashMap<>();
        WaitElement(driver, typeSelector, selectorName);
        Actions newTab = new Actions(driver);
        newTab
                .sendKeys(Keys.PAGE_DOWN)
                .pause(Duration.ofMillis(500))
                .sendKeys(Keys.PAGE_DOWN)
                .pause(Duration.ofMillis(500))
                .sendKeys(Keys.PAGE_DOWN)
                .pause(Duration.ofMillis(500))
                .sendKeys(Keys.PAGE_DOWN)
                .pause(Duration.ofMillis(500))
                .sendKeys(Keys.PAGE_DOWN)
                .pause(Duration.ofMillis(500))
                .build()
                .perform();
       WaitElement(driver, typeSelector, selectorName);
       List<WebElement> elements = driver.findElements(By.xpath(selectorName));
       for (int i = 0; i < elements.size(); i++){
           int j = i + 1;
           map.put(driver.findElement(By.xpath(selectorName + "[" + j + "]")).getText(),
                   driver.findElement(By.xpath( selectorPrice + "[" + j + "]")).getText())                   ;
       }
        System.out.println();
       System.out.println("Elements at page processors: " + map);
    }
    public void WaitElementsAndClickAndAddToBasket(ChromeDriver driver, String typeSelector, String selector) throws InterruptedException {
        WaitElement(driver, typeSelector, selector);
        List<WebElement> elements = driver.findElements(By.xpath(selector));
        for (int i = 0; i < elements.size(); i++){
            JSClick(driver, typeSelector, selector);
             Thread.sleep(1000);
        }
    }

    public int WaitElementsAndWriteNameAndPrice(ChromeDriver driver, String typeSelector, String selectorName, String selectorPrice){
        Map<String, String> map = new HashMap<>();
        WaitElement(driver, typeSelector, selectorName);
        List<WebElement> elements = driver.findElements(By.xpath(selectorName));
        int summaElements = 0;
        int priceElement;
        for (int i = 0; i < elements.size(); i++){
            int j = i + 1;
            map.put(driver.findElement(By.xpath(selectorName + "[" + j + "]")).getText(),
                    driver.findElement(By.xpath( selectorPrice + "[" + j + "]")).getText());
            priceElement = Integer.parseInt(driver.
                    findElement(By.xpath( selectorPrice + "[" + j + "]"))
                    .getText()
                    .replaceAll("[^0-9,.]", ""));
            summaElements += priceElement;
        }
        System.out.println();

        map.forEach((k, v) -> {
            System.out.println(v + " - " + k);
        });

        System.out.println();
        System.out.println("Summa elementov v korzine: " + summaElements);
        return summaElements;
    }
}