package stepDefinitions;

import common.TestBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.LoginPage;
import pages.WomenPage;
import utils.Utils;

public class WomenSteps {
    @Given("user goes to Jackets from Women menu")
    public void userGoesToJacketsFromWomenMenu() {
        Utils.hoverOn(WomenPage.womenMenu);
        Utils.hoverOn(WomenPage.womenTops);
        Utils.clickOnButton(WomenPage.womenJackets);
    }

    @And("user adds to cart two different articles")
    public void userAddsToCartThreeDifferentArticles() {
        Utils.hoverOn(WomenPage.oliviaJacket);
        Utils.clickOnButton(WomenPage.xsMeasure);
        Utils.clickOnButton(WomenPage.blackColor);
        Utils.clickOnButton(WomenPage.addToCartOlivia);
        Utils.waitForElementVisible(WomenPage.messageSuccess);

        Utils.hoverOn(WomenPage.junoJacket);
        Utils.clickOnButton(WomenPage.mMeasure);
        Utils.clickOnButton(WomenPage.greenColor);
        Utils.clickOnButton(WomenPage.addToCartJuno);
        Utils.waitForElementVisible(WomenPage.messageSuccess);
    }

    @And("user goes to View and Edit to cart")
    public void userGoesToViewAndEditToCart() {
        Utils.clickOnButton(WomenPage.addToCart);
        Utils.clickOnButton(WomenPage.viewAndEditCart);
        Utils.refresh();
    }

    @When("user proceeds to checkout")
    public void userProceedsToCheckout() {
        Utils.waitForElementToBeClickable(WomenPage.proceedToCheckout);
        Utils.clickOnButton(WomenPage.proceedToCheckout);
    }

    @And("user clicks on Next button")
    public void userClicksOnNextButton() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Utils.waitForElementToBeClickable(WomenPage.nextBtn);
        Utils.clickOnButton(WomenPage.nextBtn);
    }

    @Then("user places order")
    public void userPlacesOrder() {
        Utils.waitForElementToBeClickable(WomenPage.placeOrderBtn);
        Utils.clickOnButton(WomenPage.placeOrderBtn);
    }
}
