package steps;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.DriverFactory;


public class Hooks {

    @Before("@api")
    public void apiSetUp(Scenario scenario){
        System.out.println(scenario.getLine());
    }

    @Before("not @api")
    public void setup(Scenario scenario) {
        DriverFactory.initDriver();
        System.out.println(scenario.getName());
        System.out.println(scenario.getId());
    }

    @After("not @api")
    public void tearDown() {
        DriverFactory.killDriver();
    }

}
