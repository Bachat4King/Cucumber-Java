package steps;

import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import utils.DriverFactory;


public class SharedSteps {

    private final WebDriver driver = DriverFactory.getDriver();

    @Given("go to {string}")
    public void gotoWebsite(String website) {
        driver.get(website);
    }
}
