package ExcelSheetStudy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelTest3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//reading whole excel dynamic code
		FileInputStream myfile=new FileInputStream("C:\\\\Users\\\\kale patil\\\\OneDrive\\\\Desktop\\\\Automation setup download\\\\TestSheet1.xlsx");
        Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet1");
        
        //getting row from excel
         int lastrownum = mysheet.getLastRowNum();
		System.out.println("last Row number is:"+lastrownum);
		int Totalnofrows = lastrownum;//2
        
		//getting col from excel
		short lastcellnum = mysheet.getRow(0).getLastCellNum();
         System.out.println("Last Cell number is:"+lastcellnum);
         int totalnoofcol = lastcellnum-1;
         
         
         for(int i=0;i<=Totalnofrows;i++)
         {
        	 for(int j=0;j<=totalnoofcol;j++)
        	 {
              String value = mysheet.getRow(i).getCell(j).getStringCellValue();
              System.out.print(value+" ");
        	 }
         }
         System.out.println();
         
	}

}
