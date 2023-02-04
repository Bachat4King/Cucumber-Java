package steps;

import io.cucumber.java.en.Given;
import pages.DemoBlazeHome;
import utils.DriverFactory;

public class DemoBlazeSteps {

    DemoBlazeHome demoBlazeHome = new DemoBlazeHome(DriverFactory.getDriver());

    @Given("DemoBlaze: select {string} from the navigation bar")
    public void SelectNavBar(String navBar) {
        demoBlazeHome.selectNavBar(navBar);
    }

}
