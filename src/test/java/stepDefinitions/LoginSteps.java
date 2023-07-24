package stepDefinitions;

import common.TestBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import jdk.jshell.execution.Util;
import org.testng.Assert;
import pages.LoginPage;
import utils.Utils;

public class LoginSteps {
    @Given("user open the page")
    public void user_open_the_page() throws Exception {
        TestBase.propertiesLoad();
        TestBase.openBrowser();
        TestBase.openURL("https://comenzi.bebetei.ro/login");
    }

    @And("user insert the  username: {string}")
    public void userInsertTheUsername(String arg0) {
        Utils.waitForElementVisible(LoginPage.user);
        Utils.enterText(LoginPage.user, arg0);
    }

    @And("user click on the continue button")
    public void userClickOnTheContinueButton() {
        Utils.clickOnButton(LoginPage.continueBtn);
    }

    @And("user insert the password: {string}")
    public void userInsertThePassword(String arg0) {
        Utils.waitForElementVisible(LoginPage.password);
        Utils.enterText(LoginPage.password, arg0);
    }

    @When("user click on login button")
    public void user_click_on_login_button() {
        Utils.waitForElementVisible(LoginPage.signInBtn);
        Utils.clickOnButton(LoginPage.signInBtn);
    }

    @Then("user is login on the page")
    public void user_is_login_on_the_page() {
        String actualText = Utils.getText(LoginPage.welcome);
        String expectedText = "Bun venit, Arcan Florentina!";

        Assert.assertEquals(expectedText, actualText);
    }

}
