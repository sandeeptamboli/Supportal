package ElementLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Specify_Queue_Locator {
	@FindBy(xpath = "//button[@id='changePerspectiveBTN']")
	public WebElement chevronright;
	
	@FindBy(xpath = "//*[@id='QV_AUX_List_Items']/ul[1]/li[3]")
	public WebElement Specify_Queue;
	
	@FindBy(xpath = "//span[@id='select2-chosen-1']")
	public WebElement Select_Specify_Queue;
	
	@FindBy(xpath = "//input[@id='s2id_autogen1_search']")
	public WebElement Search_Specify_Queue;
	
	@FindBy(xpath = "//button[@id='bot2-Msg1']")
	public WebElement Load_Specify_Queue;
	
	@FindBy(xpath = "//*[@id='QV_GRID']/tbody/tr[1]/td[2]")
	public WebElement ticketNumber;
	
	@FindBy(xpath = "//*[@id='IV_GROUP_INFO']/table/tbody/tr[1]/td[2]/a/span")
	public WebElement Owner;
}
