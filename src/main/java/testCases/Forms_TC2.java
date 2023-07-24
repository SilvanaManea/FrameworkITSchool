package testCases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pages.FormsPage;

public class Forms_TC2 {

    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
        driver.get("https://demoqa.com/automation-practice-form");

        FormsPage forms = new FormsPage(driver);

        forms.enterFirstName("Florentina");
        forms.enterLastName("Arcan");
        forms.enterEmail("admin@yaoo.com");
        forms.selectGender();
        forms.enterMobile("1234567890");
        forms.selectDateOfBirth();
        //forms.selectSubjects();
        forms.selectHobbies();
        //forms.uploadPicture();
        forms.enterCurrentAddress("Robert Robertson, 1234 NW Bobcat Lane, St. Robert, MO 65584-5678");
        forms.selectState();

//        driver.close();
//        driver.quit();
    }
}