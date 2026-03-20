package testCases;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Demo_test {

public static void main(String[] args) throws IOException {
		
		// for Read Excel 
		
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\testData\\DDTestData.xlsx");
		
		XSSFWorkbook Workbook=new XSSFWorkbook(file);
		
	    XSSFSheet Sheet=Workbook.getSheet("Sheet1");
	    
	  int TotalRows= Sheet.getLastRowNum();
	  
	 int TotalnumofCells= Sheet.getRow(0).getLastCellNum();
	 
	 System.out.println("total number of Rows:"+TotalRows);
	 System.out.println("total number of Cells:"+TotalnumofCells);
	 
	 for(int r=0;r<=TotalRows;r++)                  // Number of Rows
	 {
		
		XSSFRow CurrentRow= Sheet.getRow(r);
		 
		 
		 for(int c=0;c<TotalnumofCells;c++)         // number of Cells
		 {
			XSSFCell Cell= CurrentRow.getCell(c);
			System.out.print(Cell.toString()+"\t");
	
	      }
	 	 System.out.println();
	 }
	 
	   Workbook.close();
	   file.close();
		
	
	 
			

	}

}
	

