package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssertElements{
    ActionsWithElements actionsWithElements = new ActionsWithElements();
    public void ComparisonElements(ChromeDriver driver, String typeSelector, String selectorName, String selectorPrice, String finalSumma){
        int summaElements = actionsWithElements.WaitElementsAndWriteNameAndPrice(driver, typeSelector, selectorName, selectorPrice);
        int itogo = Integer.parseInt(driver.
                findElement(By.xpath(finalSumma))
                .getText()
                .replaceAll("[^0-9,.]", ""));
        if (summaElements == itogo){
            System.out.println("Good Job");
        }
        else {
            System.out.println(summaElements + " != " + itogo);
        }
    }
}
