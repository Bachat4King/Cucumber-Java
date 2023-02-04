package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class ParaBank extends Base {

    public ParaBank(WebDriver driver) {
        super(driver);
    }

    public void login(String username, String password) {
        findElement(By.xpath("//div[@class='login']/input[@name='username']"), 10).sendKeys(username);
        findElement(By.xpath("//div[@class='login']/input[@name='password']"), 10).sendKeys(password);
    }

    public void clickButton() {
        doClick(By.xpath("//div[@class='login']/input[@value='Log In']"), 10);
    }

}
