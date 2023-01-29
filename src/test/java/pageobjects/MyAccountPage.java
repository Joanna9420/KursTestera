package pageobjects;

import static drivers.DriverFactory.driver;
import static helpers.CommonUtils.*;
import static selectors.ShopsSelectors.MyAccountPageSelectors.*;

public class MyAccountPage {
    public static void enterRandomMail() {
        isDisplayed(USER_NAME_SELECTOR);
        typeIfEmptyInput(USER_NAME_SELECTOR, getRandomMail());

    }

    public static void enterRandomPassword() {
        isDisplayed(PASSWORD_SELECTOR);
        typeIfEmptyInput(PASSWORD_SELECTOR, getRandomPassword());

    }

    public static void clickRemeberMe() {
        isDisplayed(REMEMBER_ME_BUTTON);
        click(REMEMBER_ME_BUTTON);

    }

    public static void clickLogIn() {
        isDisplayed(LOG_IN_BUTTON);
        click(LOG_IN_BUTTON);
    }

    public static void checkLoginSatus() {
        isDisplayed(LOG_IN_STATUS);
        if (driver.findElement(LOG_IN_ERROR).isDisplayed()) {
            System.out.println("Error: Login failed");
        } else System.out.println("Successfully logged in!");
    }

}
