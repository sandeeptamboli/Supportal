package pageEvent;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import ElementLocators.Specify_Queue_Locator;
import pageObject.Specify_Queue_Element;
import utils.ElementFetch;
import utils.SuitListener;
import utils.WaitUtils;

public class Specify_Queue extends Specify_Queue_Locator {
	SuitListener listener = new SuitListener();
	private WebDriver driver;
	private WaitUtils waitUtils;
	private ElementFetch elementFetch;

	public Specify_Queue(WebDriver driver) {

		this.driver = driver;
		this.waitUtils = new WaitUtils(driver);
		this.elementFetch = new ElementFetch(driver);
		PageFactory.initElements(driver, this);
	}

	public void Queueview_Specify_Queue_Workflow() throws Exception {
		Thread.sleep(1000);
		waitUtils.waitForVisibilityOfElement(chevronright);
		Thread.sleep(6000);
		elementFetch.getWebElement("XPATH", Specify_Queue_Element.chevronright).click();
		Thread.sleep(1000);
		waitUtils.waitForElementToBeClickable(Specify_Queue);
		elementFetch.getWebElement("XPATH", Specify_Queue_Element.Specify_Queue).click();
		Thread.sleep(1000);
		waitUtils.waitForElementToBeClickable(Select_Specify_Queue);
		elementFetch.getWebElement("XPATH", Specify_Queue_Element.Select_Specify_Queue).click();
		waitUtils.waitForElementToBeClickable(Search_Specify_Queue);
		elementFetch.getWebElement("XPATH", Specify_Queue_Element.Search_Specify_Queue).sendKeys("Operations_CC");
		Thread.sleep(1000);
		elementFetch.getWebElement("XPATH", Specify_Queue_Element.Search_Specify_Queue).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		elementFetch.getWebElement("XPATH", Specify_Queue_Element.Load_Specify_Queue).click();
		waitUtils.waitForElementToBeClickable(ticketNumber);
		Thread.sleep(1000);
		elementFetch.getWebElement("XPATH", Specify_Queue_Element.ticketNumber).click();
		Thread.sleep(1000);
		waitUtils.waitForVisibilityOfElement(Owner);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1000));
		WebElement owner = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='IV_GROUP_INFO']/table/tbody/tr[1]/td[2]/a/span")));
		String elementText1 = owner.getText();
//		System.out.println(elementText1);
		if (elementText1.isEmpty()) {
			System.out.println("The element has no text.");
		} else {
			System.out.println("The element has text: " + elementText1);
		}
		Thread.sleep(1000);
	}
}