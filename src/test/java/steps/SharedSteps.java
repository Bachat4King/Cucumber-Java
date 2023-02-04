package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import utils.DriverFactory;


public class SharedSteps {

    private final WebDriver driver = DriverFactory.getDriver();

    @Given("go to {string}")
    public void gotoWebsite(String website) {
        driver.get(website);
    }

    // this step is used to put a pause in the test in case you need to see what is happening
    // it is not recommended to use this step in a test, but it is useful for debugging
    @And("wait {int} seconds")
    public void waitSeconds(int seconds) throws InterruptedException {
        Thread.sleep(seconds * 1000L);
    }
}
