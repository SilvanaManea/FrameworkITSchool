package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static common.TestBase.driver;


public class AddToysPage {
    public static By figuresTitle = By.xpath("//h1[normalize-space()='Produse în categoria FIGURINE']");
    public static By productsMenu = By.xpath("//span[normalize-space()='Produse']");
    public static By gamesAndToysMenu = By.xpath("//a[normalize-space()='Jocuri si jucarii']");
    public static By toysMenu = By.xpath("//a[normalize-space()='Jucarii']");
    public static By figuresMenu = By.xpath("//a[normalize-space()='Figurine']");
    public static By superFigurine = By.xpath("//img[@alt='Figurina SuperZings Misiunea 5: Foc vs Apa, + 3 ani, Superthings']");
    public static By productTitle = By.id("product-h1");
    public static By addToCartBtn = By.id("add-to-cart-btn");
    public static By puzzleMenu = By.xpath("//a[normalize-space()='Puzzle-uri']");
    public static By puzzleTitle = By.xpath("//h1[normalize-space()='Produse în categoria PUZZLE-URI']");
    public static By sharkPuzzle = By.xpath("//img[@alt='Puzzle rechini, 100 piese, Ravensburger']");
    public static By gamesMenu = By.xpath("//a[normalize-space()='Jocuri']");
    public static By educationalGames = By.xpath("//a[normalize-space()='Jocuri educative']");
    public static By educationalGamesTitle = By.xpath("//h1[normalize-space()='Produse în categoria JOCURI EDUCATIVE']");
    public static By educationalBook = By.xpath("//img[@alt='Carte interactiva, Cu ce ne deplasam, Raspundel Istetel']");
    public static By sortByDropdown = By.xpath("//a[normalize-space()='In stoc']");
    public static By sortDropdownBioOptions = By.xpath("//a[normalize-space()='BIO']");
    public static By shoppingCart = By.id("top-cart-btn");
    public static By totalProducts = By.xpath("//body/header/div[@id='header-search']/div[@class='container']/div[@class='row']/div[@class='col-12 d-flex align-items-center justify-content-between']/div[@class='align-items-center d-flex justify-content-between']/div[@class='position-relative']/div[@id='cart-popup']/div[@class='cart-popup-content']/div[@class='footer']/div[@id='cart-total']/div[@class='d-flex justify-content-between']/span[1]");
    public static By buyButton = By.xpath("//a[normalize-space()='Cumpara']");
    public static By superFigurineFromCart = By.xpath("(//a[contains(text(),'Figurina SuperZings')])[2]");
    public static By sharkPuzzleFromCart = By.xpath("(//a[normalize-space()='Puzzle rechini, 100 piese, Ravensburger'])[2]");
    public static By educationalBookFromCart = By.xpath("(//a[contains(text(),'Carte interactiva, Cu ce ne deplasam, Raspundel Is')])[2]");


    public static void clearShoppingCart() {
        List<WebElement> deleteIconElements = driver.findElements(By.xpath("//img[@alt='Elimina din cos']"));

        for (int i = 1; i <= deleteIconElements.size(); i++) {
            driver.findElement(By.xpath("(//img[@alt='Elimina din cos'])[1]")).click();
            driver.findElement(By.xpath("//button[contains(text(),'Da')]")).click();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
