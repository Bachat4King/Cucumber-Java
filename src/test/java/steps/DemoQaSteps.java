package steps;

import pages.DemoQA;
import io.cucumber.java.en.Then;
import utils.DriverFactory;

public class DemoQaSteps {


    DemoQA demoqa = new DemoQA(DriverFactory.getDriver());

    @Then("print list of input elements")
    public void printElements() {
        demoqa.printInputElements();
    }


}
