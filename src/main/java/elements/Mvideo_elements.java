package elements;

public class Mvideo_elements {
    public static String ButtonKatalog = "//mvid-button[@label = 'Каталог']";
    public static String CategoryNoutsAndComps = "//a[text() = 'Ноутбуки и компьютеры']";
    public static String CategoryProcessors = "//span[text()='Процессоры']";
    public static String ElementInStock = "//span[text() = ' Только в наличии ']//ancestor::label//div[@class = 'slider']";
    public static String CheckBoxesFrequency = "(//div[@class = 'accordion__content ng-tns-c207-10 ng-trigger ng-trigger-dropdownAnimation ng-star-inserted']//mvid-icon)";
    public static String NameProcessor = "(//a[@class = 'product-title__text product-title--clamp'])";
    public static String PriceProcessor = "(//span[@class = 'price__main-value'])";
    public static String ButtonClear = "//span[@class = 'button__label ng-star-inserted'][text() = 'Очистить']";
    public static String ButtonAddToBasket = "//span[text() = 'В корзину']";
    public static String ButtonBasket = "//mvid-icon[@type = 'cart']//ancestor::a";
    public static String BasketProcessorName = "(//a[@class = 'cart-item__name ng-star-inserted'])";
    public static String BasketProcessorPrice = "(//div[@class = 'cart-item-price' ]//span)";
    public static String FinalSumma = "//p[text() = 'Итого']//following-sibling::p";
}