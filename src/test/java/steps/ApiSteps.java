package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import java.util.Locale;

import static org.junit.Assert.assertEquals;

public class ApiSteps {

    public Response response;

    @Given("API: send {string} request to {string}")
    public void sendRequest(String requestType, String endpoint) {

        if (requestType.toUpperCase(Locale.ROOT).equals("GET")) {
            response = RestAssured.get(endpoint);
        }
    }

    @Then("API: response status code should be {int}")
    public void verifyStatusCode(int statusCode) {
        int responseStatusCode = response.getStatusCode();
        assertEquals(statusCode, responseStatusCode);
    }

}
