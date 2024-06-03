package ElementLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Client_Info_Locator {
    @FindBy(xpath = "//button[text()='Send Me a Push ']")
    public WebElement pushBtn;
    
    @FindBy(xpath = "//tbody/tr[1]/td[1]")
    public WebElement  ItemNumber;

    @FindBy(xpath = "//span[contains(text(),'Client Mgmt')]")
    public WebElement Client_Mgmt;
}