package pages;

import org.openqa.selenium.By;

public class LoginPage {

    public static By user = By.id("auth-email");
    public static By password = By.id("auth-login-password");

    public static By signInBtn = By.id("auth-next-btn");

    public static By welcome = By.xpath("//a[normalize-space()='Bun venit, Arcan Florentina!']");

    public static By continueBtn = By.id("auth-next-btn");
}
