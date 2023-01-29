package selectors.ShopsSelectors;

import org.openqa.selenium.By;

public class MyAccountPageSelectors {
    public static By USER_NAME_SELECTOR = By.id("username");
    public static By PASSWORD_SELECTOR = By.id("password");
    public static By REMEMBER_ME_BUTTON = By.id("rememberme");
    public static By LOG_IN_BUTTON = By.name("login");
    public static By LOG_IN_STATUS = By.xpath("//ul[contains(@role,'alert')]");
    public static By LOG_IN_ERROR = By.xpath("//ul[contains(@class,'woocommerce-error')]");

}
