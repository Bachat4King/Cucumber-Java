package steps;

import pages.ParaBank;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.DriverFactory;


public class LoginParaBankSteps {

    ParaBank paraBank = new ParaBank(DriverFactory.getDriver());

    @When("user enters {string} and {string}")
    public void userEnterCredentials(String username, String password) {
        paraBank.login(username, password);
    }

    @Then("click \"LOG IN\" button")
    public void clickButton() {
        paraBank.clickButton();
    }


}
