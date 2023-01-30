package selectors.ShopsSelectors;

import org.openqa.selenium.By;

public class ShopHomePageSelectors {
    public static By FIRST_CATEGORY_SELECTOR = By.xpath("//li[@class='product-category product first']/a");
    public static By MY_ACCOUNT_TAB_SELECTOR = By.xpath("//ul[@class='nav-menu']//a[contains(text(),'Moje konto')]");

}
