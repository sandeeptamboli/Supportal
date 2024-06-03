package ElementLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Queueview_Specify_Manager_Locator {
	@FindBy(xpath = "//button[@id='changePerspectiveBTN']")
	public WebElement chevronright;
	
	@FindBy(xpath = "//*[@id='QV_AUX_List_Items']/ul[1]/li[5]")
	public WebElement SpecifyManager;
	
	@FindBy(xpath = "//*[text()='Select Associate']")
	public WebElement Select_Manager;
	
	@FindBy(xpath = "//div[@id='select2-drop']/div[1]/input[1]")
	public WebElement Search_Manager;
	//AR024523a
		//try making hit enter
	
	@FindBy(xpath = "//ul[@id='select2-results-1']")
	public WebElement Manager;
	
	@FindBy(xpath = "//button[@id='bot2-Msg1']")
	public WebElement Load_Manager;
	
	@FindBy(xpath = "//*[@id='QV_List_Items']/ul[1]/li[1]")
	public WebElement Queue;
	
	@FindBy(xpath = "//*[@id='QV_GRID']/tbody/tr[1]/td[2]")
	public WebElement ticketNumber;
	
	@FindBy(xpath = "//*[@id='IV_GROUP_INFO']/table/tbody/tr[1]/td[2]/a/span")
	public WebElement Owner;

}
