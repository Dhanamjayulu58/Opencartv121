package testCases;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.Login_Page;
import pageObjects.MyAccount_Page;
import pageObjects.homePage;
import testBase.BaseClass;
import utilities.DataProviders;  

public class TC_003_DDTlogin_test extends BaseClass {
	
 @Test (dataProvider="LoginData", dataProviderClass=DataProviders.class,groups="datadrivern")
 public void verifyLogin (String username, String Password, String exp) throws InterruptedException
 {
	
	 //HomePage
	 homePage hp=new homePage (driver);
	  hp.clickMyaccount();	 
	  hp.Clicklogin();
	 
	 //LoginPage
	 Login_Page lp = new Login_Page (driver);
     lp.setemailbox(username);
	 lp.setpassword(Password);
	 lp.ClickOnlogin();
	 
	 //MyAccount Page
	 MyAccount_Page maccp = new MyAccount_Page (driver);	
     boolean	targetpage =maccp.isMyAccoutPageExists();
     
	 if(exp.equalsIgnoreCase("Valid"))
	  { 
		 if(targetpage==true);  
		 {
			 maccp.clickonLogout();
			 Assert.assertTrue(true);
		 }
	  }else
	  {
		 Assert.assertTrue(false);
	  }
			 
	 if(exp.equalsIgnoreCase("Invalid"))  
	 {
		 if(targetpage==true);
		 {
		 maccp.clickonLogout();
		 Assert.assertTrue(false);
		 }
	 }else
	 {
		 Assert.assertTrue(true);
	 }
	 
	
 }
}

 

