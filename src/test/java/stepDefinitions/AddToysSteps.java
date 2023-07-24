package stepDefinitions;

import common.TestBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import utils.Utils;
import pages.AddToysPage;

public class AddToysSteps {

    @Given("user go to figures menu")
    public void user_go_to_figures_menu() {
        Utils.clickOnButton(AddToysPage.productsMenu);
        Utils.clickOnButton(AddToysPage.gamesAndToysMenu);
        Utils.clickOnButton(AddToysPage.toysMenu);
        Utils.clickOnButton(AddToysPage.figuresMenu);
        String actualText = Utils.getText(AddToysPage.figuresTitle);
        String expectedText = "Produse în categoria FIGURINE";
        Assert.assertEquals(expectedText, actualText);
    }

    @And("user adds one figure to the shopping cart")
    public void user_add_one_figure_to_the_shopping_cart() {
        Utils.waitForElementToBeClickable(AddToysPage.superFigurine);
        Utils.clickOnButton(AddToysPage.superFigurine);

        String actualText = Utils.getText(AddToysPage.productTitle);
        String expectedText = "Figurina SuperZings Misiunea 5: Foc vs Apa, + 3 ani, Superthings";
        Assert.assertEquals(expectedText, actualText);

        Utils.clickOnButton(AddToysPage.addToCartBtn);
    }

    @Then("user go to puzzle menu")
    public void user_go_to_puzzle_menu() {
        Utils.clickOnButton(AddToysPage.productsMenu);
        Utils.clickOnButton(AddToysPage.gamesAndToysMenu);
        Utils.clickOnButton(AddToysPage.toysMenu);
        Utils.clickOnButton(AddToysPage.puzzleMenu);

        String actualText = Utils.getText(AddToysPage.puzzleTitle);
        String expectedText = "Produse în categoria PUZZLE-URI";
        Assert.assertEquals(actualText, expectedText);
    }

    @And("user add one puzzle to the shopping cart")
    public void user_add_one_puzzle_to_the_shopping_cart() {
        Utils.scrollToElement(AddToysPage.sharkPuzzle);
        Utils.waitForElementToBeClickable(AddToysPage.sharkPuzzle);
        Utils.clickOnButton(AddToysPage.sharkPuzzle);

        String actualText = Utils.getText(AddToysPage.productTitle);
        String expectedText = "Puzzle rechini, 100 piese, Ravensburger";
        Assert.assertEquals(expectedText, actualText);

        Utils.clickOnButton(AddToysPage.addToCartBtn);


    }

    @Then("user go to educational games")
    public void user_go_to_educational_games() {
        Utils.clickOnButton(AddToysPage.productsMenu);
        Utils.clickOnButton(AddToysPage.gamesAndToysMenu);
        Utils.clickOnButton(AddToysPage.gamesMenu);
        Utils.clickOnButton(AddToysPage.educationalGames);

        String actualText = Utils.getText(AddToysPage.educationalGamesTitle);
        String expectedText = "Produse în categoria JOCURI EDUCATIVE";
        Assert.assertEquals(actualText, expectedText);
    }

    @And("user add one educational game to the shopping cart")
    public void user_add_one_educational_game_to_the_shopping_cart() {
        Utils.clickOnButton(AddToysPage.sortByDropdown);
        Utils.clickOnButton(AddToysPage.sortDropdownBioOptions);

        Utils.waitForElementToBeClickable(AddToysPage.educationalBook);
        Utils.clickOnButton(AddToysPage.educationalBook);

        String actualText = Utils.getText(AddToysPage.productTitle);
        String expectedText = "Carte interactiva, Cu ce ne deplasam, Raspundel Istetel";
        Assert.assertEquals(expectedText, actualText);

        Utils.clickOnButton(AddToysPage.addToCartBtn);
    }

    @When("user click on shopping cart")
    public void user_click_on_shopping_cart() throws InterruptedException {
        Thread.sleep(1000);
        Utils.clickOnButton(AddToysPage.shoppingCart);

        String actualText = Utils.getText(AddToysPage.totalProducts);
        String expectedText = "TOTAL: 3 produse";
        Assert.assertEquals(actualText, expectedText);
    }

    @Then("user sees all objects added")
    public void user_sees_all_objects_added() {
        Utils.clickOnButton(AddToysPage.buyButton);

        String actualText = Utils.getText(AddToysPage.superFigurineFromCart);
        String expectedText = "Figurina SuperZings Misiunea 5: Foc vs Apa, + 3 ani, Superthings";
        Assert.assertEquals(actualText, expectedText);

        String sharkActualText = Utils.getText(AddToysPage.sharkPuzzleFromCart);
        String sharkExpectedText = "Puzzle rechini, 100 piese, Ravensburger";
        Assert.assertEquals(sharkActualText, sharkExpectedText);


        String educationalActualText = Utils.getText(AddToysPage.educationalBookFromCart);
        String educationalExpectedText = "Carte interactiva, Cu ce ne deplasam, Raspundel Istetel";
        Assert.assertEquals(educationalActualText, educationalExpectedText);

    }

    @And("user clears the shopping cart")
    public void userClearsTheShoppingCart() {
        AddToysPage.clearShoppingCart();
    }

    @And("user closes the browser")
    public void userClosesTheBrowser() {
        TestBase.closeBrowser();
    }
}
