package testCases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import pages.LoginPage;
import pages.LogoutPage;

import javax.sql.rowset.JdbcRowSet;

public class Login_TC1 {

    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/books");

        HomePage home = new HomePage(driver);
        LoginPage login = new LoginPage(driver);
        LogoutPage logout = new LogoutPage(driver);

        home.clickLoginBtn();

        login.enterUserName("florentinaa");
        login.enterPassword("Admin123*");
        login.clickLogin();
        Thread.sleep(3000);
        logout.clickLogoutBtn();
        Thread.sleep(3000);

        driver.close();
        driver.quit();

    }
}
