package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogoutPage {
    WebDriver driver;

    public LogoutPage(WebDriver driver) {
        this.driver = driver;
    }

    By logoutBtn = By.id("submit");

    public void clickLogoutBtn() {
        driver.findElement(logoutBtn).click();
    }
}
