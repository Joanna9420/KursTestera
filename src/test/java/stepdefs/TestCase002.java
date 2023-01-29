package stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.MyAccountPage;
import pageobjects.ShopHomePage;

public class TestCase002 {
    @Given("Open shop website")
    public void  openShopWebsite(){
        ShopHomePage.openShopHomePage();

    }

    @When("Open the My Account tab")
    public void openTheMyAccountTab() {
        ShopHomePage.openMyAccountTab(3);

    }

    @And("Enter a random email")
    public void enterARandomEmail() {
        MyAccountPage.enterRandomMail();
    }

    @And("Enter a random password")
    public void enterARandomPassword() {
        MyAccountPage.enterRandomPassword();
    }

    @And("Click checkbox Remember me")
    public void clickCheckboxRememberMe() {
        MyAccountPage.clickRemeberMe();
    }

    @And("Click button Log In")
    public void clickButtonLogIn() {
        MyAccountPage.clickLogIn();
    }

    @Then("Check the login status")
    public void checkTheLoginStatus() {
        MyAccountPage.checkLoginSatus();
    }
}
