package ElementLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Queueview_Specify_Associate_ID_Locator {
	@FindBy(xpath = "//button[@id='changePerspectiveBTN']")
	public WebElement chevronright;
	
	@FindBy(xpath = "//*[@id='QV_AUX_List_Items']/ul[1]/li[4]")
	public WebElement SpecifyAssociate;
	
	@FindBy(xpath = "//span[contains(text(),'Set QueueView Perspective')]")
	public WebElement Set_QueueView_Perspective;
	
	@FindBy(xpath = "//span[@id='select2-chosen-1']")
	public WebElement Select_Associate;
	
	@FindBy(xpath = "//input[@id='s2id_autogen1_search']")
	public WebElement Search_Associate;
	
	@FindBy(xpath = "//ul[@id='select2-results-1']")
	public WebElement Associate;
	
	@FindBy(xpath = "//button[@id='bot2-Msg1']")
	public WebElement Load_Associate;
	
	@FindBy(xpath = "//*[@id='QV_GRID']/tbody/tr[1]/td[2]")
	public WebElement ticketNumber;
	
	@FindBy(xpath = "//*[@id='IV_GROUP_INFO']/table/tbody/tr[1]/td[2]/a/span")
	public WebElement Owner;
}
