package pageEvent;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import ElementLocators.Queueview_Specify_Manager_Locator;
import pageObject.Queueview_Specify_Associate_ID_Element;
import pageObject.Queueview_Specify_Manager_Element;
import utils.ElementFetch;
import utils.SuitListener;
import utils.WaitUtils;

public class Queueview_Specify_Manager extends Queueview_Specify_Manager_Locator {
	SuitListener listener = new SuitListener();
	private WebDriver driver;
	private WaitUtils waitUtils;
	private ElementFetch elementFetch;

	public Queueview_Specify_Manager(WebDriver driver) {

		this.driver = driver;
		this.waitUtils = new WaitUtils(driver);
		this.elementFetch = new ElementFetch(driver);
		PageFactory.initElements(driver, this);
	}

	public void Queueview_Specify_Manager_Workflow() throws Exception {
		Thread.sleep(1000);
		waitUtils.waitForVisibilityOfElement(chevronright);
		Thread.sleep(6000);
		elementFetch.getWebElement("XPATH", Queueview_Specify_Associate_ID_Element.chevronright).click();
		Thread.sleep(2000);
		waitUtils.waitForElementToBeClickable(SpecifyManager);
		elementFetch.getWebElement("XPATH", Queueview_Specify_Manager_Element.SpecifyManager).click();
		Thread.sleep(2000);
		waitUtils.waitForElementToBeClickable(Select_Manager);
		elementFetch.getWebElement("XPATH", Queueview_Specify_Manager_Element.Select_Manager).click();
		waitUtils.waitForElementToBeClickable(Search_Manager);
		elementFetch.getWebElement("XPATH", Queueview_Specify_Manager_Element.Search_Manager).sendKeys("AR024523");
		Thread.sleep(1000);
		elementFetch.getWebElement("XPATH", Queueview_Specify_Manager_Element.Search_Manager).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		elementFetch.getWebElement("XPATH", Queueview_Specify_Manager_Element.Load_Manager).click();
		waitUtils.waitForElementToBeClickable(ticketNumber);
		Thread.sleep(1000);
		elementFetch.getWebElement("XPATH", Queueview_Specify_Manager_Element.ticketNumber).click();
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
