package steps;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.DriverFactory;


public class Hooks {


    @Before()
    public void setup(Scenario scenario) {
        DriverFactory.initDriver();
        System.out.println(Thread.currentThread().getId());
        System.out.println(scenario.getName());
    }

    @After
    public void tearDown() {
        DriverFactory.killDriver();
    }

}
