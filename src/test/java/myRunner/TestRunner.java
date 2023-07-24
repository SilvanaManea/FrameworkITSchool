package myRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@CucumberOptions(
//        features = "src/test/java/features/AddToysInCart.feature", //the path of the feature files
        features = "src/test/java/features/", //the path of the feature files
        glue = {"stepDefinitions"}, //the path of the step definition files
        plugin = {"pretty", "json:target/cucumber-reports/reports.json",
                "junit:target/cucumber-reports/Cucumber.xml",
                "html:target/cucumber-reports/reports2.html"},
        monochrome = true, //display the console output in a proper readable format
        dryRun = false //to check the mapping is proper between feature file and step def file
        //tags = {"~@SmokeTest" , "~@RegressionTest", "~@End2End"}
)

@RunWith(Cucumber.class)
public class TestRunner {

}
