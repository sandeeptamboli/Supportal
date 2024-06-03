package pageEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import ElementLocators.Login_Locator;
import pageObject.Login_Element;
import utils.ElementFetch;
import utils.SuitListener;
import utils.WaitUtils;

public class Login extends Login_Locator {
	SuitListener listener = new SuitListener();
	private WebDriver driver;
	private WaitUtils waitUtils;
	private ElementFetch elementFetch;

	public Login(WebDriver driver) {

		this.driver = driver;
		this.waitUtils = new WaitUtils(driver);
		this.elementFetch = new ElementFetch(driver);
		PageFactory.initElements(driver, this);
	}

	public void LoginWorkflow() throws Exception {
		waitUtils.waitForVisibilityOfElement(Email);
		elementFetch.getWebElement("XPATH", Login_Element.Email).sendKeys("ST091528@cerner.net");
		elementFetch.getWebElement("XPATH", Login_Element.EmailSubmit).click();
		Thread.sleep(1000);
		waitUtils.waitForVisibilityOfElement(Password);
		elementFetch.getWebElement("XPATH", Login_Element.Password).sendKeys("Messi@30");
		Thread.sleep(1000);
		waitUtils.waitForVisibilityOfElement(Submit);
		elementFetch.getWebElement("XPATH", Login_Element.Submit).click();
		waitUtils.waitForVisibilityOfElement(EmailCheckBox);
		elementFetch.getWebElement("XPATH", Login_Element.EmailCheckBox).click();
		waitUtils.waitForVisibilityOfElement(YesBtn);
		elementFetch.getWebElement("XPATH", Login_Element.YesBtn).click();
		waitUtils.waitForVisibilityOfElement(ticketNumber);
	}
}
