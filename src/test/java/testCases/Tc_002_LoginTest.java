package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.Login_Page;
import pageObjects.MyAccount_Page;
import pageObjects.homePage;
import testBase.BaseClass;

public class Tc_002_LoginTest extends BaseClass{
	

	
	@Test (groups={"Sanity","Master"})
	public void Verify_login ()
	{
		logger.info("*** Started My Tc_002_LoginTest");
		try {
		// Home Page	
		homePage hp = new homePage (driver);
		hp.clickMyaccount();
		hp.Clicklogin();
		
		// Login Page
		Login_Page lp = new Login_Page (driver);
		logger.info("Entered EmailID");
		lp.setemailbox(p.getProperty("Email"));
		logger.info("Entered password");
		lp.setpassword(p.getProperty("password"));
		logger.info("Click on Login");
		lp.ClickOnlogin();
		
		//My Account Page
		
		logger.info("Is Amy account page confirmation");
		MyAccount_Page maccp = new MyAccount_Page (driver);
		
     	boolean	targetpage =maccp.isMyAccoutPageExists();
     	
     	Assert.assertTrue(targetpage);
		}
		catch (Exception e)
		{
			Assert.fail();
		}
     	logger.info("** Completed my Test case");
	
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
