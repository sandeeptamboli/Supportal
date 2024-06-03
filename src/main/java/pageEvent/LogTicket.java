package pageEvent;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import utils.ElementFetch;
import utils.SuitListener;
import utils.WaitUtils;
import ElementLocators.LogTicket_Locator;
import pageObject.LogTicket_Element;

public class LogTicket extends LogTicket_Locator {
	SuitListener listener = new SuitListener();
	private WebDriver driver;
	private WaitUtils waitUtils;
	private ElementFetch elementFetch;

	public LogTicket(WebDriver driver) {

		this.driver = driver;
		this.waitUtils = new WaitUtils(driver);
		this.elementFetch = new ElementFetch(driver);
		PageFactory.initElements(driver, this);
	}

	public void logticketWorkflow() throws Exception {
		Thread.sleep(1000);
		waitUtils.waitForElementToBeClickable(logtkbtn);
		elementFetch.getWebElement("XPATH", LogTicket_Element.logtkbtn).click();
		// Switch to the new window
		for (String handle : driver.getWindowHandles()) {
			driver.switchTo().window(handle);
		}
		driver.manage().window().maximize();
		waitUtils.waitForVisibilityOfElement(Select_Company);
		elementFetch.getWebElement("XPATH", LogTicket_Element.Select_Company).click();
		waitUtils.waitForElementToBeClickable(InputCompany);
		Thread.sleep(1000);
		elementFetch.getWebElement("XPATH", LogTicket_Element.InputCompany).sendKeys("LCOX_MO");
		waitUtils.waitForElementToBeClickable(Select_Company_Option);
		elementFetch.getWebElement("XPATH", LogTicket_Element.Select_Company_Option).click();
		waitUtils.waitForElementToBeClickable(SelectContact);
		Thread.sleep(1000);
		elementFetch.getWebElement("XPATH", LogTicket_Element.SelectContact).click();
		Thread.sleep(1000);
		waitUtils.waitForVisibilityOfElement(Input_Contact);
		elementFetch.getWebElement("XPATH", LogTicket_Element.Input_Contact).sendKeys("LCOX_MO");
		Thread.sleep(1000);
		waitUtils.waitForVisibilityOfElement(Select_Contact_Option);
		elementFetch.getWebElement("XPATH", LogTicket_Element.Select_Contact_Option).click();
		Thread.sleep(1000);
		waitUtils.waitForVisibilityOfElement(Select_Incident_Type_Drpdwn);
		elementFetch.getWebElement("XPATH", LogTicket_Element.Select_Incident_Type_Drpdwn).click();
		Thread.sleep(1000);
		waitUtils.waitForVisibilityOfElement(User_Service_Request);
		elementFetch.getWebElement("XPATH", LogTicket_Element.User_Service_Request).click();
		Thread.sleep(1000);
		waitUtils.waitForVisibilityOfElement(Reported_Source);
		elementFetch.getWebElement("XPATH", LogTicket_Element.Reported_Source).click();
		Thread.sleep(1000);
		waitUtils.waitForVisibilityOfElement(Phone);
		elementFetch.getWebElement("XPATH", LogTicket_Element.Phone).click();
		Thread.sleep(1000);
		elementFetch.getWebElement("XPATH", LogTicket_Element.ticketLoggingSummary).sendKeys("test");
		Thread.sleep(1000);
		elementFetch.getWebElement("XPATH", LogTicket_Element.Note).sendKeys("test");
		Thread.sleep(1000);
		elementFetch.getWebElement("XPATH", LogTicket_Element.Chia).click();
		Thread.sleep(1000);
		elementFetch.getWebElement("XPATH", LogTicket_Element.ChiaOption).click();
		Thread.sleep(1000);
		// Switch to the new window
		for (String handle : driver.getWindowHandles()) {
			driver.switchTo().window(handle);
		}
		waitUtils.waitForVisibilityOfElement(ChiaFrom);
		Thread.sleep(1000);
		elementFetch.getWebElement("XPATH", LogTicket_Element.ChiaFrom).click();
		waitUtils.waitForVisibilityOfElement(Ehi);
		elementFetch.getWebElement("XPATH", LogTicket_Element.Ehi).click();
		Thread.sleep(1000);
		elementFetch.getWebElement("XPATH", LogTicket_Element.EhiOption).click();
		Thread.sleep(1000);
		// Switch to the new window
		for (String handle : driver.getWindowHandles()) {
			driver.switchTo().window(handle);
		}
		waitUtils.waitForVisibilityOfElement(EhiFrom);
		Thread.sleep(1000);
		elementFetch.getWebElement("XPATH", LogTicket_Element.EhiFrom).click();
		Thread.sleep(1000);
		waitUtils.waitForVisibilityOfElement(impact_dropdw);
		elementFetch.getWebElement("XPATH", LogTicket_Element.impact_dropdw).click();
		Thread.sleep(1000);
		elementFetch.getWebElement("XPATH", LogTicket_Element.impact).click();
		Thread.sleep(1000);
		waitUtils.waitForVisibilityOfElement(calculateUrgency);
		elementFetch.getWebElement("XPATH", LogTicket_Element.calculateUrgency).click();
		Thread.sleep(1000);
		for (String handle : driver.getWindowHandles()) {
			driver.switchTo().window(handle);
		}
		waitUtils.waitForVisibilityOfElement(calculateUrgencyOptionPopup);
		elementFetch.getWebElement("XPATH", LogTicket_Element.calculateUrgencyOption).click();
		Thread.sleep(1000);
		elementFetch.getWebElement("XPATH", LogTicket_Element.urgencyQuestionsSubmitButton).click();
		Thread.sleep(1000);
		waitUtils.waitForVisibilityOfElement(AssignedGroup);
		elementFetch.getWebElement("XPATH", LogTicket_Element.AssignedGroup).click();
		Thread.sleep(1000);
		waitUtils.waitForVisibilityOfElement(AssignedGroupInput);
		elementFetch.getWebElement("XPATH", LogTicket_Element.AssignedGroupInput).sendKeys("Operations_CC");
		Thread.sleep(2000);
		elementFetch.getWebElement("XPATH", LogTicket_Element.AssignedGroupInput).sendKeys(Keys.ENTER);
		waitUtils.waitForVisibilityOfElement(Assignee);
		Thread.sleep(2000);
		elementFetch.getWebElement("XPATH", LogTicket_Element.Assignee).click();
		waitUtils.waitForVisibilityOfElement(AssigneeOption);
		elementFetch.getWebElement("XPATH", LogTicket_Element.AssigneeOption).sendKeys("Sandeep");
		Thread.sleep(2000);
		elementFetch.getWebElement("XPATH", LogTicket_Element.AssigneeOption).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		waitUtils.waitForVisibilityOfElement(LoggingOwner);
		Thread.sleep(1000);
		elementFetch.getWebElement("XPATH", LogTicket_Element.LoggingOwner).click();
		waitUtils.waitForVisibilityOfElement(LoggingOwnerInput);
		elementFetch.getWebElement("XPATH", LogTicket_Element.LoggingOwnerInput).sendKeys("Abdul Rashad");
		Thread.sleep(3000);
		elementFetch.getWebElement("XPATH", LogTicket_Element.LoggingOwnerInput).sendKeys(Keys.ENTER);
		Thread.sleep(3000);

		// Categorization Tab
		waitUtils.waitForVisibilityOfElement(Categorizationtab);
		elementFetch.getWebElement("XPATH", LogTicket_Element.Categorizationtab).click();
		Thread.sleep(1000);
		waitUtils.waitForVisibilityOfElement(Select_Categorizationone);
		elementFetch.getWebElement("XPATH", LogTicket_Element.Select_Categorizationone).click();
		Thread.sleep(1000);
		elementFetch.getWebElement("XPATH", LogTicket_Element.Add).click();
		Thread.sleep(1000);
		elementFetch.getWebElement("XPATH", LogTicket_Element.Select_Categorizationtwo).click();
		Thread.sleep(1000);
		elementFetch.getWebElement("XPATH", LogTicket_Element.Account).click();
		Thread.sleep(1000);
		waitUtils.waitForVisibilityOfElement(Product_Categorizationone);
		elementFetch.getWebElement("XPATH", LogTicket_Element.Product_Categorizationone).click();
		Thread.sleep(1000);
		elementFetch.getWebElement("XPATH", LogTicket_Element.Product_Categorizationoneoption).click();
		Thread.sleep(1000);
		waitUtils.waitForVisibilityOfElement(Product);
		elementFetch.getWebElement("XPATH", LogTicket_Element.Product).click();
		Thread.sleep(1000);
		elementFetch.getWebElement("XPATH", LogTicket_Element.Product_select).click();

		// Associations Tab
		waitUtils.waitForVisibilityOfElement(AssociationsTab);
		elementFetch.getWebElement("XPATH", LogTicket_Element.AssociationsTab).click();
		elementFetch.getWebElement("XPATH", LogTicket_Element.ClientRef).sendKeys("Test");
		Thread.sleep(1000);
		elementFetch.getWebElement("XPATH", LogTicket_Element.Select_Domain_Type).click();
		Thread.sleep(1000);
		elementFetch.getWebElement("XPATH", LogTicket_Element.Select_Domain_Type_Option).click();
		Thread.sleep(1000);
		elementFetch.getWebElement("XPATH", LogTicket_Element.Relate_Btn).click();
		Thread.sleep(1000);
		elementFetch.getWebElement("XPATH", LogTicket_Element.Select_Domain).click();
		Thread.sleep(1000);
		elementFetch.getWebElement("XPATH", LogTicket_Element.Select_Domain_Option).click();
		Thread.sleep(1000);
		elementFetch.getWebElement("XPATH", LogTicket_Element.Relate_Btn).click();
		Thread.sleep(1000);
		elementFetch.getWebElement("XPATH", LogTicket_Element.Select_Ticket_Type).click();
		Thread.sleep(1000);
		elementFetch.getWebElement("XPATH", LogTicket_Element.Select_Ticket_Type_Option).click();
		Thread.sleep(1000);
		elementFetch.getWebElement("XPATH", LogTicket_Element.Select_Association_Type).click();
		Thread.sleep(1000);
		elementFetch.getWebElement("XPATH", LogTicket_Element.Select_Association_Type_Option).click();
		Thread.sleep(1000);
		elementFetch.getWebElement("XPATH", LogTicket_Element.TicketNumber).sendKeys("CRQ000004904899");
		Thread.sleep(1000);
		elementFetch.getWebElement("XPATH", LogTicket_Element.Add_Relate_Btn).click();
		Thread.sleep(1000);
		elementFetch.getWebElement("XPATH", LogTicket_Element.PBI_Number).sendKeys("PBI123123123123");
		Thread.sleep(1000);
		elementFetch.getWebElement("XPATH", LogTicket_Element.Relate_PBI).click();
		Thread.sleep(1000);
//		waitUtils.waitForVisibilityOfElement(Select_Impacted_Aear);
//		elementFetch.getWebElement("XPATH", LogTicket_Element.Select_Impacted_Aear).click();
//		waitUtils.waitForVisibilityOfElement(Select_Impacted_Aear_Input);
//		Thread.sleep(1000);
//		elementFetch.getWebElement("XPATH", LogTicket_Element.Select_Impacted_Aear_Input).sendKeys("LCOX_MO");
//		Thread.sleep(1000);
//		waitUtils.waitForElementToBeClickable(Select_Impacted_Aear_Input);
//		Thread.sleep(1000);
//		elementFetch.getWebElement("XPATH", LogTicket_Element.Select_Impacted_Aear_Input).click();
//		Thread.sleep(1000);
//		elementFetch.getWebElement("XPATH", LogTicket_Element.Add_ImpactedArea).click();
//		Thread.sleep(1000);
//		elementFetch.getWebElement("XPATH", LogTicket_Element.Select_Company_Search).click();
//		Thread.sleep(1000);
//		waitUtils.waitForVisibilityOfElement(Select_Impacted_Aear);
//		elementFetch.getWebElement("XPATH", LogTicket_Element.Select_Impacted_Aear).click();
//		Thread.sleep(1000);
//		waitUtils.waitForVisibilityOfElement(Select_Impacted_Aear_Input);
//		elementFetch.getWebElement("XPATH", LogTicket_Element.Select_Impacted_Aear_Input).sendKeys("LCOX_MO");
//		Thread.sleep(1000);
//		waitUtils.waitForVisibilityOfElement(Select_Impacted_Aear_Input);
//		Thread.sleep(1000);
//		elementFetch.getWebElement("XPATH", LogTicket_Element.Select_Impacted_Aear_Input).click();
//		Thread.sleep(2000);
//		waitUtils.waitForVisibilityOfElement(Add_ImpactedArea);
//		elementFetch.getWebElement("XPATH", LogTicket_Element.Add_ImpactedArea).click();
//		Thread.sleep(1000);

		// Worklog Tab
		waitUtils.waitForVisibilityOfElement(Worklogs);
		elementFetch.getWebElement("XPATH", LogTicket_Element.Worklogs).click();
		Thread.sleep(1000);
		waitUtils.waitForVisibilityOfElement(Select_Worklog_Type);
		elementFetch.getWebElement("XPATH", LogTicket_Element.Select_Worklog_Type).click();
		Thread.sleep(1000);
		elementFetch.getWebElement("XPATH", LogTicket_Element.Select_Worklog_Type_Option).click();
		Thread.sleep(1000);
		elementFetch.getWebElement("XPATH", LogTicket_Element.Internal_Checkbox).click();
		Thread.sleep(1000);
		elementFetch.getWebElement("XPATH", LogTicket_Element.Locked_Checkbox).click();
		Thread.sleep(1000);
		elementFetch.getWebElement("XPATH", LogTicket_Element.Notes).sendKeys("Test");
		Thread.sleep(1000);
		waitUtils.waitForVisibilityOfElement(SubmitWorklogButton);
		elementFetch.getWebElement("XPATH", LogTicket_Element.SubmitWorklogButton).click();
		Thread.sleep(1000);

		// Resolution Tab
		waitUtils.waitForVisibilityOfElement(Resolution);
		elementFetch.getWebElement("XPATH", LogTicket_Element.Resolution).click();
		Thread.sleep(1000);
		waitUtils.waitForVisibilityOfElement(ProbableCause);
		elementFetch.getWebElement("XPATH", LogTicket_Element.ProbableCause).click();
		Thread.sleep(1000);
		waitUtils.waitForVisibilityOfElement(ProbableCauseOption);
		elementFetch.getWebElement("XPATH", LogTicket_Element.ProbableCauseOption).click();
		Thread.sleep(1000);
		waitUtils.waitForVisibilityOfElement(Classification);
		elementFetch.getWebElement("XPATH", LogTicket_Element.Classification).click();
		Thread.sleep(1000);
		waitUtils.waitForVisibilityOfElement(ClassificationOption);
		elementFetch.getWebElement("XPATH", LogTicket_Element.ClassificationOption).click();
		Thread.sleep(1000);
		elementFetch.getWebElement("XPATH", LogTicket_Element.CreateINC).click();
		waitUtils.waitForVisibilityOfElement(Age);
		Thread.sleep(1000);
	}
}