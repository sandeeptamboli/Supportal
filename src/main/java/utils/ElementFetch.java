package utils;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementFetch {
    private WebDriver driver;

    public ElementFetch(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getWebElement(String identifierType, String locator) {
        By by = getBy(identifierType, locator);
        return driver.findElement(by);
    }

    public List<WebElement> getWebElements(String identifierType, String locator) {
        By by = getBy(identifierType, locator);
        return driver.findElements(by);
    }

    private By getBy(String identifierType, String locator) {
        switch(identifierType.toUpperCase()) {
            case "XPATH":
                return By.xpath(locator);
            case "CSS":
                return By.cssSelector(locator);
            case "ID":
                return By.id(locator);
            case "NAME":
                return By.name(locator);
            case "TAGNAME":
                return By.tagName(locator);
            case "CLASSNAME":
                return By.className(locator);
            case "LINKTEXT":
                return By.linkText(locator);
            case "PARTIALLINKTEXT":
                return By.partialLinkText(locator);
            default:
                throw new IllegalArgumentException("Unsupported identifier type: " + identifierType);
        }
    }
}
