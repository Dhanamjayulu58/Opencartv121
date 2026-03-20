package utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DataProviders {
	
	

@DataProvider (name="LoginData")
public String [][] getData() throws IOException
{
	
	String path = System.getProperty("user.dir") + "\\testData\\DDTestData.xlsx";
	 //FileInputStream path = new FileInputStream(System.getProperty("user.dir")+"\\testData\\DDTestData.xlsx");
	
	ExcelUtility xlutils=new ExcelUtility(path);
  
 int totalnumrows= xlutils.getRowCount("Sheet1");
 int totalnumclos= xlutils.getCellCount("Sheet1", 1);
 
 String logindata[][]=new String[totalnumrows][totalnumclos];
 
 for(int i=1;i<=totalnumrows;i++)
 {
	 for(int j=0;j<totalnumclos;j++)
	 {
	
	    logindata[i-1][j]= xlutils.getCellData("Sheet1", i, j);
	 }
 }
	

	return logindata;
	
	
}






	
	
	
	

	
	
	
	
	
	
	
	
	
	
	



	
	
	
}
