package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import utils.ApiRequestSpecification;

import java.util.Locale;

import static org.junit.Assert.*;

public class ApiSteps {

    private Response response;
    private final RequestSpecification request = new ApiRequestSpecification().getRequest();


    @Given("API: load payload from {string}")
    public void loadPayload(String fileName) {

    }

    @Given("API: raw body")
    public void setRawBody(String rawBody) {
        request.body(rawBody);
    }


    @Given("API: send {string} request to {string}")
    public void sendRequest(String requestType, String endpoint) throws Exception {

        switch (requestType.toUpperCase(Locale.ROOT)) {
            case "GET" -> response = request.get(endpoint);
            case "POST" -> response = request.post(endpoint);
            case "PUT" -> response = request.put(endpoint);
            case "PATCH" -> response = request.patch(endpoint);
            case "DELETE" -> response = request.delete(endpoint);
            default -> throw new Exception("Method not Supported");
        }

        System.out.println(response.getBody().asPrettyString());

    }

    @Then("API: response status code should be {int}")
    public void verifyStatusCode(int statusCode) {
        int responseStatusCode = response.getStatusCode();
        assertEquals(statusCode, responseStatusCode);
    }

    @And("API: match {string} == {string}")
    public void match(String path, String expectedValue) {

        if (expectedValue.matches("\\d+")) {
            int expectedValueInt = Integer.parseInt(expectedValue);
            int actualValue = response.jsonPath().getInt(path);
            assertEquals(expectedValueInt, actualValue);
        } else if (expectedValue.matches("true|false")) {
            boolean expectedValueBoolean = Boolean.parseBoolean(expectedValue);
            boolean actualValue = response.jsonPath().getBoolean(path);
            assertEquals(expectedValueBoolean, actualValue);

        } else if (expectedValue.matches("null")) {
            Object actualValue = response.jsonPath().get(path);
            assertNull(actualValue);

        } else {
            String actualValue = response.jsonPath().getString(path);
            assertEquals(expectedValue, actualValue);
        }
    }


}


