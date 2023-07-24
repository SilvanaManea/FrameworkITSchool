package common;

import com.aventstack.extentreports.ExtentTest;
import io.cucumber.java.AfterAll;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxDriverLogLevel;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.safari.SafariDriver;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class TestBase {

    public static Properties properties;
    public static org.openqa.selenium.WebDriver driver;
    public static FileReader fileReader;
    public static ExtentTest test;

    public static void openURL(String url) {
        driver.get(url);
    }
    public static void propertiesLoad() throws IOException {
        try {
            fileReader = new FileReader("config/QA.properties");
            properties = new Properties();
            properties.load(fileReader);
        } catch (FileNotFoundException ex) {
            test.info("*************************************************");
            test.info("Property file you are looking for does not exist.");
            test.info("*************************************************");
        }
    }

    public static void openBrowser() {
        if (properties.getProperty("BrowserName").equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            System.setProperty("webdriver.chrome.logfile", ".'logs/chromeLogs.txt");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        }else if (properties.getProperty("BrowserName").equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
            System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "./logs/FirefoxLogs.txt");
            FirefoxOptions options = new FirefoxOptions();
            options.setLogLevel(FirefoxDriverLogLevel.TRACE);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        }else {
            driver = new SafariDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        }
    }
    public static void closeBrowser(){
        driver.close();
        driver.quit();
    }
}
