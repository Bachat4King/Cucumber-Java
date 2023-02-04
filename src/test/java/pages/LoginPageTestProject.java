package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPageTestProject extends Base {

    private final By nameInput = By.id("name");

    private final By passwordInput = By.id("password");

    private final By loginButton = By.id("login");

    public LoginPageTestProject(WebDriver driver) {
        super(driver);
    }

    public void enterUsername(String username) {
        findElement(nameInput, 10).sendKeys(username);
    }

    public void enterPassword(String password) {
        findElement(passwordInput, 10).sendKeys(password);
    }

    public void clickLogin() {
        findElement(loginButton, 10).click();
    }

    public void loginValidUser(String username, String password) {
        enterUsername(username);
        enterPassword(password);
        clickLogin();
    }

}
