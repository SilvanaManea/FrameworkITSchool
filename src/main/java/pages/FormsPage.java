package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

public class FormsPage {
    WebDriver driver;

    public FormsPage(WebDriver driver) {
        this.driver = driver;
    }

    By firstName = By.id("firstName");
    By lastName = By.id("lastName");

    By email = By.id("userEmail");

    By gender = By.cssSelector("[for='gender-radio-2']");

    By mobile = By.id("userNumber");

    By dateOfBirth = By.id("dateOfBirthInput");

    By subjects = By.id("subjectsContainer");

    By sportsHobbies = By.cssSelector("label[for='hobbies-checkbox-1']");

    By readingHobbies = By.cssSelector("label[for='hobbies-checkbox-2']");

    By picture = By.cssSelector("label[for='uploadPicture']");

    By currentAddress = By.id("currentAddress");

    By state = By.id("state");

    By city = By.id("city");

    public void enterFirstName(String firstN) {
        driver.findElement(firstName).sendKeys(firstN);
    }

    public void enterLastName(String lastN) {
        driver.findElement(lastName).sendKeys(lastN);
    }

    public void enterEmail(String emailUser) {
        driver.findElement(email).sendKeys(emailUser);
    }

    public void selectGender() {
        driver.findElement(gender).click();
    }

    public void enterMobile(String number) {
        driver.findElement(mobile).sendKeys(number);
    }

    public void selectDateOfBirth() {
        driver.findElement(dateOfBirth).click();

        Select month = new Select(driver.findElement(By.className("react-datepicker__month-select")));
        month.selectByValue("5");

        Select year = new Select(driver.findElement(By.className("react-datepicker__year-select")));
        year.selectByValue("2024");

        driver.findElement(By.cssSelector("[aria-label='Choose Monday, June 17th, 2024']")).click();
    }

    public void selectSubjects() {
        driver.findElement(subjects).click();
        driver.findElement(subjects).sendKeys("a");
    }

    public void selectHobbies(){
        driver.findElement(sportsHobbies).click();
        driver.findElement(readingHobbies).click();
    }

    public void uploadPicture() {
        WebElement uploadFile = driver.findElement(picture);
        uploadFile.sendKeys("./logo.png");
    }

    public void enterCurrentAddress(String text) {
        driver.findElement(currentAddress).sendKeys(text);
    }

    public void selectState() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)");

        driver.findElement(state).click();
        Select city = new Select(driver.findElement(By.id("react-select-3-input")));
        city.selectByVisibleText("NCR");
    }


}
