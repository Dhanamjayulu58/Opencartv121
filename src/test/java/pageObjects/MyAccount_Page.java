package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccount_Page extends BasePage {

	
	public MyAccount_Page (WebDriver driver)
	{
		super(driver);
	}
	
	
	@FindBy(xpath="//h2[normalize-space()='My Account']")
	WebElement confirmMsg;
	
	@FindBy(xpath="//a[@class='list-group-item'][normalize-space()='Logout']")
	WebElement linklogout;
	
	
	public boolean isMyAccoutPageExists()
	{
	
		try {
		return (confirmMsg.isDisplayed());
		}
		catch (Exception e) 
		{
			
			return false;
		}
				
   }	
	
	public void clickonLogout ()
	{
		linklogout.click();
	}
	
}
