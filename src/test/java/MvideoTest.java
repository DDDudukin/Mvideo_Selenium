import methods.ActionsWithElements;
import methods.ActionsWithWindows;
import methods.AssertElements;
import methods.ChekFilter;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static elements.Mvideo_elements.*;

public class MvideoTest {

    ChromeDriver driver;
    SetUp setUp = new SetUp();
    ActionsWithElements actionsWithElements = new ActionsWithElements();
    ActionsWithWindows actionsWithWindows = new ActionsWithWindows();
    ChekFilter chekFilter = new ChekFilter();
    AssertElements assertElements = new AssertElements();

    @BeforeClass
    public void SetUp() {
        driver = setUp.SetUp();
    }

    @AfterClass
    public void TearDown() {
        driver.close();
    }

    @Test
    public void MvideoTest() throws InterruptedException {
        actionsWithElements.WaitAndClickElement(driver, "xpath", ButtonKatalog);
        actionsWithElements.WaitAndMoveToElement(driver, "xpath", CategoryNoutsAndComps);
        actionsWithElements.WaitElementAndOpenOnNewWindow(driver, "xpath", CategoryProcessors);
        actionsWithWindows.SwitchWindows(driver);
        chekFilter.ChekFilter(driver, "xpath", ElementInStock, ButtonClear);
        actionsWithElements.WaitElementsAndClickChekBox(driver, "xpath", CheckBoxesFrequency);
        actionsWithElements.WaitElementsAndAddToListNameAndPrice(driver, "xpath", NameProcessor, PriceProcessor);
        actionsWithElements.WaitElementsAndClickAndAddToBasket(driver, "xpath", ButtonAddToBasket);
        actionsWithElements.JSClick(driver, "xpath", ButtonBasket);
        assertElements.ComparisonElements(driver, "xpath", BasketProcessorName, BasketProcessorPrice, FinalSumma);
    }
}
