package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DemoBlazeHome extends Base {


    public DemoBlazeHome(WebDriver driver) {
        super(driver);
    }

    public void selectNavBar(String navBar) {
        doClick(By.xpath(String.format("//div[@id='navbarExample']//a[contains(text(), '%s')]", navBar)), 10);

    }


}
