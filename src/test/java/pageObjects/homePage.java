package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class homePage extends BasePage {
	
	
	public homePage (WebDriver driver)
	{
		super(driver);
	}

	@FindBy(xpath="//a[@title='My Account']")
	WebElement lnkkmyaccount;
	
	
	@FindBy(xpath="//a[normalize-space()='Register']")
	WebElement lnkregister;
	
	@FindBy(xpath="//a[normalize-space()='Login']")
	WebElement linklogin;
	
	
	public void clickMyaccount()
	{
		lnkkmyaccount.click();
	}
	
	public void Clickregister()
	{
		lnkregister.click();
	}
	
	public void Clicklogin()
	{
		linklogin.click();
	}
	
}
