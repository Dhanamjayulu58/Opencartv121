package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage{
	
	// Cons
	
	public AccountRegistrationPage(WebDriver driver)
	{
		super(driver);
	}

// Locators
	
@FindBy(xpath="//input[@id='input-firstname']") 
WebElement txtfirstname;

@FindBy(xpath="//input[@id='input-lastname']") 
WebElement txtlastname;

@FindBy(xpath="//input[@id='input-email']")
WebElement txtemail;

@FindBy(xpath="//input[@id='input-telephone']")
WebElement txttelphone;

@FindBy(xpath="//input[@id='input-password']") 
WebElement txtpassword;

@FindBy(xpath="//input[@id='input-confirm']") 
WebElement txtconfirmpassword;

@FindBy(xpath="//input[@name='agree']") 
WebElement chkbox;

@FindBy(xpath="//input[@value='Continue']")
WebElement btnClick;

@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']")
WebElement confirmMsg;

// Action Methods

public void setfirstName(String fname)
{
	txtfirstname.sendKeys("fname");
}

public void setlastName(String lname)
{
	txtlastname.sendKeys(lname);
}
	
public void setemail(String email)	
{
	txtemail.sendKeys(email);
}
public void settelphone(String telnum)
{
	txttelphone.sendKeys(telnum);
}
public void setpassword(String pwd)
{
	txtpassword.sendKeys(pwd);
}
public void setConpassword (String cpwd)
{
	txtconfirmpassword.sendKeys(cpwd);
}

public void setPrivacyPolicy ()
{
chkbox.click();
}

public void ClickContinue ()
{
	btnClick.click();
}


public String getconfirmMsg() {
 try {
	 return(confirmMsg.getText());
 } catch(Exception e) {
	 return (e.getMessage());
	 
 }
}



	


















}
