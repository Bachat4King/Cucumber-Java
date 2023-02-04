package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DemoQA extends Base {

    public DemoQA(WebDriver driver) {
        super(driver);
    }

    public void printInputElements() {
        List<WebElement> elements = findElements(By.xpath("//input"), 10);
        for (WebElement element : elements) {
            System.out.println(element.getAttribute("placeholder"));
        }


    }

}
