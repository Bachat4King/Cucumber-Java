package steps;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.restassured.RestAssured;

import utils.DriverFactory;

import static utils.ApiRequestSpecification.defaultRequestSpecification;


public class Hooks {

    @Before("@api")
    public void apiSetUp(Scenario scenario) {
        RestAssured.requestSpecification = defaultRequestSpecification();
        System.out.println(scenario.getName());

    }

    @Before("not @api")
    public void setup(Scenario scenario) {
        DriverFactory.initDriver();
        System.out.println(scenario.getName());
    }


    @After("not @api")
    public void tearDown() {
        DriverFactory.killDriver();
    }

}
