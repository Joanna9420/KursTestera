package pageobjects;

import static helpers.CommonUtils.*;
import static selectors.ShopsSelectors.CartPageSelectors.*;
import static strings.ShopStrings.CartPageStrings.*;

public class CartPage {
    public static void assertCartItem() {
        isDisplayed(PRODUCT_CART_LINK_SELECTOR);
        if (isDisplayed(PRODUCT_CART_LINK_SELECTOR)) {
            System.out.println("Nazwa produktu: " + PRODUCT_NAME_STRING);
        }
    }

}
