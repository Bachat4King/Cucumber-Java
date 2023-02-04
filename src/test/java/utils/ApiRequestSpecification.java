package utils;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class ApiRequestSpecification {

    private final RequestSpecification request;

    public ApiRequestSpecification() {
        request = RestAssured.given().spec(defaultRequestSpecification());
    }

    public static RequestSpecification defaultRequestSpecification() {
        return new RequestSpecBuilder()
                .setBaseUri("https://reqres.in/")
                .setBasePath("api/")
                .setContentType(ContentType.JSON)
                .build();
    }

    public RequestSpecification getRequest() {
        return request;
    }
}
