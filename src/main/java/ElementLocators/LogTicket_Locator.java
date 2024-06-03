package ElementLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogTicket_Locator {
	@FindBy(xpath = "//*[@id='QV_GRID']/tbody/tr[1]/td[2]")
	public WebElement ticketNumber;
	
	@FindBy(xpath = "//li[@id='ticketlogger_menulink']")
	public WebElement logtkbtn;
	
	// Gerenral Tab
	@FindBy(xpath = "//*[text()='Select Company']")	
	public WebElement Select_Company;
	
	@FindBy(xpath = "//body/div[@id='select2-drop']/div[1]/input[1]") 
	public WebElement InputCompany;
	
	@FindBy(xpath = "(//li/div[contains(@id,'select2-result-label-')][1])[1]") 
	public WebElement Select_Company_Option ;
	
    @FindBy(xpath = "//div[@id='s2id_ticketLoggingContact']/a/span[2]") 
	public WebElement SelectContact;	
    
    @FindBy(xpath = "//body/div[@id='select2-drop']/div[1]/input[1]") 
	public WebElement Input_Contact; 	
    
    @FindBy(xpath = "(//li/div[contains(@id,'select2-result-label-')][1])[1]") 
	public WebElement Select_Contact_Option; 
    
    @FindBy(xpath = "//*[text()='Select Incident Type']") 
	public WebElement Select_Incident_Type_Drpdwn; 
    
    @FindBy(xpath = "//*[text()='User Service Request']") 
	public WebElement User_Service_Request; 
    
    @FindBy(xpath = "//*[text()='Select Reported Source']") 
	public WebElement Reported_Source; 		
    
    @FindBy(xpath = "//*[text()='Phone']") 
	public WebElement Phone; 				
    
    @FindBy(xpath = "//textarea[@id='ticketLoggingSummary']") 
	public WebElement ticketLoggingSummary; 
    
    @FindBy(xpath = "//textarea[@id='ticketLoggingDescription']") 
	public WebElement Note;			
    
    @FindBy(xpath = "//*[text()='Review For CHIA?']") 
	public WebElement Chia; 		
    
    @FindBy(xpath = "//body/div[@id='select2-drop']/ul[1]/li[1]/div[1]") 
	public WebElement ChiaOption; 	
    
    @FindBy(xpath = "//*[@id='newCHIAModal']/div/div/div[3]/button[1]") 
	public WebElement ChiaFrom; 	
    
    @FindBy(xpath = "//*[@id='smallbox3']/div[2]/p[2]/a[2]") 
	public WebElement ChaiFromClose;
    
    @FindBy(xpath = "//*[text()='EHI Request?']") 
	public WebElement Ehi; 		
    
	@FindBy(xpath = "//body/div[@id='select2-drop']/ul[1]/li[1]/div[1]") 
	public WebElement EhiOption; 	
	
	@FindBy(xpath = "//button[@id='ehiAssessmentCancelButton']") 
	public WebElement EhiFrom;		
	
	@FindBy(xpath = "//*[text()='Select Impact']") 
	public WebElement impact_dropdw; 
	
	@FindBy(xpath = "//div[text()='3-Moderate/Limited. Few to Several Users Affected']") 
	public WebElement impact; 		
	
	@FindBy(xpath = "//a[@id='calculateUrgency']") 
	public WebElement calculateUrgency; 	
	
	@FindBy(xpath = "//*[@id='impactTime']/label[5]") 
	public WebElement calculateUrgencyOption;
	
	@FindBy(xpath = "//*[text()=' Urgency Questions ']") 
	public WebElement calculateUrgencyOptionPopup; 	
	
	@FindBy(xpath = "//button[@id='urgencyQuestionsSubmitButton']") 
	public WebElement urgencyQuestionsSubmitButton;	
	
	@FindBy(xpath = "(//*[text()='View Onsite Queues'])[1]") 
	public WebElement OnsiteQueue;		
	
	@FindBy(xpath = "//div[@id='s2id_ticketLoggingAssignedGroup']") 
	public WebElement AssignedGroup;			
	
	@FindBy(xpath = "//div[@id='select2-drop']/div[1]/input[1]") 
	public WebElement AssignedGroupInput;	
	
	@FindBy(xpath = "//*[text()='Select Assignee']") 
	public WebElement Assignee; 				
	
	@FindBy(xpath = "//div[@id='select2-drop']/div[1]/input[1]") 
	public WebElement AssigneeOption; 			
	
	@FindBy(xpath = "//a[@id='assignToUser']") 
	public WebElement assignToUser; 
	
	@FindBy(xpath = "//div[@id='s2id_ticketLoggingOwner']") 
	public WebElement LoggingOwner;
	
	@FindBy(xpath = "//div[@id='select2-drop']/div[1]/input[1]") 
	public WebElement LoggingOwnerInput;

	// Categorization Tab
	@FindBy(xpath = "//a[@id='categorization_tab']")
	public WebElement Categorizationtab;

	@FindBy(xpath = "//*[text()='Select Categorization 1']")
	public WebElement Select_Categorizationone;

	@FindBy(xpath = "//*[text()='Add']")
	public WebElement Add;

	@FindBy(xpath = "//*[text()='Select Categorization 1']")
	public WebElement Select_Categorizationtwo;

	@FindBy(xpath = "//*[text()='Account']")
	public WebElement Account;

	@FindBy(xpath = "//div[@id='s2id_ticketLoggingCloseCategory']")
	public WebElement CloseCategory;
	
	@FindBy(xpath = "//ul[@id='select2-results-145']/li[1]")
	public WebElement CloseCategoryOption;

	@FindBy(xpath = "//div[@id='s2id_ticketLoggingProdCat1']")
	public WebElement Product_Categorizationone;

	@FindBy(xpath = "//div[@id='select2-drop']/ul[1]/li[1]")
	public WebElement Product_Categorizationoneoption;

	@FindBy(xpath = "//*[text()='Select Product']")
	public WebElement Product;

	@FindBy(xpath = "//div[@id='select2-drop']/ul[1]/li[1]")
	public WebElement Product_select;

	// Association Tab
	@FindBy(xpath = "//a[contains(text(),'Associations')]")
	public WebElement AssociationsTab;

	@FindBy(xpath = "//textarea[@id='ticketLoggingClientRef']")
	public WebElement ClientRef;

	@FindBy(xpath = "//span[contains(text(),'Select Domain Type')]")
	public WebElement Select_Domain_Type;

	@FindBy(xpath = "//div[@id='select2-drop']/ul/li[1]")
	public WebElement Select_Domain_Type_Option;

	@FindBy(xpath = "//span[contains(text(),'Select Domain')]")
	public WebElement Select_Domain;

	@FindBy(xpath = "//*[@id='select2-results-306']/li[1]")
	public WebElement Select_Domain_Option;

	@FindBy(xpath = "//button[@id='submitDomainButton']")
	public WebElement Relate_Btn;

	@FindBy(xpath = "//span[contains(text(),'Select Ticket Type')]")
	public WebElement Select_Ticket_Type;

	@FindBy(xpath = "//div[@id='select2-drop']/ul/li[1]")
	public WebElement Select_Ticket_Type_Option;

	@FindBy(xpath = "//span[contains(text(),'Select Association Type')]")
	public WebElement Select_Association_Type;

	@FindBy(xpath = "//div[@id='select2-drop']/ul/li[1]")
	public WebElement Select_Association_Type_Option;

	@FindBy(xpath = "//input[@id='relateTicketNumber']")
	public WebElement TicketNumber;

	@FindBy(xpath = "//*[@id='ticketLoggingRelateDiv']/div/div[4]/button")
	public WebElement Add_Relate_Btn;

	@FindBy(xpath = "//*[@id='relatePBI']")
	public WebElement PBI_Number;

	@FindBy(xpath = "//*[@id='ticketLoggingPBIDiv']/div/div[2]/button")
	public WebElement Relate_PBI;

	@FindBy(xpath = "//span[contains(text(),'Select Impacted Area')]")
	public WebElement Select_Impacted_Aear;

	@FindBy(xpath = "//div[@id='select2-drop']/div[1]/input[1]")
	public WebElement Select_Impacted_Aear_Input;
	
	@FindBy(xpath = "//input[@id='impactedAreadCompanySearch']")
	public WebElement Select_Company_Search;

	@FindBy(xpath = "//body/div[@id='select2-drop']/ul/li[1]")
	public WebElement Select_Company_Search_Input;

	@FindBy(xpath = "//*[@id='ticketLoggingImpactedAreaDiv']/div[2]/div[2]/button")
	public WebElement Add_ImpactedArea;
	
	//Worklog Tab
	@FindBy(xpath = "//a[contains(text(),'Worklogs')]")
	public WebElement Worklogs;

	@FindBy(xpath = "//span[contains(text(),'Select Worklog Type')]")
	public WebElement Select_Worklog_Type;

	@FindBy(xpath = "//body/div[@id='select2-drop']/ul/li[1]")
	public WebElement Select_Worklog_Type_Option;

	@FindBy(xpath = "//*[@id='worklogInternal']/section/label")
	public WebElement Internal_Checkbox;
	
	@FindBy(xpath = "//*[@id='worklogLocked']/section/label")
	public WebElement Locked_Checkbox;

	@FindBy(xpath = "//textarea[@id='ticketLoggingWorklogNotes']")
	public WebElement Notes;
	
	@FindBy(xpath = "//button[@id='submitWorklogButton']")
	public WebElement SubmitWorklogButton;
	
	//Resolution Tab
	@FindBy(xpath = "//a[contains(text(),'Resolution')]")
	public WebElement Resolution;
	
	@FindBy(xpath = "//div[@id='s2id_ticketLoggingProbableCause']/a[1]/span[1]")
	public WebElement ProbableCause;

	@FindBy(xpath = "//body/div[@id='select2-drop']/ul/li[1]")
	public WebElement ProbableCauseOption;
	
	@FindBy(xpath = "//div[@id='s2id_ticketLoggingClassification']/a[1]/span[1]")
	public WebElement Classification;
	
	@FindBy(xpath = "//body/div[@id='select2-drop']/ul/li[2]")
	public WebElement ClassificationOption;
	
	@FindBy(xpath = "//button[@id='ticketCreationSubmitINCButton']")
	public WebElement CreateINC;
	
	//popup
	@FindBy(xpath = "//*[@id='miniIcon1']")
	public WebElement miniIconone;
	
	@FindBy(xpath = "//*[@id='QV_GRID_wrapper']/div/div[1]/div/table/thead/tr/th[4]")
	public WebElement Age;
}
