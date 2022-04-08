package ExcelSheetStudy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelTest2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// Reading Whole Excel Static coding
		FileInputStream myfile=new FileInputStream("C:\\Users\\kale patil\\OneDrive\\Desktop\\Automation setup download\\TestSheet1.xlsx");
	    Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet1");
	     
	     for(int i=0;i<=1;i++)//outer for loop row=0---1
	     {
	    	 for(int j=0;j<=3;j++)//inner for loop col=0---3
	    	 {
	    		 String value = mysheet.getRow(i).getCell(j).getStringCellValue();
	    		 System.out.print(value+" ");
	    	 }
	    	 System.out.println( );
	     }
	}

}
