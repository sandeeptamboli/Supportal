package pageEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pageObject.Client_Info_Element;
import utils.ElementFetch;
import utils.SuitListener;
import utils.WaitUtils;
import ElementLocators.Client_Info_Locator;

public class Client_Info extends Client_Info_Locator {
	SuitListener listener = new SuitListener();
	private WebDriver driver;
	private WaitUtils waitUtils;
	private ElementFetch elementFetch;

	public Client_Info(WebDriver driver) {

		this.driver = driver;
		this.waitUtils = new WaitUtils(driver);
		this.elementFetch = new ElementFetch(driver);
		PageFactory.initElements(driver, this);
	}

	public void ClientInfo() throws Exception {
		waitUtils.waitForVisibilityOfElement(ItemNumber);
		elementFetch.getWebElement("XPATH", Client_Info_Element.Client_Mgmt).click();
		// Switch to the new window
	}
}