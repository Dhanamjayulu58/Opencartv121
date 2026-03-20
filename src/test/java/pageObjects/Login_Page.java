package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_Page extends BasePage{

	public Login_Page(WebDriver driver)	
	{
		super(driver);
	}
	
	
	@FindBy(xpath="//input[@id='input-email']")
	WebElement txtemailbox;
	
	@FindBy(xpath="//input[@id='input-password']")
	WebElement txtpassword;
	
	@FindBy(xpath="//input[@value='Login']")
	WebElement linkbnt;
	
	public void setemailbox (String user)
	{
	txtemailbox.sendKeys(user);
	}
	
	public void setpassword (String pwd)
	{
		txtpassword.sendKeys(pwd);	
	}
	
	public void ClickOnlogin()
	{
		linkbnt.click();
	}
	
	
	
	
	
	
	
	
	
	
	
}
