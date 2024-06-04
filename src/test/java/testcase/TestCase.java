package testcase;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseTest;
import pageEvent.Client_Info;
import pageEvent.LogTicket;
import pageEvent.Login;
import pageEvent.Queueview_Specify_Associate_ID;
import pageEvent.Queueview_Specify_Manager;
import pageEvent.Specify_Queue;

public class TestCase extends BaseTest {

	@BeforeMethod
    public void login() throws Exception {
        Login log = new Login(driver);
        log.LoginWorkflow();
    }

    @Test (priority = 1)
    public void LogTicketWorkflow() throws Exception {
        LogTicket log1 = new LogTicket(driver);
        log1.logticketWorkflow();
    }

    @Test (enabled = false)
    public void ClientInfoWorkflow() throws Exception {
        Client_Info log2 = new Client_Info(driver);
        log2.ClientInfo();
    }
    
    @Test (priority = 2)
    public void Queueview_Specify_Associate_ID_tWorkflow() throws Exception {
    	Queueview_Specify_Associate_ID Queueview = new Queueview_Specify_Associate_ID(driver);
    	Queueview.Queueview_Specify_Associate_ID_tWorkflow();
    }
    
    @Test (priority = 3)
    public void Queueview_Specify_Manager_Workflow() throws Exception {
    	Queueview_Specify_Manager QueueviewManager = new Queueview_Specify_Manager(driver);
    	QueueviewManager.Queueview_Specify_Manager_Workflow();
    }
    
    @Test (priority = 4)
    public void Queueview_Specify_Queue_Workflow() throws Exception {
    	Specify_Queue SpecifyQueue = new Specify_Queue(driver);
    	SpecifyQueue.Queueview_Specify_Queue_Workflow();
    }
}