package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public abstract class Base {

    private final WebDriver driver;

    public Base(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement findElement(By locator, int timeout) {
        return new WebDriverWait(this.driver, Duration.ofSeconds(timeout)).until(ExpectedConditions.visibilityOfElementLocated(locator));

    }

    public List<WebElement> findElements(By locator, int timeout) {
        return new WebDriverWait(this.driver, Duration.ofSeconds(timeout)).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
    }

    public void doClick(By locator, int timeout) {
        new WebDriverWait(this.driver, Duration.ofSeconds(timeout)).until(ExpectedConditions.elementToBeClickable(locator)).click();
    }

    public void doSendKeys(By locator, int timeout, String keys) {
        findElement(locator, timeout).sendKeys(keys);
    }

    public String doGetText(By locator, int timeout) {
        return findElement(locator, timeout).getText();
    }

}




