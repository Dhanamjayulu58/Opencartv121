package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.homePage;
import testBase.BaseClass;

public class TC_001_AccountRegistration_test extends BaseClass {
	
	
	@Test (groups={"Regression", "Master"})
  public void TestData ()
  {
		
		logger.info("** Started My Test Case TC_001_AccountRegistration_test");
		
		try
		{
		homePage hp = new homePage(driver);
		hp.clickMyaccount();
		logger.info("Click on My Account Page");
		hp.Clickregister();
		logger.info("Click on My Register Page");
		
	  AccountRegistrationPage arp = new AccountRegistrationPage(driver);
	  
	  logger.info("Providing Registartion Details");
	  
	  arp.setfirstName(randomstring().toUpperCase());
	  arp.setlastName(randomstring().toUpperCase());
	  arp.setemail(randomstring()+"@gmail.com");     //Randomly providing data
	  arp.settelphone(randomNumber());
	  
	  // Alpha Numaric
	  
	 String Password= randomAlphaNumaric();
	  
	  arp.setpassword(Password);
	  arp.setConpassword(Password);
	  
	  arp.setPrivacyPolicy();
	  arp.ClickContinue();
	  
	  logger.info("Validation Message");  
	String  getconfirmsg= arp.getconfirmMsg();
	if(getconfirmsg.equals("Your Account Has Been Created!"))		
	{	
		Assert.assertTrue(true);
	} 
	else
	{
		logger.error("Test Faild");
		logger.debug("Debug logs..");
		Assert.assertTrue(false);	  
	}
	
	Assert.assertEquals(getconfirmsg,"Your Account Has Been Created!");
	}
	  catch(Exception e)
		{
		  Assert.fail();
		}
		
	logger.info("Completed my Test Case");
	
  }
	
		  
  }
	


