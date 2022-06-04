package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPageTestProject;
import utils.DriverFactory;

public class LoginTestProjectSteps {

    LoginPageTestProject loginPage = new LoginPageTestProject(DriverFactory.getDriver());

    @When("TestProject: enter username {string}")
    public void enterUsername(String username){
        loginPage.enterUsername(username);
    }

    @And("TestProject: enter password {string}")
    public void enterPassword(String password){
        loginPage.enterPassword(password);
    }

    @Then("TestProject: click button login")
    public void clickLogin(){
        loginPage.clickLogin();
    }

}
