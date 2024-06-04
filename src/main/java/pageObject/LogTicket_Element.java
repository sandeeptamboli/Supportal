package pageObject;

public interface LogTicket_Element {
    //String pushbtn = "//button[text()='Send Me a Push ']";
    String ticketNumber = "//*[@id='QV_GRID']/tbody/tr[1]/td[2]";
    String logo = "//span[@id='logo']";
    String Hours = "//div[@id='QV_List_Items']/ul[1]/li[10]";
    String logtkbtn = "//li[@id='ticketlogger_menulink']";
    
    //Gerenal tab
    String Select_Company = "//*[text()='Select Company']";
    String InputCompany = "//body/div[@id='select2-drop']/div[1]/input[1]";
    String Select_Company_Option = "(//li/div[contains(@id,'select2-result-label-')][1])[1]";
    String SelectContact = "//div[@id='s2id_ticketLoggingContact']/a[1]/span[1]";
    String Input_Contact = "//body/div[@id='select2-drop']/div[1]/input[1]";
    String Select_Contact_Option = "(//li/div[contains(@id,'select2-result-label-')][1])[1]";
    String Select_Incident_Type_Drpdwn = "//*[text()='Select Incident Type']";
    String User_Service_Request = "//*[text()='User Service Request']";
    String Reported_Source = "//*[text()='Select Reported Source']";
    String Phone = "//*[text()='Phone']";
    String ticketLoggingSummary = "//textarea[@id='ticketLoggingSummary']";
    String Note = "//textarea[@id='ticketLoggingDescription']";
    String Chia = "//*[text()='Review For CHIA?']";
    String ChiaOption = "//body/div[@id='select2-drop']/ul[1]/li[1]/div[1]";
    String ChiaFrom = "//*[@id='newCHIAModal']/div/div/div[3]/button[1]" ;
    String ChaiFromClose = "//*[@id='smallbox3']/div[2]/p[2]/a[2]";
    String Ehi = "//*[text()='EHI Request?']";
    String EhiOption = "//body/div[@id='select2-drop']/ul[1]/li[1]/div[1]";
    String EhiFrom = "//button[@id='ehiAssessmentCancelButton']";
    String impact_dropdw = "//*[text()='Select Impact']";
    String impact = "//div[text()='3-Moderate/Limited. Few to Several Users Affected']";
    String calculateUrgency = "//a[@id='calculateUrgency']";
    String calculateUrgencyOption = "//*[@id='impactTime']/label[5]";
    String calculateUrgencyOptionPopup = "//*[text()=' Urgency Questions ']";
    String urgencyQuestionsSubmitButton = "//button[@id='urgencyQuestionsSubmitButton']";
    String OnsiteQueue ="(//*[text()='View Onsite Queues'])[1]" ;
    String AssignedGroup ="//div[@id='s2id_ticketLoggingAssignedGroup']" ;
    String AssignedGroupInput ="//div[@id='select2-drop']/div[1]/input[1]" ;
    String Assignee = "//*[text()='Select Assignee']";
    String AssigneeOption = "//div[@id='select2-drop']/div[1]/input[1]";
    String assignToUser = "//a[@id='assignToUser']";
    String LoggingOwner = "//div[@id='s2id_ticketLoggingOwner']";
    String OwnerGroup = "//*[text()='Select Owner Group']";
    String LoggingOwnerInput ="//div[@id='select2-drop']/div[1]/input[1]" ;

    //Categorization tab
    String ownerselect = "s2id_autogen159_search";
    String Categorizationtab = "//a[@id='categorization_tab']";
    String Select_Categorizationone = "//*[text()='Select Categorization 1']";
    String Add = "//*[text()='Add']";
    String Select_Categorizationtwo = "//*[text()='Select Categorization 2']";
    String Account = "//*[text()='Account']";
    String CloseCategory = "//div[@id='s2id_ticketLoggingCloseCategory']";
    String CloseCategoryOption = "//ul[@id='select2-results-145']/li[1]";
    String Product_Categorizationone = "//*[@id='s2id_ticketLoggingProdCat1']/a/span[2]";
    String Product_Categorizationoneoption = "//div[@id='select2-drop']/ul[1]/li[1]";
    String Product = "//*[text()='Select Product']";
    String Product_select = "//div[@id='select2-drop']/ul[1]/li[1]";

    //Associations Tab
    String AssociationsTab = "//a[contains(text(),'Associations')]";
    String ClientRef = "//textarea[@id='ticketLoggingClientRef']";
    String Select_Domain_Type = "//span[contains(text(),'Select Domain Type')]";
    String Select_Domain_Type_Option = "//div[@id='select2-drop']/ul/li[1]";
    String Select_Domain = "//span[contains(text(),'Select Domain')]";
    String Select_Domain_Option = "//div[@id='select2-drop']/ul/li[1]";
    String Relate_Btn = "//button[@id='submitDomainButton']";
    String Select_Ticket_Type = "//span[contains(text(),'Select Ticket Type')]";
    String Select_Ticket_Type_Option = "//div[@id='select2-drop']/ul/li[1]";
    String Select_Association_Type = "//span[contains(text(),'Select Association Type')]";
    String Select_Association_Type_Option = "//div[@id='select2-drop']/ul/li[1]";
    String TicketNumber = "//input[@id='relateTicketNumber']";
    String Add_Relate_Btn = "//*[@id='ticketLoggingRelateDiv']/div/div[4]/button";
    String PBI_Number = "//*[@id='relatePBI']";
    String Relate_PBI = "//*[@id='ticketLoggingPBIDiv']/div/div[2]/button";
    String Select_Impacted_Aear = "//span[contains(text(),'Select Impacted Area')]";
    String Select_Impacted_Aear_Input = "//div[@id='select2-drop']/div[1]/input[1]";
    String Add_ImpactedArea = "//*[@id='ticketLoggingImpactedAreaDiv']/div[2]/div[2]/button";
    String Select_Company_Search = "//input[@id='impactedAreadCompanySearch']";
    
    // Worklog Tab
    String Worklogs = "//a[contains(text(),'Worklogs')]";
    String Select_Worklog_Type = "//span[contains(text(),'Select Worklog Type')]";
    String Select_Worklog_Type_Option = "//body/div[@id='select2-drop']/ul/li[1]";
    String Internal_Checkbox = "//*[@id='worklogInternal']/section/label";
    String Locked_Checkbox = "//*[@id='worklogLocked']/section/label";
    String Notes = "//textarea[@id='ticketLoggingWorklogNotes']";
    String SubmitWorklogButton = "//button[@id='submitWorklogButton']";
    String createINC = "ticketCreationSubmitINCButton";
    String INCnum = "//*[@id='bigBoxColor1']/p/text()[3]";
    
    //Resolution
    String Resolution = "//a[contains(text(),'Resolution')]";
    String ProbableCause = "//div[@id='s2id_ticketLoggingProbableCause']/a[1]/span[1]";
    String ProbableCauseOption = "//body/div[@id='select2-drop']/ul/li[1]";
    String Classification = "//div[@id='s2id_ticketLoggingClassification']/a[1]/span[1]";
    String ClassificationOption = "//body/div[@id='select2-drop']/ul/li[2]";
    String CreateINC = "//button[@id='ticketCreationSubmitINCButton']";
    
    //popup
    String miniIconone = "//*[@id='miniIcon1']";
    String Age = "//*[@id='QV_GRID_wrapper']/div/div[1]/div/table/thead/tr/th[4]";
}