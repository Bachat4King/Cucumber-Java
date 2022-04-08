package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class ParaBank extends Base {

    public ParaBank(WebDriver driver) {
        super(driver);
    }

    public void login(String username, String password) {
        findElement(By.xpath("//div[@class='login']/input[@name='username']"), Duration.ofSeconds(10)).sendKeys(username);
        findElement(By.xpath("//div[@class='login']/input[@name='password']"), Duration.ofSeconds(10)).sendKeys(password);
    }

    public void clickButton() {
        findElement(By.xpath("//div[@class='login']/input[@value='Log In']"), Duration.ofSeconds(10)).click();
    }

}
