package stepDefinitions;

import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

public class ApiTestSteps {
    private String responseBody;
    @Given("I send a GET request to the health check API")
    public void iSendAGETRequestToTheHealthCheckAPI() throws UnirestException {
        responseBody = Unirest.get("https://practice.expandtesting.com/notes/api/health-check")
                .header("accept", "application/json")
                .asString().getBody().toString();
    }

    @Then("the response body contains {string}")
    public void theResponseBodyContains(String expectedMessage) {
        Assert.assertThat(responseBody, containsString(expectedMessage));
    }
}
