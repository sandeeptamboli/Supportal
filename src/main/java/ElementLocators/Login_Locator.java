package ElementLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_Locator {
	
	@FindBy(xpath = "//*[@id='QV_GRID']/tbody/tr[1]/td[2]")
	public WebElement ticketNumber;
	
	@FindBy(xpath = "//*[@id='i0116']")
    public WebElement  Email;
	
	@FindBy(xpath = "//*[@id='idSIButton9']")
    public WebElement  EmailSubmit;

    @FindBy(xpath = "//*[@id='i0118']")
    public WebElement Password;
    
    @FindBy(xpath = "//*[@id='idSIButton9']")
    public WebElement  Submit;
    
    @FindBy(xpath = "//*[@id='KmsiCheckboxField']")
    public WebElement  EmailCheckBox;
    
    @FindBy(xpath = "//*[@id='idSIButton9']")
    public WebElement  YesBtn;

}
